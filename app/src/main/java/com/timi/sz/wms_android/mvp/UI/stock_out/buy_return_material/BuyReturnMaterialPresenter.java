package com.timi.sz.wms_android.mvp.UI.stock_out.buy_return_material;

import android.content.Context;

import com.timi.sz.wms_android.bean.buy_return.MaterialBean;
import com.timi.sz.wms_android.bean.buy_return.OrderNoBean;
import com.timi.sz.wms_android.http.callback.OnResultCallBack;
import com.timi.sz.wms_android.http.subscriber.HttpSubscriber;
import com.timi.sz.wms_android.mvp.base.presenter.impl.MvpBasePresenter;

/**
 * $dsc
 * author: timi
 * create at: 2017-08-28 17:30
 */

public class BuyReturnMaterialPresenter extends MvpBasePresenter<BuyReturnMaterialView> {
    BuyReturnMaterialModel model = null;
    HttpSubscriber<MaterialBean> subscriber = null;
    HttpSubscriber<OrderNoBean> returnMaterialScanSubscriber = null;

    public BuyReturnMaterialPresenter(Context context) {
        super(context);
        model = new BuyReturnMaterialModel();
        subscriber = new HttpSubscriber<>(new OnResultCallBack<MaterialBean>() {
            @Override
            public void onSuccess(MaterialBean materialBean) {
                getView().materialScanResult(materialBean);
            }

            @Override
            public void onError(String errorMsg) {
                getView().materialScanResult( new MaterialBean("滑轨双孔梁496-蓝色","CD7000101","Slide Beam0824-496铝挤压加工","50"));

            }
        });
        returnMaterialScanSubscriber = new HttpSubscriber<>(new OnResultCallBack<OrderNoBean>() {
            @Override
            public void onSuccess(OrderNoBean materialBean) {
                getView().ReturnMaterialOrderNoScanResult(materialBean);
            }

            @Override
            public void onError(String errorMsg) {
                getView().ReturnMaterialOrderNoScanResult( new OrderNoBean("滑轨双孔梁496-蓝色","CD7000101","2017-8-24","50","22","28"));

            }
        });
    }

    /**
     * 扫物料码的方法
     * @param scanStr
     */
    public void materialScanNetWork(String scanStr) {
        model.materialScanNetWork(scanStr, subscriber);
    }

    /**
     * 退料单号扫码/输入单号的网络请求
     * @param scanStr
     */
    public void returnMaterialScanNetWork(String scanStr){
        model.returnMaterialOrderNoScanNetWork(scanStr,returnMaterialScanSubscriber);
    }
    @Override
    public void dettachView() {
        super.dettachView();
        //反注册
        if (null != returnMaterialScanSubscriber) {
            returnMaterialScanSubscriber.unSubscribe();
            returnMaterialScanSubscriber = null;
        }
        if (null != subscriber) {
            subscriber.unSubscribe();
            subscriber = null;
        }
    }
}
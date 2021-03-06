package com.timi.sz.wms_android.mvp.UI.stock_in.other_scan;

import com.timi.sz.wms_android.bean.instock.GetMakeOtherStockTotalResult;
import com.timi.sz.wms_android.bean.instock.MaterialScanPutAwayBean;
import com.timi.sz.wms_android.bean.instock.VertifyLocationCodeBean;
import com.timi.sz.wms_android.http.HttpManager;
import com.timi.sz.wms_android.http.api.ApiService;
import com.timi.sz.wms_android.http.api.CommonResult;
import com.timi.sz.wms_android.http.callback.ApiServiceMethodCallBack;
import com.timi.sz.wms_android.mvp.base.model.impl.MvpBaseModel;

import java.util.Map;

import io.reactivex.Observable;
import io.reactivex.Observer;

/**
 * $dsc
 * author: timi
 * create at: 2017-08-31 16:51
 */

public class OtherScanModel extends MvpBaseModel {
    /**
     * 物料扫码上架的网络请求
     *
     * @param params
     * @param observer
     */
    public void materialScanPutAawy(final Map<String, Object> params,
                                    final Observer<MaterialScanPutAwayBean> observer) {
        HttpManager.getInstance().HttpManagerRequest(observer,
                new ApiServiceMethodCallBack<MaterialScanPutAwayBean>() {
                    @Override
                    public Observable<CommonResult<MaterialScanPutAwayBean>> createObservable(ApiService apiService) {
                        return apiService.materialScanPutAawy(params);
                    }
                });
    }

    /**
     * 验证库位码是否有效
     *
     * @param params
     * @param observer
     */
    public void vertifyLocationCode(final Map<String, Object> params,
                                    final Observer<VertifyLocationCodeBean> observer) {
        HttpManager.getInstance().HttpManagerRequest(observer,
                new ApiServiceMethodCallBack<VertifyLocationCodeBean>() {
                    @Override
                    public Observable<CommonResult<VertifyLocationCodeBean>>
                    createObservable(ApiService apiService) {
                        return apiService.vertifyLocationCode(params);
                    }
                });
    }

    /**
     * 生成入库单
     *
     * @param observer
     */
    public void createInStockOrderno(final Map<String, Object> params,
                                     final Observer<Object> observer) {
        HttpManager.getInstance().HttpManagerRequest(observer,
                new ApiServiceMethodCallBack<Object>() {
                    @Override
                    public Observable<CommonResult<Object>>
                    createObservable(ApiService apiService) {
                        return apiService.createInStockOrderno(params);
                    }
                });
    }

    /**
     * 获得其他入库单统计数据（制单）
     *
     * @param observer
     */
    public void getMakeOtherStockTotal(final Map<String, Object> params,
                                       final Observer<GetMakeOtherStockTotalResult> observer) {
        HttpManager.getInstance().HttpManagerRequest(observer,
                new ApiServiceMethodCallBack<GetMakeOtherStockTotalResult>() {
                    @Override
                    public Observable<CommonResult<GetMakeOtherStockTotalResult>>
                    createObservable(ApiService apiService) {
                        return apiService.getMakeOtherStockTotal(params);
                    }
                });
    }
}

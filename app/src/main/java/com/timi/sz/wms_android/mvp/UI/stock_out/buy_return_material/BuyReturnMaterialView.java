package com.timi.sz.wms_android.mvp.UI.stock_out.buy_return_material;

import com.timi.sz.wms_android.bean.outstock.buy.BuyReturnMaterialByMaterialCodeData;
import com.timi.sz.wms_android.bean.outstock.buy.BuyReturnMaterialByOrdernoData;
import com.timi.sz.wms_android.mvp.base.view.iml.MvpBaseView;

/**
 * $dsc
 * author: timi
 * create at: 2017-08-28 17:29
 */

public interface BuyReturnMaterialView extends MvpBaseView {
    /**
     * 物料码扫描
     * @param bean
     */
     void materialScanResult(BuyReturnMaterialByMaterialCodeData bean);

    /**
     * 退单号/扫码
     * @param bean
     */
     void ReturnMaterialOrderNoScanResult(BuyReturnMaterialByOrdernoData bean);

    /**
     * 设置物料条码选中
     */
    void setMaterialEdittextSelect();

    /**
     * 设置单号选中
     */
    void setReturnMaterialOrderNoSelect();
}

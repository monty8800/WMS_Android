package com.timi.sz.wms_android.mvp.UI.stock_out.other.scan;

import com.timi.sz.wms_android.bean.instock.GetMakeOtherStockTotalResult;
import com.timi.sz.wms_android.bean.outstock.buy.SubmitBarcodeOutAuditData;
import com.timi.sz.wms_android.bean.outstock.outsource.SubmitBarcodeLotPickOutResult;
import com.timi.sz.wms_android.mvp.base.view.iml.MvpBaseView;

/**
 * $dsc
 * author: timi
 * create at: 2017-08-29 16:32
 */

public interface OtherOutStockScanView extends MvpBaseView {

    void submitBarcodeLotPickOut(SubmitBarcodeOutAuditData result);

    void submitMakeOrAuditBill();

    void setBarcodeSelect();

    void getMakeOtherStockTotal(GetMakeOtherStockTotalResult bean);
}

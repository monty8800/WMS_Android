package com.timi.sz.wms_android.mvp.UI.stock_in_work.lib_adjust_detail;

import com.timi.sz.wms_android.bean.stockin_work.lib_adjust.LibAdjustDetail;
import com.timi.sz.wms_android.mvp.base.view.iml.MvpBaseView;

import java.util.List;

/**
 * $dsc
 * author: timi
 * create at: 2017-11-24 16:27
 */

public interface LibAdjustDetailView extends MvpBaseView {
    void getDetail(List<LibAdjustDetail> datas);
}

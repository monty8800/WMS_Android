package com.timi.sz.wms_android.mvp.UI.stock_out.detail;

import com.timi.sz.wms_android.bean.outstock.detail.MaterialDetailResult;
import com.timi.sz.wms_android.mvp.base.view.iml.MvpBaseView;

import java.util.List;

/**
 * $dsc
 * author: timi
 * create at: 2017-09-18 19:57
 */

public interface DetailView extends MvpBaseView {
    void getDetailPickData(List<MaterialDetailResult> dataResults);
}

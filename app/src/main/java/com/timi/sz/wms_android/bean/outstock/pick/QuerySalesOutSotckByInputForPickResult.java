package com.timi.sz.wms_android.bean.outstock.pick;

import com.timi.sz.wms_android.bean.outstock.outsource.common.DetailResultsBean;

import java.util.List;

/**
 * $dsc
 * author: timi
 * create at: 2017-12-20 18:51
 */

public class QuerySalesOutSotckByInputForPickResult {

    /**
     * summaryResults : {"isLotPick":true,"isRegion":false,"billId":5337,"billCode":"CK160815029","billDate":"2016-08-15","customerName":"Jason","createrName":"方艳冬","scanId":0,"qty":5,"waitQty":5,"scanQty":0,"warehouseId":0,"warehouseName":null,"regionId":0,"regionName":null,"isSplitPrint":true}
     * detailResults : [{"detailId":10467,"line":1,"materialId":5499,"materialCode":"30201010144","materialName":"MS-708RSM无线后视系统","materialStandard":"客户：RVS-2CAM/708M显示器(车充#)*1+757M摄像头(225#)*1+配件","materialAttribute":"","warehouseId":3,"warehouseName":"成品仓","qty":2,"waitQty":2,"scanQty":0},{"detailId":10468,"line":2,"materialId":5237,"materialCode":"30102010263","materialName":"MS-305WF摄像头","materialStandard":"2.4G WF无线，PC309/N制/黑色，带电池/DC头充电","materialAttribute":"","warehouseId":3,"warehouseName":"成品仓","qty":3,"waitQty":3,"scanQty":0}]
     */

    private SummaryResultsBean summaryResults;
    private List<DetailResultsBean> detailResults;

    public SummaryResultsBean getSummaryResults() {
        return summaryResults;
    }

    public void setSummaryResults(SummaryResultsBean summaryResults) {
        this.summaryResults = summaryResults;
    }

    public List<DetailResultsBean> getDetailResults() {
        return detailResults;
    }

    public void setDetailResults(List<DetailResultsBean> detailResults) {
        this.detailResults = detailResults;
    }

    public static class SummaryResultsBean {
        /**
         * isLotPick : true
         * isRegion : false
         * billId : 5337
         * billCode : CK160815029
         * billDate : 2016-08-15
         * customerName : Jason
         * createrName : 方艳冬
         * scanId : 0
         * qty : 5
         * waitQty : 5
         * scanQty : 0
         * warehouseId : 0
         * warehouseName : null
         * regionId : 0
         * regionName : null
         * isSplitPrint : true
         */

        private boolean isLotPick;
        private boolean isRegion;
        private int billId;
        private String billCode;
        private String billDate;
        private String customerName;
        private String createrName;
        private int scanId;
        private int qty;
        private int waitQty;
        private int scanQty;
        private int warehouseId;
        private Object warehouseName;
        private int regionId;
        private Object regionName;
        private boolean isSplitPrint;

        public boolean isIsLotPick() {
            return isLotPick;
        }

        public void setIsLotPick(boolean isLotPick) {
            this.isLotPick = isLotPick;
        }

        public boolean isIsRegion() {
            return isRegion;
        }

        public void setIsRegion(boolean isRegion) {
            this.isRegion = isRegion;
        }

        public int getBillId() {
            return billId;
        }

        public void setBillId(int billId) {
            this.billId = billId;
        }

        public String getBillCode() {
            return billCode;
        }

        public void setBillCode(String billCode) {
            this.billCode = billCode;
        }

        public String getBillDate() {
            return billDate;
        }

        public void setBillDate(String billDate) {
            this.billDate = billDate;
        }

        public String getCustomerName() {
            return customerName;
        }

        public void setCustomerName(String customerName) {
            this.customerName = customerName;
        }

        public String getCreaterName() {
            return createrName;
        }

        public void setCreaterName(String createrName) {
            this.createrName = createrName;
        }

        public int getScanId() {
            return scanId;
        }

        public void setScanId(int scanId) {
            this.scanId = scanId;
        }

        public int getQty() {
            return qty;
        }

        public void setQty(int qty) {
            this.qty = qty;
        }

        public int getWaitQty() {
            return waitQty;
        }

        public void setWaitQty(int waitQty) {
            this.waitQty = waitQty;
        }

        public int getScanQty() {
            return scanQty;
        }

        public void setScanQty(int scanQty) {
            this.scanQty = scanQty;
        }

        public int getWarehouseId() {
            return warehouseId;
        }

        public void setWarehouseId(int warehouseId) {
            this.warehouseId = warehouseId;
        }

        public Object getWarehouseName() {
            return warehouseName;
        }

        public void setWarehouseName(Object warehouseName) {
            this.warehouseName = warehouseName;
        }

        public int getRegionId() {
            return regionId;
        }

        public void setRegionId(int regionId) {
            this.regionId = regionId;
        }

        public Object getRegionName() {
            return regionName;
        }

        public void setRegionName(Object regionName) {
            this.regionName = regionName;
        }

        public boolean isIsSplitPrint() {
            return isSplitPrint;
        }

        public void setIsSplitPrint(boolean isSplitPrint) {
            this.isSplitPrint = isSplitPrint;
        }
    }
}

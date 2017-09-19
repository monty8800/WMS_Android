package com.timi.sz.wms_android.base.uils;

import com.timi.sz.wms_android.mvp.base.BaseApplication;

import java.util.HashMap;
import java.util.Map;

import static com.timi.sz.wms_android.base.uils.PackageUtils.isApkDebugable;

/**
 * 需要的静态变量
 */

public class Constants {
    //base url
    public static final String BASE_URL = "http://szjuqent.imwork.net:83/";
//    public static final String BASE_URL = "http://192.168.0.102:8066/";
    //超时时间   5s
    public static int DEFAULT_TIMEOUT = 5000;
    /**********
     * 状态栏颜色
     *********************************************************************************************/
    public static final String StatusColorStr = "#c6ae75";
    /**********
     * SharePerference　存储用户信息 相关
     *********************************************************************************************/
    //记录密码
    public static final String REMENBER_PSW = "REMENBER_PSW";
    //是否是第一次登录
    public static final String IS_FIRST_LOG = "IS_FIRST_LOG";
    //用户名
    public static final String USER_NAME = "USER_NAME";
    //用户编号
    public static final String USER_NUM = "USER_NUM";
    //用户密码
    public static final String USER_PSW = "USER_PSW";
    //用户部门
    public static final String USER_DEPART = "USER_DEPART";
    //用户性别
    public static final String USER_SEX = "USER_SEX";
    //用户手机
    public static final String USER_TEL = "USER_TEL";
    //用户所属组织
    public static final String USER_FROM = "USER_FROM";
    //组织id
    public static final String ORGANAZATION_ID = "ORGANAZATION_ID";
    //用户权限组织
    public static final String USER_ROOT = "USER_ROOT";
    //登录的id
    public static final String CUSER_ID = "USER_ID";
    //租户信息
    public static final String TENANCY_NAME = "TENANCY_NAME";
    //用户所有的信息
    public static final String USER_INFO = "USER_INFO";
    //是否是 debug的状态
    public static final boolean IS_DEBUG = isApkDebugable(BaseApplication.getMApplicationContext());
    /***********
     * 扫码相关
     *********************************************************************************************/
    public static final int REQUEST_CODE = 1001;//主页跳转到扫码
    public static final int REQUEST_SCAN_CODE_MATERIIAL = 1002;//物料条码 扫码
    public static final int REQUEST_SCAN_CODE_LIB_LOATION = 1003;//库位码  扫码
    public static final int REQUEST_SCAN_CODE_RETURN_MATERIAL = 1003;//退料单号  扫码
    /***********
     * SharePerference存储token   key /  value的前缀
     *********************************************************************************************/
    public static final String AUTHORIZATION = "Authorization";
    public static final String AUTHORIZATION_VALUE = "Bearer ";
    /***********
     *SharePerference　存储 应用语言设置 中文简体（zh-CN）、中文繁体（zh-TW）、English（en）
     *********************************************************************************************/
    public static final String LOCALE_LAUGUAGE = "Abp.Localization.CultureName";
    /***********
     * SharePerference存储用户选的baseurl
     *********************************************************************************************/
    public static final String SP_BASE_URL = "SP_BASE_URL";
    /***********
     * SharePerference 软件更新相关
     *********************************************************************************************/
    public static final String APK_NAME = "wms.apk";      //apk 名称
    public static final String IS_HAVE_DOWNLOAD_NEW = "is_have_download_new";//是否下载了最新版本的安装包


    /***********
     * 跳转 传递的相关字段
     *********************************************************************************************/
    /***********
     * 跳转到登录界面 是否显示服务配置的弹框（ 可能是来自于服务配置按钮的点击）
     *********************************************************************************************/
    public static final String IS_NEED_SHOW_SHOW_SERVER_SET = "isNeedShowServerSet.apk";


    /***********
     * 入库跳转到查询界面的不同code码
     *********************************************************************************************/
    public static final String CODE_STR = "stockin_code";//入库的code码的key
    public static final String ORDER_NO = "order_no";//单号
    public static final int BUY_ORDE_NUM = 5001;//采购单
    public static final int BUY_SEND_NUM = 5002;//送货单
    public static final int COME_MATERAIL_NUM = 5003;//来料单
    public static final int CREATE_PRO_CHECK_NUM = 5004;//产成品-审核单
    public static final int CREATE_PRO_CREATE_ORDER_NUM = 5005;//产成品-生单
    public static final int OTHER_IN_STOCK_SELECT_ORDERNO = 5006;//其他入库-选单
    public static final int OTHER_IN_STOCK_SCAN = 5007;//其他入库-扫描
    public static final int OUT_RETURN_MATERAIL = 5008;//委外退料-选单
    public static final int CREATE_RETURN_MATERAIL = 5009;//生产退料-选单
    public static final int SALE_RETURN_MATERAIL = 5010;//销售退料-扫描
    /***********
     * 入库跳转到查询界面的不同实体的key
     *********************************************************************************************/
    //单号(传递到详情界面)
    public static final String IN_STOCK_ORDERNO = "inStockOrderno";
    //采购单
    public static final String IN_STOCK_BUY_BEAN = "in_stock_buy_orderno";
    //送货单
    public static final String IN_STOCK_SEND_BEAN = "in_stock_send_orderno";
    //收货单
    public static final String IN_STOCK_RECEIVE_BEAN = "in_stock_receive_orderno";
    //产成品 审核
    public static final String IN_STOCK_FINISH_BEAN = "in_stock_finish_orderno";
    //产成品 生单
    public static final String IN_STOCK_FINISH_CREATE_BEAN = "in_stock_craate_orderno";
    //其他 选单
    public static final String IN_STOCK_FINISH_OTHER_BEAN = "in_stock_other_orderno";
    //委外退料
    public static final String IN_STOCK_FINISH_OUT_BEAN = "in_stock_out_orderno";
    //生产退料
    public static final String IN_STOCK_FINISH_PRODUCTION_BEAN = "in_stock_production_orderno";
    //销售退料
    public static final String IN_STOCK_FINISH_SALE_BEAN = "in_stock_sale_orderno";


    /***********
     * 出库跳转的key
     *********************************************************************************************/

    /**
     * 采购退料 退料单的key
     */
    public static final String OUT_STOCK_BUY_RETURN_ORDERNO_BEAN = "out_stock_buy_return_orderno_bean";
    /**
     * 搜索 跳转的intent code
     */
    public static final String STOCK_OUT_CODE_STR = "stockout_code";//出库的code码的key

    public static final int STOCK_OUT_OUTSOURCE_FEED_SUPLLIEMENT = 5020;//委外补料
    public static final int STOCK_OUT_OUTSOURCE_AUDIT = 5021;//委外发料-委外发料单
    public static final int STOCK_OUT_OUTSOURCE_BILL = 5022;//委外发料-委外订单

    public static final int STOCK_OUT_PRODUCTION_FEEDING = 5023;//生产补料
    public static final int STOCK_OUT_PRODUCTION_AUDIT = 5024;//生产领料-审核
    public static final int STOCK_OUT_PRODUCTION_BILL = 5025;//生产领料-生单

    public static final int STOCK_OUT_PICK = 5026;//调拨
    public static final int STOCK_OUT_SELL_OUT_AUDIT = 5027;//销售出库-审核
    public static final int STOCK_OUT_SELL_OUT_BILL = 5028;//销售出库-生单

    public static final int STOCK_OUT_PURCHASE_MATERIAL_RETURN = 5029;//采购退料
    public static final int STOCK_OUT_OTHER_OUT_AUDIT = 5030;//其他出库-审核
    public static final int STOCK_OUT_OTHER_OUT_BILL = 5031;//其他出库-生单
    /**
     * 搜索 跳转的传递对象的key
     */
    //委外补料传递实体的key
    public static final String STOCK_OUT_OUTSOURCE_FEED_BEAN = "stock_out_outsource_feed_bean";//委外补料传递实体的key
    public static final String STOCK_OUT_OUTSOURCE_AUDIT_BEAN = "stock_out_outsource_audit_bean";//委外发料单-审核传递实体的key
    public static final String STOCK_OUT_OUTSOURCE_BILL_BEAN = "stock_out_outsource_bill_bean";//委外发料单-生单传递实体的key
    public static final String STOCK_OUT_PRODUCT_FEED_BEAN = "stock_out_production_feed_bean";//生产补料单传递实体的key
    public static final String STOCK_OUT_PRODUCT_AUDI_BEAN = "stock_out_production_audit_bean";//生产领料-审核传递实体的key
    public static final String STOCK_OUT_PRODUCT_BILL_BEAN = "stock_out_production_bill_bean";//生产领料-生单传递实体的key
    public static final String STOCK_OUT_PICK_BEAN = "stock_out_pick_bean";//调拨传递实体的key
    public static final String STOCK_OUT_SELL_AUDRI_BEAN = "stock_out_sell_audit_bean";//销售出库-审核传递实体的key
    public static final String STOCK_OUT_SELL_BILL_BEAN = "stock_out_sell_bill_bean";//销售出库-生单传递实体的key
    public static final String STOCK_OUT_OTHER_AUDIT_BEAN = "stock_out_other_audit_bean";//其他-审核传递实体的key
    public static final String STOCK_OUT_OTHER_BILL_BEAN = "stock_out_other_bill_bean";//其他-生单传递实体的key
    public static final String STOCK_OUT_POINT_DETAIL_BEAN = "stock_out_point_detail_bean";//清点详情传递实体的key


}

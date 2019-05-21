package org.hzero.tms.domain.entity;

import io.choerodon.mybatis.annotation.ModifyAudit;
import io.choerodon.mybatis.annotation.VersionAudit;
import io.choerodon.mybatis.domain.AuditDomain;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * 运输管理
 *
 */
@ApiModel("运输管理")
@VersionAudit
@ModifyAudit
@Table(name = "tpfm_transport")
public class Transport extends AuditDomain {

    public static final String FIELD_ID = "id";
    public static final String FIELD_TRANSPORT_CODE = "transportCode";
    public static final String FIELD_TRANSPORT_TYPE = "transportType";
    public static final String FIELD_ORDER_ID = "orderId";
    public static final String FIELD_ORDER_CODE = "orderCode";
    public static final String FIELD_CONTRACT_SIGN_DATE = "contractSignDate";
    public static final String FIELD_COMPANY_ID = "companyId";
    public static final String FIELD_TRANSPORT_STATUS = "transportStatus";
    public static final String FIELD_RECEPIT_STATUS = "recepitStatus";
    public static final String FIELD_GOODS_TYPE = "goodsType";
    public static final String FIELD_ISSUE_TYPE = "issueType";
    public static final String FIELD_GOODS_WEIGHT = "goodsWeight";
    public static final String FIELD_OUT_BY = "outBy";
    public static final String FIELD_OUT_BY_NAME = "outByName";
    public static final String FIELD_OUT_MOBILE = "outMobile";
    public static final String FIELD_OUT_COUNTRY_ID = "outCountryId";
    public static final String FIELD_OUT_PROVINCE_ID = "outProvinceId";
    public static final String FIELD_OUT_CITY_ID = "outCityId";
    public static final String FIELD_OUT_DISTRICT_ID = "outDistrictId";
    public static final String FIELD_OUT_ADDRESS = "outAddress";
    public static final String FIELD_RECEIVE_BY = "receiveBy";
    public static final String FIELD_RECEIVE_BY_NAME = "receiveByName";
    public static final String FIELD_RECEIVE_COUNTRY_ID = "receiveCountryId";
    public static final String FIELD_RECEIVE_PROVINCE_ID = "receiveProvinceId";
    public static final String FIELD_RECEIVE_CITY_ID = "receiveCityId";
    public static final String FIELD_RECEIVE_DISTRICT_ID = "receiveDistrictId";
    public static final String FIELD_RECEIVE_BY_ADDRESS = "receiveByAddress";
    public static final String FIELD_OTHER_SERVE = "otherServe";
    public static final String FIELD_TRANSPORT_COST = "transportCost";
    public static final String FIELD_VENDOR_NAME = "vendorName";
    public static final String FIELD_VENDOR_MOBILE = "vendorMobile";
    public static final String FIELD_REACH_LOAD_DATE = "reachLoadDate";
    public static final String FIELD_LOAD_DATE = "loadDate";
    public static final String FIELD_SEND_DATE_START = "sendDateStart";
    public static final String FIELD_SEND_DATE_END = "sendDateEnd";
    public static final String FIELD_DELIVERY_DATE_START = "deliveryDateStart";
    public static final String FIELD_LAST_DATE = "lastDate";
    public static final String FIELD_DELIVERY_DATE_END = "deliveryDateEnd";
    public static final String FIELD_REACH_UNLOAD_DATE = "reachUnloadDate";
    public static final String FIELD_UNLOAD_DATE = "unloadDate";
    public static final String FIELD_REMARK = "remark";
    public static final String FIELD_TENANT_ID = "tenantId";
    public static final String FIELD_PROGRAM_APPLICATION_ID = "programApplicationId";
    public static final String FIELD_PROGRAM_ID = "programId";
    public static final String FIELD_PROGRAM_UPDATE_DATE = "programUpdateDate";
    public static final String FIELD_REQUEST_ID = "requestId";
    public static final String FIELD_ATTRIBUTE_CATEGORY = "attributeCategory";
    public static final String FIELD_ATTRIBUTE1 = "attribute1";
    public static final String FIELD_ATTRIBUTE2 = "attribute2";
    public static final String FIELD_ATTRIBUTE3 = "attribute3";
    public static final String FIELD_ATTRIBUTE4 = "attribute4";
    public static final String FIELD_ATTRIBUTE5 = "attribute5";
    public static final String FIELD_ATTRIBUTE6 = "attribute6";
    public static final String FIELD_ATTRIBUTE7 = "attribute7";
    public static final String FIELD_ATTRIBUTE8 = "attribute8";
    public static final String FIELD_ATTRIBUTE9 = "attribute9";
    public static final String FIELD_ATTRIBUTE10 = "attribute10";
    public static final String FIELD_ATTRIBUTE11 = "attribute11";
    public static final String FIELD_ATTRIBUTE12 = "attribute12";
    public static final String FIELD_ATTRIBUTE13 = "attribute13";
    public static final String FIELD_ATTRIBUTE14 = "attribute14";
    public static final String FIELD_ATTRIBUTE15 = "attribute15";

    //
    // 业务方法(按public protected private顺序排列)
    // ------------------------------------------------------------------------------

    //
    // 数据库字段
    // ------------------------------------------------------------------------------


    @ApiModelProperty("表ID，主键，供其他表做外键")
    @Id
    @GeneratedValue
    private Long id;
    @ApiModelProperty(value = "运单编号",required = true)
    @NotBlank
    private String transportCode;
    @ApiModelProperty(value = "运输类型",required = true)
    @NotBlank
    private String transportType;
    @ApiModelProperty(value = "订单id",required = true)
    @NotNull
    private Long orderId;
    @ApiModelProperty(value = "订单CODE",required = true)
    @NotBlank
    private String orderCode;
    @ApiModelProperty(value = "合同签订时间")
    private Date contractSignDate;
    @ApiModelProperty(value = "公司id",required = true)
    @NotNull
    private Long companyId;
    @ApiModelProperty(value = "运单状态",required = true)
    @NotBlank
    private String transportStatus;
    @ApiModelProperty(value = "回单状态")
    private String recepitStatus;
    @ApiModelProperty(value = "货物类型")
    private String goodsType;
    @ApiModelProperty(value = "需求发布模式",required = true)
    @NotBlank
    private String issueType;
    @ApiModelProperty(value = "货物重量",required = true)
    @NotNull
    private Long goodsWeight;
    @ApiModelProperty(value = "发货人id")
    private Long outBy;
    @ApiModelProperty(value = "发货人名称")
    private String outByName;
    @ApiModelProperty(value = "发货人联系方式")
    private String outMobile;
    @ApiModelProperty(value = "国别")
    private Long outCountryId;
    @ApiModelProperty(value = "省份")
    private Long outProvinceId;
    @ApiModelProperty(value = "城市")
    private Long outCityId;
    @ApiModelProperty(value = "区/乡镇")
    private Long outDistrictId;
    @ApiModelProperty(value = "发货地址")
    private String outAddress;
    @ApiModelProperty(value = "收货人id")
    private Long receiveBy;
    @ApiModelProperty(value = "收货人名称")
    private String receiveByName;
    @ApiModelProperty(value = "国别")
    private Long receiveCountryId;
    @ApiModelProperty(value = "省份")
    private Long receiveProvinceId;
    @ApiModelProperty(value = "城市")
    private Long receiveCityId;
    @ApiModelProperty(value = "区/乡镇")
    private Long receiveDistrictId;
    @ApiModelProperty(value = "收货地址")
    private String receiveByAddress;
    @ApiModelProperty(value = "所需其他服务")
    private String otherServe;
    @ApiModelProperty(value = "运输费用")
    private String transportCost;
    @ApiModelProperty(value = "承运方名称")
    private String vendorName;
    @ApiModelProperty(value = "承运方联系方式")
    private String vendorMobile;
    @ApiModelProperty(value = "到达装货地时间")
    private Date reachLoadDate;
    @ApiModelProperty(value = "装货完成时间")
    private Date loadDate;
    @ApiModelProperty(value = "发货时间起")
    private Date sendDateStart;
    @ApiModelProperty(value = "发货时间至")
    private Date sendDateEnd;
    @ApiModelProperty(value = "交付时间起")
    private Date deliveryDateStart;
    @ApiModelProperty(value = "截至时间")
    private Date lastDate;
    @ApiModelProperty(value = "交付时间至")
    private Date deliveryDateEnd;
    @ApiModelProperty(value = "到达卸货地时间")
    private Date reachUnloadDate;
    @ApiModelProperty(value = "卸货完成时间")
    private Date unloadDate;
    @ApiModelProperty(value = "备注说明")
    private String remark;
    @ApiModelProperty(value = "租户ID,hpfm_tenant.tenant_id",required = true)
    @NotNull
    private Long tenantId;
    @ApiModelProperty(value = "")
    private Long programApplicationId;
    @ApiModelProperty(value = "")
    private Long programId;
    @ApiModelProperty(value = "")
    private Date programUpdateDate;
    @ApiModelProperty(value = "")
    private Long requestId;
    @ApiModelProperty(value = "")
    private String attributeCategory;
    @ApiModelProperty(value = "")
    private String attribute1;
    @ApiModelProperty(value = "")
    private String attribute2;
    @ApiModelProperty(value = "")
    private String attribute3;
    @ApiModelProperty(value = "")
    private String attribute4;
    @ApiModelProperty(value = "")
    private String attribute5;
    @ApiModelProperty(value = "")
    private String attribute6;
    @ApiModelProperty(value = "")
    private String attribute7;
    @ApiModelProperty(value = "")
    private String attribute8;
    @ApiModelProperty(value = "")
    private String attribute9;
    @ApiModelProperty(value = "")
    private String attribute10;
    @ApiModelProperty(value = "")
    private String attribute11;
    @ApiModelProperty(value = "")
    private String attribute12;
    @ApiModelProperty(value = "")
    private String attribute13;
    @ApiModelProperty(value = "")
    private String attribute14;
    @ApiModelProperty(value = "")
    private String attribute15;

    //
    // 非数据库字段
    // ------------------------------------------------------------------------------

    //
    // getter/setter
    // ------------------------------------------------------------------------------

    /**
     * @return 表ID，主键，供其他表做外键
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    /**
     * @return 运单编号
     */
    public String getTransportCode() {
        return transportCode;
    }

    public void setTransportCode(String transportCode) {
        this.transportCode = transportCode;
    }
    /**
     * @return 运输类型
     */
    public String getTransportType() {
        return transportType;
    }

    public void setTransportType(String transportType) {
        this.transportType = transportType;
    }
    /**
     * @return 订单id
     */
    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
    /**
     * @return 订单CODE
     */
    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }
    /**
     * @return 合同签订时间
     */
    public Date getContractSignDate() {
        return contractSignDate;
    }

    public void setContractSignDate(Date contractSignDate) {
        this.contractSignDate = contractSignDate;
    }
    /**
     * @return 公司id
     */
    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }
    /**
     * @return 运单状态
     */
    public String getTransportStatus() {
        return transportStatus;
    }

    public void setTransportStatus(String transportStatus) {
        this.transportStatus = transportStatus;
    }
    /**
     * @return 回单状态
     */
    public String getRecepitStatus() {
        return recepitStatus;
    }

    public void setRecepitStatus(String recepitStatus) {
        this.recepitStatus = recepitStatus;
    }
    /**
     * @return 货物类型
     */
    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType;
    }
    /**
     * @return 需求发布模式
     */
    public String getIssueType() {
        return issueType;
    }

    public void setIssueType(String issueType) {
        this.issueType = issueType;
    }
    /**
     * @return 货物重量
     */
    public Long getGoodsWeight() {
        return goodsWeight;
    }

    public void setGoodsWeight(Long goodsWeight) {
        this.goodsWeight = goodsWeight;
    }
    /**
     * @return 发货人id
     */
    public Long getOutBy() {
        return outBy;
    }

    public void setOutBy(Long outBy) {
        this.outBy = outBy;
    }
    /**
     * @return 发货人名称
     */
    public String getOutByName() {
        return outByName;
    }

    public void setOutByName(String outByName) {
        this.outByName = outByName;
    }
    /**
     * @return 发货人联系方式
     */
    public String getOutMobile() {
        return outMobile;
    }

    public void setOutMobile(String outMobile) {
        this.outMobile = outMobile;
    }
    /**
     * @return 国别
     */
    public Long getOutCountryId() {
        return outCountryId;
    }

    public void setOutCountryId(Long outCountryId) {
        this.outCountryId = outCountryId;
    }
    /**
     * @return 省份
     */
    public Long getOutProvinceId() {
        return outProvinceId;
    }

    public void setOutProvinceId(Long outProvinceId) {
        this.outProvinceId = outProvinceId;
    }
    /**
     * @return 城市
     */
    public Long getOutCityId() {
        return outCityId;
    }

    public void setOutCityId(Long outCityId) {
        this.outCityId = outCityId;
    }
    /**
     * @return 区/乡镇
     */
    public Long getOutDistrictId() {
        return outDistrictId;
    }

    public void setOutDistrictId(Long outDistrictId) {
        this.outDistrictId = outDistrictId;
    }
    /**
     * @return 发货地址
     */
    public String getOutAddress() {
        return outAddress;
    }

    public void setOutAddress(String outAddress) {
        this.outAddress = outAddress;
    }
    /**
     * @return 收货人id
     */
    public Long getReceiveBy() {
        return receiveBy;
    }

    public void setReceiveBy(Long receiveBy) {
        this.receiveBy = receiveBy;
    }
    /**
     * @return 收货人名称
     */
    public String getReceiveByName() {
        return receiveByName;
    }

    public void setReceiveByName(String receiveByName) {
        this.receiveByName = receiveByName;
    }
    /**
     * @return 国别
     */
    public Long getReceiveCountryId() {
        return receiveCountryId;
    }

    public void setReceiveCountryId(Long receiveCountryId) {
        this.receiveCountryId = receiveCountryId;
    }
    /**
     * @return 省份
     */
    public Long getReceiveProvinceId() {
        return receiveProvinceId;
    }

    public void setReceiveProvinceId(Long receiveProvinceId) {
        this.receiveProvinceId = receiveProvinceId;
    }
    /**
     * @return 城市
     */
    public Long getReceiveCityId() {
        return receiveCityId;
    }

    public void setReceiveCityId(Long receiveCityId) {
        this.receiveCityId = receiveCityId;
    }
    /**
     * @return 区/乡镇
     */
    public Long getReceiveDistrictId() {
        return receiveDistrictId;
    }

    public void setReceiveDistrictId(Long receiveDistrictId) {
        this.receiveDistrictId = receiveDistrictId;
    }
    /**
     * @return 收货地址
     */
    public String getReceiveByAddress() {
        return receiveByAddress;
    }

    public void setReceiveByAddress(String receiveByAddress) {
        this.receiveByAddress = receiveByAddress;
    }
    /**
     * @return 所需其他服务
     */
    public String getOtherServe() {
        return otherServe;
    }

    public void setOtherServe(String otherServe) {
        this.otherServe = otherServe;
    }
    /**
     * @return 运输费用
     */
    public String getTransportCost() {
        return transportCost;
    }

    public void setTransportCost(String transportCost) {
        this.transportCost = transportCost;
    }
    /**
     * @return 承运方名称
     */
    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }
    /**
     * @return 承运方联系方式
     */
    public String getVendorMobile() {
        return vendorMobile;
    }

    public void setVendorMobile(String vendorMobile) {
        this.vendorMobile = vendorMobile;
    }
    /**
     * @return 到达装货地时间
     */
    public Date getReachLoadDate() {
        return reachLoadDate;
    }

    public void setReachLoadDate(Date reachLoadDate) {
        this.reachLoadDate = reachLoadDate;
    }
    /**
     * @return 装货完成时间
     */
    public Date getLoadDate() {
        return loadDate;
    }

    public void setLoadDate(Date loadDate) {
        this.loadDate = loadDate;
    }
    /**
     * @return 发货时间起
     */
    public Date getSendDateStart() {
        return sendDateStart;
    }

    public void setSendDateStart(Date sendDateStart) {
        this.sendDateStart = sendDateStart;
    }
    /**
     * @return 发货时间至
     */
    public Date getSendDateEnd() {
        return sendDateEnd;
    }

    public void setSendDateEnd(Date sendDateEnd) {
        this.sendDateEnd = sendDateEnd;
    }
    /**
     * @return 交付时间起
     */
    public Date getDeliveryDateStart() {
        return deliveryDateStart;
    }

    public void setDeliveryDateStart(Date deliveryDateStart) {
        this.deliveryDateStart = deliveryDateStart;
    }
    /**
     * @return 截至时间
     */
    public Date getLastDate() {
        return lastDate;
    }

    public void setLastDate(Date lastDate) {
        this.lastDate = lastDate;
    }
    /**
     * @return 交付时间至
     */
    public Date getDeliveryDateEnd() {
        return deliveryDateEnd;
    }

    public void setDeliveryDateEnd(Date deliveryDateEnd) {
        this.deliveryDateEnd = deliveryDateEnd;
    }
    /**
     * @return 到达卸货地时间
     */
    public Date getReachUnloadDate() {
        return reachUnloadDate;
    }

    public void setReachUnloadDate(Date reachUnloadDate) {
        this.reachUnloadDate = reachUnloadDate;
    }
    /**
     * @return 卸货完成时间
     */
    public Date getUnloadDate() {
        return unloadDate;
    }

    public void setUnloadDate(Date unloadDate) {
        this.unloadDate = unloadDate;
    }
    /**
     * @return 备注说明
     */
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
    /**
     * @return 租户ID,hpfm_tenant.tenant_id
     */
    public Long getTenantId() {
        return tenantId;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }
    /**
     * @return
     */
    public Long getProgramApplicationId() {
        return programApplicationId;
    }

    public void setProgramApplicationId(Long programApplicationId) {
        this.programApplicationId = programApplicationId;
    }
    /**
     * @return
     */
    public Long getProgramId() {
        return programId;
    }

    public void setProgramId(Long programId) {
        this.programId = programId;
    }
    /**
     * @return
     */
    public Date getProgramUpdateDate() {
        return programUpdateDate;
    }

    public void setProgramUpdateDate(Date programUpdateDate) {
        this.programUpdateDate = programUpdateDate;
    }
    /**
     * @return
     */
    public Long getRequestId() {
        return requestId;
    }

    public void setRequestId(Long requestId) {
        this.requestId = requestId;
    }
    /**
     * @return
     */
    public String getAttributeCategory() {
        return attributeCategory;
    }

    public void setAttributeCategory(String attributeCategory) {
        this.attributeCategory = attributeCategory;
    }
    /**
     * @return
     */
    public String getAttribute1() {
        return attribute1;
    }

    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1;
    }
    /**
     * @return
     */
    public String getAttribute2() {
        return attribute2;
    }

    public void setAttribute2(String attribute2) {
        this.attribute2 = attribute2;
    }
    /**
     * @return
     */
    public String getAttribute3() {
        return attribute3;
    }

    public void setAttribute3(String attribute3) {
        this.attribute3 = attribute3;
    }
    /**
     * @return
     */
    public String getAttribute4() {
        return attribute4;
    }

    public void setAttribute4(String attribute4) {
        this.attribute4 = attribute4;
    }
    /**
     * @return
     */
    public String getAttribute5() {
        return attribute5;
    }

    public void setAttribute5(String attribute5) {
        this.attribute5 = attribute5;
    }
    /**
     * @return
     */
    public String getAttribute6() {
        return attribute6;
    }

    public void setAttribute6(String attribute6) {
        this.attribute6 = attribute6;
    }
    /**
     * @return
     */
    public String getAttribute7() {
        return attribute7;
    }

    public void setAttribute7(String attribute7) {
        this.attribute7 = attribute7;
    }
    /**
     * @return
     */
    public String getAttribute8() {
        return attribute8;
    }

    public void setAttribute8(String attribute8) {
        this.attribute8 = attribute8;
    }
    /**
     * @return
     */
    public String getAttribute9() {
        return attribute9;
    }

    public void setAttribute9(String attribute9) {
        this.attribute9 = attribute9;
    }
    /**
     * @return
     */
    public String getAttribute10() {
        return attribute10;
    }

    public void setAttribute10(String attribute10) {
        this.attribute10 = attribute10;
    }
    /**
     * @return
     */
    public String getAttribute11() {
        return attribute11;
    }

    public void setAttribute11(String attribute11) {
        this.attribute11 = attribute11;
    }
    /**
     * @return
     */
    public String getAttribute12() {
        return attribute12;
    }

    public void setAttribute12(String attribute12) {
        this.attribute12 = attribute12;
    }
    /**
     * @return
     */
    public String getAttribute13() {
        return attribute13;
    }

    public void setAttribute13(String attribute13) {
        this.attribute13 = attribute13;
    }
    /**
     * @return
     */
    public String getAttribute14() {
        return attribute14;
    }

    public void setAttribute14(String attribute14) {
        this.attribute14 = attribute14;
    }
    /**
     * @return
     */
    public String getAttribute15() {
        return attribute15;
    }

    public void setAttribute15(String attribute15) {
        this.attribute15 = attribute15;
    }

}

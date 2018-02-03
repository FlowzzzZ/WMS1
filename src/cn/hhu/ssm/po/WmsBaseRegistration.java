package cn.hhu.ssm.po;

import java.util.Date;

public class WmsBaseRegistration {
    private Integer registrationId;

    private String registrationNumber;

    private String goodsname;

    private String specifiationtype;

    private String productstandards;

    private Date registrationvalidity;

    private String registrationphoto;

    private Date makeorderdate;

    private Integer makeorderman;

    private Boolean isdeleted;

    private String goodsNumber;

    private Boolean isfailure;

    private String chinesenumber;

    private String origin;

    private Integer productionenterprisenumber;

    private String applicationscope;

    private String registeredagent;

    private String aftersalesservice;

    private String remark;

    private Date approvaldate;

    private String shipperId;

    private Integer firstbusiness;

    public Integer getRegistrationId() {
        return registrationId;
    }

    public void setRegistrationId(Integer registrationId) {
        this.registrationId = registrationId;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber == null ? null : registrationNumber.trim();
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname == null ? null : goodsname.trim();
    }

    public String getSpecifiationtype() {
        return specifiationtype;
    }

    public void setSpecifiationtype(String specifiationtype) {
        this.specifiationtype = specifiationtype == null ? null : specifiationtype.trim();
    }

    public String getProductstandards() {
        return productstandards;
    }

    public void setProductstandards(String productstandards) {
        this.productstandards = productstandards == null ? null : productstandards.trim();
    }

    public Date getRegistrationvalidity() {
        return registrationvalidity;
    }

    public void setRegistrationvalidity(Date registrationvalidity) {
        this.registrationvalidity = registrationvalidity;
    }

    public String getRegistrationphoto() {
        return registrationphoto;
    }

    public void setRegistrationphoto(String registrationphoto) {
        this.registrationphoto = registrationphoto == null ? null : registrationphoto.trim();
    }

    public Date getMakeorderdate() {
        return makeorderdate;
    }

    public void setMakeorderdate(Date makeorderdate) {
        this.makeorderdate = makeorderdate;
    }

    public Integer getMakeorderman() {
        return makeorderman;
    }

    public void setMakeorderman(Integer makeorderman) {
        this.makeorderman = makeorderman;
    }

    public Boolean getIsdeleted() {
        return isdeleted;
    }

    public void setIsdeleted(Boolean isdeleted) {
        this.isdeleted = isdeleted;
    }

    public String getGoodsNumber() {
        return goodsNumber;
    }

    public void setGoodsNumber(String goodsNumber) {
        this.goodsNumber = goodsNumber == null ? null : goodsNumber.trim();
    }

    public Boolean getIsfailure() {
        return isfailure;
    }

    public void setIsfailure(Boolean isfailure) {
        this.isfailure = isfailure;
    }

    public String getChinesenumber() {
        return chinesenumber;
    }

    public void setChinesenumber(String chinesenumber) {
        this.chinesenumber = chinesenumber == null ? null : chinesenumber.trim();
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin == null ? null : origin.trim();
    }

    public Integer getProductionenterprisenumber() {
        return productionenterprisenumber;
    }

    public void setProductionenterprisenumber(Integer productionenterprisenumber) {
        this.productionenterprisenumber = productionenterprisenumber;
    }

    public String getApplicationscope() {
        return applicationscope;
    }

    public void setApplicationscope(String applicationscope) {
        this.applicationscope = applicationscope == null ? null : applicationscope.trim();
    }

    public String getRegisteredagent() {
        return registeredagent;
    }

    public void setRegisteredagent(String registeredagent) {
        this.registeredagent = registeredagent == null ? null : registeredagent.trim();
    }

    public String getAftersalesservice() {
        return aftersalesservice;
    }

    public void setAftersalesservice(String aftersalesservice) {
        this.aftersalesservice = aftersalesservice == null ? null : aftersalesservice.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getApprovaldate() {
        return approvaldate;
    }

    public void setApprovaldate(Date approvaldate) {
        this.approvaldate = approvaldate;
    }

    public String getShipperId() {
        return shipperId;
    }

    public void setShipperId(String shipperId) {
        this.shipperId = shipperId == null ? null : shipperId.trim();
    }

    public Integer getFirstbusiness() {
        return firstbusiness;
    }

    public void setFirstbusiness(Integer firstbusiness) {
        this.firstbusiness = firstbusiness;
    }
}
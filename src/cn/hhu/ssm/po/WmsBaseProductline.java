package cn.hhu.ssm.po;

import java.util.Date;

public class WmsBaseProductline {
    private Integer productlineId;

    private String productlineNumber;

    private String shipperId;

    private String name;

    private String description;

    private String remark;

    private Date makeorderdate;

    private Integer makeorderman;

    private Boolean isdeleted;

    private Integer firstbusiness;

    public Integer getProductlineId() {
        return productlineId;
    }

    public void setProductlineId(Integer productlineId) {
        this.productlineId = productlineId;
    }

    public String getProductlineNumber() {
        return productlineNumber;
    }

    public void setProductlineNumber(String productlineNumber) {
        this.productlineNumber = productlineNumber == null ? null : productlineNumber.trim();
    }

    public String getShipperId() {
        return shipperId;
    }

    public void setShipperId(String shipperId) {
        this.shipperId = shipperId == null ? null : shipperId.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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

    public Integer getFirstbusiness() {
        return firstbusiness;
    }

    public void setFirstbusiness(Integer firstbusiness) {
        this.firstbusiness = firstbusiness;
    }
}
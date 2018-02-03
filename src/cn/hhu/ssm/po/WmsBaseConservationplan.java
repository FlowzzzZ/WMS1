package cn.hhu.ssm.po;

import java.util.Date;

public class WmsBaseConservationplan {
    private Integer conservationplanId;

    private String conservationplanNumber;

    private String shipperId;

    private Date conservationdate;

    private Boolean result;

    private String storagerequirement;

    private String operatingprocess;

    private String goodsmarking;

    private String protectivemeasures;

    private String hygienicenvironment;

    private Boolean isdeleted;

    private String remark;

    private Date makeorderdate;

    private Integer makeorderman;

    public Integer getConservationplanId() {
        return conservationplanId;
    }

    public void setConservationplanId(Integer conservationplanId) {
        this.conservationplanId = conservationplanId;
    }

    public String getConservationplanNumber() {
        return conservationplanNumber;
    }

    public void setConservationplanNumber(String conservationplanNumber) {
        this.conservationplanNumber = conservationplanNumber == null ? null : conservationplanNumber.trim();
    }

    public String getShipperId() {
        return shipperId;
    }

    public void setShipperId(String shipperId) {
        this.shipperId = shipperId == null ? null : shipperId.trim();
    }

    public Date getConservationdate() {
        return conservationdate;
    }

    public void setConservationdate(Date conservationdate) {
        this.conservationdate = conservationdate;
    }

    public Boolean getResult() {
        return result;
    }

    public void setResult(Boolean result) {
        this.result = result;
    }

    public String getStoragerequirement() {
        return storagerequirement;
    }

    public void setStoragerequirement(String storagerequirement) {
        this.storagerequirement = storagerequirement == null ? null : storagerequirement.trim();
    }

    public String getOperatingprocess() {
        return operatingprocess;
    }

    public void setOperatingprocess(String operatingprocess) {
        this.operatingprocess = operatingprocess == null ? null : operatingprocess.trim();
    }

    public String getGoodsmarking() {
        return goodsmarking;
    }

    public void setGoodsmarking(String goodsmarking) {
        this.goodsmarking = goodsmarking == null ? null : goodsmarking.trim();
    }

    public String getProtectivemeasures() {
        return protectivemeasures;
    }

    public void setProtectivemeasures(String protectivemeasures) {
        this.protectivemeasures = protectivemeasures == null ? null : protectivemeasures.trim();
    }

    public String getHygienicenvironment() {
        return hygienicenvironment;
    }

    public void setHygienicenvironment(String hygienicenvironment) {
        this.hygienicenvironment = hygienicenvironment == null ? null : hygienicenvironment.trim();
    }

    public Boolean getIsdeleted() {
        return isdeleted;
    }

    public void setIsdeleted(Boolean isdeleted) {
        this.isdeleted = isdeleted;
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
}
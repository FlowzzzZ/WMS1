package cn.hhu.ssm.po;

import java.util.Date;

public class WmsExdetail {
    private Integer exdetailId;

    private String exdetailNumber;

    private Integer exorderId;

    private Integer goodsId;

    private String goodsname;

    private String registration;

    private String specifiationtype;

    private String batchnumber;

    private String secondbatchnumber;

    private String serialNumber;

    private Date producedate;

    private Date failuredate;

    private Float exquantity;

    private String basicunit;

    private String packingunit;

    private Float conversionrate;

    private String factory;

    private String origin;

    private String goodsbarcode;

    private Float weight;

    private Float netweight;

    private Float volume;

    private Float payableton;

    private String remark;

    private Date makeorderdate;

    private Integer makeorderman;

    private String goodscode;

    private Integer goodsstatus;

    private Integer picked;

    private Float pickquantity;

    public Integer getExdetailId() {
        return exdetailId;
    }

    public void setExdetailId(Integer exdetailId) {
        this.exdetailId = exdetailId;
    }

    public String getExdetailNumber() {
        return exdetailNumber;
    }

    public void setExdetailNumber(String exdetailNumber) {
        this.exdetailNumber = exdetailNumber == null ? null : exdetailNumber.trim();
    }

    public Integer getExorderId() {
        return exorderId;
    }

    public void setExorderId(Integer exorderId) {
        this.exorderId = exorderId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname == null ? null : goodsname.trim();
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration == null ? null : registration.trim();
    }

    public String getSpecifiationtype() {
        return specifiationtype;
    }

    public void setSpecifiationtype(String specifiationtype) {
        this.specifiationtype = specifiationtype == null ? null : specifiationtype.trim();
    }

    public String getBatchnumber() {
        return batchnumber;
    }

    public void setBatchnumber(String batchnumber) {
        this.batchnumber = batchnumber == null ? null : batchnumber.trim();
    }

    public String getSecondbatchnumber() {
        return secondbatchnumber;
    }

    public void setSecondbatchnumber(String secondbatchnumber) {
        this.secondbatchnumber = secondbatchnumber == null ? null : secondbatchnumber.trim();
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber == null ? null : serialNumber.trim();
    }

    public Date getProducedate() {
        return producedate;
    }

    public void setProducedate(Date producedate) {
        this.producedate = producedate;
    }

    public Date getFailuredate() {
        return failuredate;
    }

    public void setFailuredate(Date failuredate) {
        this.failuredate = failuredate;
    }

    public Float getExquantity() {
        return exquantity;
    }

    public void setExquantity(Float exquantity) {
        this.exquantity = exquantity;
    }

    public String getBasicunit() {
        return basicunit;
    }

    public void setBasicunit(String basicunit) {
        this.basicunit = basicunit == null ? null : basicunit.trim();
    }

    public String getPackingunit() {
        return packingunit;
    }

    public void setPackingunit(String packingunit) {
        this.packingunit = packingunit == null ? null : packingunit.trim();
    }

    public Float getConversionrate() {
        return conversionrate;
    }

    public void setConversionrate(Float conversionrate) {
        this.conversionrate = conversionrate;
    }

    public String getFactory() {
        return factory;
    }

    public void setFactory(String factory) {
        this.factory = factory == null ? null : factory.trim();
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin == null ? null : origin.trim();
    }

    public String getGoodsbarcode() {
        return goodsbarcode;
    }

    public void setGoodsbarcode(String goodsbarcode) {
        this.goodsbarcode = goodsbarcode == null ? null : goodsbarcode.trim();
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public Float getNetweight() {
        return netweight;
    }

    public void setNetweight(Float netweight) {
        this.netweight = netweight;
    }

    public Float getVolume() {
        return volume;
    }

    public void setVolume(Float volume) {
        this.volume = volume;
    }

    public Float getPayableton() {
        return payableton;
    }

    public void setPayableton(Float payableton) {
        this.payableton = payableton;
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

    public String getGoodscode() {
        return goodscode;
    }

    public void setGoodscode(String goodscode) {
        this.goodscode = goodscode == null ? null : goodscode.trim();
    }

    public Integer getGoodsstatus() {
        return goodsstatus;
    }

    public void setGoodsstatus(Integer goodsstatus) {
        this.goodsstatus = goodsstatus;
    }

    public Integer getPicked() {
        return picked;
    }

    public void setPicked(Integer picked) {
        this.picked = picked;
    }

    public Float getPickquantity() {
        return pickquantity;
    }

    public void setPickquantity(Float pickquantity) {
        this.pickquantity = pickquantity;
    }
}
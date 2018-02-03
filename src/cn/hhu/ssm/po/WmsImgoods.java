package cn.hhu.ssm.po;

import java.util.Date;

public class WmsImgoods {
    private Integer goodsId;

    private String goodsNumber;

    private String goodsname;

    private Integer imorderId;

    private String registration;

    private String specifiationtype;

    private String batcnumber;

    private String secondbatchnumber;

    private Integer serialnumberId;

    private Date producedate;

    private Date failuredate;

    private Float arrivalgoodsnumber;

    private Float arrivedgoodsnumber;

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

    private Integer isdeleted;

    private String hslbm;

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsNumber() {
        return goodsNumber;
    }

    public void setGoodsNumber(String goodsNumber) {
        this.goodsNumber = goodsNumber == null ? null : goodsNumber.trim();
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname == null ? null : goodsname.trim();
    }

    public Integer getImorderId() {
        return imorderId;
    }

    public void setImorderId(Integer imorderId) {
        this.imorderId = imorderId;
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

    public String getBatcnumber() {
        return batcnumber;
    }

    public void setBatcnumber(String batcnumber) {
        this.batcnumber = batcnumber == null ? null : batcnumber.trim();
    }

    public String getSecondbatchnumber() {
        return secondbatchnumber;
    }

    public void setSecondbatchnumber(String secondbatchnumber) {
        this.secondbatchnumber = secondbatchnumber == null ? null : secondbatchnumber.trim();
    }

    public Integer getSerialnumberId() {
        return serialnumberId;
    }

    public void setSerialnumberId(Integer serialnumberId) {
        this.serialnumberId = serialnumberId;
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

    public Float getArrivalgoodsnumber() {
        return arrivalgoodsnumber;
    }

    public void setArrivalgoodsnumber(Float arrivalgoodsnumber) {
        this.arrivalgoodsnumber = arrivalgoodsnumber;
    }

    public Float getArrivedgoodsnumber() {
        return arrivedgoodsnumber;
    }

    public void setArrivedgoodsnumber(Float arrivedgoodsnumber) {
        this.arrivedgoodsnumber = arrivedgoodsnumber;
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

    public Integer getIsdeleted() {
        return isdeleted;
    }

    public void setIsdeleted(Integer isdeleted) {
        this.isdeleted = isdeleted;
    }

    public String getHslbm() {
        return hslbm;
    }

    public void setHslbm(String hslbm) {
        this.hslbm = hslbm == null ? null : hslbm.trim();
    }
}
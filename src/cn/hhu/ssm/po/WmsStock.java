package cn.hhu.ssm.po;

import java.util.Date;

public class WmsStock {
    private Integer stocksId;

    private String stocksNumber;

    private Integer locationsId;

    private String locationsNumber;

    private Integer goodsId;

    private String goodsname;

    private Float quantity;

    private Float weight;

    private Float netweight;

    private Float volume;

    private Float payableton;

    private Float remainpickquantity;

    private Integer islocked;

    private Integer stockstatus;

    private Integer isaddgoods;

    private String stockinstruction;

    private Date makeorderdate;

    private Integer makeorderman;

    private Integer isdeleted;

    private Integer isqualified;

    private Integer maxstorage;

    private String batchnumber;

    public Integer getStocksId() {
        return stocksId;
    }

    public void setStocksId(Integer stocksId) {
        this.stocksId = stocksId;
    }

    public String getStocksNumber() {
        return stocksNumber;
    }

    public void setStocksNumber(String stocksNumber) {
        this.stocksNumber = stocksNumber == null ? null : stocksNumber.trim();
    }

    public Integer getLocationsId() {
        return locationsId;
    }

    public void setLocationsId(Integer locationsId) {
        this.locationsId = locationsId;
    }

    public String getLocationsNumber() {
        return locationsNumber;
    }

    public void setLocationsNumber(String locationsNumber) {
        this.locationsNumber = locationsNumber == null ? null : locationsNumber.trim();
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

    public Float getQuantity() {
        return quantity;
    }

    public void setQuantity(Float quantity) {
        this.quantity = quantity;
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

    public Float getRemainpickquantity() {
        return remainpickquantity;
    }

    public void setRemainpickquantity(Float remainpickquantity) {
        this.remainpickquantity = remainpickquantity;
    }

    public Integer getIslocked() {
        return islocked;
    }

    public void setIslocked(Integer islocked) {
        this.islocked = islocked;
    }

    public Integer getStockstatus() {
        return stockstatus;
    }

    public void setStockstatus(Integer stockstatus) {
        this.stockstatus = stockstatus;
    }

    public Integer getIsaddgoods() {
        return isaddgoods;
    }

    public void setIsaddgoods(Integer isaddgoods) {
        this.isaddgoods = isaddgoods;
    }

    public String getStockinstruction() {
        return stockinstruction;
    }

    public void setStockinstruction(String stockinstruction) {
        this.stockinstruction = stockinstruction == null ? null : stockinstruction.trim();
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

    public Integer getIsqualified() {
        return isqualified;
    }

    public void setIsqualified(Integer isqualified) {
        this.isqualified = isqualified;
    }

    public Integer getMaxstorage() {
        return maxstorage;
    }

    public void setMaxstorage(Integer maxstorage) {
        this.maxstorage = maxstorage;
    }

    public String getBatchnumber() {
        return batchnumber;
    }

    public void setBatchnumber(String batchnumber) {
        this.batchnumber = batchnumber == null ? null : batchnumber.trim();
    }
}
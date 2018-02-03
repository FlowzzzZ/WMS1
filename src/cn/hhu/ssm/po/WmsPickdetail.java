package cn.hhu.ssm.po;

import java.util.Date;

import cn.hhu.ssm.common.BaseParam;

public class WmsPickdetail extends BaseParam{
    private Integer pickdetailId;

    private String pickdetailNumber;

    private Integer detailId;

    private String storagelocationcode;

    private Integer storagelocationId;

    private Float remainpickquantity;

    private Float weight;

    private Float netweight;

    private Float volume;

    private Float payableton;

    private Float pickedquantity;

    private String pickinstruction;

    private Integer pickman;

    private Date makeorderdate;

    private Integer makeorderman;

    private Integer quality;

    private Date picktime;

    private Integer stockId;

    private Integer isfinished;

    public Integer getPickdetailId() {
        return pickdetailId;
    }

    public void setPickdetailId(Integer pickdetailId) {
        this.pickdetailId = pickdetailId;
    }

    public String getPickdetailNumber() {
        return pickdetailNumber;
    }

    public void setPickdetailNumber(String pickdetailNumber) {
        this.pickdetailNumber = pickdetailNumber == null ? null : pickdetailNumber.trim();
    }

    public Integer getDetailId() {
        return detailId;
    }

    public void setDetailId(Integer detailId) {
        this.detailId = detailId;
    }

    public String getStoragelocationcode() {
        return storagelocationcode;
    }

    public void setStoragelocationcode(String storagelocationcode) {
        this.storagelocationcode = storagelocationcode == null ? null : storagelocationcode.trim();
    }

    public Integer getStoragelocationId() {
        return storagelocationId;
    }

    public void setStoragelocationId(Integer storagelocationId) {
        this.storagelocationId = storagelocationId;
    }

    public Float getRemainpickquantity() {
        return remainpickquantity;
    }

    public void setRemainpickquantity(Float remainpickquantity) {
        this.remainpickquantity = remainpickquantity;
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

    public Float getPickedquantity() {
        return pickedquantity;
    }

    public void setPickedquantity(Float pickedquantity) {
        this.pickedquantity = pickedquantity;
    }

    public String getPickinstruction() {
        return pickinstruction;
    }

    public void setPickinstruction(String pickinstruction) {
        this.pickinstruction = pickinstruction == null ? null : pickinstruction.trim();
    }

    public Integer getPickman() {
        return pickman;
    }

    public void setPickman(Integer pickman) {
        this.pickman = pickman;
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

    public Integer getQuality() {
        return quality;
    }

    public void setQuality(Integer quality) {
        this.quality = quality;
    }

    public Date getPicktime() {
        return picktime;
    }

    public void setPicktime(Date picktime) {
        this.picktime = picktime;
    }

    public Integer getStockId() {
        return stockId;
    }

    public void setStockId(Integer stockId) {
        this.stockId = stockId;
    }

    public Integer getIsfinished() {
        return isfinished;
    }

    public void setIsfinished(Integer isfinished) {
        this.isfinished = isfinished;
    }
}
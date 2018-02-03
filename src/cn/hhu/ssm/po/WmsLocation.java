package cn.hhu.ssm.po;

import java.util.Date;

public class WmsLocation {
    private Integer locationsId;

    private String locationsNumber;

    private Integer parentareaId;

    private String locationattribute;

    private Integer shelves;

    private Integer layersnumber;

    private Integer goodsId;

    private Float goodsNumber;

    private Float picisl;

    private Float maxweight;

    private Float maxvolumn;

    private Integer isused;

    private Date makeorderdate;

    private Integer makeorderman;

    private Integer columncount;

    private String areaname;

    private String locationname;

    private String remark;

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

    public Integer getParentareaId() {
        return parentareaId;
    }

    public void setParentareaId(Integer parentareaId) {
        this.parentareaId = parentareaId;
    }

    public String getLocationattribute() {
        return locationattribute;
    }

    public void setLocationattribute(String locationattribute) {
        this.locationattribute = locationattribute == null ? null : locationattribute.trim();
    }

    public Integer getShelves() {
        return shelves;
    }

    public void setShelves(Integer shelves) {
        this.shelves = shelves;
    }

    public Integer getLayersnumber() {
        return layersnumber;
    }

    public void setLayersnumber(Integer layersnumber) {
        this.layersnumber = layersnumber;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Float getGoodsNumber() {
        return goodsNumber;
    }

    public void setGoodsNumber(Float goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    public Float getPicisl() {
        return picisl;
    }

    public void setPicisl(Float picisl) {
        this.picisl = picisl;
    }

    public Float getMaxweight() {
        return maxweight;
    }

    public void setMaxweight(Float maxweight) {
        this.maxweight = maxweight;
    }

    public Float getMaxvolumn() {
        return maxvolumn;
    }

    public void setMaxvolumn(Float maxvolumn) {
        this.maxvolumn = maxvolumn;
    }

    public Integer getIsused() {
        return isused;
    }

    public void setIsused(Integer isused) {
        this.isused = isused;
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

    public Integer getColumncount() {
        return columncount;
    }

    public void setColumncount(Integer columncount) {
        this.columncount = columncount;
    }

    public String getAreaname() {
        return areaname;
    }

    public void setAreaname(String areaname) {
        this.areaname = areaname == null ? null : areaname.trim();
    }

    public String getLocationname() {
        return locationname;
    }

    public void setLocationname(String locationname) {
        this.locationname = locationname == null ? null : locationname.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}
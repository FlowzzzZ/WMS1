package cn.hhu.ssm.po;

import java.util.Date;

public class WmsStockcount {
    private Integer stockcountsId;

    private String stockcountsNumber;

    private Integer goodsId;

    private String goodsNumber;

    private String goodsname;

    private Date failuredate;

    private Date warndate;

    private String batchnumber;

    private String conversionrate;

    private Float lockedNumber;

    private Float stockcount;

    private Float abledgoods;

    private Float warnstock;

    private String remark;

    public Integer getStockcountsId() {
        return stockcountsId;
    }

    public void setStockcountsId(Integer stockcountsId) {
        this.stockcountsId = stockcountsId;
    }

    public String getStockcountsNumber() {
        return stockcountsNumber;
    }

    public void setStockcountsNumber(String stockcountsNumber) {
        this.stockcountsNumber = stockcountsNumber == null ? null : stockcountsNumber.trim();
    }

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

    public Date getFailuredate() {
        return failuredate;
    }

    public void setFailuredate(Date failuredate) {
        this.failuredate = failuredate;
    }

    public Date getWarndate() {
        return warndate;
    }

    public void setWarndate(Date warndate) {
        this.warndate = warndate;
    }

    public String getBatchnumber() {
        return batchnumber;
    }

    public void setBatchnumber(String batchnumber) {
        this.batchnumber = batchnumber == null ? null : batchnumber.trim();
    }

    public String getConversionrate() {
        return conversionrate;
    }

    public void setConversionrate(String conversionrate) {
        this.conversionrate = conversionrate == null ? null : conversionrate.trim();
    }

    public Float getLockedNumber() {
        return lockedNumber;
    }

    public void setLockedNumber(Float lockedNumber) {
        this.lockedNumber = lockedNumber;
    }

    public Float getStockcount() {
        return stockcount;
    }

    public void setStockcount(Float stockcount) {
        this.stockcount = stockcount;
    }

    public Float getAbledgoods() {
        return abledgoods;
    }

    public void setAbledgoods(Float abledgoods) {
        this.abledgoods = abledgoods;
    }

    public Float getWarnstock() {
        return warnstock;
    }

    public void setWarnstock(Float warnstock) {
        this.warnstock = warnstock;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}
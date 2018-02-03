package cn.hhu.ssm.po;

import java.util.Date;

public class WmsImhitshelveslist {
    private Integer imhitshelveslistsId;

    private String imhitshelveslistsNumber;

    private Integer goodsId;

    private Integer locationsId;

    private String goodsname;

    private String registration;

    private String specifiationtype;

    private String batchnumber;

    private String secondbatchnumber;

    private Integer serialnumberId;

    private Date producedate;

    private Date failuredate;

    private Integer number;

    private Integer count;

    private Float conversionrate;

    private Float hitshelvesnumber;

    private Float hitshelvescount;

    private String locationname;

    private String hitshelvesman;

    private String hitshelvesremark;

    private Date hitshelvesdate;

    private String remark;

    public Integer getImhitshelveslistsId() {
        return imhitshelveslistsId;
    }

    public void setImhitshelveslistsId(Integer imhitshelveslistsId) {
        this.imhitshelveslistsId = imhitshelveslistsId;
    }

    public String getImhitshelveslistsNumber() {
        return imhitshelveslistsNumber;
    }

    public void setImhitshelveslistsNumber(String imhitshelveslistsNumber) {
        this.imhitshelveslistsNumber = imhitshelveslistsNumber == null ? null : imhitshelveslistsNumber.trim();
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getLocationsId() {
        return locationsId;
    }

    public void setLocationsId(Integer locationsId) {
        this.locationsId = locationsId;
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

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Float getConversionrate() {
        return conversionrate;
    }

    public void setConversionrate(Float conversionrate) {
        this.conversionrate = conversionrate;
    }

    public Float getHitshelvesnumber() {
        return hitshelvesnumber;
    }

    public void setHitshelvesnumber(Float hitshelvesnumber) {
        this.hitshelvesnumber = hitshelvesnumber;
    }

    public Float getHitshelvescount() {
        return hitshelvescount;
    }

    public void setHitshelvescount(Float hitshelvescount) {
        this.hitshelvescount = hitshelvescount;
    }

    public String getLocationname() {
        return locationname;
    }

    public void setLocationname(String locationname) {
        this.locationname = locationname == null ? null : locationname.trim();
    }

    public String getHitshelvesman() {
        return hitshelvesman;
    }

    public void setHitshelvesman(String hitshelvesman) {
        this.hitshelvesman = hitshelvesman == null ? null : hitshelvesman.trim();
    }

    public String getHitshelvesremark() {
        return hitshelvesremark;
    }

    public void setHitshelvesremark(String hitshelvesremark) {
        this.hitshelvesremark = hitshelvesremark == null ? null : hitshelvesremark.trim();
    }

    public Date getHitshelvesdate() {
        return hitshelvesdate;
    }

    public void setHitshelvesdate(Date hitshelvesdate) {
        this.hitshelvesdate = hitshelvesdate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}
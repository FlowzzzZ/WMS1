package cn.hhu.ssm.po;

import java.util.Date;

public class WmsReceivingrecords {
    private Integer receivingrecordsId;

    private String receivingrecordsNumber;

    private Integer imorderId;

    private String shippername;

    private String registration;

    private String specifiationtype;

    private String batchnumber;

    private Date producedate;

    private Date failuredate;

    private Float arrivedgoodsnumber;

    private Date imdate;

    private String storagerequirement;

    private String suppliername;

    private String countnumber;

    private String locationname;

    private String arrivedgoodsman;

    private String hitshelvesman;

    private String remark;

    private String routetemperature;

    private String recordtemperature;

    public Integer getReceivingrecordsId() {
        return receivingrecordsId;
    }

    public void setReceivingrecordsId(Integer receivingrecordsId) {
        this.receivingrecordsId = receivingrecordsId;
    }

    public String getReceivingrecordsNumber() {
        return receivingrecordsNumber;
    }

    public void setReceivingrecordsNumber(String receivingrecordsNumber) {
        this.receivingrecordsNumber = receivingrecordsNumber == null ? null : receivingrecordsNumber.trim();
    }

    public Integer getImorderId() {
        return imorderId;
    }

    public void setImorderId(Integer imorderId) {
        this.imorderId = imorderId;
    }

    public String getShippername() {
        return shippername;
    }

    public void setShippername(String shippername) {
        this.shippername = shippername == null ? null : shippername.trim();
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

    public Float getArrivedgoodsnumber() {
        return arrivedgoodsnumber;
    }

    public void setArrivedgoodsnumber(Float arrivedgoodsnumber) {
        this.arrivedgoodsnumber = arrivedgoodsnumber;
    }

    public Date getImdate() {
        return imdate;
    }

    public void setImdate(Date imdate) {
        this.imdate = imdate;
    }

    public String getStoragerequirement() {
        return storagerequirement;
    }

    public void setStoragerequirement(String storagerequirement) {
        this.storagerequirement = storagerequirement == null ? null : storagerequirement.trim();
    }

    public String getSuppliername() {
        return suppliername;
    }

    public void setSuppliername(String suppliername) {
        this.suppliername = suppliername == null ? null : suppliername.trim();
    }

    public String getCountnumber() {
        return countnumber;
    }

    public void setCountnumber(String countnumber) {
        this.countnumber = countnumber == null ? null : countnumber.trim();
    }

    public String getLocationname() {
        return locationname;
    }

    public void setLocationname(String locationname) {
        this.locationname = locationname == null ? null : locationname.trim();
    }

    public String getArrivedgoodsman() {
        return arrivedgoodsman;
    }

    public void setArrivedgoodsman(String arrivedgoodsman) {
        this.arrivedgoodsman = arrivedgoodsman == null ? null : arrivedgoodsman.trim();
    }

    public String getHitshelvesman() {
        return hitshelvesman;
    }

    public void setHitshelvesman(String hitshelvesman) {
        this.hitshelvesman = hitshelvesman == null ? null : hitshelvesman.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getRoutetemperature() {
        return routetemperature;
    }

    public void setRoutetemperature(String routetemperature) {
        this.routetemperature = routetemperature == null ? null : routetemperature.trim();
    }

    public String getRecordtemperature() {
        return recordtemperature;
    }

    public void setRecordtemperature(String recordtemperature) {
        this.recordtemperature = recordtemperature == null ? null : recordtemperature.trim();
    }
}
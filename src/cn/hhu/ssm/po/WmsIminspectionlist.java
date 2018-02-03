package cn.hhu.ssm.po;

import java.util.Date;

public class WmsIminspectionlist {
    private Integer iminspectionlistsId;

    private String iminspectionlistsNumber;

    private Integer goodsId;

    private String goodsname;

    private String registration;

    private String specifiationtype;

    private String batchnumber;

    private String secondbatchnumber;

    private Integer serialnumberId;

    private Date producedate;

    private Date failuredate;

    private Float number;

    private String factory;

    private String origin;

    private Float inspectionNumber;

    private String inspectionresult;

    private String inspectionman;

    private String inspectionremark;

    private Date inspectiondate;

    private Float inspectioncount;

    private String inspectionreport;

    private String remark;

    public Integer getIminspectionlistsId() {
        return iminspectionlistsId;
    }

    public void setIminspectionlistsId(Integer iminspectionlistsId) {
        this.iminspectionlistsId = iminspectionlistsId;
    }

    public String getIminspectionlistsNumber() {
        return iminspectionlistsNumber;
    }

    public void setIminspectionlistsNumber(String iminspectionlistsNumber) {
        this.iminspectionlistsNumber = iminspectionlistsNumber == null ? null : iminspectionlistsNumber.trim();
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

    public Float getNumber() {
        return number;
    }

    public void setNumber(Float number) {
        this.number = number;
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

    public Float getInspectionNumber() {
        return inspectionNumber;
    }

    public void setInspectionNumber(Float inspectionNumber) {
        this.inspectionNumber = inspectionNumber;
    }

    public String getInspectionresult() {
        return inspectionresult;
    }

    public void setInspectionresult(String inspectionresult) {
        this.inspectionresult = inspectionresult == null ? null : inspectionresult.trim();
    }

    public String getInspectionman() {
        return inspectionman;
    }

    public void setInspectionman(String inspectionman) {
        this.inspectionman = inspectionman == null ? null : inspectionman.trim();
    }

    public String getInspectionremark() {
        return inspectionremark;
    }

    public void setInspectionremark(String inspectionremark) {
        this.inspectionremark = inspectionremark == null ? null : inspectionremark.trim();
    }

    public Date getInspectiondate() {
        return inspectiondate;
    }

    public void setInspectiondate(Date inspectiondate) {
        this.inspectiondate = inspectiondate;
    }

    public Float getInspectioncount() {
        return inspectioncount;
    }

    public void setInspectioncount(Float inspectioncount) {
        this.inspectioncount = inspectioncount;
    }

    public String getInspectionreport() {
        return inspectionreport;
    }

    public void setInspectionreport(String inspectionreport) {
        this.inspectionreport = inspectionreport == null ? null : inspectionreport.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}
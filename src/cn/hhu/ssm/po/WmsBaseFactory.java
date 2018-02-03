package cn.hhu.ssm.po;

import java.util.Date;

public class WmsBaseFactory {
    private Integer factoryId;

    private String factoryNumber;

    private String factoryname;

    private String businesslicenseNumber;

    private Date businesslicensevalidity;

    private String businesslicensepicture;

    private String productionpermitNumber;

    private Date productionpermitvalidity;

    private String productionpermitpicture;

    private Integer firstbusiness;

    private String remark;

    private Date makeorderdate;

    private Integer makeorderman;

    private Boolean isdeleted;

    private Boolean isreview;

    private Boolean cooperationstatus;

    private String factoryaddress;

    private String produceaddress;

    private String recordnumber;

    private Date recordvalidity;

    private Date recordapprovedate;

    private String recordissuingauthority;

    private String recordpicture;

    private Date certificateapprovedate;

    private String certificateissuingauthority;

    private String certificaterange;

    private String certificaterangenumber;

    public Integer getFactoryId() {
        return factoryId;
    }

    public void setFactoryId(Integer factoryId) {
        this.factoryId = factoryId;
    }

    public String getFactoryNumber() {
        return factoryNumber;
    }

    public void setFactoryNumber(String factoryNumber) {
        this.factoryNumber = factoryNumber == null ? null : factoryNumber.trim();
    }

    public String getFactoryname() {
        return factoryname;
    }

    public void setFactoryname(String factoryname) {
        this.factoryname = factoryname == null ? null : factoryname.trim();
    }

    public String getBusinesslicenseNumber() {
        return businesslicenseNumber;
    }

    public void setBusinesslicenseNumber(String businesslicenseNumber) {
        this.businesslicenseNumber = businesslicenseNumber == null ? null : businesslicenseNumber.trim();
    }

    public Date getBusinesslicensevalidity() {
        return businesslicensevalidity;
    }

    public void setBusinesslicensevalidity(Date businesslicensevalidity) {
        this.businesslicensevalidity = businesslicensevalidity;
    }

    public String getBusinesslicensepicture() {
        return businesslicensepicture;
    }

    public void setBusinesslicensepicture(String businesslicensepicture) {
        this.businesslicensepicture = businesslicensepicture == null ? null : businesslicensepicture.trim();
    }

    public String getProductionpermitNumber() {
        return productionpermitNumber;
    }

    public void setProductionpermitNumber(String productionpermitNumber) {
        this.productionpermitNumber = productionpermitNumber == null ? null : productionpermitNumber.trim();
    }

    public Date getProductionpermitvalidity() {
        return productionpermitvalidity;
    }

    public void setProductionpermitvalidity(Date productionpermitvalidity) {
        this.productionpermitvalidity = productionpermitvalidity;
    }

    public String getProductionpermitpicture() {
        return productionpermitpicture;
    }

    public void setProductionpermitpicture(String productionpermitpicture) {
        this.productionpermitpicture = productionpermitpicture == null ? null : productionpermitpicture.trim();
    }

    public Integer getFirstbusiness() {
        return firstbusiness;
    }

    public void setFirstbusiness(Integer firstbusiness) {
        this.firstbusiness = firstbusiness;
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

    public Boolean getIsdeleted() {
        return isdeleted;
    }

    public void setIsdeleted(Boolean isdeleted) {
        this.isdeleted = isdeleted;
    }

    public Boolean getIsreview() {
        return isreview;
    }

    public void setIsreview(Boolean isreview) {
        this.isreview = isreview;
    }

    public Boolean getCooperationstatus() {
        return cooperationstatus;
    }

    public void setCooperationstatus(Boolean cooperationstatus) {
        this.cooperationstatus = cooperationstatus;
    }

    public String getFactoryaddress() {
        return factoryaddress;
    }

    public void setFactoryaddress(String factoryaddress) {
        this.factoryaddress = factoryaddress == null ? null : factoryaddress.trim();
    }

    public String getProduceaddress() {
        return produceaddress;
    }

    public void setProduceaddress(String produceaddress) {
        this.produceaddress = produceaddress == null ? null : produceaddress.trim();
    }

    public String getRecordnumber() {
        return recordnumber;
    }

    public void setRecordnumber(String recordnumber) {
        this.recordnumber = recordnumber == null ? null : recordnumber.trim();
    }

    public Date getRecordvalidity() {
        return recordvalidity;
    }

    public void setRecordvalidity(Date recordvalidity) {
        this.recordvalidity = recordvalidity;
    }

    public Date getRecordapprovedate() {
        return recordapprovedate;
    }

    public void setRecordapprovedate(Date recordapprovedate) {
        this.recordapprovedate = recordapprovedate;
    }

    public String getRecordissuingauthority() {
        return recordissuingauthority;
    }

    public void setRecordissuingauthority(String recordissuingauthority) {
        this.recordissuingauthority = recordissuingauthority == null ? null : recordissuingauthority.trim();
    }

    public String getRecordpicture() {
        return recordpicture;
    }

    public void setRecordpicture(String recordpicture) {
        this.recordpicture = recordpicture == null ? null : recordpicture.trim();
    }

    public Date getCertificateapprovedate() {
        return certificateapprovedate;
    }

    public void setCertificateapprovedate(Date certificateapprovedate) {
        this.certificateapprovedate = certificateapprovedate;
    }

    public String getCertificateissuingauthority() {
        return certificateissuingauthority;
    }

    public void setCertificateissuingauthority(String certificateissuingauthority) {
        this.certificateissuingauthority = certificateissuingauthority == null ? null : certificateissuingauthority.trim();
    }

    public String getCertificaterange() {
        return certificaterange;
    }

    public void setCertificaterange(String certificaterange) {
        this.certificaterange = certificaterange == null ? null : certificaterange.trim();
    }

    public String getCertificaterangenumber() {
        return certificaterangenumber;
    }

    public void setCertificaterangenumber(String certificaterangenumber) {
        this.certificaterangenumber = certificaterangenumber == null ? null : certificaterangenumber.trim();
    }
}
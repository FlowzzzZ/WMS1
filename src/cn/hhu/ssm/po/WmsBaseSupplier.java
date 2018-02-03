package cn.hhu.ssm.po;

import java.util.Date;

public class WmsBaseSupplier {
    private Integer supplierId;

    private String supplierNumber;

    private String suppliercode;

    private String suppliername;

    private String businesslicensenumber;

    private Date businesslicensevalidity;

    private String businesslicensepicture;

    private String businesscertificatenumber;

    private Date businesscertificatevalidity;

    private String businesscertificatepicture;

    private String businessscope;

    private String businessscopecode;

    private Integer firstbusiness;

    private Date makeorderdate;

    private Integer makeorderman;

    private Integer isreview;

    private Integer cooperationstatus;

    private String recordnumber;

    private Date recordvalidity;

    private Date recordapprovedate;

    private String recordissuingauthority;

    private String recordpicture;

    private Date certificateapprovedate;

    private String certificateissuingauthority;

    private Integer suppliertype;

    private String productioncertificatenumber;

    private Date productioncertificatevalidity;

    private String productioncertificationpicture;

    private String productionscope;

    private String productionscopecode;

    private String productionaddress;

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupplierNumber() {
        return supplierNumber;
    }

    public void setSupplierNumber(String supplierNumber) {
        this.supplierNumber = supplierNumber == null ? null : supplierNumber.trim();
    }

    public String getSuppliercode() {
        return suppliercode;
    }

    public void setSuppliercode(String suppliercode) {
        this.suppliercode = suppliercode == null ? null : suppliercode.trim();
    }

    public String getSuppliername() {
        return suppliername;
    }

    public void setSuppliername(String suppliername) {
        this.suppliername = suppliername == null ? null : suppliername.trim();
    }

    public String getBusinesslicensenumber() {
        return businesslicensenumber;
    }

    public void setBusinesslicensenumber(String businesslicensenumber) {
        this.businesslicensenumber = businesslicensenumber == null ? null : businesslicensenumber.trim();
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

    public String getBusinesscertificatenumber() {
        return businesscertificatenumber;
    }

    public void setBusinesscertificatenumber(String businesscertificatenumber) {
        this.businesscertificatenumber = businesscertificatenumber == null ? null : businesscertificatenumber.trim();
    }

    public Date getBusinesscertificatevalidity() {
        return businesscertificatevalidity;
    }

    public void setBusinesscertificatevalidity(Date businesscertificatevalidity) {
        this.businesscertificatevalidity = businesscertificatevalidity;
    }

    public String getBusinesscertificatepicture() {
        return businesscertificatepicture;
    }

    public void setBusinesscertificatepicture(String businesscertificatepicture) {
        this.businesscertificatepicture = businesscertificatepicture == null ? null : businesscertificatepicture.trim();
    }

    public String getBusinessscope() {
        return businessscope;
    }

    public void setBusinessscope(String businessscope) {
        this.businessscope = businessscope == null ? null : businessscope.trim();
    }

    public String getBusinessscopecode() {
        return businessscopecode;
    }

    public void setBusinessscopecode(String businessscopecode) {
        this.businessscopecode = businessscopecode == null ? null : businessscopecode.trim();
    }

    public Integer getFirstbusiness() {
        return firstbusiness;
    }

    public void setFirstbusiness(Integer firstbusiness) {
        this.firstbusiness = firstbusiness;
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

    public Integer getIsreview() {
        return isreview;
    }

    public void setIsreview(Integer isreview) {
        this.isreview = isreview;
    }

    public Integer getCooperationstatus() {
        return cooperationstatus;
    }

    public void setCooperationstatus(Integer cooperationstatus) {
        this.cooperationstatus = cooperationstatus;
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

    public Integer getSuppliertype() {
        return suppliertype;
    }

    public void setSuppliertype(Integer suppliertype) {
        this.suppliertype = suppliertype;
    }

    public String getProductioncertificatenumber() {
        return productioncertificatenumber;
    }

    public void setProductioncertificatenumber(String productioncertificatenumber) {
        this.productioncertificatenumber = productioncertificatenumber == null ? null : productioncertificatenumber.trim();
    }

    public Date getProductioncertificatevalidity() {
        return productioncertificatevalidity;
    }

    public void setProductioncertificatevalidity(Date productioncertificatevalidity) {
        this.productioncertificatevalidity = productioncertificatevalidity;
    }

    public String getProductioncertificationpicture() {
        return productioncertificationpicture;
    }

    public void setProductioncertificationpicture(String productioncertificationpicture) {
        this.productioncertificationpicture = productioncertificationpicture == null ? null : productioncertificationpicture.trim();
    }

    public String getProductionscope() {
        return productionscope;
    }

    public void setProductionscope(String productionscope) {
        this.productionscope = productionscope == null ? null : productionscope.trim();
    }

    public String getProductionscopecode() {
        return productionscopecode;
    }

    public void setProductionscopecode(String productionscopecode) {
        this.productionscopecode = productionscopecode == null ? null : productionscopecode.trim();
    }

    public String getProductionaddress() {
        return productionaddress;
    }

    public void setProductionaddress(String productionaddress) {
        this.productionaddress = productionaddress == null ? null : productionaddress.trim();
    }
}
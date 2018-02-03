package cn.hhu.ssm.po;

import java.util.Date;

public class WmsBaseReceivingunit {
    private Integer shipperId;

    private String shipperNumber;

    private String unitname;

    private String businesslicenseNumber;

    private Date businesslicensevalidity;

    private String businesslicensephoto;

    private String businessallowNumber;

    private Date businessallowvalidity;

    private String businessallowphoto;

    private Integer firstbusiness;

    private Date makeorderdate;

    private Integer makeorderman;

    private Boolean isdeleted;

    private Boolean isreview;

    private Boolean cooperationstatus;

    private String businessscope;

    private String businessscopecode;

    private String businessarea;

    private String recordnumber;

    private Date recordvalidity;

    private Date recordapprovedate;

    private String recordissuingauthority;

    private String recordpicture;

    private Date certificateapprovedate;

    private String certificateissuingauthority;

    private String companyaddress;

    private String toaddress;

    private String contactman;

    private String contacttel;

    private String remark;

    public Integer getShipperId() {
        return shipperId;
    }

    public void setShipperId(Integer shipperId) {
        this.shipperId = shipperId;
    }

    public String getShipperNumber() {
        return shipperNumber;
    }

    public void setShipperNumber(String shipperNumber) {
        this.shipperNumber = shipperNumber == null ? null : shipperNumber.trim();
    }

    public String getUnitname() {
        return unitname;
    }

    public void setUnitname(String unitname) {
        this.unitname = unitname == null ? null : unitname.trim();
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

    public String getBusinesslicensephoto() {
        return businesslicensephoto;
    }

    public void setBusinesslicensephoto(String businesslicensephoto) {
        this.businesslicensephoto = businesslicensephoto == null ? null : businesslicensephoto.trim();
    }

    public String getBusinessallowNumber() {
        return businessallowNumber;
    }

    public void setBusinessallowNumber(String businessallowNumber) {
        this.businessallowNumber = businessallowNumber == null ? null : businessallowNumber.trim();
    }

    public Date getBusinessallowvalidity() {
        return businessallowvalidity;
    }

    public void setBusinessallowvalidity(Date businessallowvalidity) {
        this.businessallowvalidity = businessallowvalidity;
    }

    public String getBusinessallowphoto() {
        return businessallowphoto;
    }

    public void setBusinessallowphoto(String businessallowphoto) {
        this.businessallowphoto = businessallowphoto == null ? null : businessallowphoto.trim();
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

    public String getBusinessarea() {
        return businessarea;
    }

    public void setBusinessarea(String businessarea) {
        this.businessarea = businessarea == null ? null : businessarea.trim();
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

    public String getCompanyaddress() {
        return companyaddress;
    }

    public void setCompanyaddress(String companyaddress) {
        this.companyaddress = companyaddress == null ? null : companyaddress.trim();
    }

    public String getToaddress() {
        return toaddress;
    }

    public void setToaddress(String toaddress) {
        this.toaddress = toaddress == null ? null : toaddress.trim();
    }

    public String getContactman() {
        return contactman;
    }

    public void setContactman(String contactman) {
        this.contactman = contactman == null ? null : contactman.trim();
    }

    public String getContacttel() {
        return contacttel;
    }

    public void setContacttel(String contacttel) {
        this.contacttel = contacttel == null ? null : contacttel.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}
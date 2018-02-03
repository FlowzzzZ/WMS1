package cn.hhu.ssm.po;

import java.util.Date;

public class WmsBaseShipper {
    private Integer clientId;

    private String clientNumber;

    private String clientabbreviation;

    private String clientname;

    private Integer clienttype;

    private String contractId;

    private String businesslicenseId;

    private Date businesslicenseeffectivedate;

    private String businesslicenseimage;

    private String organizationId;

    private Date organizationeffectivedate;

    private String organizationimage;

    private String taxregistrationId;

    private Date taxregistrationeffectivedate;

    private String taxregistrationimage;

    private String businessokId;

    private Date businessokeffectivedate;

    private String businessokimage;

    private String businessscope;

    private String businessscopecode;

    private String productionpermitNumber;

    private Date bppermitvalidity;

    private String productionpermitpicture;

    private String certificaterange;

    private String certificaterangenumber;

    private String produceaddress;

    private String contractman;

    private String contacttel;

    private String remark;

    private Integer firstbusiness;

    private Date makeorderdate;

    private Integer makeorderman;

    private Boolean isdeleted;

    private Boolean isreview;

    private Boolean cooperationstatus;

    private String recordnumber;

    private Date recordeffectivedate;

    private Date recordapprovaldate;

    private String issuerecordorgan;

    private String recordimage;

    private Date allowapprovaldate;

    private String allowapprovalorgan;

    private String registereaddress;

    private String businessaddress;

    private String storehousesaddress;

    private Integer entrustcontent;

    private Date entruststartdate;

    private Date entrustenddate;

    private Integer entrustqx;

    private Boolean ischineselabel;

    private String contractdocuments;

    private String legalrepresentative;

    private String businessowner;

    private Boolean is3to1;

    private Integer remindingtime;

    private Integer selectionstrategy;

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public String getClientNumber() {
        return clientNumber;
    }

    public void setClientNumber(String clientNumber) {
        this.clientNumber = clientNumber == null ? null : clientNumber.trim();
    }

    public String getClientabbreviation() {
        return clientabbreviation;
    }

    public void setClientabbreviation(String clientabbreviation) {
        this.clientabbreviation = clientabbreviation == null ? null : clientabbreviation.trim();
    }

    public String getClientname() {
        return clientname;
    }

    public void setClientname(String clientname) {
        this.clientname = clientname == null ? null : clientname.trim();
    }

    public Integer getClienttype() {
        return clienttype;
    }

    public void setClienttype(Integer clienttype) {
        this.clienttype = clienttype;
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId == null ? null : contractId.trim();
    }

    public String getBusinesslicenseId() {
        return businesslicenseId;
    }

    public void setBusinesslicenseId(String businesslicenseId) {
        this.businesslicenseId = businesslicenseId == null ? null : businesslicenseId.trim();
    }

    public Date getBusinesslicenseeffectivedate() {
        return businesslicenseeffectivedate;
    }

    public void setBusinesslicenseeffectivedate(Date businesslicenseeffectivedate) {
        this.businesslicenseeffectivedate = businesslicenseeffectivedate;
    }

    public String getBusinesslicenseimage() {
        return businesslicenseimage;
    }

    public void setBusinesslicenseimage(String businesslicenseimage) {
        this.businesslicenseimage = businesslicenseimage == null ? null : businesslicenseimage.trim();
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId == null ? null : organizationId.trim();
    }

    public Date getOrganizationeffectivedate() {
        return organizationeffectivedate;
    }

    public void setOrganizationeffectivedate(Date organizationeffectivedate) {
        this.organizationeffectivedate = organizationeffectivedate;
    }

    public String getOrganizationimage() {
        return organizationimage;
    }

    public void setOrganizationimage(String organizationimage) {
        this.organizationimage = organizationimage == null ? null : organizationimage.trim();
    }

    public String getTaxregistrationId() {
        return taxregistrationId;
    }

    public void setTaxregistrationId(String taxregistrationId) {
        this.taxregistrationId = taxregistrationId == null ? null : taxregistrationId.trim();
    }

    public Date getTaxregistrationeffectivedate() {
        return taxregistrationeffectivedate;
    }

    public void setTaxregistrationeffectivedate(Date taxregistrationeffectivedate) {
        this.taxregistrationeffectivedate = taxregistrationeffectivedate;
    }

    public String getTaxregistrationimage() {
        return taxregistrationimage;
    }

    public void setTaxregistrationimage(String taxregistrationimage) {
        this.taxregistrationimage = taxregistrationimage == null ? null : taxregistrationimage.trim();
    }

    public String getBusinessokId() {
        return businessokId;
    }

    public void setBusinessokId(String businessokId) {
        this.businessokId = businessokId == null ? null : businessokId.trim();
    }

    public Date getBusinessokeffectivedate() {
        return businessokeffectivedate;
    }

    public void setBusinessokeffectivedate(Date businessokeffectivedate) {
        this.businessokeffectivedate = businessokeffectivedate;
    }

    public String getBusinessokimage() {
        return businessokimage;
    }

    public void setBusinessokimage(String businessokimage) {
        this.businessokimage = businessokimage == null ? null : businessokimage.trim();
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

    public String getProductionpermitNumber() {
        return productionpermitNumber;
    }

    public void setProductionpermitNumber(String productionpermitNumber) {
        this.productionpermitNumber = productionpermitNumber == null ? null : productionpermitNumber.trim();
    }

    public Date getBppermitvalidity() {
        return bppermitvalidity;
    }

    public void setBppermitvalidity(Date bppermitvalidity) {
        this.bppermitvalidity = bppermitvalidity;
    }

    public String getProductionpermitpicture() {
        return productionpermitpicture;
    }

    public void setProductionpermitpicture(String productionpermitpicture) {
        this.productionpermitpicture = productionpermitpicture == null ? null : productionpermitpicture.trim();
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

    public String getProduceaddress() {
        return produceaddress;
    }

    public void setProduceaddress(String produceaddress) {
        this.produceaddress = produceaddress == null ? null : produceaddress.trim();
    }

    public String getContractman() {
        return contractman;
    }

    public void setContractman(String contractman) {
        this.contractman = contractman == null ? null : contractman.trim();
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

    public String getRecordnumber() {
        return recordnumber;
    }

    public void setRecordnumber(String recordnumber) {
        this.recordnumber = recordnumber == null ? null : recordnumber.trim();
    }

    public Date getRecordeffectivedate() {
        return recordeffectivedate;
    }

    public void setRecordeffectivedate(Date recordeffectivedate) {
        this.recordeffectivedate = recordeffectivedate;
    }

    public Date getRecordapprovaldate() {
        return recordapprovaldate;
    }

    public void setRecordapprovaldate(Date recordapprovaldate) {
        this.recordapprovaldate = recordapprovaldate;
    }

    public String getIssuerecordorgan() {
        return issuerecordorgan;
    }

    public void setIssuerecordorgan(String issuerecordorgan) {
        this.issuerecordorgan = issuerecordorgan == null ? null : issuerecordorgan.trim();
    }

    public String getRecordimage() {
        return recordimage;
    }

    public void setRecordimage(String recordimage) {
        this.recordimage = recordimage == null ? null : recordimage.trim();
    }

    public Date getAllowapprovaldate() {
        return allowapprovaldate;
    }

    public void setAllowapprovaldate(Date allowapprovaldate) {
        this.allowapprovaldate = allowapprovaldate;
    }

    public String getAllowapprovalorgan() {
        return allowapprovalorgan;
    }

    public void setAllowapprovalorgan(String allowapprovalorgan) {
        this.allowapprovalorgan = allowapprovalorgan == null ? null : allowapprovalorgan.trim();
    }

    public String getRegistereaddress() {
        return registereaddress;
    }

    public void setRegistereaddress(String registereaddress) {
        this.registereaddress = registereaddress == null ? null : registereaddress.trim();
    }

    public String getBusinessaddress() {
        return businessaddress;
    }

    public void setBusinessaddress(String businessaddress) {
        this.businessaddress = businessaddress == null ? null : businessaddress.trim();
    }

    public String getStorehousesaddress() {
        return storehousesaddress;
    }

    public void setStorehousesaddress(String storehousesaddress) {
        this.storehousesaddress = storehousesaddress == null ? null : storehousesaddress.trim();
    }

    public Integer getEntrustcontent() {
        return entrustcontent;
    }

    public void setEntrustcontent(Integer entrustcontent) {
        this.entrustcontent = entrustcontent;
    }

    public Date getEntruststartdate() {
        return entruststartdate;
    }

    public void setEntruststartdate(Date entruststartdate) {
        this.entruststartdate = entruststartdate;
    }

    public Date getEntrustenddate() {
        return entrustenddate;
    }

    public void setEntrustenddate(Date entrustenddate) {
        this.entrustenddate = entrustenddate;
    }

    public Integer getEntrustqx() {
        return entrustqx;
    }

    public void setEntrustqx(Integer entrustqx) {
        this.entrustqx = entrustqx;
    }

    public Boolean getIschineselabel() {
        return ischineselabel;
    }

    public void setIschineselabel(Boolean ischineselabel) {
        this.ischineselabel = ischineselabel;
    }

    public String getContractdocuments() {
        return contractdocuments;
    }

    public void setContractdocuments(String contractdocuments) {
        this.contractdocuments = contractdocuments == null ? null : contractdocuments.trim();
    }

    public String getLegalrepresentative() {
        return legalrepresentative;
    }

    public void setLegalrepresentative(String legalrepresentative) {
        this.legalrepresentative = legalrepresentative == null ? null : legalrepresentative.trim();
    }

    public String getBusinessowner() {
        return businessowner;
    }

    public void setBusinessowner(String businessowner) {
        this.businessowner = businessowner == null ? null : businessowner.trim();
    }

    public Boolean getIs3to1() {
        return is3to1;
    }

    public void setIs3to1(Boolean is3to1) {
        this.is3to1 = is3to1;
    }

    public Integer getRemindingtime() {
        return remindingtime;
    }

    public void setRemindingtime(Integer remindingtime) {
        this.remindingtime = remindingtime;
    }

    public Integer getSelectionstrategy() {
        return selectionstrategy;
    }

    public void setSelectionstrategy(Integer selectionstrategy) {
        this.selectionstrategy = selectionstrategy;
    }
}
package cn.hhu.ssm.po;

import java.util.Date;

public class WmsImorder {
    private Integer imorderId;

    private String imorderNumber;

    private Integer shipperId;

    private String implanId;

    private Integer infosource;

    private Integer supplierId;

    private String fromaddress;

    private String toaddress;

    private Integer businesstype;

    private Date imdate;

    private Integer isbonded;

    private Integer issupervision;

    private Integer isacceptance;

    private String storagetransportationrequirement;

    private String customerNumber;

    private String contractman;

    private String contacttel;

    private String imbarcode;

    private Integer imstatus;

    private String placementarea;

    private Integer consignee;

    private String remark;

    private Date makeorderdate;

    private Integer makeorderman;

    private Integer isdeleted;

    private Integer directreceptgood;

    private Integer storehouseId;

    private Integer serviceId;

    public Integer getImorderId() {
        return imorderId;
    }

    public void setImorderId(Integer imorderId) {
        this.imorderId = imorderId;
    }

    public String getImorderNumber() {
        return imorderNumber;
    }

    public void setImorderNumber(String imorderNumber) {
        this.imorderNumber = imorderNumber == null ? null : imorderNumber.trim();
    }

    public Integer getShipperId() {
        return shipperId;
    }

    public void setShipperId(Integer shipperId) {
        this.shipperId = shipperId;
    }

    public String getImplanId() {
        return implanId;
    }

    public void setImplanId(String implanId) {
        this.implanId = implanId == null ? null : implanId.trim();
    }

    public Integer getInfosource() {
        return infosource;
    }

    public void setInfosource(Integer infosource) {
        this.infosource = infosource;
    }

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public String getFromaddress() {
        return fromaddress;
    }

    public void setFromaddress(String fromaddress) {
        this.fromaddress = fromaddress == null ? null : fromaddress.trim();
    }

    public String getToaddress() {
        return toaddress;
    }

    public void setToaddress(String toaddress) {
        this.toaddress = toaddress == null ? null : toaddress.trim();
    }

    public Integer getBusinesstype() {
        return businesstype;
    }

    public void setBusinesstype(Integer businesstype) {
        this.businesstype = businesstype;
    }

    public Date getImdate() {
        return imdate;
    }

    public void setImdate(Date imdate) {
        this.imdate = imdate;
    }

    public Integer getIsbonded() {
        return isbonded;
    }

    public void setIsbonded(Integer isbonded) {
        this.isbonded = isbonded;
    }

    public Integer getIssupervision() {
        return issupervision;
    }

    public void setIssupervision(Integer issupervision) {
        this.issupervision = issupervision;
    }

    public Integer getIsacceptance() {
        return isacceptance;
    }

    public void setIsacceptance(Integer isacceptance) {
        this.isacceptance = isacceptance;
    }

    public String getStoragetransportationrequirement() {
        return storagetransportationrequirement;
    }

    public void setStoragetransportationrequirement(String storagetransportationrequirement) {
        this.storagetransportationrequirement = storagetransportationrequirement == null ? null : storagetransportationrequirement.trim();
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber == null ? null : customerNumber.trim();
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

    public String getImbarcode() {
        return imbarcode;
    }

    public void setImbarcode(String imbarcode) {
        this.imbarcode = imbarcode == null ? null : imbarcode.trim();
    }

    public Integer getImstatus() {
        return imstatus;
    }

    public void setImstatus(Integer imstatus) {
        this.imstatus = imstatus;
    }

    public String getPlacementarea() {
        return placementarea;
    }

    public void setPlacementarea(String placementarea) {
        this.placementarea = placementarea == null ? null : placementarea.trim();
    }

    public Integer getConsignee() {
        return consignee;
    }

    public void setConsignee(Integer consignee) {
        this.consignee = consignee;
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

    public Integer getIsdeleted() {
        return isdeleted;
    }

    public void setIsdeleted(Integer isdeleted) {
        this.isdeleted = isdeleted;
    }

    public Integer getDirectreceptgood() {
        return directreceptgood;
    }

    public void setDirectreceptgood(Integer directreceptgood) {
        this.directreceptgood = directreceptgood;
    }

    public Integer getStorehouseId() {
        return storehouseId;
    }

    public void setStorehouseId(Integer storehouseId) {
        this.storehouseId = storehouseId;
    }

    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }
}
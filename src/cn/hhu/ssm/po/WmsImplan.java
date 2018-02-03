package cn.hhu.ssm.po;

import java.util.Date;

public class WmsImplan {
    private Integer implanId;

    private String implanNumber;

    private Integer planstatus;

    private Integer shipperId;

    private String contractId;

    private Integer supplierId;

    private String fromaddress;

    private String toaddress;

    private Date imdate;

    private Integer businesstype;

    private Integer isbonded;

    private String storagetransportationrequirement;

    private Integer issupervision;

    private String customerNumber;

    private Integer serviceId;

    private String contactman;

    private String contacttel;

    private String remark;

    private Date makeorderdate;

    private Integer makeorderman;

    private Integer isdeleted;

    private Integer storehouseId;

    private Integer imorderquantity;

    public Integer getImplanId() {
        return implanId;
    }

    public void setImplanId(Integer implanId) {
        this.implanId = implanId;
    }

    public String getImplanNumber() {
        return implanNumber;
    }

    public void setImplanNumber(String implanNumber) {
        this.implanNumber = implanNumber == null ? null : implanNumber.trim();
    }

    public Integer getPlanstatus() {
        return planstatus;
    }

    public void setPlanstatus(Integer planstatus) {
        this.planstatus = planstatus;
    }

    public Integer getShipperId() {
        return shipperId;
    }

    public void setShipperId(Integer shipperId) {
        this.shipperId = shipperId;
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId == null ? null : contractId.trim();
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

    public Date getImdate() {
        return imdate;
    }

    public void setImdate(Date imdate) {
        this.imdate = imdate;
    }

    public Integer getBusinesstype() {
        return businesstype;
    }

    public void setBusinesstype(Integer businesstype) {
        this.businesstype = businesstype;
    }

    public Integer getIsbonded() {
        return isbonded;
    }

    public void setIsbonded(Integer isbonded) {
        this.isbonded = isbonded;
    }

    public String getStoragetransportationrequirement() {
        return storagetransportationrequirement;
    }

    public void setStoragetransportationrequirement(String storagetransportationrequirement) {
        this.storagetransportationrequirement = storagetransportationrequirement == null ? null : storagetransportationrequirement.trim();
    }

    public Integer getIssupervision() {
        return issupervision;
    }

    public void setIssupervision(Integer issupervision) {
        this.issupervision = issupervision;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber == null ? null : customerNumber.trim();
    }

    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
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

    public Integer getStorehouseId() {
        return storehouseId;
    }

    public void setStorehouseId(Integer storehouseId) {
        this.storehouseId = storehouseId;
    }

    public Integer getImorderquantity() {
        return imorderquantity;
    }

    public void setImorderquantity(Integer imorderquantity) {
        this.imorderquantity = imorderquantity;
    }
}
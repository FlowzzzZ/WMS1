package cn.hhu.ssm.po;

import java.util.Date;

public class WmsBaseSupplierLog {
    private Integer supplierLogid;

    private Integer supplierId;

    private String supplierPremodifiedstate;

    private String supplierModifiedstate;

    private Integer employeeId;

    private String modifyman;

    private Date modifieddate;

    public Integer getSupplierLogid() {
        return supplierLogid;
    }

    public void setSupplierLogid(Integer supplierLogid) {
        this.supplierLogid = supplierLogid;
    }

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupplierPremodifiedstate() {
        return supplierPremodifiedstate;
    }

    public void setSupplierPremodifiedstate(String supplierPremodifiedstate) {
        this.supplierPremodifiedstate = supplierPremodifiedstate == null ? null : supplierPremodifiedstate.trim();
    }

    public String getSupplierModifiedstate() {
        return supplierModifiedstate;
    }

    public void setSupplierModifiedstate(String supplierModifiedstate) {
        this.supplierModifiedstate = supplierModifiedstate == null ? null : supplierModifiedstate.trim();
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getModifyman() {
        return modifyman;
    }

    public void setModifyman(String modifyman) {
        this.modifyman = modifyman == null ? null : modifyman.trim();
    }

    public Date getModifieddate() {
        return modifieddate;
    }

    public void setModifieddate(Date modifieddate) {
        this.modifieddate = modifieddate;
    }
}
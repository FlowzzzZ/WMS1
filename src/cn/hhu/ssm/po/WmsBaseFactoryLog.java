package cn.hhu.ssm.po;

import java.util.Date;

public class WmsBaseFactoryLog {
    private Integer factoryLogid;

    private Integer factoryId;

    private String factoryPremodifiedstate;

    private String factoryModifiedstate;

    private Integer employeeId;

    private String modifyman;

    private Date modifieddate;

    public Integer getFactoryLogid() {
        return factoryLogid;
    }

    public void setFactoryLogid(Integer factoryLogid) {
        this.factoryLogid = factoryLogid;
    }

    public Integer getFactoryId() {
        return factoryId;
    }

    public void setFactoryId(Integer factoryId) {
        this.factoryId = factoryId;
    }

    public String getFactoryPremodifiedstate() {
        return factoryPremodifiedstate;
    }

    public void setFactoryPremodifiedstate(String factoryPremodifiedstate) {
        this.factoryPremodifiedstate = factoryPremodifiedstate == null ? null : factoryPremodifiedstate.trim();
    }

    public String getFactoryModifiedstate() {
        return factoryModifiedstate;
    }

    public void setFactoryModifiedstate(String factoryModifiedstate) {
        this.factoryModifiedstate = factoryModifiedstate == null ? null : factoryModifiedstate.trim();
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
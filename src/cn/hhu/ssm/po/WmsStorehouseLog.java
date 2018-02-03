package cn.hhu.ssm.po;

import java.util.Date;

public class WmsStorehouseLog {
    private Integer storehousesLogid;

    private Integer storehousesId;

    private String storehousesPremodifiedstate;

    private String storehousesModifiedstate;

    private Integer employeeId;

    private String modifyman;

    private Date modifieddate;

    public Integer getStorehousesLogid() {
        return storehousesLogid;
    }

    public void setStorehousesLogid(Integer storehousesLogid) {
        this.storehousesLogid = storehousesLogid;
    }

    public Integer getStorehousesId() {
        return storehousesId;
    }

    public void setStorehousesId(Integer storehousesId) {
        this.storehousesId = storehousesId;
    }

    public String getStorehousesPremodifiedstate() {
        return storehousesPremodifiedstate;
    }

    public void setStorehousesPremodifiedstate(String storehousesPremodifiedstate) {
        this.storehousesPremodifiedstate = storehousesPremodifiedstate == null ? null : storehousesPremodifiedstate.trim();
    }

    public String getStorehousesModifiedstate() {
        return storehousesModifiedstate;
    }

    public void setStorehousesModifiedstate(String storehousesModifiedstate) {
        this.storehousesModifiedstate = storehousesModifiedstate == null ? null : storehousesModifiedstate.trim();
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
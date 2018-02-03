package cn.hhu.ssm.po;

import java.util.Date;

public class WmsLocationLog {
    private Integer locationsLogid;

    private Integer locationsId;

    private String locationsPremodifiedstate;

    private String locationsModifiedstate;

    private Integer employeeId;

    private String modifyman;

    private Date modifieddate;

    public Integer getLocationsLogid() {
        return locationsLogid;
    }

    public void setLocationsLogid(Integer locationsLogid) {
        this.locationsLogid = locationsLogid;
    }

    public Integer getLocationsId() {
        return locationsId;
    }

    public void setLocationsId(Integer locationsId) {
        this.locationsId = locationsId;
    }

    public String getLocationsPremodifiedstate() {
        return locationsPremodifiedstate;
    }

    public void setLocationsPremodifiedstate(String locationsPremodifiedstate) {
        this.locationsPremodifiedstate = locationsPremodifiedstate == null ? null : locationsPremodifiedstate.trim();
    }

    public String getLocationsModifiedstate() {
        return locationsModifiedstate;
    }

    public void setLocationsModifiedstate(String locationsModifiedstate) {
        this.locationsModifiedstate = locationsModifiedstate == null ? null : locationsModifiedstate.trim();
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
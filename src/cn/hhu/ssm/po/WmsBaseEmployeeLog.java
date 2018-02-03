package cn.hhu.ssm.po;

import java.util.Date;

public class WmsBaseEmployeeLog {
    private Integer employeeLogid;

    private Integer employeeId;

    private String employeePremodifiedstate;

    private String employeeModifiedstate;

    private String modifyman;

    private Date modifieddate;

    public Integer getEmployeeLogid() {
        return employeeLogid;
    }

    public void setEmployeeLogid(Integer employeeLogid) {
        this.employeeLogid = employeeLogid;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeePremodifiedstate() {
        return employeePremodifiedstate;
    }

    public void setEmployeePremodifiedstate(String employeePremodifiedstate) {
        this.employeePremodifiedstate = employeePremodifiedstate == null ? null : employeePremodifiedstate.trim();
    }

    public String getEmployeeModifiedstate() {
        return employeeModifiedstate;
    }

    public void setEmployeeModifiedstate(String employeeModifiedstate) {
        this.employeeModifiedstate = employeeModifiedstate == null ? null : employeeModifiedstate.trim();
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
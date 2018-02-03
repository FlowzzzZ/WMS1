package cn.hhu.ssm.po;

import java.util.Date;

public class WmsBaseDepartmentLog {
    private Integer departmentLogid;

    private Integer departmentId;

    private Integer employeeId;

    private String departmentPremodifiedstate;

    private String departmentModifiedstate;

    private String modifyman;

    private Date modifieddate;

    public Integer getDepartmentLogid() {
        return departmentLogid;
    }

    public void setDepartmentLogid(Integer departmentLogid) {
        this.departmentLogid = departmentLogid;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getDepartmentPremodifiedstate() {
        return departmentPremodifiedstate;
    }

    public void setDepartmentPremodifiedstate(String departmentPremodifiedstate) {
        this.departmentPremodifiedstate = departmentPremodifiedstate == null ? null : departmentPremodifiedstate.trim();
    }

    public String getDepartmentModifiedstate() {
        return departmentModifiedstate;
    }

    public void setDepartmentModifiedstate(String departmentModifiedstate) {
        this.departmentModifiedstate = departmentModifiedstate == null ? null : departmentModifiedstate.trim();
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
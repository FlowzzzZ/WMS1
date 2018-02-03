package cn.hhu.ssm.po;

import java.util.Date;

public class WmsIminspectionlistLog {
    private Integer iminspectionlistsLogid;

    private Integer iminspectionlistsId;

    private String iminspectionlistsPremodifiedstate;

    private String iminspectionlistsModifiedstate;

    private Integer employeeId;

    private String modifyman;

    private Date modifieddate;

    public Integer getIminspectionlistsLogid() {
        return iminspectionlistsLogid;
    }

    public void setIminspectionlistsLogid(Integer iminspectionlistsLogid) {
        this.iminspectionlistsLogid = iminspectionlistsLogid;
    }

    public Integer getIminspectionlistsId() {
        return iminspectionlistsId;
    }

    public void setIminspectionlistsId(Integer iminspectionlistsId) {
        this.iminspectionlistsId = iminspectionlistsId;
    }

    public String getIminspectionlistsPremodifiedstate() {
        return iminspectionlistsPremodifiedstate;
    }

    public void setIminspectionlistsPremodifiedstate(String iminspectionlistsPremodifiedstate) {
        this.iminspectionlistsPremodifiedstate = iminspectionlistsPremodifiedstate == null ? null : iminspectionlistsPremodifiedstate.trim();
    }

    public String getIminspectionlistsModifiedstate() {
        return iminspectionlistsModifiedstate;
    }

    public void setIminspectionlistsModifiedstate(String iminspectionlistsModifiedstate) {
        this.iminspectionlistsModifiedstate = iminspectionlistsModifiedstate == null ? null : iminspectionlistsModifiedstate.trim();
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
package cn.hhu.ssm.po;

import java.util.Date;

public class WmsRoledefinitionLog {
    private Integer roleLogid;

    private Integer roleId;

    private String rolePremodifiedstate;

    private String roleModifiedstate;

    private Integer employeeId;

    private String modifyman;

    private Date modifieddate;

    public Integer getRoleLogid() {
        return roleLogid;
    }

    public void setRoleLogid(Integer roleLogid) {
        this.roleLogid = roleLogid;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRolePremodifiedstate() {
        return rolePremodifiedstate;
    }

    public void setRolePremodifiedstate(String rolePremodifiedstate) {
        this.rolePremodifiedstate = rolePremodifiedstate == null ? null : rolePremodifiedstate.trim();
    }

    public String getRoleModifiedstate() {
        return roleModifiedstate;
    }

    public void setRoleModifiedstate(String roleModifiedstate) {
        this.roleModifiedstate = roleModifiedstate == null ? null : roleModifiedstate.trim();
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
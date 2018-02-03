package cn.hhu.ssm.po;

import java.util.Date;

public class WmsAccesscontrol {
    private Integer accesscontrolId;

    private Integer roleId;

    private Integer funcId;

    private Integer access;

    private Date makeorderdate;

    private Integer makeorderman;

    public Integer getAccesscontrolId() {
        return accesscontrolId;
    }

    public void setAccesscontrolId(Integer accesscontrolId) {
        this.accesscontrolId = accesscontrolId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getFuncId() {
        return funcId;
    }

    public void setFuncId(Integer funcId) {
        this.funcId = funcId;
    }

    public Integer getAccess() {
        return access;
    }

    public void setAccess(Integer access) {
        this.access = access;
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
}
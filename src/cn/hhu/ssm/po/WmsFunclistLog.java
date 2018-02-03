package cn.hhu.ssm.po;

import java.util.Date;

public class WmsFunclistLog {
    private Integer funclistLogid;

    private Integer funcId;

    private Integer funclistId;

    private String funclistPremodifiedstate;

    private String funclistModifiedstate;

    private Integer employeeId;

    private String modifyman;

    private Date modifieddate;

    public Integer getFunclistLogid() {
        return funclistLogid;
    }

    public void setFunclistLogid(Integer funclistLogid) {
        this.funclistLogid = funclistLogid;
    }

    public Integer getFuncId() {
        return funcId;
    }

    public void setFuncId(Integer funcId) {
        this.funcId = funcId;
    }

    public Integer getFunclistId() {
        return funclistId;
    }

    public void setFunclistId(Integer funclistId) {
        this.funclistId = funclistId;
    }

    public String getFunclistPremodifiedstate() {
        return funclistPremodifiedstate;
    }

    public void setFunclistPremodifiedstate(String funclistPremodifiedstate) {
        this.funclistPremodifiedstate = funclistPremodifiedstate == null ? null : funclistPremodifiedstate.trim();
    }

    public String getFunclistModifiedstate() {
        return funclistModifiedstate;
    }

    public void setFunclistModifiedstate(String funclistModifiedstate) {
        this.funclistModifiedstate = funclistModifiedstate == null ? null : funclistModifiedstate.trim();
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
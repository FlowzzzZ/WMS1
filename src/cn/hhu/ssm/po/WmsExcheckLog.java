package cn.hhu.ssm.po;

import java.util.Date;

public class WmsExcheckLog {
    private Integer excheckLogid;

    private Integer excheckId;

    private String excheckPremodifiedstate;

    private String excheckModifiedstate;

    private Integer employeeId;

    private String modifyman;

    private Date modifieddate;

    public Integer getExcheckLogid() {
        return excheckLogid;
    }

    public void setExcheckLogid(Integer excheckLogid) {
        this.excheckLogid = excheckLogid;
    }

    public Integer getExcheckId() {
        return excheckId;
    }

    public void setExcheckId(Integer excheckId) {
        this.excheckId = excheckId;
    }

    public String getExcheckPremodifiedstate() {
        return excheckPremodifiedstate;
    }

    public void setExcheckPremodifiedstate(String excheckPremodifiedstate) {
        this.excheckPremodifiedstate = excheckPremodifiedstate == null ? null : excheckPremodifiedstate.trim();
    }

    public String getExcheckModifiedstate() {
        return excheckModifiedstate;
    }

    public void setExcheckModifiedstate(String excheckModifiedstate) {
        this.excheckModifiedstate = excheckModifiedstate == null ? null : excheckModifiedstate.trim();
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
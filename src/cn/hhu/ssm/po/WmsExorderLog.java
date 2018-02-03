package cn.hhu.ssm.po;

import java.util.Date;

public class WmsExorderLog {
    private Integer exorderLogid;

    private Integer exorderId;

    private String exorderPremodifiedstate;

    private String exorderModifiedstate;

    private Integer employeeId;

    private String modifyman;

    private Date modifeddate;

    public Integer getExorderLogid() {
        return exorderLogid;
    }

    public void setExorderLogid(Integer exorderLogid) {
        this.exorderLogid = exorderLogid;
    }

    public Integer getExorderId() {
        return exorderId;
    }

    public void setExorderId(Integer exorderId) {
        this.exorderId = exorderId;
    }

    public String getExorderPremodifiedstate() {
        return exorderPremodifiedstate;
    }

    public void setExorderPremodifiedstate(String exorderPremodifiedstate) {
        this.exorderPremodifiedstate = exorderPremodifiedstate == null ? null : exorderPremodifiedstate.trim();
    }

    public String getExorderModifiedstate() {
        return exorderModifiedstate;
    }

    public void setExorderModifiedstate(String exorderModifiedstate) {
        this.exorderModifiedstate = exorderModifiedstate == null ? null : exorderModifiedstate.trim();
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

    public Date getModifeddate() {
        return modifeddate;
    }

    public void setModifeddate(Date modifeddate) {
        this.modifeddate = modifeddate;
    }
}
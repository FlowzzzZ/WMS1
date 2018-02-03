package cn.hhu.ssm.po;

import java.util.Date;

public class WmsImorderLog {
    private Integer imorderLogid;

    private Integer imorderId;

    private String imorderPremodifiedstate;

    private String imorderModifiedstate;

    private Integer employeeId;

    private String modifyman;

    private Date modifieddate;

    public Integer getImorderLogid() {
        return imorderLogid;
    }

    public void setImorderLogid(Integer imorderLogid) {
        this.imorderLogid = imorderLogid;
    }

    public Integer getImorderId() {
        return imorderId;
    }

    public void setImorderId(Integer imorderId) {
        this.imorderId = imorderId;
    }

    public String getImorderPremodifiedstate() {
        return imorderPremodifiedstate;
    }

    public void setImorderPremodifiedstate(String imorderPremodifiedstate) {
        this.imorderPremodifiedstate = imorderPremodifiedstate == null ? null : imorderPremodifiedstate.trim();
    }

    public String getImorderModifiedstate() {
        return imorderModifiedstate;
    }

    public void setImorderModifiedstate(String imorderModifiedstate) {
        this.imorderModifiedstate = imorderModifiedstate == null ? null : imorderModifiedstate.trim();
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
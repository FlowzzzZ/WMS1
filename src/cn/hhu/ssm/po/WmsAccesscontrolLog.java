package cn.hhu.ssm.po;

import java.util.Date;

public class WmsAccesscontrolLog {
    private Integer accesscontrolLogid;

    private Integer accesscontrolId;

    private Integer employeeId;

    private String accesscontrolPremodifiedstate;

    private String accesscontrolModifiedstate;

    private String modifyman;

    private Date modifieddate;

    public Integer getAccesscontrolLogid() {
        return accesscontrolLogid;
    }

    public void setAccesscontrolLogid(Integer accesscontrolLogid) {
        this.accesscontrolLogid = accesscontrolLogid;
    }

    public Integer getAccesscontrolId() {
        return accesscontrolId;
    }

    public void setAccesscontrolId(Integer accesscontrolId) {
        this.accesscontrolId = accesscontrolId;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getAccesscontrolPremodifiedstate() {
        return accesscontrolPremodifiedstate;
    }

    public void setAccesscontrolPremodifiedstate(String accesscontrolPremodifiedstate) {
        this.accesscontrolPremodifiedstate = accesscontrolPremodifiedstate == null ? null : accesscontrolPremodifiedstate.trim();
    }

    public String getAccesscontrolModifiedstate() {
        return accesscontrolModifiedstate;
    }

    public void setAccesscontrolModifiedstate(String accesscontrolModifiedstate) {
        this.accesscontrolModifiedstate = accesscontrolModifiedstate == null ? null : accesscontrolModifiedstate.trim();
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
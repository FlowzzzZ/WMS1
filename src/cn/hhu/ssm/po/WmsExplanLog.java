package cn.hhu.ssm.po;

import java.util.Date;

public class WmsExplanLog {
    private Integer explanLogid;

    private Integer explanId;

    private String explanPremodifiedstate;

    private String explanModifiedstate;

    private Integer employeeId;

    private String modifyman;

    private Date modifieddate;

    public Integer getExplanLogid() {
        return explanLogid;
    }

    public void setExplanLogid(Integer explanLogid) {
        this.explanLogid = explanLogid;
    }

    public Integer getExplanId() {
        return explanId;
    }

    public void setExplanId(Integer explanId) {
        this.explanId = explanId;
    }

    public String getExplanPremodifiedstate() {
        return explanPremodifiedstate;
    }

    public void setExplanPremodifiedstate(String explanPremodifiedstate) {
        this.explanPremodifiedstate = explanPremodifiedstate == null ? null : explanPremodifiedstate.trim();
    }

    public String getExplanModifiedstate() {
        return explanModifiedstate;
    }

    public void setExplanModifiedstate(String explanModifiedstate) {
        this.explanModifiedstate = explanModifiedstate == null ? null : explanModifiedstate.trim();
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
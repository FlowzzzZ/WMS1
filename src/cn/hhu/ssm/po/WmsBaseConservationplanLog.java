package cn.hhu.ssm.po;

import java.util.Date;

public class WmsBaseConservationplanLog {
    private Integer conservationplanLogid;

    private Integer conservationplanId;

    private String conservationplanPremodifiedstate;

    private String conservationplanModifiedstate;

    private Integer employeeId;

    private String modifyman;

    private Date modifieddate;

    public Integer getConservationplanLogid() {
        return conservationplanLogid;
    }

    public void setConservationplanLogid(Integer conservationplanLogid) {
        this.conservationplanLogid = conservationplanLogid;
    }

    public Integer getConservationplanId() {
        return conservationplanId;
    }

    public void setConservationplanId(Integer conservationplanId) {
        this.conservationplanId = conservationplanId;
    }

    public String getConservationplanPremodifiedstate() {
        return conservationplanPremodifiedstate;
    }

    public void setConservationplanPremodifiedstate(String conservationplanPremodifiedstate) {
        this.conservationplanPremodifiedstate = conservationplanPremodifiedstate == null ? null : conservationplanPremodifiedstate.trim();
    }

    public String getConservationplanModifiedstate() {
        return conservationplanModifiedstate;
    }

    public void setConservationplanModifiedstate(String conservationplanModifiedstate) {
        this.conservationplanModifiedstate = conservationplanModifiedstate == null ? null : conservationplanModifiedstate.trim();
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
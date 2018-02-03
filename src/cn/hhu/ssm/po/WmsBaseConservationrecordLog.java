package cn.hhu.ssm.po;

import java.util.Date;

public class WmsBaseConservationrecordLog {
    private Integer conservationrecordLogid;

    private Integer conservationrecordId;

    private String conservationrecordPremodifiedstate;

    private String conservationrecordModifiedstate;

    private Integer employeeId;

    private String modifyman;

    private Date modifieddate;

    public Integer getConservationrecordLogid() {
        return conservationrecordLogid;
    }

    public void setConservationrecordLogid(Integer conservationrecordLogid) {
        this.conservationrecordLogid = conservationrecordLogid;
    }

    public Integer getConservationrecordId() {
        return conservationrecordId;
    }

    public void setConservationrecordId(Integer conservationrecordId) {
        this.conservationrecordId = conservationrecordId;
    }

    public String getConservationrecordPremodifiedstate() {
        return conservationrecordPremodifiedstate;
    }

    public void setConservationrecordPremodifiedstate(String conservationrecordPremodifiedstate) {
        this.conservationrecordPremodifiedstate = conservationrecordPremodifiedstate == null ? null : conservationrecordPremodifiedstate.trim();
    }

    public String getConservationrecordModifiedstate() {
        return conservationrecordModifiedstate;
    }

    public void setConservationrecordModifiedstate(String conservationrecordModifiedstate) {
        this.conservationrecordModifiedstate = conservationrecordModifiedstate == null ? null : conservationrecordModifiedstate.trim();
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
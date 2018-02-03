package cn.hhu.ssm.po;

import java.util.Date;

public class WmsImplanLog {
    private Integer implanLogid;

    private Integer implanId;

    private String implanPremodifiedstate;

    private String implanModifiedstate;

    private Integer employeeId;

    private String modifyman;

    private Date modifieddate;

    public Integer getImplanLogid() {
        return implanLogid;
    }

    public void setImplanLogid(Integer implanLogid) {
        this.implanLogid = implanLogid;
    }

    public Integer getImplanId() {
        return implanId;
    }

    public void setImplanId(Integer implanId) {
        this.implanId = implanId;
    }

    public String getImplanPremodifiedstate() {
        return implanPremodifiedstate;
    }

    public void setImplanPremodifiedstate(String implanPremodifiedstate) {
        this.implanPremodifiedstate = implanPremodifiedstate == null ? null : implanPremodifiedstate.trim();
    }

    public String getImplanModifiedstate() {
        return implanModifiedstate;
    }

    public void setImplanModifiedstate(String implanModifiedstate) {
        this.implanModifiedstate = implanModifiedstate == null ? null : implanModifiedstate.trim();
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
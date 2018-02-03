package cn.hhu.ssm.po;

import java.util.Date;

public class WmsBoxLog {
    private Integer boxLogid;

    private Integer boxId;

    private String boxPremodifiedstate;

    private String boxModifiedstate;

    private Integer employeeId;

    private String modifyman;

    private Date modifieddate;

    public Integer getBoxLogid() {
        return boxLogid;
    }

    public void setBoxLogid(Integer boxLogid) {
        this.boxLogid = boxLogid;
    }

    public Integer getBoxId() {
        return boxId;
    }

    public void setBoxId(Integer boxId) {
        this.boxId = boxId;
    }

    public String getBoxPremodifiedstate() {
        return boxPremodifiedstate;
    }

    public void setBoxPremodifiedstate(String boxPremodifiedstate) {
        this.boxPremodifiedstate = boxPremodifiedstate == null ? null : boxPremodifiedstate.trim();
    }

    public String getBoxModifiedstate() {
        return boxModifiedstate;
    }

    public void setBoxModifiedstate(String boxModifiedstate) {
        this.boxModifiedstate = boxModifiedstate == null ? null : boxModifiedstate.trim();
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
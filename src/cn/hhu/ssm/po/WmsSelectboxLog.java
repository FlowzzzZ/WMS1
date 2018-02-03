package cn.hhu.ssm.po;

import java.util.Date;

public class WmsSelectboxLog {
    private Integer selectboxLogid;

    private Integer selectboxId;

    private String selectboxPremodifiedstate;

    private String selectboxModifiedstate;

    private Integer employeeId;

    private String modifyman;

    private Date modifieddate;

    public Integer getSelectboxLogid() {
        return selectboxLogid;
    }

    public void setSelectboxLogid(Integer selectboxLogid) {
        this.selectboxLogid = selectboxLogid;
    }

    public Integer getSelectboxId() {
        return selectboxId;
    }

    public void setSelectboxId(Integer selectboxId) {
        this.selectboxId = selectboxId;
    }

    public String getSelectboxPremodifiedstate() {
        return selectboxPremodifiedstate;
    }

    public void setSelectboxPremodifiedstate(String selectboxPremodifiedstate) {
        this.selectboxPremodifiedstate = selectboxPremodifiedstate == null ? null : selectboxPremodifiedstate.trim();
    }

    public String getSelectboxModifiedstate() {
        return selectboxModifiedstate;
    }

    public void setSelectboxModifiedstate(String selectboxModifiedstate) {
        this.selectboxModifiedstate = selectboxModifiedstate == null ? null : selectboxModifiedstate.trim();
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
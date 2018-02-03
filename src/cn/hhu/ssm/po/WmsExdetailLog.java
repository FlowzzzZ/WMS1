package cn.hhu.ssm.po;

import java.util.Date;

public class WmsExdetailLog {
    private Integer exdetailLogid;

    private Integer exdetailId;

    private String exdetailPremodifiedstate;

    private String exdetailModifiedstate;

    private Integer employeeId;

    private String modifyman;

    private Date modifieddate;

    public Integer getExdetailLogid() {
        return exdetailLogid;
    }

    public void setExdetailLogid(Integer exdetailLogid) {
        this.exdetailLogid = exdetailLogid;
    }

    public Integer getExdetailId() {
        return exdetailId;
    }

    public void setExdetailId(Integer exdetailId) {
        this.exdetailId = exdetailId;
    }

    public String getExdetailPremodifiedstate() {
        return exdetailPremodifiedstate;
    }

    public void setExdetailPremodifiedstate(String exdetailPremodifiedstate) {
        this.exdetailPremodifiedstate = exdetailPremodifiedstate == null ? null : exdetailPremodifiedstate.trim();
    }

    public String getExdetailModifiedstate() {
        return exdetailModifiedstate;
    }

    public void setExdetailModifiedstate(String exdetailModifiedstate) {
        this.exdetailModifiedstate = exdetailModifiedstate == null ? null : exdetailModifiedstate.trim();
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
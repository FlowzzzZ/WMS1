package cn.hhu.ssm.po;

import java.util.Date;

public class WmsBaseUserLog {
    private Integer userLogid;

    private Integer userId;

    private String userPremodifiedstate;

    private String userModifiedstate;

    private Integer employeeId;

    private String modifyman;

    private Date modifeddate;

    public Integer getUserLogid() {
        return userLogid;
    }

    public void setUserLogid(Integer userLogid) {
        this.userLogid = userLogid;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserPremodifiedstate() {
        return userPremodifiedstate;
    }

    public void setUserPremodifiedstate(String userPremodifiedstate) {
        this.userPremodifiedstate = userPremodifiedstate == null ? null : userPremodifiedstate.trim();
    }

    public String getUserModifiedstate() {
        return userModifiedstate;
    }

    public void setUserModifiedstate(String userModifiedstate) {
        this.userModifiedstate = userModifiedstate == null ? null : userModifiedstate.trim();
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
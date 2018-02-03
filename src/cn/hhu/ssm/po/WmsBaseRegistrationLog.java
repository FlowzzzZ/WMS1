package cn.hhu.ssm.po;

import java.util.Date;

public class WmsBaseRegistrationLog {
    private Integer registrationLogid;

    private Integer registrationId;

    private String registrationPremodifiedstate;

    private String registrationModifiedstate;

    private Integer employeeId;

    private String modifyman;

    private Date modifieddate;

    public Integer getRegistrationLogid() {
        return registrationLogid;
    }

    public void setRegistrationLogid(Integer registrationLogid) {
        this.registrationLogid = registrationLogid;
    }

    public Integer getRegistrationId() {
        return registrationId;
    }

    public void setRegistrationId(Integer registrationId) {
        this.registrationId = registrationId;
    }

    public String getRegistrationPremodifiedstate() {
        return registrationPremodifiedstate;
    }

    public void setRegistrationPremodifiedstate(String registrationPremodifiedstate) {
        this.registrationPremodifiedstate = registrationPremodifiedstate == null ? null : registrationPremodifiedstate.trim();
    }

    public String getRegistrationModifiedstate() {
        return registrationModifiedstate;
    }

    public void setRegistrationModifiedstate(String registrationModifiedstate) {
        this.registrationModifiedstate = registrationModifiedstate == null ? null : registrationModifiedstate.trim();
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
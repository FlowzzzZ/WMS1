package cn.hhu.ssm.po;

import java.util.Date;

public class WmsSerialnumberLog {
    private Integer serialnumberLogid;

    private Integer serialnumberId;

    private String serialnumberPremodifiedstate;

    private String serialnumberModifiedstate;

    private Integer employeeId;

    private String modifyman;

    private Date modifieddate;

    public Integer getSerialnumberLogid() {
        return serialnumberLogid;
    }

    public void setSerialnumberLogid(Integer serialnumberLogid) {
        this.serialnumberLogid = serialnumberLogid;
    }

    public Integer getSerialnumberId() {
        return serialnumberId;
    }

    public void setSerialnumberId(Integer serialnumberId) {
        this.serialnumberId = serialnumberId;
    }

    public String getSerialnumberPremodifiedstate() {
        return serialnumberPremodifiedstate;
    }

    public void setSerialnumberPremodifiedstate(String serialnumberPremodifiedstate) {
        this.serialnumberPremodifiedstate = serialnumberPremodifiedstate == null ? null : serialnumberPremodifiedstate.trim();
    }

    public String getSerialnumberModifiedstate() {
        return serialnumberModifiedstate;
    }

    public void setSerialnumberModifiedstate(String serialnumberModifiedstate) {
        this.serialnumberModifiedstate = serialnumberModifiedstate == null ? null : serialnumberModifiedstate.trim();
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
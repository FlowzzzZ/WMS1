package cn.hhu.ssm.po;

import java.util.Date;

public class WmsBaseShipperLog {
    private Integer clientLogid;

    private Integer clientId;

    private String clientPremodifiedstate;

    private String clientModifiedstate;

    private Integer employeeId;

    private String modifyman;

    private Date modifieddate;

    public Integer getClientLogid() {
        return clientLogid;
    }

    public void setClientLogid(Integer clientLogid) {
        this.clientLogid = clientLogid;
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public String getClientPremodifiedstate() {
        return clientPremodifiedstate;
    }

    public void setClientPremodifiedstate(String clientPremodifiedstate) {
        this.clientPremodifiedstate = clientPremodifiedstate == null ? null : clientPremodifiedstate.trim();
    }

    public String getClientModifiedstate() {
        return clientModifiedstate;
    }

    public void setClientModifiedstate(String clientModifiedstate) {
        this.clientModifiedstate = clientModifiedstate == null ? null : clientModifiedstate.trim();
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
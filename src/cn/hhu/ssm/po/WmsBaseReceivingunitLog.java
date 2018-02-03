package cn.hhu.ssm.po;

import java.util.Date;

public class WmsBaseReceivingunitLog {
    private Integer receivingunitLogid;

    private Integer shipperId;

    private String receivingunitPremodifiedstate;

    private String receivingunitModifiedstate;

    private Integer employeeId;

    private String modifyman;

    private Date modifieddate;

    public Integer getReceivingunitLogid() {
        return receivingunitLogid;
    }

    public void setReceivingunitLogid(Integer receivingunitLogid) {
        this.receivingunitLogid = receivingunitLogid;
    }

    public Integer getShipperId() {
        return shipperId;
    }

    public void setShipperId(Integer shipperId) {
        this.shipperId = shipperId;
    }

    public String getReceivingunitPremodifiedstate() {
        return receivingunitPremodifiedstate;
    }

    public void setReceivingunitPremodifiedstate(String receivingunitPremodifiedstate) {
        this.receivingunitPremodifiedstate = receivingunitPremodifiedstate == null ? null : receivingunitPremodifiedstate.trim();
    }

    public String getReceivingunitModifiedstate() {
        return receivingunitModifiedstate;
    }

    public void setReceivingunitModifiedstate(String receivingunitModifiedstate) {
        this.receivingunitModifiedstate = receivingunitModifiedstate == null ? null : receivingunitModifiedstate.trim();
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
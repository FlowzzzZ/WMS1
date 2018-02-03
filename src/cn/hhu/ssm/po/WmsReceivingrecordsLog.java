package cn.hhu.ssm.po;

import java.util.Date;

public class WmsReceivingrecordsLog {
    private Integer receivingrecordsLogid;

    private Integer receivingrecordsId;

    private String receivingrecordsPremodifiedstate;

    private String receivingrecordsModifiedstate;

    private Integer employeeId;

    private String modifyman;

    private Date modifieddate;

    public Integer getReceivingrecordsLogid() {
        return receivingrecordsLogid;
    }

    public void setReceivingrecordsLogid(Integer receivingrecordsLogid) {
        this.receivingrecordsLogid = receivingrecordsLogid;
    }

    public Integer getReceivingrecordsId() {
        return receivingrecordsId;
    }

    public void setReceivingrecordsId(Integer receivingrecordsId) {
        this.receivingrecordsId = receivingrecordsId;
    }

    public String getReceivingrecordsPremodifiedstate() {
        return receivingrecordsPremodifiedstate;
    }

    public void setReceivingrecordsPremodifiedstate(String receivingrecordsPremodifiedstate) {
        this.receivingrecordsPremodifiedstate = receivingrecordsPremodifiedstate == null ? null : receivingrecordsPremodifiedstate.trim();
    }

    public String getReceivingrecordsModifiedstate() {
        return receivingrecordsModifiedstate;
    }

    public void setReceivingrecordsModifiedstate(String receivingrecordsModifiedstate) {
        this.receivingrecordsModifiedstate = receivingrecordsModifiedstate == null ? null : receivingrecordsModifiedstate.trim();
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
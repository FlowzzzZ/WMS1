package cn.hhu.ssm.po;

import java.util.Date;

public class WmsPackingcontentLog {
    private Integer packingcontentLogid;

    private Integer packingcontentId;

    private String packingcontentPremodifiedstate;

    private String packingcontentModifiedstate;

    private Integer employeeId;

    private String modifyman;

    private Date modifieddate;

    public Integer getPackingcontentLogid() {
        return packingcontentLogid;
    }

    public void setPackingcontentLogid(Integer packingcontentLogid) {
        this.packingcontentLogid = packingcontentLogid;
    }

    public Integer getPackingcontentId() {
        return packingcontentId;
    }

    public void setPackingcontentId(Integer packingcontentId) {
        this.packingcontentId = packingcontentId;
    }

    public String getPackingcontentPremodifiedstate() {
        return packingcontentPremodifiedstate;
    }

    public void setPackingcontentPremodifiedstate(String packingcontentPremodifiedstate) {
        this.packingcontentPremodifiedstate = packingcontentPremodifiedstate == null ? null : packingcontentPremodifiedstate.trim();
    }

    public String getPackingcontentModifiedstate() {
        return packingcontentModifiedstate;
    }

    public void setPackingcontentModifiedstate(String packingcontentModifiedstate) {
        this.packingcontentModifiedstate = packingcontentModifiedstate == null ? null : packingcontentModifiedstate.trim();
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
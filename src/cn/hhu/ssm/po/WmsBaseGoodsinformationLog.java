package cn.hhu.ssm.po;

import java.util.Date;

public class WmsBaseGoodsinformationLog {
    private Integer goodsinformationLogid;

    private Integer goodsinformationId;

    private String goodsinformationPremodifiedstate;

    private String goodsinformationModifiedstate;

    private Integer employeeId;

    private String modifyman;

    private Date modifieddate;

    public Integer getGoodsinformationLogid() {
        return goodsinformationLogid;
    }

    public void setGoodsinformationLogid(Integer goodsinformationLogid) {
        this.goodsinformationLogid = goodsinformationLogid;
    }

    public Integer getGoodsinformationId() {
        return goodsinformationId;
    }

    public void setGoodsinformationId(Integer goodsinformationId) {
        this.goodsinformationId = goodsinformationId;
    }

    public String getGoodsinformationPremodifiedstate() {
        return goodsinformationPremodifiedstate;
    }

    public void setGoodsinformationPremodifiedstate(String goodsinformationPremodifiedstate) {
        this.goodsinformationPremodifiedstate = goodsinformationPremodifiedstate == null ? null : goodsinformationPremodifiedstate.trim();
    }

    public String getGoodsinformationModifiedstate() {
        return goodsinformationModifiedstate;
    }

    public void setGoodsinformationModifiedstate(String goodsinformationModifiedstate) {
        this.goodsinformationModifiedstate = goodsinformationModifiedstate == null ? null : goodsinformationModifiedstate.trim();
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
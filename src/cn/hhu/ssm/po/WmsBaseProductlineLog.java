package cn.hhu.ssm.po;

import java.util.Date;

public class WmsBaseProductlineLog {
    private Integer productlineLogid;

    private Integer productlineId;

    private String productlinePremodifiedstate;

    private String productlineModifiedstate;

    private Integer employeeId;

    private String modifyman;

    private Date modifieddate;

    public Integer getProductlineLogid() {
        return productlineLogid;
    }

    public void setProductlineLogid(Integer productlineLogid) {
        this.productlineLogid = productlineLogid;
    }

    public Integer getProductlineId() {
        return productlineId;
    }

    public void setProductlineId(Integer productlineId) {
        this.productlineId = productlineId;
    }

    public String getProductlinePremodifiedstate() {
        return productlinePremodifiedstate;
    }

    public void setProductlinePremodifiedstate(String productlinePremodifiedstate) {
        this.productlinePremodifiedstate = productlinePremodifiedstate == null ? null : productlinePremodifiedstate.trim();
    }

    public String getProductlineModifiedstate() {
        return productlineModifiedstate;
    }

    public void setProductlineModifiedstate(String productlineModifiedstate) {
        this.productlineModifiedstate = productlineModifiedstate == null ? null : productlineModifiedstate.trim();
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
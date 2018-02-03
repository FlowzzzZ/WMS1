package cn.hhu.ssm.po;

import java.util.Date;

public class WmsAreaLog {
    private Integer areasLogid;

    private Integer areasId;

    private String areasPremodifiedstate;

    private String areasModifiedstate;

    private Integer employeeId;

    private String modifyman;

    private Date modifieddate;

    public Integer getAreasLogid() {
        return areasLogid;
    }

    public void setAreasLogid(Integer areasLogid) {
        this.areasLogid = areasLogid;
    }

    public Integer getAreasId() {
        return areasId;
    }

    public void setAreasId(Integer areasId) {
        this.areasId = areasId;
    }

    public String getAreasPremodifiedstate() {
        return areasPremodifiedstate;
    }

    public void setAreasPremodifiedstate(String areasPremodifiedstate) {
        this.areasPremodifiedstate = areasPremodifiedstate == null ? null : areasPremodifiedstate.trim();
    }

    public String getAreasModifiedstate() {
        return areasModifiedstate;
    }

    public void setAreasModifiedstate(String areasModifiedstate) {
        this.areasModifiedstate = areasModifiedstate == null ? null : areasModifiedstate.trim();
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
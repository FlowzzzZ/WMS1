package cn.hhu.ssm.po;

import java.util.Date;

public class WmsImhitshelveslistLog {
    private Integer imhitshelveslistsLogid;

    private Integer imhitshelveslistsId;

    private String imhitshelveslistsPremodifiedstate;

    private String imhitshelveslistsModifiedstate;

    private Integer employeeId;

    private String modifyman;

    private Date modifieddate;

    public Integer getImhitshelveslistsLogid() {
        return imhitshelveslistsLogid;
    }

    public void setImhitshelveslistsLogid(Integer imhitshelveslistsLogid) {
        this.imhitshelveslistsLogid = imhitshelveslistsLogid;
    }

    public Integer getImhitshelveslistsId() {
        return imhitshelveslistsId;
    }

    public void setImhitshelveslistsId(Integer imhitshelveslistsId) {
        this.imhitshelveslistsId = imhitshelveslistsId;
    }

    public String getImhitshelveslistsPremodifiedstate() {
        return imhitshelveslistsPremodifiedstate;
    }

    public void setImhitshelveslistsPremodifiedstate(String imhitshelveslistsPremodifiedstate) {
        this.imhitshelveslistsPremodifiedstate = imhitshelveslistsPremodifiedstate == null ? null : imhitshelveslistsPremodifiedstate.trim();
    }

    public String getImhitshelveslistsModifiedstate() {
        return imhitshelveslistsModifiedstate;
    }

    public void setImhitshelveslistsModifiedstate(String imhitshelveslistsModifiedstate) {
        this.imhitshelveslistsModifiedstate = imhitshelveslistsModifiedstate == null ? null : imhitshelveslistsModifiedstate.trim();
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
package cn.hhu.ssm.po;

import java.util.Date;

public class WmsRoledefinition {
    private Integer roleId;

    private String roledefinitionNumber;

    private String rolename;

    private String roledescription;

    private Date makeorderdate;

    private Integer makeorderman;

    private Integer isclosed;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoledefinitionNumber() {
        return roledefinitionNumber;
    }

    public void setRoledefinitionNumber(String roledefinitionNumber) {
        this.roledefinitionNumber = roledefinitionNumber == null ? null : roledefinitionNumber.trim();
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename == null ? null : rolename.trim();
    }

    public String getRoledescription() {
        return roledescription;
    }

    public void setRoledescription(String roledescription) {
        this.roledescription = roledescription == null ? null : roledescription.trim();
    }

    public Date getMakeorderdate() {
        return makeorderdate;
    }

    public void setMakeorderdate(Date makeorderdate) {
        this.makeorderdate = makeorderdate;
    }

    public Integer getMakeorderman() {
        return makeorderman;
    }

    public void setMakeorderman(Integer makeorderman) {
        this.makeorderman = makeorderman;
    }

    public Integer getIsclosed() {
        return isclosed;
    }

    public void setIsclosed(Integer isclosed) {
        this.isclosed = isclosed;
    }
}
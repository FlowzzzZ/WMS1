package cn.hhu.ssm.po;

import java.util.Date;

public class WmsFunclist {
    private Integer funcId;

    private String funcName;

    private String funcInterface;

    private Date makeorderdate;

    private Integer makeorderman;

    public Integer getFuncId() {
        return funcId;
    }

    public void setFuncId(Integer funcId) {
        this.funcId = funcId;
    }

    public String getFuncName() {
        return funcName;
    }

    public void setFuncName(String funcName) {
        this.funcName = funcName == null ? null : funcName.trim();
    }

    public String getFuncInterface() {
        return funcInterface;
    }

    public void setFuncInterface(String funcInterface) {
        this.funcInterface = funcInterface == null ? null : funcInterface.trim();
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
}
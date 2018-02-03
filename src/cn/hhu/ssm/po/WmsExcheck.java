package cn.hhu.ssm.po;

import java.util.Date;

public class WmsExcheck {
    private Integer excheckId;

    private String excheckNumber;

    private Integer detailId;

    private Float checkquantity;

    private Integer checkresult;

    private String checkman;

    private String checkinstruction;

    private Integer checkstate;

    private Date makeorderdate;

    private Integer makeorderman;

    public Integer getExcheckId() {
        return excheckId;
    }

    public void setExcheckId(Integer excheckId) {
        this.excheckId = excheckId;
    }

    public String getExcheckNumber() {
        return excheckNumber;
    }

    public void setExcheckNumber(String excheckNumber) {
        this.excheckNumber = excheckNumber == null ? null : excheckNumber.trim();
    }

    public Integer getDetailId() {
        return detailId;
    }

    public void setDetailId(Integer detailId) {
        this.detailId = detailId;
    }

    public Float getCheckquantity() {
        return checkquantity;
    }

    public void setCheckquantity(Float checkquantity) {
        this.checkquantity = checkquantity;
    }

    public Integer getCheckresult() {
        return checkresult;
    }

    public void setCheckresult(Integer checkresult) {
        this.checkresult = checkresult;
    }

    public String getCheckman() {
        return checkman;
    }

    public void setCheckman(String checkman) {
        this.checkman = checkman == null ? null : checkman.trim();
    }

    public String getCheckinstruction() {
        return checkinstruction;
    }

    public void setCheckinstruction(String checkinstruction) {
        this.checkinstruction = checkinstruction == null ? null : checkinstruction.trim();
    }

    public Integer getCheckstate() {
        return checkstate;
    }

    public void setCheckstate(Integer checkstate) {
        this.checkstate = checkstate;
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
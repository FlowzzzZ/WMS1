package cn.hhu.ssm.po;

import java.util.Date;

public class WmsBaseConservationrecord {
    private Integer conservationrecordId;

    private String conservationrecordNumber;

    private String conservationplanNumber;

    private Boolean isdeleted;

    private Integer inventorynumber;

    private String inspectionsituation;

    private String result;

    private String conservationman;

    private String remark;

    private Date makeorderdate;

    private Integer makeorderman;

    public Integer getConservationrecordId() {
        return conservationrecordId;
    }

    public void setConservationrecordId(Integer conservationrecordId) {
        this.conservationrecordId = conservationrecordId;
    }

    public String getConservationrecordNumber() {
        return conservationrecordNumber;
    }

    public void setConservationrecordNumber(String conservationrecordNumber) {
        this.conservationrecordNumber = conservationrecordNumber == null ? null : conservationrecordNumber.trim();
    }

    public String getConservationplanNumber() {
        return conservationplanNumber;
    }

    public void setConservationplanNumber(String conservationplanNumber) {
        this.conservationplanNumber = conservationplanNumber == null ? null : conservationplanNumber.trim();
    }

    public Boolean getIsdeleted() {
        return isdeleted;
    }

    public void setIsdeleted(Boolean isdeleted) {
        this.isdeleted = isdeleted;
    }

    public Integer getInventorynumber() {
        return inventorynumber;
    }

    public void setInventorynumber(Integer inventorynumber) {
        this.inventorynumber = inventorynumber;
    }

    public String getInspectionsituation() {
        return inspectionsituation;
    }

    public void setInspectionsituation(String inspectionsituation) {
        this.inspectionsituation = inspectionsituation == null ? null : inspectionsituation.trim();
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result == null ? null : result.trim();
    }

    public String getConservationman() {
        return conservationman;
    }

    public void setConservationman(String conservationman) {
        this.conservationman = conservationman == null ? null : conservationman.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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
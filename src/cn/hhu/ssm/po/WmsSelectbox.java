package cn.hhu.ssm.po;

import java.util.Date;

import cn.hhu.ssm.common.BaseParam;

public class WmsSelectbox extends BaseParam{
    private Integer selectboxId;

    private Integer boxId;

    private Integer exorderId;

    private Date makeorderdate;

    private Integer makeorderman;

    public Integer getSelectboxId() {
        return selectboxId;
    }

    public void setSelectboxId(Integer selectboxId) {
        this.selectboxId = selectboxId;
    }

    public Integer getBoxId() {
        return boxId;
    }

    public void setBoxId(Integer boxId) {
        this.boxId = boxId;
    }

    public Integer getExorderId() {
        return exorderId;
    }

    public void setExorderId(Integer exorderId) {
        this.exorderId = exorderId;
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
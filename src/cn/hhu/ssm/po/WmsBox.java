package cn.hhu.ssm.po;

import java.util.Date;

public class WmsBox {
    private Integer boxId;

    private String boxNumber;

    private Integer boxtype;

    private Float volume;

    private Integer state;

    private Date starttime;

    private Date endtime;

    private Integer isoccupied;

    private Integer isturned;

    private Date makeorderdate;

    private Integer makeorderman;

    public Integer getBoxId() {
        return boxId;
    }

    public void setBoxId(Integer boxId) {
        this.boxId = boxId;
    }

    public String getBoxNumber() {
        return boxNumber;
    }

    public void setBoxNumber(String boxNumber) {
        this.boxNumber = boxNumber == null ? null : boxNumber.trim();
    }

    public Integer getBoxtype() {
        return boxtype;
    }

    public void setBoxtype(Integer boxtype) {
        this.boxtype = boxtype;
    }

    public Float getVolume() {
        return volume;
    }

    public void setVolume(Float volume) {
        this.volume = volume;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Integer getIsoccupied() {
        return isoccupied;
    }

    public void setIsoccupied(Integer isoccupied) {
        this.isoccupied = isoccupied;
    }

    public Integer getIsturned() {
        return isturned;
    }

    public void setIsturned(Integer isturned) {
        this.isturned = isturned;
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
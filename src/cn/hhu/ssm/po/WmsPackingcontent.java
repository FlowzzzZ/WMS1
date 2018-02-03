package cn.hhu.ssm.po;

import java.util.Date;

import cn.hhu.ssm.common.BaseParam;

public class WmsPackingcontent extends BaseParam{
    private Integer packingcontentId;

    private String packingcontentNumber;

    private Integer boxId;

    private Integer exdetail;

    private Float packingquantity;

    private String packinginstruction;

    private Date makeorderdate;

    private Integer makeorderman;

    public Integer getPackingcontentId() {
        return packingcontentId;
    }

    public void setPackingcontentId(Integer packingcontentId) {
        this.packingcontentId = packingcontentId;
    }

    public String getPackingcontentNumber() {
        return packingcontentNumber;
    }

    public void setPackingcontentNumber(String packingcontentNumber) {
        this.packingcontentNumber = packingcontentNumber == null ? null : packingcontentNumber.trim();
    }

    public Integer getBoxId() {
        return boxId;
    }

    public void setBoxId(Integer boxId) {
        this.boxId = boxId;
    }

    public Integer getExdetail() {
        return exdetail;
    }

    public void setExdetail(Integer exdetail) {
        this.exdetail = exdetail;
    }

    public Float getPackingquantity() {
        return packingquantity;
    }

    public void setPackingquantity(Float packingquantity) {
        this.packingquantity = packingquantity;
    }

    public String getPackinginstruction() {
        return packinginstruction;
    }

    public void setPackinginstruction(String packinginstruction) {
        this.packinginstruction = packinginstruction == null ? null : packinginstruction.trim();
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
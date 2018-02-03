package cn.hhu.ssm.po;

import java.util.Date;

public class WmsImgoodsLog {
    private Integer goodsidLogid;

    private Integer goodsId;

    private String goodsPremodifiedstate;

    private String goodsModifiedstate;

    private Integer employeeId;

    private String modifyman;

    private Date modifieddate;

    public Integer getGoodsidLogid() {
        return goodsidLogid;
    }

    public void setGoodsidLogid(Integer goodsidLogid) {
        this.goodsidLogid = goodsidLogid;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsPremodifiedstate() {
        return goodsPremodifiedstate;
    }

    public void setGoodsPremodifiedstate(String goodsPremodifiedstate) {
        this.goodsPremodifiedstate = goodsPremodifiedstate == null ? null : goodsPremodifiedstate.trim();
    }

    public String getGoodsModifiedstate() {
        return goodsModifiedstate;
    }

    public void setGoodsModifiedstate(String goodsModifiedstate) {
        this.goodsModifiedstate = goodsModifiedstate == null ? null : goodsModifiedstate.trim();
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
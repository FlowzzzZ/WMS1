package cn.hhu.ssm.po;

import java.util.Date;

import cn.hhu.ssm.common.BaseParam;

public class WmsExhistory extends BaseParam{
    private Integer exhistoryId;

    private String exhistoryNumer;

    private String priid;

    private String principalname;

    private Date exdate;

    private String extype;

    private String goodsname;

    private String specificatintype;

    private String produceenterprise;

    private String produceregistrationnumberorrecordcertificatenumber;

    private String producebatchnumberorserialnumber;

    private String storagetransportationcondition;

    private String producedateandvalidity;

    private String unit;

    private String quantity;

    private String receivingcustomername;

    private String receivingaddress;

    private String contactman;

    private String contacttel;

    private String remark;

    private Date makeorderdate;

    private Integer makeorderman;

    public Integer getExhistoryId() {
        return exhistoryId;
    }

    public void setExhistoryId(Integer exhistoryId) {
        this.exhistoryId = exhistoryId;
    }

    public String getExhistoryNumer() {
        return exhistoryNumer;
    }

    public void setExhistoryNumer(String exhistoryNumer) {
        this.exhistoryNumer = exhistoryNumer == null ? null : exhistoryNumer.trim();
    }

    public String getPriid() {
        return priid;
    }

    public void setPriid(String priid) {
        this.priid = priid == null ? null : priid.trim();
    }

    public String getPrincipalname() {
        return principalname;
    }

    public void setPrincipalname(String principalname) {
        this.principalname = principalname == null ? null : principalname.trim();
    }

    public Date getExdate() {
        return exdate;
    }

    public void setExdate(Date exdate) {
        this.exdate = exdate;
    }

    public String getExtype() {
        return extype;
    }

    public void setExtype(String extype) {
        this.extype = extype == null ? null : extype.trim();
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname == null ? null : goodsname.trim();
    }

    public String getSpecificatintype() {
        return specificatintype;
    }

    public void setSpecificatintype(String specificatintype) {
        this.specificatintype = specificatintype == null ? null : specificatintype.trim();
    }

    public String getProduceenterprise() {
        return produceenterprise;
    }

    public void setProduceenterprise(String produceenterprise) {
        this.produceenterprise = produceenterprise == null ? null : produceenterprise.trim();
    }

    public String getProduceregistrationnumberorrecordcertificatenumber() {
        return produceregistrationnumberorrecordcertificatenumber;
    }

    public void setProduceregistrationnumberorrecordcertificatenumber(String produceregistrationnumberorrecordcertificatenumber) {
        this.produceregistrationnumberorrecordcertificatenumber = produceregistrationnumberorrecordcertificatenumber == null ? null : produceregistrationnumberorrecordcertificatenumber.trim();
    }

    public String getProducebatchnumberorserialnumber() {
        return producebatchnumberorserialnumber;
    }

    public void setProducebatchnumberorserialnumber(String producebatchnumberorserialnumber) {
        this.producebatchnumberorserialnumber = producebatchnumberorserialnumber == null ? null : producebatchnumberorserialnumber.trim();
    }

    public String getStoragetransportationcondition() {
        return storagetransportationcondition;
    }

    public void setStoragetransportationcondition(String storagetransportationcondition) {
        this.storagetransportationcondition = storagetransportationcondition == null ? null : storagetransportationcondition.trim();
    }

    public String getProducedateandvalidity() {
        return producedateandvalidity;
    }

    public void setProducedateandvalidity(String producedateandvalidity) {
        this.producedateandvalidity = producedateandvalidity == null ? null : producedateandvalidity.trim();
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity == null ? null : quantity.trim();
    }

    public String getReceivingcustomername() {
        return receivingcustomername;
    }

    public void setReceivingcustomername(String receivingcustomername) {
        this.receivingcustomername = receivingcustomername == null ? null : receivingcustomername.trim();
    }

    public String getReceivingaddress() {
        return receivingaddress;
    }

    public void setReceivingaddress(String receivingaddress) {
        this.receivingaddress = receivingaddress == null ? null : receivingaddress.trim();
    }

    public String getContactman() {
        return contactman;
    }

    public void setContactman(String contactman) {
        this.contactman = contactman == null ? null : contactman.trim();
    }

    public String getContacttel() {
        return contacttel;
    }

    public void setContacttel(String contacttel) {
        this.contacttel = contacttel == null ? null : contacttel.trim();
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
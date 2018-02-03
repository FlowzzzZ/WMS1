package cn.hhu.ssm.po;

public class WmsSerialnumber {
    private Integer serialnumberId;

    private String serialNumber;

    private Integer goodsId;

    private String goodsNumber;

    private String batchnumber;

    private Integer isinstock;

    private String remark;

    private String imorderNumber;

    private String exorderNumber;

    public Integer getSerialnumberId() {
        return serialnumberId;
    }

    public void setSerialnumberId(Integer serialnumberId) {
        this.serialnumberId = serialnumberId;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber == null ? null : serialNumber.trim();
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsNumber() {
        return goodsNumber;
    }

    public void setGoodsNumber(String goodsNumber) {
        this.goodsNumber = goodsNumber == null ? null : goodsNumber.trim();
    }

    public String getBatchnumber() {
        return batchnumber;
    }

    public void setBatchnumber(String batchnumber) {
        this.batchnumber = batchnumber == null ? null : batchnumber.trim();
    }

    public Integer getIsinstock() {
        return isinstock;
    }

    public void setIsinstock(Integer isinstock) {
        this.isinstock = isinstock;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getImorderNumber() {
        return imorderNumber;
    }

    public void setImorderNumber(String imorderNumber) {
        this.imorderNumber = imorderNumber == null ? null : imorderNumber.trim();
    }

    public String getExorderNumber() {
        return exorderNumber;
    }

    public void setExorderNumber(String exorderNumber) {
        this.exorderNumber = exorderNumber == null ? null : exorderNumber.trim();
    }
}
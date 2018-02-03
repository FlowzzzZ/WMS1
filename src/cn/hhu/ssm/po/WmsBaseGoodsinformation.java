package cn.hhu.ssm.po;

import java.util.Date;

public class WmsBaseGoodsinformation {
    private Integer goodsinformationId;

    private Integer shipperId;

    private Integer shipperauthorizationId;

    private String goodsNumber;

    private String goodsname;

    private Integer registrationId;

    private String registrationcode;

    private String specifiation;

    private String type;

    private String unit;

    private Float conversionrate;

    private Float length;

    private Float width;

    private Float high;

    private Integer productline;

    private Integer catalogId;

    private Integer manageclassification;

    private String packagingrequirement;

    private String storagerequirement;

    private Integer producerId;

    private String producerName;

    private Integer suppliersId;

    private Integer suppliersauthorizationId;

    private Integer supplierssaleId;

    private Integer firstbusiness;

    private Date makeorderdate;

    private Integer makeorderman;

    private Boolean isdeleted;

    private Boolean isreview;

    private Boolean issale;

    private String packagingunit;

    private String goodsbarcode;

    private Integer goodsspecies;

    private String origin;

    private String goodsdescribation;

    private String storagetransportationrequirement;

    private Float stmaxtemperature;

    private Float stmintemperature;

    private Integer coldchainproductidentification;

    private Integer ishomemade;

    private String sterilizingbatchnumber;

    private Float smaxtemperature;

    private Float smintemperature;

    private Float smaxhumidity;

    private Float sminhumidity;

    public Integer getGoodsinformationId() {
        return goodsinformationId;
    }

    public void setGoodsinformationId(Integer goodsinformationId) {
        this.goodsinformationId = goodsinformationId;
    }

    public Integer getShipperId() {
        return shipperId;
    }

    public void setShipperId(Integer shipperId) {
        this.shipperId = shipperId;
    }

    public Integer getShipperauthorizationId() {
        return shipperauthorizationId;
    }

    public void setShipperauthorizationId(Integer shipperauthorizationId) {
        this.shipperauthorizationId = shipperauthorizationId;
    }

    public String getGoodsNumber() {
        return goodsNumber;
    }

    public void setGoodsNumber(String goodsNumber) {
        this.goodsNumber = goodsNumber == null ? null : goodsNumber.trim();
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname == null ? null : goodsname.trim();
    }

    public Integer getRegistrationId() {
        return registrationId;
    }

    public void setRegistrationId(Integer registrationId) {
        this.registrationId = registrationId;
    }

    public String getRegistrationcode() {
        return registrationcode;
    }

    public void setRegistrationcode(String registrationcode) {
        this.registrationcode = registrationcode == null ? null : registrationcode.trim();
    }

    public String getSpecifiation() {
        return specifiation;
    }

    public void setSpecifiation(String specifiation) {
        this.specifiation = specifiation == null ? null : specifiation.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public Float getConversionrate() {
        return conversionrate;
    }

    public void setConversionrate(Float conversionrate) {
        this.conversionrate = conversionrate;
    }

    public Float getLength() {
        return length;
    }

    public void setLength(Float length) {
        this.length = length;
    }

    public Float getWidth() {
        return width;
    }

    public void setWidth(Float width) {
        this.width = width;
    }

    public Float getHigh() {
        return high;
    }

    public void setHigh(Float high) {
        this.high = high;
    }

    public Integer getProductline() {
        return productline;
    }

    public void setProductline(Integer productline) {
        this.productline = productline;
    }

    public Integer getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(Integer catalogId) {
        this.catalogId = catalogId;
    }

    public Integer getManageclassification() {
        return manageclassification;
    }

    public void setManageclassification(Integer manageclassification) {
        this.manageclassification = manageclassification;
    }

    public String getPackagingrequirement() {
        return packagingrequirement;
    }

    public void setPackagingrequirement(String packagingrequirement) {
        this.packagingrequirement = packagingrequirement == null ? null : packagingrequirement.trim();
    }

    public String getStoragerequirement() {
        return storagerequirement;
    }

    public void setStoragerequirement(String storagerequirement) {
        this.storagerequirement = storagerequirement == null ? null : storagerequirement.trim();
    }

    public Integer getProducerId() {
        return producerId;
    }

    public void setProducerId(Integer producerId) {
        this.producerId = producerId;
    }

    public String getProducerName() {
        return producerName;
    }

    public void setProducerName(String producerName) {
        this.producerName = producerName == null ? null : producerName.trim();
    }

    public Integer getSuppliersId() {
        return suppliersId;
    }

    public void setSuppliersId(Integer suppliersId) {
        this.suppliersId = suppliersId;
    }

    public Integer getSuppliersauthorizationId() {
        return suppliersauthorizationId;
    }

    public void setSuppliersauthorizationId(Integer suppliersauthorizationId) {
        this.suppliersauthorizationId = suppliersauthorizationId;
    }

    public Integer getSupplierssaleId() {
        return supplierssaleId;
    }

    public void setSupplierssaleId(Integer supplierssaleId) {
        this.supplierssaleId = supplierssaleId;
    }

    public Integer getFirstbusiness() {
        return firstbusiness;
    }

    public void setFirstbusiness(Integer firstbusiness) {
        this.firstbusiness = firstbusiness;
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

    public Boolean getIsdeleted() {
        return isdeleted;
    }

    public void setIsdeleted(Boolean isdeleted) {
        this.isdeleted = isdeleted;
    }

    public Boolean getIsreview() {
        return isreview;
    }

    public void setIsreview(Boolean isreview) {
        this.isreview = isreview;
    }

    public Boolean getIssale() {
        return issale;
    }

    public void setIssale(Boolean issale) {
        this.issale = issale;
    }

    public String getPackagingunit() {
        return packagingunit;
    }

    public void setPackagingunit(String packagingunit) {
        this.packagingunit = packagingunit == null ? null : packagingunit.trim();
    }

    public String getGoodsbarcode() {
        return goodsbarcode;
    }

    public void setGoodsbarcode(String goodsbarcode) {
        this.goodsbarcode = goodsbarcode == null ? null : goodsbarcode.trim();
    }

    public Integer getGoodsspecies() {
        return goodsspecies;
    }

    public void setGoodsspecies(Integer goodsspecies) {
        this.goodsspecies = goodsspecies;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin == null ? null : origin.trim();
    }

    public String getGoodsdescribation() {
        return goodsdescribation;
    }

    public void setGoodsdescribation(String goodsdescribation) {
        this.goodsdescribation = goodsdescribation == null ? null : goodsdescribation.trim();
    }

    public String getStoragetransportationrequirement() {
        return storagetransportationrequirement;
    }

    public void setStoragetransportationrequirement(String storagetransportationrequirement) {
        this.storagetransportationrequirement = storagetransportationrequirement == null ? null : storagetransportationrequirement.trim();
    }

    public Float getStmaxtemperature() {
        return stmaxtemperature;
    }

    public void setStmaxtemperature(Float stmaxtemperature) {
        this.stmaxtemperature = stmaxtemperature;
    }

    public Float getStmintemperature() {
        return stmintemperature;
    }

    public void setStmintemperature(Float stmintemperature) {
        this.stmintemperature = stmintemperature;
    }

    public Integer getColdchainproductidentification() {
        return coldchainproductidentification;
    }

    public void setColdchainproductidentification(Integer coldchainproductidentification) {
        this.coldchainproductidentification = coldchainproductidentification;
    }

    public Integer getIshomemade() {
        return ishomemade;
    }

    public void setIshomemade(Integer ishomemade) {
        this.ishomemade = ishomemade;
    }

    public String getSterilizingbatchnumber() {
        return sterilizingbatchnumber;
    }

    public void setSterilizingbatchnumber(String sterilizingbatchnumber) {
        this.sterilizingbatchnumber = sterilizingbatchnumber == null ? null : sterilizingbatchnumber.trim();
    }

    public Float getSmaxtemperature() {
        return smaxtemperature;
    }

    public void setSmaxtemperature(Float smaxtemperature) {
        this.smaxtemperature = smaxtemperature;
    }

    public Float getSmintemperature() {
        return smintemperature;
    }

    public void setSmintemperature(Float smintemperature) {
        this.smintemperature = smintemperature;
    }

    public Float getSmaxhumidity() {
        return smaxhumidity;
    }

    public void setSmaxhumidity(Float smaxhumidity) {
        this.smaxhumidity = smaxhumidity;
    }

    public Float getSminhumidity() {
        return sminhumidity;
    }

    public void setSminhumidity(Float sminhumidity) {
        this.sminhumidity = sminhumidity;
    }
}
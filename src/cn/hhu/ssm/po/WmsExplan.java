package cn.hhu.ssm.po;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import cn.hhu.ssm.common.BaseParam;

public class WmsExplan extends BaseParam{
	//货主名称
	private String clientname;
	
    public String getClientname() {
		return clientname;
	}

	public void setClientname(String clientname) {
		this.clientname = clientname;
	}
	//客服姓名
	private String servicename;
	
	public String getServicename() {
		return servicename;
	}

	public void setServicename(String servicename) {
		this.servicename = servicename;
	}
	//仓库name
	private String storehousename;
	
	
	public String getStorehousename() {
		return storehousename;
	}

	public void setStorehousename(String storehousename) {
		this.storehousename = storehousename;
	}
	private Integer explanId;

    private String explanNumber;

    private Integer shipperId;

    private Integer customerId;

    private String customername;

    private String fromaddress;

    private String toaddress;
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") 
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date exdate;

    private Integer businesstype;

    private Integer isbonded;

    private String storagetransportationrequirement;

    private Integer issupervision;

    private String customernumber;

    private String contactman;

    private String contacttel;

    private Integer planstatus;

    private Integer exorderquantity;

    private String remark;
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") 
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date makeorderdate;

    private Integer makeorderman;

    private Integer storehouseId;

    private String express;

    private String shippingmethod;

    private String clearingform;

    private String expressnumber;

    private Integer serviceId;

    public Integer getExplanId() {
        return explanId;
    }

    public void setExplanId(Integer explanId) {
        this.explanId = explanId;
    }

    public String getExplanNumber() {
        return explanNumber;
    }

    public void setExplanNumber(String explanNumber) {
        this.explanNumber = explanNumber == null ? null : explanNumber.trim();
    }

    public Integer getShipperId() {
        return shipperId;
    }

    public void setShipperId(Integer shipperId) {
        this.shipperId = shipperId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername == null ? null : customername.trim();
    }

    public String getFromaddress() {
        return fromaddress;
    }

    public void setFromaddress(String fromaddress) {
        this.fromaddress = fromaddress == null ? null : fromaddress.trim();
    }

    public String getToaddress() {
        return toaddress;
    }

    public void setToaddress(String toaddress) {
        this.toaddress = toaddress == null ? null : toaddress.trim();
    }

    public Date getExdate() {
        return exdate;
    }

    public void setExdate(Date exdate) {
        this.exdate = exdate;
    }

    public Integer getBusinesstype() {
        return businesstype;
    }

    public void setBusinesstype(Integer businesstype) {
        this.businesstype = businesstype;
    }

    public Integer getIsbonded() {
        return isbonded;
    }

    public void setIsbonded(Integer isbonded) {
        this.isbonded = isbonded;
    }

    public String getStoragetransportationrequirement() {
        return storagetransportationrequirement;
    }

    public void setStoragetransportationrequirement(String storagetransportationrequirement) {
        this.storagetransportationrequirement = storagetransportationrequirement == null ? null : storagetransportationrequirement.trim();
    }

    public Integer getIssupervision() {
        return issupervision;
    }

    public void setIssupervision(Integer issupervision) {
        this.issupervision = issupervision;
    }

    public String getCustomernumber() {
        return customernumber;
    }

    public void setCustomernumber(String customernumber) {
        this.customernumber = customernumber == null ? null : customernumber.trim();
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

    public Integer getPlanstatus() {
        return planstatus;
    }

    public void setPlanstatus(Integer planstatus) {
        this.planstatus = planstatus;
    }

    public Integer getExorderquantity() {
        return exorderquantity;
    }

    public void setExorderquantity(Integer exorderquantity) {
        this.exorderquantity = exorderquantity;
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

    public Integer getStorehouseId() {
        return storehouseId;
    }

    public void setStorehouseId(Integer storehouseId) {
        this.storehouseId = storehouseId;
    }

    public String getExpress() {
        return express;
    }

    public void setExpress(String express) {
        this.express = express == null ? null : express.trim();
    }

    public String getShippingmethod() {
        return shippingmethod;
    }

    public void setShippingmethod(String shippingmethod) {
        this.shippingmethod = shippingmethod == null ? null : shippingmethod.trim();
    }

    public String getClearingform() {
        return clearingform;
    }

    public void setClearingform(String clearingform) {
        this.clearingform = clearingform == null ? null : clearingform.trim();
    }

    public String getExpressnumber() {
        return expressnumber;
    }

    public void setExpressnumber(String expressnumber) {
        this.expressnumber = expressnumber == null ? null : expressnumber.trim();
    }

    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }
}
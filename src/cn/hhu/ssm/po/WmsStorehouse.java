package cn.hhu.ssm.po;

public class WmsStorehouse {
    private Integer storehousesId;

    private String storehousesNumber;

    private Integer parentstorehouseNumber;

    private String abbreviation;

    private String storehousename;

    private String registrationaddress;

    private String receivegoodsaddress;

    private String responsibleperson;

    private String contacttel;

    private String businesslicense;

    private String businessallowlance;

    private String remark;

    public Integer getStorehousesId() {
        return storehousesId;
    }

    public void setStorehousesId(Integer storehousesId) {
        this.storehousesId = storehousesId;
    }

    public String getStorehousesNumber() {
        return storehousesNumber;
    }

    public void setStorehousesNumber(String storehousesNumber) {
        this.storehousesNumber = storehousesNumber == null ? null : storehousesNumber.trim();
    }

    public Integer getParentstorehouseNumber() {
        return parentstorehouseNumber;
    }

    public void setParentstorehouseNumber(Integer parentstorehouseNumber) {
        this.parentstorehouseNumber = parentstorehouseNumber;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation == null ? null : abbreviation.trim();
    }

    public String getStorehousename() {
        return storehousename;
    }

    public void setStorehousename(String storehousename) {
        this.storehousename = storehousename == null ? null : storehousename.trim();
    }

    public String getRegistrationaddress() {
        return registrationaddress;
    }

    public void setRegistrationaddress(String registrationaddress) {
        this.registrationaddress = registrationaddress == null ? null : registrationaddress.trim();
    }

    public String getReceivegoodsaddress() {
        return receivegoodsaddress;
    }

    public void setReceivegoodsaddress(String receivegoodsaddress) {
        this.receivegoodsaddress = receivegoodsaddress == null ? null : receivegoodsaddress.trim();
    }

    public String getResponsibleperson() {
        return responsibleperson;
    }

    public void setResponsibleperson(String responsibleperson) {
        this.responsibleperson = responsibleperson == null ? null : responsibleperson.trim();
    }

    public String getContacttel() {
        return contacttel;
    }

    public void setContacttel(String contacttel) {
        this.contacttel = contacttel == null ? null : contacttel.trim();
    }

    public String getBusinesslicense() {
        return businesslicense;
    }

    public void setBusinesslicense(String businesslicense) {
        this.businesslicense = businesslicense == null ? null : businesslicense.trim();
    }

    public String getBusinessallowlance() {
        return businessallowlance;
    }

    public void setBusinessallowlance(String businessallowlance) {
        this.businessallowlance = businessallowlance == null ? null : businessallowlance.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}
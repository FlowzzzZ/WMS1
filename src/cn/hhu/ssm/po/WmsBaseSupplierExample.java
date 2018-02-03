package cn.hhu.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class WmsBaseSupplierExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WmsBaseSupplierExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andSupplierIdIsNull() {
            addCriterion("Supplier_ID is null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIsNotNull() {
            addCriterion("Supplier_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdEqualTo(Integer value) {
            addCriterion("Supplier_ID =", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotEqualTo(Integer value) {
            addCriterion("Supplier_ID <>", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThan(Integer value) {
            addCriterion("Supplier_ID >", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Supplier_ID >=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThan(Integer value) {
            addCriterion("Supplier_ID <", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThanOrEqualTo(Integer value) {
            addCriterion("Supplier_ID <=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIn(List<Integer> values) {
            addCriterion("Supplier_ID in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotIn(List<Integer> values) {
            addCriterion("Supplier_ID not in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdBetween(Integer value1, Integer value2) {
            addCriterion("Supplier_ID between", value1, value2, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Supplier_ID not between", value1, value2, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierNumberIsNull() {
            addCriterion("Supplier_Number is null");
            return (Criteria) this;
        }

        public Criteria andSupplierNumberIsNotNull() {
            addCriterion("Supplier_Number is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierNumberEqualTo(String value) {
            addCriterion("Supplier_Number =", value, "supplierNumber");
            return (Criteria) this;
        }

        public Criteria andSupplierNumberNotEqualTo(String value) {
            addCriterion("Supplier_Number <>", value, "supplierNumber");
            return (Criteria) this;
        }

        public Criteria andSupplierNumberGreaterThan(String value) {
            addCriterion("Supplier_Number >", value, "supplierNumber");
            return (Criteria) this;
        }

        public Criteria andSupplierNumberGreaterThanOrEqualTo(String value) {
            addCriterion("Supplier_Number >=", value, "supplierNumber");
            return (Criteria) this;
        }

        public Criteria andSupplierNumberLessThan(String value) {
            addCriterion("Supplier_Number <", value, "supplierNumber");
            return (Criteria) this;
        }

        public Criteria andSupplierNumberLessThanOrEqualTo(String value) {
            addCriterion("Supplier_Number <=", value, "supplierNumber");
            return (Criteria) this;
        }

        public Criteria andSupplierNumberLike(String value) {
            addCriterion("Supplier_Number like", value, "supplierNumber");
            return (Criteria) this;
        }

        public Criteria andSupplierNumberNotLike(String value) {
            addCriterion("Supplier_Number not like", value, "supplierNumber");
            return (Criteria) this;
        }

        public Criteria andSupplierNumberIn(List<String> values) {
            addCriterion("Supplier_Number in", values, "supplierNumber");
            return (Criteria) this;
        }

        public Criteria andSupplierNumberNotIn(List<String> values) {
            addCriterion("Supplier_Number not in", values, "supplierNumber");
            return (Criteria) this;
        }

        public Criteria andSupplierNumberBetween(String value1, String value2) {
            addCriterion("Supplier_Number between", value1, value2, "supplierNumber");
            return (Criteria) this;
        }

        public Criteria andSupplierNumberNotBetween(String value1, String value2) {
            addCriterion("Supplier_Number not between", value1, value2, "supplierNumber");
            return (Criteria) this;
        }

        public Criteria andSuppliercodeIsNull() {
            addCriterion("SupplierCode is null");
            return (Criteria) this;
        }

        public Criteria andSuppliercodeIsNotNull() {
            addCriterion("SupplierCode is not null");
            return (Criteria) this;
        }

        public Criteria andSuppliercodeEqualTo(String value) {
            addCriterion("SupplierCode =", value, "suppliercode");
            return (Criteria) this;
        }

        public Criteria andSuppliercodeNotEqualTo(String value) {
            addCriterion("SupplierCode <>", value, "suppliercode");
            return (Criteria) this;
        }

        public Criteria andSuppliercodeGreaterThan(String value) {
            addCriterion("SupplierCode >", value, "suppliercode");
            return (Criteria) this;
        }

        public Criteria andSuppliercodeGreaterThanOrEqualTo(String value) {
            addCriterion("SupplierCode >=", value, "suppliercode");
            return (Criteria) this;
        }

        public Criteria andSuppliercodeLessThan(String value) {
            addCriterion("SupplierCode <", value, "suppliercode");
            return (Criteria) this;
        }

        public Criteria andSuppliercodeLessThanOrEqualTo(String value) {
            addCriterion("SupplierCode <=", value, "suppliercode");
            return (Criteria) this;
        }

        public Criteria andSuppliercodeLike(String value) {
            addCriterion("SupplierCode like", value, "suppliercode");
            return (Criteria) this;
        }

        public Criteria andSuppliercodeNotLike(String value) {
            addCriterion("SupplierCode not like", value, "suppliercode");
            return (Criteria) this;
        }

        public Criteria andSuppliercodeIn(List<String> values) {
            addCriterion("SupplierCode in", values, "suppliercode");
            return (Criteria) this;
        }

        public Criteria andSuppliercodeNotIn(List<String> values) {
            addCriterion("SupplierCode not in", values, "suppliercode");
            return (Criteria) this;
        }

        public Criteria andSuppliercodeBetween(String value1, String value2) {
            addCriterion("SupplierCode between", value1, value2, "suppliercode");
            return (Criteria) this;
        }

        public Criteria andSuppliercodeNotBetween(String value1, String value2) {
            addCriterion("SupplierCode not between", value1, value2, "suppliercode");
            return (Criteria) this;
        }

        public Criteria andSuppliernameIsNull() {
            addCriterion("SupplierName is null");
            return (Criteria) this;
        }

        public Criteria andSuppliernameIsNotNull() {
            addCriterion("SupplierName is not null");
            return (Criteria) this;
        }

        public Criteria andSuppliernameEqualTo(String value) {
            addCriterion("SupplierName =", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameNotEqualTo(String value) {
            addCriterion("SupplierName <>", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameGreaterThan(String value) {
            addCriterion("SupplierName >", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameGreaterThanOrEqualTo(String value) {
            addCriterion("SupplierName >=", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameLessThan(String value) {
            addCriterion("SupplierName <", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameLessThanOrEqualTo(String value) {
            addCriterion("SupplierName <=", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameLike(String value) {
            addCriterion("SupplierName like", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameNotLike(String value) {
            addCriterion("SupplierName not like", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameIn(List<String> values) {
            addCriterion("SupplierName in", values, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameNotIn(List<String> values) {
            addCriterion("SupplierName not in", values, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameBetween(String value1, String value2) {
            addCriterion("SupplierName between", value1, value2, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameNotBetween(String value1, String value2) {
            addCriterion("SupplierName not between", value1, value2, "suppliername");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensenumberIsNull() {
            addCriterion("BusinessLicenseNumber is null");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensenumberIsNotNull() {
            addCriterion("BusinessLicenseNumber is not null");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensenumberEqualTo(String value) {
            addCriterion("BusinessLicenseNumber =", value, "businesslicensenumber");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensenumberNotEqualTo(String value) {
            addCriterion("BusinessLicenseNumber <>", value, "businesslicensenumber");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensenumberGreaterThan(String value) {
            addCriterion("BusinessLicenseNumber >", value, "businesslicensenumber");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensenumberGreaterThanOrEqualTo(String value) {
            addCriterion("BusinessLicenseNumber >=", value, "businesslicensenumber");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensenumberLessThan(String value) {
            addCriterion("BusinessLicenseNumber <", value, "businesslicensenumber");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensenumberLessThanOrEqualTo(String value) {
            addCriterion("BusinessLicenseNumber <=", value, "businesslicensenumber");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensenumberLike(String value) {
            addCriterion("BusinessLicenseNumber like", value, "businesslicensenumber");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensenumberNotLike(String value) {
            addCriterion("BusinessLicenseNumber not like", value, "businesslicensenumber");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensenumberIn(List<String> values) {
            addCriterion("BusinessLicenseNumber in", values, "businesslicensenumber");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensenumberNotIn(List<String> values) {
            addCriterion("BusinessLicenseNumber not in", values, "businesslicensenumber");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensenumberBetween(String value1, String value2) {
            addCriterion("BusinessLicenseNumber between", value1, value2, "businesslicensenumber");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensenumberNotBetween(String value1, String value2) {
            addCriterion("BusinessLicenseNumber not between", value1, value2, "businesslicensenumber");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensevalidityIsNull() {
            addCriterion("BusinessLicenseValidity is null");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensevalidityIsNotNull() {
            addCriterion("BusinessLicenseValidity is not null");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensevalidityEqualTo(Date value) {
            addCriterion("BusinessLicenseValidity =", value, "businesslicensevalidity");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensevalidityNotEqualTo(Date value) {
            addCriterion("BusinessLicenseValidity <>", value, "businesslicensevalidity");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensevalidityGreaterThan(Date value) {
            addCriterion("BusinessLicenseValidity >", value, "businesslicensevalidity");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensevalidityGreaterThanOrEqualTo(Date value) {
            addCriterion("BusinessLicenseValidity >=", value, "businesslicensevalidity");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensevalidityLessThan(Date value) {
            addCriterion("BusinessLicenseValidity <", value, "businesslicensevalidity");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensevalidityLessThanOrEqualTo(Date value) {
            addCriterion("BusinessLicenseValidity <=", value, "businesslicensevalidity");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensevalidityIn(List<Date> values) {
            addCriterion("BusinessLicenseValidity in", values, "businesslicensevalidity");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensevalidityNotIn(List<Date> values) {
            addCriterion("BusinessLicenseValidity not in", values, "businesslicensevalidity");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensevalidityBetween(Date value1, Date value2) {
            addCriterion("BusinessLicenseValidity between", value1, value2, "businesslicensevalidity");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensevalidityNotBetween(Date value1, Date value2) {
            addCriterion("BusinessLicenseValidity not between", value1, value2, "businesslicensevalidity");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensepictureIsNull() {
            addCriterion("BusinessLicensePicture is null");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensepictureIsNotNull() {
            addCriterion("BusinessLicensePicture is not null");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensepictureEqualTo(String value) {
            addCriterion("BusinessLicensePicture =", value, "businesslicensepicture");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensepictureNotEqualTo(String value) {
            addCriterion("BusinessLicensePicture <>", value, "businesslicensepicture");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensepictureGreaterThan(String value) {
            addCriterion("BusinessLicensePicture >", value, "businesslicensepicture");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensepictureGreaterThanOrEqualTo(String value) {
            addCriterion("BusinessLicensePicture >=", value, "businesslicensepicture");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensepictureLessThan(String value) {
            addCriterion("BusinessLicensePicture <", value, "businesslicensepicture");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensepictureLessThanOrEqualTo(String value) {
            addCriterion("BusinessLicensePicture <=", value, "businesslicensepicture");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensepictureLike(String value) {
            addCriterion("BusinessLicensePicture like", value, "businesslicensepicture");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensepictureNotLike(String value) {
            addCriterion("BusinessLicensePicture not like", value, "businesslicensepicture");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensepictureIn(List<String> values) {
            addCriterion("BusinessLicensePicture in", values, "businesslicensepicture");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensepictureNotIn(List<String> values) {
            addCriterion("BusinessLicensePicture not in", values, "businesslicensepicture");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensepictureBetween(String value1, String value2) {
            addCriterion("BusinessLicensePicture between", value1, value2, "businesslicensepicture");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensepictureNotBetween(String value1, String value2) {
            addCriterion("BusinessLicensePicture not between", value1, value2, "businesslicensepicture");
            return (Criteria) this;
        }

        public Criteria andBusinesscertificatenumberIsNull() {
            addCriterion("BusinessCertificateNumber is null");
            return (Criteria) this;
        }

        public Criteria andBusinesscertificatenumberIsNotNull() {
            addCriterion("BusinessCertificateNumber is not null");
            return (Criteria) this;
        }

        public Criteria andBusinesscertificatenumberEqualTo(String value) {
            addCriterion("BusinessCertificateNumber =", value, "businesscertificatenumber");
            return (Criteria) this;
        }

        public Criteria andBusinesscertificatenumberNotEqualTo(String value) {
            addCriterion("BusinessCertificateNumber <>", value, "businesscertificatenumber");
            return (Criteria) this;
        }

        public Criteria andBusinesscertificatenumberGreaterThan(String value) {
            addCriterion("BusinessCertificateNumber >", value, "businesscertificatenumber");
            return (Criteria) this;
        }

        public Criteria andBusinesscertificatenumberGreaterThanOrEqualTo(String value) {
            addCriterion("BusinessCertificateNumber >=", value, "businesscertificatenumber");
            return (Criteria) this;
        }

        public Criteria andBusinesscertificatenumberLessThan(String value) {
            addCriterion("BusinessCertificateNumber <", value, "businesscertificatenumber");
            return (Criteria) this;
        }

        public Criteria andBusinesscertificatenumberLessThanOrEqualTo(String value) {
            addCriterion("BusinessCertificateNumber <=", value, "businesscertificatenumber");
            return (Criteria) this;
        }

        public Criteria andBusinesscertificatenumberLike(String value) {
            addCriterion("BusinessCertificateNumber like", value, "businesscertificatenumber");
            return (Criteria) this;
        }

        public Criteria andBusinesscertificatenumberNotLike(String value) {
            addCriterion("BusinessCertificateNumber not like", value, "businesscertificatenumber");
            return (Criteria) this;
        }

        public Criteria andBusinesscertificatenumberIn(List<String> values) {
            addCriterion("BusinessCertificateNumber in", values, "businesscertificatenumber");
            return (Criteria) this;
        }

        public Criteria andBusinesscertificatenumberNotIn(List<String> values) {
            addCriterion("BusinessCertificateNumber not in", values, "businesscertificatenumber");
            return (Criteria) this;
        }

        public Criteria andBusinesscertificatenumberBetween(String value1, String value2) {
            addCriterion("BusinessCertificateNumber between", value1, value2, "businesscertificatenumber");
            return (Criteria) this;
        }

        public Criteria andBusinesscertificatenumberNotBetween(String value1, String value2) {
            addCriterion("BusinessCertificateNumber not between", value1, value2, "businesscertificatenumber");
            return (Criteria) this;
        }

        public Criteria andBusinesscertificatevalidityIsNull() {
            addCriterion("BusinessCertificateValidity is null");
            return (Criteria) this;
        }

        public Criteria andBusinesscertificatevalidityIsNotNull() {
            addCriterion("BusinessCertificateValidity is not null");
            return (Criteria) this;
        }

        public Criteria andBusinesscertificatevalidityEqualTo(Date value) {
            addCriterion("BusinessCertificateValidity =", value, "businesscertificatevalidity");
            return (Criteria) this;
        }

        public Criteria andBusinesscertificatevalidityNotEqualTo(Date value) {
            addCriterion("BusinessCertificateValidity <>", value, "businesscertificatevalidity");
            return (Criteria) this;
        }

        public Criteria andBusinesscertificatevalidityGreaterThan(Date value) {
            addCriterion("BusinessCertificateValidity >", value, "businesscertificatevalidity");
            return (Criteria) this;
        }

        public Criteria andBusinesscertificatevalidityGreaterThanOrEqualTo(Date value) {
            addCriterion("BusinessCertificateValidity >=", value, "businesscertificatevalidity");
            return (Criteria) this;
        }

        public Criteria andBusinesscertificatevalidityLessThan(Date value) {
            addCriterion("BusinessCertificateValidity <", value, "businesscertificatevalidity");
            return (Criteria) this;
        }

        public Criteria andBusinesscertificatevalidityLessThanOrEqualTo(Date value) {
            addCriterion("BusinessCertificateValidity <=", value, "businesscertificatevalidity");
            return (Criteria) this;
        }

        public Criteria andBusinesscertificatevalidityIn(List<Date> values) {
            addCriterion("BusinessCertificateValidity in", values, "businesscertificatevalidity");
            return (Criteria) this;
        }

        public Criteria andBusinesscertificatevalidityNotIn(List<Date> values) {
            addCriterion("BusinessCertificateValidity not in", values, "businesscertificatevalidity");
            return (Criteria) this;
        }

        public Criteria andBusinesscertificatevalidityBetween(Date value1, Date value2) {
            addCriterion("BusinessCertificateValidity between", value1, value2, "businesscertificatevalidity");
            return (Criteria) this;
        }

        public Criteria andBusinesscertificatevalidityNotBetween(Date value1, Date value2) {
            addCriterion("BusinessCertificateValidity not between", value1, value2, "businesscertificatevalidity");
            return (Criteria) this;
        }

        public Criteria andBusinesscertificatepictureIsNull() {
            addCriterion("BusinessCertificatePicture is null");
            return (Criteria) this;
        }

        public Criteria andBusinesscertificatepictureIsNotNull() {
            addCriterion("BusinessCertificatePicture is not null");
            return (Criteria) this;
        }

        public Criteria andBusinesscertificatepictureEqualTo(String value) {
            addCriterion("BusinessCertificatePicture =", value, "businesscertificatepicture");
            return (Criteria) this;
        }

        public Criteria andBusinesscertificatepictureNotEqualTo(String value) {
            addCriterion("BusinessCertificatePicture <>", value, "businesscertificatepicture");
            return (Criteria) this;
        }

        public Criteria andBusinesscertificatepictureGreaterThan(String value) {
            addCriterion("BusinessCertificatePicture >", value, "businesscertificatepicture");
            return (Criteria) this;
        }

        public Criteria andBusinesscertificatepictureGreaterThanOrEqualTo(String value) {
            addCriterion("BusinessCertificatePicture >=", value, "businesscertificatepicture");
            return (Criteria) this;
        }

        public Criteria andBusinesscertificatepictureLessThan(String value) {
            addCriterion("BusinessCertificatePicture <", value, "businesscertificatepicture");
            return (Criteria) this;
        }

        public Criteria andBusinesscertificatepictureLessThanOrEqualTo(String value) {
            addCriterion("BusinessCertificatePicture <=", value, "businesscertificatepicture");
            return (Criteria) this;
        }

        public Criteria andBusinesscertificatepictureLike(String value) {
            addCriterion("BusinessCertificatePicture like", value, "businesscertificatepicture");
            return (Criteria) this;
        }

        public Criteria andBusinesscertificatepictureNotLike(String value) {
            addCriterion("BusinessCertificatePicture not like", value, "businesscertificatepicture");
            return (Criteria) this;
        }

        public Criteria andBusinesscertificatepictureIn(List<String> values) {
            addCriterion("BusinessCertificatePicture in", values, "businesscertificatepicture");
            return (Criteria) this;
        }

        public Criteria andBusinesscertificatepictureNotIn(List<String> values) {
            addCriterion("BusinessCertificatePicture not in", values, "businesscertificatepicture");
            return (Criteria) this;
        }

        public Criteria andBusinesscertificatepictureBetween(String value1, String value2) {
            addCriterion("BusinessCertificatePicture between", value1, value2, "businesscertificatepicture");
            return (Criteria) this;
        }

        public Criteria andBusinesscertificatepictureNotBetween(String value1, String value2) {
            addCriterion("BusinessCertificatePicture not between", value1, value2, "businesscertificatepicture");
            return (Criteria) this;
        }

        public Criteria andBusinessscopeIsNull() {
            addCriterion("BusinessScope is null");
            return (Criteria) this;
        }

        public Criteria andBusinessscopeIsNotNull() {
            addCriterion("BusinessScope is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessscopeEqualTo(String value) {
            addCriterion("BusinessScope =", value, "businessscope");
            return (Criteria) this;
        }

        public Criteria andBusinessscopeNotEqualTo(String value) {
            addCriterion("BusinessScope <>", value, "businessscope");
            return (Criteria) this;
        }

        public Criteria andBusinessscopeGreaterThan(String value) {
            addCriterion("BusinessScope >", value, "businessscope");
            return (Criteria) this;
        }

        public Criteria andBusinessscopeGreaterThanOrEqualTo(String value) {
            addCriterion("BusinessScope >=", value, "businessscope");
            return (Criteria) this;
        }

        public Criteria andBusinessscopeLessThan(String value) {
            addCriterion("BusinessScope <", value, "businessscope");
            return (Criteria) this;
        }

        public Criteria andBusinessscopeLessThanOrEqualTo(String value) {
            addCriterion("BusinessScope <=", value, "businessscope");
            return (Criteria) this;
        }

        public Criteria andBusinessscopeLike(String value) {
            addCriterion("BusinessScope like", value, "businessscope");
            return (Criteria) this;
        }

        public Criteria andBusinessscopeNotLike(String value) {
            addCriterion("BusinessScope not like", value, "businessscope");
            return (Criteria) this;
        }

        public Criteria andBusinessscopeIn(List<String> values) {
            addCriterion("BusinessScope in", values, "businessscope");
            return (Criteria) this;
        }

        public Criteria andBusinessscopeNotIn(List<String> values) {
            addCriterion("BusinessScope not in", values, "businessscope");
            return (Criteria) this;
        }

        public Criteria andBusinessscopeBetween(String value1, String value2) {
            addCriterion("BusinessScope between", value1, value2, "businessscope");
            return (Criteria) this;
        }

        public Criteria andBusinessscopeNotBetween(String value1, String value2) {
            addCriterion("BusinessScope not between", value1, value2, "businessscope");
            return (Criteria) this;
        }

        public Criteria andBusinessscopecodeIsNull() {
            addCriterion("BusinessScopeCode is null");
            return (Criteria) this;
        }

        public Criteria andBusinessscopecodeIsNotNull() {
            addCriterion("BusinessScopeCode is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessscopecodeEqualTo(String value) {
            addCriterion("BusinessScopeCode =", value, "businessscopecode");
            return (Criteria) this;
        }

        public Criteria andBusinessscopecodeNotEqualTo(String value) {
            addCriterion("BusinessScopeCode <>", value, "businessscopecode");
            return (Criteria) this;
        }

        public Criteria andBusinessscopecodeGreaterThan(String value) {
            addCriterion("BusinessScopeCode >", value, "businessscopecode");
            return (Criteria) this;
        }

        public Criteria andBusinessscopecodeGreaterThanOrEqualTo(String value) {
            addCriterion("BusinessScopeCode >=", value, "businessscopecode");
            return (Criteria) this;
        }

        public Criteria andBusinessscopecodeLessThan(String value) {
            addCriterion("BusinessScopeCode <", value, "businessscopecode");
            return (Criteria) this;
        }

        public Criteria andBusinessscopecodeLessThanOrEqualTo(String value) {
            addCriterion("BusinessScopeCode <=", value, "businessscopecode");
            return (Criteria) this;
        }

        public Criteria andBusinessscopecodeLike(String value) {
            addCriterion("BusinessScopeCode like", value, "businessscopecode");
            return (Criteria) this;
        }

        public Criteria andBusinessscopecodeNotLike(String value) {
            addCriterion("BusinessScopeCode not like", value, "businessscopecode");
            return (Criteria) this;
        }

        public Criteria andBusinessscopecodeIn(List<String> values) {
            addCriterion("BusinessScopeCode in", values, "businessscopecode");
            return (Criteria) this;
        }

        public Criteria andBusinessscopecodeNotIn(List<String> values) {
            addCriterion("BusinessScopeCode not in", values, "businessscopecode");
            return (Criteria) this;
        }

        public Criteria andBusinessscopecodeBetween(String value1, String value2) {
            addCriterion("BusinessScopeCode between", value1, value2, "businessscopecode");
            return (Criteria) this;
        }

        public Criteria andBusinessscopecodeNotBetween(String value1, String value2) {
            addCriterion("BusinessScopeCode not between", value1, value2, "businessscopecode");
            return (Criteria) this;
        }

        public Criteria andFirstbusinessIsNull() {
            addCriterion("FirstBusiness is null");
            return (Criteria) this;
        }

        public Criteria andFirstbusinessIsNotNull() {
            addCriterion("FirstBusiness is not null");
            return (Criteria) this;
        }

        public Criteria andFirstbusinessEqualTo(Integer value) {
            addCriterion("FirstBusiness =", value, "firstbusiness");
            return (Criteria) this;
        }

        public Criteria andFirstbusinessNotEqualTo(Integer value) {
            addCriterion("FirstBusiness <>", value, "firstbusiness");
            return (Criteria) this;
        }

        public Criteria andFirstbusinessGreaterThan(Integer value) {
            addCriterion("FirstBusiness >", value, "firstbusiness");
            return (Criteria) this;
        }

        public Criteria andFirstbusinessGreaterThanOrEqualTo(Integer value) {
            addCriterion("FirstBusiness >=", value, "firstbusiness");
            return (Criteria) this;
        }

        public Criteria andFirstbusinessLessThan(Integer value) {
            addCriterion("FirstBusiness <", value, "firstbusiness");
            return (Criteria) this;
        }

        public Criteria andFirstbusinessLessThanOrEqualTo(Integer value) {
            addCriterion("FirstBusiness <=", value, "firstbusiness");
            return (Criteria) this;
        }

        public Criteria andFirstbusinessIn(List<Integer> values) {
            addCriterion("FirstBusiness in", values, "firstbusiness");
            return (Criteria) this;
        }

        public Criteria andFirstbusinessNotIn(List<Integer> values) {
            addCriterion("FirstBusiness not in", values, "firstbusiness");
            return (Criteria) this;
        }

        public Criteria andFirstbusinessBetween(Integer value1, Integer value2) {
            addCriterion("FirstBusiness between", value1, value2, "firstbusiness");
            return (Criteria) this;
        }

        public Criteria andFirstbusinessNotBetween(Integer value1, Integer value2) {
            addCriterion("FirstBusiness not between", value1, value2, "firstbusiness");
            return (Criteria) this;
        }

        public Criteria andMakeorderdateIsNull() {
            addCriterion("MakeOrderDate is null");
            return (Criteria) this;
        }

        public Criteria andMakeorderdateIsNotNull() {
            addCriterion("MakeOrderDate is not null");
            return (Criteria) this;
        }

        public Criteria andMakeorderdateEqualTo(Date value) {
            addCriterion("MakeOrderDate =", value, "makeorderdate");
            return (Criteria) this;
        }

        public Criteria andMakeorderdateNotEqualTo(Date value) {
            addCriterion("MakeOrderDate <>", value, "makeorderdate");
            return (Criteria) this;
        }

        public Criteria andMakeorderdateGreaterThan(Date value) {
            addCriterion("MakeOrderDate >", value, "makeorderdate");
            return (Criteria) this;
        }

        public Criteria andMakeorderdateGreaterThanOrEqualTo(Date value) {
            addCriterion("MakeOrderDate >=", value, "makeorderdate");
            return (Criteria) this;
        }

        public Criteria andMakeorderdateLessThan(Date value) {
            addCriterion("MakeOrderDate <", value, "makeorderdate");
            return (Criteria) this;
        }

        public Criteria andMakeorderdateLessThanOrEqualTo(Date value) {
            addCriterion("MakeOrderDate <=", value, "makeorderdate");
            return (Criteria) this;
        }

        public Criteria andMakeorderdateIn(List<Date> values) {
            addCriterion("MakeOrderDate in", values, "makeorderdate");
            return (Criteria) this;
        }

        public Criteria andMakeorderdateNotIn(List<Date> values) {
            addCriterion("MakeOrderDate not in", values, "makeorderdate");
            return (Criteria) this;
        }

        public Criteria andMakeorderdateBetween(Date value1, Date value2) {
            addCriterion("MakeOrderDate between", value1, value2, "makeorderdate");
            return (Criteria) this;
        }

        public Criteria andMakeorderdateNotBetween(Date value1, Date value2) {
            addCriterion("MakeOrderDate not between", value1, value2, "makeorderdate");
            return (Criteria) this;
        }

        public Criteria andMakeordermanIsNull() {
            addCriterion("makeOrderMan is null");
            return (Criteria) this;
        }

        public Criteria andMakeordermanIsNotNull() {
            addCriterion("makeOrderMan is not null");
            return (Criteria) this;
        }

        public Criteria andMakeordermanEqualTo(Integer value) {
            addCriterion("makeOrderMan =", value, "makeorderman");
            return (Criteria) this;
        }

        public Criteria andMakeordermanNotEqualTo(Integer value) {
            addCriterion("makeOrderMan <>", value, "makeorderman");
            return (Criteria) this;
        }

        public Criteria andMakeordermanGreaterThan(Integer value) {
            addCriterion("makeOrderMan >", value, "makeorderman");
            return (Criteria) this;
        }

        public Criteria andMakeordermanGreaterThanOrEqualTo(Integer value) {
            addCriterion("makeOrderMan >=", value, "makeorderman");
            return (Criteria) this;
        }

        public Criteria andMakeordermanLessThan(Integer value) {
            addCriterion("makeOrderMan <", value, "makeorderman");
            return (Criteria) this;
        }

        public Criteria andMakeordermanLessThanOrEqualTo(Integer value) {
            addCriterion("makeOrderMan <=", value, "makeorderman");
            return (Criteria) this;
        }

        public Criteria andMakeordermanIn(List<Integer> values) {
            addCriterion("makeOrderMan in", values, "makeorderman");
            return (Criteria) this;
        }

        public Criteria andMakeordermanNotIn(List<Integer> values) {
            addCriterion("makeOrderMan not in", values, "makeorderman");
            return (Criteria) this;
        }

        public Criteria andMakeordermanBetween(Integer value1, Integer value2) {
            addCriterion("makeOrderMan between", value1, value2, "makeorderman");
            return (Criteria) this;
        }

        public Criteria andMakeordermanNotBetween(Integer value1, Integer value2) {
            addCriterion("makeOrderMan not between", value1, value2, "makeorderman");
            return (Criteria) this;
        }

        public Criteria andIsreviewIsNull() {
            addCriterion("IsReview is null");
            return (Criteria) this;
        }

        public Criteria andIsreviewIsNotNull() {
            addCriterion("IsReview is not null");
            return (Criteria) this;
        }

        public Criteria andIsreviewEqualTo(Integer value) {
            addCriterion("IsReview =", value, "isreview");
            return (Criteria) this;
        }

        public Criteria andIsreviewNotEqualTo(Integer value) {
            addCriterion("IsReview <>", value, "isreview");
            return (Criteria) this;
        }

        public Criteria andIsreviewGreaterThan(Integer value) {
            addCriterion("IsReview >", value, "isreview");
            return (Criteria) this;
        }

        public Criteria andIsreviewGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsReview >=", value, "isreview");
            return (Criteria) this;
        }

        public Criteria andIsreviewLessThan(Integer value) {
            addCriterion("IsReview <", value, "isreview");
            return (Criteria) this;
        }

        public Criteria andIsreviewLessThanOrEqualTo(Integer value) {
            addCriterion("IsReview <=", value, "isreview");
            return (Criteria) this;
        }

        public Criteria andIsreviewIn(List<Integer> values) {
            addCriterion("IsReview in", values, "isreview");
            return (Criteria) this;
        }

        public Criteria andIsreviewNotIn(List<Integer> values) {
            addCriterion("IsReview not in", values, "isreview");
            return (Criteria) this;
        }

        public Criteria andIsreviewBetween(Integer value1, Integer value2) {
            addCriterion("IsReview between", value1, value2, "isreview");
            return (Criteria) this;
        }

        public Criteria andIsreviewNotBetween(Integer value1, Integer value2) {
            addCriterion("IsReview not between", value1, value2, "isreview");
            return (Criteria) this;
        }

        public Criteria andCooperationstatusIsNull() {
            addCriterion("CooperationStatus is null");
            return (Criteria) this;
        }

        public Criteria andCooperationstatusIsNotNull() {
            addCriterion("CooperationStatus is not null");
            return (Criteria) this;
        }

        public Criteria andCooperationstatusEqualTo(Integer value) {
            addCriterion("CooperationStatus =", value, "cooperationstatus");
            return (Criteria) this;
        }

        public Criteria andCooperationstatusNotEqualTo(Integer value) {
            addCriterion("CooperationStatus <>", value, "cooperationstatus");
            return (Criteria) this;
        }

        public Criteria andCooperationstatusGreaterThan(Integer value) {
            addCriterion("CooperationStatus >", value, "cooperationstatus");
            return (Criteria) this;
        }

        public Criteria andCooperationstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("CooperationStatus >=", value, "cooperationstatus");
            return (Criteria) this;
        }

        public Criteria andCooperationstatusLessThan(Integer value) {
            addCriterion("CooperationStatus <", value, "cooperationstatus");
            return (Criteria) this;
        }

        public Criteria andCooperationstatusLessThanOrEqualTo(Integer value) {
            addCriterion("CooperationStatus <=", value, "cooperationstatus");
            return (Criteria) this;
        }

        public Criteria andCooperationstatusIn(List<Integer> values) {
            addCriterion("CooperationStatus in", values, "cooperationstatus");
            return (Criteria) this;
        }

        public Criteria andCooperationstatusNotIn(List<Integer> values) {
            addCriterion("CooperationStatus not in", values, "cooperationstatus");
            return (Criteria) this;
        }

        public Criteria andCooperationstatusBetween(Integer value1, Integer value2) {
            addCriterion("CooperationStatus between", value1, value2, "cooperationstatus");
            return (Criteria) this;
        }

        public Criteria andCooperationstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("CooperationStatus not between", value1, value2, "cooperationstatus");
            return (Criteria) this;
        }

        public Criteria andRecordnumberIsNull() {
            addCriterion("RecordNumber is null");
            return (Criteria) this;
        }

        public Criteria andRecordnumberIsNotNull() {
            addCriterion("RecordNumber is not null");
            return (Criteria) this;
        }

        public Criteria andRecordnumberEqualTo(String value) {
            addCriterion("RecordNumber =", value, "recordnumber");
            return (Criteria) this;
        }

        public Criteria andRecordnumberNotEqualTo(String value) {
            addCriterion("RecordNumber <>", value, "recordnumber");
            return (Criteria) this;
        }

        public Criteria andRecordnumberGreaterThan(String value) {
            addCriterion("RecordNumber >", value, "recordnumber");
            return (Criteria) this;
        }

        public Criteria andRecordnumberGreaterThanOrEqualTo(String value) {
            addCriterion("RecordNumber >=", value, "recordnumber");
            return (Criteria) this;
        }

        public Criteria andRecordnumberLessThan(String value) {
            addCriterion("RecordNumber <", value, "recordnumber");
            return (Criteria) this;
        }

        public Criteria andRecordnumberLessThanOrEqualTo(String value) {
            addCriterion("RecordNumber <=", value, "recordnumber");
            return (Criteria) this;
        }

        public Criteria andRecordnumberLike(String value) {
            addCriterion("RecordNumber like", value, "recordnumber");
            return (Criteria) this;
        }

        public Criteria andRecordnumberNotLike(String value) {
            addCriterion("RecordNumber not like", value, "recordnumber");
            return (Criteria) this;
        }

        public Criteria andRecordnumberIn(List<String> values) {
            addCriterion("RecordNumber in", values, "recordnumber");
            return (Criteria) this;
        }

        public Criteria andRecordnumberNotIn(List<String> values) {
            addCriterion("RecordNumber not in", values, "recordnumber");
            return (Criteria) this;
        }

        public Criteria andRecordnumberBetween(String value1, String value2) {
            addCriterion("RecordNumber between", value1, value2, "recordnumber");
            return (Criteria) this;
        }

        public Criteria andRecordnumberNotBetween(String value1, String value2) {
            addCriterion("RecordNumber not between", value1, value2, "recordnumber");
            return (Criteria) this;
        }

        public Criteria andRecordvalidityIsNull() {
            addCriterion("RecordValidity is null");
            return (Criteria) this;
        }

        public Criteria andRecordvalidityIsNotNull() {
            addCriterion("RecordValidity is not null");
            return (Criteria) this;
        }

        public Criteria andRecordvalidityEqualTo(Date value) {
            addCriterion("RecordValidity =", value, "recordvalidity");
            return (Criteria) this;
        }

        public Criteria andRecordvalidityNotEqualTo(Date value) {
            addCriterion("RecordValidity <>", value, "recordvalidity");
            return (Criteria) this;
        }

        public Criteria andRecordvalidityGreaterThan(Date value) {
            addCriterion("RecordValidity >", value, "recordvalidity");
            return (Criteria) this;
        }

        public Criteria andRecordvalidityGreaterThanOrEqualTo(Date value) {
            addCriterion("RecordValidity >=", value, "recordvalidity");
            return (Criteria) this;
        }

        public Criteria andRecordvalidityLessThan(Date value) {
            addCriterion("RecordValidity <", value, "recordvalidity");
            return (Criteria) this;
        }

        public Criteria andRecordvalidityLessThanOrEqualTo(Date value) {
            addCriterion("RecordValidity <=", value, "recordvalidity");
            return (Criteria) this;
        }

        public Criteria andRecordvalidityIn(List<Date> values) {
            addCriterion("RecordValidity in", values, "recordvalidity");
            return (Criteria) this;
        }

        public Criteria andRecordvalidityNotIn(List<Date> values) {
            addCriterion("RecordValidity not in", values, "recordvalidity");
            return (Criteria) this;
        }

        public Criteria andRecordvalidityBetween(Date value1, Date value2) {
            addCriterion("RecordValidity between", value1, value2, "recordvalidity");
            return (Criteria) this;
        }

        public Criteria andRecordvalidityNotBetween(Date value1, Date value2) {
            addCriterion("RecordValidity not between", value1, value2, "recordvalidity");
            return (Criteria) this;
        }

        public Criteria andRecordapprovedateIsNull() {
            addCriterion("RecordApproveDate is null");
            return (Criteria) this;
        }

        public Criteria andRecordapprovedateIsNotNull() {
            addCriterion("RecordApproveDate is not null");
            return (Criteria) this;
        }

        public Criteria andRecordapprovedateEqualTo(Date value) {
            addCriterion("RecordApproveDate =", value, "recordapprovedate");
            return (Criteria) this;
        }

        public Criteria andRecordapprovedateNotEqualTo(Date value) {
            addCriterion("RecordApproveDate <>", value, "recordapprovedate");
            return (Criteria) this;
        }

        public Criteria andRecordapprovedateGreaterThan(Date value) {
            addCriterion("RecordApproveDate >", value, "recordapprovedate");
            return (Criteria) this;
        }

        public Criteria andRecordapprovedateGreaterThanOrEqualTo(Date value) {
            addCriterion("RecordApproveDate >=", value, "recordapprovedate");
            return (Criteria) this;
        }

        public Criteria andRecordapprovedateLessThan(Date value) {
            addCriterion("RecordApproveDate <", value, "recordapprovedate");
            return (Criteria) this;
        }

        public Criteria andRecordapprovedateLessThanOrEqualTo(Date value) {
            addCriterion("RecordApproveDate <=", value, "recordapprovedate");
            return (Criteria) this;
        }

        public Criteria andRecordapprovedateIn(List<Date> values) {
            addCriterion("RecordApproveDate in", values, "recordapprovedate");
            return (Criteria) this;
        }

        public Criteria andRecordapprovedateNotIn(List<Date> values) {
            addCriterion("RecordApproveDate not in", values, "recordapprovedate");
            return (Criteria) this;
        }

        public Criteria andRecordapprovedateBetween(Date value1, Date value2) {
            addCriterion("RecordApproveDate between", value1, value2, "recordapprovedate");
            return (Criteria) this;
        }

        public Criteria andRecordapprovedateNotBetween(Date value1, Date value2) {
            addCriterion("RecordApproveDate not between", value1, value2, "recordapprovedate");
            return (Criteria) this;
        }

        public Criteria andRecordissuingauthorityIsNull() {
            addCriterion("RecordIssuingAuthority is null");
            return (Criteria) this;
        }

        public Criteria andRecordissuingauthorityIsNotNull() {
            addCriterion("RecordIssuingAuthority is not null");
            return (Criteria) this;
        }

        public Criteria andRecordissuingauthorityEqualTo(String value) {
            addCriterion("RecordIssuingAuthority =", value, "recordissuingauthority");
            return (Criteria) this;
        }

        public Criteria andRecordissuingauthorityNotEqualTo(String value) {
            addCriterion("RecordIssuingAuthority <>", value, "recordissuingauthority");
            return (Criteria) this;
        }

        public Criteria andRecordissuingauthorityGreaterThan(String value) {
            addCriterion("RecordIssuingAuthority >", value, "recordissuingauthority");
            return (Criteria) this;
        }

        public Criteria andRecordissuingauthorityGreaterThanOrEqualTo(String value) {
            addCriterion("RecordIssuingAuthority >=", value, "recordissuingauthority");
            return (Criteria) this;
        }

        public Criteria andRecordissuingauthorityLessThan(String value) {
            addCriterion("RecordIssuingAuthority <", value, "recordissuingauthority");
            return (Criteria) this;
        }

        public Criteria andRecordissuingauthorityLessThanOrEqualTo(String value) {
            addCriterion("RecordIssuingAuthority <=", value, "recordissuingauthority");
            return (Criteria) this;
        }

        public Criteria andRecordissuingauthorityLike(String value) {
            addCriterion("RecordIssuingAuthority like", value, "recordissuingauthority");
            return (Criteria) this;
        }

        public Criteria andRecordissuingauthorityNotLike(String value) {
            addCriterion("RecordIssuingAuthority not like", value, "recordissuingauthority");
            return (Criteria) this;
        }

        public Criteria andRecordissuingauthorityIn(List<String> values) {
            addCriterion("RecordIssuingAuthority in", values, "recordissuingauthority");
            return (Criteria) this;
        }

        public Criteria andRecordissuingauthorityNotIn(List<String> values) {
            addCriterion("RecordIssuingAuthority not in", values, "recordissuingauthority");
            return (Criteria) this;
        }

        public Criteria andRecordissuingauthorityBetween(String value1, String value2) {
            addCriterion("RecordIssuingAuthority between", value1, value2, "recordissuingauthority");
            return (Criteria) this;
        }

        public Criteria andRecordissuingauthorityNotBetween(String value1, String value2) {
            addCriterion("RecordIssuingAuthority not between", value1, value2, "recordissuingauthority");
            return (Criteria) this;
        }

        public Criteria andRecordpictureIsNull() {
            addCriterion("RecordPicture is null");
            return (Criteria) this;
        }

        public Criteria andRecordpictureIsNotNull() {
            addCriterion("RecordPicture is not null");
            return (Criteria) this;
        }

        public Criteria andRecordpictureEqualTo(String value) {
            addCriterion("RecordPicture =", value, "recordpicture");
            return (Criteria) this;
        }

        public Criteria andRecordpictureNotEqualTo(String value) {
            addCriterion("RecordPicture <>", value, "recordpicture");
            return (Criteria) this;
        }

        public Criteria andRecordpictureGreaterThan(String value) {
            addCriterion("RecordPicture >", value, "recordpicture");
            return (Criteria) this;
        }

        public Criteria andRecordpictureGreaterThanOrEqualTo(String value) {
            addCriterion("RecordPicture >=", value, "recordpicture");
            return (Criteria) this;
        }

        public Criteria andRecordpictureLessThan(String value) {
            addCriterion("RecordPicture <", value, "recordpicture");
            return (Criteria) this;
        }

        public Criteria andRecordpictureLessThanOrEqualTo(String value) {
            addCriterion("RecordPicture <=", value, "recordpicture");
            return (Criteria) this;
        }

        public Criteria andRecordpictureLike(String value) {
            addCriterion("RecordPicture like", value, "recordpicture");
            return (Criteria) this;
        }

        public Criteria andRecordpictureNotLike(String value) {
            addCriterion("RecordPicture not like", value, "recordpicture");
            return (Criteria) this;
        }

        public Criteria andRecordpictureIn(List<String> values) {
            addCriterion("RecordPicture in", values, "recordpicture");
            return (Criteria) this;
        }

        public Criteria andRecordpictureNotIn(List<String> values) {
            addCriterion("RecordPicture not in", values, "recordpicture");
            return (Criteria) this;
        }

        public Criteria andRecordpictureBetween(String value1, String value2) {
            addCriterion("RecordPicture between", value1, value2, "recordpicture");
            return (Criteria) this;
        }

        public Criteria andRecordpictureNotBetween(String value1, String value2) {
            addCriterion("RecordPicture not between", value1, value2, "recordpicture");
            return (Criteria) this;
        }

        public Criteria andCertificateapprovedateIsNull() {
            addCriterion("CertificateApproveDate is null");
            return (Criteria) this;
        }

        public Criteria andCertificateapprovedateIsNotNull() {
            addCriterion("CertificateApproveDate is not null");
            return (Criteria) this;
        }

        public Criteria andCertificateapprovedateEqualTo(Date value) {
            addCriterionForJDBCDate("CertificateApproveDate =", value, "certificateapprovedate");
            return (Criteria) this;
        }

        public Criteria andCertificateapprovedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("CertificateApproveDate <>", value, "certificateapprovedate");
            return (Criteria) this;
        }

        public Criteria andCertificateapprovedateGreaterThan(Date value) {
            addCriterionForJDBCDate("CertificateApproveDate >", value, "certificateapprovedate");
            return (Criteria) this;
        }

        public Criteria andCertificateapprovedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CertificateApproveDate >=", value, "certificateapprovedate");
            return (Criteria) this;
        }

        public Criteria andCertificateapprovedateLessThan(Date value) {
            addCriterionForJDBCDate("CertificateApproveDate <", value, "certificateapprovedate");
            return (Criteria) this;
        }

        public Criteria andCertificateapprovedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CertificateApproveDate <=", value, "certificateapprovedate");
            return (Criteria) this;
        }

        public Criteria andCertificateapprovedateIn(List<Date> values) {
            addCriterionForJDBCDate("CertificateApproveDate in", values, "certificateapprovedate");
            return (Criteria) this;
        }

        public Criteria andCertificateapprovedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("CertificateApproveDate not in", values, "certificateapprovedate");
            return (Criteria) this;
        }

        public Criteria andCertificateapprovedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CertificateApproveDate between", value1, value2, "certificateapprovedate");
            return (Criteria) this;
        }

        public Criteria andCertificateapprovedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CertificateApproveDate not between", value1, value2, "certificateapprovedate");
            return (Criteria) this;
        }

        public Criteria andCertificateissuingauthorityIsNull() {
            addCriterion("CertificateIssuingAuthority is null");
            return (Criteria) this;
        }

        public Criteria andCertificateissuingauthorityIsNotNull() {
            addCriterion("CertificateIssuingAuthority is not null");
            return (Criteria) this;
        }

        public Criteria andCertificateissuingauthorityEqualTo(String value) {
            addCriterion("CertificateIssuingAuthority =", value, "certificateissuingauthority");
            return (Criteria) this;
        }

        public Criteria andCertificateissuingauthorityNotEqualTo(String value) {
            addCriterion("CertificateIssuingAuthority <>", value, "certificateissuingauthority");
            return (Criteria) this;
        }

        public Criteria andCertificateissuingauthorityGreaterThan(String value) {
            addCriterion("CertificateIssuingAuthority >", value, "certificateissuingauthority");
            return (Criteria) this;
        }

        public Criteria andCertificateissuingauthorityGreaterThanOrEqualTo(String value) {
            addCriterion("CertificateIssuingAuthority >=", value, "certificateissuingauthority");
            return (Criteria) this;
        }

        public Criteria andCertificateissuingauthorityLessThan(String value) {
            addCriterion("CertificateIssuingAuthority <", value, "certificateissuingauthority");
            return (Criteria) this;
        }

        public Criteria andCertificateissuingauthorityLessThanOrEqualTo(String value) {
            addCriterion("CertificateIssuingAuthority <=", value, "certificateissuingauthority");
            return (Criteria) this;
        }

        public Criteria andCertificateissuingauthorityLike(String value) {
            addCriterion("CertificateIssuingAuthority like", value, "certificateissuingauthority");
            return (Criteria) this;
        }

        public Criteria andCertificateissuingauthorityNotLike(String value) {
            addCriterion("CertificateIssuingAuthority not like", value, "certificateissuingauthority");
            return (Criteria) this;
        }

        public Criteria andCertificateissuingauthorityIn(List<String> values) {
            addCriterion("CertificateIssuingAuthority in", values, "certificateissuingauthority");
            return (Criteria) this;
        }

        public Criteria andCertificateissuingauthorityNotIn(List<String> values) {
            addCriterion("CertificateIssuingAuthority not in", values, "certificateissuingauthority");
            return (Criteria) this;
        }

        public Criteria andCertificateissuingauthorityBetween(String value1, String value2) {
            addCriterion("CertificateIssuingAuthority between", value1, value2, "certificateissuingauthority");
            return (Criteria) this;
        }

        public Criteria andCertificateissuingauthorityNotBetween(String value1, String value2) {
            addCriterion("CertificateIssuingAuthority not between", value1, value2, "certificateissuingauthority");
            return (Criteria) this;
        }

        public Criteria andSuppliertypeIsNull() {
            addCriterion("SupplierType is null");
            return (Criteria) this;
        }

        public Criteria andSuppliertypeIsNotNull() {
            addCriterion("SupplierType is not null");
            return (Criteria) this;
        }

        public Criteria andSuppliertypeEqualTo(Integer value) {
            addCriterion("SupplierType =", value, "suppliertype");
            return (Criteria) this;
        }

        public Criteria andSuppliertypeNotEqualTo(Integer value) {
            addCriterion("SupplierType <>", value, "suppliertype");
            return (Criteria) this;
        }

        public Criteria andSuppliertypeGreaterThan(Integer value) {
            addCriterion("SupplierType >", value, "suppliertype");
            return (Criteria) this;
        }

        public Criteria andSuppliertypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("SupplierType >=", value, "suppliertype");
            return (Criteria) this;
        }

        public Criteria andSuppliertypeLessThan(Integer value) {
            addCriterion("SupplierType <", value, "suppliertype");
            return (Criteria) this;
        }

        public Criteria andSuppliertypeLessThanOrEqualTo(Integer value) {
            addCriterion("SupplierType <=", value, "suppliertype");
            return (Criteria) this;
        }

        public Criteria andSuppliertypeIn(List<Integer> values) {
            addCriterion("SupplierType in", values, "suppliertype");
            return (Criteria) this;
        }

        public Criteria andSuppliertypeNotIn(List<Integer> values) {
            addCriterion("SupplierType not in", values, "suppliertype");
            return (Criteria) this;
        }

        public Criteria andSuppliertypeBetween(Integer value1, Integer value2) {
            addCriterion("SupplierType between", value1, value2, "suppliertype");
            return (Criteria) this;
        }

        public Criteria andSuppliertypeNotBetween(Integer value1, Integer value2) {
            addCriterion("SupplierType not between", value1, value2, "suppliertype");
            return (Criteria) this;
        }

        public Criteria andProductioncertificatenumberIsNull() {
            addCriterion("ProductionCertificateNumber is null");
            return (Criteria) this;
        }

        public Criteria andProductioncertificatenumberIsNotNull() {
            addCriterion("ProductionCertificateNumber is not null");
            return (Criteria) this;
        }

        public Criteria andProductioncertificatenumberEqualTo(String value) {
            addCriterion("ProductionCertificateNumber =", value, "productioncertificatenumber");
            return (Criteria) this;
        }

        public Criteria andProductioncertificatenumberNotEqualTo(String value) {
            addCriterion("ProductionCertificateNumber <>", value, "productioncertificatenumber");
            return (Criteria) this;
        }

        public Criteria andProductioncertificatenumberGreaterThan(String value) {
            addCriterion("ProductionCertificateNumber >", value, "productioncertificatenumber");
            return (Criteria) this;
        }

        public Criteria andProductioncertificatenumberGreaterThanOrEqualTo(String value) {
            addCriterion("ProductionCertificateNumber >=", value, "productioncertificatenumber");
            return (Criteria) this;
        }

        public Criteria andProductioncertificatenumberLessThan(String value) {
            addCriterion("ProductionCertificateNumber <", value, "productioncertificatenumber");
            return (Criteria) this;
        }

        public Criteria andProductioncertificatenumberLessThanOrEqualTo(String value) {
            addCriterion("ProductionCertificateNumber <=", value, "productioncertificatenumber");
            return (Criteria) this;
        }

        public Criteria andProductioncertificatenumberLike(String value) {
            addCriterion("ProductionCertificateNumber like", value, "productioncertificatenumber");
            return (Criteria) this;
        }

        public Criteria andProductioncertificatenumberNotLike(String value) {
            addCriterion("ProductionCertificateNumber not like", value, "productioncertificatenumber");
            return (Criteria) this;
        }

        public Criteria andProductioncertificatenumberIn(List<String> values) {
            addCriterion("ProductionCertificateNumber in", values, "productioncertificatenumber");
            return (Criteria) this;
        }

        public Criteria andProductioncertificatenumberNotIn(List<String> values) {
            addCriterion("ProductionCertificateNumber not in", values, "productioncertificatenumber");
            return (Criteria) this;
        }

        public Criteria andProductioncertificatenumberBetween(String value1, String value2) {
            addCriterion("ProductionCertificateNumber between", value1, value2, "productioncertificatenumber");
            return (Criteria) this;
        }

        public Criteria andProductioncertificatenumberNotBetween(String value1, String value2) {
            addCriterion("ProductionCertificateNumber not between", value1, value2, "productioncertificatenumber");
            return (Criteria) this;
        }

        public Criteria andProductioncertificatevalidityIsNull() {
            addCriterion("ProductionCertificateValidity is null");
            return (Criteria) this;
        }

        public Criteria andProductioncertificatevalidityIsNotNull() {
            addCriterion("ProductionCertificateValidity is not null");
            return (Criteria) this;
        }

        public Criteria andProductioncertificatevalidityEqualTo(Date value) {
            addCriterion("ProductionCertificateValidity =", value, "productioncertificatevalidity");
            return (Criteria) this;
        }

        public Criteria andProductioncertificatevalidityNotEqualTo(Date value) {
            addCriterion("ProductionCertificateValidity <>", value, "productioncertificatevalidity");
            return (Criteria) this;
        }

        public Criteria andProductioncertificatevalidityGreaterThan(Date value) {
            addCriterion("ProductionCertificateValidity >", value, "productioncertificatevalidity");
            return (Criteria) this;
        }

        public Criteria andProductioncertificatevalidityGreaterThanOrEqualTo(Date value) {
            addCriterion("ProductionCertificateValidity >=", value, "productioncertificatevalidity");
            return (Criteria) this;
        }

        public Criteria andProductioncertificatevalidityLessThan(Date value) {
            addCriterion("ProductionCertificateValidity <", value, "productioncertificatevalidity");
            return (Criteria) this;
        }

        public Criteria andProductioncertificatevalidityLessThanOrEqualTo(Date value) {
            addCriterion("ProductionCertificateValidity <=", value, "productioncertificatevalidity");
            return (Criteria) this;
        }

        public Criteria andProductioncertificatevalidityIn(List<Date> values) {
            addCriterion("ProductionCertificateValidity in", values, "productioncertificatevalidity");
            return (Criteria) this;
        }

        public Criteria andProductioncertificatevalidityNotIn(List<Date> values) {
            addCriterion("ProductionCertificateValidity not in", values, "productioncertificatevalidity");
            return (Criteria) this;
        }

        public Criteria andProductioncertificatevalidityBetween(Date value1, Date value2) {
            addCriterion("ProductionCertificateValidity between", value1, value2, "productioncertificatevalidity");
            return (Criteria) this;
        }

        public Criteria andProductioncertificatevalidityNotBetween(Date value1, Date value2) {
            addCriterion("ProductionCertificateValidity not between", value1, value2, "productioncertificatevalidity");
            return (Criteria) this;
        }

        public Criteria andProductioncertificationpictureIsNull() {
            addCriterion("ProductionCertificationPicture is null");
            return (Criteria) this;
        }

        public Criteria andProductioncertificationpictureIsNotNull() {
            addCriterion("ProductionCertificationPicture is not null");
            return (Criteria) this;
        }

        public Criteria andProductioncertificationpictureEqualTo(String value) {
            addCriterion("ProductionCertificationPicture =", value, "productioncertificationpicture");
            return (Criteria) this;
        }

        public Criteria andProductioncertificationpictureNotEqualTo(String value) {
            addCriterion("ProductionCertificationPicture <>", value, "productioncertificationpicture");
            return (Criteria) this;
        }

        public Criteria andProductioncertificationpictureGreaterThan(String value) {
            addCriterion("ProductionCertificationPicture >", value, "productioncertificationpicture");
            return (Criteria) this;
        }

        public Criteria andProductioncertificationpictureGreaterThanOrEqualTo(String value) {
            addCriterion("ProductionCertificationPicture >=", value, "productioncertificationpicture");
            return (Criteria) this;
        }

        public Criteria andProductioncertificationpictureLessThan(String value) {
            addCriterion("ProductionCertificationPicture <", value, "productioncertificationpicture");
            return (Criteria) this;
        }

        public Criteria andProductioncertificationpictureLessThanOrEqualTo(String value) {
            addCriterion("ProductionCertificationPicture <=", value, "productioncertificationpicture");
            return (Criteria) this;
        }

        public Criteria andProductioncertificationpictureLike(String value) {
            addCriterion("ProductionCertificationPicture like", value, "productioncertificationpicture");
            return (Criteria) this;
        }

        public Criteria andProductioncertificationpictureNotLike(String value) {
            addCriterion("ProductionCertificationPicture not like", value, "productioncertificationpicture");
            return (Criteria) this;
        }

        public Criteria andProductioncertificationpictureIn(List<String> values) {
            addCriterion("ProductionCertificationPicture in", values, "productioncertificationpicture");
            return (Criteria) this;
        }

        public Criteria andProductioncertificationpictureNotIn(List<String> values) {
            addCriterion("ProductionCertificationPicture not in", values, "productioncertificationpicture");
            return (Criteria) this;
        }

        public Criteria andProductioncertificationpictureBetween(String value1, String value2) {
            addCriterion("ProductionCertificationPicture between", value1, value2, "productioncertificationpicture");
            return (Criteria) this;
        }

        public Criteria andProductioncertificationpictureNotBetween(String value1, String value2) {
            addCriterion("ProductionCertificationPicture not between", value1, value2, "productioncertificationpicture");
            return (Criteria) this;
        }

        public Criteria andProductionscopeIsNull() {
            addCriterion("ProductionScope is null");
            return (Criteria) this;
        }

        public Criteria andProductionscopeIsNotNull() {
            addCriterion("ProductionScope is not null");
            return (Criteria) this;
        }

        public Criteria andProductionscopeEqualTo(String value) {
            addCriterion("ProductionScope =", value, "productionscope");
            return (Criteria) this;
        }

        public Criteria andProductionscopeNotEqualTo(String value) {
            addCriterion("ProductionScope <>", value, "productionscope");
            return (Criteria) this;
        }

        public Criteria andProductionscopeGreaterThan(String value) {
            addCriterion("ProductionScope >", value, "productionscope");
            return (Criteria) this;
        }

        public Criteria andProductionscopeGreaterThanOrEqualTo(String value) {
            addCriterion("ProductionScope >=", value, "productionscope");
            return (Criteria) this;
        }

        public Criteria andProductionscopeLessThan(String value) {
            addCriterion("ProductionScope <", value, "productionscope");
            return (Criteria) this;
        }

        public Criteria andProductionscopeLessThanOrEqualTo(String value) {
            addCriterion("ProductionScope <=", value, "productionscope");
            return (Criteria) this;
        }

        public Criteria andProductionscopeLike(String value) {
            addCriterion("ProductionScope like", value, "productionscope");
            return (Criteria) this;
        }

        public Criteria andProductionscopeNotLike(String value) {
            addCriterion("ProductionScope not like", value, "productionscope");
            return (Criteria) this;
        }

        public Criteria andProductionscopeIn(List<String> values) {
            addCriterion("ProductionScope in", values, "productionscope");
            return (Criteria) this;
        }

        public Criteria andProductionscopeNotIn(List<String> values) {
            addCriterion("ProductionScope not in", values, "productionscope");
            return (Criteria) this;
        }

        public Criteria andProductionscopeBetween(String value1, String value2) {
            addCriterion("ProductionScope between", value1, value2, "productionscope");
            return (Criteria) this;
        }

        public Criteria andProductionscopeNotBetween(String value1, String value2) {
            addCriterion("ProductionScope not between", value1, value2, "productionscope");
            return (Criteria) this;
        }

        public Criteria andProductionscopecodeIsNull() {
            addCriterion("ProductionScopeCode is null");
            return (Criteria) this;
        }

        public Criteria andProductionscopecodeIsNotNull() {
            addCriterion("ProductionScopeCode is not null");
            return (Criteria) this;
        }

        public Criteria andProductionscopecodeEqualTo(String value) {
            addCriterion("ProductionScopeCode =", value, "productionscopecode");
            return (Criteria) this;
        }

        public Criteria andProductionscopecodeNotEqualTo(String value) {
            addCriterion("ProductionScopeCode <>", value, "productionscopecode");
            return (Criteria) this;
        }

        public Criteria andProductionscopecodeGreaterThan(String value) {
            addCriterion("ProductionScopeCode >", value, "productionscopecode");
            return (Criteria) this;
        }

        public Criteria andProductionscopecodeGreaterThanOrEqualTo(String value) {
            addCriterion("ProductionScopeCode >=", value, "productionscopecode");
            return (Criteria) this;
        }

        public Criteria andProductionscopecodeLessThan(String value) {
            addCriterion("ProductionScopeCode <", value, "productionscopecode");
            return (Criteria) this;
        }

        public Criteria andProductionscopecodeLessThanOrEqualTo(String value) {
            addCriterion("ProductionScopeCode <=", value, "productionscopecode");
            return (Criteria) this;
        }

        public Criteria andProductionscopecodeLike(String value) {
            addCriterion("ProductionScopeCode like", value, "productionscopecode");
            return (Criteria) this;
        }

        public Criteria andProductionscopecodeNotLike(String value) {
            addCriterion("ProductionScopeCode not like", value, "productionscopecode");
            return (Criteria) this;
        }

        public Criteria andProductionscopecodeIn(List<String> values) {
            addCriterion("ProductionScopeCode in", values, "productionscopecode");
            return (Criteria) this;
        }

        public Criteria andProductionscopecodeNotIn(List<String> values) {
            addCriterion("ProductionScopeCode not in", values, "productionscopecode");
            return (Criteria) this;
        }

        public Criteria andProductionscopecodeBetween(String value1, String value2) {
            addCriterion("ProductionScopeCode between", value1, value2, "productionscopecode");
            return (Criteria) this;
        }

        public Criteria andProductionscopecodeNotBetween(String value1, String value2) {
            addCriterion("ProductionScopeCode not between", value1, value2, "productionscopecode");
            return (Criteria) this;
        }

        public Criteria andProductionaddressIsNull() {
            addCriterion("ProductionAddress is null");
            return (Criteria) this;
        }

        public Criteria andProductionaddressIsNotNull() {
            addCriterion("ProductionAddress is not null");
            return (Criteria) this;
        }

        public Criteria andProductionaddressEqualTo(String value) {
            addCriterion("ProductionAddress =", value, "productionaddress");
            return (Criteria) this;
        }

        public Criteria andProductionaddressNotEqualTo(String value) {
            addCriterion("ProductionAddress <>", value, "productionaddress");
            return (Criteria) this;
        }

        public Criteria andProductionaddressGreaterThan(String value) {
            addCriterion("ProductionAddress >", value, "productionaddress");
            return (Criteria) this;
        }

        public Criteria andProductionaddressGreaterThanOrEqualTo(String value) {
            addCriterion("ProductionAddress >=", value, "productionaddress");
            return (Criteria) this;
        }

        public Criteria andProductionaddressLessThan(String value) {
            addCriterion("ProductionAddress <", value, "productionaddress");
            return (Criteria) this;
        }

        public Criteria andProductionaddressLessThanOrEqualTo(String value) {
            addCriterion("ProductionAddress <=", value, "productionaddress");
            return (Criteria) this;
        }

        public Criteria andProductionaddressLike(String value) {
            addCriterion("ProductionAddress like", value, "productionaddress");
            return (Criteria) this;
        }

        public Criteria andProductionaddressNotLike(String value) {
            addCriterion("ProductionAddress not like", value, "productionaddress");
            return (Criteria) this;
        }

        public Criteria andProductionaddressIn(List<String> values) {
            addCriterion("ProductionAddress in", values, "productionaddress");
            return (Criteria) this;
        }

        public Criteria andProductionaddressNotIn(List<String> values) {
            addCriterion("ProductionAddress not in", values, "productionaddress");
            return (Criteria) this;
        }

        public Criteria andProductionaddressBetween(String value1, String value2) {
            addCriterion("ProductionAddress between", value1, value2, "productionaddress");
            return (Criteria) this;
        }

        public Criteria andProductionaddressNotBetween(String value1, String value2) {
            addCriterion("ProductionAddress not between", value1, value2, "productionaddress");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}
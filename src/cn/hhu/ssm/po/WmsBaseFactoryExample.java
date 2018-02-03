package cn.hhu.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WmsBaseFactoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WmsBaseFactoryExample() {
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

        public Criteria andFactoryIdIsNull() {
            addCriterion("Factory_ID is null");
            return (Criteria) this;
        }

        public Criteria andFactoryIdIsNotNull() {
            addCriterion("Factory_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFactoryIdEqualTo(Integer value) {
            addCriterion("Factory_ID =", value, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdNotEqualTo(Integer value) {
            addCriterion("Factory_ID <>", value, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdGreaterThan(Integer value) {
            addCriterion("Factory_ID >", value, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Factory_ID >=", value, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdLessThan(Integer value) {
            addCriterion("Factory_ID <", value, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("Factory_ID <=", value, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdIn(List<Integer> values) {
            addCriterion("Factory_ID in", values, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdNotIn(List<Integer> values) {
            addCriterion("Factory_ID not in", values, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdBetween(Integer value1, Integer value2) {
            addCriterion("Factory_ID between", value1, value2, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Factory_ID not between", value1, value2, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryNumberIsNull() {
            addCriterion("Factory_Number is null");
            return (Criteria) this;
        }

        public Criteria andFactoryNumberIsNotNull() {
            addCriterion("Factory_Number is not null");
            return (Criteria) this;
        }

        public Criteria andFactoryNumberEqualTo(String value) {
            addCriterion("Factory_Number =", value, "factoryNumber");
            return (Criteria) this;
        }

        public Criteria andFactoryNumberNotEqualTo(String value) {
            addCriterion("Factory_Number <>", value, "factoryNumber");
            return (Criteria) this;
        }

        public Criteria andFactoryNumberGreaterThan(String value) {
            addCriterion("Factory_Number >", value, "factoryNumber");
            return (Criteria) this;
        }

        public Criteria andFactoryNumberGreaterThanOrEqualTo(String value) {
            addCriterion("Factory_Number >=", value, "factoryNumber");
            return (Criteria) this;
        }

        public Criteria andFactoryNumberLessThan(String value) {
            addCriterion("Factory_Number <", value, "factoryNumber");
            return (Criteria) this;
        }

        public Criteria andFactoryNumberLessThanOrEqualTo(String value) {
            addCriterion("Factory_Number <=", value, "factoryNumber");
            return (Criteria) this;
        }

        public Criteria andFactoryNumberLike(String value) {
            addCriterion("Factory_Number like", value, "factoryNumber");
            return (Criteria) this;
        }

        public Criteria andFactoryNumberNotLike(String value) {
            addCriterion("Factory_Number not like", value, "factoryNumber");
            return (Criteria) this;
        }

        public Criteria andFactoryNumberIn(List<String> values) {
            addCriterion("Factory_Number in", values, "factoryNumber");
            return (Criteria) this;
        }

        public Criteria andFactoryNumberNotIn(List<String> values) {
            addCriterion("Factory_Number not in", values, "factoryNumber");
            return (Criteria) this;
        }

        public Criteria andFactoryNumberBetween(String value1, String value2) {
            addCriterion("Factory_Number between", value1, value2, "factoryNumber");
            return (Criteria) this;
        }

        public Criteria andFactoryNumberNotBetween(String value1, String value2) {
            addCriterion("Factory_Number not between", value1, value2, "factoryNumber");
            return (Criteria) this;
        }

        public Criteria andFactorynameIsNull() {
            addCriterion("FactoryName is null");
            return (Criteria) this;
        }

        public Criteria andFactorynameIsNotNull() {
            addCriterion("FactoryName is not null");
            return (Criteria) this;
        }

        public Criteria andFactorynameEqualTo(String value) {
            addCriterion("FactoryName =", value, "factoryname");
            return (Criteria) this;
        }

        public Criteria andFactorynameNotEqualTo(String value) {
            addCriterion("FactoryName <>", value, "factoryname");
            return (Criteria) this;
        }

        public Criteria andFactorynameGreaterThan(String value) {
            addCriterion("FactoryName >", value, "factoryname");
            return (Criteria) this;
        }

        public Criteria andFactorynameGreaterThanOrEqualTo(String value) {
            addCriterion("FactoryName >=", value, "factoryname");
            return (Criteria) this;
        }

        public Criteria andFactorynameLessThan(String value) {
            addCriterion("FactoryName <", value, "factoryname");
            return (Criteria) this;
        }

        public Criteria andFactorynameLessThanOrEqualTo(String value) {
            addCriterion("FactoryName <=", value, "factoryname");
            return (Criteria) this;
        }

        public Criteria andFactorynameLike(String value) {
            addCriterion("FactoryName like", value, "factoryname");
            return (Criteria) this;
        }

        public Criteria andFactorynameNotLike(String value) {
            addCriterion("FactoryName not like", value, "factoryname");
            return (Criteria) this;
        }

        public Criteria andFactorynameIn(List<String> values) {
            addCriterion("FactoryName in", values, "factoryname");
            return (Criteria) this;
        }

        public Criteria andFactorynameNotIn(List<String> values) {
            addCriterion("FactoryName not in", values, "factoryname");
            return (Criteria) this;
        }

        public Criteria andFactorynameBetween(String value1, String value2) {
            addCriterion("FactoryName between", value1, value2, "factoryname");
            return (Criteria) this;
        }

        public Criteria andFactorynameNotBetween(String value1, String value2) {
            addCriterion("FactoryName not between", value1, value2, "factoryname");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseNumberIsNull() {
            addCriterion("BusinessLicense_Number is null");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseNumberIsNotNull() {
            addCriterion("BusinessLicense_Number is not null");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseNumberEqualTo(String value) {
            addCriterion("BusinessLicense_Number =", value, "businesslicenseNumber");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseNumberNotEqualTo(String value) {
            addCriterion("BusinessLicense_Number <>", value, "businesslicenseNumber");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseNumberGreaterThan(String value) {
            addCriterion("BusinessLicense_Number >", value, "businesslicenseNumber");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseNumberGreaterThanOrEqualTo(String value) {
            addCriterion("BusinessLicense_Number >=", value, "businesslicenseNumber");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseNumberLessThan(String value) {
            addCriterion("BusinessLicense_Number <", value, "businesslicenseNumber");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseNumberLessThanOrEqualTo(String value) {
            addCriterion("BusinessLicense_Number <=", value, "businesslicenseNumber");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseNumberLike(String value) {
            addCriterion("BusinessLicense_Number like", value, "businesslicenseNumber");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseNumberNotLike(String value) {
            addCriterion("BusinessLicense_Number not like", value, "businesslicenseNumber");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseNumberIn(List<String> values) {
            addCriterion("BusinessLicense_Number in", values, "businesslicenseNumber");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseNumberNotIn(List<String> values) {
            addCriterion("BusinessLicense_Number not in", values, "businesslicenseNumber");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseNumberBetween(String value1, String value2) {
            addCriterion("BusinessLicense_Number between", value1, value2, "businesslicenseNumber");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseNumberNotBetween(String value1, String value2) {
            addCriterion("BusinessLicense_Number not between", value1, value2, "businesslicenseNumber");
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

        public Criteria andProductionpermitNumberIsNull() {
            addCriterion("ProductionPermit_Number is null");
            return (Criteria) this;
        }

        public Criteria andProductionpermitNumberIsNotNull() {
            addCriterion("ProductionPermit_Number is not null");
            return (Criteria) this;
        }

        public Criteria andProductionpermitNumberEqualTo(String value) {
            addCriterion("ProductionPermit_Number =", value, "productionpermitNumber");
            return (Criteria) this;
        }

        public Criteria andProductionpermitNumberNotEqualTo(String value) {
            addCriterion("ProductionPermit_Number <>", value, "productionpermitNumber");
            return (Criteria) this;
        }

        public Criteria andProductionpermitNumberGreaterThan(String value) {
            addCriterion("ProductionPermit_Number >", value, "productionpermitNumber");
            return (Criteria) this;
        }

        public Criteria andProductionpermitNumberGreaterThanOrEqualTo(String value) {
            addCriterion("ProductionPermit_Number >=", value, "productionpermitNumber");
            return (Criteria) this;
        }

        public Criteria andProductionpermitNumberLessThan(String value) {
            addCriterion("ProductionPermit_Number <", value, "productionpermitNumber");
            return (Criteria) this;
        }

        public Criteria andProductionpermitNumberLessThanOrEqualTo(String value) {
            addCriterion("ProductionPermit_Number <=", value, "productionpermitNumber");
            return (Criteria) this;
        }

        public Criteria andProductionpermitNumberLike(String value) {
            addCriterion("ProductionPermit_Number like", value, "productionpermitNumber");
            return (Criteria) this;
        }

        public Criteria andProductionpermitNumberNotLike(String value) {
            addCriterion("ProductionPermit_Number not like", value, "productionpermitNumber");
            return (Criteria) this;
        }

        public Criteria andProductionpermitNumberIn(List<String> values) {
            addCriterion("ProductionPermit_Number in", values, "productionpermitNumber");
            return (Criteria) this;
        }

        public Criteria andProductionpermitNumberNotIn(List<String> values) {
            addCriterion("ProductionPermit_Number not in", values, "productionpermitNumber");
            return (Criteria) this;
        }

        public Criteria andProductionpermitNumberBetween(String value1, String value2) {
            addCriterion("ProductionPermit_Number between", value1, value2, "productionpermitNumber");
            return (Criteria) this;
        }

        public Criteria andProductionpermitNumberNotBetween(String value1, String value2) {
            addCriterion("ProductionPermit_Number not between", value1, value2, "productionpermitNumber");
            return (Criteria) this;
        }

        public Criteria andProductionpermitvalidityIsNull() {
            addCriterion("ProductionPermitValidity is null");
            return (Criteria) this;
        }

        public Criteria andProductionpermitvalidityIsNotNull() {
            addCriterion("ProductionPermitValidity is not null");
            return (Criteria) this;
        }

        public Criteria andProductionpermitvalidityEqualTo(Date value) {
            addCriterion("ProductionPermitValidity =", value, "productionpermitvalidity");
            return (Criteria) this;
        }

        public Criteria andProductionpermitvalidityNotEqualTo(Date value) {
            addCriterion("ProductionPermitValidity <>", value, "productionpermitvalidity");
            return (Criteria) this;
        }

        public Criteria andProductionpermitvalidityGreaterThan(Date value) {
            addCriterion("ProductionPermitValidity >", value, "productionpermitvalidity");
            return (Criteria) this;
        }

        public Criteria andProductionpermitvalidityGreaterThanOrEqualTo(Date value) {
            addCriterion("ProductionPermitValidity >=", value, "productionpermitvalidity");
            return (Criteria) this;
        }

        public Criteria andProductionpermitvalidityLessThan(Date value) {
            addCriterion("ProductionPermitValidity <", value, "productionpermitvalidity");
            return (Criteria) this;
        }

        public Criteria andProductionpermitvalidityLessThanOrEqualTo(Date value) {
            addCriterion("ProductionPermitValidity <=", value, "productionpermitvalidity");
            return (Criteria) this;
        }

        public Criteria andProductionpermitvalidityIn(List<Date> values) {
            addCriterion("ProductionPermitValidity in", values, "productionpermitvalidity");
            return (Criteria) this;
        }

        public Criteria andProductionpermitvalidityNotIn(List<Date> values) {
            addCriterion("ProductionPermitValidity not in", values, "productionpermitvalidity");
            return (Criteria) this;
        }

        public Criteria andProductionpermitvalidityBetween(Date value1, Date value2) {
            addCriterion("ProductionPermitValidity between", value1, value2, "productionpermitvalidity");
            return (Criteria) this;
        }

        public Criteria andProductionpermitvalidityNotBetween(Date value1, Date value2) {
            addCriterion("ProductionPermitValidity not between", value1, value2, "productionpermitvalidity");
            return (Criteria) this;
        }

        public Criteria andProductionpermitpictureIsNull() {
            addCriterion("ProductionPermitPicture is null");
            return (Criteria) this;
        }

        public Criteria andProductionpermitpictureIsNotNull() {
            addCriterion("ProductionPermitPicture is not null");
            return (Criteria) this;
        }

        public Criteria andProductionpermitpictureEqualTo(String value) {
            addCriterion("ProductionPermitPicture =", value, "productionpermitpicture");
            return (Criteria) this;
        }

        public Criteria andProductionpermitpictureNotEqualTo(String value) {
            addCriterion("ProductionPermitPicture <>", value, "productionpermitpicture");
            return (Criteria) this;
        }

        public Criteria andProductionpermitpictureGreaterThan(String value) {
            addCriterion("ProductionPermitPicture >", value, "productionpermitpicture");
            return (Criteria) this;
        }

        public Criteria andProductionpermitpictureGreaterThanOrEqualTo(String value) {
            addCriterion("ProductionPermitPicture >=", value, "productionpermitpicture");
            return (Criteria) this;
        }

        public Criteria andProductionpermitpictureLessThan(String value) {
            addCriterion("ProductionPermitPicture <", value, "productionpermitpicture");
            return (Criteria) this;
        }

        public Criteria andProductionpermitpictureLessThanOrEqualTo(String value) {
            addCriterion("ProductionPermitPicture <=", value, "productionpermitpicture");
            return (Criteria) this;
        }

        public Criteria andProductionpermitpictureLike(String value) {
            addCriterion("ProductionPermitPicture like", value, "productionpermitpicture");
            return (Criteria) this;
        }

        public Criteria andProductionpermitpictureNotLike(String value) {
            addCriterion("ProductionPermitPicture not like", value, "productionpermitpicture");
            return (Criteria) this;
        }

        public Criteria andProductionpermitpictureIn(List<String> values) {
            addCriterion("ProductionPermitPicture in", values, "productionpermitpicture");
            return (Criteria) this;
        }

        public Criteria andProductionpermitpictureNotIn(List<String> values) {
            addCriterion("ProductionPermitPicture not in", values, "productionpermitpicture");
            return (Criteria) this;
        }

        public Criteria andProductionpermitpictureBetween(String value1, String value2) {
            addCriterion("ProductionPermitPicture between", value1, value2, "productionpermitpicture");
            return (Criteria) this;
        }

        public Criteria andProductionpermitpictureNotBetween(String value1, String value2) {
            addCriterion("ProductionPermitPicture not between", value1, value2, "productionpermitpicture");
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

        public Criteria andRemarkIsNull() {
            addCriterion("Remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("Remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("Remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("Remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("Remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("Remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("Remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("Remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("Remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("Remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("Remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("Remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("Remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("Remark not between", value1, value2, "remark");
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
            addCriterion("MakeOrderMan is null");
            return (Criteria) this;
        }

        public Criteria andMakeordermanIsNotNull() {
            addCriterion("MakeOrderMan is not null");
            return (Criteria) this;
        }

        public Criteria andMakeordermanEqualTo(Integer value) {
            addCriterion("MakeOrderMan =", value, "makeorderman");
            return (Criteria) this;
        }

        public Criteria andMakeordermanNotEqualTo(Integer value) {
            addCriterion("MakeOrderMan <>", value, "makeorderman");
            return (Criteria) this;
        }

        public Criteria andMakeordermanGreaterThan(Integer value) {
            addCriterion("MakeOrderMan >", value, "makeorderman");
            return (Criteria) this;
        }

        public Criteria andMakeordermanGreaterThanOrEqualTo(Integer value) {
            addCriterion("MakeOrderMan >=", value, "makeorderman");
            return (Criteria) this;
        }

        public Criteria andMakeordermanLessThan(Integer value) {
            addCriterion("MakeOrderMan <", value, "makeorderman");
            return (Criteria) this;
        }

        public Criteria andMakeordermanLessThanOrEqualTo(Integer value) {
            addCriterion("MakeOrderMan <=", value, "makeorderman");
            return (Criteria) this;
        }

        public Criteria andMakeordermanIn(List<Integer> values) {
            addCriterion("MakeOrderMan in", values, "makeorderman");
            return (Criteria) this;
        }

        public Criteria andMakeordermanNotIn(List<Integer> values) {
            addCriterion("MakeOrderMan not in", values, "makeorderman");
            return (Criteria) this;
        }

        public Criteria andMakeordermanBetween(Integer value1, Integer value2) {
            addCriterion("MakeOrderMan between", value1, value2, "makeorderman");
            return (Criteria) this;
        }

        public Criteria andMakeordermanNotBetween(Integer value1, Integer value2) {
            addCriterion("MakeOrderMan not between", value1, value2, "makeorderman");
            return (Criteria) this;
        }

        public Criteria andIsdeletedIsNull() {
            addCriterion("IsDeleted is null");
            return (Criteria) this;
        }

        public Criteria andIsdeletedIsNotNull() {
            addCriterion("IsDeleted is not null");
            return (Criteria) this;
        }

        public Criteria andIsdeletedEqualTo(Boolean value) {
            addCriterion("IsDeleted =", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedNotEqualTo(Boolean value) {
            addCriterion("IsDeleted <>", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedGreaterThan(Boolean value) {
            addCriterion("IsDeleted >", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsDeleted >=", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedLessThan(Boolean value) {
            addCriterion("IsDeleted <", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedLessThanOrEqualTo(Boolean value) {
            addCriterion("IsDeleted <=", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedIn(List<Boolean> values) {
            addCriterion("IsDeleted in", values, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedNotIn(List<Boolean> values) {
            addCriterion("IsDeleted not in", values, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedBetween(Boolean value1, Boolean value2) {
            addCriterion("IsDeleted between", value1, value2, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsDeleted not between", value1, value2, "isdeleted");
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

        public Criteria andIsreviewEqualTo(Boolean value) {
            addCriterion("IsReview =", value, "isreview");
            return (Criteria) this;
        }

        public Criteria andIsreviewNotEqualTo(Boolean value) {
            addCriterion("IsReview <>", value, "isreview");
            return (Criteria) this;
        }

        public Criteria andIsreviewGreaterThan(Boolean value) {
            addCriterion("IsReview >", value, "isreview");
            return (Criteria) this;
        }

        public Criteria andIsreviewGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsReview >=", value, "isreview");
            return (Criteria) this;
        }

        public Criteria andIsreviewLessThan(Boolean value) {
            addCriterion("IsReview <", value, "isreview");
            return (Criteria) this;
        }

        public Criteria andIsreviewLessThanOrEqualTo(Boolean value) {
            addCriterion("IsReview <=", value, "isreview");
            return (Criteria) this;
        }

        public Criteria andIsreviewIn(List<Boolean> values) {
            addCriterion("IsReview in", values, "isreview");
            return (Criteria) this;
        }

        public Criteria andIsreviewNotIn(List<Boolean> values) {
            addCriterion("IsReview not in", values, "isreview");
            return (Criteria) this;
        }

        public Criteria andIsreviewBetween(Boolean value1, Boolean value2) {
            addCriterion("IsReview between", value1, value2, "isreview");
            return (Criteria) this;
        }

        public Criteria andIsreviewNotBetween(Boolean value1, Boolean value2) {
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

        public Criteria andCooperationstatusEqualTo(Boolean value) {
            addCriterion("CooperationStatus =", value, "cooperationstatus");
            return (Criteria) this;
        }

        public Criteria andCooperationstatusNotEqualTo(Boolean value) {
            addCriterion("CooperationStatus <>", value, "cooperationstatus");
            return (Criteria) this;
        }

        public Criteria andCooperationstatusGreaterThan(Boolean value) {
            addCriterion("CooperationStatus >", value, "cooperationstatus");
            return (Criteria) this;
        }

        public Criteria andCooperationstatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("CooperationStatus >=", value, "cooperationstatus");
            return (Criteria) this;
        }

        public Criteria andCooperationstatusLessThan(Boolean value) {
            addCriterion("CooperationStatus <", value, "cooperationstatus");
            return (Criteria) this;
        }

        public Criteria andCooperationstatusLessThanOrEqualTo(Boolean value) {
            addCriterion("CooperationStatus <=", value, "cooperationstatus");
            return (Criteria) this;
        }

        public Criteria andCooperationstatusIn(List<Boolean> values) {
            addCriterion("CooperationStatus in", values, "cooperationstatus");
            return (Criteria) this;
        }

        public Criteria andCooperationstatusNotIn(List<Boolean> values) {
            addCriterion("CooperationStatus not in", values, "cooperationstatus");
            return (Criteria) this;
        }

        public Criteria andCooperationstatusBetween(Boolean value1, Boolean value2) {
            addCriterion("CooperationStatus between", value1, value2, "cooperationstatus");
            return (Criteria) this;
        }

        public Criteria andCooperationstatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("CooperationStatus not between", value1, value2, "cooperationstatus");
            return (Criteria) this;
        }

        public Criteria andFactoryaddressIsNull() {
            addCriterion("FactoryAddress is null");
            return (Criteria) this;
        }

        public Criteria andFactoryaddressIsNotNull() {
            addCriterion("FactoryAddress is not null");
            return (Criteria) this;
        }

        public Criteria andFactoryaddressEqualTo(String value) {
            addCriterion("FactoryAddress =", value, "factoryaddress");
            return (Criteria) this;
        }

        public Criteria andFactoryaddressNotEqualTo(String value) {
            addCriterion("FactoryAddress <>", value, "factoryaddress");
            return (Criteria) this;
        }

        public Criteria andFactoryaddressGreaterThan(String value) {
            addCriterion("FactoryAddress >", value, "factoryaddress");
            return (Criteria) this;
        }

        public Criteria andFactoryaddressGreaterThanOrEqualTo(String value) {
            addCriterion("FactoryAddress >=", value, "factoryaddress");
            return (Criteria) this;
        }

        public Criteria andFactoryaddressLessThan(String value) {
            addCriterion("FactoryAddress <", value, "factoryaddress");
            return (Criteria) this;
        }

        public Criteria andFactoryaddressLessThanOrEqualTo(String value) {
            addCriterion("FactoryAddress <=", value, "factoryaddress");
            return (Criteria) this;
        }

        public Criteria andFactoryaddressLike(String value) {
            addCriterion("FactoryAddress like", value, "factoryaddress");
            return (Criteria) this;
        }

        public Criteria andFactoryaddressNotLike(String value) {
            addCriterion("FactoryAddress not like", value, "factoryaddress");
            return (Criteria) this;
        }

        public Criteria andFactoryaddressIn(List<String> values) {
            addCriterion("FactoryAddress in", values, "factoryaddress");
            return (Criteria) this;
        }

        public Criteria andFactoryaddressNotIn(List<String> values) {
            addCriterion("FactoryAddress not in", values, "factoryaddress");
            return (Criteria) this;
        }

        public Criteria andFactoryaddressBetween(String value1, String value2) {
            addCriterion("FactoryAddress between", value1, value2, "factoryaddress");
            return (Criteria) this;
        }

        public Criteria andFactoryaddressNotBetween(String value1, String value2) {
            addCriterion("FactoryAddress not between", value1, value2, "factoryaddress");
            return (Criteria) this;
        }

        public Criteria andProduceaddressIsNull() {
            addCriterion("ProduceAddress is null");
            return (Criteria) this;
        }

        public Criteria andProduceaddressIsNotNull() {
            addCriterion("ProduceAddress is not null");
            return (Criteria) this;
        }

        public Criteria andProduceaddressEqualTo(String value) {
            addCriterion("ProduceAddress =", value, "produceaddress");
            return (Criteria) this;
        }

        public Criteria andProduceaddressNotEqualTo(String value) {
            addCriterion("ProduceAddress <>", value, "produceaddress");
            return (Criteria) this;
        }

        public Criteria andProduceaddressGreaterThan(String value) {
            addCriterion("ProduceAddress >", value, "produceaddress");
            return (Criteria) this;
        }

        public Criteria andProduceaddressGreaterThanOrEqualTo(String value) {
            addCriterion("ProduceAddress >=", value, "produceaddress");
            return (Criteria) this;
        }

        public Criteria andProduceaddressLessThan(String value) {
            addCriterion("ProduceAddress <", value, "produceaddress");
            return (Criteria) this;
        }

        public Criteria andProduceaddressLessThanOrEqualTo(String value) {
            addCriterion("ProduceAddress <=", value, "produceaddress");
            return (Criteria) this;
        }

        public Criteria andProduceaddressLike(String value) {
            addCriterion("ProduceAddress like", value, "produceaddress");
            return (Criteria) this;
        }

        public Criteria andProduceaddressNotLike(String value) {
            addCriterion("ProduceAddress not like", value, "produceaddress");
            return (Criteria) this;
        }

        public Criteria andProduceaddressIn(List<String> values) {
            addCriterion("ProduceAddress in", values, "produceaddress");
            return (Criteria) this;
        }

        public Criteria andProduceaddressNotIn(List<String> values) {
            addCriterion("ProduceAddress not in", values, "produceaddress");
            return (Criteria) this;
        }

        public Criteria andProduceaddressBetween(String value1, String value2) {
            addCriterion("ProduceAddress between", value1, value2, "produceaddress");
            return (Criteria) this;
        }

        public Criteria andProduceaddressNotBetween(String value1, String value2) {
            addCriterion("ProduceAddress not between", value1, value2, "produceaddress");
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
            addCriterion("CertificateApproveDate =", value, "certificateapprovedate");
            return (Criteria) this;
        }

        public Criteria andCertificateapprovedateNotEqualTo(Date value) {
            addCriterion("CertificateApproveDate <>", value, "certificateapprovedate");
            return (Criteria) this;
        }

        public Criteria andCertificateapprovedateGreaterThan(Date value) {
            addCriterion("CertificateApproveDate >", value, "certificateapprovedate");
            return (Criteria) this;
        }

        public Criteria andCertificateapprovedateGreaterThanOrEqualTo(Date value) {
            addCriterion("CertificateApproveDate >=", value, "certificateapprovedate");
            return (Criteria) this;
        }

        public Criteria andCertificateapprovedateLessThan(Date value) {
            addCriterion("CertificateApproveDate <", value, "certificateapprovedate");
            return (Criteria) this;
        }

        public Criteria andCertificateapprovedateLessThanOrEqualTo(Date value) {
            addCriterion("CertificateApproveDate <=", value, "certificateapprovedate");
            return (Criteria) this;
        }

        public Criteria andCertificateapprovedateIn(List<Date> values) {
            addCriterion("CertificateApproveDate in", values, "certificateapprovedate");
            return (Criteria) this;
        }

        public Criteria andCertificateapprovedateNotIn(List<Date> values) {
            addCriterion("CertificateApproveDate not in", values, "certificateapprovedate");
            return (Criteria) this;
        }

        public Criteria andCertificateapprovedateBetween(Date value1, Date value2) {
            addCriterion("CertificateApproveDate between", value1, value2, "certificateapprovedate");
            return (Criteria) this;
        }

        public Criteria andCertificateapprovedateNotBetween(Date value1, Date value2) {
            addCriterion("CertificateApproveDate not between", value1, value2, "certificateapprovedate");
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

        public Criteria andCertificaterangeIsNull() {
            addCriterion("CertificateRange is null");
            return (Criteria) this;
        }

        public Criteria andCertificaterangeIsNotNull() {
            addCriterion("CertificateRange is not null");
            return (Criteria) this;
        }

        public Criteria andCertificaterangeEqualTo(String value) {
            addCriterion("CertificateRange =", value, "certificaterange");
            return (Criteria) this;
        }

        public Criteria andCertificaterangeNotEqualTo(String value) {
            addCriterion("CertificateRange <>", value, "certificaterange");
            return (Criteria) this;
        }

        public Criteria andCertificaterangeGreaterThan(String value) {
            addCriterion("CertificateRange >", value, "certificaterange");
            return (Criteria) this;
        }

        public Criteria andCertificaterangeGreaterThanOrEqualTo(String value) {
            addCriterion("CertificateRange >=", value, "certificaterange");
            return (Criteria) this;
        }

        public Criteria andCertificaterangeLessThan(String value) {
            addCriterion("CertificateRange <", value, "certificaterange");
            return (Criteria) this;
        }

        public Criteria andCertificaterangeLessThanOrEqualTo(String value) {
            addCriterion("CertificateRange <=", value, "certificaterange");
            return (Criteria) this;
        }

        public Criteria andCertificaterangeLike(String value) {
            addCriterion("CertificateRange like", value, "certificaterange");
            return (Criteria) this;
        }

        public Criteria andCertificaterangeNotLike(String value) {
            addCriterion("CertificateRange not like", value, "certificaterange");
            return (Criteria) this;
        }

        public Criteria andCertificaterangeIn(List<String> values) {
            addCriterion("CertificateRange in", values, "certificaterange");
            return (Criteria) this;
        }

        public Criteria andCertificaterangeNotIn(List<String> values) {
            addCriterion("CertificateRange not in", values, "certificaterange");
            return (Criteria) this;
        }

        public Criteria andCertificaterangeBetween(String value1, String value2) {
            addCriterion("CertificateRange between", value1, value2, "certificaterange");
            return (Criteria) this;
        }

        public Criteria andCertificaterangeNotBetween(String value1, String value2) {
            addCriterion("CertificateRange not between", value1, value2, "certificaterange");
            return (Criteria) this;
        }

        public Criteria andCertificaterangenumberIsNull() {
            addCriterion("CertificateRangeNumber is null");
            return (Criteria) this;
        }

        public Criteria andCertificaterangenumberIsNotNull() {
            addCriterion("CertificateRangeNumber is not null");
            return (Criteria) this;
        }

        public Criteria andCertificaterangenumberEqualTo(String value) {
            addCriterion("CertificateRangeNumber =", value, "certificaterangenumber");
            return (Criteria) this;
        }

        public Criteria andCertificaterangenumberNotEqualTo(String value) {
            addCriterion("CertificateRangeNumber <>", value, "certificaterangenumber");
            return (Criteria) this;
        }

        public Criteria andCertificaterangenumberGreaterThan(String value) {
            addCriterion("CertificateRangeNumber >", value, "certificaterangenumber");
            return (Criteria) this;
        }

        public Criteria andCertificaterangenumberGreaterThanOrEqualTo(String value) {
            addCriterion("CertificateRangeNumber >=", value, "certificaterangenumber");
            return (Criteria) this;
        }

        public Criteria andCertificaterangenumberLessThan(String value) {
            addCriterion("CertificateRangeNumber <", value, "certificaterangenumber");
            return (Criteria) this;
        }

        public Criteria andCertificaterangenumberLessThanOrEqualTo(String value) {
            addCriterion("CertificateRangeNumber <=", value, "certificaterangenumber");
            return (Criteria) this;
        }

        public Criteria andCertificaterangenumberLike(String value) {
            addCriterion("CertificateRangeNumber like", value, "certificaterangenumber");
            return (Criteria) this;
        }

        public Criteria andCertificaterangenumberNotLike(String value) {
            addCriterion("CertificateRangeNumber not like", value, "certificaterangenumber");
            return (Criteria) this;
        }

        public Criteria andCertificaterangenumberIn(List<String> values) {
            addCriterion("CertificateRangeNumber in", values, "certificaterangenumber");
            return (Criteria) this;
        }

        public Criteria andCertificaterangenumberNotIn(List<String> values) {
            addCriterion("CertificateRangeNumber not in", values, "certificaterangenumber");
            return (Criteria) this;
        }

        public Criteria andCertificaterangenumberBetween(String value1, String value2) {
            addCriterion("CertificateRangeNumber between", value1, value2, "certificaterangenumber");
            return (Criteria) this;
        }

        public Criteria andCertificaterangenumberNotBetween(String value1, String value2) {
            addCriterion("CertificateRangeNumber not between", value1, value2, "certificaterangenumber");
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
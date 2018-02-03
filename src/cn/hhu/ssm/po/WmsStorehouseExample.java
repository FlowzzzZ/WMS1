package cn.hhu.ssm.po;

import java.util.ArrayList;
import java.util.List;

public class WmsStorehouseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WmsStorehouseExample() {
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

        public Criteria andStorehousesIdIsNull() {
            addCriterion("Storehouses_ID is null");
            return (Criteria) this;
        }

        public Criteria andStorehousesIdIsNotNull() {
            addCriterion("Storehouses_ID is not null");
            return (Criteria) this;
        }

        public Criteria andStorehousesIdEqualTo(Integer value) {
            addCriterion("Storehouses_ID =", value, "storehousesId");
            return (Criteria) this;
        }

        public Criteria andStorehousesIdNotEqualTo(Integer value) {
            addCriterion("Storehouses_ID <>", value, "storehousesId");
            return (Criteria) this;
        }

        public Criteria andStorehousesIdGreaterThan(Integer value) {
            addCriterion("Storehouses_ID >", value, "storehousesId");
            return (Criteria) this;
        }

        public Criteria andStorehousesIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Storehouses_ID >=", value, "storehousesId");
            return (Criteria) this;
        }

        public Criteria andStorehousesIdLessThan(Integer value) {
            addCriterion("Storehouses_ID <", value, "storehousesId");
            return (Criteria) this;
        }

        public Criteria andStorehousesIdLessThanOrEqualTo(Integer value) {
            addCriterion("Storehouses_ID <=", value, "storehousesId");
            return (Criteria) this;
        }

        public Criteria andStorehousesIdIn(List<Integer> values) {
            addCriterion("Storehouses_ID in", values, "storehousesId");
            return (Criteria) this;
        }

        public Criteria andStorehousesIdNotIn(List<Integer> values) {
            addCriterion("Storehouses_ID not in", values, "storehousesId");
            return (Criteria) this;
        }

        public Criteria andStorehousesIdBetween(Integer value1, Integer value2) {
            addCriterion("Storehouses_ID between", value1, value2, "storehousesId");
            return (Criteria) this;
        }

        public Criteria andStorehousesIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Storehouses_ID not between", value1, value2, "storehousesId");
            return (Criteria) this;
        }

        public Criteria andStorehousesNumberIsNull() {
            addCriterion("Storehouses_Number is null");
            return (Criteria) this;
        }

        public Criteria andStorehousesNumberIsNotNull() {
            addCriterion("Storehouses_Number is not null");
            return (Criteria) this;
        }

        public Criteria andStorehousesNumberEqualTo(String value) {
            addCriterion("Storehouses_Number =", value, "storehousesNumber");
            return (Criteria) this;
        }

        public Criteria andStorehousesNumberNotEqualTo(String value) {
            addCriterion("Storehouses_Number <>", value, "storehousesNumber");
            return (Criteria) this;
        }

        public Criteria andStorehousesNumberGreaterThan(String value) {
            addCriterion("Storehouses_Number >", value, "storehousesNumber");
            return (Criteria) this;
        }

        public Criteria andStorehousesNumberGreaterThanOrEqualTo(String value) {
            addCriterion("Storehouses_Number >=", value, "storehousesNumber");
            return (Criteria) this;
        }

        public Criteria andStorehousesNumberLessThan(String value) {
            addCriterion("Storehouses_Number <", value, "storehousesNumber");
            return (Criteria) this;
        }

        public Criteria andStorehousesNumberLessThanOrEqualTo(String value) {
            addCriterion("Storehouses_Number <=", value, "storehousesNumber");
            return (Criteria) this;
        }

        public Criteria andStorehousesNumberLike(String value) {
            addCriterion("Storehouses_Number like", value, "storehousesNumber");
            return (Criteria) this;
        }

        public Criteria andStorehousesNumberNotLike(String value) {
            addCriterion("Storehouses_Number not like", value, "storehousesNumber");
            return (Criteria) this;
        }

        public Criteria andStorehousesNumberIn(List<String> values) {
            addCriterion("Storehouses_Number in", values, "storehousesNumber");
            return (Criteria) this;
        }

        public Criteria andStorehousesNumberNotIn(List<String> values) {
            addCriterion("Storehouses_Number not in", values, "storehousesNumber");
            return (Criteria) this;
        }

        public Criteria andStorehousesNumberBetween(String value1, String value2) {
            addCriterion("Storehouses_Number between", value1, value2, "storehousesNumber");
            return (Criteria) this;
        }

        public Criteria andStorehousesNumberNotBetween(String value1, String value2) {
            addCriterion("Storehouses_Number not between", value1, value2, "storehousesNumber");
            return (Criteria) this;
        }

        public Criteria andParentstorehouseNumberIsNull() {
            addCriterion("ParentStorehouse_Number is null");
            return (Criteria) this;
        }

        public Criteria andParentstorehouseNumberIsNotNull() {
            addCriterion("ParentStorehouse_Number is not null");
            return (Criteria) this;
        }

        public Criteria andParentstorehouseNumberEqualTo(Integer value) {
            addCriterion("ParentStorehouse_Number =", value, "parentstorehouseNumber");
            return (Criteria) this;
        }

        public Criteria andParentstorehouseNumberNotEqualTo(Integer value) {
            addCriterion("ParentStorehouse_Number <>", value, "parentstorehouseNumber");
            return (Criteria) this;
        }

        public Criteria andParentstorehouseNumberGreaterThan(Integer value) {
            addCriterion("ParentStorehouse_Number >", value, "parentstorehouseNumber");
            return (Criteria) this;
        }

        public Criteria andParentstorehouseNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("ParentStorehouse_Number >=", value, "parentstorehouseNumber");
            return (Criteria) this;
        }

        public Criteria andParentstorehouseNumberLessThan(Integer value) {
            addCriterion("ParentStorehouse_Number <", value, "parentstorehouseNumber");
            return (Criteria) this;
        }

        public Criteria andParentstorehouseNumberLessThanOrEqualTo(Integer value) {
            addCriterion("ParentStorehouse_Number <=", value, "parentstorehouseNumber");
            return (Criteria) this;
        }

        public Criteria andParentstorehouseNumberIn(List<Integer> values) {
            addCriterion("ParentStorehouse_Number in", values, "parentstorehouseNumber");
            return (Criteria) this;
        }

        public Criteria andParentstorehouseNumberNotIn(List<Integer> values) {
            addCriterion("ParentStorehouse_Number not in", values, "parentstorehouseNumber");
            return (Criteria) this;
        }

        public Criteria andParentstorehouseNumberBetween(Integer value1, Integer value2) {
            addCriterion("ParentStorehouse_Number between", value1, value2, "parentstorehouseNumber");
            return (Criteria) this;
        }

        public Criteria andParentstorehouseNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("ParentStorehouse_Number not between", value1, value2, "parentstorehouseNumber");
            return (Criteria) this;
        }

        public Criteria andAbbreviationIsNull() {
            addCriterion("Abbreviation is null");
            return (Criteria) this;
        }

        public Criteria andAbbreviationIsNotNull() {
            addCriterion("Abbreviation is not null");
            return (Criteria) this;
        }

        public Criteria andAbbreviationEqualTo(String value) {
            addCriterion("Abbreviation =", value, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationNotEqualTo(String value) {
            addCriterion("Abbreviation <>", value, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationGreaterThan(String value) {
            addCriterion("Abbreviation >", value, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationGreaterThanOrEqualTo(String value) {
            addCriterion("Abbreviation >=", value, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationLessThan(String value) {
            addCriterion("Abbreviation <", value, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationLessThanOrEqualTo(String value) {
            addCriterion("Abbreviation <=", value, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationLike(String value) {
            addCriterion("Abbreviation like", value, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationNotLike(String value) {
            addCriterion("Abbreviation not like", value, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationIn(List<String> values) {
            addCriterion("Abbreviation in", values, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationNotIn(List<String> values) {
            addCriterion("Abbreviation not in", values, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationBetween(String value1, String value2) {
            addCriterion("Abbreviation between", value1, value2, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationNotBetween(String value1, String value2) {
            addCriterion("Abbreviation not between", value1, value2, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andStorehousenameIsNull() {
            addCriterion("StorehouseName is null");
            return (Criteria) this;
        }

        public Criteria andStorehousenameIsNotNull() {
            addCriterion("StorehouseName is not null");
            return (Criteria) this;
        }

        public Criteria andStorehousenameEqualTo(String value) {
            addCriterion("StorehouseName =", value, "storehousename");
            return (Criteria) this;
        }

        public Criteria andStorehousenameNotEqualTo(String value) {
            addCriterion("StorehouseName <>", value, "storehousename");
            return (Criteria) this;
        }

        public Criteria andStorehousenameGreaterThan(String value) {
            addCriterion("StorehouseName >", value, "storehousename");
            return (Criteria) this;
        }

        public Criteria andStorehousenameGreaterThanOrEqualTo(String value) {
            addCriterion("StorehouseName >=", value, "storehousename");
            return (Criteria) this;
        }

        public Criteria andStorehousenameLessThan(String value) {
            addCriterion("StorehouseName <", value, "storehousename");
            return (Criteria) this;
        }

        public Criteria andStorehousenameLessThanOrEqualTo(String value) {
            addCriterion("StorehouseName <=", value, "storehousename");
            return (Criteria) this;
        }

        public Criteria andStorehousenameLike(String value) {
            addCriterion("StorehouseName like", value, "storehousename");
            return (Criteria) this;
        }

        public Criteria andStorehousenameNotLike(String value) {
            addCriterion("StorehouseName not like", value, "storehousename");
            return (Criteria) this;
        }

        public Criteria andStorehousenameIn(List<String> values) {
            addCriterion("StorehouseName in", values, "storehousename");
            return (Criteria) this;
        }

        public Criteria andStorehousenameNotIn(List<String> values) {
            addCriterion("StorehouseName not in", values, "storehousename");
            return (Criteria) this;
        }

        public Criteria andStorehousenameBetween(String value1, String value2) {
            addCriterion("StorehouseName between", value1, value2, "storehousename");
            return (Criteria) this;
        }

        public Criteria andStorehousenameNotBetween(String value1, String value2) {
            addCriterion("StorehouseName not between", value1, value2, "storehousename");
            return (Criteria) this;
        }

        public Criteria andRegistrationaddressIsNull() {
            addCriterion("RegistrationAddress is null");
            return (Criteria) this;
        }

        public Criteria andRegistrationaddressIsNotNull() {
            addCriterion("RegistrationAddress is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrationaddressEqualTo(String value) {
            addCriterion("RegistrationAddress =", value, "registrationaddress");
            return (Criteria) this;
        }

        public Criteria andRegistrationaddressNotEqualTo(String value) {
            addCriterion("RegistrationAddress <>", value, "registrationaddress");
            return (Criteria) this;
        }

        public Criteria andRegistrationaddressGreaterThan(String value) {
            addCriterion("RegistrationAddress >", value, "registrationaddress");
            return (Criteria) this;
        }

        public Criteria andRegistrationaddressGreaterThanOrEqualTo(String value) {
            addCriterion("RegistrationAddress >=", value, "registrationaddress");
            return (Criteria) this;
        }

        public Criteria andRegistrationaddressLessThan(String value) {
            addCriterion("RegistrationAddress <", value, "registrationaddress");
            return (Criteria) this;
        }

        public Criteria andRegistrationaddressLessThanOrEqualTo(String value) {
            addCriterion("RegistrationAddress <=", value, "registrationaddress");
            return (Criteria) this;
        }

        public Criteria andRegistrationaddressLike(String value) {
            addCriterion("RegistrationAddress like", value, "registrationaddress");
            return (Criteria) this;
        }

        public Criteria andRegistrationaddressNotLike(String value) {
            addCriterion("RegistrationAddress not like", value, "registrationaddress");
            return (Criteria) this;
        }

        public Criteria andRegistrationaddressIn(List<String> values) {
            addCriterion("RegistrationAddress in", values, "registrationaddress");
            return (Criteria) this;
        }

        public Criteria andRegistrationaddressNotIn(List<String> values) {
            addCriterion("RegistrationAddress not in", values, "registrationaddress");
            return (Criteria) this;
        }

        public Criteria andRegistrationaddressBetween(String value1, String value2) {
            addCriterion("RegistrationAddress between", value1, value2, "registrationaddress");
            return (Criteria) this;
        }

        public Criteria andRegistrationaddressNotBetween(String value1, String value2) {
            addCriterion("RegistrationAddress not between", value1, value2, "registrationaddress");
            return (Criteria) this;
        }

        public Criteria andReceivegoodsaddressIsNull() {
            addCriterion("ReceiveGoodsAddress is null");
            return (Criteria) this;
        }

        public Criteria andReceivegoodsaddressIsNotNull() {
            addCriterion("ReceiveGoodsAddress is not null");
            return (Criteria) this;
        }

        public Criteria andReceivegoodsaddressEqualTo(String value) {
            addCriterion("ReceiveGoodsAddress =", value, "receivegoodsaddress");
            return (Criteria) this;
        }

        public Criteria andReceivegoodsaddressNotEqualTo(String value) {
            addCriterion("ReceiveGoodsAddress <>", value, "receivegoodsaddress");
            return (Criteria) this;
        }

        public Criteria andReceivegoodsaddressGreaterThan(String value) {
            addCriterion("ReceiveGoodsAddress >", value, "receivegoodsaddress");
            return (Criteria) this;
        }

        public Criteria andReceivegoodsaddressGreaterThanOrEqualTo(String value) {
            addCriterion("ReceiveGoodsAddress >=", value, "receivegoodsaddress");
            return (Criteria) this;
        }

        public Criteria andReceivegoodsaddressLessThan(String value) {
            addCriterion("ReceiveGoodsAddress <", value, "receivegoodsaddress");
            return (Criteria) this;
        }

        public Criteria andReceivegoodsaddressLessThanOrEqualTo(String value) {
            addCriterion("ReceiveGoodsAddress <=", value, "receivegoodsaddress");
            return (Criteria) this;
        }

        public Criteria andReceivegoodsaddressLike(String value) {
            addCriterion("ReceiveGoodsAddress like", value, "receivegoodsaddress");
            return (Criteria) this;
        }

        public Criteria andReceivegoodsaddressNotLike(String value) {
            addCriterion("ReceiveGoodsAddress not like", value, "receivegoodsaddress");
            return (Criteria) this;
        }

        public Criteria andReceivegoodsaddressIn(List<String> values) {
            addCriterion("ReceiveGoodsAddress in", values, "receivegoodsaddress");
            return (Criteria) this;
        }

        public Criteria andReceivegoodsaddressNotIn(List<String> values) {
            addCriterion("ReceiveGoodsAddress not in", values, "receivegoodsaddress");
            return (Criteria) this;
        }

        public Criteria andReceivegoodsaddressBetween(String value1, String value2) {
            addCriterion("ReceiveGoodsAddress between", value1, value2, "receivegoodsaddress");
            return (Criteria) this;
        }

        public Criteria andReceivegoodsaddressNotBetween(String value1, String value2) {
            addCriterion("ReceiveGoodsAddress not between", value1, value2, "receivegoodsaddress");
            return (Criteria) this;
        }

        public Criteria andResponsiblepersonIsNull() {
            addCriterion("ResponsiblePerson is null");
            return (Criteria) this;
        }

        public Criteria andResponsiblepersonIsNotNull() {
            addCriterion("ResponsiblePerson is not null");
            return (Criteria) this;
        }

        public Criteria andResponsiblepersonEqualTo(String value) {
            addCriterion("ResponsiblePerson =", value, "responsibleperson");
            return (Criteria) this;
        }

        public Criteria andResponsiblepersonNotEqualTo(String value) {
            addCriterion("ResponsiblePerson <>", value, "responsibleperson");
            return (Criteria) this;
        }

        public Criteria andResponsiblepersonGreaterThan(String value) {
            addCriterion("ResponsiblePerson >", value, "responsibleperson");
            return (Criteria) this;
        }

        public Criteria andResponsiblepersonGreaterThanOrEqualTo(String value) {
            addCriterion("ResponsiblePerson >=", value, "responsibleperson");
            return (Criteria) this;
        }

        public Criteria andResponsiblepersonLessThan(String value) {
            addCriterion("ResponsiblePerson <", value, "responsibleperson");
            return (Criteria) this;
        }

        public Criteria andResponsiblepersonLessThanOrEqualTo(String value) {
            addCriterion("ResponsiblePerson <=", value, "responsibleperson");
            return (Criteria) this;
        }

        public Criteria andResponsiblepersonLike(String value) {
            addCriterion("ResponsiblePerson like", value, "responsibleperson");
            return (Criteria) this;
        }

        public Criteria andResponsiblepersonNotLike(String value) {
            addCriterion("ResponsiblePerson not like", value, "responsibleperson");
            return (Criteria) this;
        }

        public Criteria andResponsiblepersonIn(List<String> values) {
            addCriterion("ResponsiblePerson in", values, "responsibleperson");
            return (Criteria) this;
        }

        public Criteria andResponsiblepersonNotIn(List<String> values) {
            addCriterion("ResponsiblePerson not in", values, "responsibleperson");
            return (Criteria) this;
        }

        public Criteria andResponsiblepersonBetween(String value1, String value2) {
            addCriterion("ResponsiblePerson between", value1, value2, "responsibleperson");
            return (Criteria) this;
        }

        public Criteria andResponsiblepersonNotBetween(String value1, String value2) {
            addCriterion("ResponsiblePerson not between", value1, value2, "responsibleperson");
            return (Criteria) this;
        }

        public Criteria andContacttelIsNull() {
            addCriterion("ContactTel is null");
            return (Criteria) this;
        }

        public Criteria andContacttelIsNotNull() {
            addCriterion("ContactTel is not null");
            return (Criteria) this;
        }

        public Criteria andContacttelEqualTo(String value) {
            addCriterion("ContactTel =", value, "contacttel");
            return (Criteria) this;
        }

        public Criteria andContacttelNotEqualTo(String value) {
            addCriterion("ContactTel <>", value, "contacttel");
            return (Criteria) this;
        }

        public Criteria andContacttelGreaterThan(String value) {
            addCriterion("ContactTel >", value, "contacttel");
            return (Criteria) this;
        }

        public Criteria andContacttelGreaterThanOrEqualTo(String value) {
            addCriterion("ContactTel >=", value, "contacttel");
            return (Criteria) this;
        }

        public Criteria andContacttelLessThan(String value) {
            addCriterion("ContactTel <", value, "contacttel");
            return (Criteria) this;
        }

        public Criteria andContacttelLessThanOrEqualTo(String value) {
            addCriterion("ContactTel <=", value, "contacttel");
            return (Criteria) this;
        }

        public Criteria andContacttelLike(String value) {
            addCriterion("ContactTel like", value, "contacttel");
            return (Criteria) this;
        }

        public Criteria andContacttelNotLike(String value) {
            addCriterion("ContactTel not like", value, "contacttel");
            return (Criteria) this;
        }

        public Criteria andContacttelIn(List<String> values) {
            addCriterion("ContactTel in", values, "contacttel");
            return (Criteria) this;
        }

        public Criteria andContacttelNotIn(List<String> values) {
            addCriterion("ContactTel not in", values, "contacttel");
            return (Criteria) this;
        }

        public Criteria andContacttelBetween(String value1, String value2) {
            addCriterion("ContactTel between", value1, value2, "contacttel");
            return (Criteria) this;
        }

        public Criteria andContacttelNotBetween(String value1, String value2) {
            addCriterion("ContactTel not between", value1, value2, "contacttel");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseIsNull() {
            addCriterion("BusinessLicense is null");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseIsNotNull() {
            addCriterion("BusinessLicense is not null");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseEqualTo(String value) {
            addCriterion("BusinessLicense =", value, "businesslicense");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseNotEqualTo(String value) {
            addCriterion("BusinessLicense <>", value, "businesslicense");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseGreaterThan(String value) {
            addCriterion("BusinessLicense >", value, "businesslicense");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseGreaterThanOrEqualTo(String value) {
            addCriterion("BusinessLicense >=", value, "businesslicense");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseLessThan(String value) {
            addCriterion("BusinessLicense <", value, "businesslicense");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseLessThanOrEqualTo(String value) {
            addCriterion("BusinessLicense <=", value, "businesslicense");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseLike(String value) {
            addCriterion("BusinessLicense like", value, "businesslicense");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseNotLike(String value) {
            addCriterion("BusinessLicense not like", value, "businesslicense");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseIn(List<String> values) {
            addCriterion("BusinessLicense in", values, "businesslicense");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseNotIn(List<String> values) {
            addCriterion("BusinessLicense not in", values, "businesslicense");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseBetween(String value1, String value2) {
            addCriterion("BusinessLicense between", value1, value2, "businesslicense");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseNotBetween(String value1, String value2) {
            addCriterion("BusinessLicense not between", value1, value2, "businesslicense");
            return (Criteria) this;
        }

        public Criteria andBusinessallowlanceIsNull() {
            addCriterion("BusinessAllowlance is null");
            return (Criteria) this;
        }

        public Criteria andBusinessallowlanceIsNotNull() {
            addCriterion("BusinessAllowlance is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessallowlanceEqualTo(String value) {
            addCriterion("BusinessAllowlance =", value, "businessallowlance");
            return (Criteria) this;
        }

        public Criteria andBusinessallowlanceNotEqualTo(String value) {
            addCriterion("BusinessAllowlance <>", value, "businessallowlance");
            return (Criteria) this;
        }

        public Criteria andBusinessallowlanceGreaterThan(String value) {
            addCriterion("BusinessAllowlance >", value, "businessallowlance");
            return (Criteria) this;
        }

        public Criteria andBusinessallowlanceGreaterThanOrEqualTo(String value) {
            addCriterion("BusinessAllowlance >=", value, "businessallowlance");
            return (Criteria) this;
        }

        public Criteria andBusinessallowlanceLessThan(String value) {
            addCriterion("BusinessAllowlance <", value, "businessallowlance");
            return (Criteria) this;
        }

        public Criteria andBusinessallowlanceLessThanOrEqualTo(String value) {
            addCriterion("BusinessAllowlance <=", value, "businessallowlance");
            return (Criteria) this;
        }

        public Criteria andBusinessallowlanceLike(String value) {
            addCriterion("BusinessAllowlance like", value, "businessallowlance");
            return (Criteria) this;
        }

        public Criteria andBusinessallowlanceNotLike(String value) {
            addCriterion("BusinessAllowlance not like", value, "businessallowlance");
            return (Criteria) this;
        }

        public Criteria andBusinessallowlanceIn(List<String> values) {
            addCriterion("BusinessAllowlance in", values, "businessallowlance");
            return (Criteria) this;
        }

        public Criteria andBusinessallowlanceNotIn(List<String> values) {
            addCriterion("BusinessAllowlance not in", values, "businessallowlance");
            return (Criteria) this;
        }

        public Criteria andBusinessallowlanceBetween(String value1, String value2) {
            addCriterion("BusinessAllowlance between", value1, value2, "businessallowlance");
            return (Criteria) this;
        }

        public Criteria andBusinessallowlanceNotBetween(String value1, String value2) {
            addCriterion("BusinessAllowlance not between", value1, value2, "businessallowlance");
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
package cn.hhu.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WmsExplanExample {
    protected String orderByClause;

    protected boolean distinct;
    protected List<Criteria> oredCriteria;
    protected Integer offset;
    protected Integer limit;

    public Integer getOffset() {
		return offset;
	}

	public void setOffset(Integer offset) {
		this.offset = offset;
	}

	public Integer getLimit() {
		return limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
	}

	public WmsExplanExample() {
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

        public Criteria andExplanIdIsNull() {
            addCriterion("EXPlan_ID is null");
            return (Criteria) this;
        }

        public Criteria andExplanIdIsNotNull() {
            addCriterion("EXPlan_ID is not null");
            return (Criteria) this;
        }

        public Criteria andExplanIdEqualTo(Integer value) {
            addCriterion("EXPlan_ID =", value, "explanId");
            return (Criteria) this;
        }

        public Criteria andExplanIdNotEqualTo(Integer value) {
            addCriterion("EXPlan_ID <>", value, "explanId");
            return (Criteria) this;
        }

        public Criteria andExplanIdGreaterThan(Integer value) {
            addCriterion("EXPlan_ID >", value, "explanId");
            return (Criteria) this;
        }

        public Criteria andExplanIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("EXPlan_ID >=", value, "explanId");
            return (Criteria) this;
        }

        public Criteria andExplanIdLessThan(Integer value) {
            addCriterion("EXPlan_ID <", value, "explanId");
            return (Criteria) this;
        }

        public Criteria andExplanIdLessThanOrEqualTo(Integer value) {
            addCriterion("EXPlan_ID <=", value, "explanId");
            return (Criteria) this;
        }

        public Criteria andExplanIdIn(List<Integer> values) {
            addCriterion("EXPlan_ID in", values, "explanId");
            return (Criteria) this;
        }

        public Criteria andExplanIdNotIn(List<Integer> values) {
            addCriterion("EXPlan_ID not in", values, "explanId");
            return (Criteria) this;
        }

        public Criteria andExplanIdBetween(Integer value1, Integer value2) {
            addCriterion("EXPlan_ID between", value1, value2, "explanId");
            return (Criteria) this;
        }

        public Criteria andExplanIdNotBetween(Integer value1, Integer value2) {
            addCriterion("EXPlan_ID not between", value1, value2, "explanId");
            return (Criteria) this;
        }

        public Criteria andExplanNumberIsNull() {
            addCriterion("EXPlan_Number is null");
            return (Criteria) this;
        }

        public Criteria andExplanNumberIsNotNull() {
            addCriterion("EXPlan_Number is not null");
            return (Criteria) this;
        }

        public Criteria andExplanNumberEqualTo(String value) {
            addCriterion("EXPlan_Number =", value, "explanNumber");
            return (Criteria) this;
        }

        public Criteria andExplanNumberNotEqualTo(String value) {
            addCriterion("EXPlan_Number <>", value, "explanNumber");
            return (Criteria) this;
        }

        public Criteria andExplanNumberGreaterThan(String value) {
            addCriterion("EXPlan_Number >", value, "explanNumber");
            return (Criteria) this;
        }

        public Criteria andExplanNumberGreaterThanOrEqualTo(String value) {
            addCriterion("EXPlan_Number >=", value, "explanNumber");
            return (Criteria) this;
        }

        public Criteria andExplanNumberLessThan(String value) {
            addCriterion("EXPlan_Number <", value, "explanNumber");
            return (Criteria) this;
        }

        public Criteria andExplanNumberLessThanOrEqualTo(String value) {
            addCriterion("EXPlan_Number <=", value, "explanNumber");
            return (Criteria) this;
        }

        public Criteria andExplanNumberLike(String value) {
            addCriterion("EXPlan_Number like", value, "explanNumber");
            return (Criteria) this;
        }

        public Criteria andExplanNumberNotLike(String value) {
            addCriterion("EXPlan_Number not like", value, "explanNumber");
            return (Criteria) this;
        }

        public Criteria andExplanNumberIn(List<String> values) {
            addCriterion("EXPlan_Number in", values, "explanNumber");
            return (Criteria) this;
        }

        public Criteria andExplanNumberNotIn(List<String> values) {
            addCriterion("EXPlan_Number not in", values, "explanNumber");
            return (Criteria) this;
        }

        public Criteria andExplanNumberBetween(String value1, String value2) {
            addCriterion("EXPlan_Number between", value1, value2, "explanNumber");
            return (Criteria) this;
        }

        public Criteria andExplanNumberNotBetween(String value1, String value2) {
            addCriterion("EXPlan_Number not between", value1, value2, "explanNumber");
            return (Criteria) this;
        }

        public Criteria andShipperIdIsNull() {
            addCriterion("Shipper_ID is null");
            return (Criteria) this;
        }

        public Criteria andShipperIdIsNotNull() {
            addCriterion("Shipper_ID is not null");
            return (Criteria) this;
        }

        public Criteria andShipperIdEqualTo(Integer value) {
            addCriterion("Shipper_ID =", value, "shipperId");
            return (Criteria) this;
        }

        public Criteria andShipperIdNotEqualTo(Integer value) {
            addCriterion("Shipper_ID <>", value, "shipperId");
            return (Criteria) this;
        }

        public Criteria andShipperIdGreaterThan(Integer value) {
            addCriterion("Shipper_ID >", value, "shipperId");
            return (Criteria) this;
        }

        public Criteria andShipperIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Shipper_ID >=", value, "shipperId");
            return (Criteria) this;
        }

        public Criteria andShipperIdLessThan(Integer value) {
            addCriterion("Shipper_ID <", value, "shipperId");
            return (Criteria) this;
        }

        public Criteria andShipperIdLessThanOrEqualTo(Integer value) {
            addCriterion("Shipper_ID <=", value, "shipperId");
            return (Criteria) this;
        }

        public Criteria andShipperIdIn(List<Integer> values) {
            addCriterion("Shipper_ID in", values, "shipperId");
            return (Criteria) this;
        }

        public Criteria andShipperIdNotIn(List<Integer> values) {
            addCriterion("Shipper_ID not in", values, "shipperId");
            return (Criteria) this;
        }

        public Criteria andShipperIdBetween(Integer value1, Integer value2) {
            addCriterion("Shipper_ID between", value1, value2, "shipperId");
            return (Criteria) this;
        }

        public Criteria andShipperIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Shipper_ID not between", value1, value2, "shipperId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNull() {
            addCriterion("Customer_ID is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNotNull() {
            addCriterion("Customer_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdEqualTo(Integer value) {
            addCriterion("Customer_ID =", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotEqualTo(Integer value) {
            addCriterion("Customer_ID <>", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThan(Integer value) {
            addCriterion("Customer_ID >", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Customer_ID >=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThan(Integer value) {
            addCriterion("Customer_ID <", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThanOrEqualTo(Integer value) {
            addCriterion("Customer_ID <=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIn(List<Integer> values) {
            addCriterion("Customer_ID in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotIn(List<Integer> values) {
            addCriterion("Customer_ID not in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdBetween(Integer value1, Integer value2) {
            addCriterion("Customer_ID between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Customer_ID not between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomernameIsNull() {
            addCriterion("CustomerName is null");
            return (Criteria) this;
        }

        public Criteria andCustomernameIsNotNull() {
            addCriterion("CustomerName is not null");
            return (Criteria) this;
        }

        public Criteria andCustomernameEqualTo(String value) {
            addCriterion("CustomerName =", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotEqualTo(String value) {
            addCriterion("CustomerName <>", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameGreaterThan(String value) {
            addCriterion("CustomerName >", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameGreaterThanOrEqualTo(String value) {
            addCriterion("CustomerName >=", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameLessThan(String value) {
            addCriterion("CustomerName <", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameLessThanOrEqualTo(String value) {
            addCriterion("CustomerName <=", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameLike(String value) {
            addCriterion("CustomerName like", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotLike(String value) {
            addCriterion("CustomerName not like", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameIn(List<String> values) {
            addCriterion("CustomerName in", values, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotIn(List<String> values) {
            addCriterion("CustomerName not in", values, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameBetween(String value1, String value2) {
            addCriterion("CustomerName between", value1, value2, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotBetween(String value1, String value2) {
            addCriterion("CustomerName not between", value1, value2, "customername");
            return (Criteria) this;
        }

        public Criteria andFromaddressIsNull() {
            addCriterion("FromAddress is null");
            return (Criteria) this;
        }

        public Criteria andFromaddressIsNotNull() {
            addCriterion("FromAddress is not null");
            return (Criteria) this;
        }

        public Criteria andFromaddressEqualTo(String value) {
            addCriterion("FromAddress =", value, "fromaddress");
            return (Criteria) this;
        }

        public Criteria andFromaddressNotEqualTo(String value) {
            addCriterion("FromAddress <>", value, "fromaddress");
            return (Criteria) this;
        }

        public Criteria andFromaddressGreaterThan(String value) {
            addCriterion("FromAddress >", value, "fromaddress");
            return (Criteria) this;
        }

        public Criteria andFromaddressGreaterThanOrEqualTo(String value) {
            addCriterion("FromAddress >=", value, "fromaddress");
            return (Criteria) this;
        }

        public Criteria andFromaddressLessThan(String value) {
            addCriterion("FromAddress <", value, "fromaddress");
            return (Criteria) this;
        }

        public Criteria andFromaddressLessThanOrEqualTo(String value) {
            addCriterion("FromAddress <=", value, "fromaddress");
            return (Criteria) this;
        }

        public Criteria andFromaddressLike(String value) {
            addCriterion("FromAddress like", value, "fromaddress");
            return (Criteria) this;
        }

        public Criteria andFromaddressNotLike(String value) {
            addCriterion("FromAddress not like", value, "fromaddress");
            return (Criteria) this;
        }

        public Criteria andFromaddressIn(List<String> values) {
            addCriterion("FromAddress in", values, "fromaddress");
            return (Criteria) this;
        }

        public Criteria andFromaddressNotIn(List<String> values) {
            addCriterion("FromAddress not in", values, "fromaddress");
            return (Criteria) this;
        }

        public Criteria andFromaddressBetween(String value1, String value2) {
            addCriterion("FromAddress between", value1, value2, "fromaddress");
            return (Criteria) this;
        }

        public Criteria andFromaddressNotBetween(String value1, String value2) {
            addCriterion("FromAddress not between", value1, value2, "fromaddress");
            return (Criteria) this;
        }

        public Criteria andToaddressIsNull() {
            addCriterion("ToAddress is null");
            return (Criteria) this;
        }

        public Criteria andToaddressIsNotNull() {
            addCriterion("ToAddress is not null");
            return (Criteria) this;
        }

        public Criteria andToaddressEqualTo(String value) {
            addCriterion("ToAddress =", value, "toaddress");
            return (Criteria) this;
        }

        public Criteria andToaddressNotEqualTo(String value) {
            addCriterion("ToAddress <>", value, "toaddress");
            return (Criteria) this;
        }

        public Criteria andToaddressGreaterThan(String value) {
            addCriterion("ToAddress >", value, "toaddress");
            return (Criteria) this;
        }

        public Criteria andToaddressGreaterThanOrEqualTo(String value) {
            addCriterion("ToAddress >=", value, "toaddress");
            return (Criteria) this;
        }

        public Criteria andToaddressLessThan(String value) {
            addCriterion("ToAddress <", value, "toaddress");
            return (Criteria) this;
        }

        public Criteria andToaddressLessThanOrEqualTo(String value) {
            addCriterion("ToAddress <=", value, "toaddress");
            return (Criteria) this;
        }

        public Criteria andToaddressLike(String value) {
            addCriterion("ToAddress like", value, "toaddress");
            return (Criteria) this;
        }

        public Criteria andToaddressNotLike(String value) {
            addCriterion("ToAddress not like", value, "toaddress");
            return (Criteria) this;
        }

        public Criteria andToaddressIn(List<String> values) {
            addCriterion("ToAddress in", values, "toaddress");
            return (Criteria) this;
        }

        public Criteria andToaddressNotIn(List<String> values) {
            addCriterion("ToAddress not in", values, "toaddress");
            return (Criteria) this;
        }

        public Criteria andToaddressBetween(String value1, String value2) {
            addCriterion("ToAddress between", value1, value2, "toaddress");
            return (Criteria) this;
        }

        public Criteria andToaddressNotBetween(String value1, String value2) {
            addCriterion("ToAddress not between", value1, value2, "toaddress");
            return (Criteria) this;
        }

        public Criteria andExdateIsNull() {
            addCriterion("EXDate is null");
            return (Criteria) this;
        }

        public Criteria andExdateIsNotNull() {
            addCriterion("EXDate is not null");
            return (Criteria) this;
        }

        public Criteria andExdateEqualTo(Date value) {
            addCriterion("EXDate =", value, "exdate");
            return (Criteria) this;
        }

        public Criteria andExdateNotEqualTo(Date value) {
            addCriterion("EXDate <>", value, "exdate");
            return (Criteria) this;
        }

        public Criteria andExdateGreaterThan(Date value) {
            addCriterion("EXDate >", value, "exdate");
            return (Criteria) this;
        }

        public Criteria andExdateGreaterThanOrEqualTo(Date value) {
            addCriterion("EXDate >=", value, "exdate");
            return (Criteria) this;
        }

        public Criteria andExdateLessThan(Date value) {
            addCriterion("EXDate <", value, "exdate");
            return (Criteria) this;
        }

        public Criteria andExdateLessThanOrEqualTo(Date value) {
            addCriterion("EXDate <=", value, "exdate");
            return (Criteria) this;
        }

        public Criteria andExdateIn(List<Date> values) {
            addCriterion("EXDate in", values, "exdate");
            return (Criteria) this;
        }

        public Criteria andExdateNotIn(List<Date> values) {
            addCriterion("EXDate not in", values, "exdate");
            return (Criteria) this;
        }

        public Criteria andExdateBetween(Date value1, Date value2) {
            addCriterion("EXDate between", value1, value2, "exdate");
            return (Criteria) this;
        }

        public Criteria andExdateNotBetween(Date value1, Date value2) {
            addCriterion("EXDate not between", value1, value2, "exdate");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeIsNull() {
            addCriterion("BusinessType is null");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeIsNotNull() {
            addCriterion("BusinessType is not null");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeEqualTo(Integer value) {
            addCriterion("BusinessType =", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeNotEqualTo(Integer value) {
            addCriterion("BusinessType <>", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeGreaterThan(Integer value) {
            addCriterion("BusinessType >", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("BusinessType >=", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeLessThan(Integer value) {
            addCriterion("BusinessType <", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeLessThanOrEqualTo(Integer value) {
            addCriterion("BusinessType <=", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeIn(List<Integer> values) {
            addCriterion("BusinessType in", values, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeNotIn(List<Integer> values) {
            addCriterion("BusinessType not in", values, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeBetween(Integer value1, Integer value2) {
            addCriterion("BusinessType between", value1, value2, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeNotBetween(Integer value1, Integer value2) {
            addCriterion("BusinessType not between", value1, value2, "businesstype");
            return (Criteria) this;
        }

        public Criteria andIsbondedIsNull() {
            addCriterion("IsBonded is null");
            return (Criteria) this;
        }

        public Criteria andIsbondedIsNotNull() {
            addCriterion("IsBonded is not null");
            return (Criteria) this;
        }

        public Criteria andIsbondedEqualTo(Integer value) {
            addCriterion("IsBonded =", value, "isbonded");
            return (Criteria) this;
        }

        public Criteria andIsbondedNotEqualTo(Integer value) {
            addCriterion("IsBonded <>", value, "isbonded");
            return (Criteria) this;
        }

        public Criteria andIsbondedGreaterThan(Integer value) {
            addCriterion("IsBonded >", value, "isbonded");
            return (Criteria) this;
        }

        public Criteria andIsbondedGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsBonded >=", value, "isbonded");
            return (Criteria) this;
        }

        public Criteria andIsbondedLessThan(Integer value) {
            addCriterion("IsBonded <", value, "isbonded");
            return (Criteria) this;
        }

        public Criteria andIsbondedLessThanOrEqualTo(Integer value) {
            addCriterion("IsBonded <=", value, "isbonded");
            return (Criteria) this;
        }

        public Criteria andIsbondedIn(List<Integer> values) {
            addCriterion("IsBonded in", values, "isbonded");
            return (Criteria) this;
        }

        public Criteria andIsbondedNotIn(List<Integer> values) {
            addCriterion("IsBonded not in", values, "isbonded");
            return (Criteria) this;
        }

        public Criteria andIsbondedBetween(Integer value1, Integer value2) {
            addCriterion("IsBonded between", value1, value2, "isbonded");
            return (Criteria) this;
        }

        public Criteria andIsbondedNotBetween(Integer value1, Integer value2) {
            addCriterion("IsBonded not between", value1, value2, "isbonded");
            return (Criteria) this;
        }

        public Criteria andStoragetransportationrequirementIsNull() {
            addCriterion("StorageTransportationRequirement is null");
            return (Criteria) this;
        }

        public Criteria andStoragetransportationrequirementIsNotNull() {
            addCriterion("StorageTransportationRequirement is not null");
            return (Criteria) this;
        }

        public Criteria andStoragetransportationrequirementEqualTo(String value) {
            addCriterion("StorageTransportationRequirement =", value, "storagetransportationrequirement");
            return (Criteria) this;
        }

        public Criteria andStoragetransportationrequirementNotEqualTo(String value) {
            addCriterion("StorageTransportationRequirement <>", value, "storagetransportationrequirement");
            return (Criteria) this;
        }

        public Criteria andStoragetransportationrequirementGreaterThan(String value) {
            addCriterion("StorageTransportationRequirement >", value, "storagetransportationrequirement");
            return (Criteria) this;
        }

        public Criteria andStoragetransportationrequirementGreaterThanOrEqualTo(String value) {
            addCriterion("StorageTransportationRequirement >=", value, "storagetransportationrequirement");
            return (Criteria) this;
        }

        public Criteria andStoragetransportationrequirementLessThan(String value) {
            addCriterion("StorageTransportationRequirement <", value, "storagetransportationrequirement");
            return (Criteria) this;
        }

        public Criteria andStoragetransportationrequirementLessThanOrEqualTo(String value) {
            addCriterion("StorageTransportationRequirement <=", value, "storagetransportationrequirement");
            return (Criteria) this;
        }

        public Criteria andStoragetransportationrequirementLike(String value) {
            addCriterion("StorageTransportationRequirement like", value, "storagetransportationrequirement");
            return (Criteria) this;
        }

        public Criteria andStoragetransportationrequirementNotLike(String value) {
            addCriterion("StorageTransportationRequirement not like", value, "storagetransportationrequirement");
            return (Criteria) this;
        }

        public Criteria andStoragetransportationrequirementIn(List<String> values) {
            addCriterion("StorageTransportationRequirement in", values, "storagetransportationrequirement");
            return (Criteria) this;
        }

        public Criteria andStoragetransportationrequirementNotIn(List<String> values) {
            addCriterion("StorageTransportationRequirement not in", values, "storagetransportationrequirement");
            return (Criteria) this;
        }

        public Criteria andStoragetransportationrequirementBetween(String value1, String value2) {
            addCriterion("StorageTransportationRequirement between", value1, value2, "storagetransportationrequirement");
            return (Criteria) this;
        }

        public Criteria andStoragetransportationrequirementNotBetween(String value1, String value2) {
            addCriterion("StorageTransportationRequirement not between", value1, value2, "storagetransportationrequirement");
            return (Criteria) this;
        }

        public Criteria andIssupervisionIsNull() {
            addCriterion("IsSupervision is null");
            return (Criteria) this;
        }

        public Criteria andIssupervisionIsNotNull() {
            addCriterion("IsSupervision is not null");
            return (Criteria) this;
        }

        public Criteria andIssupervisionEqualTo(Integer value) {
            addCriterion("IsSupervision =", value, "issupervision");
            return (Criteria) this;
        }

        public Criteria andIssupervisionNotEqualTo(Integer value) {
            addCriterion("IsSupervision <>", value, "issupervision");
            return (Criteria) this;
        }

        public Criteria andIssupervisionGreaterThan(Integer value) {
            addCriterion("IsSupervision >", value, "issupervision");
            return (Criteria) this;
        }

        public Criteria andIssupervisionGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsSupervision >=", value, "issupervision");
            return (Criteria) this;
        }

        public Criteria andIssupervisionLessThan(Integer value) {
            addCriterion("IsSupervision <", value, "issupervision");
            return (Criteria) this;
        }

        public Criteria andIssupervisionLessThanOrEqualTo(Integer value) {
            addCriterion("IsSupervision <=", value, "issupervision");
            return (Criteria) this;
        }

        public Criteria andIssupervisionIn(List<Integer> values) {
            addCriterion("IsSupervision in", values, "issupervision");
            return (Criteria) this;
        }

        public Criteria andIssupervisionNotIn(List<Integer> values) {
            addCriterion("IsSupervision not in", values, "issupervision");
            return (Criteria) this;
        }

        public Criteria andIssupervisionBetween(Integer value1, Integer value2) {
            addCriterion("IsSupervision between", value1, value2, "issupervision");
            return (Criteria) this;
        }

        public Criteria andIssupervisionNotBetween(Integer value1, Integer value2) {
            addCriterion("IsSupervision not between", value1, value2, "issupervision");
            return (Criteria) this;
        }

        public Criteria andCustomernumberIsNull() {
            addCriterion("CustomerNumber is null");
            return (Criteria) this;
        }

        public Criteria andCustomernumberIsNotNull() {
            addCriterion("CustomerNumber is not null");
            return (Criteria) this;
        }

        public Criteria andCustomernumberEqualTo(String value) {
            addCriterion("CustomerNumber =", value, "customernumber");
            return (Criteria) this;
        }

        public Criteria andCustomernumberNotEqualTo(String value) {
            addCriterion("CustomerNumber <>", value, "customernumber");
            return (Criteria) this;
        }

        public Criteria andCustomernumberGreaterThan(String value) {
            addCriterion("CustomerNumber >", value, "customernumber");
            return (Criteria) this;
        }

        public Criteria andCustomernumberGreaterThanOrEqualTo(String value) {
            addCriterion("CustomerNumber >=", value, "customernumber");
            return (Criteria) this;
        }

        public Criteria andCustomernumberLessThan(String value) {
            addCriterion("CustomerNumber <", value, "customernumber");
            return (Criteria) this;
        }

        public Criteria andCustomernumberLessThanOrEqualTo(String value) {
            addCriterion("CustomerNumber <=", value, "customernumber");
            return (Criteria) this;
        }

        public Criteria andCustomernumberLike(String value) {
            addCriterion("CustomerNumber like", value, "customernumber");
            return (Criteria) this;
        }

        public Criteria andCustomernumberNotLike(String value) {
            addCriterion("CustomerNumber not like", value, "customernumber");
            return (Criteria) this;
        }

        public Criteria andCustomernumberIn(List<String> values) {
            addCriterion("CustomerNumber in", values, "customernumber");
            return (Criteria) this;
        }

        public Criteria andCustomernumberNotIn(List<String> values) {
            addCriterion("CustomerNumber not in", values, "customernumber");
            return (Criteria) this;
        }

        public Criteria andCustomernumberBetween(String value1, String value2) {
            addCriterion("CustomerNumber between", value1, value2, "customernumber");
            return (Criteria) this;
        }

        public Criteria andCustomernumberNotBetween(String value1, String value2) {
            addCriterion("CustomerNumber not between", value1, value2, "customernumber");
            return (Criteria) this;
        }

        public Criteria andContactmanIsNull() {
            addCriterion("ContactMan is null");
            return (Criteria) this;
        }

        public Criteria andContactmanIsNotNull() {
            addCriterion("ContactMan is not null");
            return (Criteria) this;
        }

        public Criteria andContactmanEqualTo(String value) {
            addCriterion("ContactMan =", value, "contactman");
            return (Criteria) this;
        }

        public Criteria andContactmanNotEqualTo(String value) {
            addCriterion("ContactMan <>", value, "contactman");
            return (Criteria) this;
        }

        public Criteria andContactmanGreaterThan(String value) {
            addCriterion("ContactMan >", value, "contactman");
            return (Criteria) this;
        }

        public Criteria andContactmanGreaterThanOrEqualTo(String value) {
            addCriterion("ContactMan >=", value, "contactman");
            return (Criteria) this;
        }

        public Criteria andContactmanLessThan(String value) {
            addCriterion("ContactMan <", value, "contactman");
            return (Criteria) this;
        }

        public Criteria andContactmanLessThanOrEqualTo(String value) {
            addCriterion("ContactMan <=", value, "contactman");
            return (Criteria) this;
        }

        public Criteria andContactmanLike(String value) {
            addCriterion("ContactMan like", value, "contactman");
            return (Criteria) this;
        }

        public Criteria andContactmanNotLike(String value) {
            addCriterion("ContactMan not like", value, "contactman");
            return (Criteria) this;
        }

        public Criteria andContactmanIn(List<String> values) {
            addCriterion("ContactMan in", values, "contactman");
            return (Criteria) this;
        }

        public Criteria andContactmanNotIn(List<String> values) {
            addCriterion("ContactMan not in", values, "contactman");
            return (Criteria) this;
        }

        public Criteria andContactmanBetween(String value1, String value2) {
            addCriterion("ContactMan between", value1, value2, "contactman");
            return (Criteria) this;
        }

        public Criteria andContactmanNotBetween(String value1, String value2) {
            addCriterion("ContactMan not between", value1, value2, "contactman");
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

        public Criteria andPlanstatusIsNull() {
            addCriterion("PlanStatus is null");
            return (Criteria) this;
        }

        public Criteria andPlanstatusIsNotNull() {
            addCriterion("PlanStatus is not null");
            return (Criteria) this;
        }

        public Criteria andPlanstatusEqualTo(Integer value) {
            addCriterion("PlanStatus =", value, "planstatus");
            return (Criteria) this;
        }

        public Criteria andPlanstatusNotEqualTo(Integer value) {
            addCriterion("PlanStatus <>", value, "planstatus");
            return (Criteria) this;
        }

        public Criteria andPlanstatusGreaterThan(Integer value) {
            addCriterion("PlanStatus >", value, "planstatus");
            return (Criteria) this;
        }

        public Criteria andPlanstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("PlanStatus >=", value, "planstatus");
            return (Criteria) this;
        }

        public Criteria andPlanstatusLessThan(Integer value) {
            addCriterion("PlanStatus <", value, "planstatus");
            return (Criteria) this;
        }

        public Criteria andPlanstatusLessThanOrEqualTo(Integer value) {
            addCriterion("PlanStatus <=", value, "planstatus");
            return (Criteria) this;
        }

        public Criteria andPlanstatusIn(List<Integer> values) {
            addCriterion("PlanStatus in", values, "planstatus");
            return (Criteria) this;
        }

        public Criteria andPlanstatusNotIn(List<Integer> values) {
            addCriterion("PlanStatus not in", values, "planstatus");
            return (Criteria) this;
        }

        public Criteria andPlanstatusBetween(Integer value1, Integer value2) {
            addCriterion("PlanStatus between", value1, value2, "planstatus");
            return (Criteria) this;
        }

        public Criteria andPlanstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("PlanStatus not between", value1, value2, "planstatus");
            return (Criteria) this;
        }

        public Criteria andExorderquantityIsNull() {
            addCriterion("EXOrderQuantity is null");
            return (Criteria) this;
        }

        public Criteria andExorderquantityIsNotNull() {
            addCriterion("EXOrderQuantity is not null");
            return (Criteria) this;
        }

        public Criteria andExorderquantityEqualTo(Integer value) {
            addCriterion("EXOrderQuantity =", value, "exorderquantity");
            return (Criteria) this;
        }

        public Criteria andExorderquantityNotEqualTo(Integer value) {
            addCriterion("EXOrderQuantity <>", value, "exorderquantity");
            return (Criteria) this;
        }

        public Criteria andExorderquantityGreaterThan(Integer value) {
            addCriterion("EXOrderQuantity >", value, "exorderquantity");
            return (Criteria) this;
        }

        public Criteria andExorderquantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("EXOrderQuantity >=", value, "exorderquantity");
            return (Criteria) this;
        }

        public Criteria andExorderquantityLessThan(Integer value) {
            addCriterion("EXOrderQuantity <", value, "exorderquantity");
            return (Criteria) this;
        }

        public Criteria andExorderquantityLessThanOrEqualTo(Integer value) {
            addCriterion("EXOrderQuantity <=", value, "exorderquantity");
            return (Criteria) this;
        }

        public Criteria andExorderquantityIn(List<Integer> values) {
            addCriterion("EXOrderQuantity in", values, "exorderquantity");
            return (Criteria) this;
        }

        public Criteria andExorderquantityNotIn(List<Integer> values) {
            addCriterion("EXOrderQuantity not in", values, "exorderquantity");
            return (Criteria) this;
        }

        public Criteria andExorderquantityBetween(Integer value1, Integer value2) {
            addCriterion("EXOrderQuantity between", value1, value2, "exorderquantity");
            return (Criteria) this;
        }

        public Criteria andExorderquantityNotBetween(Integer value1, Integer value2) {
            addCriterion("EXOrderQuantity not between", value1, value2, "exorderquantity");
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

        public Criteria andStorehouseIdIsNull() {
            addCriterion("Storehouse_ID is null");
            return (Criteria) this;
        }

        public Criteria andStorehouseIdIsNotNull() {
            addCriterion("Storehouse_ID is not null");
            return (Criteria) this;
        }

        public Criteria andStorehouseIdEqualTo(Integer value) {
            addCriterion("Storehouse_ID =", value, "storehouseId");
            return (Criteria) this;
        }

        public Criteria andStorehouseIdNotEqualTo(Integer value) {
            addCriterion("Storehouse_ID <>", value, "storehouseId");
            return (Criteria) this;
        }

        public Criteria andStorehouseIdGreaterThan(Integer value) {
            addCriterion("Storehouse_ID >", value, "storehouseId");
            return (Criteria) this;
        }

        public Criteria andStorehouseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Storehouse_ID >=", value, "storehouseId");
            return (Criteria) this;
        }

        public Criteria andStorehouseIdLessThan(Integer value) {
            addCriterion("Storehouse_ID <", value, "storehouseId");
            return (Criteria) this;
        }

        public Criteria andStorehouseIdLessThanOrEqualTo(Integer value) {
            addCriterion("Storehouse_ID <=", value, "storehouseId");
            return (Criteria) this;
        }

        public Criteria andStorehouseIdIn(List<Integer> values) {
            addCriterion("Storehouse_ID in", values, "storehouseId");
            return (Criteria) this;
        }

        public Criteria andStorehouseIdNotIn(List<Integer> values) {
            addCriterion("Storehouse_ID not in", values, "storehouseId");
            return (Criteria) this;
        }

        public Criteria andStorehouseIdBetween(Integer value1, Integer value2) {
            addCriterion("Storehouse_ID between", value1, value2, "storehouseId");
            return (Criteria) this;
        }

        public Criteria andStorehouseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Storehouse_ID not between", value1, value2, "storehouseId");
            return (Criteria) this;
        }

        public Criteria andExpressIsNull() {
            addCriterion("Express is null");
            return (Criteria) this;
        }

        public Criteria andExpressIsNotNull() {
            addCriterion("Express is not null");
            return (Criteria) this;
        }

        public Criteria andExpressEqualTo(String value) {
            addCriterion("Express =", value, "express");
            return (Criteria) this;
        }

        public Criteria andExpressNotEqualTo(String value) {
            addCriterion("Express <>", value, "express");
            return (Criteria) this;
        }

        public Criteria andExpressGreaterThan(String value) {
            addCriterion("Express >", value, "express");
            return (Criteria) this;
        }

        public Criteria andExpressGreaterThanOrEqualTo(String value) {
            addCriterion("Express >=", value, "express");
            return (Criteria) this;
        }

        public Criteria andExpressLessThan(String value) {
            addCriterion("Express <", value, "express");
            return (Criteria) this;
        }

        public Criteria andExpressLessThanOrEqualTo(String value) {
            addCriterion("Express <=", value, "express");
            return (Criteria) this;
        }

        public Criteria andExpressLike(String value) {
            addCriterion("Express like", value, "express");
            return (Criteria) this;
        }

        public Criteria andExpressNotLike(String value) {
            addCriterion("Express not like", value, "express");
            return (Criteria) this;
        }

        public Criteria andExpressIn(List<String> values) {
            addCriterion("Express in", values, "express");
            return (Criteria) this;
        }

        public Criteria andExpressNotIn(List<String> values) {
            addCriterion("Express not in", values, "express");
            return (Criteria) this;
        }

        public Criteria andExpressBetween(String value1, String value2) {
            addCriterion("Express between", value1, value2, "express");
            return (Criteria) this;
        }

        public Criteria andExpressNotBetween(String value1, String value2) {
            addCriterion("Express not between", value1, value2, "express");
            return (Criteria) this;
        }

        public Criteria andShippingmethodIsNull() {
            addCriterion("ShippingMethod is null");
            return (Criteria) this;
        }

        public Criteria andShippingmethodIsNotNull() {
            addCriterion("ShippingMethod is not null");
            return (Criteria) this;
        }

        public Criteria andShippingmethodEqualTo(String value) {
            addCriterion("ShippingMethod =", value, "shippingmethod");
            return (Criteria) this;
        }

        public Criteria andShippingmethodNotEqualTo(String value) {
            addCriterion("ShippingMethod <>", value, "shippingmethod");
            return (Criteria) this;
        }

        public Criteria andShippingmethodGreaterThan(String value) {
            addCriterion("ShippingMethod >", value, "shippingmethod");
            return (Criteria) this;
        }

        public Criteria andShippingmethodGreaterThanOrEqualTo(String value) {
            addCriterion("ShippingMethod >=", value, "shippingmethod");
            return (Criteria) this;
        }

        public Criteria andShippingmethodLessThan(String value) {
            addCriterion("ShippingMethod <", value, "shippingmethod");
            return (Criteria) this;
        }

        public Criteria andShippingmethodLessThanOrEqualTo(String value) {
            addCriterion("ShippingMethod <=", value, "shippingmethod");
            return (Criteria) this;
        }

        public Criteria andShippingmethodLike(String value) {
            addCriterion("ShippingMethod like", value, "shippingmethod");
            return (Criteria) this;
        }

        public Criteria andShippingmethodNotLike(String value) {
            addCriterion("ShippingMethod not like", value, "shippingmethod");
            return (Criteria) this;
        }

        public Criteria andShippingmethodIn(List<String> values) {
            addCriterion("ShippingMethod in", values, "shippingmethod");
            return (Criteria) this;
        }

        public Criteria andShippingmethodNotIn(List<String> values) {
            addCriterion("ShippingMethod not in", values, "shippingmethod");
            return (Criteria) this;
        }

        public Criteria andShippingmethodBetween(String value1, String value2) {
            addCriterion("ShippingMethod between", value1, value2, "shippingmethod");
            return (Criteria) this;
        }

        public Criteria andShippingmethodNotBetween(String value1, String value2) {
            addCriterion("ShippingMethod not between", value1, value2, "shippingmethod");
            return (Criteria) this;
        }

        public Criteria andClearingformIsNull() {
            addCriterion("ClearingForm is null");
            return (Criteria) this;
        }

        public Criteria andClearingformIsNotNull() {
            addCriterion("ClearingForm is not null");
            return (Criteria) this;
        }

        public Criteria andClearingformEqualTo(String value) {
            addCriterion("ClearingForm =", value, "clearingform");
            return (Criteria) this;
        }

        public Criteria andClearingformNotEqualTo(String value) {
            addCriterion("ClearingForm <>", value, "clearingform");
            return (Criteria) this;
        }

        public Criteria andClearingformGreaterThan(String value) {
            addCriterion("ClearingForm >", value, "clearingform");
            return (Criteria) this;
        }

        public Criteria andClearingformGreaterThanOrEqualTo(String value) {
            addCriterion("ClearingForm >=", value, "clearingform");
            return (Criteria) this;
        }

        public Criteria andClearingformLessThan(String value) {
            addCriterion("ClearingForm <", value, "clearingform");
            return (Criteria) this;
        }

        public Criteria andClearingformLessThanOrEqualTo(String value) {
            addCriterion("ClearingForm <=", value, "clearingform");
            return (Criteria) this;
        }

        public Criteria andClearingformLike(String value) {
            addCriterion("ClearingForm like", value, "clearingform");
            return (Criteria) this;
        }

        public Criteria andClearingformNotLike(String value) {
            addCriterion("ClearingForm not like", value, "clearingform");
            return (Criteria) this;
        }

        public Criteria andClearingformIn(List<String> values) {
            addCriterion("ClearingForm in", values, "clearingform");
            return (Criteria) this;
        }

        public Criteria andClearingformNotIn(List<String> values) {
            addCriterion("ClearingForm not in", values, "clearingform");
            return (Criteria) this;
        }

        public Criteria andClearingformBetween(String value1, String value2) {
            addCriterion("ClearingForm between", value1, value2, "clearingform");
            return (Criteria) this;
        }

        public Criteria andClearingformNotBetween(String value1, String value2) {
            addCriterion("ClearingForm not between", value1, value2, "clearingform");
            return (Criteria) this;
        }

        public Criteria andExpressnumberIsNull() {
            addCriterion("ExpressNumber is null");
            return (Criteria) this;
        }

        public Criteria andExpressnumberIsNotNull() {
            addCriterion("ExpressNumber is not null");
            return (Criteria) this;
        }

        public Criteria andExpressnumberEqualTo(String value) {
            addCriterion("ExpressNumber =", value, "expressnumber");
            return (Criteria) this;
        }

        public Criteria andExpressnumberNotEqualTo(String value) {
            addCriterion("ExpressNumber <>", value, "expressnumber");
            return (Criteria) this;
        }

        public Criteria andExpressnumberGreaterThan(String value) {
            addCriterion("ExpressNumber >", value, "expressnumber");
            return (Criteria) this;
        }

        public Criteria andExpressnumberGreaterThanOrEqualTo(String value) {
            addCriterion("ExpressNumber >=", value, "expressnumber");
            return (Criteria) this;
        }

        public Criteria andExpressnumberLessThan(String value) {
            addCriterion("ExpressNumber <", value, "expressnumber");
            return (Criteria) this;
        }

        public Criteria andExpressnumberLessThanOrEqualTo(String value) {
            addCriterion("ExpressNumber <=", value, "expressnumber");
            return (Criteria) this;
        }

        public Criteria andExpressnumberLike(String value) {
            addCriterion("ExpressNumber like", value, "expressnumber");
            return (Criteria) this;
        }

        public Criteria andExpressnumberNotLike(String value) {
            addCriterion("ExpressNumber not like", value, "expressnumber");
            return (Criteria) this;
        }

        public Criteria andExpressnumberIn(List<String> values) {
            addCriterion("ExpressNumber in", values, "expressnumber");
            return (Criteria) this;
        }

        public Criteria andExpressnumberNotIn(List<String> values) {
            addCriterion("ExpressNumber not in", values, "expressnumber");
            return (Criteria) this;
        }

        public Criteria andExpressnumberBetween(String value1, String value2) {
            addCriterion("ExpressNumber between", value1, value2, "expressnumber");
            return (Criteria) this;
        }

        public Criteria andExpressnumberNotBetween(String value1, String value2) {
            addCriterion("ExpressNumber not between", value1, value2, "expressnumber");
            return (Criteria) this;
        }

        public Criteria andServiceIdIsNull() {
            addCriterion("Service_ID is null");
            return (Criteria) this;
        }

        public Criteria andServiceIdIsNotNull() {
            addCriterion("Service_ID is not null");
            return (Criteria) this;
        }

        public Criteria andServiceIdEqualTo(Integer value) {
            addCriterion("Service_ID =", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdNotEqualTo(Integer value) {
            addCriterion("Service_ID <>", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdGreaterThan(Integer value) {
            addCriterion("Service_ID >", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Service_ID >=", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdLessThan(Integer value) {
            addCriterion("Service_ID <", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdLessThanOrEqualTo(Integer value) {
            addCriterion("Service_ID <=", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdIn(List<Integer> values) {
            addCriterion("Service_ID in", values, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdNotIn(List<Integer> values) {
            addCriterion("Service_ID not in", values, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdBetween(Integer value1, Integer value2) {
            addCriterion("Service_ID between", value1, value2, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Service_ID not between", value1, value2, "serviceId");
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
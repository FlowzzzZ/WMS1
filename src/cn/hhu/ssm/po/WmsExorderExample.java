package cn.hhu.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WmsExorderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;
    
    protected Integer limit;
    protected Integer offset;
    
    
    public Integer getLimit() {
		return limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
	}

	public Integer getOffset() {
		return offset;
	}

	public void setOffset(Integer offset) {
		this.offset = offset;
	}

	public WmsExorderExample() {
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

        public Criteria andExorderIdIsNull() {
            addCriterion("EXOrder_ID is null");
            return (Criteria) this;
        }

        public Criteria andExorderIdIsNotNull() {
            addCriterion("EXOrder_ID is not null");
            return (Criteria) this;
        }

        public Criteria andExorderIdEqualTo(Integer value) {
            addCriterion("EXOrder_ID =", value, "exorderId");
            return (Criteria) this;
        }

        public Criteria andExorderIdNotEqualTo(Integer value) {
            addCriterion("EXOrder_ID <>", value, "exorderId");
            return (Criteria) this;
        }

        public Criteria andExorderIdGreaterThan(Integer value) {
            addCriterion("EXOrder_ID >", value, "exorderId");
            return (Criteria) this;
        }

        public Criteria andExorderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("EXOrder_ID >=", value, "exorderId");
            return (Criteria) this;
        }

        public Criteria andExorderIdLessThan(Integer value) {
            addCriterion("EXOrder_ID <", value, "exorderId");
            return (Criteria) this;
        }

        public Criteria andExorderIdLessThanOrEqualTo(Integer value) {
            addCriterion("EXOrder_ID <=", value, "exorderId");
            return (Criteria) this;
        }

        public Criteria andExorderIdIn(List<Integer> values) {
            addCriterion("EXOrder_ID in", values, "exorderId");
            return (Criteria) this;
        }

        public Criteria andExorderIdNotIn(List<Integer> values) {
            addCriterion("EXOrder_ID not in", values, "exorderId");
            return (Criteria) this;
        }

        public Criteria andExorderIdBetween(Integer value1, Integer value2) {
            addCriterion("EXOrder_ID between", value1, value2, "exorderId");
            return (Criteria) this;
        }

        public Criteria andExorderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("EXOrder_ID not between", value1, value2, "exorderId");
            return (Criteria) this;
        }

        public Criteria andExorderNumberIsNull() {
            addCriterion("EXOrder_Number is null");
            return (Criteria) this;
        }

        public Criteria andExorderNumberIsNotNull() {
            addCriterion("EXOrder_Number is not null");
            return (Criteria) this;
        }

        public Criteria andExorderNumberEqualTo(String value) {
            addCriterion("EXOrder_Number =", value, "exorderNumber");
            return (Criteria) this;
        }

        public Criteria andExorderNumberNotEqualTo(String value) {
            addCriterion("EXOrder_Number <>", value, "exorderNumber");
            return (Criteria) this;
        }

        public Criteria andExorderNumberGreaterThan(String value) {
            addCriterion("EXOrder_Number >", value, "exorderNumber");
            return (Criteria) this;
        }

        public Criteria andExorderNumberGreaterThanOrEqualTo(String value) {
            addCriterion("EXOrder_Number >=", value, "exorderNumber");
            return (Criteria) this;
        }

        public Criteria andExorderNumberLessThan(String value) {
            addCriterion("EXOrder_Number <", value, "exorderNumber");
            return (Criteria) this;
        }

        public Criteria andExorderNumberLessThanOrEqualTo(String value) {
            addCriterion("EXOrder_Number <=", value, "exorderNumber");
            return (Criteria) this;
        }

        public Criteria andExorderNumberLike(String value) {
            addCriterion("EXOrder_Number like", value, "exorderNumber");
            return (Criteria) this;
        }

        public Criteria andExorderNumberNotLike(String value) {
            addCriterion("EXOrder_Number not like", value, "exorderNumber");
            return (Criteria) this;
        }

        public Criteria andExorderNumberIn(List<String> values) {
            addCriterion("EXOrder_Number in", values, "exorderNumber");
            return (Criteria) this;
        }

        public Criteria andExorderNumberNotIn(List<String> values) {
            addCriterion("EXOrder_Number not in", values, "exorderNumber");
            return (Criteria) this;
        }

        public Criteria andExorderNumberBetween(String value1, String value2) {
            addCriterion("EXOrder_Number between", value1, value2, "exorderNumber");
            return (Criteria) this;
        }

        public Criteria andExorderNumberNotBetween(String value1, String value2) {
            addCriterion("EXOrder_Number not between", value1, value2, "exorderNumber");
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

        public Criteria andPlanIdIsNull() {
            addCriterion("Plan_ID is null");
            return (Criteria) this;
        }

        public Criteria andPlanIdIsNotNull() {
            addCriterion("Plan_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPlanIdEqualTo(Integer value) {
            addCriterion("Plan_ID =", value, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdNotEqualTo(Integer value) {
            addCriterion("Plan_ID <>", value, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdGreaterThan(Integer value) {
            addCriterion("Plan_ID >", value, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Plan_ID >=", value, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdLessThan(Integer value) {
            addCriterion("Plan_ID <", value, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdLessThanOrEqualTo(Integer value) {
            addCriterion("Plan_ID <=", value, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdIn(List<Integer> values) {
            addCriterion("Plan_ID in", values, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdNotIn(List<Integer> values) {
            addCriterion("Plan_ID not in", values, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdBetween(Integer value1, Integer value2) {
            addCriterion("Plan_ID between", value1, value2, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Plan_ID not between", value1, value2, "planId");
            return (Criteria) this;
        }

        public Criteria andInfosourceIsNull() {
            addCriterion("InfoSource is null");
            return (Criteria) this;
        }

        public Criteria andInfosourceIsNotNull() {
            addCriterion("InfoSource is not null");
            return (Criteria) this;
        }

        public Criteria andInfosourceEqualTo(Integer value) {
            addCriterion("InfoSource =", value, "infosource");
            return (Criteria) this;
        }

        public Criteria andInfosourceNotEqualTo(Integer value) {
            addCriterion("InfoSource <>", value, "infosource");
            return (Criteria) this;
        }

        public Criteria andInfosourceGreaterThan(Integer value) {
            addCriterion("InfoSource >", value, "infosource");
            return (Criteria) this;
        }

        public Criteria andInfosourceGreaterThanOrEqualTo(Integer value) {
            addCriterion("InfoSource >=", value, "infosource");
            return (Criteria) this;
        }

        public Criteria andInfosourceLessThan(Integer value) {
            addCriterion("InfoSource <", value, "infosource");
            return (Criteria) this;
        }

        public Criteria andInfosourceLessThanOrEqualTo(Integer value) {
            addCriterion("InfoSource <=", value, "infosource");
            return (Criteria) this;
        }

        public Criteria andInfosourceIn(List<Integer> values) {
            addCriterion("InfoSource in", values, "infosource");
            return (Criteria) this;
        }

        public Criteria andInfosourceNotIn(List<Integer> values) {
            addCriterion("InfoSource not in", values, "infosource");
            return (Criteria) this;
        }

        public Criteria andInfosourceBetween(Integer value1, Integer value2) {
            addCriterion("InfoSource between", value1, value2, "infosource");
            return (Criteria) this;
        }

        public Criteria andInfosourceNotBetween(Integer value1, Integer value2) {
            addCriterion("InfoSource not between", value1, value2, "infosource");
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

        public Criteria andIscheckedIsNull() {
            addCriterion("IsChecked is null");
            return (Criteria) this;
        }

        public Criteria andIscheckedIsNotNull() {
            addCriterion("IsChecked is not null");
            return (Criteria) this;
        }

        public Criteria andIscheckedEqualTo(Integer value) {
            addCriterion("IsChecked =", value, "ischecked");
            return (Criteria) this;
        }

        public Criteria andIscheckedNotEqualTo(Integer value) {
            addCriterion("IsChecked <>", value, "ischecked");
            return (Criteria) this;
        }

        public Criteria andIscheckedGreaterThan(Integer value) {
            addCriterion("IsChecked >", value, "ischecked");
            return (Criteria) this;
        }

        public Criteria andIscheckedGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsChecked >=", value, "ischecked");
            return (Criteria) this;
        }

        public Criteria andIscheckedLessThan(Integer value) {
            addCriterion("IsChecked <", value, "ischecked");
            return (Criteria) this;
        }

        public Criteria andIscheckedLessThanOrEqualTo(Integer value) {
            addCriterion("IsChecked <=", value, "ischecked");
            return (Criteria) this;
        }

        public Criteria andIscheckedIn(List<Integer> values) {
            addCriterion("IsChecked in", values, "ischecked");
            return (Criteria) this;
        }

        public Criteria andIscheckedNotIn(List<Integer> values) {
            addCriterion("IsChecked not in", values, "ischecked");
            return (Criteria) this;
        }

        public Criteria andIscheckedBetween(Integer value1, Integer value2) {
            addCriterion("IsChecked between", value1, value2, "ischecked");
            return (Criteria) this;
        }

        public Criteria andIscheckedNotBetween(Integer value1, Integer value2) {
            addCriterion("IsChecked not between", value1, value2, "ischecked");
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

        public Criteria andExstatusIsNull() {
            addCriterion("EXStatus is null");
            return (Criteria) this;
        }

        public Criteria andExstatusIsNotNull() {
            addCriterion("EXStatus is not null");
            return (Criteria) this;
        }

        public Criteria andExstatusEqualTo(Integer value) {
            addCriterion("EXStatus =", value, "exstatus");
            return (Criteria) this;
        }

        public Criteria andExstatusNotEqualTo(Integer value) {
            addCriterion("EXStatus <>", value, "exstatus");
            return (Criteria) this;
        }

        public Criteria andExstatusGreaterThan(Integer value) {
            addCriterion("EXStatus >", value, "exstatus");
            return (Criteria) this;
        }

        public Criteria andExstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("EXStatus >=", value, "exstatus");
            return (Criteria) this;
        }

        public Criteria andExstatusLessThan(Integer value) {
            addCriterion("EXStatus <", value, "exstatus");
            return (Criteria) this;
        }

        public Criteria andExstatusLessThanOrEqualTo(Integer value) {
            addCriterion("EXStatus <=", value, "exstatus");
            return (Criteria) this;
        }

        public Criteria andExstatusIn(List<Integer> values) {
            addCriterion("EXStatus in", values, "exstatus");
            return (Criteria) this;
        }

        public Criteria andExstatusNotIn(List<Integer> values) {
            addCriterion("EXStatus not in", values, "exstatus");
            return (Criteria) this;
        }

        public Criteria andExstatusBetween(Integer value1, Integer value2) {
            addCriterion("EXStatus between", value1, value2, "exstatus");
            return (Criteria) this;
        }

        public Criteria andExstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("EXStatus not between", value1, value2, "exstatus");
            return (Criteria) this;
        }

        public Criteria andExbarcodeIsNull() {
            addCriterion("EXBarCode is null");
            return (Criteria) this;
        }

        public Criteria andExbarcodeIsNotNull() {
            addCriterion("EXBarCode is not null");
            return (Criteria) this;
        }

        public Criteria andExbarcodeEqualTo(String value) {
            addCriterion("EXBarCode =", value, "exbarcode");
            return (Criteria) this;
        }

        public Criteria andExbarcodeNotEqualTo(String value) {
            addCriterion("EXBarCode <>", value, "exbarcode");
            return (Criteria) this;
        }

        public Criteria andExbarcodeGreaterThan(String value) {
            addCriterion("EXBarCode >", value, "exbarcode");
            return (Criteria) this;
        }

        public Criteria andExbarcodeGreaterThanOrEqualTo(String value) {
            addCriterion("EXBarCode >=", value, "exbarcode");
            return (Criteria) this;
        }

        public Criteria andExbarcodeLessThan(String value) {
            addCriterion("EXBarCode <", value, "exbarcode");
            return (Criteria) this;
        }

        public Criteria andExbarcodeLessThanOrEqualTo(String value) {
            addCriterion("EXBarCode <=", value, "exbarcode");
            return (Criteria) this;
        }

        public Criteria andExbarcodeLike(String value) {
            addCriterion("EXBarCode like", value, "exbarcode");
            return (Criteria) this;
        }

        public Criteria andExbarcodeNotLike(String value) {
            addCriterion("EXBarCode not like", value, "exbarcode");
            return (Criteria) this;
        }

        public Criteria andExbarcodeIn(List<String> values) {
            addCriterion("EXBarCode in", values, "exbarcode");
            return (Criteria) this;
        }

        public Criteria andExbarcodeNotIn(List<String> values) {
            addCriterion("EXBarCode not in", values, "exbarcode");
            return (Criteria) this;
        }

        public Criteria andExbarcodeBetween(String value1, String value2) {
            addCriterion("EXBarCode between", value1, value2, "exbarcode");
            return (Criteria) this;
        }

        public Criteria andExbarcodeNotBetween(String value1, String value2) {
            addCriterion("EXBarCode not between", value1, value2, "exbarcode");
            return (Criteria) this;
        }

        public Criteria andPlacementareaIsNull() {
            addCriterion("PlacementArea is null");
            return (Criteria) this;
        }

        public Criteria andPlacementareaIsNotNull() {
            addCriterion("PlacementArea is not null");
            return (Criteria) this;
        }

        public Criteria andPlacementareaEqualTo(String value) {
            addCriterion("PlacementArea =", value, "placementarea");
            return (Criteria) this;
        }

        public Criteria andPlacementareaNotEqualTo(String value) {
            addCriterion("PlacementArea <>", value, "placementarea");
            return (Criteria) this;
        }

        public Criteria andPlacementareaGreaterThan(String value) {
            addCriterion("PlacementArea >", value, "placementarea");
            return (Criteria) this;
        }

        public Criteria andPlacementareaGreaterThanOrEqualTo(String value) {
            addCriterion("PlacementArea >=", value, "placementarea");
            return (Criteria) this;
        }

        public Criteria andPlacementareaLessThan(String value) {
            addCriterion("PlacementArea <", value, "placementarea");
            return (Criteria) this;
        }

        public Criteria andPlacementareaLessThanOrEqualTo(String value) {
            addCriterion("PlacementArea <=", value, "placementarea");
            return (Criteria) this;
        }

        public Criteria andPlacementareaLike(String value) {
            addCriterion("PlacementArea like", value, "placementarea");
            return (Criteria) this;
        }

        public Criteria andPlacementareaNotLike(String value) {
            addCriterion("PlacementArea not like", value, "placementarea");
            return (Criteria) this;
        }

        public Criteria andPlacementareaIn(List<String> values) {
            addCriterion("PlacementArea in", values, "placementarea");
            return (Criteria) this;
        }

        public Criteria andPlacementareaNotIn(List<String> values) {
            addCriterion("PlacementArea not in", values, "placementarea");
            return (Criteria) this;
        }

        public Criteria andPlacementareaBetween(String value1, String value2) {
            addCriterion("PlacementArea between", value1, value2, "placementarea");
            return (Criteria) this;
        }

        public Criteria andPlacementareaNotBetween(String value1, String value2) {
            addCriterion("PlacementArea not between", value1, value2, "placementarea");
            return (Criteria) this;
        }

        public Criteria andPickmanIsNull() {
            addCriterion("PickMan is null");
            return (Criteria) this;
        }

        public Criteria andPickmanIsNotNull() {
            addCriterion("PickMan is not null");
            return (Criteria) this;
        }

        public Criteria andPickmanEqualTo(Integer value) {
            addCriterion("PickMan =", value, "pickman");
            return (Criteria) this;
        }

        public Criteria andPickmanNotEqualTo(Integer value) {
            addCriterion("PickMan <>", value, "pickman");
            return (Criteria) this;
        }

        public Criteria andPickmanGreaterThan(Integer value) {
            addCriterion("PickMan >", value, "pickman");
            return (Criteria) this;
        }

        public Criteria andPickmanGreaterThanOrEqualTo(Integer value) {
            addCriterion("PickMan >=", value, "pickman");
            return (Criteria) this;
        }

        public Criteria andPickmanLessThan(Integer value) {
            addCriterion("PickMan <", value, "pickman");
            return (Criteria) this;
        }

        public Criteria andPickmanLessThanOrEqualTo(Integer value) {
            addCriterion("PickMan <=", value, "pickman");
            return (Criteria) this;
        }

        public Criteria andPickmanIn(List<Integer> values) {
            addCriterion("PickMan in", values, "pickman");
            return (Criteria) this;
        }

        public Criteria andPickmanNotIn(List<Integer> values) {
            addCriterion("PickMan not in", values, "pickman");
            return (Criteria) this;
        }

        public Criteria andPickmanBetween(Integer value1, Integer value2) {
            addCriterion("PickMan between", value1, value2, "pickman");
            return (Criteria) this;
        }

        public Criteria andPickmanNotBetween(Integer value1, Integer value2) {
            addCriterion("PickMan not between", value1, value2, "pickman");
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

        public Criteria andExpresscompanyIsNull() {
            addCriterion("ExpressCompany is null");
            return (Criteria) this;
        }

        public Criteria andExpresscompanyIsNotNull() {
            addCriterion("ExpressCompany is not null");
            return (Criteria) this;
        }

        public Criteria andExpresscompanyEqualTo(String value) {
            addCriterion("ExpressCompany =", value, "expresscompany");
            return (Criteria) this;
        }

        public Criteria andExpresscompanyNotEqualTo(String value) {
            addCriterion("ExpressCompany <>", value, "expresscompany");
            return (Criteria) this;
        }

        public Criteria andExpresscompanyGreaterThan(String value) {
            addCriterion("ExpressCompany >", value, "expresscompany");
            return (Criteria) this;
        }

        public Criteria andExpresscompanyGreaterThanOrEqualTo(String value) {
            addCriterion("ExpressCompany >=", value, "expresscompany");
            return (Criteria) this;
        }

        public Criteria andExpresscompanyLessThan(String value) {
            addCriterion("ExpressCompany <", value, "expresscompany");
            return (Criteria) this;
        }

        public Criteria andExpresscompanyLessThanOrEqualTo(String value) {
            addCriterion("ExpressCompany <=", value, "expresscompany");
            return (Criteria) this;
        }

        public Criteria andExpresscompanyLike(String value) {
            addCriterion("ExpressCompany like", value, "expresscompany");
            return (Criteria) this;
        }

        public Criteria andExpresscompanyNotLike(String value) {
            addCriterion("ExpressCompany not like", value, "expresscompany");
            return (Criteria) this;
        }

        public Criteria andExpresscompanyIn(List<String> values) {
            addCriterion("ExpressCompany in", values, "expresscompany");
            return (Criteria) this;
        }

        public Criteria andExpresscompanyNotIn(List<String> values) {
            addCriterion("ExpressCompany not in", values, "expresscompany");
            return (Criteria) this;
        }

        public Criteria andExpresscompanyBetween(String value1, String value2) {
            addCriterion("ExpressCompany between", value1, value2, "expresscompany");
            return (Criteria) this;
        }

        public Criteria andExpresscompanyNotBetween(String value1, String value2) {
            addCriterion("ExpressCompany not between", value1, value2, "expresscompany");
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
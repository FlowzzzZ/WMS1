package cn.hhu.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WmsImorderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WmsImorderExample() {
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

        public Criteria andImorderIdIsNull() {
            addCriterion("IMOrder_ID is null");
            return (Criteria) this;
        }

        public Criteria andImorderIdIsNotNull() {
            addCriterion("IMOrder_ID is not null");
            return (Criteria) this;
        }

        public Criteria andImorderIdEqualTo(Integer value) {
            addCriterion("IMOrder_ID =", value, "imorderId");
            return (Criteria) this;
        }

        public Criteria andImorderIdNotEqualTo(Integer value) {
            addCriterion("IMOrder_ID <>", value, "imorderId");
            return (Criteria) this;
        }

        public Criteria andImorderIdGreaterThan(Integer value) {
            addCriterion("IMOrder_ID >", value, "imorderId");
            return (Criteria) this;
        }

        public Criteria andImorderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("IMOrder_ID >=", value, "imorderId");
            return (Criteria) this;
        }

        public Criteria andImorderIdLessThan(Integer value) {
            addCriterion("IMOrder_ID <", value, "imorderId");
            return (Criteria) this;
        }

        public Criteria andImorderIdLessThanOrEqualTo(Integer value) {
            addCriterion("IMOrder_ID <=", value, "imorderId");
            return (Criteria) this;
        }

        public Criteria andImorderIdIn(List<Integer> values) {
            addCriterion("IMOrder_ID in", values, "imorderId");
            return (Criteria) this;
        }

        public Criteria andImorderIdNotIn(List<Integer> values) {
            addCriterion("IMOrder_ID not in", values, "imorderId");
            return (Criteria) this;
        }

        public Criteria andImorderIdBetween(Integer value1, Integer value2) {
            addCriterion("IMOrder_ID between", value1, value2, "imorderId");
            return (Criteria) this;
        }

        public Criteria andImorderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("IMOrder_ID not between", value1, value2, "imorderId");
            return (Criteria) this;
        }

        public Criteria andImorderNumberIsNull() {
            addCriterion("IMOrder_Number is null");
            return (Criteria) this;
        }

        public Criteria andImorderNumberIsNotNull() {
            addCriterion("IMOrder_Number is not null");
            return (Criteria) this;
        }

        public Criteria andImorderNumberEqualTo(String value) {
            addCriterion("IMOrder_Number =", value, "imorderNumber");
            return (Criteria) this;
        }

        public Criteria andImorderNumberNotEqualTo(String value) {
            addCriterion("IMOrder_Number <>", value, "imorderNumber");
            return (Criteria) this;
        }

        public Criteria andImorderNumberGreaterThan(String value) {
            addCriterion("IMOrder_Number >", value, "imorderNumber");
            return (Criteria) this;
        }

        public Criteria andImorderNumberGreaterThanOrEqualTo(String value) {
            addCriterion("IMOrder_Number >=", value, "imorderNumber");
            return (Criteria) this;
        }

        public Criteria andImorderNumberLessThan(String value) {
            addCriterion("IMOrder_Number <", value, "imorderNumber");
            return (Criteria) this;
        }

        public Criteria andImorderNumberLessThanOrEqualTo(String value) {
            addCriterion("IMOrder_Number <=", value, "imorderNumber");
            return (Criteria) this;
        }

        public Criteria andImorderNumberLike(String value) {
            addCriterion("IMOrder_Number like", value, "imorderNumber");
            return (Criteria) this;
        }

        public Criteria andImorderNumberNotLike(String value) {
            addCriterion("IMOrder_Number not like", value, "imorderNumber");
            return (Criteria) this;
        }

        public Criteria andImorderNumberIn(List<String> values) {
            addCriterion("IMOrder_Number in", values, "imorderNumber");
            return (Criteria) this;
        }

        public Criteria andImorderNumberNotIn(List<String> values) {
            addCriterion("IMOrder_Number not in", values, "imorderNumber");
            return (Criteria) this;
        }

        public Criteria andImorderNumberBetween(String value1, String value2) {
            addCriterion("IMOrder_Number between", value1, value2, "imorderNumber");
            return (Criteria) this;
        }

        public Criteria andImorderNumberNotBetween(String value1, String value2) {
            addCriterion("IMOrder_Number not between", value1, value2, "imorderNumber");
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

        public Criteria andImplanIdIsNull() {
            addCriterion("IMPlan_ID is null");
            return (Criteria) this;
        }

        public Criteria andImplanIdIsNotNull() {
            addCriterion("IMPlan_ID is not null");
            return (Criteria) this;
        }

        public Criteria andImplanIdEqualTo(String value) {
            addCriterion("IMPlan_ID =", value, "implanId");
            return (Criteria) this;
        }

        public Criteria andImplanIdNotEqualTo(String value) {
            addCriterion("IMPlan_ID <>", value, "implanId");
            return (Criteria) this;
        }

        public Criteria andImplanIdGreaterThan(String value) {
            addCriterion("IMPlan_ID >", value, "implanId");
            return (Criteria) this;
        }

        public Criteria andImplanIdGreaterThanOrEqualTo(String value) {
            addCriterion("IMPlan_ID >=", value, "implanId");
            return (Criteria) this;
        }

        public Criteria andImplanIdLessThan(String value) {
            addCriterion("IMPlan_ID <", value, "implanId");
            return (Criteria) this;
        }

        public Criteria andImplanIdLessThanOrEqualTo(String value) {
            addCriterion("IMPlan_ID <=", value, "implanId");
            return (Criteria) this;
        }

        public Criteria andImplanIdLike(String value) {
            addCriterion("IMPlan_ID like", value, "implanId");
            return (Criteria) this;
        }

        public Criteria andImplanIdNotLike(String value) {
            addCriterion("IMPlan_ID not like", value, "implanId");
            return (Criteria) this;
        }

        public Criteria andImplanIdIn(List<String> values) {
            addCriterion("IMPlan_ID in", values, "implanId");
            return (Criteria) this;
        }

        public Criteria andImplanIdNotIn(List<String> values) {
            addCriterion("IMPlan_ID not in", values, "implanId");
            return (Criteria) this;
        }

        public Criteria andImplanIdBetween(String value1, String value2) {
            addCriterion("IMPlan_ID between", value1, value2, "implanId");
            return (Criteria) this;
        }

        public Criteria andImplanIdNotBetween(String value1, String value2) {
            addCriterion("IMPlan_ID not between", value1, value2, "implanId");
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

        public Criteria andImdateIsNull() {
            addCriterion("IMDate is null");
            return (Criteria) this;
        }

        public Criteria andImdateIsNotNull() {
            addCriterion("IMDate is not null");
            return (Criteria) this;
        }

        public Criteria andImdateEqualTo(Date value) {
            addCriterion("IMDate =", value, "imdate");
            return (Criteria) this;
        }

        public Criteria andImdateNotEqualTo(Date value) {
            addCriterion("IMDate <>", value, "imdate");
            return (Criteria) this;
        }

        public Criteria andImdateGreaterThan(Date value) {
            addCriterion("IMDate >", value, "imdate");
            return (Criteria) this;
        }

        public Criteria andImdateGreaterThanOrEqualTo(Date value) {
            addCriterion("IMDate >=", value, "imdate");
            return (Criteria) this;
        }

        public Criteria andImdateLessThan(Date value) {
            addCriterion("IMDate <", value, "imdate");
            return (Criteria) this;
        }

        public Criteria andImdateLessThanOrEqualTo(Date value) {
            addCriterion("IMDate <=", value, "imdate");
            return (Criteria) this;
        }

        public Criteria andImdateIn(List<Date> values) {
            addCriterion("IMDate in", values, "imdate");
            return (Criteria) this;
        }

        public Criteria andImdateNotIn(List<Date> values) {
            addCriterion("IMDate not in", values, "imdate");
            return (Criteria) this;
        }

        public Criteria andImdateBetween(Date value1, Date value2) {
            addCriterion("IMDate between", value1, value2, "imdate");
            return (Criteria) this;
        }

        public Criteria andImdateNotBetween(Date value1, Date value2) {
            addCriterion("IMDate not between", value1, value2, "imdate");
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

        public Criteria andIsacceptanceIsNull() {
            addCriterion("IsAcceptance is null");
            return (Criteria) this;
        }

        public Criteria andIsacceptanceIsNotNull() {
            addCriterion("IsAcceptance is not null");
            return (Criteria) this;
        }

        public Criteria andIsacceptanceEqualTo(Integer value) {
            addCriterion("IsAcceptance =", value, "isacceptance");
            return (Criteria) this;
        }

        public Criteria andIsacceptanceNotEqualTo(Integer value) {
            addCriterion("IsAcceptance <>", value, "isacceptance");
            return (Criteria) this;
        }

        public Criteria andIsacceptanceGreaterThan(Integer value) {
            addCriterion("IsAcceptance >", value, "isacceptance");
            return (Criteria) this;
        }

        public Criteria andIsacceptanceGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsAcceptance >=", value, "isacceptance");
            return (Criteria) this;
        }

        public Criteria andIsacceptanceLessThan(Integer value) {
            addCriterion("IsAcceptance <", value, "isacceptance");
            return (Criteria) this;
        }

        public Criteria andIsacceptanceLessThanOrEqualTo(Integer value) {
            addCriterion("IsAcceptance <=", value, "isacceptance");
            return (Criteria) this;
        }

        public Criteria andIsacceptanceIn(List<Integer> values) {
            addCriterion("IsAcceptance in", values, "isacceptance");
            return (Criteria) this;
        }

        public Criteria andIsacceptanceNotIn(List<Integer> values) {
            addCriterion("IsAcceptance not in", values, "isacceptance");
            return (Criteria) this;
        }

        public Criteria andIsacceptanceBetween(Integer value1, Integer value2) {
            addCriterion("IsAcceptance between", value1, value2, "isacceptance");
            return (Criteria) this;
        }

        public Criteria andIsacceptanceNotBetween(Integer value1, Integer value2) {
            addCriterion("IsAcceptance not between", value1, value2, "isacceptance");
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

        public Criteria andCustomerNumberIsNull() {
            addCriterion("Customer_Number is null");
            return (Criteria) this;
        }

        public Criteria andCustomerNumberIsNotNull() {
            addCriterion("Customer_Number is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerNumberEqualTo(String value) {
            addCriterion("Customer_Number =", value, "customerNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerNumberNotEqualTo(String value) {
            addCriterion("Customer_Number <>", value, "customerNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerNumberGreaterThan(String value) {
            addCriterion("Customer_Number >", value, "customerNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerNumberGreaterThanOrEqualTo(String value) {
            addCriterion("Customer_Number >=", value, "customerNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerNumberLessThan(String value) {
            addCriterion("Customer_Number <", value, "customerNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerNumberLessThanOrEqualTo(String value) {
            addCriterion("Customer_Number <=", value, "customerNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerNumberLike(String value) {
            addCriterion("Customer_Number like", value, "customerNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerNumberNotLike(String value) {
            addCriterion("Customer_Number not like", value, "customerNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerNumberIn(List<String> values) {
            addCriterion("Customer_Number in", values, "customerNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerNumberNotIn(List<String> values) {
            addCriterion("Customer_Number not in", values, "customerNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerNumberBetween(String value1, String value2) {
            addCriterion("Customer_Number between", value1, value2, "customerNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerNumberNotBetween(String value1, String value2) {
            addCriterion("Customer_Number not between", value1, value2, "customerNumber");
            return (Criteria) this;
        }

        public Criteria andContractmanIsNull() {
            addCriterion("ContractMan is null");
            return (Criteria) this;
        }

        public Criteria andContractmanIsNotNull() {
            addCriterion("ContractMan is not null");
            return (Criteria) this;
        }

        public Criteria andContractmanEqualTo(String value) {
            addCriterion("ContractMan =", value, "contractman");
            return (Criteria) this;
        }

        public Criteria andContractmanNotEqualTo(String value) {
            addCriterion("ContractMan <>", value, "contractman");
            return (Criteria) this;
        }

        public Criteria andContractmanGreaterThan(String value) {
            addCriterion("ContractMan >", value, "contractman");
            return (Criteria) this;
        }

        public Criteria andContractmanGreaterThanOrEqualTo(String value) {
            addCriterion("ContractMan >=", value, "contractman");
            return (Criteria) this;
        }

        public Criteria andContractmanLessThan(String value) {
            addCriterion("ContractMan <", value, "contractman");
            return (Criteria) this;
        }

        public Criteria andContractmanLessThanOrEqualTo(String value) {
            addCriterion("ContractMan <=", value, "contractman");
            return (Criteria) this;
        }

        public Criteria andContractmanLike(String value) {
            addCriterion("ContractMan like", value, "contractman");
            return (Criteria) this;
        }

        public Criteria andContractmanNotLike(String value) {
            addCriterion("ContractMan not like", value, "contractman");
            return (Criteria) this;
        }

        public Criteria andContractmanIn(List<String> values) {
            addCriterion("ContractMan in", values, "contractman");
            return (Criteria) this;
        }

        public Criteria andContractmanNotIn(List<String> values) {
            addCriterion("ContractMan not in", values, "contractman");
            return (Criteria) this;
        }

        public Criteria andContractmanBetween(String value1, String value2) {
            addCriterion("ContractMan between", value1, value2, "contractman");
            return (Criteria) this;
        }

        public Criteria andContractmanNotBetween(String value1, String value2) {
            addCriterion("ContractMan not between", value1, value2, "contractman");
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

        public Criteria andImbarcodeIsNull() {
            addCriterion("IMBarcode is null");
            return (Criteria) this;
        }

        public Criteria andImbarcodeIsNotNull() {
            addCriterion("IMBarcode is not null");
            return (Criteria) this;
        }

        public Criteria andImbarcodeEqualTo(String value) {
            addCriterion("IMBarcode =", value, "imbarcode");
            return (Criteria) this;
        }

        public Criteria andImbarcodeNotEqualTo(String value) {
            addCriterion("IMBarcode <>", value, "imbarcode");
            return (Criteria) this;
        }

        public Criteria andImbarcodeGreaterThan(String value) {
            addCriterion("IMBarcode >", value, "imbarcode");
            return (Criteria) this;
        }

        public Criteria andImbarcodeGreaterThanOrEqualTo(String value) {
            addCriterion("IMBarcode >=", value, "imbarcode");
            return (Criteria) this;
        }

        public Criteria andImbarcodeLessThan(String value) {
            addCriterion("IMBarcode <", value, "imbarcode");
            return (Criteria) this;
        }

        public Criteria andImbarcodeLessThanOrEqualTo(String value) {
            addCriterion("IMBarcode <=", value, "imbarcode");
            return (Criteria) this;
        }

        public Criteria andImbarcodeLike(String value) {
            addCriterion("IMBarcode like", value, "imbarcode");
            return (Criteria) this;
        }

        public Criteria andImbarcodeNotLike(String value) {
            addCriterion("IMBarcode not like", value, "imbarcode");
            return (Criteria) this;
        }

        public Criteria andImbarcodeIn(List<String> values) {
            addCriterion("IMBarcode in", values, "imbarcode");
            return (Criteria) this;
        }

        public Criteria andImbarcodeNotIn(List<String> values) {
            addCriterion("IMBarcode not in", values, "imbarcode");
            return (Criteria) this;
        }

        public Criteria andImbarcodeBetween(String value1, String value2) {
            addCriterion("IMBarcode between", value1, value2, "imbarcode");
            return (Criteria) this;
        }

        public Criteria andImbarcodeNotBetween(String value1, String value2) {
            addCriterion("IMBarcode not between", value1, value2, "imbarcode");
            return (Criteria) this;
        }

        public Criteria andImstatusIsNull() {
            addCriterion("IMStatus is null");
            return (Criteria) this;
        }

        public Criteria andImstatusIsNotNull() {
            addCriterion("IMStatus is not null");
            return (Criteria) this;
        }

        public Criteria andImstatusEqualTo(Integer value) {
            addCriterion("IMStatus =", value, "imstatus");
            return (Criteria) this;
        }

        public Criteria andImstatusNotEqualTo(Integer value) {
            addCriterion("IMStatus <>", value, "imstatus");
            return (Criteria) this;
        }

        public Criteria andImstatusGreaterThan(Integer value) {
            addCriterion("IMStatus >", value, "imstatus");
            return (Criteria) this;
        }

        public Criteria andImstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("IMStatus >=", value, "imstatus");
            return (Criteria) this;
        }

        public Criteria andImstatusLessThan(Integer value) {
            addCriterion("IMStatus <", value, "imstatus");
            return (Criteria) this;
        }

        public Criteria andImstatusLessThanOrEqualTo(Integer value) {
            addCriterion("IMStatus <=", value, "imstatus");
            return (Criteria) this;
        }

        public Criteria andImstatusIn(List<Integer> values) {
            addCriterion("IMStatus in", values, "imstatus");
            return (Criteria) this;
        }

        public Criteria andImstatusNotIn(List<Integer> values) {
            addCriterion("IMStatus not in", values, "imstatus");
            return (Criteria) this;
        }

        public Criteria andImstatusBetween(Integer value1, Integer value2) {
            addCriterion("IMStatus between", value1, value2, "imstatus");
            return (Criteria) this;
        }

        public Criteria andImstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("IMStatus not between", value1, value2, "imstatus");
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

        public Criteria andConsigneeIsNull() {
            addCriterion("Consignee is null");
            return (Criteria) this;
        }

        public Criteria andConsigneeIsNotNull() {
            addCriterion("Consignee is not null");
            return (Criteria) this;
        }

        public Criteria andConsigneeEqualTo(Integer value) {
            addCriterion("Consignee =", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotEqualTo(Integer value) {
            addCriterion("Consignee <>", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeGreaterThan(Integer value) {
            addCriterion("Consignee >", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeGreaterThanOrEqualTo(Integer value) {
            addCriterion("Consignee >=", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeLessThan(Integer value) {
            addCriterion("Consignee <", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeLessThanOrEqualTo(Integer value) {
            addCriterion("Consignee <=", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeIn(List<Integer> values) {
            addCriterion("Consignee in", values, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotIn(List<Integer> values) {
            addCriterion("Consignee not in", values, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeBetween(Integer value1, Integer value2) {
            addCriterion("Consignee between", value1, value2, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotBetween(Integer value1, Integer value2) {
            addCriterion("Consignee not between", value1, value2, "consignee");
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

        public Criteria andIsdeletedEqualTo(Integer value) {
            addCriterion("IsDeleted =", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedNotEqualTo(Integer value) {
            addCriterion("IsDeleted <>", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedGreaterThan(Integer value) {
            addCriterion("IsDeleted >", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsDeleted >=", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedLessThan(Integer value) {
            addCriterion("IsDeleted <", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedLessThanOrEqualTo(Integer value) {
            addCriterion("IsDeleted <=", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedIn(List<Integer> values) {
            addCriterion("IsDeleted in", values, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedNotIn(List<Integer> values) {
            addCriterion("IsDeleted not in", values, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedBetween(Integer value1, Integer value2) {
            addCriterion("IsDeleted between", value1, value2, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedNotBetween(Integer value1, Integer value2) {
            addCriterion("IsDeleted not between", value1, value2, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andDirectreceptgoodIsNull() {
            addCriterion("DirectReceptGood is null");
            return (Criteria) this;
        }

        public Criteria andDirectreceptgoodIsNotNull() {
            addCriterion("DirectReceptGood is not null");
            return (Criteria) this;
        }

        public Criteria andDirectreceptgoodEqualTo(Integer value) {
            addCriterion("DirectReceptGood =", value, "directreceptgood");
            return (Criteria) this;
        }

        public Criteria andDirectreceptgoodNotEqualTo(Integer value) {
            addCriterion("DirectReceptGood <>", value, "directreceptgood");
            return (Criteria) this;
        }

        public Criteria andDirectreceptgoodGreaterThan(Integer value) {
            addCriterion("DirectReceptGood >", value, "directreceptgood");
            return (Criteria) this;
        }

        public Criteria andDirectreceptgoodGreaterThanOrEqualTo(Integer value) {
            addCriterion("DirectReceptGood >=", value, "directreceptgood");
            return (Criteria) this;
        }

        public Criteria andDirectreceptgoodLessThan(Integer value) {
            addCriterion("DirectReceptGood <", value, "directreceptgood");
            return (Criteria) this;
        }

        public Criteria andDirectreceptgoodLessThanOrEqualTo(Integer value) {
            addCriterion("DirectReceptGood <=", value, "directreceptgood");
            return (Criteria) this;
        }

        public Criteria andDirectreceptgoodIn(List<Integer> values) {
            addCriterion("DirectReceptGood in", values, "directreceptgood");
            return (Criteria) this;
        }

        public Criteria andDirectreceptgoodNotIn(List<Integer> values) {
            addCriterion("DirectReceptGood not in", values, "directreceptgood");
            return (Criteria) this;
        }

        public Criteria andDirectreceptgoodBetween(Integer value1, Integer value2) {
            addCriterion("DirectReceptGood between", value1, value2, "directreceptgood");
            return (Criteria) this;
        }

        public Criteria andDirectreceptgoodNotBetween(Integer value1, Integer value2) {
            addCriterion("DirectReceptGood not between", value1, value2, "directreceptgood");
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
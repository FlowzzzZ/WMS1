package cn.hhu.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WmsReceivingrecordsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WmsReceivingrecordsExample() {
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

        public Criteria andReceivingrecordsIdIsNull() {
            addCriterion("ReceivingRecords_ID is null");
            return (Criteria) this;
        }

        public Criteria andReceivingrecordsIdIsNotNull() {
            addCriterion("ReceivingRecords_ID is not null");
            return (Criteria) this;
        }

        public Criteria andReceivingrecordsIdEqualTo(Integer value) {
            addCriterion("ReceivingRecords_ID =", value, "receivingrecordsId");
            return (Criteria) this;
        }

        public Criteria andReceivingrecordsIdNotEqualTo(Integer value) {
            addCriterion("ReceivingRecords_ID <>", value, "receivingrecordsId");
            return (Criteria) this;
        }

        public Criteria andReceivingrecordsIdGreaterThan(Integer value) {
            addCriterion("ReceivingRecords_ID >", value, "receivingrecordsId");
            return (Criteria) this;
        }

        public Criteria andReceivingrecordsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ReceivingRecords_ID >=", value, "receivingrecordsId");
            return (Criteria) this;
        }

        public Criteria andReceivingrecordsIdLessThan(Integer value) {
            addCriterion("ReceivingRecords_ID <", value, "receivingrecordsId");
            return (Criteria) this;
        }

        public Criteria andReceivingrecordsIdLessThanOrEqualTo(Integer value) {
            addCriterion("ReceivingRecords_ID <=", value, "receivingrecordsId");
            return (Criteria) this;
        }

        public Criteria andReceivingrecordsIdIn(List<Integer> values) {
            addCriterion("ReceivingRecords_ID in", values, "receivingrecordsId");
            return (Criteria) this;
        }

        public Criteria andReceivingrecordsIdNotIn(List<Integer> values) {
            addCriterion("ReceivingRecords_ID not in", values, "receivingrecordsId");
            return (Criteria) this;
        }

        public Criteria andReceivingrecordsIdBetween(Integer value1, Integer value2) {
            addCriterion("ReceivingRecords_ID between", value1, value2, "receivingrecordsId");
            return (Criteria) this;
        }

        public Criteria andReceivingrecordsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ReceivingRecords_ID not between", value1, value2, "receivingrecordsId");
            return (Criteria) this;
        }

        public Criteria andReceivingrecordsNumberIsNull() {
            addCriterion("ReceivingRecords_Number is null");
            return (Criteria) this;
        }

        public Criteria andReceivingrecordsNumberIsNotNull() {
            addCriterion("ReceivingRecords_Number is not null");
            return (Criteria) this;
        }

        public Criteria andReceivingrecordsNumberEqualTo(String value) {
            addCriterion("ReceivingRecords_Number =", value, "receivingrecordsNumber");
            return (Criteria) this;
        }

        public Criteria andReceivingrecordsNumberNotEqualTo(String value) {
            addCriterion("ReceivingRecords_Number <>", value, "receivingrecordsNumber");
            return (Criteria) this;
        }

        public Criteria andReceivingrecordsNumberGreaterThan(String value) {
            addCriterion("ReceivingRecords_Number >", value, "receivingrecordsNumber");
            return (Criteria) this;
        }

        public Criteria andReceivingrecordsNumberGreaterThanOrEqualTo(String value) {
            addCriterion("ReceivingRecords_Number >=", value, "receivingrecordsNumber");
            return (Criteria) this;
        }

        public Criteria andReceivingrecordsNumberLessThan(String value) {
            addCriterion("ReceivingRecords_Number <", value, "receivingrecordsNumber");
            return (Criteria) this;
        }

        public Criteria andReceivingrecordsNumberLessThanOrEqualTo(String value) {
            addCriterion("ReceivingRecords_Number <=", value, "receivingrecordsNumber");
            return (Criteria) this;
        }

        public Criteria andReceivingrecordsNumberLike(String value) {
            addCriterion("ReceivingRecords_Number like", value, "receivingrecordsNumber");
            return (Criteria) this;
        }

        public Criteria andReceivingrecordsNumberNotLike(String value) {
            addCriterion("ReceivingRecords_Number not like", value, "receivingrecordsNumber");
            return (Criteria) this;
        }

        public Criteria andReceivingrecordsNumberIn(List<String> values) {
            addCriterion("ReceivingRecords_Number in", values, "receivingrecordsNumber");
            return (Criteria) this;
        }

        public Criteria andReceivingrecordsNumberNotIn(List<String> values) {
            addCriterion("ReceivingRecords_Number not in", values, "receivingrecordsNumber");
            return (Criteria) this;
        }

        public Criteria andReceivingrecordsNumberBetween(String value1, String value2) {
            addCriterion("ReceivingRecords_Number between", value1, value2, "receivingrecordsNumber");
            return (Criteria) this;
        }

        public Criteria andReceivingrecordsNumberNotBetween(String value1, String value2) {
            addCriterion("ReceivingRecords_Number not between", value1, value2, "receivingrecordsNumber");
            return (Criteria) this;
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

        public Criteria andShippernameIsNull() {
            addCriterion("ShipperName is null");
            return (Criteria) this;
        }

        public Criteria andShippernameIsNotNull() {
            addCriterion("ShipperName is not null");
            return (Criteria) this;
        }

        public Criteria andShippernameEqualTo(String value) {
            addCriterion("ShipperName =", value, "shippername");
            return (Criteria) this;
        }

        public Criteria andShippernameNotEqualTo(String value) {
            addCriterion("ShipperName <>", value, "shippername");
            return (Criteria) this;
        }

        public Criteria andShippernameGreaterThan(String value) {
            addCriterion("ShipperName >", value, "shippername");
            return (Criteria) this;
        }

        public Criteria andShippernameGreaterThanOrEqualTo(String value) {
            addCriterion("ShipperName >=", value, "shippername");
            return (Criteria) this;
        }

        public Criteria andShippernameLessThan(String value) {
            addCriterion("ShipperName <", value, "shippername");
            return (Criteria) this;
        }

        public Criteria andShippernameLessThanOrEqualTo(String value) {
            addCriterion("ShipperName <=", value, "shippername");
            return (Criteria) this;
        }

        public Criteria andShippernameLike(String value) {
            addCriterion("ShipperName like", value, "shippername");
            return (Criteria) this;
        }

        public Criteria andShippernameNotLike(String value) {
            addCriterion("ShipperName not like", value, "shippername");
            return (Criteria) this;
        }

        public Criteria andShippernameIn(List<String> values) {
            addCriterion("ShipperName in", values, "shippername");
            return (Criteria) this;
        }

        public Criteria andShippernameNotIn(List<String> values) {
            addCriterion("ShipperName not in", values, "shippername");
            return (Criteria) this;
        }

        public Criteria andShippernameBetween(String value1, String value2) {
            addCriterion("ShipperName between", value1, value2, "shippername");
            return (Criteria) this;
        }

        public Criteria andShippernameNotBetween(String value1, String value2) {
            addCriterion("ShipperName not between", value1, value2, "shippername");
            return (Criteria) this;
        }

        public Criteria andRegistrationIsNull() {
            addCriterion("Registration is null");
            return (Criteria) this;
        }

        public Criteria andRegistrationIsNotNull() {
            addCriterion("Registration is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrationEqualTo(String value) {
            addCriterion("Registration =", value, "registration");
            return (Criteria) this;
        }

        public Criteria andRegistrationNotEqualTo(String value) {
            addCriterion("Registration <>", value, "registration");
            return (Criteria) this;
        }

        public Criteria andRegistrationGreaterThan(String value) {
            addCriterion("Registration >", value, "registration");
            return (Criteria) this;
        }

        public Criteria andRegistrationGreaterThanOrEqualTo(String value) {
            addCriterion("Registration >=", value, "registration");
            return (Criteria) this;
        }

        public Criteria andRegistrationLessThan(String value) {
            addCriterion("Registration <", value, "registration");
            return (Criteria) this;
        }

        public Criteria andRegistrationLessThanOrEqualTo(String value) {
            addCriterion("Registration <=", value, "registration");
            return (Criteria) this;
        }

        public Criteria andRegistrationLike(String value) {
            addCriterion("Registration like", value, "registration");
            return (Criteria) this;
        }

        public Criteria andRegistrationNotLike(String value) {
            addCriterion("Registration not like", value, "registration");
            return (Criteria) this;
        }

        public Criteria andRegistrationIn(List<String> values) {
            addCriterion("Registration in", values, "registration");
            return (Criteria) this;
        }

        public Criteria andRegistrationNotIn(List<String> values) {
            addCriterion("Registration not in", values, "registration");
            return (Criteria) this;
        }

        public Criteria andRegistrationBetween(String value1, String value2) {
            addCriterion("Registration between", value1, value2, "registration");
            return (Criteria) this;
        }

        public Criteria andRegistrationNotBetween(String value1, String value2) {
            addCriterion("Registration not between", value1, value2, "registration");
            return (Criteria) this;
        }

        public Criteria andSpecifiationtypeIsNull() {
            addCriterion("SpecifiationType is null");
            return (Criteria) this;
        }

        public Criteria andSpecifiationtypeIsNotNull() {
            addCriterion("SpecifiationType is not null");
            return (Criteria) this;
        }

        public Criteria andSpecifiationtypeEqualTo(String value) {
            addCriterion("SpecifiationType =", value, "specifiationtype");
            return (Criteria) this;
        }

        public Criteria andSpecifiationtypeNotEqualTo(String value) {
            addCriterion("SpecifiationType <>", value, "specifiationtype");
            return (Criteria) this;
        }

        public Criteria andSpecifiationtypeGreaterThan(String value) {
            addCriterion("SpecifiationType >", value, "specifiationtype");
            return (Criteria) this;
        }

        public Criteria andSpecifiationtypeGreaterThanOrEqualTo(String value) {
            addCriterion("SpecifiationType >=", value, "specifiationtype");
            return (Criteria) this;
        }

        public Criteria andSpecifiationtypeLessThan(String value) {
            addCriterion("SpecifiationType <", value, "specifiationtype");
            return (Criteria) this;
        }

        public Criteria andSpecifiationtypeLessThanOrEqualTo(String value) {
            addCriterion("SpecifiationType <=", value, "specifiationtype");
            return (Criteria) this;
        }

        public Criteria andSpecifiationtypeLike(String value) {
            addCriterion("SpecifiationType like", value, "specifiationtype");
            return (Criteria) this;
        }

        public Criteria andSpecifiationtypeNotLike(String value) {
            addCriterion("SpecifiationType not like", value, "specifiationtype");
            return (Criteria) this;
        }

        public Criteria andSpecifiationtypeIn(List<String> values) {
            addCriterion("SpecifiationType in", values, "specifiationtype");
            return (Criteria) this;
        }

        public Criteria andSpecifiationtypeNotIn(List<String> values) {
            addCriterion("SpecifiationType not in", values, "specifiationtype");
            return (Criteria) this;
        }

        public Criteria andSpecifiationtypeBetween(String value1, String value2) {
            addCriterion("SpecifiationType between", value1, value2, "specifiationtype");
            return (Criteria) this;
        }

        public Criteria andSpecifiationtypeNotBetween(String value1, String value2) {
            addCriterion("SpecifiationType not between", value1, value2, "specifiationtype");
            return (Criteria) this;
        }

        public Criteria andBatchnumberIsNull() {
            addCriterion("BatchNumber is null");
            return (Criteria) this;
        }

        public Criteria andBatchnumberIsNotNull() {
            addCriterion("BatchNumber is not null");
            return (Criteria) this;
        }

        public Criteria andBatchnumberEqualTo(String value) {
            addCriterion("BatchNumber =", value, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberNotEqualTo(String value) {
            addCriterion("BatchNumber <>", value, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberGreaterThan(String value) {
            addCriterion("BatchNumber >", value, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberGreaterThanOrEqualTo(String value) {
            addCriterion("BatchNumber >=", value, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberLessThan(String value) {
            addCriterion("BatchNumber <", value, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberLessThanOrEqualTo(String value) {
            addCriterion("BatchNumber <=", value, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberLike(String value) {
            addCriterion("BatchNumber like", value, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberNotLike(String value) {
            addCriterion("BatchNumber not like", value, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberIn(List<String> values) {
            addCriterion("BatchNumber in", values, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberNotIn(List<String> values) {
            addCriterion("BatchNumber not in", values, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberBetween(String value1, String value2) {
            addCriterion("BatchNumber between", value1, value2, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberNotBetween(String value1, String value2) {
            addCriterion("BatchNumber not between", value1, value2, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andProducedateIsNull() {
            addCriterion("ProduceDate is null");
            return (Criteria) this;
        }

        public Criteria andProducedateIsNotNull() {
            addCriterion("ProduceDate is not null");
            return (Criteria) this;
        }

        public Criteria andProducedateEqualTo(Date value) {
            addCriterion("ProduceDate =", value, "producedate");
            return (Criteria) this;
        }

        public Criteria andProducedateNotEqualTo(Date value) {
            addCriterion("ProduceDate <>", value, "producedate");
            return (Criteria) this;
        }

        public Criteria andProducedateGreaterThan(Date value) {
            addCriterion("ProduceDate >", value, "producedate");
            return (Criteria) this;
        }

        public Criteria andProducedateGreaterThanOrEqualTo(Date value) {
            addCriterion("ProduceDate >=", value, "producedate");
            return (Criteria) this;
        }

        public Criteria andProducedateLessThan(Date value) {
            addCriterion("ProduceDate <", value, "producedate");
            return (Criteria) this;
        }

        public Criteria andProducedateLessThanOrEqualTo(Date value) {
            addCriterion("ProduceDate <=", value, "producedate");
            return (Criteria) this;
        }

        public Criteria andProducedateIn(List<Date> values) {
            addCriterion("ProduceDate in", values, "producedate");
            return (Criteria) this;
        }

        public Criteria andProducedateNotIn(List<Date> values) {
            addCriterion("ProduceDate not in", values, "producedate");
            return (Criteria) this;
        }

        public Criteria andProducedateBetween(Date value1, Date value2) {
            addCriterion("ProduceDate between", value1, value2, "producedate");
            return (Criteria) this;
        }

        public Criteria andProducedateNotBetween(Date value1, Date value2) {
            addCriterion("ProduceDate not between", value1, value2, "producedate");
            return (Criteria) this;
        }

        public Criteria andFailuredateIsNull() {
            addCriterion("FailureDate is null");
            return (Criteria) this;
        }

        public Criteria andFailuredateIsNotNull() {
            addCriterion("FailureDate is not null");
            return (Criteria) this;
        }

        public Criteria andFailuredateEqualTo(Date value) {
            addCriterion("FailureDate =", value, "failuredate");
            return (Criteria) this;
        }

        public Criteria andFailuredateNotEqualTo(Date value) {
            addCriterion("FailureDate <>", value, "failuredate");
            return (Criteria) this;
        }

        public Criteria andFailuredateGreaterThan(Date value) {
            addCriterion("FailureDate >", value, "failuredate");
            return (Criteria) this;
        }

        public Criteria andFailuredateGreaterThanOrEqualTo(Date value) {
            addCriterion("FailureDate >=", value, "failuredate");
            return (Criteria) this;
        }

        public Criteria andFailuredateLessThan(Date value) {
            addCriterion("FailureDate <", value, "failuredate");
            return (Criteria) this;
        }

        public Criteria andFailuredateLessThanOrEqualTo(Date value) {
            addCriterion("FailureDate <=", value, "failuredate");
            return (Criteria) this;
        }

        public Criteria andFailuredateIn(List<Date> values) {
            addCriterion("FailureDate in", values, "failuredate");
            return (Criteria) this;
        }

        public Criteria andFailuredateNotIn(List<Date> values) {
            addCriterion("FailureDate not in", values, "failuredate");
            return (Criteria) this;
        }

        public Criteria andFailuredateBetween(Date value1, Date value2) {
            addCriterion("FailureDate between", value1, value2, "failuredate");
            return (Criteria) this;
        }

        public Criteria andFailuredateNotBetween(Date value1, Date value2) {
            addCriterion("FailureDate not between", value1, value2, "failuredate");
            return (Criteria) this;
        }

        public Criteria andArrivedgoodsnumberIsNull() {
            addCriterion("ArrivedGoodsNumber is null");
            return (Criteria) this;
        }

        public Criteria andArrivedgoodsnumberIsNotNull() {
            addCriterion("ArrivedGoodsNumber is not null");
            return (Criteria) this;
        }

        public Criteria andArrivedgoodsnumberEqualTo(Float value) {
            addCriterion("ArrivedGoodsNumber =", value, "arrivedgoodsnumber");
            return (Criteria) this;
        }

        public Criteria andArrivedgoodsnumberNotEqualTo(Float value) {
            addCriterion("ArrivedGoodsNumber <>", value, "arrivedgoodsnumber");
            return (Criteria) this;
        }

        public Criteria andArrivedgoodsnumberGreaterThan(Float value) {
            addCriterion("ArrivedGoodsNumber >", value, "arrivedgoodsnumber");
            return (Criteria) this;
        }

        public Criteria andArrivedgoodsnumberGreaterThanOrEqualTo(Float value) {
            addCriterion("ArrivedGoodsNumber >=", value, "arrivedgoodsnumber");
            return (Criteria) this;
        }

        public Criteria andArrivedgoodsnumberLessThan(Float value) {
            addCriterion("ArrivedGoodsNumber <", value, "arrivedgoodsnumber");
            return (Criteria) this;
        }

        public Criteria andArrivedgoodsnumberLessThanOrEqualTo(Float value) {
            addCriterion("ArrivedGoodsNumber <=", value, "arrivedgoodsnumber");
            return (Criteria) this;
        }

        public Criteria andArrivedgoodsnumberIn(List<Float> values) {
            addCriterion("ArrivedGoodsNumber in", values, "arrivedgoodsnumber");
            return (Criteria) this;
        }

        public Criteria andArrivedgoodsnumberNotIn(List<Float> values) {
            addCriterion("ArrivedGoodsNumber not in", values, "arrivedgoodsnumber");
            return (Criteria) this;
        }

        public Criteria andArrivedgoodsnumberBetween(Float value1, Float value2) {
            addCriterion("ArrivedGoodsNumber between", value1, value2, "arrivedgoodsnumber");
            return (Criteria) this;
        }

        public Criteria andArrivedgoodsnumberNotBetween(Float value1, Float value2) {
            addCriterion("ArrivedGoodsNumber not between", value1, value2, "arrivedgoodsnumber");
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

        public Criteria andStoragerequirementIsNull() {
            addCriterion("StorageRequirement is null");
            return (Criteria) this;
        }

        public Criteria andStoragerequirementIsNotNull() {
            addCriterion("StorageRequirement is not null");
            return (Criteria) this;
        }

        public Criteria andStoragerequirementEqualTo(String value) {
            addCriterion("StorageRequirement =", value, "storagerequirement");
            return (Criteria) this;
        }

        public Criteria andStoragerequirementNotEqualTo(String value) {
            addCriterion("StorageRequirement <>", value, "storagerequirement");
            return (Criteria) this;
        }

        public Criteria andStoragerequirementGreaterThan(String value) {
            addCriterion("StorageRequirement >", value, "storagerequirement");
            return (Criteria) this;
        }

        public Criteria andStoragerequirementGreaterThanOrEqualTo(String value) {
            addCriterion("StorageRequirement >=", value, "storagerequirement");
            return (Criteria) this;
        }

        public Criteria andStoragerequirementLessThan(String value) {
            addCriterion("StorageRequirement <", value, "storagerequirement");
            return (Criteria) this;
        }

        public Criteria andStoragerequirementLessThanOrEqualTo(String value) {
            addCriterion("StorageRequirement <=", value, "storagerequirement");
            return (Criteria) this;
        }

        public Criteria andStoragerequirementLike(String value) {
            addCriterion("StorageRequirement like", value, "storagerequirement");
            return (Criteria) this;
        }

        public Criteria andStoragerequirementNotLike(String value) {
            addCriterion("StorageRequirement not like", value, "storagerequirement");
            return (Criteria) this;
        }

        public Criteria andStoragerequirementIn(List<String> values) {
            addCriterion("StorageRequirement in", values, "storagerequirement");
            return (Criteria) this;
        }

        public Criteria andStoragerequirementNotIn(List<String> values) {
            addCriterion("StorageRequirement not in", values, "storagerequirement");
            return (Criteria) this;
        }

        public Criteria andStoragerequirementBetween(String value1, String value2) {
            addCriterion("StorageRequirement between", value1, value2, "storagerequirement");
            return (Criteria) this;
        }

        public Criteria andStoragerequirementNotBetween(String value1, String value2) {
            addCriterion("StorageRequirement not between", value1, value2, "storagerequirement");
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

        public Criteria andCountnumberIsNull() {
            addCriterion("CountNumber is null");
            return (Criteria) this;
        }

        public Criteria andCountnumberIsNotNull() {
            addCriterion("CountNumber is not null");
            return (Criteria) this;
        }

        public Criteria andCountnumberEqualTo(String value) {
            addCriterion("CountNumber =", value, "countnumber");
            return (Criteria) this;
        }

        public Criteria andCountnumberNotEqualTo(String value) {
            addCriterion("CountNumber <>", value, "countnumber");
            return (Criteria) this;
        }

        public Criteria andCountnumberGreaterThan(String value) {
            addCriterion("CountNumber >", value, "countnumber");
            return (Criteria) this;
        }

        public Criteria andCountnumberGreaterThanOrEqualTo(String value) {
            addCriterion("CountNumber >=", value, "countnumber");
            return (Criteria) this;
        }

        public Criteria andCountnumberLessThan(String value) {
            addCriterion("CountNumber <", value, "countnumber");
            return (Criteria) this;
        }

        public Criteria andCountnumberLessThanOrEqualTo(String value) {
            addCriterion("CountNumber <=", value, "countnumber");
            return (Criteria) this;
        }

        public Criteria andCountnumberLike(String value) {
            addCriterion("CountNumber like", value, "countnumber");
            return (Criteria) this;
        }

        public Criteria andCountnumberNotLike(String value) {
            addCriterion("CountNumber not like", value, "countnumber");
            return (Criteria) this;
        }

        public Criteria andCountnumberIn(List<String> values) {
            addCriterion("CountNumber in", values, "countnumber");
            return (Criteria) this;
        }

        public Criteria andCountnumberNotIn(List<String> values) {
            addCriterion("CountNumber not in", values, "countnumber");
            return (Criteria) this;
        }

        public Criteria andCountnumberBetween(String value1, String value2) {
            addCriterion("CountNumber between", value1, value2, "countnumber");
            return (Criteria) this;
        }

        public Criteria andCountnumberNotBetween(String value1, String value2) {
            addCriterion("CountNumber not between", value1, value2, "countnumber");
            return (Criteria) this;
        }

        public Criteria andLocationnameIsNull() {
            addCriterion("LocationName is null");
            return (Criteria) this;
        }

        public Criteria andLocationnameIsNotNull() {
            addCriterion("LocationName is not null");
            return (Criteria) this;
        }

        public Criteria andLocationnameEqualTo(String value) {
            addCriterion("LocationName =", value, "locationname");
            return (Criteria) this;
        }

        public Criteria andLocationnameNotEqualTo(String value) {
            addCriterion("LocationName <>", value, "locationname");
            return (Criteria) this;
        }

        public Criteria andLocationnameGreaterThan(String value) {
            addCriterion("LocationName >", value, "locationname");
            return (Criteria) this;
        }

        public Criteria andLocationnameGreaterThanOrEqualTo(String value) {
            addCriterion("LocationName >=", value, "locationname");
            return (Criteria) this;
        }

        public Criteria andLocationnameLessThan(String value) {
            addCriterion("LocationName <", value, "locationname");
            return (Criteria) this;
        }

        public Criteria andLocationnameLessThanOrEqualTo(String value) {
            addCriterion("LocationName <=", value, "locationname");
            return (Criteria) this;
        }

        public Criteria andLocationnameLike(String value) {
            addCriterion("LocationName like", value, "locationname");
            return (Criteria) this;
        }

        public Criteria andLocationnameNotLike(String value) {
            addCriterion("LocationName not like", value, "locationname");
            return (Criteria) this;
        }

        public Criteria andLocationnameIn(List<String> values) {
            addCriterion("LocationName in", values, "locationname");
            return (Criteria) this;
        }

        public Criteria andLocationnameNotIn(List<String> values) {
            addCriterion("LocationName not in", values, "locationname");
            return (Criteria) this;
        }

        public Criteria andLocationnameBetween(String value1, String value2) {
            addCriterion("LocationName between", value1, value2, "locationname");
            return (Criteria) this;
        }

        public Criteria andLocationnameNotBetween(String value1, String value2) {
            addCriterion("LocationName not between", value1, value2, "locationname");
            return (Criteria) this;
        }

        public Criteria andArrivedgoodsmanIsNull() {
            addCriterion("ArrivedGoodsMan is null");
            return (Criteria) this;
        }

        public Criteria andArrivedgoodsmanIsNotNull() {
            addCriterion("ArrivedGoodsMan is not null");
            return (Criteria) this;
        }

        public Criteria andArrivedgoodsmanEqualTo(String value) {
            addCriterion("ArrivedGoodsMan =", value, "arrivedgoodsman");
            return (Criteria) this;
        }

        public Criteria andArrivedgoodsmanNotEqualTo(String value) {
            addCriterion("ArrivedGoodsMan <>", value, "arrivedgoodsman");
            return (Criteria) this;
        }

        public Criteria andArrivedgoodsmanGreaterThan(String value) {
            addCriterion("ArrivedGoodsMan >", value, "arrivedgoodsman");
            return (Criteria) this;
        }

        public Criteria andArrivedgoodsmanGreaterThanOrEqualTo(String value) {
            addCriterion("ArrivedGoodsMan >=", value, "arrivedgoodsman");
            return (Criteria) this;
        }

        public Criteria andArrivedgoodsmanLessThan(String value) {
            addCriterion("ArrivedGoodsMan <", value, "arrivedgoodsman");
            return (Criteria) this;
        }

        public Criteria andArrivedgoodsmanLessThanOrEqualTo(String value) {
            addCriterion("ArrivedGoodsMan <=", value, "arrivedgoodsman");
            return (Criteria) this;
        }

        public Criteria andArrivedgoodsmanLike(String value) {
            addCriterion("ArrivedGoodsMan like", value, "arrivedgoodsman");
            return (Criteria) this;
        }

        public Criteria andArrivedgoodsmanNotLike(String value) {
            addCriterion("ArrivedGoodsMan not like", value, "arrivedgoodsman");
            return (Criteria) this;
        }

        public Criteria andArrivedgoodsmanIn(List<String> values) {
            addCriterion("ArrivedGoodsMan in", values, "arrivedgoodsman");
            return (Criteria) this;
        }

        public Criteria andArrivedgoodsmanNotIn(List<String> values) {
            addCriterion("ArrivedGoodsMan not in", values, "arrivedgoodsman");
            return (Criteria) this;
        }

        public Criteria andArrivedgoodsmanBetween(String value1, String value2) {
            addCriterion("ArrivedGoodsMan between", value1, value2, "arrivedgoodsman");
            return (Criteria) this;
        }

        public Criteria andArrivedgoodsmanNotBetween(String value1, String value2) {
            addCriterion("ArrivedGoodsMan not between", value1, value2, "arrivedgoodsman");
            return (Criteria) this;
        }

        public Criteria andHitshelvesmanIsNull() {
            addCriterion("HitShelvesMan is null");
            return (Criteria) this;
        }

        public Criteria andHitshelvesmanIsNotNull() {
            addCriterion("HitShelvesMan is not null");
            return (Criteria) this;
        }

        public Criteria andHitshelvesmanEqualTo(String value) {
            addCriterion("HitShelvesMan =", value, "hitshelvesman");
            return (Criteria) this;
        }

        public Criteria andHitshelvesmanNotEqualTo(String value) {
            addCriterion("HitShelvesMan <>", value, "hitshelvesman");
            return (Criteria) this;
        }

        public Criteria andHitshelvesmanGreaterThan(String value) {
            addCriterion("HitShelvesMan >", value, "hitshelvesman");
            return (Criteria) this;
        }

        public Criteria andHitshelvesmanGreaterThanOrEqualTo(String value) {
            addCriterion("HitShelvesMan >=", value, "hitshelvesman");
            return (Criteria) this;
        }

        public Criteria andHitshelvesmanLessThan(String value) {
            addCriterion("HitShelvesMan <", value, "hitshelvesman");
            return (Criteria) this;
        }

        public Criteria andHitshelvesmanLessThanOrEqualTo(String value) {
            addCriterion("HitShelvesMan <=", value, "hitshelvesman");
            return (Criteria) this;
        }

        public Criteria andHitshelvesmanLike(String value) {
            addCriterion("HitShelvesMan like", value, "hitshelvesman");
            return (Criteria) this;
        }

        public Criteria andHitshelvesmanNotLike(String value) {
            addCriterion("HitShelvesMan not like", value, "hitshelvesman");
            return (Criteria) this;
        }

        public Criteria andHitshelvesmanIn(List<String> values) {
            addCriterion("HitShelvesMan in", values, "hitshelvesman");
            return (Criteria) this;
        }

        public Criteria andHitshelvesmanNotIn(List<String> values) {
            addCriterion("HitShelvesMan not in", values, "hitshelvesman");
            return (Criteria) this;
        }

        public Criteria andHitshelvesmanBetween(String value1, String value2) {
            addCriterion("HitShelvesMan between", value1, value2, "hitshelvesman");
            return (Criteria) this;
        }

        public Criteria andHitshelvesmanNotBetween(String value1, String value2) {
            addCriterion("HitShelvesMan not between", value1, value2, "hitshelvesman");
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

        public Criteria andRoutetemperatureIsNull() {
            addCriterion("RouteTemperature is null");
            return (Criteria) this;
        }

        public Criteria andRoutetemperatureIsNotNull() {
            addCriterion("RouteTemperature is not null");
            return (Criteria) this;
        }

        public Criteria andRoutetemperatureEqualTo(String value) {
            addCriterion("RouteTemperature =", value, "routetemperature");
            return (Criteria) this;
        }

        public Criteria andRoutetemperatureNotEqualTo(String value) {
            addCriterion("RouteTemperature <>", value, "routetemperature");
            return (Criteria) this;
        }

        public Criteria andRoutetemperatureGreaterThan(String value) {
            addCriterion("RouteTemperature >", value, "routetemperature");
            return (Criteria) this;
        }

        public Criteria andRoutetemperatureGreaterThanOrEqualTo(String value) {
            addCriterion("RouteTemperature >=", value, "routetemperature");
            return (Criteria) this;
        }

        public Criteria andRoutetemperatureLessThan(String value) {
            addCriterion("RouteTemperature <", value, "routetemperature");
            return (Criteria) this;
        }

        public Criteria andRoutetemperatureLessThanOrEqualTo(String value) {
            addCriterion("RouteTemperature <=", value, "routetemperature");
            return (Criteria) this;
        }

        public Criteria andRoutetemperatureLike(String value) {
            addCriterion("RouteTemperature like", value, "routetemperature");
            return (Criteria) this;
        }

        public Criteria andRoutetemperatureNotLike(String value) {
            addCriterion("RouteTemperature not like", value, "routetemperature");
            return (Criteria) this;
        }

        public Criteria andRoutetemperatureIn(List<String> values) {
            addCriterion("RouteTemperature in", values, "routetemperature");
            return (Criteria) this;
        }

        public Criteria andRoutetemperatureNotIn(List<String> values) {
            addCriterion("RouteTemperature not in", values, "routetemperature");
            return (Criteria) this;
        }

        public Criteria andRoutetemperatureBetween(String value1, String value2) {
            addCriterion("RouteTemperature between", value1, value2, "routetemperature");
            return (Criteria) this;
        }

        public Criteria andRoutetemperatureNotBetween(String value1, String value2) {
            addCriterion("RouteTemperature not between", value1, value2, "routetemperature");
            return (Criteria) this;
        }

        public Criteria andRecordtemperatureIsNull() {
            addCriterion("RecordTemperature is null");
            return (Criteria) this;
        }

        public Criteria andRecordtemperatureIsNotNull() {
            addCriterion("RecordTemperature is not null");
            return (Criteria) this;
        }

        public Criteria andRecordtemperatureEqualTo(String value) {
            addCriterion("RecordTemperature =", value, "recordtemperature");
            return (Criteria) this;
        }

        public Criteria andRecordtemperatureNotEqualTo(String value) {
            addCriterion("RecordTemperature <>", value, "recordtemperature");
            return (Criteria) this;
        }

        public Criteria andRecordtemperatureGreaterThan(String value) {
            addCriterion("RecordTemperature >", value, "recordtemperature");
            return (Criteria) this;
        }

        public Criteria andRecordtemperatureGreaterThanOrEqualTo(String value) {
            addCriterion("RecordTemperature >=", value, "recordtemperature");
            return (Criteria) this;
        }

        public Criteria andRecordtemperatureLessThan(String value) {
            addCriterion("RecordTemperature <", value, "recordtemperature");
            return (Criteria) this;
        }

        public Criteria andRecordtemperatureLessThanOrEqualTo(String value) {
            addCriterion("RecordTemperature <=", value, "recordtemperature");
            return (Criteria) this;
        }

        public Criteria andRecordtemperatureLike(String value) {
            addCriterion("RecordTemperature like", value, "recordtemperature");
            return (Criteria) this;
        }

        public Criteria andRecordtemperatureNotLike(String value) {
            addCriterion("RecordTemperature not like", value, "recordtemperature");
            return (Criteria) this;
        }

        public Criteria andRecordtemperatureIn(List<String> values) {
            addCriterion("RecordTemperature in", values, "recordtemperature");
            return (Criteria) this;
        }

        public Criteria andRecordtemperatureNotIn(List<String> values) {
            addCriterion("RecordTemperature not in", values, "recordtemperature");
            return (Criteria) this;
        }

        public Criteria andRecordtemperatureBetween(String value1, String value2) {
            addCriterion("RecordTemperature between", value1, value2, "recordtemperature");
            return (Criteria) this;
        }

        public Criteria andRecordtemperatureNotBetween(String value1, String value2) {
            addCriterion("RecordTemperature not between", value1, value2, "recordtemperature");
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
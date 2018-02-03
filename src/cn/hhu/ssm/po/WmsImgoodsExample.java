package cn.hhu.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WmsImgoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WmsImgoodsExample() {
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

        public Criteria andGoodsIdIsNull() {
            addCriterion("Goods_ID is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("Goods_ID is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(Integer value) {
            addCriterion("Goods_ID =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(Integer value) {
            addCriterion("Goods_ID <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(Integer value) {
            addCriterion("Goods_ID >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Goods_ID >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(Integer value) {
            addCriterion("Goods_ID <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(Integer value) {
            addCriterion("Goods_ID <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<Integer> values) {
            addCriterion("Goods_ID in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<Integer> values) {
            addCriterion("Goods_ID not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(Integer value1, Integer value2) {
            addCriterion("Goods_ID between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Goods_ID not between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberIsNull() {
            addCriterion("Goods_Number is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberIsNotNull() {
            addCriterion("Goods_Number is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberEqualTo(String value) {
            addCriterion("Goods_Number =", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberNotEqualTo(String value) {
            addCriterion("Goods_Number <>", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberGreaterThan(String value) {
            addCriterion("Goods_Number >", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberGreaterThanOrEqualTo(String value) {
            addCriterion("Goods_Number >=", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberLessThan(String value) {
            addCriterion("Goods_Number <", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberLessThanOrEqualTo(String value) {
            addCriterion("Goods_Number <=", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberLike(String value) {
            addCriterion("Goods_Number like", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberNotLike(String value) {
            addCriterion("Goods_Number not like", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberIn(List<String> values) {
            addCriterion("Goods_Number in", values, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberNotIn(List<String> values) {
            addCriterion("Goods_Number not in", values, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberBetween(String value1, String value2) {
            addCriterion("Goods_Number between", value1, value2, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberNotBetween(String value1, String value2) {
            addCriterion("Goods_Number not between", value1, value2, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsnameIsNull() {
            addCriterion("GoodsName is null");
            return (Criteria) this;
        }

        public Criteria andGoodsnameIsNotNull() {
            addCriterion("GoodsName is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsnameEqualTo(String value) {
            addCriterion("GoodsName =", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotEqualTo(String value) {
            addCriterion("GoodsName <>", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameGreaterThan(String value) {
            addCriterion("GoodsName >", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameGreaterThanOrEqualTo(String value) {
            addCriterion("GoodsName >=", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameLessThan(String value) {
            addCriterion("GoodsName <", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameLessThanOrEqualTo(String value) {
            addCriterion("GoodsName <=", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameLike(String value) {
            addCriterion("GoodsName like", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotLike(String value) {
            addCriterion("GoodsName not like", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameIn(List<String> values) {
            addCriterion("GoodsName in", values, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotIn(List<String> values) {
            addCriterion("GoodsName not in", values, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameBetween(String value1, String value2) {
            addCriterion("GoodsName between", value1, value2, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotBetween(String value1, String value2) {
            addCriterion("GoodsName not between", value1, value2, "goodsname");
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

        public Criteria andBatcnumberIsNull() {
            addCriterion("BatcNumber is null");
            return (Criteria) this;
        }

        public Criteria andBatcnumberIsNotNull() {
            addCriterion("BatcNumber is not null");
            return (Criteria) this;
        }

        public Criteria andBatcnumberEqualTo(String value) {
            addCriterion("BatcNumber =", value, "batcnumber");
            return (Criteria) this;
        }

        public Criteria andBatcnumberNotEqualTo(String value) {
            addCriterion("BatcNumber <>", value, "batcnumber");
            return (Criteria) this;
        }

        public Criteria andBatcnumberGreaterThan(String value) {
            addCriterion("BatcNumber >", value, "batcnumber");
            return (Criteria) this;
        }

        public Criteria andBatcnumberGreaterThanOrEqualTo(String value) {
            addCriterion("BatcNumber >=", value, "batcnumber");
            return (Criteria) this;
        }

        public Criteria andBatcnumberLessThan(String value) {
            addCriterion("BatcNumber <", value, "batcnumber");
            return (Criteria) this;
        }

        public Criteria andBatcnumberLessThanOrEqualTo(String value) {
            addCriterion("BatcNumber <=", value, "batcnumber");
            return (Criteria) this;
        }

        public Criteria andBatcnumberLike(String value) {
            addCriterion("BatcNumber like", value, "batcnumber");
            return (Criteria) this;
        }

        public Criteria andBatcnumberNotLike(String value) {
            addCriterion("BatcNumber not like", value, "batcnumber");
            return (Criteria) this;
        }

        public Criteria andBatcnumberIn(List<String> values) {
            addCriterion("BatcNumber in", values, "batcnumber");
            return (Criteria) this;
        }

        public Criteria andBatcnumberNotIn(List<String> values) {
            addCriterion("BatcNumber not in", values, "batcnumber");
            return (Criteria) this;
        }

        public Criteria andBatcnumberBetween(String value1, String value2) {
            addCriterion("BatcNumber between", value1, value2, "batcnumber");
            return (Criteria) this;
        }

        public Criteria andBatcnumberNotBetween(String value1, String value2) {
            addCriterion("BatcNumber not between", value1, value2, "batcnumber");
            return (Criteria) this;
        }

        public Criteria andSecondbatchnumberIsNull() {
            addCriterion("SecondBatchNumber is null");
            return (Criteria) this;
        }

        public Criteria andSecondbatchnumberIsNotNull() {
            addCriterion("SecondBatchNumber is not null");
            return (Criteria) this;
        }

        public Criteria andSecondbatchnumberEqualTo(String value) {
            addCriterion("SecondBatchNumber =", value, "secondbatchnumber");
            return (Criteria) this;
        }

        public Criteria andSecondbatchnumberNotEqualTo(String value) {
            addCriterion("SecondBatchNumber <>", value, "secondbatchnumber");
            return (Criteria) this;
        }

        public Criteria andSecondbatchnumberGreaterThan(String value) {
            addCriterion("SecondBatchNumber >", value, "secondbatchnumber");
            return (Criteria) this;
        }

        public Criteria andSecondbatchnumberGreaterThanOrEqualTo(String value) {
            addCriterion("SecondBatchNumber >=", value, "secondbatchnumber");
            return (Criteria) this;
        }

        public Criteria andSecondbatchnumberLessThan(String value) {
            addCriterion("SecondBatchNumber <", value, "secondbatchnumber");
            return (Criteria) this;
        }

        public Criteria andSecondbatchnumberLessThanOrEqualTo(String value) {
            addCriterion("SecondBatchNumber <=", value, "secondbatchnumber");
            return (Criteria) this;
        }

        public Criteria andSecondbatchnumberLike(String value) {
            addCriterion("SecondBatchNumber like", value, "secondbatchnumber");
            return (Criteria) this;
        }

        public Criteria andSecondbatchnumberNotLike(String value) {
            addCriterion("SecondBatchNumber not like", value, "secondbatchnumber");
            return (Criteria) this;
        }

        public Criteria andSecondbatchnumberIn(List<String> values) {
            addCriterion("SecondBatchNumber in", values, "secondbatchnumber");
            return (Criteria) this;
        }

        public Criteria andSecondbatchnumberNotIn(List<String> values) {
            addCriterion("SecondBatchNumber not in", values, "secondbatchnumber");
            return (Criteria) this;
        }

        public Criteria andSecondbatchnumberBetween(String value1, String value2) {
            addCriterion("SecondBatchNumber between", value1, value2, "secondbatchnumber");
            return (Criteria) this;
        }

        public Criteria andSecondbatchnumberNotBetween(String value1, String value2) {
            addCriterion("SecondBatchNumber not between", value1, value2, "secondbatchnumber");
            return (Criteria) this;
        }

        public Criteria andSerialnumberIdIsNull() {
            addCriterion("SerialNumber_ID is null");
            return (Criteria) this;
        }

        public Criteria andSerialnumberIdIsNotNull() {
            addCriterion("SerialNumber_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSerialnumberIdEqualTo(Integer value) {
            addCriterion("SerialNumber_ID =", value, "serialnumberId");
            return (Criteria) this;
        }

        public Criteria andSerialnumberIdNotEqualTo(Integer value) {
            addCriterion("SerialNumber_ID <>", value, "serialnumberId");
            return (Criteria) this;
        }

        public Criteria andSerialnumberIdGreaterThan(Integer value) {
            addCriterion("SerialNumber_ID >", value, "serialnumberId");
            return (Criteria) this;
        }

        public Criteria andSerialnumberIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SerialNumber_ID >=", value, "serialnumberId");
            return (Criteria) this;
        }

        public Criteria andSerialnumberIdLessThan(Integer value) {
            addCriterion("SerialNumber_ID <", value, "serialnumberId");
            return (Criteria) this;
        }

        public Criteria andSerialnumberIdLessThanOrEqualTo(Integer value) {
            addCriterion("SerialNumber_ID <=", value, "serialnumberId");
            return (Criteria) this;
        }

        public Criteria andSerialnumberIdIn(List<Integer> values) {
            addCriterion("SerialNumber_ID in", values, "serialnumberId");
            return (Criteria) this;
        }

        public Criteria andSerialnumberIdNotIn(List<Integer> values) {
            addCriterion("SerialNumber_ID not in", values, "serialnumberId");
            return (Criteria) this;
        }

        public Criteria andSerialnumberIdBetween(Integer value1, Integer value2) {
            addCriterion("SerialNumber_ID between", value1, value2, "serialnumberId");
            return (Criteria) this;
        }

        public Criteria andSerialnumberIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SerialNumber_ID not between", value1, value2, "serialnumberId");
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

        public Criteria andArrivalgoodsnumberIsNull() {
            addCriterion("ArrivalGoodsNumber is null");
            return (Criteria) this;
        }

        public Criteria andArrivalgoodsnumberIsNotNull() {
            addCriterion("ArrivalGoodsNumber is not null");
            return (Criteria) this;
        }

        public Criteria andArrivalgoodsnumberEqualTo(Float value) {
            addCriterion("ArrivalGoodsNumber =", value, "arrivalgoodsnumber");
            return (Criteria) this;
        }

        public Criteria andArrivalgoodsnumberNotEqualTo(Float value) {
            addCriterion("ArrivalGoodsNumber <>", value, "arrivalgoodsnumber");
            return (Criteria) this;
        }

        public Criteria andArrivalgoodsnumberGreaterThan(Float value) {
            addCriterion("ArrivalGoodsNumber >", value, "arrivalgoodsnumber");
            return (Criteria) this;
        }

        public Criteria andArrivalgoodsnumberGreaterThanOrEqualTo(Float value) {
            addCriterion("ArrivalGoodsNumber >=", value, "arrivalgoodsnumber");
            return (Criteria) this;
        }

        public Criteria andArrivalgoodsnumberLessThan(Float value) {
            addCriterion("ArrivalGoodsNumber <", value, "arrivalgoodsnumber");
            return (Criteria) this;
        }

        public Criteria andArrivalgoodsnumberLessThanOrEqualTo(Float value) {
            addCriterion("ArrivalGoodsNumber <=", value, "arrivalgoodsnumber");
            return (Criteria) this;
        }

        public Criteria andArrivalgoodsnumberIn(List<Float> values) {
            addCriterion("ArrivalGoodsNumber in", values, "arrivalgoodsnumber");
            return (Criteria) this;
        }

        public Criteria andArrivalgoodsnumberNotIn(List<Float> values) {
            addCriterion("ArrivalGoodsNumber not in", values, "arrivalgoodsnumber");
            return (Criteria) this;
        }

        public Criteria andArrivalgoodsnumberBetween(Float value1, Float value2) {
            addCriterion("ArrivalGoodsNumber between", value1, value2, "arrivalgoodsnumber");
            return (Criteria) this;
        }

        public Criteria andArrivalgoodsnumberNotBetween(Float value1, Float value2) {
            addCriterion("ArrivalGoodsNumber not between", value1, value2, "arrivalgoodsnumber");
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

        public Criteria andBasicunitIsNull() {
            addCriterion("BasicUnit is null");
            return (Criteria) this;
        }

        public Criteria andBasicunitIsNotNull() {
            addCriterion("BasicUnit is not null");
            return (Criteria) this;
        }

        public Criteria andBasicunitEqualTo(String value) {
            addCriterion("BasicUnit =", value, "basicunit");
            return (Criteria) this;
        }

        public Criteria andBasicunitNotEqualTo(String value) {
            addCriterion("BasicUnit <>", value, "basicunit");
            return (Criteria) this;
        }

        public Criteria andBasicunitGreaterThan(String value) {
            addCriterion("BasicUnit >", value, "basicunit");
            return (Criteria) this;
        }

        public Criteria andBasicunitGreaterThanOrEqualTo(String value) {
            addCriterion("BasicUnit >=", value, "basicunit");
            return (Criteria) this;
        }

        public Criteria andBasicunitLessThan(String value) {
            addCriterion("BasicUnit <", value, "basicunit");
            return (Criteria) this;
        }

        public Criteria andBasicunitLessThanOrEqualTo(String value) {
            addCriterion("BasicUnit <=", value, "basicunit");
            return (Criteria) this;
        }

        public Criteria andBasicunitLike(String value) {
            addCriterion("BasicUnit like", value, "basicunit");
            return (Criteria) this;
        }

        public Criteria andBasicunitNotLike(String value) {
            addCriterion("BasicUnit not like", value, "basicunit");
            return (Criteria) this;
        }

        public Criteria andBasicunitIn(List<String> values) {
            addCriterion("BasicUnit in", values, "basicunit");
            return (Criteria) this;
        }

        public Criteria andBasicunitNotIn(List<String> values) {
            addCriterion("BasicUnit not in", values, "basicunit");
            return (Criteria) this;
        }

        public Criteria andBasicunitBetween(String value1, String value2) {
            addCriterion("BasicUnit between", value1, value2, "basicunit");
            return (Criteria) this;
        }

        public Criteria andBasicunitNotBetween(String value1, String value2) {
            addCriterion("BasicUnit not between", value1, value2, "basicunit");
            return (Criteria) this;
        }

        public Criteria andPackingunitIsNull() {
            addCriterion("PackingUnit is null");
            return (Criteria) this;
        }

        public Criteria andPackingunitIsNotNull() {
            addCriterion("PackingUnit is not null");
            return (Criteria) this;
        }

        public Criteria andPackingunitEqualTo(String value) {
            addCriterion("PackingUnit =", value, "packingunit");
            return (Criteria) this;
        }

        public Criteria andPackingunitNotEqualTo(String value) {
            addCriterion("PackingUnit <>", value, "packingunit");
            return (Criteria) this;
        }

        public Criteria andPackingunitGreaterThan(String value) {
            addCriterion("PackingUnit >", value, "packingunit");
            return (Criteria) this;
        }

        public Criteria andPackingunitGreaterThanOrEqualTo(String value) {
            addCriterion("PackingUnit >=", value, "packingunit");
            return (Criteria) this;
        }

        public Criteria andPackingunitLessThan(String value) {
            addCriterion("PackingUnit <", value, "packingunit");
            return (Criteria) this;
        }

        public Criteria andPackingunitLessThanOrEqualTo(String value) {
            addCriterion("PackingUnit <=", value, "packingunit");
            return (Criteria) this;
        }

        public Criteria andPackingunitLike(String value) {
            addCriterion("PackingUnit like", value, "packingunit");
            return (Criteria) this;
        }

        public Criteria andPackingunitNotLike(String value) {
            addCriterion("PackingUnit not like", value, "packingunit");
            return (Criteria) this;
        }

        public Criteria andPackingunitIn(List<String> values) {
            addCriterion("PackingUnit in", values, "packingunit");
            return (Criteria) this;
        }

        public Criteria andPackingunitNotIn(List<String> values) {
            addCriterion("PackingUnit not in", values, "packingunit");
            return (Criteria) this;
        }

        public Criteria andPackingunitBetween(String value1, String value2) {
            addCriterion("PackingUnit between", value1, value2, "packingunit");
            return (Criteria) this;
        }

        public Criteria andPackingunitNotBetween(String value1, String value2) {
            addCriterion("PackingUnit not between", value1, value2, "packingunit");
            return (Criteria) this;
        }

        public Criteria andConversionrateIsNull() {
            addCriterion("ConversionRate is null");
            return (Criteria) this;
        }

        public Criteria andConversionrateIsNotNull() {
            addCriterion("ConversionRate is not null");
            return (Criteria) this;
        }

        public Criteria andConversionrateEqualTo(Float value) {
            addCriterion("ConversionRate =", value, "conversionrate");
            return (Criteria) this;
        }

        public Criteria andConversionrateNotEqualTo(Float value) {
            addCriterion("ConversionRate <>", value, "conversionrate");
            return (Criteria) this;
        }

        public Criteria andConversionrateGreaterThan(Float value) {
            addCriterion("ConversionRate >", value, "conversionrate");
            return (Criteria) this;
        }

        public Criteria andConversionrateGreaterThanOrEqualTo(Float value) {
            addCriterion("ConversionRate >=", value, "conversionrate");
            return (Criteria) this;
        }

        public Criteria andConversionrateLessThan(Float value) {
            addCriterion("ConversionRate <", value, "conversionrate");
            return (Criteria) this;
        }

        public Criteria andConversionrateLessThanOrEqualTo(Float value) {
            addCriterion("ConversionRate <=", value, "conversionrate");
            return (Criteria) this;
        }

        public Criteria andConversionrateIn(List<Float> values) {
            addCriterion("ConversionRate in", values, "conversionrate");
            return (Criteria) this;
        }

        public Criteria andConversionrateNotIn(List<Float> values) {
            addCriterion("ConversionRate not in", values, "conversionrate");
            return (Criteria) this;
        }

        public Criteria andConversionrateBetween(Float value1, Float value2) {
            addCriterion("ConversionRate between", value1, value2, "conversionrate");
            return (Criteria) this;
        }

        public Criteria andConversionrateNotBetween(Float value1, Float value2) {
            addCriterion("ConversionRate not between", value1, value2, "conversionrate");
            return (Criteria) this;
        }

        public Criteria andFactoryIsNull() {
            addCriterion("Factory is null");
            return (Criteria) this;
        }

        public Criteria andFactoryIsNotNull() {
            addCriterion("Factory is not null");
            return (Criteria) this;
        }

        public Criteria andFactoryEqualTo(String value) {
            addCriterion("Factory =", value, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryNotEqualTo(String value) {
            addCriterion("Factory <>", value, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryGreaterThan(String value) {
            addCriterion("Factory >", value, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryGreaterThanOrEqualTo(String value) {
            addCriterion("Factory >=", value, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryLessThan(String value) {
            addCriterion("Factory <", value, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryLessThanOrEqualTo(String value) {
            addCriterion("Factory <=", value, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryLike(String value) {
            addCriterion("Factory like", value, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryNotLike(String value) {
            addCriterion("Factory not like", value, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryIn(List<String> values) {
            addCriterion("Factory in", values, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryNotIn(List<String> values) {
            addCriterion("Factory not in", values, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryBetween(String value1, String value2) {
            addCriterion("Factory between", value1, value2, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryNotBetween(String value1, String value2) {
            addCriterion("Factory not between", value1, value2, "factory");
            return (Criteria) this;
        }

        public Criteria andOriginIsNull() {
            addCriterion("Origin is null");
            return (Criteria) this;
        }

        public Criteria andOriginIsNotNull() {
            addCriterion("Origin is not null");
            return (Criteria) this;
        }

        public Criteria andOriginEqualTo(String value) {
            addCriterion("Origin =", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginNotEqualTo(String value) {
            addCriterion("Origin <>", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginGreaterThan(String value) {
            addCriterion("Origin >", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginGreaterThanOrEqualTo(String value) {
            addCriterion("Origin >=", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginLessThan(String value) {
            addCriterion("Origin <", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginLessThanOrEqualTo(String value) {
            addCriterion("Origin <=", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginLike(String value) {
            addCriterion("Origin like", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginNotLike(String value) {
            addCriterion("Origin not like", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginIn(List<String> values) {
            addCriterion("Origin in", values, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginNotIn(List<String> values) {
            addCriterion("Origin not in", values, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginBetween(String value1, String value2) {
            addCriterion("Origin between", value1, value2, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginNotBetween(String value1, String value2) {
            addCriterion("Origin not between", value1, value2, "origin");
            return (Criteria) this;
        }

        public Criteria andGoodsbarcodeIsNull() {
            addCriterion("GoodsBarCode is null");
            return (Criteria) this;
        }

        public Criteria andGoodsbarcodeIsNotNull() {
            addCriterion("GoodsBarCode is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsbarcodeEqualTo(String value) {
            addCriterion("GoodsBarCode =", value, "goodsbarcode");
            return (Criteria) this;
        }

        public Criteria andGoodsbarcodeNotEqualTo(String value) {
            addCriterion("GoodsBarCode <>", value, "goodsbarcode");
            return (Criteria) this;
        }

        public Criteria andGoodsbarcodeGreaterThan(String value) {
            addCriterion("GoodsBarCode >", value, "goodsbarcode");
            return (Criteria) this;
        }

        public Criteria andGoodsbarcodeGreaterThanOrEqualTo(String value) {
            addCriterion("GoodsBarCode >=", value, "goodsbarcode");
            return (Criteria) this;
        }

        public Criteria andGoodsbarcodeLessThan(String value) {
            addCriterion("GoodsBarCode <", value, "goodsbarcode");
            return (Criteria) this;
        }

        public Criteria andGoodsbarcodeLessThanOrEqualTo(String value) {
            addCriterion("GoodsBarCode <=", value, "goodsbarcode");
            return (Criteria) this;
        }

        public Criteria andGoodsbarcodeLike(String value) {
            addCriterion("GoodsBarCode like", value, "goodsbarcode");
            return (Criteria) this;
        }

        public Criteria andGoodsbarcodeNotLike(String value) {
            addCriterion("GoodsBarCode not like", value, "goodsbarcode");
            return (Criteria) this;
        }

        public Criteria andGoodsbarcodeIn(List<String> values) {
            addCriterion("GoodsBarCode in", values, "goodsbarcode");
            return (Criteria) this;
        }

        public Criteria andGoodsbarcodeNotIn(List<String> values) {
            addCriterion("GoodsBarCode not in", values, "goodsbarcode");
            return (Criteria) this;
        }

        public Criteria andGoodsbarcodeBetween(String value1, String value2) {
            addCriterion("GoodsBarCode between", value1, value2, "goodsbarcode");
            return (Criteria) this;
        }

        public Criteria andGoodsbarcodeNotBetween(String value1, String value2) {
            addCriterion("GoodsBarCode not between", value1, value2, "goodsbarcode");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("Weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("Weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(Float value) {
            addCriterion("Weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(Float value) {
            addCriterion("Weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(Float value) {
            addCriterion("Weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(Float value) {
            addCriterion("Weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(Float value) {
            addCriterion("Weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(Float value) {
            addCriterion("Weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<Float> values) {
            addCriterion("Weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<Float> values) {
            addCriterion("Weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(Float value1, Float value2) {
            addCriterion("Weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(Float value1, Float value2) {
            addCriterion("Weight not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andNetweightIsNull() {
            addCriterion("NetWeight is null");
            return (Criteria) this;
        }

        public Criteria andNetweightIsNotNull() {
            addCriterion("NetWeight is not null");
            return (Criteria) this;
        }

        public Criteria andNetweightEqualTo(Float value) {
            addCriterion("NetWeight =", value, "netweight");
            return (Criteria) this;
        }

        public Criteria andNetweightNotEqualTo(Float value) {
            addCriterion("NetWeight <>", value, "netweight");
            return (Criteria) this;
        }

        public Criteria andNetweightGreaterThan(Float value) {
            addCriterion("NetWeight >", value, "netweight");
            return (Criteria) this;
        }

        public Criteria andNetweightGreaterThanOrEqualTo(Float value) {
            addCriterion("NetWeight >=", value, "netweight");
            return (Criteria) this;
        }

        public Criteria andNetweightLessThan(Float value) {
            addCriterion("NetWeight <", value, "netweight");
            return (Criteria) this;
        }

        public Criteria andNetweightLessThanOrEqualTo(Float value) {
            addCriterion("NetWeight <=", value, "netweight");
            return (Criteria) this;
        }

        public Criteria andNetweightIn(List<Float> values) {
            addCriterion("NetWeight in", values, "netweight");
            return (Criteria) this;
        }

        public Criteria andNetweightNotIn(List<Float> values) {
            addCriterion("NetWeight not in", values, "netweight");
            return (Criteria) this;
        }

        public Criteria andNetweightBetween(Float value1, Float value2) {
            addCriterion("NetWeight between", value1, value2, "netweight");
            return (Criteria) this;
        }

        public Criteria andNetweightNotBetween(Float value1, Float value2) {
            addCriterion("NetWeight not between", value1, value2, "netweight");
            return (Criteria) this;
        }

        public Criteria andVolumeIsNull() {
            addCriterion("Volume is null");
            return (Criteria) this;
        }

        public Criteria andVolumeIsNotNull() {
            addCriterion("Volume is not null");
            return (Criteria) this;
        }

        public Criteria andVolumeEqualTo(Float value) {
            addCriterion("Volume =", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotEqualTo(Float value) {
            addCriterion("Volume <>", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeGreaterThan(Float value) {
            addCriterion("Volume >", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeGreaterThanOrEqualTo(Float value) {
            addCriterion("Volume >=", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeLessThan(Float value) {
            addCriterion("Volume <", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeLessThanOrEqualTo(Float value) {
            addCriterion("Volume <=", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeIn(List<Float> values) {
            addCriterion("Volume in", values, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotIn(List<Float> values) {
            addCriterion("Volume not in", values, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeBetween(Float value1, Float value2) {
            addCriterion("Volume between", value1, value2, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotBetween(Float value1, Float value2) {
            addCriterion("Volume not between", value1, value2, "volume");
            return (Criteria) this;
        }

        public Criteria andPayabletonIsNull() {
            addCriterion("PayableTon is null");
            return (Criteria) this;
        }

        public Criteria andPayabletonIsNotNull() {
            addCriterion("PayableTon is not null");
            return (Criteria) this;
        }

        public Criteria andPayabletonEqualTo(Float value) {
            addCriterion("PayableTon =", value, "payableton");
            return (Criteria) this;
        }

        public Criteria andPayabletonNotEqualTo(Float value) {
            addCriterion("PayableTon <>", value, "payableton");
            return (Criteria) this;
        }

        public Criteria andPayabletonGreaterThan(Float value) {
            addCriterion("PayableTon >", value, "payableton");
            return (Criteria) this;
        }

        public Criteria andPayabletonGreaterThanOrEqualTo(Float value) {
            addCriterion("PayableTon >=", value, "payableton");
            return (Criteria) this;
        }

        public Criteria andPayabletonLessThan(Float value) {
            addCriterion("PayableTon <", value, "payableton");
            return (Criteria) this;
        }

        public Criteria andPayabletonLessThanOrEqualTo(Float value) {
            addCriterion("PayableTon <=", value, "payableton");
            return (Criteria) this;
        }

        public Criteria andPayabletonIn(List<Float> values) {
            addCriterion("PayableTon in", values, "payableton");
            return (Criteria) this;
        }

        public Criteria andPayabletonNotIn(List<Float> values) {
            addCriterion("PayableTon not in", values, "payableton");
            return (Criteria) this;
        }

        public Criteria andPayabletonBetween(Float value1, Float value2) {
            addCriterion("PayableTon between", value1, value2, "payableton");
            return (Criteria) this;
        }

        public Criteria andPayabletonNotBetween(Float value1, Float value2) {
            addCriterion("PayableTon not between", value1, value2, "payableton");
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

        public Criteria andHslbmIsNull() {
            addCriterion("HSLBM is null");
            return (Criteria) this;
        }

        public Criteria andHslbmIsNotNull() {
            addCriterion("HSLBM is not null");
            return (Criteria) this;
        }

        public Criteria andHslbmEqualTo(String value) {
            addCriterion("HSLBM =", value, "hslbm");
            return (Criteria) this;
        }

        public Criteria andHslbmNotEqualTo(String value) {
            addCriterion("HSLBM <>", value, "hslbm");
            return (Criteria) this;
        }

        public Criteria andHslbmGreaterThan(String value) {
            addCriterion("HSLBM >", value, "hslbm");
            return (Criteria) this;
        }

        public Criteria andHslbmGreaterThanOrEqualTo(String value) {
            addCriterion("HSLBM >=", value, "hslbm");
            return (Criteria) this;
        }

        public Criteria andHslbmLessThan(String value) {
            addCriterion("HSLBM <", value, "hslbm");
            return (Criteria) this;
        }

        public Criteria andHslbmLessThanOrEqualTo(String value) {
            addCriterion("HSLBM <=", value, "hslbm");
            return (Criteria) this;
        }

        public Criteria andHslbmLike(String value) {
            addCriterion("HSLBM like", value, "hslbm");
            return (Criteria) this;
        }

        public Criteria andHslbmNotLike(String value) {
            addCriterion("HSLBM not like", value, "hslbm");
            return (Criteria) this;
        }

        public Criteria andHslbmIn(List<String> values) {
            addCriterion("HSLBM in", values, "hslbm");
            return (Criteria) this;
        }

        public Criteria andHslbmNotIn(List<String> values) {
            addCriterion("HSLBM not in", values, "hslbm");
            return (Criteria) this;
        }

        public Criteria andHslbmBetween(String value1, String value2) {
            addCriterion("HSLBM between", value1, value2, "hslbm");
            return (Criteria) this;
        }

        public Criteria andHslbmNotBetween(String value1, String value2) {
            addCriterion("HSLBM not between", value1, value2, "hslbm");
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
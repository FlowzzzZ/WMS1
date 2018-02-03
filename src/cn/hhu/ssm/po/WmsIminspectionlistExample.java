package cn.hhu.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WmsIminspectionlistExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WmsIminspectionlistExample() {
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

        public Criteria andIminspectionlistsIdIsNull() {
            addCriterion("IMInspectionlists_ID is null");
            return (Criteria) this;
        }

        public Criteria andIminspectionlistsIdIsNotNull() {
            addCriterion("IMInspectionlists_ID is not null");
            return (Criteria) this;
        }

        public Criteria andIminspectionlistsIdEqualTo(Integer value) {
            addCriterion("IMInspectionlists_ID =", value, "iminspectionlistsId");
            return (Criteria) this;
        }

        public Criteria andIminspectionlistsIdNotEqualTo(Integer value) {
            addCriterion("IMInspectionlists_ID <>", value, "iminspectionlistsId");
            return (Criteria) this;
        }

        public Criteria andIminspectionlistsIdGreaterThan(Integer value) {
            addCriterion("IMInspectionlists_ID >", value, "iminspectionlistsId");
            return (Criteria) this;
        }

        public Criteria andIminspectionlistsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("IMInspectionlists_ID >=", value, "iminspectionlistsId");
            return (Criteria) this;
        }

        public Criteria andIminspectionlistsIdLessThan(Integer value) {
            addCriterion("IMInspectionlists_ID <", value, "iminspectionlistsId");
            return (Criteria) this;
        }

        public Criteria andIminspectionlistsIdLessThanOrEqualTo(Integer value) {
            addCriterion("IMInspectionlists_ID <=", value, "iminspectionlistsId");
            return (Criteria) this;
        }

        public Criteria andIminspectionlistsIdIn(List<Integer> values) {
            addCriterion("IMInspectionlists_ID in", values, "iminspectionlistsId");
            return (Criteria) this;
        }

        public Criteria andIminspectionlistsIdNotIn(List<Integer> values) {
            addCriterion("IMInspectionlists_ID not in", values, "iminspectionlistsId");
            return (Criteria) this;
        }

        public Criteria andIminspectionlistsIdBetween(Integer value1, Integer value2) {
            addCriterion("IMInspectionlists_ID between", value1, value2, "iminspectionlistsId");
            return (Criteria) this;
        }

        public Criteria andIminspectionlistsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("IMInspectionlists_ID not between", value1, value2, "iminspectionlistsId");
            return (Criteria) this;
        }

        public Criteria andIminspectionlistsNumberIsNull() {
            addCriterion("IMInspectionlists_Number is null");
            return (Criteria) this;
        }

        public Criteria andIminspectionlistsNumberIsNotNull() {
            addCriterion("IMInspectionlists_Number is not null");
            return (Criteria) this;
        }

        public Criteria andIminspectionlistsNumberEqualTo(String value) {
            addCriterion("IMInspectionlists_Number =", value, "iminspectionlistsNumber");
            return (Criteria) this;
        }

        public Criteria andIminspectionlistsNumberNotEqualTo(String value) {
            addCriterion("IMInspectionlists_Number <>", value, "iminspectionlistsNumber");
            return (Criteria) this;
        }

        public Criteria andIminspectionlistsNumberGreaterThan(String value) {
            addCriterion("IMInspectionlists_Number >", value, "iminspectionlistsNumber");
            return (Criteria) this;
        }

        public Criteria andIminspectionlistsNumberGreaterThanOrEqualTo(String value) {
            addCriterion("IMInspectionlists_Number >=", value, "iminspectionlistsNumber");
            return (Criteria) this;
        }

        public Criteria andIminspectionlistsNumberLessThan(String value) {
            addCriterion("IMInspectionlists_Number <", value, "iminspectionlistsNumber");
            return (Criteria) this;
        }

        public Criteria andIminspectionlistsNumberLessThanOrEqualTo(String value) {
            addCriterion("IMInspectionlists_Number <=", value, "iminspectionlistsNumber");
            return (Criteria) this;
        }

        public Criteria andIminspectionlistsNumberLike(String value) {
            addCriterion("IMInspectionlists_Number like", value, "iminspectionlistsNumber");
            return (Criteria) this;
        }

        public Criteria andIminspectionlistsNumberNotLike(String value) {
            addCriterion("IMInspectionlists_Number not like", value, "iminspectionlistsNumber");
            return (Criteria) this;
        }

        public Criteria andIminspectionlistsNumberIn(List<String> values) {
            addCriterion("IMInspectionlists_Number in", values, "iminspectionlistsNumber");
            return (Criteria) this;
        }

        public Criteria andIminspectionlistsNumberNotIn(List<String> values) {
            addCriterion("IMInspectionlists_Number not in", values, "iminspectionlistsNumber");
            return (Criteria) this;
        }

        public Criteria andIminspectionlistsNumberBetween(String value1, String value2) {
            addCriterion("IMInspectionlists_Number between", value1, value2, "iminspectionlistsNumber");
            return (Criteria) this;
        }

        public Criteria andIminspectionlistsNumberNotBetween(String value1, String value2) {
            addCriterion("IMInspectionlists_Number not between", value1, value2, "iminspectionlistsNumber");
            return (Criteria) this;
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

        public Criteria andNumberIsNull() {
            addCriterion("Number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("Number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(Float value) {
            addCriterion("Number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(Float value) {
            addCriterion("Number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(Float value) {
            addCriterion("Number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(Float value) {
            addCriterion("Number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(Float value) {
            addCriterion("Number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(Float value) {
            addCriterion("Number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<Float> values) {
            addCriterion("Number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<Float> values) {
            addCriterion("Number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(Float value1, Float value2) {
            addCriterion("Number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(Float value1, Float value2) {
            addCriterion("Number not between", value1, value2, "number");
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

        public Criteria andInspectionNumberIsNull() {
            addCriterion("Inspection_Number is null");
            return (Criteria) this;
        }

        public Criteria andInspectionNumberIsNotNull() {
            addCriterion("Inspection_Number is not null");
            return (Criteria) this;
        }

        public Criteria andInspectionNumberEqualTo(Float value) {
            addCriterion("Inspection_Number =", value, "inspectionNumber");
            return (Criteria) this;
        }

        public Criteria andInspectionNumberNotEqualTo(Float value) {
            addCriterion("Inspection_Number <>", value, "inspectionNumber");
            return (Criteria) this;
        }

        public Criteria andInspectionNumberGreaterThan(Float value) {
            addCriterion("Inspection_Number >", value, "inspectionNumber");
            return (Criteria) this;
        }

        public Criteria andInspectionNumberGreaterThanOrEqualTo(Float value) {
            addCriterion("Inspection_Number >=", value, "inspectionNumber");
            return (Criteria) this;
        }

        public Criteria andInspectionNumberLessThan(Float value) {
            addCriterion("Inspection_Number <", value, "inspectionNumber");
            return (Criteria) this;
        }

        public Criteria andInspectionNumberLessThanOrEqualTo(Float value) {
            addCriterion("Inspection_Number <=", value, "inspectionNumber");
            return (Criteria) this;
        }

        public Criteria andInspectionNumberIn(List<Float> values) {
            addCriterion("Inspection_Number in", values, "inspectionNumber");
            return (Criteria) this;
        }

        public Criteria andInspectionNumberNotIn(List<Float> values) {
            addCriterion("Inspection_Number not in", values, "inspectionNumber");
            return (Criteria) this;
        }

        public Criteria andInspectionNumberBetween(Float value1, Float value2) {
            addCriterion("Inspection_Number between", value1, value2, "inspectionNumber");
            return (Criteria) this;
        }

        public Criteria andInspectionNumberNotBetween(Float value1, Float value2) {
            addCriterion("Inspection_Number not between", value1, value2, "inspectionNumber");
            return (Criteria) this;
        }

        public Criteria andInspectionresultIsNull() {
            addCriterion("InspectionResult is null");
            return (Criteria) this;
        }

        public Criteria andInspectionresultIsNotNull() {
            addCriterion("InspectionResult is not null");
            return (Criteria) this;
        }

        public Criteria andInspectionresultEqualTo(String value) {
            addCriterion("InspectionResult =", value, "inspectionresult");
            return (Criteria) this;
        }

        public Criteria andInspectionresultNotEqualTo(String value) {
            addCriterion("InspectionResult <>", value, "inspectionresult");
            return (Criteria) this;
        }

        public Criteria andInspectionresultGreaterThan(String value) {
            addCriterion("InspectionResult >", value, "inspectionresult");
            return (Criteria) this;
        }

        public Criteria andInspectionresultGreaterThanOrEqualTo(String value) {
            addCriterion("InspectionResult >=", value, "inspectionresult");
            return (Criteria) this;
        }

        public Criteria andInspectionresultLessThan(String value) {
            addCriterion("InspectionResult <", value, "inspectionresult");
            return (Criteria) this;
        }

        public Criteria andInspectionresultLessThanOrEqualTo(String value) {
            addCriterion("InspectionResult <=", value, "inspectionresult");
            return (Criteria) this;
        }

        public Criteria andInspectionresultLike(String value) {
            addCriterion("InspectionResult like", value, "inspectionresult");
            return (Criteria) this;
        }

        public Criteria andInspectionresultNotLike(String value) {
            addCriterion("InspectionResult not like", value, "inspectionresult");
            return (Criteria) this;
        }

        public Criteria andInspectionresultIn(List<String> values) {
            addCriterion("InspectionResult in", values, "inspectionresult");
            return (Criteria) this;
        }

        public Criteria andInspectionresultNotIn(List<String> values) {
            addCriterion("InspectionResult not in", values, "inspectionresult");
            return (Criteria) this;
        }

        public Criteria andInspectionresultBetween(String value1, String value2) {
            addCriterion("InspectionResult between", value1, value2, "inspectionresult");
            return (Criteria) this;
        }

        public Criteria andInspectionresultNotBetween(String value1, String value2) {
            addCriterion("InspectionResult not between", value1, value2, "inspectionresult");
            return (Criteria) this;
        }

        public Criteria andInspectionmanIsNull() {
            addCriterion("InspectionMan is null");
            return (Criteria) this;
        }

        public Criteria andInspectionmanIsNotNull() {
            addCriterion("InspectionMan is not null");
            return (Criteria) this;
        }

        public Criteria andInspectionmanEqualTo(String value) {
            addCriterion("InspectionMan =", value, "inspectionman");
            return (Criteria) this;
        }

        public Criteria andInspectionmanNotEqualTo(String value) {
            addCriterion("InspectionMan <>", value, "inspectionman");
            return (Criteria) this;
        }

        public Criteria andInspectionmanGreaterThan(String value) {
            addCriterion("InspectionMan >", value, "inspectionman");
            return (Criteria) this;
        }

        public Criteria andInspectionmanGreaterThanOrEqualTo(String value) {
            addCriterion("InspectionMan >=", value, "inspectionman");
            return (Criteria) this;
        }

        public Criteria andInspectionmanLessThan(String value) {
            addCriterion("InspectionMan <", value, "inspectionman");
            return (Criteria) this;
        }

        public Criteria andInspectionmanLessThanOrEqualTo(String value) {
            addCriterion("InspectionMan <=", value, "inspectionman");
            return (Criteria) this;
        }

        public Criteria andInspectionmanLike(String value) {
            addCriterion("InspectionMan like", value, "inspectionman");
            return (Criteria) this;
        }

        public Criteria andInspectionmanNotLike(String value) {
            addCriterion("InspectionMan not like", value, "inspectionman");
            return (Criteria) this;
        }

        public Criteria andInspectionmanIn(List<String> values) {
            addCriterion("InspectionMan in", values, "inspectionman");
            return (Criteria) this;
        }

        public Criteria andInspectionmanNotIn(List<String> values) {
            addCriterion("InspectionMan not in", values, "inspectionman");
            return (Criteria) this;
        }

        public Criteria andInspectionmanBetween(String value1, String value2) {
            addCriterion("InspectionMan between", value1, value2, "inspectionman");
            return (Criteria) this;
        }

        public Criteria andInspectionmanNotBetween(String value1, String value2) {
            addCriterion("InspectionMan not between", value1, value2, "inspectionman");
            return (Criteria) this;
        }

        public Criteria andInspectionremarkIsNull() {
            addCriterion("InspectionRemark is null");
            return (Criteria) this;
        }

        public Criteria andInspectionremarkIsNotNull() {
            addCriterion("InspectionRemark is not null");
            return (Criteria) this;
        }

        public Criteria andInspectionremarkEqualTo(String value) {
            addCriterion("InspectionRemark =", value, "inspectionremark");
            return (Criteria) this;
        }

        public Criteria andInspectionremarkNotEqualTo(String value) {
            addCriterion("InspectionRemark <>", value, "inspectionremark");
            return (Criteria) this;
        }

        public Criteria andInspectionremarkGreaterThan(String value) {
            addCriterion("InspectionRemark >", value, "inspectionremark");
            return (Criteria) this;
        }

        public Criteria andInspectionremarkGreaterThanOrEqualTo(String value) {
            addCriterion("InspectionRemark >=", value, "inspectionremark");
            return (Criteria) this;
        }

        public Criteria andInspectionremarkLessThan(String value) {
            addCriterion("InspectionRemark <", value, "inspectionremark");
            return (Criteria) this;
        }

        public Criteria andInspectionremarkLessThanOrEqualTo(String value) {
            addCriterion("InspectionRemark <=", value, "inspectionremark");
            return (Criteria) this;
        }

        public Criteria andInspectionremarkLike(String value) {
            addCriterion("InspectionRemark like", value, "inspectionremark");
            return (Criteria) this;
        }

        public Criteria andInspectionremarkNotLike(String value) {
            addCriterion("InspectionRemark not like", value, "inspectionremark");
            return (Criteria) this;
        }

        public Criteria andInspectionremarkIn(List<String> values) {
            addCriterion("InspectionRemark in", values, "inspectionremark");
            return (Criteria) this;
        }

        public Criteria andInspectionremarkNotIn(List<String> values) {
            addCriterion("InspectionRemark not in", values, "inspectionremark");
            return (Criteria) this;
        }

        public Criteria andInspectionremarkBetween(String value1, String value2) {
            addCriterion("InspectionRemark between", value1, value2, "inspectionremark");
            return (Criteria) this;
        }

        public Criteria andInspectionremarkNotBetween(String value1, String value2) {
            addCriterion("InspectionRemark not between", value1, value2, "inspectionremark");
            return (Criteria) this;
        }

        public Criteria andInspectiondateIsNull() {
            addCriterion("InspectionDate is null");
            return (Criteria) this;
        }

        public Criteria andInspectiondateIsNotNull() {
            addCriterion("InspectionDate is not null");
            return (Criteria) this;
        }

        public Criteria andInspectiondateEqualTo(Date value) {
            addCriterion("InspectionDate =", value, "inspectiondate");
            return (Criteria) this;
        }

        public Criteria andInspectiondateNotEqualTo(Date value) {
            addCriterion("InspectionDate <>", value, "inspectiondate");
            return (Criteria) this;
        }

        public Criteria andInspectiondateGreaterThan(Date value) {
            addCriterion("InspectionDate >", value, "inspectiondate");
            return (Criteria) this;
        }

        public Criteria andInspectiondateGreaterThanOrEqualTo(Date value) {
            addCriterion("InspectionDate >=", value, "inspectiondate");
            return (Criteria) this;
        }

        public Criteria andInspectiondateLessThan(Date value) {
            addCriterion("InspectionDate <", value, "inspectiondate");
            return (Criteria) this;
        }

        public Criteria andInspectiondateLessThanOrEqualTo(Date value) {
            addCriterion("InspectionDate <=", value, "inspectiondate");
            return (Criteria) this;
        }

        public Criteria andInspectiondateIn(List<Date> values) {
            addCriterion("InspectionDate in", values, "inspectiondate");
            return (Criteria) this;
        }

        public Criteria andInspectiondateNotIn(List<Date> values) {
            addCriterion("InspectionDate not in", values, "inspectiondate");
            return (Criteria) this;
        }

        public Criteria andInspectiondateBetween(Date value1, Date value2) {
            addCriterion("InspectionDate between", value1, value2, "inspectiondate");
            return (Criteria) this;
        }

        public Criteria andInspectiondateNotBetween(Date value1, Date value2) {
            addCriterion("InspectionDate not between", value1, value2, "inspectiondate");
            return (Criteria) this;
        }

        public Criteria andInspectioncountIsNull() {
            addCriterion("InspectionCount is null");
            return (Criteria) this;
        }

        public Criteria andInspectioncountIsNotNull() {
            addCriterion("InspectionCount is not null");
            return (Criteria) this;
        }

        public Criteria andInspectioncountEqualTo(Float value) {
            addCriterion("InspectionCount =", value, "inspectioncount");
            return (Criteria) this;
        }

        public Criteria andInspectioncountNotEqualTo(Float value) {
            addCriterion("InspectionCount <>", value, "inspectioncount");
            return (Criteria) this;
        }

        public Criteria andInspectioncountGreaterThan(Float value) {
            addCriterion("InspectionCount >", value, "inspectioncount");
            return (Criteria) this;
        }

        public Criteria andInspectioncountGreaterThanOrEqualTo(Float value) {
            addCriterion("InspectionCount >=", value, "inspectioncount");
            return (Criteria) this;
        }

        public Criteria andInspectioncountLessThan(Float value) {
            addCriterion("InspectionCount <", value, "inspectioncount");
            return (Criteria) this;
        }

        public Criteria andInspectioncountLessThanOrEqualTo(Float value) {
            addCriterion("InspectionCount <=", value, "inspectioncount");
            return (Criteria) this;
        }

        public Criteria andInspectioncountIn(List<Float> values) {
            addCriterion("InspectionCount in", values, "inspectioncount");
            return (Criteria) this;
        }

        public Criteria andInspectioncountNotIn(List<Float> values) {
            addCriterion("InspectionCount not in", values, "inspectioncount");
            return (Criteria) this;
        }

        public Criteria andInspectioncountBetween(Float value1, Float value2) {
            addCriterion("InspectionCount between", value1, value2, "inspectioncount");
            return (Criteria) this;
        }

        public Criteria andInspectioncountNotBetween(Float value1, Float value2) {
            addCriterion("InspectionCount not between", value1, value2, "inspectioncount");
            return (Criteria) this;
        }

        public Criteria andInspectionreportIsNull() {
            addCriterion("InspectionReport is null");
            return (Criteria) this;
        }

        public Criteria andInspectionreportIsNotNull() {
            addCriterion("InspectionReport is not null");
            return (Criteria) this;
        }

        public Criteria andInspectionreportEqualTo(String value) {
            addCriterion("InspectionReport =", value, "inspectionreport");
            return (Criteria) this;
        }

        public Criteria andInspectionreportNotEqualTo(String value) {
            addCriterion("InspectionReport <>", value, "inspectionreport");
            return (Criteria) this;
        }

        public Criteria andInspectionreportGreaterThan(String value) {
            addCriterion("InspectionReport >", value, "inspectionreport");
            return (Criteria) this;
        }

        public Criteria andInspectionreportGreaterThanOrEqualTo(String value) {
            addCriterion("InspectionReport >=", value, "inspectionreport");
            return (Criteria) this;
        }

        public Criteria andInspectionreportLessThan(String value) {
            addCriterion("InspectionReport <", value, "inspectionreport");
            return (Criteria) this;
        }

        public Criteria andInspectionreportLessThanOrEqualTo(String value) {
            addCriterion("InspectionReport <=", value, "inspectionreport");
            return (Criteria) this;
        }

        public Criteria andInspectionreportLike(String value) {
            addCriterion("InspectionReport like", value, "inspectionreport");
            return (Criteria) this;
        }

        public Criteria andInspectionreportNotLike(String value) {
            addCriterion("InspectionReport not like", value, "inspectionreport");
            return (Criteria) this;
        }

        public Criteria andInspectionreportIn(List<String> values) {
            addCriterion("InspectionReport in", values, "inspectionreport");
            return (Criteria) this;
        }

        public Criteria andInspectionreportNotIn(List<String> values) {
            addCriterion("InspectionReport not in", values, "inspectionreport");
            return (Criteria) this;
        }

        public Criteria andInspectionreportBetween(String value1, String value2) {
            addCriterion("InspectionReport between", value1, value2, "inspectionreport");
            return (Criteria) this;
        }

        public Criteria andInspectionreportNotBetween(String value1, String value2) {
            addCriterion("InspectionReport not between", value1, value2, "inspectionreport");
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
package cn.hhu.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WmsExdetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WmsExdetailExample() {
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

        public Criteria andExdetailIdIsNull() {
            addCriterion("EXDetail_ID is null");
            return (Criteria) this;
        }

        public Criteria andExdetailIdIsNotNull() {
            addCriterion("EXDetail_ID is not null");
            return (Criteria) this;
        }

        public Criteria andExdetailIdEqualTo(Integer value) {
            addCriterion("EXDetail_ID =", value, "exdetailId");
            return (Criteria) this;
        }

        public Criteria andExdetailIdNotEqualTo(Integer value) {
            addCriterion("EXDetail_ID <>", value, "exdetailId");
            return (Criteria) this;
        }

        public Criteria andExdetailIdGreaterThan(Integer value) {
            addCriterion("EXDetail_ID >", value, "exdetailId");
            return (Criteria) this;
        }

        public Criteria andExdetailIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("EXDetail_ID >=", value, "exdetailId");
            return (Criteria) this;
        }

        public Criteria andExdetailIdLessThan(Integer value) {
            addCriterion("EXDetail_ID <", value, "exdetailId");
            return (Criteria) this;
        }

        public Criteria andExdetailIdLessThanOrEqualTo(Integer value) {
            addCriterion("EXDetail_ID <=", value, "exdetailId");
            return (Criteria) this;
        }

        public Criteria andExdetailIdIn(List<Integer> values) {
            addCriterion("EXDetail_ID in", values, "exdetailId");
            return (Criteria) this;
        }

        public Criteria andExdetailIdNotIn(List<Integer> values) {
            addCriterion("EXDetail_ID not in", values, "exdetailId");
            return (Criteria) this;
        }

        public Criteria andExdetailIdBetween(Integer value1, Integer value2) {
            addCriterion("EXDetail_ID between", value1, value2, "exdetailId");
            return (Criteria) this;
        }

        public Criteria andExdetailIdNotBetween(Integer value1, Integer value2) {
            addCriterion("EXDetail_ID not between", value1, value2, "exdetailId");
            return (Criteria) this;
        }

        public Criteria andExdetailNumberIsNull() {
            addCriterion("EXDetail_Number is null");
            return (Criteria) this;
        }

        public Criteria andExdetailNumberIsNotNull() {
            addCriterion("EXDetail_Number is not null");
            return (Criteria) this;
        }

        public Criteria andExdetailNumberEqualTo(String value) {
            addCriterion("EXDetail_Number =", value, "exdetailNumber");
            return (Criteria) this;
        }

        public Criteria andExdetailNumberNotEqualTo(String value) {
            addCriterion("EXDetail_Number <>", value, "exdetailNumber");
            return (Criteria) this;
        }

        public Criteria andExdetailNumberGreaterThan(String value) {
            addCriterion("EXDetail_Number >", value, "exdetailNumber");
            return (Criteria) this;
        }

        public Criteria andExdetailNumberGreaterThanOrEqualTo(String value) {
            addCriterion("EXDetail_Number >=", value, "exdetailNumber");
            return (Criteria) this;
        }

        public Criteria andExdetailNumberLessThan(String value) {
            addCriterion("EXDetail_Number <", value, "exdetailNumber");
            return (Criteria) this;
        }

        public Criteria andExdetailNumberLessThanOrEqualTo(String value) {
            addCriterion("EXDetail_Number <=", value, "exdetailNumber");
            return (Criteria) this;
        }

        public Criteria andExdetailNumberLike(String value) {
            addCriterion("EXDetail_Number like", value, "exdetailNumber");
            return (Criteria) this;
        }

        public Criteria andExdetailNumberNotLike(String value) {
            addCriterion("EXDetail_Number not like", value, "exdetailNumber");
            return (Criteria) this;
        }

        public Criteria andExdetailNumberIn(List<String> values) {
            addCriterion("EXDetail_Number in", values, "exdetailNumber");
            return (Criteria) this;
        }

        public Criteria andExdetailNumberNotIn(List<String> values) {
            addCriterion("EXDetail_Number not in", values, "exdetailNumber");
            return (Criteria) this;
        }

        public Criteria andExdetailNumberBetween(String value1, String value2) {
            addCriterion("EXDetail_Number between", value1, value2, "exdetailNumber");
            return (Criteria) this;
        }

        public Criteria andExdetailNumberNotBetween(String value1, String value2) {
            addCriterion("EXDetail_Number not between", value1, value2, "exdetailNumber");
            return (Criteria) this;
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

        public Criteria andSerialNumberIsNull() {
            addCriterion("Serial_Number is null");
            return (Criteria) this;
        }

        public Criteria andSerialNumberIsNotNull() {
            addCriterion("Serial_Number is not null");
            return (Criteria) this;
        }

        public Criteria andSerialNumberEqualTo(String value) {
            addCriterion("Serial_Number =", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNotEqualTo(String value) {
            addCriterion("Serial_Number <>", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberGreaterThan(String value) {
            addCriterion("Serial_Number >", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberGreaterThanOrEqualTo(String value) {
            addCriterion("Serial_Number >=", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberLessThan(String value) {
            addCriterion("Serial_Number <", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberLessThanOrEqualTo(String value) {
            addCriterion("Serial_Number <=", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberLike(String value) {
            addCriterion("Serial_Number like", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNotLike(String value) {
            addCriterion("Serial_Number not like", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberIn(List<String> values) {
            addCriterion("Serial_Number in", values, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNotIn(List<String> values) {
            addCriterion("Serial_Number not in", values, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberBetween(String value1, String value2) {
            addCriterion("Serial_Number between", value1, value2, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNotBetween(String value1, String value2) {
            addCriterion("Serial_Number not between", value1, value2, "serialNumber");
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

        public Criteria andExquantityIsNull() {
            addCriterion("EXQuantity is null");
            return (Criteria) this;
        }

        public Criteria andExquantityIsNotNull() {
            addCriterion("EXQuantity is not null");
            return (Criteria) this;
        }

        public Criteria andExquantityEqualTo(Float value) {
            addCriterion("EXQuantity =", value, "exquantity");
            return (Criteria) this;
        }

        public Criteria andExquantityNotEqualTo(Float value) {
            addCriterion("EXQuantity <>", value, "exquantity");
            return (Criteria) this;
        }

        public Criteria andExquantityGreaterThan(Float value) {
            addCriterion("EXQuantity >", value, "exquantity");
            return (Criteria) this;
        }

        public Criteria andExquantityGreaterThanOrEqualTo(Float value) {
            addCriterion("EXQuantity >=", value, "exquantity");
            return (Criteria) this;
        }

        public Criteria andExquantityLessThan(Float value) {
            addCriterion("EXQuantity <", value, "exquantity");
            return (Criteria) this;
        }

        public Criteria andExquantityLessThanOrEqualTo(Float value) {
            addCriterion("EXQuantity <=", value, "exquantity");
            return (Criteria) this;
        }

        public Criteria andExquantityIn(List<Float> values) {
            addCriterion("EXQuantity in", values, "exquantity");
            return (Criteria) this;
        }

        public Criteria andExquantityNotIn(List<Float> values) {
            addCriterion("EXQuantity not in", values, "exquantity");
            return (Criteria) this;
        }

        public Criteria andExquantityBetween(Float value1, Float value2) {
            addCriterion("EXQuantity between", value1, value2, "exquantity");
            return (Criteria) this;
        }

        public Criteria andExquantityNotBetween(Float value1, Float value2) {
            addCriterion("EXQuantity not between", value1, value2, "exquantity");
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

        public Criteria andGoodscodeIsNull() {
            addCriterion("GoodsCode is null");
            return (Criteria) this;
        }

        public Criteria andGoodscodeIsNotNull() {
            addCriterion("GoodsCode is not null");
            return (Criteria) this;
        }

        public Criteria andGoodscodeEqualTo(String value) {
            addCriterion("GoodsCode =", value, "goodscode");
            return (Criteria) this;
        }

        public Criteria andGoodscodeNotEqualTo(String value) {
            addCriterion("GoodsCode <>", value, "goodscode");
            return (Criteria) this;
        }

        public Criteria andGoodscodeGreaterThan(String value) {
            addCriterion("GoodsCode >", value, "goodscode");
            return (Criteria) this;
        }

        public Criteria andGoodscodeGreaterThanOrEqualTo(String value) {
            addCriterion("GoodsCode >=", value, "goodscode");
            return (Criteria) this;
        }

        public Criteria andGoodscodeLessThan(String value) {
            addCriterion("GoodsCode <", value, "goodscode");
            return (Criteria) this;
        }

        public Criteria andGoodscodeLessThanOrEqualTo(String value) {
            addCriterion("GoodsCode <=", value, "goodscode");
            return (Criteria) this;
        }

        public Criteria andGoodscodeLike(String value) {
            addCriterion("GoodsCode like", value, "goodscode");
            return (Criteria) this;
        }

        public Criteria andGoodscodeNotLike(String value) {
            addCriterion("GoodsCode not like", value, "goodscode");
            return (Criteria) this;
        }

        public Criteria andGoodscodeIn(List<String> values) {
            addCriterion("GoodsCode in", values, "goodscode");
            return (Criteria) this;
        }

        public Criteria andGoodscodeNotIn(List<String> values) {
            addCriterion("GoodsCode not in", values, "goodscode");
            return (Criteria) this;
        }

        public Criteria andGoodscodeBetween(String value1, String value2) {
            addCriterion("GoodsCode between", value1, value2, "goodscode");
            return (Criteria) this;
        }

        public Criteria andGoodscodeNotBetween(String value1, String value2) {
            addCriterion("GoodsCode not between", value1, value2, "goodscode");
            return (Criteria) this;
        }

        public Criteria andGoodsstatusIsNull() {
            addCriterion("GoodsStatus is null");
            return (Criteria) this;
        }

        public Criteria andGoodsstatusIsNotNull() {
            addCriterion("GoodsStatus is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsstatusEqualTo(Integer value) {
            addCriterion("GoodsStatus =", value, "goodsstatus");
            return (Criteria) this;
        }

        public Criteria andGoodsstatusNotEqualTo(Integer value) {
            addCriterion("GoodsStatus <>", value, "goodsstatus");
            return (Criteria) this;
        }

        public Criteria andGoodsstatusGreaterThan(Integer value) {
            addCriterion("GoodsStatus >", value, "goodsstatus");
            return (Criteria) this;
        }

        public Criteria andGoodsstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("GoodsStatus >=", value, "goodsstatus");
            return (Criteria) this;
        }

        public Criteria andGoodsstatusLessThan(Integer value) {
            addCriterion("GoodsStatus <", value, "goodsstatus");
            return (Criteria) this;
        }

        public Criteria andGoodsstatusLessThanOrEqualTo(Integer value) {
            addCriterion("GoodsStatus <=", value, "goodsstatus");
            return (Criteria) this;
        }

        public Criteria andGoodsstatusIn(List<Integer> values) {
            addCriterion("GoodsStatus in", values, "goodsstatus");
            return (Criteria) this;
        }

        public Criteria andGoodsstatusNotIn(List<Integer> values) {
            addCriterion("GoodsStatus not in", values, "goodsstatus");
            return (Criteria) this;
        }

        public Criteria andGoodsstatusBetween(Integer value1, Integer value2) {
            addCriterion("GoodsStatus between", value1, value2, "goodsstatus");
            return (Criteria) this;
        }

        public Criteria andGoodsstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("GoodsStatus not between", value1, value2, "goodsstatus");
            return (Criteria) this;
        }

        public Criteria andPickedIsNull() {
            addCriterion("Picked is null");
            return (Criteria) this;
        }

        public Criteria andPickedIsNotNull() {
            addCriterion("Picked is not null");
            return (Criteria) this;
        }

        public Criteria andPickedEqualTo(Integer value) {
            addCriterion("Picked =", value, "picked");
            return (Criteria) this;
        }

        public Criteria andPickedNotEqualTo(Integer value) {
            addCriterion("Picked <>", value, "picked");
            return (Criteria) this;
        }

        public Criteria andPickedGreaterThan(Integer value) {
            addCriterion("Picked >", value, "picked");
            return (Criteria) this;
        }

        public Criteria andPickedGreaterThanOrEqualTo(Integer value) {
            addCriterion("Picked >=", value, "picked");
            return (Criteria) this;
        }

        public Criteria andPickedLessThan(Integer value) {
            addCriterion("Picked <", value, "picked");
            return (Criteria) this;
        }

        public Criteria andPickedLessThanOrEqualTo(Integer value) {
            addCriterion("Picked <=", value, "picked");
            return (Criteria) this;
        }

        public Criteria andPickedIn(List<Integer> values) {
            addCriterion("Picked in", values, "picked");
            return (Criteria) this;
        }

        public Criteria andPickedNotIn(List<Integer> values) {
            addCriterion("Picked not in", values, "picked");
            return (Criteria) this;
        }

        public Criteria andPickedBetween(Integer value1, Integer value2) {
            addCriterion("Picked between", value1, value2, "picked");
            return (Criteria) this;
        }

        public Criteria andPickedNotBetween(Integer value1, Integer value2) {
            addCriterion("Picked not between", value1, value2, "picked");
            return (Criteria) this;
        }

        public Criteria andPickquantityIsNull() {
            addCriterion("PickQuantity is null");
            return (Criteria) this;
        }

        public Criteria andPickquantityIsNotNull() {
            addCriterion("PickQuantity is not null");
            return (Criteria) this;
        }

        public Criteria andPickquantityEqualTo(Float value) {
            addCriterion("PickQuantity =", value, "pickquantity");
            return (Criteria) this;
        }

        public Criteria andPickquantityNotEqualTo(Float value) {
            addCriterion("PickQuantity <>", value, "pickquantity");
            return (Criteria) this;
        }

        public Criteria andPickquantityGreaterThan(Float value) {
            addCriterion("PickQuantity >", value, "pickquantity");
            return (Criteria) this;
        }

        public Criteria andPickquantityGreaterThanOrEqualTo(Float value) {
            addCriterion("PickQuantity >=", value, "pickquantity");
            return (Criteria) this;
        }

        public Criteria andPickquantityLessThan(Float value) {
            addCriterion("PickQuantity <", value, "pickquantity");
            return (Criteria) this;
        }

        public Criteria andPickquantityLessThanOrEqualTo(Float value) {
            addCriterion("PickQuantity <=", value, "pickquantity");
            return (Criteria) this;
        }

        public Criteria andPickquantityIn(List<Float> values) {
            addCriterion("PickQuantity in", values, "pickquantity");
            return (Criteria) this;
        }

        public Criteria andPickquantityNotIn(List<Float> values) {
            addCriterion("PickQuantity not in", values, "pickquantity");
            return (Criteria) this;
        }

        public Criteria andPickquantityBetween(Float value1, Float value2) {
            addCriterion("PickQuantity between", value1, value2, "pickquantity");
            return (Criteria) this;
        }

        public Criteria andPickquantityNotBetween(Float value1, Float value2) {
            addCriterion("PickQuantity not between", value1, value2, "pickquantity");
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
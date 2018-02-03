package cn.hhu.ssm.po;

import java.util.ArrayList;
import java.util.List;

public class WmsSerialnumberExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WmsSerialnumberExample() {
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

        public Criteria andIsinstockIsNull() {
            addCriterion("IsInStock is null");
            return (Criteria) this;
        }

        public Criteria andIsinstockIsNotNull() {
            addCriterion("IsInStock is not null");
            return (Criteria) this;
        }

        public Criteria andIsinstockEqualTo(Integer value) {
            addCriterion("IsInStock =", value, "isinstock");
            return (Criteria) this;
        }

        public Criteria andIsinstockNotEqualTo(Integer value) {
            addCriterion("IsInStock <>", value, "isinstock");
            return (Criteria) this;
        }

        public Criteria andIsinstockGreaterThan(Integer value) {
            addCriterion("IsInStock >", value, "isinstock");
            return (Criteria) this;
        }

        public Criteria andIsinstockGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsInStock >=", value, "isinstock");
            return (Criteria) this;
        }

        public Criteria andIsinstockLessThan(Integer value) {
            addCriterion("IsInStock <", value, "isinstock");
            return (Criteria) this;
        }

        public Criteria andIsinstockLessThanOrEqualTo(Integer value) {
            addCriterion("IsInStock <=", value, "isinstock");
            return (Criteria) this;
        }

        public Criteria andIsinstockIn(List<Integer> values) {
            addCriterion("IsInStock in", values, "isinstock");
            return (Criteria) this;
        }

        public Criteria andIsinstockNotIn(List<Integer> values) {
            addCriterion("IsInStock not in", values, "isinstock");
            return (Criteria) this;
        }

        public Criteria andIsinstockBetween(Integer value1, Integer value2) {
            addCriterion("IsInStock between", value1, value2, "isinstock");
            return (Criteria) this;
        }

        public Criteria andIsinstockNotBetween(Integer value1, Integer value2) {
            addCriterion("IsInStock not between", value1, value2, "isinstock");
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
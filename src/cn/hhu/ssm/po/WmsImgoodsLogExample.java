package cn.hhu.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WmsImgoodsLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WmsImgoodsLogExample() {
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

        public Criteria andGoodsidLogidIsNull() {
            addCriterion("GoodsID_LogID is null");
            return (Criteria) this;
        }

        public Criteria andGoodsidLogidIsNotNull() {
            addCriterion("GoodsID_LogID is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsidLogidEqualTo(Integer value) {
            addCriterion("GoodsID_LogID =", value, "goodsidLogid");
            return (Criteria) this;
        }

        public Criteria andGoodsidLogidNotEqualTo(Integer value) {
            addCriterion("GoodsID_LogID <>", value, "goodsidLogid");
            return (Criteria) this;
        }

        public Criteria andGoodsidLogidGreaterThan(Integer value) {
            addCriterion("GoodsID_LogID >", value, "goodsidLogid");
            return (Criteria) this;
        }

        public Criteria andGoodsidLogidGreaterThanOrEqualTo(Integer value) {
            addCriterion("GoodsID_LogID >=", value, "goodsidLogid");
            return (Criteria) this;
        }

        public Criteria andGoodsidLogidLessThan(Integer value) {
            addCriterion("GoodsID_LogID <", value, "goodsidLogid");
            return (Criteria) this;
        }

        public Criteria andGoodsidLogidLessThanOrEqualTo(Integer value) {
            addCriterion("GoodsID_LogID <=", value, "goodsidLogid");
            return (Criteria) this;
        }

        public Criteria andGoodsidLogidIn(List<Integer> values) {
            addCriterion("GoodsID_LogID in", values, "goodsidLogid");
            return (Criteria) this;
        }

        public Criteria andGoodsidLogidNotIn(List<Integer> values) {
            addCriterion("GoodsID_LogID not in", values, "goodsidLogid");
            return (Criteria) this;
        }

        public Criteria andGoodsidLogidBetween(Integer value1, Integer value2) {
            addCriterion("GoodsID_LogID between", value1, value2, "goodsidLogid");
            return (Criteria) this;
        }

        public Criteria andGoodsidLogidNotBetween(Integer value1, Integer value2) {
            addCriterion("GoodsID_LogID not between", value1, value2, "goodsidLogid");
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

        public Criteria andGoodsPremodifiedstateIsNull() {
            addCriterion("Goods_PreModifiedState is null");
            return (Criteria) this;
        }

        public Criteria andGoodsPremodifiedstateIsNotNull() {
            addCriterion("Goods_PreModifiedState is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsPremodifiedstateEqualTo(String value) {
            addCriterion("Goods_PreModifiedState =", value, "goodsPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andGoodsPremodifiedstateNotEqualTo(String value) {
            addCriterion("Goods_PreModifiedState <>", value, "goodsPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andGoodsPremodifiedstateGreaterThan(String value) {
            addCriterion("Goods_PreModifiedState >", value, "goodsPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andGoodsPremodifiedstateGreaterThanOrEqualTo(String value) {
            addCriterion("Goods_PreModifiedState >=", value, "goodsPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andGoodsPremodifiedstateLessThan(String value) {
            addCriterion("Goods_PreModifiedState <", value, "goodsPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andGoodsPremodifiedstateLessThanOrEqualTo(String value) {
            addCriterion("Goods_PreModifiedState <=", value, "goodsPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andGoodsPremodifiedstateLike(String value) {
            addCriterion("Goods_PreModifiedState like", value, "goodsPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andGoodsPremodifiedstateNotLike(String value) {
            addCriterion("Goods_PreModifiedState not like", value, "goodsPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andGoodsPremodifiedstateIn(List<String> values) {
            addCriterion("Goods_PreModifiedState in", values, "goodsPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andGoodsPremodifiedstateNotIn(List<String> values) {
            addCriterion("Goods_PreModifiedState not in", values, "goodsPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andGoodsPremodifiedstateBetween(String value1, String value2) {
            addCriterion("Goods_PreModifiedState between", value1, value2, "goodsPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andGoodsPremodifiedstateNotBetween(String value1, String value2) {
            addCriterion("Goods_PreModifiedState not between", value1, value2, "goodsPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andGoodsModifiedstateIsNull() {
            addCriterion("Goods_ModifiedState is null");
            return (Criteria) this;
        }

        public Criteria andGoodsModifiedstateIsNotNull() {
            addCriterion("Goods_ModifiedState is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsModifiedstateEqualTo(String value) {
            addCriterion("Goods_ModifiedState =", value, "goodsModifiedstate");
            return (Criteria) this;
        }

        public Criteria andGoodsModifiedstateNotEqualTo(String value) {
            addCriterion("Goods_ModifiedState <>", value, "goodsModifiedstate");
            return (Criteria) this;
        }

        public Criteria andGoodsModifiedstateGreaterThan(String value) {
            addCriterion("Goods_ModifiedState >", value, "goodsModifiedstate");
            return (Criteria) this;
        }

        public Criteria andGoodsModifiedstateGreaterThanOrEqualTo(String value) {
            addCriterion("Goods_ModifiedState >=", value, "goodsModifiedstate");
            return (Criteria) this;
        }

        public Criteria andGoodsModifiedstateLessThan(String value) {
            addCriterion("Goods_ModifiedState <", value, "goodsModifiedstate");
            return (Criteria) this;
        }

        public Criteria andGoodsModifiedstateLessThanOrEqualTo(String value) {
            addCriterion("Goods_ModifiedState <=", value, "goodsModifiedstate");
            return (Criteria) this;
        }

        public Criteria andGoodsModifiedstateLike(String value) {
            addCriterion("Goods_ModifiedState like", value, "goodsModifiedstate");
            return (Criteria) this;
        }

        public Criteria andGoodsModifiedstateNotLike(String value) {
            addCriterion("Goods_ModifiedState not like", value, "goodsModifiedstate");
            return (Criteria) this;
        }

        public Criteria andGoodsModifiedstateIn(List<String> values) {
            addCriterion("Goods_ModifiedState in", values, "goodsModifiedstate");
            return (Criteria) this;
        }

        public Criteria andGoodsModifiedstateNotIn(List<String> values) {
            addCriterion("Goods_ModifiedState not in", values, "goodsModifiedstate");
            return (Criteria) this;
        }

        public Criteria andGoodsModifiedstateBetween(String value1, String value2) {
            addCriterion("Goods_ModifiedState between", value1, value2, "goodsModifiedstate");
            return (Criteria) this;
        }

        public Criteria andGoodsModifiedstateNotBetween(String value1, String value2) {
            addCriterion("Goods_ModifiedState not between", value1, value2, "goodsModifiedstate");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIsNull() {
            addCriterion("Employee_ID is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIsNotNull() {
            addCriterion("Employee_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdEqualTo(Integer value) {
            addCriterion("Employee_ID =", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotEqualTo(Integer value) {
            addCriterion("Employee_ID <>", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdGreaterThan(Integer value) {
            addCriterion("Employee_ID >", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Employee_ID >=", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdLessThan(Integer value) {
            addCriterion("Employee_ID <", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdLessThanOrEqualTo(Integer value) {
            addCriterion("Employee_ID <=", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIn(List<Integer> values) {
            addCriterion("Employee_ID in", values, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotIn(List<Integer> values) {
            addCriterion("Employee_ID not in", values, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdBetween(Integer value1, Integer value2) {
            addCriterion("Employee_ID between", value1, value2, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Employee_ID not between", value1, value2, "employeeId");
            return (Criteria) this;
        }

        public Criteria andModifymanIsNull() {
            addCriterion("ModifyMan is null");
            return (Criteria) this;
        }

        public Criteria andModifymanIsNotNull() {
            addCriterion("ModifyMan is not null");
            return (Criteria) this;
        }

        public Criteria andModifymanEqualTo(String value) {
            addCriterion("ModifyMan =", value, "modifyman");
            return (Criteria) this;
        }

        public Criteria andModifymanNotEqualTo(String value) {
            addCriterion("ModifyMan <>", value, "modifyman");
            return (Criteria) this;
        }

        public Criteria andModifymanGreaterThan(String value) {
            addCriterion("ModifyMan >", value, "modifyman");
            return (Criteria) this;
        }

        public Criteria andModifymanGreaterThanOrEqualTo(String value) {
            addCriterion("ModifyMan >=", value, "modifyman");
            return (Criteria) this;
        }

        public Criteria andModifymanLessThan(String value) {
            addCriterion("ModifyMan <", value, "modifyman");
            return (Criteria) this;
        }

        public Criteria andModifymanLessThanOrEqualTo(String value) {
            addCriterion("ModifyMan <=", value, "modifyman");
            return (Criteria) this;
        }

        public Criteria andModifymanLike(String value) {
            addCriterion("ModifyMan like", value, "modifyman");
            return (Criteria) this;
        }

        public Criteria andModifymanNotLike(String value) {
            addCriterion("ModifyMan not like", value, "modifyman");
            return (Criteria) this;
        }

        public Criteria andModifymanIn(List<String> values) {
            addCriterion("ModifyMan in", values, "modifyman");
            return (Criteria) this;
        }

        public Criteria andModifymanNotIn(List<String> values) {
            addCriterion("ModifyMan not in", values, "modifyman");
            return (Criteria) this;
        }

        public Criteria andModifymanBetween(String value1, String value2) {
            addCriterion("ModifyMan between", value1, value2, "modifyman");
            return (Criteria) this;
        }

        public Criteria andModifymanNotBetween(String value1, String value2) {
            addCriterion("ModifyMan not between", value1, value2, "modifyman");
            return (Criteria) this;
        }

        public Criteria andModifieddateIsNull() {
            addCriterion("ModifiedDate is null");
            return (Criteria) this;
        }

        public Criteria andModifieddateIsNotNull() {
            addCriterion("ModifiedDate is not null");
            return (Criteria) this;
        }

        public Criteria andModifieddateEqualTo(Date value) {
            addCriterion("ModifiedDate =", value, "modifieddate");
            return (Criteria) this;
        }

        public Criteria andModifieddateNotEqualTo(Date value) {
            addCriterion("ModifiedDate <>", value, "modifieddate");
            return (Criteria) this;
        }

        public Criteria andModifieddateGreaterThan(Date value) {
            addCriterion("ModifiedDate >", value, "modifieddate");
            return (Criteria) this;
        }

        public Criteria andModifieddateGreaterThanOrEqualTo(Date value) {
            addCriterion("ModifiedDate >=", value, "modifieddate");
            return (Criteria) this;
        }

        public Criteria andModifieddateLessThan(Date value) {
            addCriterion("ModifiedDate <", value, "modifieddate");
            return (Criteria) this;
        }

        public Criteria andModifieddateLessThanOrEqualTo(Date value) {
            addCriterion("ModifiedDate <=", value, "modifieddate");
            return (Criteria) this;
        }

        public Criteria andModifieddateIn(List<Date> values) {
            addCriterion("ModifiedDate in", values, "modifieddate");
            return (Criteria) this;
        }

        public Criteria andModifieddateNotIn(List<Date> values) {
            addCriterion("ModifiedDate not in", values, "modifieddate");
            return (Criteria) this;
        }

        public Criteria andModifieddateBetween(Date value1, Date value2) {
            addCriterion("ModifiedDate between", value1, value2, "modifieddate");
            return (Criteria) this;
        }

        public Criteria andModifieddateNotBetween(Date value1, Date value2) {
            addCriterion("ModifiedDate not between", value1, value2, "modifieddate");
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
package cn.hhu.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WmsStockcountLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WmsStockcountLogExample() {
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

        public Criteria andStockcountLogidIsNull() {
            addCriterion("StockCount_LogID is null");
            return (Criteria) this;
        }

        public Criteria andStockcountLogidIsNotNull() {
            addCriterion("StockCount_LogID is not null");
            return (Criteria) this;
        }

        public Criteria andStockcountLogidEqualTo(Integer value) {
            addCriterion("StockCount_LogID =", value, "stockcountLogid");
            return (Criteria) this;
        }

        public Criteria andStockcountLogidNotEqualTo(Integer value) {
            addCriterion("StockCount_LogID <>", value, "stockcountLogid");
            return (Criteria) this;
        }

        public Criteria andStockcountLogidGreaterThan(Integer value) {
            addCriterion("StockCount_LogID >", value, "stockcountLogid");
            return (Criteria) this;
        }

        public Criteria andStockcountLogidGreaterThanOrEqualTo(Integer value) {
            addCriterion("StockCount_LogID >=", value, "stockcountLogid");
            return (Criteria) this;
        }

        public Criteria andStockcountLogidLessThan(Integer value) {
            addCriterion("StockCount_LogID <", value, "stockcountLogid");
            return (Criteria) this;
        }

        public Criteria andStockcountLogidLessThanOrEqualTo(Integer value) {
            addCriterion("StockCount_LogID <=", value, "stockcountLogid");
            return (Criteria) this;
        }

        public Criteria andStockcountLogidIn(List<Integer> values) {
            addCriterion("StockCount_LogID in", values, "stockcountLogid");
            return (Criteria) this;
        }

        public Criteria andStockcountLogidNotIn(List<Integer> values) {
            addCriterion("StockCount_LogID not in", values, "stockcountLogid");
            return (Criteria) this;
        }

        public Criteria andStockcountLogidBetween(Integer value1, Integer value2) {
            addCriterion("StockCount_LogID between", value1, value2, "stockcountLogid");
            return (Criteria) this;
        }

        public Criteria andStockcountLogidNotBetween(Integer value1, Integer value2) {
            addCriterion("StockCount_LogID not between", value1, value2, "stockcountLogid");
            return (Criteria) this;
        }

        public Criteria andStockcountsIdIsNull() {
            addCriterion("StockCounts_ID is null");
            return (Criteria) this;
        }

        public Criteria andStockcountsIdIsNotNull() {
            addCriterion("StockCounts_ID is not null");
            return (Criteria) this;
        }

        public Criteria andStockcountsIdEqualTo(Integer value) {
            addCriterion("StockCounts_ID =", value, "stockcountsId");
            return (Criteria) this;
        }

        public Criteria andStockcountsIdNotEqualTo(Integer value) {
            addCriterion("StockCounts_ID <>", value, "stockcountsId");
            return (Criteria) this;
        }

        public Criteria andStockcountsIdGreaterThan(Integer value) {
            addCriterion("StockCounts_ID >", value, "stockcountsId");
            return (Criteria) this;
        }

        public Criteria andStockcountsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("StockCounts_ID >=", value, "stockcountsId");
            return (Criteria) this;
        }

        public Criteria andStockcountsIdLessThan(Integer value) {
            addCriterion("StockCounts_ID <", value, "stockcountsId");
            return (Criteria) this;
        }

        public Criteria andStockcountsIdLessThanOrEqualTo(Integer value) {
            addCriterion("StockCounts_ID <=", value, "stockcountsId");
            return (Criteria) this;
        }

        public Criteria andStockcountsIdIn(List<Integer> values) {
            addCriterion("StockCounts_ID in", values, "stockcountsId");
            return (Criteria) this;
        }

        public Criteria andStockcountsIdNotIn(List<Integer> values) {
            addCriterion("StockCounts_ID not in", values, "stockcountsId");
            return (Criteria) this;
        }

        public Criteria andStockcountsIdBetween(Integer value1, Integer value2) {
            addCriterion("StockCounts_ID between", value1, value2, "stockcountsId");
            return (Criteria) this;
        }

        public Criteria andStockcountsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("StockCounts_ID not between", value1, value2, "stockcountsId");
            return (Criteria) this;
        }

        public Criteria andStockcountPremodifiedstateIsNull() {
            addCriterion("StockCount_PreModifiedState is null");
            return (Criteria) this;
        }

        public Criteria andStockcountPremodifiedstateIsNotNull() {
            addCriterion("StockCount_PreModifiedState is not null");
            return (Criteria) this;
        }

        public Criteria andStockcountPremodifiedstateEqualTo(String value) {
            addCriterion("StockCount_PreModifiedState =", value, "stockcountPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andStockcountPremodifiedstateNotEqualTo(String value) {
            addCriterion("StockCount_PreModifiedState <>", value, "stockcountPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andStockcountPremodifiedstateGreaterThan(String value) {
            addCriterion("StockCount_PreModifiedState >", value, "stockcountPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andStockcountPremodifiedstateGreaterThanOrEqualTo(String value) {
            addCriterion("StockCount_PreModifiedState >=", value, "stockcountPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andStockcountPremodifiedstateLessThan(String value) {
            addCriterion("StockCount_PreModifiedState <", value, "stockcountPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andStockcountPremodifiedstateLessThanOrEqualTo(String value) {
            addCriterion("StockCount_PreModifiedState <=", value, "stockcountPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andStockcountPremodifiedstateLike(String value) {
            addCriterion("StockCount_PreModifiedState like", value, "stockcountPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andStockcountPremodifiedstateNotLike(String value) {
            addCriterion("StockCount_PreModifiedState not like", value, "stockcountPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andStockcountPremodifiedstateIn(List<String> values) {
            addCriterion("StockCount_PreModifiedState in", values, "stockcountPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andStockcountPremodifiedstateNotIn(List<String> values) {
            addCriterion("StockCount_PreModifiedState not in", values, "stockcountPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andStockcountPremodifiedstateBetween(String value1, String value2) {
            addCriterion("StockCount_PreModifiedState between", value1, value2, "stockcountPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andStockcountPremodifiedstateNotBetween(String value1, String value2) {
            addCriterion("StockCount_PreModifiedState not between", value1, value2, "stockcountPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andStockcountModifiedstateIsNull() {
            addCriterion("StockCount_ModifiedState is null");
            return (Criteria) this;
        }

        public Criteria andStockcountModifiedstateIsNotNull() {
            addCriterion("StockCount_ModifiedState is not null");
            return (Criteria) this;
        }

        public Criteria andStockcountModifiedstateEqualTo(String value) {
            addCriterion("StockCount_ModifiedState =", value, "stockcountModifiedstate");
            return (Criteria) this;
        }

        public Criteria andStockcountModifiedstateNotEqualTo(String value) {
            addCriterion("StockCount_ModifiedState <>", value, "stockcountModifiedstate");
            return (Criteria) this;
        }

        public Criteria andStockcountModifiedstateGreaterThan(String value) {
            addCriterion("StockCount_ModifiedState >", value, "stockcountModifiedstate");
            return (Criteria) this;
        }

        public Criteria andStockcountModifiedstateGreaterThanOrEqualTo(String value) {
            addCriterion("StockCount_ModifiedState >=", value, "stockcountModifiedstate");
            return (Criteria) this;
        }

        public Criteria andStockcountModifiedstateLessThan(String value) {
            addCriterion("StockCount_ModifiedState <", value, "stockcountModifiedstate");
            return (Criteria) this;
        }

        public Criteria andStockcountModifiedstateLessThanOrEqualTo(String value) {
            addCriterion("StockCount_ModifiedState <=", value, "stockcountModifiedstate");
            return (Criteria) this;
        }

        public Criteria andStockcountModifiedstateLike(String value) {
            addCriterion("StockCount_ModifiedState like", value, "stockcountModifiedstate");
            return (Criteria) this;
        }

        public Criteria andStockcountModifiedstateNotLike(String value) {
            addCriterion("StockCount_ModifiedState not like", value, "stockcountModifiedstate");
            return (Criteria) this;
        }

        public Criteria andStockcountModifiedstateIn(List<String> values) {
            addCriterion("StockCount_ModifiedState in", values, "stockcountModifiedstate");
            return (Criteria) this;
        }

        public Criteria andStockcountModifiedstateNotIn(List<String> values) {
            addCriterion("StockCount_ModifiedState not in", values, "stockcountModifiedstate");
            return (Criteria) this;
        }

        public Criteria andStockcountModifiedstateBetween(String value1, String value2) {
            addCriterion("StockCount_ModifiedState between", value1, value2, "stockcountModifiedstate");
            return (Criteria) this;
        }

        public Criteria andStockcountModifiedstateNotBetween(String value1, String value2) {
            addCriterion("StockCount_ModifiedState not between", value1, value2, "stockcountModifiedstate");
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
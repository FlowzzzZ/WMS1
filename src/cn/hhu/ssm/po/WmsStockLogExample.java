package cn.hhu.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WmsStockLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WmsStockLogExample() {
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

        public Criteria andStockLogidIsNull() {
            addCriterion("Stock_LogID is null");
            return (Criteria) this;
        }

        public Criteria andStockLogidIsNotNull() {
            addCriterion("Stock_LogID is not null");
            return (Criteria) this;
        }

        public Criteria andStockLogidEqualTo(Integer value) {
            addCriterion("Stock_LogID =", value, "stockLogid");
            return (Criteria) this;
        }

        public Criteria andStockLogidNotEqualTo(Integer value) {
            addCriterion("Stock_LogID <>", value, "stockLogid");
            return (Criteria) this;
        }

        public Criteria andStockLogidGreaterThan(Integer value) {
            addCriterion("Stock_LogID >", value, "stockLogid");
            return (Criteria) this;
        }

        public Criteria andStockLogidGreaterThanOrEqualTo(Integer value) {
            addCriterion("Stock_LogID >=", value, "stockLogid");
            return (Criteria) this;
        }

        public Criteria andStockLogidLessThan(Integer value) {
            addCriterion("Stock_LogID <", value, "stockLogid");
            return (Criteria) this;
        }

        public Criteria andStockLogidLessThanOrEqualTo(Integer value) {
            addCriterion("Stock_LogID <=", value, "stockLogid");
            return (Criteria) this;
        }

        public Criteria andStockLogidIn(List<Integer> values) {
            addCriterion("Stock_LogID in", values, "stockLogid");
            return (Criteria) this;
        }

        public Criteria andStockLogidNotIn(List<Integer> values) {
            addCriterion("Stock_LogID not in", values, "stockLogid");
            return (Criteria) this;
        }

        public Criteria andStockLogidBetween(Integer value1, Integer value2) {
            addCriterion("Stock_LogID between", value1, value2, "stockLogid");
            return (Criteria) this;
        }

        public Criteria andStockLogidNotBetween(Integer value1, Integer value2) {
            addCriterion("Stock_LogID not between", value1, value2, "stockLogid");
            return (Criteria) this;
        }

        public Criteria andStocksIdIsNull() {
            addCriterion("Stocks_ID is null");
            return (Criteria) this;
        }

        public Criteria andStocksIdIsNotNull() {
            addCriterion("Stocks_ID is not null");
            return (Criteria) this;
        }

        public Criteria andStocksIdEqualTo(Integer value) {
            addCriterion("Stocks_ID =", value, "stocksId");
            return (Criteria) this;
        }

        public Criteria andStocksIdNotEqualTo(Integer value) {
            addCriterion("Stocks_ID <>", value, "stocksId");
            return (Criteria) this;
        }

        public Criteria andStocksIdGreaterThan(Integer value) {
            addCriterion("Stocks_ID >", value, "stocksId");
            return (Criteria) this;
        }

        public Criteria andStocksIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Stocks_ID >=", value, "stocksId");
            return (Criteria) this;
        }

        public Criteria andStocksIdLessThan(Integer value) {
            addCriterion("Stocks_ID <", value, "stocksId");
            return (Criteria) this;
        }

        public Criteria andStocksIdLessThanOrEqualTo(Integer value) {
            addCriterion("Stocks_ID <=", value, "stocksId");
            return (Criteria) this;
        }

        public Criteria andStocksIdIn(List<Integer> values) {
            addCriterion("Stocks_ID in", values, "stocksId");
            return (Criteria) this;
        }

        public Criteria andStocksIdNotIn(List<Integer> values) {
            addCriterion("Stocks_ID not in", values, "stocksId");
            return (Criteria) this;
        }

        public Criteria andStocksIdBetween(Integer value1, Integer value2) {
            addCriterion("Stocks_ID between", value1, value2, "stocksId");
            return (Criteria) this;
        }

        public Criteria andStocksIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Stocks_ID not between", value1, value2, "stocksId");
            return (Criteria) this;
        }

        public Criteria andStockPremodifiedstateIsNull() {
            addCriterion("Stock_PreModifiedState is null");
            return (Criteria) this;
        }

        public Criteria andStockPremodifiedstateIsNotNull() {
            addCriterion("Stock_PreModifiedState is not null");
            return (Criteria) this;
        }

        public Criteria andStockPremodifiedstateEqualTo(String value) {
            addCriterion("Stock_PreModifiedState =", value, "stockPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andStockPremodifiedstateNotEqualTo(String value) {
            addCriterion("Stock_PreModifiedState <>", value, "stockPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andStockPremodifiedstateGreaterThan(String value) {
            addCriterion("Stock_PreModifiedState >", value, "stockPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andStockPremodifiedstateGreaterThanOrEqualTo(String value) {
            addCriterion("Stock_PreModifiedState >=", value, "stockPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andStockPremodifiedstateLessThan(String value) {
            addCriterion("Stock_PreModifiedState <", value, "stockPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andStockPremodifiedstateLessThanOrEqualTo(String value) {
            addCriterion("Stock_PreModifiedState <=", value, "stockPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andStockPremodifiedstateLike(String value) {
            addCriterion("Stock_PreModifiedState like", value, "stockPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andStockPremodifiedstateNotLike(String value) {
            addCriterion("Stock_PreModifiedState not like", value, "stockPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andStockPremodifiedstateIn(List<String> values) {
            addCriterion("Stock_PreModifiedState in", values, "stockPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andStockPremodifiedstateNotIn(List<String> values) {
            addCriterion("Stock_PreModifiedState not in", values, "stockPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andStockPremodifiedstateBetween(String value1, String value2) {
            addCriterion("Stock_PreModifiedState between", value1, value2, "stockPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andStockPremodifiedstateNotBetween(String value1, String value2) {
            addCriterion("Stock_PreModifiedState not between", value1, value2, "stockPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andStockModifiedstateIsNull() {
            addCriterion("Stock_ModifiedState is null");
            return (Criteria) this;
        }

        public Criteria andStockModifiedstateIsNotNull() {
            addCriterion("Stock_ModifiedState is not null");
            return (Criteria) this;
        }

        public Criteria andStockModifiedstateEqualTo(String value) {
            addCriterion("Stock_ModifiedState =", value, "stockModifiedstate");
            return (Criteria) this;
        }

        public Criteria andStockModifiedstateNotEqualTo(String value) {
            addCriterion("Stock_ModifiedState <>", value, "stockModifiedstate");
            return (Criteria) this;
        }

        public Criteria andStockModifiedstateGreaterThan(String value) {
            addCriterion("Stock_ModifiedState >", value, "stockModifiedstate");
            return (Criteria) this;
        }

        public Criteria andStockModifiedstateGreaterThanOrEqualTo(String value) {
            addCriterion("Stock_ModifiedState >=", value, "stockModifiedstate");
            return (Criteria) this;
        }

        public Criteria andStockModifiedstateLessThan(String value) {
            addCriterion("Stock_ModifiedState <", value, "stockModifiedstate");
            return (Criteria) this;
        }

        public Criteria andStockModifiedstateLessThanOrEqualTo(String value) {
            addCriterion("Stock_ModifiedState <=", value, "stockModifiedstate");
            return (Criteria) this;
        }

        public Criteria andStockModifiedstateLike(String value) {
            addCriterion("Stock_ModifiedState like", value, "stockModifiedstate");
            return (Criteria) this;
        }

        public Criteria andStockModifiedstateNotLike(String value) {
            addCriterion("Stock_ModifiedState not like", value, "stockModifiedstate");
            return (Criteria) this;
        }

        public Criteria andStockModifiedstateIn(List<String> values) {
            addCriterion("Stock_ModifiedState in", values, "stockModifiedstate");
            return (Criteria) this;
        }

        public Criteria andStockModifiedstateNotIn(List<String> values) {
            addCriterion("Stock_ModifiedState not in", values, "stockModifiedstate");
            return (Criteria) this;
        }

        public Criteria andStockModifiedstateBetween(String value1, String value2) {
            addCriterion("Stock_ModifiedState between", value1, value2, "stockModifiedstate");
            return (Criteria) this;
        }

        public Criteria andStockModifiedstateNotBetween(String value1, String value2) {
            addCriterion("Stock_ModifiedState not between", value1, value2, "stockModifiedstate");
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
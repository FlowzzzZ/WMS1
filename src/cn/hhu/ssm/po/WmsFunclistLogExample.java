package cn.hhu.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WmsFunclistLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WmsFunclistLogExample() {
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

        public Criteria andFunclistLogidIsNull() {
            addCriterion("FuncList_LogID is null");
            return (Criteria) this;
        }

        public Criteria andFunclistLogidIsNotNull() {
            addCriterion("FuncList_LogID is not null");
            return (Criteria) this;
        }

        public Criteria andFunclistLogidEqualTo(Integer value) {
            addCriterion("FuncList_LogID =", value, "funclistLogid");
            return (Criteria) this;
        }

        public Criteria andFunclistLogidNotEqualTo(Integer value) {
            addCriterion("FuncList_LogID <>", value, "funclistLogid");
            return (Criteria) this;
        }

        public Criteria andFunclistLogidGreaterThan(Integer value) {
            addCriterion("FuncList_LogID >", value, "funclistLogid");
            return (Criteria) this;
        }

        public Criteria andFunclistLogidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FuncList_LogID >=", value, "funclistLogid");
            return (Criteria) this;
        }

        public Criteria andFunclistLogidLessThan(Integer value) {
            addCriterion("FuncList_LogID <", value, "funclistLogid");
            return (Criteria) this;
        }

        public Criteria andFunclistLogidLessThanOrEqualTo(Integer value) {
            addCriterion("FuncList_LogID <=", value, "funclistLogid");
            return (Criteria) this;
        }

        public Criteria andFunclistLogidIn(List<Integer> values) {
            addCriterion("FuncList_LogID in", values, "funclistLogid");
            return (Criteria) this;
        }

        public Criteria andFunclistLogidNotIn(List<Integer> values) {
            addCriterion("FuncList_LogID not in", values, "funclistLogid");
            return (Criteria) this;
        }

        public Criteria andFunclistLogidBetween(Integer value1, Integer value2) {
            addCriterion("FuncList_LogID between", value1, value2, "funclistLogid");
            return (Criteria) this;
        }

        public Criteria andFunclistLogidNotBetween(Integer value1, Integer value2) {
            addCriterion("FuncList_LogID not between", value1, value2, "funclistLogid");
            return (Criteria) this;
        }

        public Criteria andFuncIdIsNull() {
            addCriterion("Func_ID is null");
            return (Criteria) this;
        }

        public Criteria andFuncIdIsNotNull() {
            addCriterion("Func_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFuncIdEqualTo(Integer value) {
            addCriterion("Func_ID =", value, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdNotEqualTo(Integer value) {
            addCriterion("Func_ID <>", value, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdGreaterThan(Integer value) {
            addCriterion("Func_ID >", value, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Func_ID >=", value, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdLessThan(Integer value) {
            addCriterion("Func_ID <", value, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdLessThanOrEqualTo(Integer value) {
            addCriterion("Func_ID <=", value, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdIn(List<Integer> values) {
            addCriterion("Func_ID in", values, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdNotIn(List<Integer> values) {
            addCriterion("Func_ID not in", values, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdBetween(Integer value1, Integer value2) {
            addCriterion("Func_ID between", value1, value2, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Func_ID not between", value1, value2, "funcId");
            return (Criteria) this;
        }

        public Criteria andFunclistIdIsNull() {
            addCriterion("FuncList_ID is null");
            return (Criteria) this;
        }

        public Criteria andFunclistIdIsNotNull() {
            addCriterion("FuncList_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFunclistIdEqualTo(Integer value) {
            addCriterion("FuncList_ID =", value, "funclistId");
            return (Criteria) this;
        }

        public Criteria andFunclistIdNotEqualTo(Integer value) {
            addCriterion("FuncList_ID <>", value, "funclistId");
            return (Criteria) this;
        }

        public Criteria andFunclistIdGreaterThan(Integer value) {
            addCriterion("FuncList_ID >", value, "funclistId");
            return (Criteria) this;
        }

        public Criteria andFunclistIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("FuncList_ID >=", value, "funclistId");
            return (Criteria) this;
        }

        public Criteria andFunclistIdLessThan(Integer value) {
            addCriterion("FuncList_ID <", value, "funclistId");
            return (Criteria) this;
        }

        public Criteria andFunclistIdLessThanOrEqualTo(Integer value) {
            addCriterion("FuncList_ID <=", value, "funclistId");
            return (Criteria) this;
        }

        public Criteria andFunclistIdIn(List<Integer> values) {
            addCriterion("FuncList_ID in", values, "funclistId");
            return (Criteria) this;
        }

        public Criteria andFunclistIdNotIn(List<Integer> values) {
            addCriterion("FuncList_ID not in", values, "funclistId");
            return (Criteria) this;
        }

        public Criteria andFunclistIdBetween(Integer value1, Integer value2) {
            addCriterion("FuncList_ID between", value1, value2, "funclistId");
            return (Criteria) this;
        }

        public Criteria andFunclistIdNotBetween(Integer value1, Integer value2) {
            addCriterion("FuncList_ID not between", value1, value2, "funclistId");
            return (Criteria) this;
        }

        public Criteria andFunclistPremodifiedstateIsNull() {
            addCriterion("FuncList_PreModifiedState is null");
            return (Criteria) this;
        }

        public Criteria andFunclistPremodifiedstateIsNotNull() {
            addCriterion("FuncList_PreModifiedState is not null");
            return (Criteria) this;
        }

        public Criteria andFunclistPremodifiedstateEqualTo(String value) {
            addCriterion("FuncList_PreModifiedState =", value, "funclistPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andFunclistPremodifiedstateNotEqualTo(String value) {
            addCriterion("FuncList_PreModifiedState <>", value, "funclistPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andFunclistPremodifiedstateGreaterThan(String value) {
            addCriterion("FuncList_PreModifiedState >", value, "funclistPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andFunclistPremodifiedstateGreaterThanOrEqualTo(String value) {
            addCriterion("FuncList_PreModifiedState >=", value, "funclistPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andFunclistPremodifiedstateLessThan(String value) {
            addCriterion("FuncList_PreModifiedState <", value, "funclistPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andFunclistPremodifiedstateLessThanOrEqualTo(String value) {
            addCriterion("FuncList_PreModifiedState <=", value, "funclistPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andFunclistPremodifiedstateLike(String value) {
            addCriterion("FuncList_PreModifiedState like", value, "funclistPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andFunclistPremodifiedstateNotLike(String value) {
            addCriterion("FuncList_PreModifiedState not like", value, "funclistPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andFunclistPremodifiedstateIn(List<String> values) {
            addCriterion("FuncList_PreModifiedState in", values, "funclistPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andFunclistPremodifiedstateNotIn(List<String> values) {
            addCriterion("FuncList_PreModifiedState not in", values, "funclistPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andFunclistPremodifiedstateBetween(String value1, String value2) {
            addCriterion("FuncList_PreModifiedState between", value1, value2, "funclistPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andFunclistPremodifiedstateNotBetween(String value1, String value2) {
            addCriterion("FuncList_PreModifiedState not between", value1, value2, "funclistPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andFunclistModifiedstateIsNull() {
            addCriterion("FuncList_ModifiedState is null");
            return (Criteria) this;
        }

        public Criteria andFunclistModifiedstateIsNotNull() {
            addCriterion("FuncList_ModifiedState is not null");
            return (Criteria) this;
        }

        public Criteria andFunclistModifiedstateEqualTo(String value) {
            addCriterion("FuncList_ModifiedState =", value, "funclistModifiedstate");
            return (Criteria) this;
        }

        public Criteria andFunclistModifiedstateNotEqualTo(String value) {
            addCriterion("FuncList_ModifiedState <>", value, "funclistModifiedstate");
            return (Criteria) this;
        }

        public Criteria andFunclistModifiedstateGreaterThan(String value) {
            addCriterion("FuncList_ModifiedState >", value, "funclistModifiedstate");
            return (Criteria) this;
        }

        public Criteria andFunclistModifiedstateGreaterThanOrEqualTo(String value) {
            addCriterion("FuncList_ModifiedState >=", value, "funclistModifiedstate");
            return (Criteria) this;
        }

        public Criteria andFunclistModifiedstateLessThan(String value) {
            addCriterion("FuncList_ModifiedState <", value, "funclistModifiedstate");
            return (Criteria) this;
        }

        public Criteria andFunclistModifiedstateLessThanOrEqualTo(String value) {
            addCriterion("FuncList_ModifiedState <=", value, "funclistModifiedstate");
            return (Criteria) this;
        }

        public Criteria andFunclistModifiedstateLike(String value) {
            addCriterion("FuncList_ModifiedState like", value, "funclistModifiedstate");
            return (Criteria) this;
        }

        public Criteria andFunclistModifiedstateNotLike(String value) {
            addCriterion("FuncList_ModifiedState not like", value, "funclistModifiedstate");
            return (Criteria) this;
        }

        public Criteria andFunclistModifiedstateIn(List<String> values) {
            addCriterion("FuncList_ModifiedState in", values, "funclistModifiedstate");
            return (Criteria) this;
        }

        public Criteria andFunclistModifiedstateNotIn(List<String> values) {
            addCriterion("FuncList_ModifiedState not in", values, "funclistModifiedstate");
            return (Criteria) this;
        }

        public Criteria andFunclistModifiedstateBetween(String value1, String value2) {
            addCriterion("FuncList_ModifiedState between", value1, value2, "funclistModifiedstate");
            return (Criteria) this;
        }

        public Criteria andFunclistModifiedstateNotBetween(String value1, String value2) {
            addCriterion("FuncList_ModifiedState not between", value1, value2, "funclistModifiedstate");
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
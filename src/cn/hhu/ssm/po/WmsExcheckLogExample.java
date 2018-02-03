package cn.hhu.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WmsExcheckLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WmsExcheckLogExample() {
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

        public Criteria andExcheckLogidIsNull() {
            addCriterion("EXCheck_LogID is null");
            return (Criteria) this;
        }

        public Criteria andExcheckLogidIsNotNull() {
            addCriterion("EXCheck_LogID is not null");
            return (Criteria) this;
        }

        public Criteria andExcheckLogidEqualTo(Integer value) {
            addCriterion("EXCheck_LogID =", value, "excheckLogid");
            return (Criteria) this;
        }

        public Criteria andExcheckLogidNotEqualTo(Integer value) {
            addCriterion("EXCheck_LogID <>", value, "excheckLogid");
            return (Criteria) this;
        }

        public Criteria andExcheckLogidGreaterThan(Integer value) {
            addCriterion("EXCheck_LogID >", value, "excheckLogid");
            return (Criteria) this;
        }

        public Criteria andExcheckLogidGreaterThanOrEqualTo(Integer value) {
            addCriterion("EXCheck_LogID >=", value, "excheckLogid");
            return (Criteria) this;
        }

        public Criteria andExcheckLogidLessThan(Integer value) {
            addCriterion("EXCheck_LogID <", value, "excheckLogid");
            return (Criteria) this;
        }

        public Criteria andExcheckLogidLessThanOrEqualTo(Integer value) {
            addCriterion("EXCheck_LogID <=", value, "excheckLogid");
            return (Criteria) this;
        }

        public Criteria andExcheckLogidIn(List<Integer> values) {
            addCriterion("EXCheck_LogID in", values, "excheckLogid");
            return (Criteria) this;
        }

        public Criteria andExcheckLogidNotIn(List<Integer> values) {
            addCriterion("EXCheck_LogID not in", values, "excheckLogid");
            return (Criteria) this;
        }

        public Criteria andExcheckLogidBetween(Integer value1, Integer value2) {
            addCriterion("EXCheck_LogID between", value1, value2, "excheckLogid");
            return (Criteria) this;
        }

        public Criteria andExcheckLogidNotBetween(Integer value1, Integer value2) {
            addCriterion("EXCheck_LogID not between", value1, value2, "excheckLogid");
            return (Criteria) this;
        }

        public Criteria andExcheckIdIsNull() {
            addCriterion("EXCheck_ID is null");
            return (Criteria) this;
        }

        public Criteria andExcheckIdIsNotNull() {
            addCriterion("EXCheck_ID is not null");
            return (Criteria) this;
        }

        public Criteria andExcheckIdEqualTo(Integer value) {
            addCriterion("EXCheck_ID =", value, "excheckId");
            return (Criteria) this;
        }

        public Criteria andExcheckIdNotEqualTo(Integer value) {
            addCriterion("EXCheck_ID <>", value, "excheckId");
            return (Criteria) this;
        }

        public Criteria andExcheckIdGreaterThan(Integer value) {
            addCriterion("EXCheck_ID >", value, "excheckId");
            return (Criteria) this;
        }

        public Criteria andExcheckIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("EXCheck_ID >=", value, "excheckId");
            return (Criteria) this;
        }

        public Criteria andExcheckIdLessThan(Integer value) {
            addCriterion("EXCheck_ID <", value, "excheckId");
            return (Criteria) this;
        }

        public Criteria andExcheckIdLessThanOrEqualTo(Integer value) {
            addCriterion("EXCheck_ID <=", value, "excheckId");
            return (Criteria) this;
        }

        public Criteria andExcheckIdIn(List<Integer> values) {
            addCriterion("EXCheck_ID in", values, "excheckId");
            return (Criteria) this;
        }

        public Criteria andExcheckIdNotIn(List<Integer> values) {
            addCriterion("EXCheck_ID not in", values, "excheckId");
            return (Criteria) this;
        }

        public Criteria andExcheckIdBetween(Integer value1, Integer value2) {
            addCriterion("EXCheck_ID between", value1, value2, "excheckId");
            return (Criteria) this;
        }

        public Criteria andExcheckIdNotBetween(Integer value1, Integer value2) {
            addCriterion("EXCheck_ID not between", value1, value2, "excheckId");
            return (Criteria) this;
        }

        public Criteria andExcheckPremodifiedstateIsNull() {
            addCriterion("EXCheck_PreModifiedState is null");
            return (Criteria) this;
        }

        public Criteria andExcheckPremodifiedstateIsNotNull() {
            addCriterion("EXCheck_PreModifiedState is not null");
            return (Criteria) this;
        }

        public Criteria andExcheckPremodifiedstateEqualTo(String value) {
            addCriterion("EXCheck_PreModifiedState =", value, "excheckPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andExcheckPremodifiedstateNotEqualTo(String value) {
            addCriterion("EXCheck_PreModifiedState <>", value, "excheckPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andExcheckPremodifiedstateGreaterThan(String value) {
            addCriterion("EXCheck_PreModifiedState >", value, "excheckPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andExcheckPremodifiedstateGreaterThanOrEqualTo(String value) {
            addCriterion("EXCheck_PreModifiedState >=", value, "excheckPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andExcheckPremodifiedstateLessThan(String value) {
            addCriterion("EXCheck_PreModifiedState <", value, "excheckPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andExcheckPremodifiedstateLessThanOrEqualTo(String value) {
            addCriterion("EXCheck_PreModifiedState <=", value, "excheckPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andExcheckPremodifiedstateLike(String value) {
            addCriterion("EXCheck_PreModifiedState like", value, "excheckPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andExcheckPremodifiedstateNotLike(String value) {
            addCriterion("EXCheck_PreModifiedState not like", value, "excheckPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andExcheckPremodifiedstateIn(List<String> values) {
            addCriterion("EXCheck_PreModifiedState in", values, "excheckPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andExcheckPremodifiedstateNotIn(List<String> values) {
            addCriterion("EXCheck_PreModifiedState not in", values, "excheckPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andExcheckPremodifiedstateBetween(String value1, String value2) {
            addCriterion("EXCheck_PreModifiedState between", value1, value2, "excheckPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andExcheckPremodifiedstateNotBetween(String value1, String value2) {
            addCriterion("EXCheck_PreModifiedState not between", value1, value2, "excheckPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andExcheckModifiedstateIsNull() {
            addCriterion("EXCheck_ModifiedState is null");
            return (Criteria) this;
        }

        public Criteria andExcheckModifiedstateIsNotNull() {
            addCriterion("EXCheck_ModifiedState is not null");
            return (Criteria) this;
        }

        public Criteria andExcheckModifiedstateEqualTo(String value) {
            addCriterion("EXCheck_ModifiedState =", value, "excheckModifiedstate");
            return (Criteria) this;
        }

        public Criteria andExcheckModifiedstateNotEqualTo(String value) {
            addCriterion("EXCheck_ModifiedState <>", value, "excheckModifiedstate");
            return (Criteria) this;
        }

        public Criteria andExcheckModifiedstateGreaterThan(String value) {
            addCriterion("EXCheck_ModifiedState >", value, "excheckModifiedstate");
            return (Criteria) this;
        }

        public Criteria andExcheckModifiedstateGreaterThanOrEqualTo(String value) {
            addCriterion("EXCheck_ModifiedState >=", value, "excheckModifiedstate");
            return (Criteria) this;
        }

        public Criteria andExcheckModifiedstateLessThan(String value) {
            addCriterion("EXCheck_ModifiedState <", value, "excheckModifiedstate");
            return (Criteria) this;
        }

        public Criteria andExcheckModifiedstateLessThanOrEqualTo(String value) {
            addCriterion("EXCheck_ModifiedState <=", value, "excheckModifiedstate");
            return (Criteria) this;
        }

        public Criteria andExcheckModifiedstateLike(String value) {
            addCriterion("EXCheck_ModifiedState like", value, "excheckModifiedstate");
            return (Criteria) this;
        }

        public Criteria andExcheckModifiedstateNotLike(String value) {
            addCriterion("EXCheck_ModifiedState not like", value, "excheckModifiedstate");
            return (Criteria) this;
        }

        public Criteria andExcheckModifiedstateIn(List<String> values) {
            addCriterion("EXCheck_ModifiedState in", values, "excheckModifiedstate");
            return (Criteria) this;
        }

        public Criteria andExcheckModifiedstateNotIn(List<String> values) {
            addCriterion("EXCheck_ModifiedState not in", values, "excheckModifiedstate");
            return (Criteria) this;
        }

        public Criteria andExcheckModifiedstateBetween(String value1, String value2) {
            addCriterion("EXCheck_ModifiedState between", value1, value2, "excheckModifiedstate");
            return (Criteria) this;
        }

        public Criteria andExcheckModifiedstateNotBetween(String value1, String value2) {
            addCriterion("EXCheck_ModifiedState not between", value1, value2, "excheckModifiedstate");
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
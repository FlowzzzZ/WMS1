package cn.hhu.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WmsAccesscontrolLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WmsAccesscontrolLogExample() {
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

        public Criteria andAccesscontrolLogidIsNull() {
            addCriterion("AccessControl_LogID is null");
            return (Criteria) this;
        }

        public Criteria andAccesscontrolLogidIsNotNull() {
            addCriterion("AccessControl_LogID is not null");
            return (Criteria) this;
        }

        public Criteria andAccesscontrolLogidEqualTo(Integer value) {
            addCriterion("AccessControl_LogID =", value, "accesscontrolLogid");
            return (Criteria) this;
        }

        public Criteria andAccesscontrolLogidNotEqualTo(Integer value) {
            addCriterion("AccessControl_LogID <>", value, "accesscontrolLogid");
            return (Criteria) this;
        }

        public Criteria andAccesscontrolLogidGreaterThan(Integer value) {
            addCriterion("AccessControl_LogID >", value, "accesscontrolLogid");
            return (Criteria) this;
        }

        public Criteria andAccesscontrolLogidGreaterThanOrEqualTo(Integer value) {
            addCriterion("AccessControl_LogID >=", value, "accesscontrolLogid");
            return (Criteria) this;
        }

        public Criteria andAccesscontrolLogidLessThan(Integer value) {
            addCriterion("AccessControl_LogID <", value, "accesscontrolLogid");
            return (Criteria) this;
        }

        public Criteria andAccesscontrolLogidLessThanOrEqualTo(Integer value) {
            addCriterion("AccessControl_LogID <=", value, "accesscontrolLogid");
            return (Criteria) this;
        }

        public Criteria andAccesscontrolLogidIn(List<Integer> values) {
            addCriterion("AccessControl_LogID in", values, "accesscontrolLogid");
            return (Criteria) this;
        }

        public Criteria andAccesscontrolLogidNotIn(List<Integer> values) {
            addCriterion("AccessControl_LogID not in", values, "accesscontrolLogid");
            return (Criteria) this;
        }

        public Criteria andAccesscontrolLogidBetween(Integer value1, Integer value2) {
            addCriterion("AccessControl_LogID between", value1, value2, "accesscontrolLogid");
            return (Criteria) this;
        }

        public Criteria andAccesscontrolLogidNotBetween(Integer value1, Integer value2) {
            addCriterion("AccessControl_LogID not between", value1, value2, "accesscontrolLogid");
            return (Criteria) this;
        }

        public Criteria andAccesscontrolIdIsNull() {
            addCriterion("AccessControl_ID is null");
            return (Criteria) this;
        }

        public Criteria andAccesscontrolIdIsNotNull() {
            addCriterion("AccessControl_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAccesscontrolIdEqualTo(Integer value) {
            addCriterion("AccessControl_ID =", value, "accesscontrolId");
            return (Criteria) this;
        }

        public Criteria andAccesscontrolIdNotEqualTo(Integer value) {
            addCriterion("AccessControl_ID <>", value, "accesscontrolId");
            return (Criteria) this;
        }

        public Criteria andAccesscontrolIdGreaterThan(Integer value) {
            addCriterion("AccessControl_ID >", value, "accesscontrolId");
            return (Criteria) this;
        }

        public Criteria andAccesscontrolIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("AccessControl_ID >=", value, "accesscontrolId");
            return (Criteria) this;
        }

        public Criteria andAccesscontrolIdLessThan(Integer value) {
            addCriterion("AccessControl_ID <", value, "accesscontrolId");
            return (Criteria) this;
        }

        public Criteria andAccesscontrolIdLessThanOrEqualTo(Integer value) {
            addCriterion("AccessControl_ID <=", value, "accesscontrolId");
            return (Criteria) this;
        }

        public Criteria andAccesscontrolIdIn(List<Integer> values) {
            addCriterion("AccessControl_ID in", values, "accesscontrolId");
            return (Criteria) this;
        }

        public Criteria andAccesscontrolIdNotIn(List<Integer> values) {
            addCriterion("AccessControl_ID not in", values, "accesscontrolId");
            return (Criteria) this;
        }

        public Criteria andAccesscontrolIdBetween(Integer value1, Integer value2) {
            addCriterion("AccessControl_ID between", value1, value2, "accesscontrolId");
            return (Criteria) this;
        }

        public Criteria andAccesscontrolIdNotBetween(Integer value1, Integer value2) {
            addCriterion("AccessControl_ID not between", value1, value2, "accesscontrolId");
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

        public Criteria andAccesscontrolPremodifiedstateIsNull() {
            addCriterion("AccessControl_PreModifiedState is null");
            return (Criteria) this;
        }

        public Criteria andAccesscontrolPremodifiedstateIsNotNull() {
            addCriterion("AccessControl_PreModifiedState is not null");
            return (Criteria) this;
        }

        public Criteria andAccesscontrolPremodifiedstateEqualTo(String value) {
            addCriterion("AccessControl_PreModifiedState =", value, "accesscontrolPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andAccesscontrolPremodifiedstateNotEqualTo(String value) {
            addCriterion("AccessControl_PreModifiedState <>", value, "accesscontrolPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andAccesscontrolPremodifiedstateGreaterThan(String value) {
            addCriterion("AccessControl_PreModifiedState >", value, "accesscontrolPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andAccesscontrolPremodifiedstateGreaterThanOrEqualTo(String value) {
            addCriterion("AccessControl_PreModifiedState >=", value, "accesscontrolPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andAccesscontrolPremodifiedstateLessThan(String value) {
            addCriterion("AccessControl_PreModifiedState <", value, "accesscontrolPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andAccesscontrolPremodifiedstateLessThanOrEqualTo(String value) {
            addCriterion("AccessControl_PreModifiedState <=", value, "accesscontrolPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andAccesscontrolPremodifiedstateLike(String value) {
            addCriterion("AccessControl_PreModifiedState like", value, "accesscontrolPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andAccesscontrolPremodifiedstateNotLike(String value) {
            addCriterion("AccessControl_PreModifiedState not like", value, "accesscontrolPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andAccesscontrolPremodifiedstateIn(List<String> values) {
            addCriterion("AccessControl_PreModifiedState in", values, "accesscontrolPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andAccesscontrolPremodifiedstateNotIn(List<String> values) {
            addCriterion("AccessControl_PreModifiedState not in", values, "accesscontrolPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andAccesscontrolPremodifiedstateBetween(String value1, String value2) {
            addCriterion("AccessControl_PreModifiedState between", value1, value2, "accesscontrolPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andAccesscontrolPremodifiedstateNotBetween(String value1, String value2) {
            addCriterion("AccessControl_PreModifiedState not between", value1, value2, "accesscontrolPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andAccesscontrolModifiedstateIsNull() {
            addCriterion("AccessControl_ModifiedState is null");
            return (Criteria) this;
        }

        public Criteria andAccesscontrolModifiedstateIsNotNull() {
            addCriterion("AccessControl_ModifiedState is not null");
            return (Criteria) this;
        }

        public Criteria andAccesscontrolModifiedstateEqualTo(String value) {
            addCriterion("AccessControl_ModifiedState =", value, "accesscontrolModifiedstate");
            return (Criteria) this;
        }

        public Criteria andAccesscontrolModifiedstateNotEqualTo(String value) {
            addCriterion("AccessControl_ModifiedState <>", value, "accesscontrolModifiedstate");
            return (Criteria) this;
        }

        public Criteria andAccesscontrolModifiedstateGreaterThan(String value) {
            addCriterion("AccessControl_ModifiedState >", value, "accesscontrolModifiedstate");
            return (Criteria) this;
        }

        public Criteria andAccesscontrolModifiedstateGreaterThanOrEqualTo(String value) {
            addCriterion("AccessControl_ModifiedState >=", value, "accesscontrolModifiedstate");
            return (Criteria) this;
        }

        public Criteria andAccesscontrolModifiedstateLessThan(String value) {
            addCriterion("AccessControl_ModifiedState <", value, "accesscontrolModifiedstate");
            return (Criteria) this;
        }

        public Criteria andAccesscontrolModifiedstateLessThanOrEqualTo(String value) {
            addCriterion("AccessControl_ModifiedState <=", value, "accesscontrolModifiedstate");
            return (Criteria) this;
        }

        public Criteria andAccesscontrolModifiedstateLike(String value) {
            addCriterion("AccessControl_ModifiedState like", value, "accesscontrolModifiedstate");
            return (Criteria) this;
        }

        public Criteria andAccesscontrolModifiedstateNotLike(String value) {
            addCriterion("AccessControl_ModifiedState not like", value, "accesscontrolModifiedstate");
            return (Criteria) this;
        }

        public Criteria andAccesscontrolModifiedstateIn(List<String> values) {
            addCriterion("AccessControl_ModifiedState in", values, "accesscontrolModifiedstate");
            return (Criteria) this;
        }

        public Criteria andAccesscontrolModifiedstateNotIn(List<String> values) {
            addCriterion("AccessControl_ModifiedState not in", values, "accesscontrolModifiedstate");
            return (Criteria) this;
        }

        public Criteria andAccesscontrolModifiedstateBetween(String value1, String value2) {
            addCriterion("AccessControl_ModifiedState between", value1, value2, "accesscontrolModifiedstate");
            return (Criteria) this;
        }

        public Criteria andAccesscontrolModifiedstateNotBetween(String value1, String value2) {
            addCriterion("AccessControl_ModifiedState not between", value1, value2, "accesscontrolModifiedstate");
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
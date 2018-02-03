package cn.hhu.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WmsBaseConservationrecordLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WmsBaseConservationrecordLogExample() {
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

        public Criteria andConservationrecordLogidIsNull() {
            addCriterion("ConservationRecord_LogID is null");
            return (Criteria) this;
        }

        public Criteria andConservationrecordLogidIsNotNull() {
            addCriterion("ConservationRecord_LogID is not null");
            return (Criteria) this;
        }

        public Criteria andConservationrecordLogidEqualTo(Integer value) {
            addCriterion("ConservationRecord_LogID =", value, "conservationrecordLogid");
            return (Criteria) this;
        }

        public Criteria andConservationrecordLogidNotEqualTo(Integer value) {
            addCriterion("ConservationRecord_LogID <>", value, "conservationrecordLogid");
            return (Criteria) this;
        }

        public Criteria andConservationrecordLogidGreaterThan(Integer value) {
            addCriterion("ConservationRecord_LogID >", value, "conservationrecordLogid");
            return (Criteria) this;
        }

        public Criteria andConservationrecordLogidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ConservationRecord_LogID >=", value, "conservationrecordLogid");
            return (Criteria) this;
        }

        public Criteria andConservationrecordLogidLessThan(Integer value) {
            addCriterion("ConservationRecord_LogID <", value, "conservationrecordLogid");
            return (Criteria) this;
        }

        public Criteria andConservationrecordLogidLessThanOrEqualTo(Integer value) {
            addCriterion("ConservationRecord_LogID <=", value, "conservationrecordLogid");
            return (Criteria) this;
        }

        public Criteria andConservationrecordLogidIn(List<Integer> values) {
            addCriterion("ConservationRecord_LogID in", values, "conservationrecordLogid");
            return (Criteria) this;
        }

        public Criteria andConservationrecordLogidNotIn(List<Integer> values) {
            addCriterion("ConservationRecord_LogID not in", values, "conservationrecordLogid");
            return (Criteria) this;
        }

        public Criteria andConservationrecordLogidBetween(Integer value1, Integer value2) {
            addCriterion("ConservationRecord_LogID between", value1, value2, "conservationrecordLogid");
            return (Criteria) this;
        }

        public Criteria andConservationrecordLogidNotBetween(Integer value1, Integer value2) {
            addCriterion("ConservationRecord_LogID not between", value1, value2, "conservationrecordLogid");
            return (Criteria) this;
        }

        public Criteria andConservationrecordIdIsNull() {
            addCriterion("ConservationRecord_ID is null");
            return (Criteria) this;
        }

        public Criteria andConservationrecordIdIsNotNull() {
            addCriterion("ConservationRecord_ID is not null");
            return (Criteria) this;
        }

        public Criteria andConservationrecordIdEqualTo(Integer value) {
            addCriterion("ConservationRecord_ID =", value, "conservationrecordId");
            return (Criteria) this;
        }

        public Criteria andConservationrecordIdNotEqualTo(Integer value) {
            addCriterion("ConservationRecord_ID <>", value, "conservationrecordId");
            return (Criteria) this;
        }

        public Criteria andConservationrecordIdGreaterThan(Integer value) {
            addCriterion("ConservationRecord_ID >", value, "conservationrecordId");
            return (Criteria) this;
        }

        public Criteria andConservationrecordIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ConservationRecord_ID >=", value, "conservationrecordId");
            return (Criteria) this;
        }

        public Criteria andConservationrecordIdLessThan(Integer value) {
            addCriterion("ConservationRecord_ID <", value, "conservationrecordId");
            return (Criteria) this;
        }

        public Criteria andConservationrecordIdLessThanOrEqualTo(Integer value) {
            addCriterion("ConservationRecord_ID <=", value, "conservationrecordId");
            return (Criteria) this;
        }

        public Criteria andConservationrecordIdIn(List<Integer> values) {
            addCriterion("ConservationRecord_ID in", values, "conservationrecordId");
            return (Criteria) this;
        }

        public Criteria andConservationrecordIdNotIn(List<Integer> values) {
            addCriterion("ConservationRecord_ID not in", values, "conservationrecordId");
            return (Criteria) this;
        }

        public Criteria andConservationrecordIdBetween(Integer value1, Integer value2) {
            addCriterion("ConservationRecord_ID between", value1, value2, "conservationrecordId");
            return (Criteria) this;
        }

        public Criteria andConservationrecordIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ConservationRecord_ID not between", value1, value2, "conservationrecordId");
            return (Criteria) this;
        }

        public Criteria andConservationrecordPremodifiedstateIsNull() {
            addCriterion("ConservationRecord_PreModifiedState is null");
            return (Criteria) this;
        }

        public Criteria andConservationrecordPremodifiedstateIsNotNull() {
            addCriterion("ConservationRecord_PreModifiedState is not null");
            return (Criteria) this;
        }

        public Criteria andConservationrecordPremodifiedstateEqualTo(String value) {
            addCriterion("ConservationRecord_PreModifiedState =", value, "conservationrecordPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andConservationrecordPremodifiedstateNotEqualTo(String value) {
            addCriterion("ConservationRecord_PreModifiedState <>", value, "conservationrecordPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andConservationrecordPremodifiedstateGreaterThan(String value) {
            addCriterion("ConservationRecord_PreModifiedState >", value, "conservationrecordPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andConservationrecordPremodifiedstateGreaterThanOrEqualTo(String value) {
            addCriterion("ConservationRecord_PreModifiedState >=", value, "conservationrecordPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andConservationrecordPremodifiedstateLessThan(String value) {
            addCriterion("ConservationRecord_PreModifiedState <", value, "conservationrecordPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andConservationrecordPremodifiedstateLessThanOrEqualTo(String value) {
            addCriterion("ConservationRecord_PreModifiedState <=", value, "conservationrecordPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andConservationrecordPremodifiedstateLike(String value) {
            addCriterion("ConservationRecord_PreModifiedState like", value, "conservationrecordPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andConservationrecordPremodifiedstateNotLike(String value) {
            addCriterion("ConservationRecord_PreModifiedState not like", value, "conservationrecordPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andConservationrecordPremodifiedstateIn(List<String> values) {
            addCriterion("ConservationRecord_PreModifiedState in", values, "conservationrecordPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andConservationrecordPremodifiedstateNotIn(List<String> values) {
            addCriterion("ConservationRecord_PreModifiedState not in", values, "conservationrecordPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andConservationrecordPremodifiedstateBetween(String value1, String value2) {
            addCriterion("ConservationRecord_PreModifiedState between", value1, value2, "conservationrecordPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andConservationrecordPremodifiedstateNotBetween(String value1, String value2) {
            addCriterion("ConservationRecord_PreModifiedState not between", value1, value2, "conservationrecordPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andConservationrecordModifiedstateIsNull() {
            addCriterion("ConservationRecord_ModifiedState is null");
            return (Criteria) this;
        }

        public Criteria andConservationrecordModifiedstateIsNotNull() {
            addCriterion("ConservationRecord_ModifiedState is not null");
            return (Criteria) this;
        }

        public Criteria andConservationrecordModifiedstateEqualTo(String value) {
            addCriterion("ConservationRecord_ModifiedState =", value, "conservationrecordModifiedstate");
            return (Criteria) this;
        }

        public Criteria andConservationrecordModifiedstateNotEqualTo(String value) {
            addCriterion("ConservationRecord_ModifiedState <>", value, "conservationrecordModifiedstate");
            return (Criteria) this;
        }

        public Criteria andConservationrecordModifiedstateGreaterThan(String value) {
            addCriterion("ConservationRecord_ModifiedState >", value, "conservationrecordModifiedstate");
            return (Criteria) this;
        }

        public Criteria andConservationrecordModifiedstateGreaterThanOrEqualTo(String value) {
            addCriterion("ConservationRecord_ModifiedState >=", value, "conservationrecordModifiedstate");
            return (Criteria) this;
        }

        public Criteria andConservationrecordModifiedstateLessThan(String value) {
            addCriterion("ConservationRecord_ModifiedState <", value, "conservationrecordModifiedstate");
            return (Criteria) this;
        }

        public Criteria andConservationrecordModifiedstateLessThanOrEqualTo(String value) {
            addCriterion("ConservationRecord_ModifiedState <=", value, "conservationrecordModifiedstate");
            return (Criteria) this;
        }

        public Criteria andConservationrecordModifiedstateLike(String value) {
            addCriterion("ConservationRecord_ModifiedState like", value, "conservationrecordModifiedstate");
            return (Criteria) this;
        }

        public Criteria andConservationrecordModifiedstateNotLike(String value) {
            addCriterion("ConservationRecord_ModifiedState not like", value, "conservationrecordModifiedstate");
            return (Criteria) this;
        }

        public Criteria andConservationrecordModifiedstateIn(List<String> values) {
            addCriterion("ConservationRecord_ModifiedState in", values, "conservationrecordModifiedstate");
            return (Criteria) this;
        }

        public Criteria andConservationrecordModifiedstateNotIn(List<String> values) {
            addCriterion("ConservationRecord_ModifiedState not in", values, "conservationrecordModifiedstate");
            return (Criteria) this;
        }

        public Criteria andConservationrecordModifiedstateBetween(String value1, String value2) {
            addCriterion("ConservationRecord_ModifiedState between", value1, value2, "conservationrecordModifiedstate");
            return (Criteria) this;
        }

        public Criteria andConservationrecordModifiedstateNotBetween(String value1, String value2) {
            addCriterion("ConservationRecord_ModifiedState not between", value1, value2, "conservationrecordModifiedstate");
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
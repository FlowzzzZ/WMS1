package cn.hhu.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WmsBaseFactoryLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WmsBaseFactoryLogExample() {
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

        public Criteria andFactoryLogidIsNull() {
            addCriterion("Factory_LogID is null");
            return (Criteria) this;
        }

        public Criteria andFactoryLogidIsNotNull() {
            addCriterion("Factory_LogID is not null");
            return (Criteria) this;
        }

        public Criteria andFactoryLogidEqualTo(Integer value) {
            addCriterion("Factory_LogID =", value, "factoryLogid");
            return (Criteria) this;
        }

        public Criteria andFactoryLogidNotEqualTo(Integer value) {
            addCriterion("Factory_LogID <>", value, "factoryLogid");
            return (Criteria) this;
        }

        public Criteria andFactoryLogidGreaterThan(Integer value) {
            addCriterion("Factory_LogID >", value, "factoryLogid");
            return (Criteria) this;
        }

        public Criteria andFactoryLogidGreaterThanOrEqualTo(Integer value) {
            addCriterion("Factory_LogID >=", value, "factoryLogid");
            return (Criteria) this;
        }

        public Criteria andFactoryLogidLessThan(Integer value) {
            addCriterion("Factory_LogID <", value, "factoryLogid");
            return (Criteria) this;
        }

        public Criteria andFactoryLogidLessThanOrEqualTo(Integer value) {
            addCriterion("Factory_LogID <=", value, "factoryLogid");
            return (Criteria) this;
        }

        public Criteria andFactoryLogidIn(List<Integer> values) {
            addCriterion("Factory_LogID in", values, "factoryLogid");
            return (Criteria) this;
        }

        public Criteria andFactoryLogidNotIn(List<Integer> values) {
            addCriterion("Factory_LogID not in", values, "factoryLogid");
            return (Criteria) this;
        }

        public Criteria andFactoryLogidBetween(Integer value1, Integer value2) {
            addCriterion("Factory_LogID between", value1, value2, "factoryLogid");
            return (Criteria) this;
        }

        public Criteria andFactoryLogidNotBetween(Integer value1, Integer value2) {
            addCriterion("Factory_LogID not between", value1, value2, "factoryLogid");
            return (Criteria) this;
        }

        public Criteria andFactoryIdIsNull() {
            addCriterion("Factory_ID is null");
            return (Criteria) this;
        }

        public Criteria andFactoryIdIsNotNull() {
            addCriterion("Factory_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFactoryIdEqualTo(Integer value) {
            addCriterion("Factory_ID =", value, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdNotEqualTo(Integer value) {
            addCriterion("Factory_ID <>", value, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdGreaterThan(Integer value) {
            addCriterion("Factory_ID >", value, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Factory_ID >=", value, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdLessThan(Integer value) {
            addCriterion("Factory_ID <", value, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("Factory_ID <=", value, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdIn(List<Integer> values) {
            addCriterion("Factory_ID in", values, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdNotIn(List<Integer> values) {
            addCriterion("Factory_ID not in", values, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdBetween(Integer value1, Integer value2) {
            addCriterion("Factory_ID between", value1, value2, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Factory_ID not between", value1, value2, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryPremodifiedstateIsNull() {
            addCriterion("Factory_PreModifiedState is null");
            return (Criteria) this;
        }

        public Criteria andFactoryPremodifiedstateIsNotNull() {
            addCriterion("Factory_PreModifiedState is not null");
            return (Criteria) this;
        }

        public Criteria andFactoryPremodifiedstateEqualTo(String value) {
            addCriterion("Factory_PreModifiedState =", value, "factoryPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andFactoryPremodifiedstateNotEqualTo(String value) {
            addCriterion("Factory_PreModifiedState <>", value, "factoryPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andFactoryPremodifiedstateGreaterThan(String value) {
            addCriterion("Factory_PreModifiedState >", value, "factoryPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andFactoryPremodifiedstateGreaterThanOrEqualTo(String value) {
            addCriterion("Factory_PreModifiedState >=", value, "factoryPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andFactoryPremodifiedstateLessThan(String value) {
            addCriterion("Factory_PreModifiedState <", value, "factoryPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andFactoryPremodifiedstateLessThanOrEqualTo(String value) {
            addCriterion("Factory_PreModifiedState <=", value, "factoryPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andFactoryPremodifiedstateLike(String value) {
            addCriterion("Factory_PreModifiedState like", value, "factoryPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andFactoryPremodifiedstateNotLike(String value) {
            addCriterion("Factory_PreModifiedState not like", value, "factoryPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andFactoryPremodifiedstateIn(List<String> values) {
            addCriterion("Factory_PreModifiedState in", values, "factoryPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andFactoryPremodifiedstateNotIn(List<String> values) {
            addCriterion("Factory_PreModifiedState not in", values, "factoryPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andFactoryPremodifiedstateBetween(String value1, String value2) {
            addCriterion("Factory_PreModifiedState between", value1, value2, "factoryPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andFactoryPremodifiedstateNotBetween(String value1, String value2) {
            addCriterion("Factory_PreModifiedState not between", value1, value2, "factoryPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andFactoryModifiedstateIsNull() {
            addCriterion("Factory_ModifiedState is null");
            return (Criteria) this;
        }

        public Criteria andFactoryModifiedstateIsNotNull() {
            addCriterion("Factory_ModifiedState is not null");
            return (Criteria) this;
        }

        public Criteria andFactoryModifiedstateEqualTo(String value) {
            addCriterion("Factory_ModifiedState =", value, "factoryModifiedstate");
            return (Criteria) this;
        }

        public Criteria andFactoryModifiedstateNotEqualTo(String value) {
            addCriterion("Factory_ModifiedState <>", value, "factoryModifiedstate");
            return (Criteria) this;
        }

        public Criteria andFactoryModifiedstateGreaterThan(String value) {
            addCriterion("Factory_ModifiedState >", value, "factoryModifiedstate");
            return (Criteria) this;
        }

        public Criteria andFactoryModifiedstateGreaterThanOrEqualTo(String value) {
            addCriterion("Factory_ModifiedState >=", value, "factoryModifiedstate");
            return (Criteria) this;
        }

        public Criteria andFactoryModifiedstateLessThan(String value) {
            addCriterion("Factory_ModifiedState <", value, "factoryModifiedstate");
            return (Criteria) this;
        }

        public Criteria andFactoryModifiedstateLessThanOrEqualTo(String value) {
            addCriterion("Factory_ModifiedState <=", value, "factoryModifiedstate");
            return (Criteria) this;
        }

        public Criteria andFactoryModifiedstateLike(String value) {
            addCriterion("Factory_ModifiedState like", value, "factoryModifiedstate");
            return (Criteria) this;
        }

        public Criteria andFactoryModifiedstateNotLike(String value) {
            addCriterion("Factory_ModifiedState not like", value, "factoryModifiedstate");
            return (Criteria) this;
        }

        public Criteria andFactoryModifiedstateIn(List<String> values) {
            addCriterion("Factory_ModifiedState in", values, "factoryModifiedstate");
            return (Criteria) this;
        }

        public Criteria andFactoryModifiedstateNotIn(List<String> values) {
            addCriterion("Factory_ModifiedState not in", values, "factoryModifiedstate");
            return (Criteria) this;
        }

        public Criteria andFactoryModifiedstateBetween(String value1, String value2) {
            addCriterion("Factory_ModifiedState between", value1, value2, "factoryModifiedstate");
            return (Criteria) this;
        }

        public Criteria andFactoryModifiedstateNotBetween(String value1, String value2) {
            addCriterion("Factory_ModifiedState not between", value1, value2, "factoryModifiedstate");
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
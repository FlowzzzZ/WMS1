package cn.hhu.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WmsExplanLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WmsExplanLogExample() {
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

        public Criteria andExplanLogidIsNull() {
            addCriterion("EXPlan_LogID is null");
            return (Criteria) this;
        }

        public Criteria andExplanLogidIsNotNull() {
            addCriterion("EXPlan_LogID is not null");
            return (Criteria) this;
        }

        public Criteria andExplanLogidEqualTo(Integer value) {
            addCriterion("EXPlan_LogID =", value, "explanLogid");
            return (Criteria) this;
        }

        public Criteria andExplanLogidNotEqualTo(Integer value) {
            addCriterion("EXPlan_LogID <>", value, "explanLogid");
            return (Criteria) this;
        }

        public Criteria andExplanLogidGreaterThan(Integer value) {
            addCriterion("EXPlan_LogID >", value, "explanLogid");
            return (Criteria) this;
        }

        public Criteria andExplanLogidGreaterThanOrEqualTo(Integer value) {
            addCriterion("EXPlan_LogID >=", value, "explanLogid");
            return (Criteria) this;
        }

        public Criteria andExplanLogidLessThan(Integer value) {
            addCriterion("EXPlan_LogID <", value, "explanLogid");
            return (Criteria) this;
        }

        public Criteria andExplanLogidLessThanOrEqualTo(Integer value) {
            addCriterion("EXPlan_LogID <=", value, "explanLogid");
            return (Criteria) this;
        }

        public Criteria andExplanLogidIn(List<Integer> values) {
            addCriterion("EXPlan_LogID in", values, "explanLogid");
            return (Criteria) this;
        }

        public Criteria andExplanLogidNotIn(List<Integer> values) {
            addCriterion("EXPlan_LogID not in", values, "explanLogid");
            return (Criteria) this;
        }

        public Criteria andExplanLogidBetween(Integer value1, Integer value2) {
            addCriterion("EXPlan_LogID between", value1, value2, "explanLogid");
            return (Criteria) this;
        }

        public Criteria andExplanLogidNotBetween(Integer value1, Integer value2) {
            addCriterion("EXPlan_LogID not between", value1, value2, "explanLogid");
            return (Criteria) this;
        }

        public Criteria andExplanIdIsNull() {
            addCriterion("EXPlan_ID is null");
            return (Criteria) this;
        }

        public Criteria andExplanIdIsNotNull() {
            addCriterion("EXPlan_ID is not null");
            return (Criteria) this;
        }

        public Criteria andExplanIdEqualTo(Integer value) {
            addCriterion("EXPlan_ID =", value, "explanId");
            return (Criteria) this;
        }

        public Criteria andExplanIdNotEqualTo(Integer value) {
            addCriterion("EXPlan_ID <>", value, "explanId");
            return (Criteria) this;
        }

        public Criteria andExplanIdGreaterThan(Integer value) {
            addCriterion("EXPlan_ID >", value, "explanId");
            return (Criteria) this;
        }

        public Criteria andExplanIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("EXPlan_ID >=", value, "explanId");
            return (Criteria) this;
        }

        public Criteria andExplanIdLessThan(Integer value) {
            addCriterion("EXPlan_ID <", value, "explanId");
            return (Criteria) this;
        }

        public Criteria andExplanIdLessThanOrEqualTo(Integer value) {
            addCriterion("EXPlan_ID <=", value, "explanId");
            return (Criteria) this;
        }

        public Criteria andExplanIdIn(List<Integer> values) {
            addCriterion("EXPlan_ID in", values, "explanId");
            return (Criteria) this;
        }

        public Criteria andExplanIdNotIn(List<Integer> values) {
            addCriterion("EXPlan_ID not in", values, "explanId");
            return (Criteria) this;
        }

        public Criteria andExplanIdBetween(Integer value1, Integer value2) {
            addCriterion("EXPlan_ID between", value1, value2, "explanId");
            return (Criteria) this;
        }

        public Criteria andExplanIdNotBetween(Integer value1, Integer value2) {
            addCriterion("EXPlan_ID not between", value1, value2, "explanId");
            return (Criteria) this;
        }

        public Criteria andExplanPremodifiedstateIsNull() {
            addCriterion("EXPlan_PreModifiedState is null");
            return (Criteria) this;
        }

        public Criteria andExplanPremodifiedstateIsNotNull() {
            addCriterion("EXPlan_PreModifiedState is not null");
            return (Criteria) this;
        }

        public Criteria andExplanPremodifiedstateEqualTo(String value) {
            addCriterion("EXPlan_PreModifiedState =", value, "explanPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andExplanPremodifiedstateNotEqualTo(String value) {
            addCriterion("EXPlan_PreModifiedState <>", value, "explanPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andExplanPremodifiedstateGreaterThan(String value) {
            addCriterion("EXPlan_PreModifiedState >", value, "explanPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andExplanPremodifiedstateGreaterThanOrEqualTo(String value) {
            addCriterion("EXPlan_PreModifiedState >=", value, "explanPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andExplanPremodifiedstateLessThan(String value) {
            addCriterion("EXPlan_PreModifiedState <", value, "explanPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andExplanPremodifiedstateLessThanOrEqualTo(String value) {
            addCriterion("EXPlan_PreModifiedState <=", value, "explanPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andExplanPremodifiedstateLike(String value) {
            addCriterion("EXPlan_PreModifiedState like", value, "explanPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andExplanPremodifiedstateNotLike(String value) {
            addCriterion("EXPlan_PreModifiedState not like", value, "explanPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andExplanPremodifiedstateIn(List<String> values) {
            addCriterion("EXPlan_PreModifiedState in", values, "explanPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andExplanPremodifiedstateNotIn(List<String> values) {
            addCriterion("EXPlan_PreModifiedState not in", values, "explanPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andExplanPremodifiedstateBetween(String value1, String value2) {
            addCriterion("EXPlan_PreModifiedState between", value1, value2, "explanPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andExplanPremodifiedstateNotBetween(String value1, String value2) {
            addCriterion("EXPlan_PreModifiedState not between", value1, value2, "explanPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andExplanModifiedstateIsNull() {
            addCriterion("EXPlan_ModifiedState is null");
            return (Criteria) this;
        }

        public Criteria andExplanModifiedstateIsNotNull() {
            addCriterion("EXPlan_ModifiedState is not null");
            return (Criteria) this;
        }

        public Criteria andExplanModifiedstateEqualTo(String value) {
            addCriterion("EXPlan_ModifiedState =", value, "explanModifiedstate");
            return (Criteria) this;
        }

        public Criteria andExplanModifiedstateNotEqualTo(String value) {
            addCriterion("EXPlan_ModifiedState <>", value, "explanModifiedstate");
            return (Criteria) this;
        }

        public Criteria andExplanModifiedstateGreaterThan(String value) {
            addCriterion("EXPlan_ModifiedState >", value, "explanModifiedstate");
            return (Criteria) this;
        }

        public Criteria andExplanModifiedstateGreaterThanOrEqualTo(String value) {
            addCriterion("EXPlan_ModifiedState >=", value, "explanModifiedstate");
            return (Criteria) this;
        }

        public Criteria andExplanModifiedstateLessThan(String value) {
            addCriterion("EXPlan_ModifiedState <", value, "explanModifiedstate");
            return (Criteria) this;
        }

        public Criteria andExplanModifiedstateLessThanOrEqualTo(String value) {
            addCriterion("EXPlan_ModifiedState <=", value, "explanModifiedstate");
            return (Criteria) this;
        }

        public Criteria andExplanModifiedstateLike(String value) {
            addCriterion("EXPlan_ModifiedState like", value, "explanModifiedstate");
            return (Criteria) this;
        }

        public Criteria andExplanModifiedstateNotLike(String value) {
            addCriterion("EXPlan_ModifiedState not like", value, "explanModifiedstate");
            return (Criteria) this;
        }

        public Criteria andExplanModifiedstateIn(List<String> values) {
            addCriterion("EXPlan_ModifiedState in", values, "explanModifiedstate");
            return (Criteria) this;
        }

        public Criteria andExplanModifiedstateNotIn(List<String> values) {
            addCriterion("EXPlan_ModifiedState not in", values, "explanModifiedstate");
            return (Criteria) this;
        }

        public Criteria andExplanModifiedstateBetween(String value1, String value2) {
            addCriterion("EXPlan_ModifiedState between", value1, value2, "explanModifiedstate");
            return (Criteria) this;
        }

        public Criteria andExplanModifiedstateNotBetween(String value1, String value2) {
            addCriterion("EXPlan_ModifiedState not between", value1, value2, "explanModifiedstate");
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
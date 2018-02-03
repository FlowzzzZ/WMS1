package cn.hhu.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WmsBaseConservationplanLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WmsBaseConservationplanLogExample() {
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

        public Criteria andConservationplanLogidIsNull() {
            addCriterion("ConservationPlan_LogID is null");
            return (Criteria) this;
        }

        public Criteria andConservationplanLogidIsNotNull() {
            addCriterion("ConservationPlan_LogID is not null");
            return (Criteria) this;
        }

        public Criteria andConservationplanLogidEqualTo(Integer value) {
            addCriterion("ConservationPlan_LogID =", value, "conservationplanLogid");
            return (Criteria) this;
        }

        public Criteria andConservationplanLogidNotEqualTo(Integer value) {
            addCriterion("ConservationPlan_LogID <>", value, "conservationplanLogid");
            return (Criteria) this;
        }

        public Criteria andConservationplanLogidGreaterThan(Integer value) {
            addCriterion("ConservationPlan_LogID >", value, "conservationplanLogid");
            return (Criteria) this;
        }

        public Criteria andConservationplanLogidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ConservationPlan_LogID >=", value, "conservationplanLogid");
            return (Criteria) this;
        }

        public Criteria andConservationplanLogidLessThan(Integer value) {
            addCriterion("ConservationPlan_LogID <", value, "conservationplanLogid");
            return (Criteria) this;
        }

        public Criteria andConservationplanLogidLessThanOrEqualTo(Integer value) {
            addCriterion("ConservationPlan_LogID <=", value, "conservationplanLogid");
            return (Criteria) this;
        }

        public Criteria andConservationplanLogidIn(List<Integer> values) {
            addCriterion("ConservationPlan_LogID in", values, "conservationplanLogid");
            return (Criteria) this;
        }

        public Criteria andConservationplanLogidNotIn(List<Integer> values) {
            addCriterion("ConservationPlan_LogID not in", values, "conservationplanLogid");
            return (Criteria) this;
        }

        public Criteria andConservationplanLogidBetween(Integer value1, Integer value2) {
            addCriterion("ConservationPlan_LogID between", value1, value2, "conservationplanLogid");
            return (Criteria) this;
        }

        public Criteria andConservationplanLogidNotBetween(Integer value1, Integer value2) {
            addCriterion("ConservationPlan_LogID not between", value1, value2, "conservationplanLogid");
            return (Criteria) this;
        }

        public Criteria andConservationplanIdIsNull() {
            addCriterion("ConservationPlan_ID is null");
            return (Criteria) this;
        }

        public Criteria andConservationplanIdIsNotNull() {
            addCriterion("ConservationPlan_ID is not null");
            return (Criteria) this;
        }

        public Criteria andConservationplanIdEqualTo(Integer value) {
            addCriterion("ConservationPlan_ID =", value, "conservationplanId");
            return (Criteria) this;
        }

        public Criteria andConservationplanIdNotEqualTo(Integer value) {
            addCriterion("ConservationPlan_ID <>", value, "conservationplanId");
            return (Criteria) this;
        }

        public Criteria andConservationplanIdGreaterThan(Integer value) {
            addCriterion("ConservationPlan_ID >", value, "conservationplanId");
            return (Criteria) this;
        }

        public Criteria andConservationplanIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ConservationPlan_ID >=", value, "conservationplanId");
            return (Criteria) this;
        }

        public Criteria andConservationplanIdLessThan(Integer value) {
            addCriterion("ConservationPlan_ID <", value, "conservationplanId");
            return (Criteria) this;
        }

        public Criteria andConservationplanIdLessThanOrEqualTo(Integer value) {
            addCriterion("ConservationPlan_ID <=", value, "conservationplanId");
            return (Criteria) this;
        }

        public Criteria andConservationplanIdIn(List<Integer> values) {
            addCriterion("ConservationPlan_ID in", values, "conservationplanId");
            return (Criteria) this;
        }

        public Criteria andConservationplanIdNotIn(List<Integer> values) {
            addCriterion("ConservationPlan_ID not in", values, "conservationplanId");
            return (Criteria) this;
        }

        public Criteria andConservationplanIdBetween(Integer value1, Integer value2) {
            addCriterion("ConservationPlan_ID between", value1, value2, "conservationplanId");
            return (Criteria) this;
        }

        public Criteria andConservationplanIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ConservationPlan_ID not between", value1, value2, "conservationplanId");
            return (Criteria) this;
        }

        public Criteria andConservationplanPremodifiedstateIsNull() {
            addCriterion("ConservationPlan_PreModifiedState is null");
            return (Criteria) this;
        }

        public Criteria andConservationplanPremodifiedstateIsNotNull() {
            addCriterion("ConservationPlan_PreModifiedState is not null");
            return (Criteria) this;
        }

        public Criteria andConservationplanPremodifiedstateEqualTo(String value) {
            addCriterion("ConservationPlan_PreModifiedState =", value, "conservationplanPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andConservationplanPremodifiedstateNotEqualTo(String value) {
            addCriterion("ConservationPlan_PreModifiedState <>", value, "conservationplanPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andConservationplanPremodifiedstateGreaterThan(String value) {
            addCriterion("ConservationPlan_PreModifiedState >", value, "conservationplanPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andConservationplanPremodifiedstateGreaterThanOrEqualTo(String value) {
            addCriterion("ConservationPlan_PreModifiedState >=", value, "conservationplanPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andConservationplanPremodifiedstateLessThan(String value) {
            addCriterion("ConservationPlan_PreModifiedState <", value, "conservationplanPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andConservationplanPremodifiedstateLessThanOrEqualTo(String value) {
            addCriterion("ConservationPlan_PreModifiedState <=", value, "conservationplanPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andConservationplanPremodifiedstateLike(String value) {
            addCriterion("ConservationPlan_PreModifiedState like", value, "conservationplanPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andConservationplanPremodifiedstateNotLike(String value) {
            addCriterion("ConservationPlan_PreModifiedState not like", value, "conservationplanPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andConservationplanPremodifiedstateIn(List<String> values) {
            addCriterion("ConservationPlan_PreModifiedState in", values, "conservationplanPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andConservationplanPremodifiedstateNotIn(List<String> values) {
            addCriterion("ConservationPlan_PreModifiedState not in", values, "conservationplanPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andConservationplanPremodifiedstateBetween(String value1, String value2) {
            addCriterion("ConservationPlan_PreModifiedState between", value1, value2, "conservationplanPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andConservationplanPremodifiedstateNotBetween(String value1, String value2) {
            addCriterion("ConservationPlan_PreModifiedState not between", value1, value2, "conservationplanPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andConservationplanModifiedstateIsNull() {
            addCriterion("ConservationPlan_ModifiedState is null");
            return (Criteria) this;
        }

        public Criteria andConservationplanModifiedstateIsNotNull() {
            addCriterion("ConservationPlan_ModifiedState is not null");
            return (Criteria) this;
        }

        public Criteria andConservationplanModifiedstateEqualTo(String value) {
            addCriterion("ConservationPlan_ModifiedState =", value, "conservationplanModifiedstate");
            return (Criteria) this;
        }

        public Criteria andConservationplanModifiedstateNotEqualTo(String value) {
            addCriterion("ConservationPlan_ModifiedState <>", value, "conservationplanModifiedstate");
            return (Criteria) this;
        }

        public Criteria andConservationplanModifiedstateGreaterThan(String value) {
            addCriterion("ConservationPlan_ModifiedState >", value, "conservationplanModifiedstate");
            return (Criteria) this;
        }

        public Criteria andConservationplanModifiedstateGreaterThanOrEqualTo(String value) {
            addCriterion("ConservationPlan_ModifiedState >=", value, "conservationplanModifiedstate");
            return (Criteria) this;
        }

        public Criteria andConservationplanModifiedstateLessThan(String value) {
            addCriterion("ConservationPlan_ModifiedState <", value, "conservationplanModifiedstate");
            return (Criteria) this;
        }

        public Criteria andConservationplanModifiedstateLessThanOrEqualTo(String value) {
            addCriterion("ConservationPlan_ModifiedState <=", value, "conservationplanModifiedstate");
            return (Criteria) this;
        }

        public Criteria andConservationplanModifiedstateLike(String value) {
            addCriterion("ConservationPlan_ModifiedState like", value, "conservationplanModifiedstate");
            return (Criteria) this;
        }

        public Criteria andConservationplanModifiedstateNotLike(String value) {
            addCriterion("ConservationPlan_ModifiedState not like", value, "conservationplanModifiedstate");
            return (Criteria) this;
        }

        public Criteria andConservationplanModifiedstateIn(List<String> values) {
            addCriterion("ConservationPlan_ModifiedState in", values, "conservationplanModifiedstate");
            return (Criteria) this;
        }

        public Criteria andConservationplanModifiedstateNotIn(List<String> values) {
            addCriterion("ConservationPlan_ModifiedState not in", values, "conservationplanModifiedstate");
            return (Criteria) this;
        }

        public Criteria andConservationplanModifiedstateBetween(String value1, String value2) {
            addCriterion("ConservationPlan_ModifiedState between", value1, value2, "conservationplanModifiedstate");
            return (Criteria) this;
        }

        public Criteria andConservationplanModifiedstateNotBetween(String value1, String value2) {
            addCriterion("ConservationPlan_ModifiedState not between", value1, value2, "conservationplanModifiedstate");
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
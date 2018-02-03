package cn.hhu.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WmsImplanLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WmsImplanLogExample() {
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

        public Criteria andImplanLogidIsNull() {
            addCriterion("IMPlan_LogID is null");
            return (Criteria) this;
        }

        public Criteria andImplanLogidIsNotNull() {
            addCriterion("IMPlan_LogID is not null");
            return (Criteria) this;
        }

        public Criteria andImplanLogidEqualTo(Integer value) {
            addCriterion("IMPlan_LogID =", value, "implanLogid");
            return (Criteria) this;
        }

        public Criteria andImplanLogidNotEqualTo(Integer value) {
            addCriterion("IMPlan_LogID <>", value, "implanLogid");
            return (Criteria) this;
        }

        public Criteria andImplanLogidGreaterThan(Integer value) {
            addCriterion("IMPlan_LogID >", value, "implanLogid");
            return (Criteria) this;
        }

        public Criteria andImplanLogidGreaterThanOrEqualTo(Integer value) {
            addCriterion("IMPlan_LogID >=", value, "implanLogid");
            return (Criteria) this;
        }

        public Criteria andImplanLogidLessThan(Integer value) {
            addCriterion("IMPlan_LogID <", value, "implanLogid");
            return (Criteria) this;
        }

        public Criteria andImplanLogidLessThanOrEqualTo(Integer value) {
            addCriterion("IMPlan_LogID <=", value, "implanLogid");
            return (Criteria) this;
        }

        public Criteria andImplanLogidIn(List<Integer> values) {
            addCriterion("IMPlan_LogID in", values, "implanLogid");
            return (Criteria) this;
        }

        public Criteria andImplanLogidNotIn(List<Integer> values) {
            addCriterion("IMPlan_LogID not in", values, "implanLogid");
            return (Criteria) this;
        }

        public Criteria andImplanLogidBetween(Integer value1, Integer value2) {
            addCriterion("IMPlan_LogID between", value1, value2, "implanLogid");
            return (Criteria) this;
        }

        public Criteria andImplanLogidNotBetween(Integer value1, Integer value2) {
            addCriterion("IMPlan_LogID not between", value1, value2, "implanLogid");
            return (Criteria) this;
        }

        public Criteria andImplanIdIsNull() {
            addCriterion("IMPlan_ID is null");
            return (Criteria) this;
        }

        public Criteria andImplanIdIsNotNull() {
            addCriterion("IMPlan_ID is not null");
            return (Criteria) this;
        }

        public Criteria andImplanIdEqualTo(Integer value) {
            addCriterion("IMPlan_ID =", value, "implanId");
            return (Criteria) this;
        }

        public Criteria andImplanIdNotEqualTo(Integer value) {
            addCriterion("IMPlan_ID <>", value, "implanId");
            return (Criteria) this;
        }

        public Criteria andImplanIdGreaterThan(Integer value) {
            addCriterion("IMPlan_ID >", value, "implanId");
            return (Criteria) this;
        }

        public Criteria andImplanIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("IMPlan_ID >=", value, "implanId");
            return (Criteria) this;
        }

        public Criteria andImplanIdLessThan(Integer value) {
            addCriterion("IMPlan_ID <", value, "implanId");
            return (Criteria) this;
        }

        public Criteria andImplanIdLessThanOrEqualTo(Integer value) {
            addCriterion("IMPlan_ID <=", value, "implanId");
            return (Criteria) this;
        }

        public Criteria andImplanIdIn(List<Integer> values) {
            addCriterion("IMPlan_ID in", values, "implanId");
            return (Criteria) this;
        }

        public Criteria andImplanIdNotIn(List<Integer> values) {
            addCriterion("IMPlan_ID not in", values, "implanId");
            return (Criteria) this;
        }

        public Criteria andImplanIdBetween(Integer value1, Integer value2) {
            addCriterion("IMPlan_ID between", value1, value2, "implanId");
            return (Criteria) this;
        }

        public Criteria andImplanIdNotBetween(Integer value1, Integer value2) {
            addCriterion("IMPlan_ID not between", value1, value2, "implanId");
            return (Criteria) this;
        }

        public Criteria andImplanPremodifiedstateIsNull() {
            addCriterion("IMPlan_PreModifiedState is null");
            return (Criteria) this;
        }

        public Criteria andImplanPremodifiedstateIsNotNull() {
            addCriterion("IMPlan_PreModifiedState is not null");
            return (Criteria) this;
        }

        public Criteria andImplanPremodifiedstateEqualTo(String value) {
            addCriterion("IMPlan_PreModifiedState =", value, "implanPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andImplanPremodifiedstateNotEqualTo(String value) {
            addCriterion("IMPlan_PreModifiedState <>", value, "implanPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andImplanPremodifiedstateGreaterThan(String value) {
            addCriterion("IMPlan_PreModifiedState >", value, "implanPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andImplanPremodifiedstateGreaterThanOrEqualTo(String value) {
            addCriterion("IMPlan_PreModifiedState >=", value, "implanPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andImplanPremodifiedstateLessThan(String value) {
            addCriterion("IMPlan_PreModifiedState <", value, "implanPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andImplanPremodifiedstateLessThanOrEqualTo(String value) {
            addCriterion("IMPlan_PreModifiedState <=", value, "implanPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andImplanPremodifiedstateLike(String value) {
            addCriterion("IMPlan_PreModifiedState like", value, "implanPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andImplanPremodifiedstateNotLike(String value) {
            addCriterion("IMPlan_PreModifiedState not like", value, "implanPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andImplanPremodifiedstateIn(List<String> values) {
            addCriterion("IMPlan_PreModifiedState in", values, "implanPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andImplanPremodifiedstateNotIn(List<String> values) {
            addCriterion("IMPlan_PreModifiedState not in", values, "implanPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andImplanPremodifiedstateBetween(String value1, String value2) {
            addCriterion("IMPlan_PreModifiedState between", value1, value2, "implanPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andImplanPremodifiedstateNotBetween(String value1, String value2) {
            addCriterion("IMPlan_PreModifiedState not between", value1, value2, "implanPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andImplanModifiedstateIsNull() {
            addCriterion("IMPlan_ModifiedState is null");
            return (Criteria) this;
        }

        public Criteria andImplanModifiedstateIsNotNull() {
            addCriterion("IMPlan_ModifiedState is not null");
            return (Criteria) this;
        }

        public Criteria andImplanModifiedstateEqualTo(String value) {
            addCriterion("IMPlan_ModifiedState =", value, "implanModifiedstate");
            return (Criteria) this;
        }

        public Criteria andImplanModifiedstateNotEqualTo(String value) {
            addCriterion("IMPlan_ModifiedState <>", value, "implanModifiedstate");
            return (Criteria) this;
        }

        public Criteria andImplanModifiedstateGreaterThan(String value) {
            addCriterion("IMPlan_ModifiedState >", value, "implanModifiedstate");
            return (Criteria) this;
        }

        public Criteria andImplanModifiedstateGreaterThanOrEqualTo(String value) {
            addCriterion("IMPlan_ModifiedState >=", value, "implanModifiedstate");
            return (Criteria) this;
        }

        public Criteria andImplanModifiedstateLessThan(String value) {
            addCriterion("IMPlan_ModifiedState <", value, "implanModifiedstate");
            return (Criteria) this;
        }

        public Criteria andImplanModifiedstateLessThanOrEqualTo(String value) {
            addCriterion("IMPlan_ModifiedState <=", value, "implanModifiedstate");
            return (Criteria) this;
        }

        public Criteria andImplanModifiedstateLike(String value) {
            addCriterion("IMPlan_ModifiedState like", value, "implanModifiedstate");
            return (Criteria) this;
        }

        public Criteria andImplanModifiedstateNotLike(String value) {
            addCriterion("IMPlan_ModifiedState not like", value, "implanModifiedstate");
            return (Criteria) this;
        }

        public Criteria andImplanModifiedstateIn(List<String> values) {
            addCriterion("IMPlan_ModifiedState in", values, "implanModifiedstate");
            return (Criteria) this;
        }

        public Criteria andImplanModifiedstateNotIn(List<String> values) {
            addCriterion("IMPlan_ModifiedState not in", values, "implanModifiedstate");
            return (Criteria) this;
        }

        public Criteria andImplanModifiedstateBetween(String value1, String value2) {
            addCriterion("IMPlan_ModifiedState between", value1, value2, "implanModifiedstate");
            return (Criteria) this;
        }

        public Criteria andImplanModifiedstateNotBetween(String value1, String value2) {
            addCriterion("IMPlan_ModifiedState not between", value1, value2, "implanModifiedstate");
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
package cn.hhu.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WmsBoxLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WmsBoxLogExample() {
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

        public Criteria andBoxLogidIsNull() {
            addCriterion("Box_LogID is null");
            return (Criteria) this;
        }

        public Criteria andBoxLogidIsNotNull() {
            addCriterion("Box_LogID is not null");
            return (Criteria) this;
        }

        public Criteria andBoxLogidEqualTo(Integer value) {
            addCriterion("Box_LogID =", value, "boxLogid");
            return (Criteria) this;
        }

        public Criteria andBoxLogidNotEqualTo(Integer value) {
            addCriterion("Box_LogID <>", value, "boxLogid");
            return (Criteria) this;
        }

        public Criteria andBoxLogidGreaterThan(Integer value) {
            addCriterion("Box_LogID >", value, "boxLogid");
            return (Criteria) this;
        }

        public Criteria andBoxLogidGreaterThanOrEqualTo(Integer value) {
            addCriterion("Box_LogID >=", value, "boxLogid");
            return (Criteria) this;
        }

        public Criteria andBoxLogidLessThan(Integer value) {
            addCriterion("Box_LogID <", value, "boxLogid");
            return (Criteria) this;
        }

        public Criteria andBoxLogidLessThanOrEqualTo(Integer value) {
            addCriterion("Box_LogID <=", value, "boxLogid");
            return (Criteria) this;
        }

        public Criteria andBoxLogidIn(List<Integer> values) {
            addCriterion("Box_LogID in", values, "boxLogid");
            return (Criteria) this;
        }

        public Criteria andBoxLogidNotIn(List<Integer> values) {
            addCriterion("Box_LogID not in", values, "boxLogid");
            return (Criteria) this;
        }

        public Criteria andBoxLogidBetween(Integer value1, Integer value2) {
            addCriterion("Box_LogID between", value1, value2, "boxLogid");
            return (Criteria) this;
        }

        public Criteria andBoxLogidNotBetween(Integer value1, Integer value2) {
            addCriterion("Box_LogID not between", value1, value2, "boxLogid");
            return (Criteria) this;
        }

        public Criteria andBoxIdIsNull() {
            addCriterion("Box_ID is null");
            return (Criteria) this;
        }

        public Criteria andBoxIdIsNotNull() {
            addCriterion("Box_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBoxIdEqualTo(Integer value) {
            addCriterion("Box_ID =", value, "boxId");
            return (Criteria) this;
        }

        public Criteria andBoxIdNotEqualTo(Integer value) {
            addCriterion("Box_ID <>", value, "boxId");
            return (Criteria) this;
        }

        public Criteria andBoxIdGreaterThan(Integer value) {
            addCriterion("Box_ID >", value, "boxId");
            return (Criteria) this;
        }

        public Criteria andBoxIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Box_ID >=", value, "boxId");
            return (Criteria) this;
        }

        public Criteria andBoxIdLessThan(Integer value) {
            addCriterion("Box_ID <", value, "boxId");
            return (Criteria) this;
        }

        public Criteria andBoxIdLessThanOrEqualTo(Integer value) {
            addCriterion("Box_ID <=", value, "boxId");
            return (Criteria) this;
        }

        public Criteria andBoxIdIn(List<Integer> values) {
            addCriterion("Box_ID in", values, "boxId");
            return (Criteria) this;
        }

        public Criteria andBoxIdNotIn(List<Integer> values) {
            addCriterion("Box_ID not in", values, "boxId");
            return (Criteria) this;
        }

        public Criteria andBoxIdBetween(Integer value1, Integer value2) {
            addCriterion("Box_ID between", value1, value2, "boxId");
            return (Criteria) this;
        }

        public Criteria andBoxIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Box_ID not between", value1, value2, "boxId");
            return (Criteria) this;
        }

        public Criteria andBoxPremodifiedstateIsNull() {
            addCriterion("Box_PreModifiedState is null");
            return (Criteria) this;
        }

        public Criteria andBoxPremodifiedstateIsNotNull() {
            addCriterion("Box_PreModifiedState is not null");
            return (Criteria) this;
        }

        public Criteria andBoxPremodifiedstateEqualTo(String value) {
            addCriterion("Box_PreModifiedState =", value, "boxPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andBoxPremodifiedstateNotEqualTo(String value) {
            addCriterion("Box_PreModifiedState <>", value, "boxPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andBoxPremodifiedstateGreaterThan(String value) {
            addCriterion("Box_PreModifiedState >", value, "boxPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andBoxPremodifiedstateGreaterThanOrEqualTo(String value) {
            addCriterion("Box_PreModifiedState >=", value, "boxPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andBoxPremodifiedstateLessThan(String value) {
            addCriterion("Box_PreModifiedState <", value, "boxPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andBoxPremodifiedstateLessThanOrEqualTo(String value) {
            addCriterion("Box_PreModifiedState <=", value, "boxPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andBoxPremodifiedstateLike(String value) {
            addCriterion("Box_PreModifiedState like", value, "boxPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andBoxPremodifiedstateNotLike(String value) {
            addCriterion("Box_PreModifiedState not like", value, "boxPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andBoxPremodifiedstateIn(List<String> values) {
            addCriterion("Box_PreModifiedState in", values, "boxPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andBoxPremodifiedstateNotIn(List<String> values) {
            addCriterion("Box_PreModifiedState not in", values, "boxPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andBoxPremodifiedstateBetween(String value1, String value2) {
            addCriterion("Box_PreModifiedState between", value1, value2, "boxPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andBoxPremodifiedstateNotBetween(String value1, String value2) {
            addCriterion("Box_PreModifiedState not between", value1, value2, "boxPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andBoxModifiedstateIsNull() {
            addCriterion("Box_ModifiedState is null");
            return (Criteria) this;
        }

        public Criteria andBoxModifiedstateIsNotNull() {
            addCriterion("Box_ModifiedState is not null");
            return (Criteria) this;
        }

        public Criteria andBoxModifiedstateEqualTo(String value) {
            addCriterion("Box_ModifiedState =", value, "boxModifiedstate");
            return (Criteria) this;
        }

        public Criteria andBoxModifiedstateNotEqualTo(String value) {
            addCriterion("Box_ModifiedState <>", value, "boxModifiedstate");
            return (Criteria) this;
        }

        public Criteria andBoxModifiedstateGreaterThan(String value) {
            addCriterion("Box_ModifiedState >", value, "boxModifiedstate");
            return (Criteria) this;
        }

        public Criteria andBoxModifiedstateGreaterThanOrEqualTo(String value) {
            addCriterion("Box_ModifiedState >=", value, "boxModifiedstate");
            return (Criteria) this;
        }

        public Criteria andBoxModifiedstateLessThan(String value) {
            addCriterion("Box_ModifiedState <", value, "boxModifiedstate");
            return (Criteria) this;
        }

        public Criteria andBoxModifiedstateLessThanOrEqualTo(String value) {
            addCriterion("Box_ModifiedState <=", value, "boxModifiedstate");
            return (Criteria) this;
        }

        public Criteria andBoxModifiedstateLike(String value) {
            addCriterion("Box_ModifiedState like", value, "boxModifiedstate");
            return (Criteria) this;
        }

        public Criteria andBoxModifiedstateNotLike(String value) {
            addCriterion("Box_ModifiedState not like", value, "boxModifiedstate");
            return (Criteria) this;
        }

        public Criteria andBoxModifiedstateIn(List<String> values) {
            addCriterion("Box_ModifiedState in", values, "boxModifiedstate");
            return (Criteria) this;
        }

        public Criteria andBoxModifiedstateNotIn(List<String> values) {
            addCriterion("Box_ModifiedState not in", values, "boxModifiedstate");
            return (Criteria) this;
        }

        public Criteria andBoxModifiedstateBetween(String value1, String value2) {
            addCriterion("Box_ModifiedState between", value1, value2, "boxModifiedstate");
            return (Criteria) this;
        }

        public Criteria andBoxModifiedstateNotBetween(String value1, String value2) {
            addCriterion("Box_ModifiedState not between", value1, value2, "boxModifiedstate");
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
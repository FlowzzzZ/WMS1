package cn.hhu.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WmsSerialnumberLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WmsSerialnumberLogExample() {
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

        public Criteria andSerialnumberLogidIsNull() {
            addCriterion("SerialNumber_LogID is null");
            return (Criteria) this;
        }

        public Criteria andSerialnumberLogidIsNotNull() {
            addCriterion("SerialNumber_LogID is not null");
            return (Criteria) this;
        }

        public Criteria andSerialnumberLogidEqualTo(Integer value) {
            addCriterion("SerialNumber_LogID =", value, "serialnumberLogid");
            return (Criteria) this;
        }

        public Criteria andSerialnumberLogidNotEqualTo(Integer value) {
            addCriterion("SerialNumber_LogID <>", value, "serialnumberLogid");
            return (Criteria) this;
        }

        public Criteria andSerialnumberLogidGreaterThan(Integer value) {
            addCriterion("SerialNumber_LogID >", value, "serialnumberLogid");
            return (Criteria) this;
        }

        public Criteria andSerialnumberLogidGreaterThanOrEqualTo(Integer value) {
            addCriterion("SerialNumber_LogID >=", value, "serialnumberLogid");
            return (Criteria) this;
        }

        public Criteria andSerialnumberLogidLessThan(Integer value) {
            addCriterion("SerialNumber_LogID <", value, "serialnumberLogid");
            return (Criteria) this;
        }

        public Criteria andSerialnumberLogidLessThanOrEqualTo(Integer value) {
            addCriterion("SerialNumber_LogID <=", value, "serialnumberLogid");
            return (Criteria) this;
        }

        public Criteria andSerialnumberLogidIn(List<Integer> values) {
            addCriterion("SerialNumber_LogID in", values, "serialnumberLogid");
            return (Criteria) this;
        }

        public Criteria andSerialnumberLogidNotIn(List<Integer> values) {
            addCriterion("SerialNumber_LogID not in", values, "serialnumberLogid");
            return (Criteria) this;
        }

        public Criteria andSerialnumberLogidBetween(Integer value1, Integer value2) {
            addCriterion("SerialNumber_LogID between", value1, value2, "serialnumberLogid");
            return (Criteria) this;
        }

        public Criteria andSerialnumberLogidNotBetween(Integer value1, Integer value2) {
            addCriterion("SerialNumber_LogID not between", value1, value2, "serialnumberLogid");
            return (Criteria) this;
        }

        public Criteria andSerialnumberIdIsNull() {
            addCriterion("SerialNumber_ID is null");
            return (Criteria) this;
        }

        public Criteria andSerialnumberIdIsNotNull() {
            addCriterion("SerialNumber_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSerialnumberIdEqualTo(Integer value) {
            addCriterion("SerialNumber_ID =", value, "serialnumberId");
            return (Criteria) this;
        }

        public Criteria andSerialnumberIdNotEqualTo(Integer value) {
            addCriterion("SerialNumber_ID <>", value, "serialnumberId");
            return (Criteria) this;
        }

        public Criteria andSerialnumberIdGreaterThan(Integer value) {
            addCriterion("SerialNumber_ID >", value, "serialnumberId");
            return (Criteria) this;
        }

        public Criteria andSerialnumberIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SerialNumber_ID >=", value, "serialnumberId");
            return (Criteria) this;
        }

        public Criteria andSerialnumberIdLessThan(Integer value) {
            addCriterion("SerialNumber_ID <", value, "serialnumberId");
            return (Criteria) this;
        }

        public Criteria andSerialnumberIdLessThanOrEqualTo(Integer value) {
            addCriterion("SerialNumber_ID <=", value, "serialnumberId");
            return (Criteria) this;
        }

        public Criteria andSerialnumberIdIn(List<Integer> values) {
            addCriterion("SerialNumber_ID in", values, "serialnumberId");
            return (Criteria) this;
        }

        public Criteria andSerialnumberIdNotIn(List<Integer> values) {
            addCriterion("SerialNumber_ID not in", values, "serialnumberId");
            return (Criteria) this;
        }

        public Criteria andSerialnumberIdBetween(Integer value1, Integer value2) {
            addCriterion("SerialNumber_ID between", value1, value2, "serialnumberId");
            return (Criteria) this;
        }

        public Criteria andSerialnumberIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SerialNumber_ID not between", value1, value2, "serialnumberId");
            return (Criteria) this;
        }

        public Criteria andSerialnumberPremodifiedstateIsNull() {
            addCriterion("SerialNumber_PreModifiedState is null");
            return (Criteria) this;
        }

        public Criteria andSerialnumberPremodifiedstateIsNotNull() {
            addCriterion("SerialNumber_PreModifiedState is not null");
            return (Criteria) this;
        }

        public Criteria andSerialnumberPremodifiedstateEqualTo(String value) {
            addCriterion("SerialNumber_PreModifiedState =", value, "serialnumberPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andSerialnumberPremodifiedstateNotEqualTo(String value) {
            addCriterion("SerialNumber_PreModifiedState <>", value, "serialnumberPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andSerialnumberPremodifiedstateGreaterThan(String value) {
            addCriterion("SerialNumber_PreModifiedState >", value, "serialnumberPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andSerialnumberPremodifiedstateGreaterThanOrEqualTo(String value) {
            addCriterion("SerialNumber_PreModifiedState >=", value, "serialnumberPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andSerialnumberPremodifiedstateLessThan(String value) {
            addCriterion("SerialNumber_PreModifiedState <", value, "serialnumberPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andSerialnumberPremodifiedstateLessThanOrEqualTo(String value) {
            addCriterion("SerialNumber_PreModifiedState <=", value, "serialnumberPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andSerialnumberPremodifiedstateLike(String value) {
            addCriterion("SerialNumber_PreModifiedState like", value, "serialnumberPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andSerialnumberPremodifiedstateNotLike(String value) {
            addCriterion("SerialNumber_PreModifiedState not like", value, "serialnumberPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andSerialnumberPremodifiedstateIn(List<String> values) {
            addCriterion("SerialNumber_PreModifiedState in", values, "serialnumberPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andSerialnumberPremodifiedstateNotIn(List<String> values) {
            addCriterion("SerialNumber_PreModifiedState not in", values, "serialnumberPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andSerialnumberPremodifiedstateBetween(String value1, String value2) {
            addCriterion("SerialNumber_PreModifiedState between", value1, value2, "serialnumberPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andSerialnumberPremodifiedstateNotBetween(String value1, String value2) {
            addCriterion("SerialNumber_PreModifiedState not between", value1, value2, "serialnumberPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andSerialnumberModifiedstateIsNull() {
            addCriterion("SerialNumber_ModifiedState is null");
            return (Criteria) this;
        }

        public Criteria andSerialnumberModifiedstateIsNotNull() {
            addCriterion("SerialNumber_ModifiedState is not null");
            return (Criteria) this;
        }

        public Criteria andSerialnumberModifiedstateEqualTo(String value) {
            addCriterion("SerialNumber_ModifiedState =", value, "serialnumberModifiedstate");
            return (Criteria) this;
        }

        public Criteria andSerialnumberModifiedstateNotEqualTo(String value) {
            addCriterion("SerialNumber_ModifiedState <>", value, "serialnumberModifiedstate");
            return (Criteria) this;
        }

        public Criteria andSerialnumberModifiedstateGreaterThan(String value) {
            addCriterion("SerialNumber_ModifiedState >", value, "serialnumberModifiedstate");
            return (Criteria) this;
        }

        public Criteria andSerialnumberModifiedstateGreaterThanOrEqualTo(String value) {
            addCriterion("SerialNumber_ModifiedState >=", value, "serialnumberModifiedstate");
            return (Criteria) this;
        }

        public Criteria andSerialnumberModifiedstateLessThan(String value) {
            addCriterion("SerialNumber_ModifiedState <", value, "serialnumberModifiedstate");
            return (Criteria) this;
        }

        public Criteria andSerialnumberModifiedstateLessThanOrEqualTo(String value) {
            addCriterion("SerialNumber_ModifiedState <=", value, "serialnumberModifiedstate");
            return (Criteria) this;
        }

        public Criteria andSerialnumberModifiedstateLike(String value) {
            addCriterion("SerialNumber_ModifiedState like", value, "serialnumberModifiedstate");
            return (Criteria) this;
        }

        public Criteria andSerialnumberModifiedstateNotLike(String value) {
            addCriterion("SerialNumber_ModifiedState not like", value, "serialnumberModifiedstate");
            return (Criteria) this;
        }

        public Criteria andSerialnumberModifiedstateIn(List<String> values) {
            addCriterion("SerialNumber_ModifiedState in", values, "serialnumberModifiedstate");
            return (Criteria) this;
        }

        public Criteria andSerialnumberModifiedstateNotIn(List<String> values) {
            addCriterion("SerialNumber_ModifiedState not in", values, "serialnumberModifiedstate");
            return (Criteria) this;
        }

        public Criteria andSerialnumberModifiedstateBetween(String value1, String value2) {
            addCriterion("SerialNumber_ModifiedState between", value1, value2, "serialnumberModifiedstate");
            return (Criteria) this;
        }

        public Criteria andSerialnumberModifiedstateNotBetween(String value1, String value2) {
            addCriterion("SerialNumber_ModifiedState not between", value1, value2, "serialnumberModifiedstate");
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
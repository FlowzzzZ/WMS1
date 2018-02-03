package cn.hhu.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WmsLocationLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WmsLocationLogExample() {
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

        public Criteria andLocationsLogidIsNull() {
            addCriterion("Locations_LogID is null");
            return (Criteria) this;
        }

        public Criteria andLocationsLogidIsNotNull() {
            addCriterion("Locations_LogID is not null");
            return (Criteria) this;
        }

        public Criteria andLocationsLogidEqualTo(Integer value) {
            addCriterion("Locations_LogID =", value, "locationsLogid");
            return (Criteria) this;
        }

        public Criteria andLocationsLogidNotEqualTo(Integer value) {
            addCriterion("Locations_LogID <>", value, "locationsLogid");
            return (Criteria) this;
        }

        public Criteria andLocationsLogidGreaterThan(Integer value) {
            addCriterion("Locations_LogID >", value, "locationsLogid");
            return (Criteria) this;
        }

        public Criteria andLocationsLogidGreaterThanOrEqualTo(Integer value) {
            addCriterion("Locations_LogID >=", value, "locationsLogid");
            return (Criteria) this;
        }

        public Criteria andLocationsLogidLessThan(Integer value) {
            addCriterion("Locations_LogID <", value, "locationsLogid");
            return (Criteria) this;
        }

        public Criteria andLocationsLogidLessThanOrEqualTo(Integer value) {
            addCriterion("Locations_LogID <=", value, "locationsLogid");
            return (Criteria) this;
        }

        public Criteria andLocationsLogidIn(List<Integer> values) {
            addCriterion("Locations_LogID in", values, "locationsLogid");
            return (Criteria) this;
        }

        public Criteria andLocationsLogidNotIn(List<Integer> values) {
            addCriterion("Locations_LogID not in", values, "locationsLogid");
            return (Criteria) this;
        }

        public Criteria andLocationsLogidBetween(Integer value1, Integer value2) {
            addCriterion("Locations_LogID between", value1, value2, "locationsLogid");
            return (Criteria) this;
        }

        public Criteria andLocationsLogidNotBetween(Integer value1, Integer value2) {
            addCriterion("Locations_LogID not between", value1, value2, "locationsLogid");
            return (Criteria) this;
        }

        public Criteria andLocationsIdIsNull() {
            addCriterion("Locations_ID is null");
            return (Criteria) this;
        }

        public Criteria andLocationsIdIsNotNull() {
            addCriterion("Locations_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLocationsIdEqualTo(Integer value) {
            addCriterion("Locations_ID =", value, "locationsId");
            return (Criteria) this;
        }

        public Criteria andLocationsIdNotEqualTo(Integer value) {
            addCriterion("Locations_ID <>", value, "locationsId");
            return (Criteria) this;
        }

        public Criteria andLocationsIdGreaterThan(Integer value) {
            addCriterion("Locations_ID >", value, "locationsId");
            return (Criteria) this;
        }

        public Criteria andLocationsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Locations_ID >=", value, "locationsId");
            return (Criteria) this;
        }

        public Criteria andLocationsIdLessThan(Integer value) {
            addCriterion("Locations_ID <", value, "locationsId");
            return (Criteria) this;
        }

        public Criteria andLocationsIdLessThanOrEqualTo(Integer value) {
            addCriterion("Locations_ID <=", value, "locationsId");
            return (Criteria) this;
        }

        public Criteria andLocationsIdIn(List<Integer> values) {
            addCriterion("Locations_ID in", values, "locationsId");
            return (Criteria) this;
        }

        public Criteria andLocationsIdNotIn(List<Integer> values) {
            addCriterion("Locations_ID not in", values, "locationsId");
            return (Criteria) this;
        }

        public Criteria andLocationsIdBetween(Integer value1, Integer value2) {
            addCriterion("Locations_ID between", value1, value2, "locationsId");
            return (Criteria) this;
        }

        public Criteria andLocationsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Locations_ID not between", value1, value2, "locationsId");
            return (Criteria) this;
        }

        public Criteria andLocationsPremodifiedstateIsNull() {
            addCriterion("Locations_PreModifiedState is null");
            return (Criteria) this;
        }

        public Criteria andLocationsPremodifiedstateIsNotNull() {
            addCriterion("Locations_PreModifiedState is not null");
            return (Criteria) this;
        }

        public Criteria andLocationsPremodifiedstateEqualTo(String value) {
            addCriterion("Locations_PreModifiedState =", value, "locationsPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andLocationsPremodifiedstateNotEqualTo(String value) {
            addCriterion("Locations_PreModifiedState <>", value, "locationsPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andLocationsPremodifiedstateGreaterThan(String value) {
            addCriterion("Locations_PreModifiedState >", value, "locationsPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andLocationsPremodifiedstateGreaterThanOrEqualTo(String value) {
            addCriterion("Locations_PreModifiedState >=", value, "locationsPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andLocationsPremodifiedstateLessThan(String value) {
            addCriterion("Locations_PreModifiedState <", value, "locationsPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andLocationsPremodifiedstateLessThanOrEqualTo(String value) {
            addCriterion("Locations_PreModifiedState <=", value, "locationsPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andLocationsPremodifiedstateLike(String value) {
            addCriterion("Locations_PreModifiedState like", value, "locationsPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andLocationsPremodifiedstateNotLike(String value) {
            addCriterion("Locations_PreModifiedState not like", value, "locationsPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andLocationsPremodifiedstateIn(List<String> values) {
            addCriterion("Locations_PreModifiedState in", values, "locationsPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andLocationsPremodifiedstateNotIn(List<String> values) {
            addCriterion("Locations_PreModifiedState not in", values, "locationsPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andLocationsPremodifiedstateBetween(String value1, String value2) {
            addCriterion("Locations_PreModifiedState between", value1, value2, "locationsPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andLocationsPremodifiedstateNotBetween(String value1, String value2) {
            addCriterion("Locations_PreModifiedState not between", value1, value2, "locationsPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andLocationsModifiedstateIsNull() {
            addCriterion("Locations_ModifiedState is null");
            return (Criteria) this;
        }

        public Criteria andLocationsModifiedstateIsNotNull() {
            addCriterion("Locations_ModifiedState is not null");
            return (Criteria) this;
        }

        public Criteria andLocationsModifiedstateEqualTo(String value) {
            addCriterion("Locations_ModifiedState =", value, "locationsModifiedstate");
            return (Criteria) this;
        }

        public Criteria andLocationsModifiedstateNotEqualTo(String value) {
            addCriterion("Locations_ModifiedState <>", value, "locationsModifiedstate");
            return (Criteria) this;
        }

        public Criteria andLocationsModifiedstateGreaterThan(String value) {
            addCriterion("Locations_ModifiedState >", value, "locationsModifiedstate");
            return (Criteria) this;
        }

        public Criteria andLocationsModifiedstateGreaterThanOrEqualTo(String value) {
            addCriterion("Locations_ModifiedState >=", value, "locationsModifiedstate");
            return (Criteria) this;
        }

        public Criteria andLocationsModifiedstateLessThan(String value) {
            addCriterion("Locations_ModifiedState <", value, "locationsModifiedstate");
            return (Criteria) this;
        }

        public Criteria andLocationsModifiedstateLessThanOrEqualTo(String value) {
            addCriterion("Locations_ModifiedState <=", value, "locationsModifiedstate");
            return (Criteria) this;
        }

        public Criteria andLocationsModifiedstateLike(String value) {
            addCriterion("Locations_ModifiedState like", value, "locationsModifiedstate");
            return (Criteria) this;
        }

        public Criteria andLocationsModifiedstateNotLike(String value) {
            addCriterion("Locations_ModifiedState not like", value, "locationsModifiedstate");
            return (Criteria) this;
        }

        public Criteria andLocationsModifiedstateIn(List<String> values) {
            addCriterion("Locations_ModifiedState in", values, "locationsModifiedstate");
            return (Criteria) this;
        }

        public Criteria andLocationsModifiedstateNotIn(List<String> values) {
            addCriterion("Locations_ModifiedState not in", values, "locationsModifiedstate");
            return (Criteria) this;
        }

        public Criteria andLocationsModifiedstateBetween(String value1, String value2) {
            addCriterion("Locations_ModifiedState between", value1, value2, "locationsModifiedstate");
            return (Criteria) this;
        }

        public Criteria andLocationsModifiedstateNotBetween(String value1, String value2) {
            addCriterion("Locations_ModifiedState not between", value1, value2, "locationsModifiedstate");
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
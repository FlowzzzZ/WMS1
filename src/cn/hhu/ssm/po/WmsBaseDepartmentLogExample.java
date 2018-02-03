package cn.hhu.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WmsBaseDepartmentLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WmsBaseDepartmentLogExample() {
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

        public Criteria andDepartmentLogidIsNull() {
            addCriterion("Department_LogID is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentLogidIsNotNull() {
            addCriterion("Department_LogID is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentLogidEqualTo(Integer value) {
            addCriterion("Department_LogID =", value, "departmentLogid");
            return (Criteria) this;
        }

        public Criteria andDepartmentLogidNotEqualTo(Integer value) {
            addCriterion("Department_LogID <>", value, "departmentLogid");
            return (Criteria) this;
        }

        public Criteria andDepartmentLogidGreaterThan(Integer value) {
            addCriterion("Department_LogID >", value, "departmentLogid");
            return (Criteria) this;
        }

        public Criteria andDepartmentLogidGreaterThanOrEqualTo(Integer value) {
            addCriterion("Department_LogID >=", value, "departmentLogid");
            return (Criteria) this;
        }

        public Criteria andDepartmentLogidLessThan(Integer value) {
            addCriterion("Department_LogID <", value, "departmentLogid");
            return (Criteria) this;
        }

        public Criteria andDepartmentLogidLessThanOrEqualTo(Integer value) {
            addCriterion("Department_LogID <=", value, "departmentLogid");
            return (Criteria) this;
        }

        public Criteria andDepartmentLogidIn(List<Integer> values) {
            addCriterion("Department_LogID in", values, "departmentLogid");
            return (Criteria) this;
        }

        public Criteria andDepartmentLogidNotIn(List<Integer> values) {
            addCriterion("Department_LogID not in", values, "departmentLogid");
            return (Criteria) this;
        }

        public Criteria andDepartmentLogidBetween(Integer value1, Integer value2) {
            addCriterion("Department_LogID between", value1, value2, "departmentLogid");
            return (Criteria) this;
        }

        public Criteria andDepartmentLogidNotBetween(Integer value1, Integer value2) {
            addCriterion("Department_LogID not between", value1, value2, "departmentLogid");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNull() {
            addCriterion("Department_ID is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNotNull() {
            addCriterion("Department_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdEqualTo(Integer value) {
            addCriterion("Department_ID =", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotEqualTo(Integer value) {
            addCriterion("Department_ID <>", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThan(Integer value) {
            addCriterion("Department_ID >", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Department_ID >=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThan(Integer value) {
            addCriterion("Department_ID <", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThanOrEqualTo(Integer value) {
            addCriterion("Department_ID <=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIn(List<Integer> values) {
            addCriterion("Department_ID in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotIn(List<Integer> values) {
            addCriterion("Department_ID not in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdBetween(Integer value1, Integer value2) {
            addCriterion("Department_ID between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Department_ID not between", value1, value2, "departmentId");
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

        public Criteria andDepartmentPremodifiedstateIsNull() {
            addCriterion("Department_PreModifiedState is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentPremodifiedstateIsNotNull() {
            addCriterion("Department_PreModifiedState is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentPremodifiedstateEqualTo(String value) {
            addCriterion("Department_PreModifiedState =", value, "departmentPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andDepartmentPremodifiedstateNotEqualTo(String value) {
            addCriterion("Department_PreModifiedState <>", value, "departmentPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andDepartmentPremodifiedstateGreaterThan(String value) {
            addCriterion("Department_PreModifiedState >", value, "departmentPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andDepartmentPremodifiedstateGreaterThanOrEqualTo(String value) {
            addCriterion("Department_PreModifiedState >=", value, "departmentPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andDepartmentPremodifiedstateLessThan(String value) {
            addCriterion("Department_PreModifiedState <", value, "departmentPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andDepartmentPremodifiedstateLessThanOrEqualTo(String value) {
            addCriterion("Department_PreModifiedState <=", value, "departmentPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andDepartmentPremodifiedstateLike(String value) {
            addCriterion("Department_PreModifiedState like", value, "departmentPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andDepartmentPremodifiedstateNotLike(String value) {
            addCriterion("Department_PreModifiedState not like", value, "departmentPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andDepartmentPremodifiedstateIn(List<String> values) {
            addCriterion("Department_PreModifiedState in", values, "departmentPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andDepartmentPremodifiedstateNotIn(List<String> values) {
            addCriterion("Department_PreModifiedState not in", values, "departmentPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andDepartmentPremodifiedstateBetween(String value1, String value2) {
            addCriterion("Department_PreModifiedState between", value1, value2, "departmentPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andDepartmentPremodifiedstateNotBetween(String value1, String value2) {
            addCriterion("Department_PreModifiedState not between", value1, value2, "departmentPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andDepartmentModifiedstateIsNull() {
            addCriterion("Department_ModifiedState is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentModifiedstateIsNotNull() {
            addCriterion("Department_ModifiedState is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentModifiedstateEqualTo(String value) {
            addCriterion("Department_ModifiedState =", value, "departmentModifiedstate");
            return (Criteria) this;
        }

        public Criteria andDepartmentModifiedstateNotEqualTo(String value) {
            addCriterion("Department_ModifiedState <>", value, "departmentModifiedstate");
            return (Criteria) this;
        }

        public Criteria andDepartmentModifiedstateGreaterThan(String value) {
            addCriterion("Department_ModifiedState >", value, "departmentModifiedstate");
            return (Criteria) this;
        }

        public Criteria andDepartmentModifiedstateGreaterThanOrEqualTo(String value) {
            addCriterion("Department_ModifiedState >=", value, "departmentModifiedstate");
            return (Criteria) this;
        }

        public Criteria andDepartmentModifiedstateLessThan(String value) {
            addCriterion("Department_ModifiedState <", value, "departmentModifiedstate");
            return (Criteria) this;
        }

        public Criteria andDepartmentModifiedstateLessThanOrEqualTo(String value) {
            addCriterion("Department_ModifiedState <=", value, "departmentModifiedstate");
            return (Criteria) this;
        }

        public Criteria andDepartmentModifiedstateLike(String value) {
            addCriterion("Department_ModifiedState like", value, "departmentModifiedstate");
            return (Criteria) this;
        }

        public Criteria andDepartmentModifiedstateNotLike(String value) {
            addCriterion("Department_ModifiedState not like", value, "departmentModifiedstate");
            return (Criteria) this;
        }

        public Criteria andDepartmentModifiedstateIn(List<String> values) {
            addCriterion("Department_ModifiedState in", values, "departmentModifiedstate");
            return (Criteria) this;
        }

        public Criteria andDepartmentModifiedstateNotIn(List<String> values) {
            addCriterion("Department_ModifiedState not in", values, "departmentModifiedstate");
            return (Criteria) this;
        }

        public Criteria andDepartmentModifiedstateBetween(String value1, String value2) {
            addCriterion("Department_ModifiedState between", value1, value2, "departmentModifiedstate");
            return (Criteria) this;
        }

        public Criteria andDepartmentModifiedstateNotBetween(String value1, String value2) {
            addCriterion("Department_ModifiedState not between", value1, value2, "departmentModifiedstate");
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
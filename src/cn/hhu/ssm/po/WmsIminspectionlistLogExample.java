package cn.hhu.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WmsIminspectionlistLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WmsIminspectionlistLogExample() {
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

        public Criteria andIminspectionlistsLogidIsNull() {
            addCriterion("IMInspectionlists_LogID is null");
            return (Criteria) this;
        }

        public Criteria andIminspectionlistsLogidIsNotNull() {
            addCriterion("IMInspectionlists_LogID is not null");
            return (Criteria) this;
        }

        public Criteria andIminspectionlistsLogidEqualTo(Integer value) {
            addCriterion("IMInspectionlists_LogID =", value, "iminspectionlistsLogid");
            return (Criteria) this;
        }

        public Criteria andIminspectionlistsLogidNotEqualTo(Integer value) {
            addCriterion("IMInspectionlists_LogID <>", value, "iminspectionlistsLogid");
            return (Criteria) this;
        }

        public Criteria andIminspectionlistsLogidGreaterThan(Integer value) {
            addCriterion("IMInspectionlists_LogID >", value, "iminspectionlistsLogid");
            return (Criteria) this;
        }

        public Criteria andIminspectionlistsLogidGreaterThanOrEqualTo(Integer value) {
            addCriterion("IMInspectionlists_LogID >=", value, "iminspectionlistsLogid");
            return (Criteria) this;
        }

        public Criteria andIminspectionlistsLogidLessThan(Integer value) {
            addCriterion("IMInspectionlists_LogID <", value, "iminspectionlistsLogid");
            return (Criteria) this;
        }

        public Criteria andIminspectionlistsLogidLessThanOrEqualTo(Integer value) {
            addCriterion("IMInspectionlists_LogID <=", value, "iminspectionlistsLogid");
            return (Criteria) this;
        }

        public Criteria andIminspectionlistsLogidIn(List<Integer> values) {
            addCriterion("IMInspectionlists_LogID in", values, "iminspectionlistsLogid");
            return (Criteria) this;
        }

        public Criteria andIminspectionlistsLogidNotIn(List<Integer> values) {
            addCriterion("IMInspectionlists_LogID not in", values, "iminspectionlistsLogid");
            return (Criteria) this;
        }

        public Criteria andIminspectionlistsLogidBetween(Integer value1, Integer value2) {
            addCriterion("IMInspectionlists_LogID between", value1, value2, "iminspectionlistsLogid");
            return (Criteria) this;
        }

        public Criteria andIminspectionlistsLogidNotBetween(Integer value1, Integer value2) {
            addCriterion("IMInspectionlists_LogID not between", value1, value2, "iminspectionlistsLogid");
            return (Criteria) this;
        }

        public Criteria andIminspectionlistsIdIsNull() {
            addCriterion("IMInspectionlists_ID is null");
            return (Criteria) this;
        }

        public Criteria andIminspectionlistsIdIsNotNull() {
            addCriterion("IMInspectionlists_ID is not null");
            return (Criteria) this;
        }

        public Criteria andIminspectionlistsIdEqualTo(Integer value) {
            addCriterion("IMInspectionlists_ID =", value, "iminspectionlistsId");
            return (Criteria) this;
        }

        public Criteria andIminspectionlistsIdNotEqualTo(Integer value) {
            addCriterion("IMInspectionlists_ID <>", value, "iminspectionlistsId");
            return (Criteria) this;
        }

        public Criteria andIminspectionlistsIdGreaterThan(Integer value) {
            addCriterion("IMInspectionlists_ID >", value, "iminspectionlistsId");
            return (Criteria) this;
        }

        public Criteria andIminspectionlistsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("IMInspectionlists_ID >=", value, "iminspectionlistsId");
            return (Criteria) this;
        }

        public Criteria andIminspectionlistsIdLessThan(Integer value) {
            addCriterion("IMInspectionlists_ID <", value, "iminspectionlistsId");
            return (Criteria) this;
        }

        public Criteria andIminspectionlistsIdLessThanOrEqualTo(Integer value) {
            addCriterion("IMInspectionlists_ID <=", value, "iminspectionlistsId");
            return (Criteria) this;
        }

        public Criteria andIminspectionlistsIdIn(List<Integer> values) {
            addCriterion("IMInspectionlists_ID in", values, "iminspectionlistsId");
            return (Criteria) this;
        }

        public Criteria andIminspectionlistsIdNotIn(List<Integer> values) {
            addCriterion("IMInspectionlists_ID not in", values, "iminspectionlistsId");
            return (Criteria) this;
        }

        public Criteria andIminspectionlistsIdBetween(Integer value1, Integer value2) {
            addCriterion("IMInspectionlists_ID between", value1, value2, "iminspectionlistsId");
            return (Criteria) this;
        }

        public Criteria andIminspectionlistsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("IMInspectionlists_ID not between", value1, value2, "iminspectionlistsId");
            return (Criteria) this;
        }

        public Criteria andIminspectionlistsPremodifiedstateIsNull() {
            addCriterion("IMInspectionlists_PreModifiedState is null");
            return (Criteria) this;
        }

        public Criteria andIminspectionlistsPremodifiedstateIsNotNull() {
            addCriterion("IMInspectionlists_PreModifiedState is not null");
            return (Criteria) this;
        }

        public Criteria andIminspectionlistsPremodifiedstateEqualTo(String value) {
            addCriterion("IMInspectionlists_PreModifiedState =", value, "iminspectionlistsPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andIminspectionlistsPremodifiedstateNotEqualTo(String value) {
            addCriterion("IMInspectionlists_PreModifiedState <>", value, "iminspectionlistsPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andIminspectionlistsPremodifiedstateGreaterThan(String value) {
            addCriterion("IMInspectionlists_PreModifiedState >", value, "iminspectionlistsPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andIminspectionlistsPremodifiedstateGreaterThanOrEqualTo(String value) {
            addCriterion("IMInspectionlists_PreModifiedState >=", value, "iminspectionlistsPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andIminspectionlistsPremodifiedstateLessThan(String value) {
            addCriterion("IMInspectionlists_PreModifiedState <", value, "iminspectionlistsPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andIminspectionlistsPremodifiedstateLessThanOrEqualTo(String value) {
            addCriterion("IMInspectionlists_PreModifiedState <=", value, "iminspectionlistsPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andIminspectionlistsPremodifiedstateLike(String value) {
            addCriterion("IMInspectionlists_PreModifiedState like", value, "iminspectionlistsPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andIminspectionlistsPremodifiedstateNotLike(String value) {
            addCriterion("IMInspectionlists_PreModifiedState not like", value, "iminspectionlistsPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andIminspectionlistsPremodifiedstateIn(List<String> values) {
            addCriterion("IMInspectionlists_PreModifiedState in", values, "iminspectionlistsPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andIminspectionlistsPremodifiedstateNotIn(List<String> values) {
            addCriterion("IMInspectionlists_PreModifiedState not in", values, "iminspectionlistsPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andIminspectionlistsPremodifiedstateBetween(String value1, String value2) {
            addCriterion("IMInspectionlists_PreModifiedState between", value1, value2, "iminspectionlistsPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andIminspectionlistsPremodifiedstateNotBetween(String value1, String value2) {
            addCriterion("IMInspectionlists_PreModifiedState not between", value1, value2, "iminspectionlistsPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andIminspectionlistsModifiedstateIsNull() {
            addCriterion("IMInspectionlists_ModifiedState is null");
            return (Criteria) this;
        }

        public Criteria andIminspectionlistsModifiedstateIsNotNull() {
            addCriterion("IMInspectionlists_ModifiedState is not null");
            return (Criteria) this;
        }

        public Criteria andIminspectionlistsModifiedstateEqualTo(String value) {
            addCriterion("IMInspectionlists_ModifiedState =", value, "iminspectionlistsModifiedstate");
            return (Criteria) this;
        }

        public Criteria andIminspectionlistsModifiedstateNotEqualTo(String value) {
            addCriterion("IMInspectionlists_ModifiedState <>", value, "iminspectionlistsModifiedstate");
            return (Criteria) this;
        }

        public Criteria andIminspectionlistsModifiedstateGreaterThan(String value) {
            addCriterion("IMInspectionlists_ModifiedState >", value, "iminspectionlistsModifiedstate");
            return (Criteria) this;
        }

        public Criteria andIminspectionlistsModifiedstateGreaterThanOrEqualTo(String value) {
            addCriterion("IMInspectionlists_ModifiedState >=", value, "iminspectionlistsModifiedstate");
            return (Criteria) this;
        }

        public Criteria andIminspectionlistsModifiedstateLessThan(String value) {
            addCriterion("IMInspectionlists_ModifiedState <", value, "iminspectionlistsModifiedstate");
            return (Criteria) this;
        }

        public Criteria andIminspectionlistsModifiedstateLessThanOrEqualTo(String value) {
            addCriterion("IMInspectionlists_ModifiedState <=", value, "iminspectionlistsModifiedstate");
            return (Criteria) this;
        }

        public Criteria andIminspectionlistsModifiedstateLike(String value) {
            addCriterion("IMInspectionlists_ModifiedState like", value, "iminspectionlistsModifiedstate");
            return (Criteria) this;
        }

        public Criteria andIminspectionlistsModifiedstateNotLike(String value) {
            addCriterion("IMInspectionlists_ModifiedState not like", value, "iminspectionlistsModifiedstate");
            return (Criteria) this;
        }

        public Criteria andIminspectionlistsModifiedstateIn(List<String> values) {
            addCriterion("IMInspectionlists_ModifiedState in", values, "iminspectionlistsModifiedstate");
            return (Criteria) this;
        }

        public Criteria andIminspectionlistsModifiedstateNotIn(List<String> values) {
            addCriterion("IMInspectionlists_ModifiedState not in", values, "iminspectionlistsModifiedstate");
            return (Criteria) this;
        }

        public Criteria andIminspectionlistsModifiedstateBetween(String value1, String value2) {
            addCriterion("IMInspectionlists_ModifiedState between", value1, value2, "iminspectionlistsModifiedstate");
            return (Criteria) this;
        }

        public Criteria andIminspectionlistsModifiedstateNotBetween(String value1, String value2) {
            addCriterion("IMInspectionlists_ModifiedState not between", value1, value2, "iminspectionlistsModifiedstate");
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
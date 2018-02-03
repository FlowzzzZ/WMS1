package cn.hhu.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WmsImorderLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WmsImorderLogExample() {
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

        public Criteria andImorderLogidIsNull() {
            addCriterion("IMOrder_LogID is null");
            return (Criteria) this;
        }

        public Criteria andImorderLogidIsNotNull() {
            addCriterion("IMOrder_LogID is not null");
            return (Criteria) this;
        }

        public Criteria andImorderLogidEqualTo(Integer value) {
            addCriterion("IMOrder_LogID =", value, "imorderLogid");
            return (Criteria) this;
        }

        public Criteria andImorderLogidNotEqualTo(Integer value) {
            addCriterion("IMOrder_LogID <>", value, "imorderLogid");
            return (Criteria) this;
        }

        public Criteria andImorderLogidGreaterThan(Integer value) {
            addCriterion("IMOrder_LogID >", value, "imorderLogid");
            return (Criteria) this;
        }

        public Criteria andImorderLogidGreaterThanOrEqualTo(Integer value) {
            addCriterion("IMOrder_LogID >=", value, "imorderLogid");
            return (Criteria) this;
        }

        public Criteria andImorderLogidLessThan(Integer value) {
            addCriterion("IMOrder_LogID <", value, "imorderLogid");
            return (Criteria) this;
        }

        public Criteria andImorderLogidLessThanOrEqualTo(Integer value) {
            addCriterion("IMOrder_LogID <=", value, "imorderLogid");
            return (Criteria) this;
        }

        public Criteria andImorderLogidIn(List<Integer> values) {
            addCriterion("IMOrder_LogID in", values, "imorderLogid");
            return (Criteria) this;
        }

        public Criteria andImorderLogidNotIn(List<Integer> values) {
            addCriterion("IMOrder_LogID not in", values, "imorderLogid");
            return (Criteria) this;
        }

        public Criteria andImorderLogidBetween(Integer value1, Integer value2) {
            addCriterion("IMOrder_LogID between", value1, value2, "imorderLogid");
            return (Criteria) this;
        }

        public Criteria andImorderLogidNotBetween(Integer value1, Integer value2) {
            addCriterion("IMOrder_LogID not between", value1, value2, "imorderLogid");
            return (Criteria) this;
        }

        public Criteria andImorderIdIsNull() {
            addCriterion("IMOrder_ID is null");
            return (Criteria) this;
        }

        public Criteria andImorderIdIsNotNull() {
            addCriterion("IMOrder_ID is not null");
            return (Criteria) this;
        }

        public Criteria andImorderIdEqualTo(Integer value) {
            addCriterion("IMOrder_ID =", value, "imorderId");
            return (Criteria) this;
        }

        public Criteria andImorderIdNotEqualTo(Integer value) {
            addCriterion("IMOrder_ID <>", value, "imorderId");
            return (Criteria) this;
        }

        public Criteria andImorderIdGreaterThan(Integer value) {
            addCriterion("IMOrder_ID >", value, "imorderId");
            return (Criteria) this;
        }

        public Criteria andImorderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("IMOrder_ID >=", value, "imorderId");
            return (Criteria) this;
        }

        public Criteria andImorderIdLessThan(Integer value) {
            addCriterion("IMOrder_ID <", value, "imorderId");
            return (Criteria) this;
        }

        public Criteria andImorderIdLessThanOrEqualTo(Integer value) {
            addCriterion("IMOrder_ID <=", value, "imorderId");
            return (Criteria) this;
        }

        public Criteria andImorderIdIn(List<Integer> values) {
            addCriterion("IMOrder_ID in", values, "imorderId");
            return (Criteria) this;
        }

        public Criteria andImorderIdNotIn(List<Integer> values) {
            addCriterion("IMOrder_ID not in", values, "imorderId");
            return (Criteria) this;
        }

        public Criteria andImorderIdBetween(Integer value1, Integer value2) {
            addCriterion("IMOrder_ID between", value1, value2, "imorderId");
            return (Criteria) this;
        }

        public Criteria andImorderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("IMOrder_ID not between", value1, value2, "imorderId");
            return (Criteria) this;
        }

        public Criteria andImorderPremodifiedstateIsNull() {
            addCriterion("IMOrder_PreModifiedState is null");
            return (Criteria) this;
        }

        public Criteria andImorderPremodifiedstateIsNotNull() {
            addCriterion("IMOrder_PreModifiedState is not null");
            return (Criteria) this;
        }

        public Criteria andImorderPremodifiedstateEqualTo(String value) {
            addCriterion("IMOrder_PreModifiedState =", value, "imorderPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andImorderPremodifiedstateNotEqualTo(String value) {
            addCriterion("IMOrder_PreModifiedState <>", value, "imorderPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andImorderPremodifiedstateGreaterThan(String value) {
            addCriterion("IMOrder_PreModifiedState >", value, "imorderPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andImorderPremodifiedstateGreaterThanOrEqualTo(String value) {
            addCriterion("IMOrder_PreModifiedState >=", value, "imorderPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andImorderPremodifiedstateLessThan(String value) {
            addCriterion("IMOrder_PreModifiedState <", value, "imorderPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andImorderPremodifiedstateLessThanOrEqualTo(String value) {
            addCriterion("IMOrder_PreModifiedState <=", value, "imorderPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andImorderPremodifiedstateLike(String value) {
            addCriterion("IMOrder_PreModifiedState like", value, "imorderPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andImorderPremodifiedstateNotLike(String value) {
            addCriterion("IMOrder_PreModifiedState not like", value, "imorderPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andImorderPremodifiedstateIn(List<String> values) {
            addCriterion("IMOrder_PreModifiedState in", values, "imorderPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andImorderPremodifiedstateNotIn(List<String> values) {
            addCriterion("IMOrder_PreModifiedState not in", values, "imorderPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andImorderPremodifiedstateBetween(String value1, String value2) {
            addCriterion("IMOrder_PreModifiedState between", value1, value2, "imorderPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andImorderPremodifiedstateNotBetween(String value1, String value2) {
            addCriterion("IMOrder_PreModifiedState not between", value1, value2, "imorderPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andImorderModifiedstateIsNull() {
            addCriterion("IMOrder_ModifiedState is null");
            return (Criteria) this;
        }

        public Criteria andImorderModifiedstateIsNotNull() {
            addCriterion("IMOrder_ModifiedState is not null");
            return (Criteria) this;
        }

        public Criteria andImorderModifiedstateEqualTo(String value) {
            addCriterion("IMOrder_ModifiedState =", value, "imorderModifiedstate");
            return (Criteria) this;
        }

        public Criteria andImorderModifiedstateNotEqualTo(String value) {
            addCriterion("IMOrder_ModifiedState <>", value, "imorderModifiedstate");
            return (Criteria) this;
        }

        public Criteria andImorderModifiedstateGreaterThan(String value) {
            addCriterion("IMOrder_ModifiedState >", value, "imorderModifiedstate");
            return (Criteria) this;
        }

        public Criteria andImorderModifiedstateGreaterThanOrEqualTo(String value) {
            addCriterion("IMOrder_ModifiedState >=", value, "imorderModifiedstate");
            return (Criteria) this;
        }

        public Criteria andImorderModifiedstateLessThan(String value) {
            addCriterion("IMOrder_ModifiedState <", value, "imorderModifiedstate");
            return (Criteria) this;
        }

        public Criteria andImorderModifiedstateLessThanOrEqualTo(String value) {
            addCriterion("IMOrder_ModifiedState <=", value, "imorderModifiedstate");
            return (Criteria) this;
        }

        public Criteria andImorderModifiedstateLike(String value) {
            addCriterion("IMOrder_ModifiedState like", value, "imorderModifiedstate");
            return (Criteria) this;
        }

        public Criteria andImorderModifiedstateNotLike(String value) {
            addCriterion("IMOrder_ModifiedState not like", value, "imorderModifiedstate");
            return (Criteria) this;
        }

        public Criteria andImorderModifiedstateIn(List<String> values) {
            addCriterion("IMOrder_ModifiedState in", values, "imorderModifiedstate");
            return (Criteria) this;
        }

        public Criteria andImorderModifiedstateNotIn(List<String> values) {
            addCriterion("IMOrder_ModifiedState not in", values, "imorderModifiedstate");
            return (Criteria) this;
        }

        public Criteria andImorderModifiedstateBetween(String value1, String value2) {
            addCriterion("IMOrder_ModifiedState between", value1, value2, "imorderModifiedstate");
            return (Criteria) this;
        }

        public Criteria andImorderModifiedstateNotBetween(String value1, String value2) {
            addCriterion("IMOrder_ModifiedState not between", value1, value2, "imorderModifiedstate");
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
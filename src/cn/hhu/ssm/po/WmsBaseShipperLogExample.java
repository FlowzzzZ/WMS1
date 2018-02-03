package cn.hhu.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WmsBaseShipperLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WmsBaseShipperLogExample() {
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

        public Criteria andClientLogidIsNull() {
            addCriterion("Client_LogID is null");
            return (Criteria) this;
        }

        public Criteria andClientLogidIsNotNull() {
            addCriterion("Client_LogID is not null");
            return (Criteria) this;
        }

        public Criteria andClientLogidEqualTo(Integer value) {
            addCriterion("Client_LogID =", value, "clientLogid");
            return (Criteria) this;
        }

        public Criteria andClientLogidNotEqualTo(Integer value) {
            addCriterion("Client_LogID <>", value, "clientLogid");
            return (Criteria) this;
        }

        public Criteria andClientLogidGreaterThan(Integer value) {
            addCriterion("Client_LogID >", value, "clientLogid");
            return (Criteria) this;
        }

        public Criteria andClientLogidGreaterThanOrEqualTo(Integer value) {
            addCriterion("Client_LogID >=", value, "clientLogid");
            return (Criteria) this;
        }

        public Criteria andClientLogidLessThan(Integer value) {
            addCriterion("Client_LogID <", value, "clientLogid");
            return (Criteria) this;
        }

        public Criteria andClientLogidLessThanOrEqualTo(Integer value) {
            addCriterion("Client_LogID <=", value, "clientLogid");
            return (Criteria) this;
        }

        public Criteria andClientLogidIn(List<Integer> values) {
            addCriterion("Client_LogID in", values, "clientLogid");
            return (Criteria) this;
        }

        public Criteria andClientLogidNotIn(List<Integer> values) {
            addCriterion("Client_LogID not in", values, "clientLogid");
            return (Criteria) this;
        }

        public Criteria andClientLogidBetween(Integer value1, Integer value2) {
            addCriterion("Client_LogID between", value1, value2, "clientLogid");
            return (Criteria) this;
        }

        public Criteria andClientLogidNotBetween(Integer value1, Integer value2) {
            addCriterion("Client_LogID not between", value1, value2, "clientLogid");
            return (Criteria) this;
        }

        public Criteria andClientIdIsNull() {
            addCriterion("Client_ID is null");
            return (Criteria) this;
        }

        public Criteria andClientIdIsNotNull() {
            addCriterion("Client_ID is not null");
            return (Criteria) this;
        }

        public Criteria andClientIdEqualTo(Integer value) {
            addCriterion("Client_ID =", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdNotEqualTo(Integer value) {
            addCriterion("Client_ID <>", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdGreaterThan(Integer value) {
            addCriterion("Client_ID >", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Client_ID >=", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdLessThan(Integer value) {
            addCriterion("Client_ID <", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdLessThanOrEqualTo(Integer value) {
            addCriterion("Client_ID <=", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdIn(List<Integer> values) {
            addCriterion("Client_ID in", values, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdNotIn(List<Integer> values) {
            addCriterion("Client_ID not in", values, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdBetween(Integer value1, Integer value2) {
            addCriterion("Client_ID between", value1, value2, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Client_ID not between", value1, value2, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientPremodifiedstateIsNull() {
            addCriterion("Client_PreModifiedState is null");
            return (Criteria) this;
        }

        public Criteria andClientPremodifiedstateIsNotNull() {
            addCriterion("Client_PreModifiedState is not null");
            return (Criteria) this;
        }

        public Criteria andClientPremodifiedstateEqualTo(String value) {
            addCriterion("Client_PreModifiedState =", value, "clientPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andClientPremodifiedstateNotEqualTo(String value) {
            addCriterion("Client_PreModifiedState <>", value, "clientPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andClientPremodifiedstateGreaterThan(String value) {
            addCriterion("Client_PreModifiedState >", value, "clientPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andClientPremodifiedstateGreaterThanOrEqualTo(String value) {
            addCriterion("Client_PreModifiedState >=", value, "clientPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andClientPremodifiedstateLessThan(String value) {
            addCriterion("Client_PreModifiedState <", value, "clientPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andClientPremodifiedstateLessThanOrEqualTo(String value) {
            addCriterion("Client_PreModifiedState <=", value, "clientPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andClientPremodifiedstateLike(String value) {
            addCriterion("Client_PreModifiedState like", value, "clientPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andClientPremodifiedstateNotLike(String value) {
            addCriterion("Client_PreModifiedState not like", value, "clientPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andClientPremodifiedstateIn(List<String> values) {
            addCriterion("Client_PreModifiedState in", values, "clientPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andClientPremodifiedstateNotIn(List<String> values) {
            addCriterion("Client_PreModifiedState not in", values, "clientPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andClientPremodifiedstateBetween(String value1, String value2) {
            addCriterion("Client_PreModifiedState between", value1, value2, "clientPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andClientPremodifiedstateNotBetween(String value1, String value2) {
            addCriterion("Client_PreModifiedState not between", value1, value2, "clientPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andClientModifiedstateIsNull() {
            addCriterion("Client_ModifiedState is null");
            return (Criteria) this;
        }

        public Criteria andClientModifiedstateIsNotNull() {
            addCriterion("Client_ModifiedState is not null");
            return (Criteria) this;
        }

        public Criteria andClientModifiedstateEqualTo(String value) {
            addCriterion("Client_ModifiedState =", value, "clientModifiedstate");
            return (Criteria) this;
        }

        public Criteria andClientModifiedstateNotEqualTo(String value) {
            addCriterion("Client_ModifiedState <>", value, "clientModifiedstate");
            return (Criteria) this;
        }

        public Criteria andClientModifiedstateGreaterThan(String value) {
            addCriterion("Client_ModifiedState >", value, "clientModifiedstate");
            return (Criteria) this;
        }

        public Criteria andClientModifiedstateGreaterThanOrEqualTo(String value) {
            addCriterion("Client_ModifiedState >=", value, "clientModifiedstate");
            return (Criteria) this;
        }

        public Criteria andClientModifiedstateLessThan(String value) {
            addCriterion("Client_ModifiedState <", value, "clientModifiedstate");
            return (Criteria) this;
        }

        public Criteria andClientModifiedstateLessThanOrEqualTo(String value) {
            addCriterion("Client_ModifiedState <=", value, "clientModifiedstate");
            return (Criteria) this;
        }

        public Criteria andClientModifiedstateLike(String value) {
            addCriterion("Client_ModifiedState like", value, "clientModifiedstate");
            return (Criteria) this;
        }

        public Criteria andClientModifiedstateNotLike(String value) {
            addCriterion("Client_ModifiedState not like", value, "clientModifiedstate");
            return (Criteria) this;
        }

        public Criteria andClientModifiedstateIn(List<String> values) {
            addCriterion("Client_ModifiedState in", values, "clientModifiedstate");
            return (Criteria) this;
        }

        public Criteria andClientModifiedstateNotIn(List<String> values) {
            addCriterion("Client_ModifiedState not in", values, "clientModifiedstate");
            return (Criteria) this;
        }

        public Criteria andClientModifiedstateBetween(String value1, String value2) {
            addCriterion("Client_ModifiedState between", value1, value2, "clientModifiedstate");
            return (Criteria) this;
        }

        public Criteria andClientModifiedstateNotBetween(String value1, String value2) {
            addCriterion("Client_ModifiedState not between", value1, value2, "clientModifiedstate");
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
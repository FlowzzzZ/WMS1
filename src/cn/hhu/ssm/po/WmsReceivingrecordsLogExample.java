package cn.hhu.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WmsReceivingrecordsLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WmsReceivingrecordsLogExample() {
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

        public Criteria andReceivingrecordsLogidIsNull() {
            addCriterion("ReceivingRecords_LogID is null");
            return (Criteria) this;
        }

        public Criteria andReceivingrecordsLogidIsNotNull() {
            addCriterion("ReceivingRecords_LogID is not null");
            return (Criteria) this;
        }

        public Criteria andReceivingrecordsLogidEqualTo(Integer value) {
            addCriterion("ReceivingRecords_LogID =", value, "receivingrecordsLogid");
            return (Criteria) this;
        }

        public Criteria andReceivingrecordsLogidNotEqualTo(Integer value) {
            addCriterion("ReceivingRecords_LogID <>", value, "receivingrecordsLogid");
            return (Criteria) this;
        }

        public Criteria andReceivingrecordsLogidGreaterThan(Integer value) {
            addCriterion("ReceivingRecords_LogID >", value, "receivingrecordsLogid");
            return (Criteria) this;
        }

        public Criteria andReceivingrecordsLogidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ReceivingRecords_LogID >=", value, "receivingrecordsLogid");
            return (Criteria) this;
        }

        public Criteria andReceivingrecordsLogidLessThan(Integer value) {
            addCriterion("ReceivingRecords_LogID <", value, "receivingrecordsLogid");
            return (Criteria) this;
        }

        public Criteria andReceivingrecordsLogidLessThanOrEqualTo(Integer value) {
            addCriterion("ReceivingRecords_LogID <=", value, "receivingrecordsLogid");
            return (Criteria) this;
        }

        public Criteria andReceivingrecordsLogidIn(List<Integer> values) {
            addCriterion("ReceivingRecords_LogID in", values, "receivingrecordsLogid");
            return (Criteria) this;
        }

        public Criteria andReceivingrecordsLogidNotIn(List<Integer> values) {
            addCriterion("ReceivingRecords_LogID not in", values, "receivingrecordsLogid");
            return (Criteria) this;
        }

        public Criteria andReceivingrecordsLogidBetween(Integer value1, Integer value2) {
            addCriterion("ReceivingRecords_LogID between", value1, value2, "receivingrecordsLogid");
            return (Criteria) this;
        }

        public Criteria andReceivingrecordsLogidNotBetween(Integer value1, Integer value2) {
            addCriterion("ReceivingRecords_LogID not between", value1, value2, "receivingrecordsLogid");
            return (Criteria) this;
        }

        public Criteria andReceivingrecordsIdIsNull() {
            addCriterion("ReceivingRecords_ID is null");
            return (Criteria) this;
        }

        public Criteria andReceivingrecordsIdIsNotNull() {
            addCriterion("ReceivingRecords_ID is not null");
            return (Criteria) this;
        }

        public Criteria andReceivingrecordsIdEqualTo(Integer value) {
            addCriterion("ReceivingRecords_ID =", value, "receivingrecordsId");
            return (Criteria) this;
        }

        public Criteria andReceivingrecordsIdNotEqualTo(Integer value) {
            addCriterion("ReceivingRecords_ID <>", value, "receivingrecordsId");
            return (Criteria) this;
        }

        public Criteria andReceivingrecordsIdGreaterThan(Integer value) {
            addCriterion("ReceivingRecords_ID >", value, "receivingrecordsId");
            return (Criteria) this;
        }

        public Criteria andReceivingrecordsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ReceivingRecords_ID >=", value, "receivingrecordsId");
            return (Criteria) this;
        }

        public Criteria andReceivingrecordsIdLessThan(Integer value) {
            addCriterion("ReceivingRecords_ID <", value, "receivingrecordsId");
            return (Criteria) this;
        }

        public Criteria andReceivingrecordsIdLessThanOrEqualTo(Integer value) {
            addCriterion("ReceivingRecords_ID <=", value, "receivingrecordsId");
            return (Criteria) this;
        }

        public Criteria andReceivingrecordsIdIn(List<Integer> values) {
            addCriterion("ReceivingRecords_ID in", values, "receivingrecordsId");
            return (Criteria) this;
        }

        public Criteria andReceivingrecordsIdNotIn(List<Integer> values) {
            addCriterion("ReceivingRecords_ID not in", values, "receivingrecordsId");
            return (Criteria) this;
        }

        public Criteria andReceivingrecordsIdBetween(Integer value1, Integer value2) {
            addCriterion("ReceivingRecords_ID between", value1, value2, "receivingrecordsId");
            return (Criteria) this;
        }

        public Criteria andReceivingrecordsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ReceivingRecords_ID not between", value1, value2, "receivingrecordsId");
            return (Criteria) this;
        }

        public Criteria andReceivingrecordsPremodifiedstateIsNull() {
            addCriterion("ReceivingRecords_PreModifiedState is null");
            return (Criteria) this;
        }

        public Criteria andReceivingrecordsPremodifiedstateIsNotNull() {
            addCriterion("ReceivingRecords_PreModifiedState is not null");
            return (Criteria) this;
        }

        public Criteria andReceivingrecordsPremodifiedstateEqualTo(String value) {
            addCriterion("ReceivingRecords_PreModifiedState =", value, "receivingrecordsPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andReceivingrecordsPremodifiedstateNotEqualTo(String value) {
            addCriterion("ReceivingRecords_PreModifiedState <>", value, "receivingrecordsPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andReceivingrecordsPremodifiedstateGreaterThan(String value) {
            addCriterion("ReceivingRecords_PreModifiedState >", value, "receivingrecordsPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andReceivingrecordsPremodifiedstateGreaterThanOrEqualTo(String value) {
            addCriterion("ReceivingRecords_PreModifiedState >=", value, "receivingrecordsPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andReceivingrecordsPremodifiedstateLessThan(String value) {
            addCriterion("ReceivingRecords_PreModifiedState <", value, "receivingrecordsPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andReceivingrecordsPremodifiedstateLessThanOrEqualTo(String value) {
            addCriterion("ReceivingRecords_PreModifiedState <=", value, "receivingrecordsPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andReceivingrecordsPremodifiedstateLike(String value) {
            addCriterion("ReceivingRecords_PreModifiedState like", value, "receivingrecordsPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andReceivingrecordsPremodifiedstateNotLike(String value) {
            addCriterion("ReceivingRecords_PreModifiedState not like", value, "receivingrecordsPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andReceivingrecordsPremodifiedstateIn(List<String> values) {
            addCriterion("ReceivingRecords_PreModifiedState in", values, "receivingrecordsPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andReceivingrecordsPremodifiedstateNotIn(List<String> values) {
            addCriterion("ReceivingRecords_PreModifiedState not in", values, "receivingrecordsPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andReceivingrecordsPremodifiedstateBetween(String value1, String value2) {
            addCriterion("ReceivingRecords_PreModifiedState between", value1, value2, "receivingrecordsPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andReceivingrecordsPremodifiedstateNotBetween(String value1, String value2) {
            addCriterion("ReceivingRecords_PreModifiedState not between", value1, value2, "receivingrecordsPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andReceivingrecordsModifiedstateIsNull() {
            addCriterion("ReceivingRecords_ModifiedState is null");
            return (Criteria) this;
        }

        public Criteria andReceivingrecordsModifiedstateIsNotNull() {
            addCriterion("ReceivingRecords_ModifiedState is not null");
            return (Criteria) this;
        }

        public Criteria andReceivingrecordsModifiedstateEqualTo(String value) {
            addCriterion("ReceivingRecords_ModifiedState =", value, "receivingrecordsModifiedstate");
            return (Criteria) this;
        }

        public Criteria andReceivingrecordsModifiedstateNotEqualTo(String value) {
            addCriterion("ReceivingRecords_ModifiedState <>", value, "receivingrecordsModifiedstate");
            return (Criteria) this;
        }

        public Criteria andReceivingrecordsModifiedstateGreaterThan(String value) {
            addCriterion("ReceivingRecords_ModifiedState >", value, "receivingrecordsModifiedstate");
            return (Criteria) this;
        }

        public Criteria andReceivingrecordsModifiedstateGreaterThanOrEqualTo(String value) {
            addCriterion("ReceivingRecords_ModifiedState >=", value, "receivingrecordsModifiedstate");
            return (Criteria) this;
        }

        public Criteria andReceivingrecordsModifiedstateLessThan(String value) {
            addCriterion("ReceivingRecords_ModifiedState <", value, "receivingrecordsModifiedstate");
            return (Criteria) this;
        }

        public Criteria andReceivingrecordsModifiedstateLessThanOrEqualTo(String value) {
            addCriterion("ReceivingRecords_ModifiedState <=", value, "receivingrecordsModifiedstate");
            return (Criteria) this;
        }

        public Criteria andReceivingrecordsModifiedstateLike(String value) {
            addCriterion("ReceivingRecords_ModifiedState like", value, "receivingrecordsModifiedstate");
            return (Criteria) this;
        }

        public Criteria andReceivingrecordsModifiedstateNotLike(String value) {
            addCriterion("ReceivingRecords_ModifiedState not like", value, "receivingrecordsModifiedstate");
            return (Criteria) this;
        }

        public Criteria andReceivingrecordsModifiedstateIn(List<String> values) {
            addCriterion("ReceivingRecords_ModifiedState in", values, "receivingrecordsModifiedstate");
            return (Criteria) this;
        }

        public Criteria andReceivingrecordsModifiedstateNotIn(List<String> values) {
            addCriterion("ReceivingRecords_ModifiedState not in", values, "receivingrecordsModifiedstate");
            return (Criteria) this;
        }

        public Criteria andReceivingrecordsModifiedstateBetween(String value1, String value2) {
            addCriterion("ReceivingRecords_ModifiedState between", value1, value2, "receivingrecordsModifiedstate");
            return (Criteria) this;
        }

        public Criteria andReceivingrecordsModifiedstateNotBetween(String value1, String value2) {
            addCriterion("ReceivingRecords_ModifiedState not between", value1, value2, "receivingrecordsModifiedstate");
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
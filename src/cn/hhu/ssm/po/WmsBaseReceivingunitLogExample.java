package cn.hhu.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WmsBaseReceivingunitLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WmsBaseReceivingunitLogExample() {
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

        public Criteria andReceivingunitLogidIsNull() {
            addCriterion("ReceivingUnit_LogID is null");
            return (Criteria) this;
        }

        public Criteria andReceivingunitLogidIsNotNull() {
            addCriterion("ReceivingUnit_LogID is not null");
            return (Criteria) this;
        }

        public Criteria andReceivingunitLogidEqualTo(Integer value) {
            addCriterion("ReceivingUnit_LogID =", value, "receivingunitLogid");
            return (Criteria) this;
        }

        public Criteria andReceivingunitLogidNotEqualTo(Integer value) {
            addCriterion("ReceivingUnit_LogID <>", value, "receivingunitLogid");
            return (Criteria) this;
        }

        public Criteria andReceivingunitLogidGreaterThan(Integer value) {
            addCriterion("ReceivingUnit_LogID >", value, "receivingunitLogid");
            return (Criteria) this;
        }

        public Criteria andReceivingunitLogidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ReceivingUnit_LogID >=", value, "receivingunitLogid");
            return (Criteria) this;
        }

        public Criteria andReceivingunitLogidLessThan(Integer value) {
            addCriterion("ReceivingUnit_LogID <", value, "receivingunitLogid");
            return (Criteria) this;
        }

        public Criteria andReceivingunitLogidLessThanOrEqualTo(Integer value) {
            addCriterion("ReceivingUnit_LogID <=", value, "receivingunitLogid");
            return (Criteria) this;
        }

        public Criteria andReceivingunitLogidIn(List<Integer> values) {
            addCriterion("ReceivingUnit_LogID in", values, "receivingunitLogid");
            return (Criteria) this;
        }

        public Criteria andReceivingunitLogidNotIn(List<Integer> values) {
            addCriterion("ReceivingUnit_LogID not in", values, "receivingunitLogid");
            return (Criteria) this;
        }

        public Criteria andReceivingunitLogidBetween(Integer value1, Integer value2) {
            addCriterion("ReceivingUnit_LogID between", value1, value2, "receivingunitLogid");
            return (Criteria) this;
        }

        public Criteria andReceivingunitLogidNotBetween(Integer value1, Integer value2) {
            addCriterion("ReceivingUnit_LogID not between", value1, value2, "receivingunitLogid");
            return (Criteria) this;
        }

        public Criteria andShipperIdIsNull() {
            addCriterion("Shipper_ID is null");
            return (Criteria) this;
        }

        public Criteria andShipperIdIsNotNull() {
            addCriterion("Shipper_ID is not null");
            return (Criteria) this;
        }

        public Criteria andShipperIdEqualTo(Integer value) {
            addCriterion("Shipper_ID =", value, "shipperId");
            return (Criteria) this;
        }

        public Criteria andShipperIdNotEqualTo(Integer value) {
            addCriterion("Shipper_ID <>", value, "shipperId");
            return (Criteria) this;
        }

        public Criteria andShipperIdGreaterThan(Integer value) {
            addCriterion("Shipper_ID >", value, "shipperId");
            return (Criteria) this;
        }

        public Criteria andShipperIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Shipper_ID >=", value, "shipperId");
            return (Criteria) this;
        }

        public Criteria andShipperIdLessThan(Integer value) {
            addCriterion("Shipper_ID <", value, "shipperId");
            return (Criteria) this;
        }

        public Criteria andShipperIdLessThanOrEqualTo(Integer value) {
            addCriterion("Shipper_ID <=", value, "shipperId");
            return (Criteria) this;
        }

        public Criteria andShipperIdIn(List<Integer> values) {
            addCriterion("Shipper_ID in", values, "shipperId");
            return (Criteria) this;
        }

        public Criteria andShipperIdNotIn(List<Integer> values) {
            addCriterion("Shipper_ID not in", values, "shipperId");
            return (Criteria) this;
        }

        public Criteria andShipperIdBetween(Integer value1, Integer value2) {
            addCriterion("Shipper_ID between", value1, value2, "shipperId");
            return (Criteria) this;
        }

        public Criteria andShipperIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Shipper_ID not between", value1, value2, "shipperId");
            return (Criteria) this;
        }

        public Criteria andReceivingunitPremodifiedstateIsNull() {
            addCriterion("ReceivingUnit_PreModifiedState is null");
            return (Criteria) this;
        }

        public Criteria andReceivingunitPremodifiedstateIsNotNull() {
            addCriterion("ReceivingUnit_PreModifiedState is not null");
            return (Criteria) this;
        }

        public Criteria andReceivingunitPremodifiedstateEqualTo(String value) {
            addCriterion("ReceivingUnit_PreModifiedState =", value, "receivingunitPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andReceivingunitPremodifiedstateNotEqualTo(String value) {
            addCriterion("ReceivingUnit_PreModifiedState <>", value, "receivingunitPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andReceivingunitPremodifiedstateGreaterThan(String value) {
            addCriterion("ReceivingUnit_PreModifiedState >", value, "receivingunitPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andReceivingunitPremodifiedstateGreaterThanOrEqualTo(String value) {
            addCriterion("ReceivingUnit_PreModifiedState >=", value, "receivingunitPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andReceivingunitPremodifiedstateLessThan(String value) {
            addCriterion("ReceivingUnit_PreModifiedState <", value, "receivingunitPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andReceivingunitPremodifiedstateLessThanOrEqualTo(String value) {
            addCriterion("ReceivingUnit_PreModifiedState <=", value, "receivingunitPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andReceivingunitPremodifiedstateLike(String value) {
            addCriterion("ReceivingUnit_PreModifiedState like", value, "receivingunitPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andReceivingunitPremodifiedstateNotLike(String value) {
            addCriterion("ReceivingUnit_PreModifiedState not like", value, "receivingunitPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andReceivingunitPremodifiedstateIn(List<String> values) {
            addCriterion("ReceivingUnit_PreModifiedState in", values, "receivingunitPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andReceivingunitPremodifiedstateNotIn(List<String> values) {
            addCriterion("ReceivingUnit_PreModifiedState not in", values, "receivingunitPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andReceivingunitPremodifiedstateBetween(String value1, String value2) {
            addCriterion("ReceivingUnit_PreModifiedState between", value1, value2, "receivingunitPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andReceivingunitPremodifiedstateNotBetween(String value1, String value2) {
            addCriterion("ReceivingUnit_PreModifiedState not between", value1, value2, "receivingunitPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andReceivingunitModifiedstateIsNull() {
            addCriterion("ReceivingUnit_ModifiedState is null");
            return (Criteria) this;
        }

        public Criteria andReceivingunitModifiedstateIsNotNull() {
            addCriterion("ReceivingUnit_ModifiedState is not null");
            return (Criteria) this;
        }

        public Criteria andReceivingunitModifiedstateEqualTo(String value) {
            addCriterion("ReceivingUnit_ModifiedState =", value, "receivingunitModifiedstate");
            return (Criteria) this;
        }

        public Criteria andReceivingunitModifiedstateNotEqualTo(String value) {
            addCriterion("ReceivingUnit_ModifiedState <>", value, "receivingunitModifiedstate");
            return (Criteria) this;
        }

        public Criteria andReceivingunitModifiedstateGreaterThan(String value) {
            addCriterion("ReceivingUnit_ModifiedState >", value, "receivingunitModifiedstate");
            return (Criteria) this;
        }

        public Criteria andReceivingunitModifiedstateGreaterThanOrEqualTo(String value) {
            addCriterion("ReceivingUnit_ModifiedState >=", value, "receivingunitModifiedstate");
            return (Criteria) this;
        }

        public Criteria andReceivingunitModifiedstateLessThan(String value) {
            addCriterion("ReceivingUnit_ModifiedState <", value, "receivingunitModifiedstate");
            return (Criteria) this;
        }

        public Criteria andReceivingunitModifiedstateLessThanOrEqualTo(String value) {
            addCriterion("ReceivingUnit_ModifiedState <=", value, "receivingunitModifiedstate");
            return (Criteria) this;
        }

        public Criteria andReceivingunitModifiedstateLike(String value) {
            addCriterion("ReceivingUnit_ModifiedState like", value, "receivingunitModifiedstate");
            return (Criteria) this;
        }

        public Criteria andReceivingunitModifiedstateNotLike(String value) {
            addCriterion("ReceivingUnit_ModifiedState not like", value, "receivingunitModifiedstate");
            return (Criteria) this;
        }

        public Criteria andReceivingunitModifiedstateIn(List<String> values) {
            addCriterion("ReceivingUnit_ModifiedState in", values, "receivingunitModifiedstate");
            return (Criteria) this;
        }

        public Criteria andReceivingunitModifiedstateNotIn(List<String> values) {
            addCriterion("ReceivingUnit_ModifiedState not in", values, "receivingunitModifiedstate");
            return (Criteria) this;
        }

        public Criteria andReceivingunitModifiedstateBetween(String value1, String value2) {
            addCriterion("ReceivingUnit_ModifiedState between", value1, value2, "receivingunitModifiedstate");
            return (Criteria) this;
        }

        public Criteria andReceivingunitModifiedstateNotBetween(String value1, String value2) {
            addCriterion("ReceivingUnit_ModifiedState not between", value1, value2, "receivingunitModifiedstate");
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
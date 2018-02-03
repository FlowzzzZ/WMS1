package cn.hhu.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WmsStorehouseLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WmsStorehouseLogExample() {
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

        public Criteria andStorehousesLogidIsNull() {
            addCriterion("Storehouses_LogID is null");
            return (Criteria) this;
        }

        public Criteria andStorehousesLogidIsNotNull() {
            addCriterion("Storehouses_LogID is not null");
            return (Criteria) this;
        }

        public Criteria andStorehousesLogidEqualTo(Integer value) {
            addCriterion("Storehouses_LogID =", value, "storehousesLogid");
            return (Criteria) this;
        }

        public Criteria andStorehousesLogidNotEqualTo(Integer value) {
            addCriterion("Storehouses_LogID <>", value, "storehousesLogid");
            return (Criteria) this;
        }

        public Criteria andStorehousesLogidGreaterThan(Integer value) {
            addCriterion("Storehouses_LogID >", value, "storehousesLogid");
            return (Criteria) this;
        }

        public Criteria andStorehousesLogidGreaterThanOrEqualTo(Integer value) {
            addCriterion("Storehouses_LogID >=", value, "storehousesLogid");
            return (Criteria) this;
        }

        public Criteria andStorehousesLogidLessThan(Integer value) {
            addCriterion("Storehouses_LogID <", value, "storehousesLogid");
            return (Criteria) this;
        }

        public Criteria andStorehousesLogidLessThanOrEqualTo(Integer value) {
            addCriterion("Storehouses_LogID <=", value, "storehousesLogid");
            return (Criteria) this;
        }

        public Criteria andStorehousesLogidIn(List<Integer> values) {
            addCriterion("Storehouses_LogID in", values, "storehousesLogid");
            return (Criteria) this;
        }

        public Criteria andStorehousesLogidNotIn(List<Integer> values) {
            addCriterion("Storehouses_LogID not in", values, "storehousesLogid");
            return (Criteria) this;
        }

        public Criteria andStorehousesLogidBetween(Integer value1, Integer value2) {
            addCriterion("Storehouses_LogID between", value1, value2, "storehousesLogid");
            return (Criteria) this;
        }

        public Criteria andStorehousesLogidNotBetween(Integer value1, Integer value2) {
            addCriterion("Storehouses_LogID not between", value1, value2, "storehousesLogid");
            return (Criteria) this;
        }

        public Criteria andStorehousesIdIsNull() {
            addCriterion("Storehouses_ID is null");
            return (Criteria) this;
        }

        public Criteria andStorehousesIdIsNotNull() {
            addCriterion("Storehouses_ID is not null");
            return (Criteria) this;
        }

        public Criteria andStorehousesIdEqualTo(Integer value) {
            addCriterion("Storehouses_ID =", value, "storehousesId");
            return (Criteria) this;
        }

        public Criteria andStorehousesIdNotEqualTo(Integer value) {
            addCriterion("Storehouses_ID <>", value, "storehousesId");
            return (Criteria) this;
        }

        public Criteria andStorehousesIdGreaterThan(Integer value) {
            addCriterion("Storehouses_ID >", value, "storehousesId");
            return (Criteria) this;
        }

        public Criteria andStorehousesIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Storehouses_ID >=", value, "storehousesId");
            return (Criteria) this;
        }

        public Criteria andStorehousesIdLessThan(Integer value) {
            addCriterion("Storehouses_ID <", value, "storehousesId");
            return (Criteria) this;
        }

        public Criteria andStorehousesIdLessThanOrEqualTo(Integer value) {
            addCriterion("Storehouses_ID <=", value, "storehousesId");
            return (Criteria) this;
        }

        public Criteria andStorehousesIdIn(List<Integer> values) {
            addCriterion("Storehouses_ID in", values, "storehousesId");
            return (Criteria) this;
        }

        public Criteria andStorehousesIdNotIn(List<Integer> values) {
            addCriterion("Storehouses_ID not in", values, "storehousesId");
            return (Criteria) this;
        }

        public Criteria andStorehousesIdBetween(Integer value1, Integer value2) {
            addCriterion("Storehouses_ID between", value1, value2, "storehousesId");
            return (Criteria) this;
        }

        public Criteria andStorehousesIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Storehouses_ID not between", value1, value2, "storehousesId");
            return (Criteria) this;
        }

        public Criteria andStorehousesPremodifiedstateIsNull() {
            addCriterion("Storehouses_PreModifiedState is null");
            return (Criteria) this;
        }

        public Criteria andStorehousesPremodifiedstateIsNotNull() {
            addCriterion("Storehouses_PreModifiedState is not null");
            return (Criteria) this;
        }

        public Criteria andStorehousesPremodifiedstateEqualTo(String value) {
            addCriterion("Storehouses_PreModifiedState =", value, "storehousesPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andStorehousesPremodifiedstateNotEqualTo(String value) {
            addCriterion("Storehouses_PreModifiedState <>", value, "storehousesPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andStorehousesPremodifiedstateGreaterThan(String value) {
            addCriterion("Storehouses_PreModifiedState >", value, "storehousesPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andStorehousesPremodifiedstateGreaterThanOrEqualTo(String value) {
            addCriterion("Storehouses_PreModifiedState >=", value, "storehousesPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andStorehousesPremodifiedstateLessThan(String value) {
            addCriterion("Storehouses_PreModifiedState <", value, "storehousesPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andStorehousesPremodifiedstateLessThanOrEqualTo(String value) {
            addCriterion("Storehouses_PreModifiedState <=", value, "storehousesPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andStorehousesPremodifiedstateLike(String value) {
            addCriterion("Storehouses_PreModifiedState like", value, "storehousesPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andStorehousesPremodifiedstateNotLike(String value) {
            addCriterion("Storehouses_PreModifiedState not like", value, "storehousesPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andStorehousesPremodifiedstateIn(List<String> values) {
            addCriterion("Storehouses_PreModifiedState in", values, "storehousesPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andStorehousesPremodifiedstateNotIn(List<String> values) {
            addCriterion("Storehouses_PreModifiedState not in", values, "storehousesPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andStorehousesPremodifiedstateBetween(String value1, String value2) {
            addCriterion("Storehouses_PreModifiedState between", value1, value2, "storehousesPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andStorehousesPremodifiedstateNotBetween(String value1, String value2) {
            addCriterion("Storehouses_PreModifiedState not between", value1, value2, "storehousesPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andStorehousesModifiedstateIsNull() {
            addCriterion("Storehouses_ModifiedState is null");
            return (Criteria) this;
        }

        public Criteria andStorehousesModifiedstateIsNotNull() {
            addCriterion("Storehouses_ModifiedState is not null");
            return (Criteria) this;
        }

        public Criteria andStorehousesModifiedstateEqualTo(String value) {
            addCriterion("Storehouses_ModifiedState =", value, "storehousesModifiedstate");
            return (Criteria) this;
        }

        public Criteria andStorehousesModifiedstateNotEqualTo(String value) {
            addCriterion("Storehouses_ModifiedState <>", value, "storehousesModifiedstate");
            return (Criteria) this;
        }

        public Criteria andStorehousesModifiedstateGreaterThan(String value) {
            addCriterion("Storehouses_ModifiedState >", value, "storehousesModifiedstate");
            return (Criteria) this;
        }

        public Criteria andStorehousesModifiedstateGreaterThanOrEqualTo(String value) {
            addCriterion("Storehouses_ModifiedState >=", value, "storehousesModifiedstate");
            return (Criteria) this;
        }

        public Criteria andStorehousesModifiedstateLessThan(String value) {
            addCriterion("Storehouses_ModifiedState <", value, "storehousesModifiedstate");
            return (Criteria) this;
        }

        public Criteria andStorehousesModifiedstateLessThanOrEqualTo(String value) {
            addCriterion("Storehouses_ModifiedState <=", value, "storehousesModifiedstate");
            return (Criteria) this;
        }

        public Criteria andStorehousesModifiedstateLike(String value) {
            addCriterion("Storehouses_ModifiedState like", value, "storehousesModifiedstate");
            return (Criteria) this;
        }

        public Criteria andStorehousesModifiedstateNotLike(String value) {
            addCriterion("Storehouses_ModifiedState not like", value, "storehousesModifiedstate");
            return (Criteria) this;
        }

        public Criteria andStorehousesModifiedstateIn(List<String> values) {
            addCriterion("Storehouses_ModifiedState in", values, "storehousesModifiedstate");
            return (Criteria) this;
        }

        public Criteria andStorehousesModifiedstateNotIn(List<String> values) {
            addCriterion("Storehouses_ModifiedState not in", values, "storehousesModifiedstate");
            return (Criteria) this;
        }

        public Criteria andStorehousesModifiedstateBetween(String value1, String value2) {
            addCriterion("Storehouses_ModifiedState between", value1, value2, "storehousesModifiedstate");
            return (Criteria) this;
        }

        public Criteria andStorehousesModifiedstateNotBetween(String value1, String value2) {
            addCriterion("Storehouses_ModifiedState not between", value1, value2, "storehousesModifiedstate");
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
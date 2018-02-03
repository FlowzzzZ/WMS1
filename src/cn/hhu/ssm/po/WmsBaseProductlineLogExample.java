package cn.hhu.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WmsBaseProductlineLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WmsBaseProductlineLogExample() {
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

        public Criteria andProductlineLogidIsNull() {
            addCriterion("ProductLine_LogID is null");
            return (Criteria) this;
        }

        public Criteria andProductlineLogidIsNotNull() {
            addCriterion("ProductLine_LogID is not null");
            return (Criteria) this;
        }

        public Criteria andProductlineLogidEqualTo(Integer value) {
            addCriterion("ProductLine_LogID =", value, "productlineLogid");
            return (Criteria) this;
        }

        public Criteria andProductlineLogidNotEqualTo(Integer value) {
            addCriterion("ProductLine_LogID <>", value, "productlineLogid");
            return (Criteria) this;
        }

        public Criteria andProductlineLogidGreaterThan(Integer value) {
            addCriterion("ProductLine_LogID >", value, "productlineLogid");
            return (Criteria) this;
        }

        public Criteria andProductlineLogidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ProductLine_LogID >=", value, "productlineLogid");
            return (Criteria) this;
        }

        public Criteria andProductlineLogidLessThan(Integer value) {
            addCriterion("ProductLine_LogID <", value, "productlineLogid");
            return (Criteria) this;
        }

        public Criteria andProductlineLogidLessThanOrEqualTo(Integer value) {
            addCriterion("ProductLine_LogID <=", value, "productlineLogid");
            return (Criteria) this;
        }

        public Criteria andProductlineLogidIn(List<Integer> values) {
            addCriterion("ProductLine_LogID in", values, "productlineLogid");
            return (Criteria) this;
        }

        public Criteria andProductlineLogidNotIn(List<Integer> values) {
            addCriterion("ProductLine_LogID not in", values, "productlineLogid");
            return (Criteria) this;
        }

        public Criteria andProductlineLogidBetween(Integer value1, Integer value2) {
            addCriterion("ProductLine_LogID between", value1, value2, "productlineLogid");
            return (Criteria) this;
        }

        public Criteria andProductlineLogidNotBetween(Integer value1, Integer value2) {
            addCriterion("ProductLine_LogID not between", value1, value2, "productlineLogid");
            return (Criteria) this;
        }

        public Criteria andProductlineIdIsNull() {
            addCriterion("ProductLine_ID is null");
            return (Criteria) this;
        }

        public Criteria andProductlineIdIsNotNull() {
            addCriterion("ProductLine_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProductlineIdEqualTo(Integer value) {
            addCriterion("ProductLine_ID =", value, "productlineId");
            return (Criteria) this;
        }

        public Criteria andProductlineIdNotEqualTo(Integer value) {
            addCriterion("ProductLine_ID <>", value, "productlineId");
            return (Criteria) this;
        }

        public Criteria andProductlineIdGreaterThan(Integer value) {
            addCriterion("ProductLine_ID >", value, "productlineId");
            return (Criteria) this;
        }

        public Criteria andProductlineIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ProductLine_ID >=", value, "productlineId");
            return (Criteria) this;
        }

        public Criteria andProductlineIdLessThan(Integer value) {
            addCriterion("ProductLine_ID <", value, "productlineId");
            return (Criteria) this;
        }

        public Criteria andProductlineIdLessThanOrEqualTo(Integer value) {
            addCriterion("ProductLine_ID <=", value, "productlineId");
            return (Criteria) this;
        }

        public Criteria andProductlineIdIn(List<Integer> values) {
            addCriterion("ProductLine_ID in", values, "productlineId");
            return (Criteria) this;
        }

        public Criteria andProductlineIdNotIn(List<Integer> values) {
            addCriterion("ProductLine_ID not in", values, "productlineId");
            return (Criteria) this;
        }

        public Criteria andProductlineIdBetween(Integer value1, Integer value2) {
            addCriterion("ProductLine_ID between", value1, value2, "productlineId");
            return (Criteria) this;
        }

        public Criteria andProductlineIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ProductLine_ID not between", value1, value2, "productlineId");
            return (Criteria) this;
        }

        public Criteria andProductlinePremodifiedstateIsNull() {
            addCriterion("ProductLine_PreModifiedState is null");
            return (Criteria) this;
        }

        public Criteria andProductlinePremodifiedstateIsNotNull() {
            addCriterion("ProductLine_PreModifiedState is not null");
            return (Criteria) this;
        }

        public Criteria andProductlinePremodifiedstateEqualTo(String value) {
            addCriterion("ProductLine_PreModifiedState =", value, "productlinePremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andProductlinePremodifiedstateNotEqualTo(String value) {
            addCriterion("ProductLine_PreModifiedState <>", value, "productlinePremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andProductlinePremodifiedstateGreaterThan(String value) {
            addCriterion("ProductLine_PreModifiedState >", value, "productlinePremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andProductlinePremodifiedstateGreaterThanOrEqualTo(String value) {
            addCriterion("ProductLine_PreModifiedState >=", value, "productlinePremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andProductlinePremodifiedstateLessThan(String value) {
            addCriterion("ProductLine_PreModifiedState <", value, "productlinePremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andProductlinePremodifiedstateLessThanOrEqualTo(String value) {
            addCriterion("ProductLine_PreModifiedState <=", value, "productlinePremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andProductlinePremodifiedstateLike(String value) {
            addCriterion("ProductLine_PreModifiedState like", value, "productlinePremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andProductlinePremodifiedstateNotLike(String value) {
            addCriterion("ProductLine_PreModifiedState not like", value, "productlinePremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andProductlinePremodifiedstateIn(List<String> values) {
            addCriterion("ProductLine_PreModifiedState in", values, "productlinePremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andProductlinePremodifiedstateNotIn(List<String> values) {
            addCriterion("ProductLine_PreModifiedState not in", values, "productlinePremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andProductlinePremodifiedstateBetween(String value1, String value2) {
            addCriterion("ProductLine_PreModifiedState between", value1, value2, "productlinePremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andProductlinePremodifiedstateNotBetween(String value1, String value2) {
            addCriterion("ProductLine_PreModifiedState not between", value1, value2, "productlinePremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andProductlineModifiedstateIsNull() {
            addCriterion("ProductLine_ModifiedState is null");
            return (Criteria) this;
        }

        public Criteria andProductlineModifiedstateIsNotNull() {
            addCriterion("ProductLine_ModifiedState is not null");
            return (Criteria) this;
        }

        public Criteria andProductlineModifiedstateEqualTo(String value) {
            addCriterion("ProductLine_ModifiedState =", value, "productlineModifiedstate");
            return (Criteria) this;
        }

        public Criteria andProductlineModifiedstateNotEqualTo(String value) {
            addCriterion("ProductLine_ModifiedState <>", value, "productlineModifiedstate");
            return (Criteria) this;
        }

        public Criteria andProductlineModifiedstateGreaterThan(String value) {
            addCriterion("ProductLine_ModifiedState >", value, "productlineModifiedstate");
            return (Criteria) this;
        }

        public Criteria andProductlineModifiedstateGreaterThanOrEqualTo(String value) {
            addCriterion("ProductLine_ModifiedState >=", value, "productlineModifiedstate");
            return (Criteria) this;
        }

        public Criteria andProductlineModifiedstateLessThan(String value) {
            addCriterion("ProductLine_ModifiedState <", value, "productlineModifiedstate");
            return (Criteria) this;
        }

        public Criteria andProductlineModifiedstateLessThanOrEqualTo(String value) {
            addCriterion("ProductLine_ModifiedState <=", value, "productlineModifiedstate");
            return (Criteria) this;
        }

        public Criteria andProductlineModifiedstateLike(String value) {
            addCriterion("ProductLine_ModifiedState like", value, "productlineModifiedstate");
            return (Criteria) this;
        }

        public Criteria andProductlineModifiedstateNotLike(String value) {
            addCriterion("ProductLine_ModifiedState not like", value, "productlineModifiedstate");
            return (Criteria) this;
        }

        public Criteria andProductlineModifiedstateIn(List<String> values) {
            addCriterion("ProductLine_ModifiedState in", values, "productlineModifiedstate");
            return (Criteria) this;
        }

        public Criteria andProductlineModifiedstateNotIn(List<String> values) {
            addCriterion("ProductLine_ModifiedState not in", values, "productlineModifiedstate");
            return (Criteria) this;
        }

        public Criteria andProductlineModifiedstateBetween(String value1, String value2) {
            addCriterion("ProductLine_ModifiedState between", value1, value2, "productlineModifiedstate");
            return (Criteria) this;
        }

        public Criteria andProductlineModifiedstateNotBetween(String value1, String value2) {
            addCriterion("ProductLine_ModifiedState not between", value1, value2, "productlineModifiedstate");
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
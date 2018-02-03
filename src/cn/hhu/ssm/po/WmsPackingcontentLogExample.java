package cn.hhu.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WmsPackingcontentLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WmsPackingcontentLogExample() {
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

        public Criteria andPackingcontentLogidIsNull() {
            addCriterion("PackingContent_LogID is null");
            return (Criteria) this;
        }

        public Criteria andPackingcontentLogidIsNotNull() {
            addCriterion("PackingContent_LogID is not null");
            return (Criteria) this;
        }

        public Criteria andPackingcontentLogidEqualTo(Integer value) {
            addCriterion("PackingContent_LogID =", value, "packingcontentLogid");
            return (Criteria) this;
        }

        public Criteria andPackingcontentLogidNotEqualTo(Integer value) {
            addCriterion("PackingContent_LogID <>", value, "packingcontentLogid");
            return (Criteria) this;
        }

        public Criteria andPackingcontentLogidGreaterThan(Integer value) {
            addCriterion("PackingContent_LogID >", value, "packingcontentLogid");
            return (Criteria) this;
        }

        public Criteria andPackingcontentLogidGreaterThanOrEqualTo(Integer value) {
            addCriterion("PackingContent_LogID >=", value, "packingcontentLogid");
            return (Criteria) this;
        }

        public Criteria andPackingcontentLogidLessThan(Integer value) {
            addCriterion("PackingContent_LogID <", value, "packingcontentLogid");
            return (Criteria) this;
        }

        public Criteria andPackingcontentLogidLessThanOrEqualTo(Integer value) {
            addCriterion("PackingContent_LogID <=", value, "packingcontentLogid");
            return (Criteria) this;
        }

        public Criteria andPackingcontentLogidIn(List<Integer> values) {
            addCriterion("PackingContent_LogID in", values, "packingcontentLogid");
            return (Criteria) this;
        }

        public Criteria andPackingcontentLogidNotIn(List<Integer> values) {
            addCriterion("PackingContent_LogID not in", values, "packingcontentLogid");
            return (Criteria) this;
        }

        public Criteria andPackingcontentLogidBetween(Integer value1, Integer value2) {
            addCriterion("PackingContent_LogID between", value1, value2, "packingcontentLogid");
            return (Criteria) this;
        }

        public Criteria andPackingcontentLogidNotBetween(Integer value1, Integer value2) {
            addCriterion("PackingContent_LogID not between", value1, value2, "packingcontentLogid");
            return (Criteria) this;
        }

        public Criteria andPackingcontentIdIsNull() {
            addCriterion("PackingContent_ID is null");
            return (Criteria) this;
        }

        public Criteria andPackingcontentIdIsNotNull() {
            addCriterion("PackingContent_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPackingcontentIdEqualTo(Integer value) {
            addCriterion("PackingContent_ID =", value, "packingcontentId");
            return (Criteria) this;
        }

        public Criteria andPackingcontentIdNotEqualTo(Integer value) {
            addCriterion("PackingContent_ID <>", value, "packingcontentId");
            return (Criteria) this;
        }

        public Criteria andPackingcontentIdGreaterThan(Integer value) {
            addCriterion("PackingContent_ID >", value, "packingcontentId");
            return (Criteria) this;
        }

        public Criteria andPackingcontentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PackingContent_ID >=", value, "packingcontentId");
            return (Criteria) this;
        }

        public Criteria andPackingcontentIdLessThan(Integer value) {
            addCriterion("PackingContent_ID <", value, "packingcontentId");
            return (Criteria) this;
        }

        public Criteria andPackingcontentIdLessThanOrEqualTo(Integer value) {
            addCriterion("PackingContent_ID <=", value, "packingcontentId");
            return (Criteria) this;
        }

        public Criteria andPackingcontentIdIn(List<Integer> values) {
            addCriterion("PackingContent_ID in", values, "packingcontentId");
            return (Criteria) this;
        }

        public Criteria andPackingcontentIdNotIn(List<Integer> values) {
            addCriterion("PackingContent_ID not in", values, "packingcontentId");
            return (Criteria) this;
        }

        public Criteria andPackingcontentIdBetween(Integer value1, Integer value2) {
            addCriterion("PackingContent_ID between", value1, value2, "packingcontentId");
            return (Criteria) this;
        }

        public Criteria andPackingcontentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PackingContent_ID not between", value1, value2, "packingcontentId");
            return (Criteria) this;
        }

        public Criteria andPackingcontentPremodifiedstateIsNull() {
            addCriterion("PackingContent_PreModifiedState is null");
            return (Criteria) this;
        }

        public Criteria andPackingcontentPremodifiedstateIsNotNull() {
            addCriterion("PackingContent_PreModifiedState is not null");
            return (Criteria) this;
        }

        public Criteria andPackingcontentPremodifiedstateEqualTo(String value) {
            addCriterion("PackingContent_PreModifiedState =", value, "packingcontentPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andPackingcontentPremodifiedstateNotEqualTo(String value) {
            addCriterion("PackingContent_PreModifiedState <>", value, "packingcontentPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andPackingcontentPremodifiedstateGreaterThan(String value) {
            addCriterion("PackingContent_PreModifiedState >", value, "packingcontentPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andPackingcontentPremodifiedstateGreaterThanOrEqualTo(String value) {
            addCriterion("PackingContent_PreModifiedState >=", value, "packingcontentPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andPackingcontentPremodifiedstateLessThan(String value) {
            addCriterion("PackingContent_PreModifiedState <", value, "packingcontentPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andPackingcontentPremodifiedstateLessThanOrEqualTo(String value) {
            addCriterion("PackingContent_PreModifiedState <=", value, "packingcontentPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andPackingcontentPremodifiedstateLike(String value) {
            addCriterion("PackingContent_PreModifiedState like", value, "packingcontentPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andPackingcontentPremodifiedstateNotLike(String value) {
            addCriterion("PackingContent_PreModifiedState not like", value, "packingcontentPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andPackingcontentPremodifiedstateIn(List<String> values) {
            addCriterion("PackingContent_PreModifiedState in", values, "packingcontentPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andPackingcontentPremodifiedstateNotIn(List<String> values) {
            addCriterion("PackingContent_PreModifiedState not in", values, "packingcontentPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andPackingcontentPremodifiedstateBetween(String value1, String value2) {
            addCriterion("PackingContent_PreModifiedState between", value1, value2, "packingcontentPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andPackingcontentPremodifiedstateNotBetween(String value1, String value2) {
            addCriterion("PackingContent_PreModifiedState not between", value1, value2, "packingcontentPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andPackingcontentModifiedstateIsNull() {
            addCriterion("PackingContent_ModifiedState is null");
            return (Criteria) this;
        }

        public Criteria andPackingcontentModifiedstateIsNotNull() {
            addCriterion("PackingContent_ModifiedState is not null");
            return (Criteria) this;
        }

        public Criteria andPackingcontentModifiedstateEqualTo(String value) {
            addCriterion("PackingContent_ModifiedState =", value, "packingcontentModifiedstate");
            return (Criteria) this;
        }

        public Criteria andPackingcontentModifiedstateNotEqualTo(String value) {
            addCriterion("PackingContent_ModifiedState <>", value, "packingcontentModifiedstate");
            return (Criteria) this;
        }

        public Criteria andPackingcontentModifiedstateGreaterThan(String value) {
            addCriterion("PackingContent_ModifiedState >", value, "packingcontentModifiedstate");
            return (Criteria) this;
        }

        public Criteria andPackingcontentModifiedstateGreaterThanOrEqualTo(String value) {
            addCriterion("PackingContent_ModifiedState >=", value, "packingcontentModifiedstate");
            return (Criteria) this;
        }

        public Criteria andPackingcontentModifiedstateLessThan(String value) {
            addCriterion("PackingContent_ModifiedState <", value, "packingcontentModifiedstate");
            return (Criteria) this;
        }

        public Criteria andPackingcontentModifiedstateLessThanOrEqualTo(String value) {
            addCriterion("PackingContent_ModifiedState <=", value, "packingcontentModifiedstate");
            return (Criteria) this;
        }

        public Criteria andPackingcontentModifiedstateLike(String value) {
            addCriterion("PackingContent_ModifiedState like", value, "packingcontentModifiedstate");
            return (Criteria) this;
        }

        public Criteria andPackingcontentModifiedstateNotLike(String value) {
            addCriterion("PackingContent_ModifiedState not like", value, "packingcontentModifiedstate");
            return (Criteria) this;
        }

        public Criteria andPackingcontentModifiedstateIn(List<String> values) {
            addCriterion("PackingContent_ModifiedState in", values, "packingcontentModifiedstate");
            return (Criteria) this;
        }

        public Criteria andPackingcontentModifiedstateNotIn(List<String> values) {
            addCriterion("PackingContent_ModifiedState not in", values, "packingcontentModifiedstate");
            return (Criteria) this;
        }

        public Criteria andPackingcontentModifiedstateBetween(String value1, String value2) {
            addCriterion("PackingContent_ModifiedState between", value1, value2, "packingcontentModifiedstate");
            return (Criteria) this;
        }

        public Criteria andPackingcontentModifiedstateNotBetween(String value1, String value2) {
            addCriterion("PackingContent_ModifiedState not between", value1, value2, "packingcontentModifiedstate");
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
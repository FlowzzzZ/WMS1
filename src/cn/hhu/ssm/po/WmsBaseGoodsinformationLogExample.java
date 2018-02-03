package cn.hhu.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WmsBaseGoodsinformationLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WmsBaseGoodsinformationLogExample() {
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

        public Criteria andGoodsinformationLogidIsNull() {
            addCriterion("GoodsInformation_LogID is null");
            return (Criteria) this;
        }

        public Criteria andGoodsinformationLogidIsNotNull() {
            addCriterion("GoodsInformation_LogID is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsinformationLogidEqualTo(Integer value) {
            addCriterion("GoodsInformation_LogID =", value, "goodsinformationLogid");
            return (Criteria) this;
        }

        public Criteria andGoodsinformationLogidNotEqualTo(Integer value) {
            addCriterion("GoodsInformation_LogID <>", value, "goodsinformationLogid");
            return (Criteria) this;
        }

        public Criteria andGoodsinformationLogidGreaterThan(Integer value) {
            addCriterion("GoodsInformation_LogID >", value, "goodsinformationLogid");
            return (Criteria) this;
        }

        public Criteria andGoodsinformationLogidGreaterThanOrEqualTo(Integer value) {
            addCriterion("GoodsInformation_LogID >=", value, "goodsinformationLogid");
            return (Criteria) this;
        }

        public Criteria andGoodsinformationLogidLessThan(Integer value) {
            addCriterion("GoodsInformation_LogID <", value, "goodsinformationLogid");
            return (Criteria) this;
        }

        public Criteria andGoodsinformationLogidLessThanOrEqualTo(Integer value) {
            addCriterion("GoodsInformation_LogID <=", value, "goodsinformationLogid");
            return (Criteria) this;
        }

        public Criteria andGoodsinformationLogidIn(List<Integer> values) {
            addCriterion("GoodsInformation_LogID in", values, "goodsinformationLogid");
            return (Criteria) this;
        }

        public Criteria andGoodsinformationLogidNotIn(List<Integer> values) {
            addCriterion("GoodsInformation_LogID not in", values, "goodsinformationLogid");
            return (Criteria) this;
        }

        public Criteria andGoodsinformationLogidBetween(Integer value1, Integer value2) {
            addCriterion("GoodsInformation_LogID between", value1, value2, "goodsinformationLogid");
            return (Criteria) this;
        }

        public Criteria andGoodsinformationLogidNotBetween(Integer value1, Integer value2) {
            addCriterion("GoodsInformation_LogID not between", value1, value2, "goodsinformationLogid");
            return (Criteria) this;
        }

        public Criteria andGoodsinformationIdIsNull() {
            addCriterion("GoodsInformation_ID is null");
            return (Criteria) this;
        }

        public Criteria andGoodsinformationIdIsNotNull() {
            addCriterion("GoodsInformation_ID is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsinformationIdEqualTo(Integer value) {
            addCriterion("GoodsInformation_ID =", value, "goodsinformationId");
            return (Criteria) this;
        }

        public Criteria andGoodsinformationIdNotEqualTo(Integer value) {
            addCriterion("GoodsInformation_ID <>", value, "goodsinformationId");
            return (Criteria) this;
        }

        public Criteria andGoodsinformationIdGreaterThan(Integer value) {
            addCriterion("GoodsInformation_ID >", value, "goodsinformationId");
            return (Criteria) this;
        }

        public Criteria andGoodsinformationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("GoodsInformation_ID >=", value, "goodsinformationId");
            return (Criteria) this;
        }

        public Criteria andGoodsinformationIdLessThan(Integer value) {
            addCriterion("GoodsInformation_ID <", value, "goodsinformationId");
            return (Criteria) this;
        }

        public Criteria andGoodsinformationIdLessThanOrEqualTo(Integer value) {
            addCriterion("GoodsInformation_ID <=", value, "goodsinformationId");
            return (Criteria) this;
        }

        public Criteria andGoodsinformationIdIn(List<Integer> values) {
            addCriterion("GoodsInformation_ID in", values, "goodsinformationId");
            return (Criteria) this;
        }

        public Criteria andGoodsinformationIdNotIn(List<Integer> values) {
            addCriterion("GoodsInformation_ID not in", values, "goodsinformationId");
            return (Criteria) this;
        }

        public Criteria andGoodsinformationIdBetween(Integer value1, Integer value2) {
            addCriterion("GoodsInformation_ID between", value1, value2, "goodsinformationId");
            return (Criteria) this;
        }

        public Criteria andGoodsinformationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("GoodsInformation_ID not between", value1, value2, "goodsinformationId");
            return (Criteria) this;
        }

        public Criteria andGoodsinformationPremodifiedstateIsNull() {
            addCriterion("GoodsInformation_PreModifiedState is null");
            return (Criteria) this;
        }

        public Criteria andGoodsinformationPremodifiedstateIsNotNull() {
            addCriterion("GoodsInformation_PreModifiedState is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsinformationPremodifiedstateEqualTo(String value) {
            addCriterion("GoodsInformation_PreModifiedState =", value, "goodsinformationPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andGoodsinformationPremodifiedstateNotEqualTo(String value) {
            addCriterion("GoodsInformation_PreModifiedState <>", value, "goodsinformationPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andGoodsinformationPremodifiedstateGreaterThan(String value) {
            addCriterion("GoodsInformation_PreModifiedState >", value, "goodsinformationPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andGoodsinformationPremodifiedstateGreaterThanOrEqualTo(String value) {
            addCriterion("GoodsInformation_PreModifiedState >=", value, "goodsinformationPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andGoodsinformationPremodifiedstateLessThan(String value) {
            addCriterion("GoodsInformation_PreModifiedState <", value, "goodsinformationPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andGoodsinformationPremodifiedstateLessThanOrEqualTo(String value) {
            addCriterion("GoodsInformation_PreModifiedState <=", value, "goodsinformationPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andGoodsinformationPremodifiedstateLike(String value) {
            addCriterion("GoodsInformation_PreModifiedState like", value, "goodsinformationPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andGoodsinformationPremodifiedstateNotLike(String value) {
            addCriterion("GoodsInformation_PreModifiedState not like", value, "goodsinformationPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andGoodsinformationPremodifiedstateIn(List<String> values) {
            addCriterion("GoodsInformation_PreModifiedState in", values, "goodsinformationPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andGoodsinformationPremodifiedstateNotIn(List<String> values) {
            addCriterion("GoodsInformation_PreModifiedState not in", values, "goodsinformationPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andGoodsinformationPremodifiedstateBetween(String value1, String value2) {
            addCriterion("GoodsInformation_PreModifiedState between", value1, value2, "goodsinformationPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andGoodsinformationPremodifiedstateNotBetween(String value1, String value2) {
            addCriterion("GoodsInformation_PreModifiedState not between", value1, value2, "goodsinformationPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andGoodsinformationModifiedstateIsNull() {
            addCriterion("GoodsInformation_ModifiedState is null");
            return (Criteria) this;
        }

        public Criteria andGoodsinformationModifiedstateIsNotNull() {
            addCriterion("GoodsInformation_ModifiedState is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsinformationModifiedstateEqualTo(String value) {
            addCriterion("GoodsInformation_ModifiedState =", value, "goodsinformationModifiedstate");
            return (Criteria) this;
        }

        public Criteria andGoodsinformationModifiedstateNotEqualTo(String value) {
            addCriterion("GoodsInformation_ModifiedState <>", value, "goodsinformationModifiedstate");
            return (Criteria) this;
        }

        public Criteria andGoodsinformationModifiedstateGreaterThan(String value) {
            addCriterion("GoodsInformation_ModifiedState >", value, "goodsinformationModifiedstate");
            return (Criteria) this;
        }

        public Criteria andGoodsinformationModifiedstateGreaterThanOrEqualTo(String value) {
            addCriterion("GoodsInformation_ModifiedState >=", value, "goodsinformationModifiedstate");
            return (Criteria) this;
        }

        public Criteria andGoodsinformationModifiedstateLessThan(String value) {
            addCriterion("GoodsInformation_ModifiedState <", value, "goodsinformationModifiedstate");
            return (Criteria) this;
        }

        public Criteria andGoodsinformationModifiedstateLessThanOrEqualTo(String value) {
            addCriterion("GoodsInformation_ModifiedState <=", value, "goodsinformationModifiedstate");
            return (Criteria) this;
        }

        public Criteria andGoodsinformationModifiedstateLike(String value) {
            addCriterion("GoodsInformation_ModifiedState like", value, "goodsinformationModifiedstate");
            return (Criteria) this;
        }

        public Criteria andGoodsinformationModifiedstateNotLike(String value) {
            addCriterion("GoodsInformation_ModifiedState not like", value, "goodsinformationModifiedstate");
            return (Criteria) this;
        }

        public Criteria andGoodsinformationModifiedstateIn(List<String> values) {
            addCriterion("GoodsInformation_ModifiedState in", values, "goodsinformationModifiedstate");
            return (Criteria) this;
        }

        public Criteria andGoodsinformationModifiedstateNotIn(List<String> values) {
            addCriterion("GoodsInformation_ModifiedState not in", values, "goodsinformationModifiedstate");
            return (Criteria) this;
        }

        public Criteria andGoodsinformationModifiedstateBetween(String value1, String value2) {
            addCriterion("GoodsInformation_ModifiedState between", value1, value2, "goodsinformationModifiedstate");
            return (Criteria) this;
        }

        public Criteria andGoodsinformationModifiedstateNotBetween(String value1, String value2) {
            addCriterion("GoodsInformation_ModifiedState not between", value1, value2, "goodsinformationModifiedstate");
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
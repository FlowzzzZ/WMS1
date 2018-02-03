package cn.hhu.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WmsExdetailLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WmsExdetailLogExample() {
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

        public Criteria andExdetailLogidIsNull() {
            addCriterion("EXDetail_LogID is null");
            return (Criteria) this;
        }

        public Criteria andExdetailLogidIsNotNull() {
            addCriterion("EXDetail_LogID is not null");
            return (Criteria) this;
        }

        public Criteria andExdetailLogidEqualTo(Integer value) {
            addCriterion("EXDetail_LogID =", value, "exdetailLogid");
            return (Criteria) this;
        }

        public Criteria andExdetailLogidNotEqualTo(Integer value) {
            addCriterion("EXDetail_LogID <>", value, "exdetailLogid");
            return (Criteria) this;
        }

        public Criteria andExdetailLogidGreaterThan(Integer value) {
            addCriterion("EXDetail_LogID >", value, "exdetailLogid");
            return (Criteria) this;
        }

        public Criteria andExdetailLogidGreaterThanOrEqualTo(Integer value) {
            addCriterion("EXDetail_LogID >=", value, "exdetailLogid");
            return (Criteria) this;
        }

        public Criteria andExdetailLogidLessThan(Integer value) {
            addCriterion("EXDetail_LogID <", value, "exdetailLogid");
            return (Criteria) this;
        }

        public Criteria andExdetailLogidLessThanOrEqualTo(Integer value) {
            addCriterion("EXDetail_LogID <=", value, "exdetailLogid");
            return (Criteria) this;
        }

        public Criteria andExdetailLogidIn(List<Integer> values) {
            addCriterion("EXDetail_LogID in", values, "exdetailLogid");
            return (Criteria) this;
        }

        public Criteria andExdetailLogidNotIn(List<Integer> values) {
            addCriterion("EXDetail_LogID not in", values, "exdetailLogid");
            return (Criteria) this;
        }

        public Criteria andExdetailLogidBetween(Integer value1, Integer value2) {
            addCriterion("EXDetail_LogID between", value1, value2, "exdetailLogid");
            return (Criteria) this;
        }

        public Criteria andExdetailLogidNotBetween(Integer value1, Integer value2) {
            addCriterion("EXDetail_LogID not between", value1, value2, "exdetailLogid");
            return (Criteria) this;
        }

        public Criteria andExdetailIdIsNull() {
            addCriterion("EXDetail_ID is null");
            return (Criteria) this;
        }

        public Criteria andExdetailIdIsNotNull() {
            addCriterion("EXDetail_ID is not null");
            return (Criteria) this;
        }

        public Criteria andExdetailIdEqualTo(Integer value) {
            addCriterion("EXDetail_ID =", value, "exdetailId");
            return (Criteria) this;
        }

        public Criteria andExdetailIdNotEqualTo(Integer value) {
            addCriterion("EXDetail_ID <>", value, "exdetailId");
            return (Criteria) this;
        }

        public Criteria andExdetailIdGreaterThan(Integer value) {
            addCriterion("EXDetail_ID >", value, "exdetailId");
            return (Criteria) this;
        }

        public Criteria andExdetailIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("EXDetail_ID >=", value, "exdetailId");
            return (Criteria) this;
        }

        public Criteria andExdetailIdLessThan(Integer value) {
            addCriterion("EXDetail_ID <", value, "exdetailId");
            return (Criteria) this;
        }

        public Criteria andExdetailIdLessThanOrEqualTo(Integer value) {
            addCriterion("EXDetail_ID <=", value, "exdetailId");
            return (Criteria) this;
        }

        public Criteria andExdetailIdIn(List<Integer> values) {
            addCriterion("EXDetail_ID in", values, "exdetailId");
            return (Criteria) this;
        }

        public Criteria andExdetailIdNotIn(List<Integer> values) {
            addCriterion("EXDetail_ID not in", values, "exdetailId");
            return (Criteria) this;
        }

        public Criteria andExdetailIdBetween(Integer value1, Integer value2) {
            addCriterion("EXDetail_ID between", value1, value2, "exdetailId");
            return (Criteria) this;
        }

        public Criteria andExdetailIdNotBetween(Integer value1, Integer value2) {
            addCriterion("EXDetail_ID not between", value1, value2, "exdetailId");
            return (Criteria) this;
        }

        public Criteria andExdetailPremodifiedstateIsNull() {
            addCriterion("EXDetail_PreModifiedState is null");
            return (Criteria) this;
        }

        public Criteria andExdetailPremodifiedstateIsNotNull() {
            addCriterion("EXDetail_PreModifiedState is not null");
            return (Criteria) this;
        }

        public Criteria andExdetailPremodifiedstateEqualTo(String value) {
            addCriterion("EXDetail_PreModifiedState =", value, "exdetailPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andExdetailPremodifiedstateNotEqualTo(String value) {
            addCriterion("EXDetail_PreModifiedState <>", value, "exdetailPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andExdetailPremodifiedstateGreaterThan(String value) {
            addCriterion("EXDetail_PreModifiedState >", value, "exdetailPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andExdetailPremodifiedstateGreaterThanOrEqualTo(String value) {
            addCriterion("EXDetail_PreModifiedState >=", value, "exdetailPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andExdetailPremodifiedstateLessThan(String value) {
            addCriterion("EXDetail_PreModifiedState <", value, "exdetailPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andExdetailPremodifiedstateLessThanOrEqualTo(String value) {
            addCriterion("EXDetail_PreModifiedState <=", value, "exdetailPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andExdetailPremodifiedstateLike(String value) {
            addCriterion("EXDetail_PreModifiedState like", value, "exdetailPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andExdetailPremodifiedstateNotLike(String value) {
            addCriterion("EXDetail_PreModifiedState not like", value, "exdetailPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andExdetailPremodifiedstateIn(List<String> values) {
            addCriterion("EXDetail_PreModifiedState in", values, "exdetailPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andExdetailPremodifiedstateNotIn(List<String> values) {
            addCriterion("EXDetail_PreModifiedState not in", values, "exdetailPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andExdetailPremodifiedstateBetween(String value1, String value2) {
            addCriterion("EXDetail_PreModifiedState between", value1, value2, "exdetailPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andExdetailPremodifiedstateNotBetween(String value1, String value2) {
            addCriterion("EXDetail_PreModifiedState not between", value1, value2, "exdetailPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andExdetailModifiedstateIsNull() {
            addCriterion("EXDetail_ModifiedState is null");
            return (Criteria) this;
        }

        public Criteria andExdetailModifiedstateIsNotNull() {
            addCriterion("EXDetail_ModifiedState is not null");
            return (Criteria) this;
        }

        public Criteria andExdetailModifiedstateEqualTo(String value) {
            addCriterion("EXDetail_ModifiedState =", value, "exdetailModifiedstate");
            return (Criteria) this;
        }

        public Criteria andExdetailModifiedstateNotEqualTo(String value) {
            addCriterion("EXDetail_ModifiedState <>", value, "exdetailModifiedstate");
            return (Criteria) this;
        }

        public Criteria andExdetailModifiedstateGreaterThan(String value) {
            addCriterion("EXDetail_ModifiedState >", value, "exdetailModifiedstate");
            return (Criteria) this;
        }

        public Criteria andExdetailModifiedstateGreaterThanOrEqualTo(String value) {
            addCriterion("EXDetail_ModifiedState >=", value, "exdetailModifiedstate");
            return (Criteria) this;
        }

        public Criteria andExdetailModifiedstateLessThan(String value) {
            addCriterion("EXDetail_ModifiedState <", value, "exdetailModifiedstate");
            return (Criteria) this;
        }

        public Criteria andExdetailModifiedstateLessThanOrEqualTo(String value) {
            addCriterion("EXDetail_ModifiedState <=", value, "exdetailModifiedstate");
            return (Criteria) this;
        }

        public Criteria andExdetailModifiedstateLike(String value) {
            addCriterion("EXDetail_ModifiedState like", value, "exdetailModifiedstate");
            return (Criteria) this;
        }

        public Criteria andExdetailModifiedstateNotLike(String value) {
            addCriterion("EXDetail_ModifiedState not like", value, "exdetailModifiedstate");
            return (Criteria) this;
        }

        public Criteria andExdetailModifiedstateIn(List<String> values) {
            addCriterion("EXDetail_ModifiedState in", values, "exdetailModifiedstate");
            return (Criteria) this;
        }

        public Criteria andExdetailModifiedstateNotIn(List<String> values) {
            addCriterion("EXDetail_ModifiedState not in", values, "exdetailModifiedstate");
            return (Criteria) this;
        }

        public Criteria andExdetailModifiedstateBetween(String value1, String value2) {
            addCriterion("EXDetail_ModifiedState between", value1, value2, "exdetailModifiedstate");
            return (Criteria) this;
        }

        public Criteria andExdetailModifiedstateNotBetween(String value1, String value2) {
            addCriterion("EXDetail_ModifiedState not between", value1, value2, "exdetailModifiedstate");
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
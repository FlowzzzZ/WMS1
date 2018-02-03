package cn.hhu.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WmsBaseUserLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WmsBaseUserLogExample() {
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

        public Criteria andUserLogidIsNull() {
            addCriterion("User_LogID is null");
            return (Criteria) this;
        }

        public Criteria andUserLogidIsNotNull() {
            addCriterion("User_LogID is not null");
            return (Criteria) this;
        }

        public Criteria andUserLogidEqualTo(Integer value) {
            addCriterion("User_LogID =", value, "userLogid");
            return (Criteria) this;
        }

        public Criteria andUserLogidNotEqualTo(Integer value) {
            addCriterion("User_LogID <>", value, "userLogid");
            return (Criteria) this;
        }

        public Criteria andUserLogidGreaterThan(Integer value) {
            addCriterion("User_LogID >", value, "userLogid");
            return (Criteria) this;
        }

        public Criteria andUserLogidGreaterThanOrEqualTo(Integer value) {
            addCriterion("User_LogID >=", value, "userLogid");
            return (Criteria) this;
        }

        public Criteria andUserLogidLessThan(Integer value) {
            addCriterion("User_LogID <", value, "userLogid");
            return (Criteria) this;
        }

        public Criteria andUserLogidLessThanOrEqualTo(Integer value) {
            addCriterion("User_LogID <=", value, "userLogid");
            return (Criteria) this;
        }

        public Criteria andUserLogidIn(List<Integer> values) {
            addCriterion("User_LogID in", values, "userLogid");
            return (Criteria) this;
        }

        public Criteria andUserLogidNotIn(List<Integer> values) {
            addCriterion("User_LogID not in", values, "userLogid");
            return (Criteria) this;
        }

        public Criteria andUserLogidBetween(Integer value1, Integer value2) {
            addCriterion("User_LogID between", value1, value2, "userLogid");
            return (Criteria) this;
        }

        public Criteria andUserLogidNotBetween(Integer value1, Integer value2) {
            addCriterion("User_LogID not between", value1, value2, "userLogid");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("User_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("User_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("User_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("User_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("User_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("User_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("User_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("User_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("User_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("User_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("User_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("User_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserPremodifiedstateIsNull() {
            addCriterion("User_PreModifiedState is null");
            return (Criteria) this;
        }

        public Criteria andUserPremodifiedstateIsNotNull() {
            addCriterion("User_PreModifiedState is not null");
            return (Criteria) this;
        }

        public Criteria andUserPremodifiedstateEqualTo(String value) {
            addCriterion("User_PreModifiedState =", value, "userPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andUserPremodifiedstateNotEqualTo(String value) {
            addCriterion("User_PreModifiedState <>", value, "userPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andUserPremodifiedstateGreaterThan(String value) {
            addCriterion("User_PreModifiedState >", value, "userPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andUserPremodifiedstateGreaterThanOrEqualTo(String value) {
            addCriterion("User_PreModifiedState >=", value, "userPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andUserPremodifiedstateLessThan(String value) {
            addCriterion("User_PreModifiedState <", value, "userPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andUserPremodifiedstateLessThanOrEqualTo(String value) {
            addCriterion("User_PreModifiedState <=", value, "userPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andUserPremodifiedstateLike(String value) {
            addCriterion("User_PreModifiedState like", value, "userPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andUserPremodifiedstateNotLike(String value) {
            addCriterion("User_PreModifiedState not like", value, "userPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andUserPremodifiedstateIn(List<String> values) {
            addCriterion("User_PreModifiedState in", values, "userPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andUserPremodifiedstateNotIn(List<String> values) {
            addCriterion("User_PreModifiedState not in", values, "userPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andUserPremodifiedstateBetween(String value1, String value2) {
            addCriterion("User_PreModifiedState between", value1, value2, "userPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andUserPremodifiedstateNotBetween(String value1, String value2) {
            addCriterion("User_PreModifiedState not between", value1, value2, "userPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andUserModifiedstateIsNull() {
            addCriterion("User_ModifiedState is null");
            return (Criteria) this;
        }

        public Criteria andUserModifiedstateIsNotNull() {
            addCriterion("User_ModifiedState is not null");
            return (Criteria) this;
        }

        public Criteria andUserModifiedstateEqualTo(String value) {
            addCriterion("User_ModifiedState =", value, "userModifiedstate");
            return (Criteria) this;
        }

        public Criteria andUserModifiedstateNotEqualTo(String value) {
            addCriterion("User_ModifiedState <>", value, "userModifiedstate");
            return (Criteria) this;
        }

        public Criteria andUserModifiedstateGreaterThan(String value) {
            addCriterion("User_ModifiedState >", value, "userModifiedstate");
            return (Criteria) this;
        }

        public Criteria andUserModifiedstateGreaterThanOrEqualTo(String value) {
            addCriterion("User_ModifiedState >=", value, "userModifiedstate");
            return (Criteria) this;
        }

        public Criteria andUserModifiedstateLessThan(String value) {
            addCriterion("User_ModifiedState <", value, "userModifiedstate");
            return (Criteria) this;
        }

        public Criteria andUserModifiedstateLessThanOrEqualTo(String value) {
            addCriterion("User_ModifiedState <=", value, "userModifiedstate");
            return (Criteria) this;
        }

        public Criteria andUserModifiedstateLike(String value) {
            addCriterion("User_ModifiedState like", value, "userModifiedstate");
            return (Criteria) this;
        }

        public Criteria andUserModifiedstateNotLike(String value) {
            addCriterion("User_ModifiedState not like", value, "userModifiedstate");
            return (Criteria) this;
        }

        public Criteria andUserModifiedstateIn(List<String> values) {
            addCriterion("User_ModifiedState in", values, "userModifiedstate");
            return (Criteria) this;
        }

        public Criteria andUserModifiedstateNotIn(List<String> values) {
            addCriterion("User_ModifiedState not in", values, "userModifiedstate");
            return (Criteria) this;
        }

        public Criteria andUserModifiedstateBetween(String value1, String value2) {
            addCriterion("User_ModifiedState between", value1, value2, "userModifiedstate");
            return (Criteria) this;
        }

        public Criteria andUserModifiedstateNotBetween(String value1, String value2) {
            addCriterion("User_ModifiedState not between", value1, value2, "userModifiedstate");
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

        public Criteria andModifeddateIsNull() {
            addCriterion("ModifedDate is null");
            return (Criteria) this;
        }

        public Criteria andModifeddateIsNotNull() {
            addCriterion("ModifedDate is not null");
            return (Criteria) this;
        }

        public Criteria andModifeddateEqualTo(Date value) {
            addCriterion("ModifedDate =", value, "modifeddate");
            return (Criteria) this;
        }

        public Criteria andModifeddateNotEqualTo(Date value) {
            addCriterion("ModifedDate <>", value, "modifeddate");
            return (Criteria) this;
        }

        public Criteria andModifeddateGreaterThan(Date value) {
            addCriterion("ModifedDate >", value, "modifeddate");
            return (Criteria) this;
        }

        public Criteria andModifeddateGreaterThanOrEqualTo(Date value) {
            addCriterion("ModifedDate >=", value, "modifeddate");
            return (Criteria) this;
        }

        public Criteria andModifeddateLessThan(Date value) {
            addCriterion("ModifedDate <", value, "modifeddate");
            return (Criteria) this;
        }

        public Criteria andModifeddateLessThanOrEqualTo(Date value) {
            addCriterion("ModifedDate <=", value, "modifeddate");
            return (Criteria) this;
        }

        public Criteria andModifeddateIn(List<Date> values) {
            addCriterion("ModifedDate in", values, "modifeddate");
            return (Criteria) this;
        }

        public Criteria andModifeddateNotIn(List<Date> values) {
            addCriterion("ModifedDate not in", values, "modifeddate");
            return (Criteria) this;
        }

        public Criteria andModifeddateBetween(Date value1, Date value2) {
            addCriterion("ModifedDate between", value1, value2, "modifeddate");
            return (Criteria) this;
        }

        public Criteria andModifeddateNotBetween(Date value1, Date value2) {
            addCriterion("ModifedDate not between", value1, value2, "modifeddate");
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
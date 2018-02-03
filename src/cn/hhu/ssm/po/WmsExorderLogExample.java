package cn.hhu.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WmsExorderLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WmsExorderLogExample() {
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

        public Criteria andExorderLogidIsNull() {
            addCriterion("EXOrder_LogID is null");
            return (Criteria) this;
        }

        public Criteria andExorderLogidIsNotNull() {
            addCriterion("EXOrder_LogID is not null");
            return (Criteria) this;
        }

        public Criteria andExorderLogidEqualTo(Integer value) {
            addCriterion("EXOrder_LogID =", value, "exorderLogid");
            return (Criteria) this;
        }

        public Criteria andExorderLogidNotEqualTo(Integer value) {
            addCriterion("EXOrder_LogID <>", value, "exorderLogid");
            return (Criteria) this;
        }

        public Criteria andExorderLogidGreaterThan(Integer value) {
            addCriterion("EXOrder_LogID >", value, "exorderLogid");
            return (Criteria) this;
        }

        public Criteria andExorderLogidGreaterThanOrEqualTo(Integer value) {
            addCriterion("EXOrder_LogID >=", value, "exorderLogid");
            return (Criteria) this;
        }

        public Criteria andExorderLogidLessThan(Integer value) {
            addCriterion("EXOrder_LogID <", value, "exorderLogid");
            return (Criteria) this;
        }

        public Criteria andExorderLogidLessThanOrEqualTo(Integer value) {
            addCriterion("EXOrder_LogID <=", value, "exorderLogid");
            return (Criteria) this;
        }

        public Criteria andExorderLogidIn(List<Integer> values) {
            addCriterion("EXOrder_LogID in", values, "exorderLogid");
            return (Criteria) this;
        }

        public Criteria andExorderLogidNotIn(List<Integer> values) {
            addCriterion("EXOrder_LogID not in", values, "exorderLogid");
            return (Criteria) this;
        }

        public Criteria andExorderLogidBetween(Integer value1, Integer value2) {
            addCriterion("EXOrder_LogID between", value1, value2, "exorderLogid");
            return (Criteria) this;
        }

        public Criteria andExorderLogidNotBetween(Integer value1, Integer value2) {
            addCriterion("EXOrder_LogID not between", value1, value2, "exorderLogid");
            return (Criteria) this;
        }

        public Criteria andExorderIdIsNull() {
            addCriterion("EXOrder_ID is null");
            return (Criteria) this;
        }

        public Criteria andExorderIdIsNotNull() {
            addCriterion("EXOrder_ID is not null");
            return (Criteria) this;
        }

        public Criteria andExorderIdEqualTo(Integer value) {
            addCriterion("EXOrder_ID =", value, "exorderId");
            return (Criteria) this;
        }

        public Criteria andExorderIdNotEqualTo(Integer value) {
            addCriterion("EXOrder_ID <>", value, "exorderId");
            return (Criteria) this;
        }

        public Criteria andExorderIdGreaterThan(Integer value) {
            addCriterion("EXOrder_ID >", value, "exorderId");
            return (Criteria) this;
        }

        public Criteria andExorderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("EXOrder_ID >=", value, "exorderId");
            return (Criteria) this;
        }

        public Criteria andExorderIdLessThan(Integer value) {
            addCriterion("EXOrder_ID <", value, "exorderId");
            return (Criteria) this;
        }

        public Criteria andExorderIdLessThanOrEqualTo(Integer value) {
            addCriterion("EXOrder_ID <=", value, "exorderId");
            return (Criteria) this;
        }

        public Criteria andExorderIdIn(List<Integer> values) {
            addCriterion("EXOrder_ID in", values, "exorderId");
            return (Criteria) this;
        }

        public Criteria andExorderIdNotIn(List<Integer> values) {
            addCriterion("EXOrder_ID not in", values, "exorderId");
            return (Criteria) this;
        }

        public Criteria andExorderIdBetween(Integer value1, Integer value2) {
            addCriterion("EXOrder_ID between", value1, value2, "exorderId");
            return (Criteria) this;
        }

        public Criteria andExorderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("EXOrder_ID not between", value1, value2, "exorderId");
            return (Criteria) this;
        }

        public Criteria andExorderPremodifiedstateIsNull() {
            addCriterion("EXOrder_PreModifiedState is null");
            return (Criteria) this;
        }

        public Criteria andExorderPremodifiedstateIsNotNull() {
            addCriterion("EXOrder_PreModifiedState is not null");
            return (Criteria) this;
        }

        public Criteria andExorderPremodifiedstateEqualTo(String value) {
            addCriterion("EXOrder_PreModifiedState =", value, "exorderPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andExorderPremodifiedstateNotEqualTo(String value) {
            addCriterion("EXOrder_PreModifiedState <>", value, "exorderPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andExorderPremodifiedstateGreaterThan(String value) {
            addCriterion("EXOrder_PreModifiedState >", value, "exorderPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andExorderPremodifiedstateGreaterThanOrEqualTo(String value) {
            addCriterion("EXOrder_PreModifiedState >=", value, "exorderPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andExorderPremodifiedstateLessThan(String value) {
            addCriterion("EXOrder_PreModifiedState <", value, "exorderPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andExorderPremodifiedstateLessThanOrEqualTo(String value) {
            addCriterion("EXOrder_PreModifiedState <=", value, "exorderPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andExorderPremodifiedstateLike(String value) {
            addCriterion("EXOrder_PreModifiedState like", value, "exorderPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andExorderPremodifiedstateNotLike(String value) {
            addCriterion("EXOrder_PreModifiedState not like", value, "exorderPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andExorderPremodifiedstateIn(List<String> values) {
            addCriterion("EXOrder_PreModifiedState in", values, "exorderPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andExorderPremodifiedstateNotIn(List<String> values) {
            addCriterion("EXOrder_PreModifiedState not in", values, "exorderPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andExorderPremodifiedstateBetween(String value1, String value2) {
            addCriterion("EXOrder_PreModifiedState between", value1, value2, "exorderPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andExorderPremodifiedstateNotBetween(String value1, String value2) {
            addCriterion("EXOrder_PreModifiedState not between", value1, value2, "exorderPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andExorderModifiedstateIsNull() {
            addCriterion("EXOrder_ModifiedState is null");
            return (Criteria) this;
        }

        public Criteria andExorderModifiedstateIsNotNull() {
            addCriterion("EXOrder_ModifiedState is not null");
            return (Criteria) this;
        }

        public Criteria andExorderModifiedstateEqualTo(String value) {
            addCriterion("EXOrder_ModifiedState =", value, "exorderModifiedstate");
            return (Criteria) this;
        }

        public Criteria andExorderModifiedstateNotEqualTo(String value) {
            addCriterion("EXOrder_ModifiedState <>", value, "exorderModifiedstate");
            return (Criteria) this;
        }

        public Criteria andExorderModifiedstateGreaterThan(String value) {
            addCriterion("EXOrder_ModifiedState >", value, "exorderModifiedstate");
            return (Criteria) this;
        }

        public Criteria andExorderModifiedstateGreaterThanOrEqualTo(String value) {
            addCriterion("EXOrder_ModifiedState >=", value, "exorderModifiedstate");
            return (Criteria) this;
        }

        public Criteria andExorderModifiedstateLessThan(String value) {
            addCriterion("EXOrder_ModifiedState <", value, "exorderModifiedstate");
            return (Criteria) this;
        }

        public Criteria andExorderModifiedstateLessThanOrEqualTo(String value) {
            addCriterion("EXOrder_ModifiedState <=", value, "exorderModifiedstate");
            return (Criteria) this;
        }

        public Criteria andExorderModifiedstateLike(String value) {
            addCriterion("EXOrder_ModifiedState like", value, "exorderModifiedstate");
            return (Criteria) this;
        }

        public Criteria andExorderModifiedstateNotLike(String value) {
            addCriterion("EXOrder_ModifiedState not like", value, "exorderModifiedstate");
            return (Criteria) this;
        }

        public Criteria andExorderModifiedstateIn(List<String> values) {
            addCriterion("EXOrder_ModifiedState in", values, "exorderModifiedstate");
            return (Criteria) this;
        }

        public Criteria andExorderModifiedstateNotIn(List<String> values) {
            addCriterion("EXOrder_ModifiedState not in", values, "exorderModifiedstate");
            return (Criteria) this;
        }

        public Criteria andExorderModifiedstateBetween(String value1, String value2) {
            addCriterion("EXOrder_ModifiedState between", value1, value2, "exorderModifiedstate");
            return (Criteria) this;
        }

        public Criteria andExorderModifiedstateNotBetween(String value1, String value2) {
            addCriterion("EXOrder_ModifiedState not between", value1, value2, "exorderModifiedstate");
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
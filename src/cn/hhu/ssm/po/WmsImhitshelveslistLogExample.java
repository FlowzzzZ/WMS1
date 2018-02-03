package cn.hhu.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WmsImhitshelveslistLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WmsImhitshelveslistLogExample() {
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

        public Criteria andImhitshelveslistsLogidIsNull() {
            addCriterion("IMHitShelvesLists_LogID is null");
            return (Criteria) this;
        }

        public Criteria andImhitshelveslistsLogidIsNotNull() {
            addCriterion("IMHitShelvesLists_LogID is not null");
            return (Criteria) this;
        }

        public Criteria andImhitshelveslistsLogidEqualTo(Integer value) {
            addCriterion("IMHitShelvesLists_LogID =", value, "imhitshelveslistsLogid");
            return (Criteria) this;
        }

        public Criteria andImhitshelveslistsLogidNotEqualTo(Integer value) {
            addCriterion("IMHitShelvesLists_LogID <>", value, "imhitshelveslistsLogid");
            return (Criteria) this;
        }

        public Criteria andImhitshelveslistsLogidGreaterThan(Integer value) {
            addCriterion("IMHitShelvesLists_LogID >", value, "imhitshelveslistsLogid");
            return (Criteria) this;
        }

        public Criteria andImhitshelveslistsLogidGreaterThanOrEqualTo(Integer value) {
            addCriterion("IMHitShelvesLists_LogID >=", value, "imhitshelveslistsLogid");
            return (Criteria) this;
        }

        public Criteria andImhitshelveslistsLogidLessThan(Integer value) {
            addCriterion("IMHitShelvesLists_LogID <", value, "imhitshelveslistsLogid");
            return (Criteria) this;
        }

        public Criteria andImhitshelveslistsLogidLessThanOrEqualTo(Integer value) {
            addCriterion("IMHitShelvesLists_LogID <=", value, "imhitshelveslistsLogid");
            return (Criteria) this;
        }

        public Criteria andImhitshelveslistsLogidIn(List<Integer> values) {
            addCriterion("IMHitShelvesLists_LogID in", values, "imhitshelveslistsLogid");
            return (Criteria) this;
        }

        public Criteria andImhitshelveslistsLogidNotIn(List<Integer> values) {
            addCriterion("IMHitShelvesLists_LogID not in", values, "imhitshelveslistsLogid");
            return (Criteria) this;
        }

        public Criteria andImhitshelveslistsLogidBetween(Integer value1, Integer value2) {
            addCriterion("IMHitShelvesLists_LogID between", value1, value2, "imhitshelveslistsLogid");
            return (Criteria) this;
        }

        public Criteria andImhitshelveslistsLogidNotBetween(Integer value1, Integer value2) {
            addCriterion("IMHitShelvesLists_LogID not between", value1, value2, "imhitshelveslistsLogid");
            return (Criteria) this;
        }

        public Criteria andImhitshelveslistsIdIsNull() {
            addCriterion("IMHitShelvesLists_ID is null");
            return (Criteria) this;
        }

        public Criteria andImhitshelveslistsIdIsNotNull() {
            addCriterion("IMHitShelvesLists_ID is not null");
            return (Criteria) this;
        }

        public Criteria andImhitshelveslistsIdEqualTo(Integer value) {
            addCriterion("IMHitShelvesLists_ID =", value, "imhitshelveslistsId");
            return (Criteria) this;
        }

        public Criteria andImhitshelveslistsIdNotEqualTo(Integer value) {
            addCriterion("IMHitShelvesLists_ID <>", value, "imhitshelveslistsId");
            return (Criteria) this;
        }

        public Criteria andImhitshelveslistsIdGreaterThan(Integer value) {
            addCriterion("IMHitShelvesLists_ID >", value, "imhitshelveslistsId");
            return (Criteria) this;
        }

        public Criteria andImhitshelveslistsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("IMHitShelvesLists_ID >=", value, "imhitshelveslistsId");
            return (Criteria) this;
        }

        public Criteria andImhitshelveslistsIdLessThan(Integer value) {
            addCriterion("IMHitShelvesLists_ID <", value, "imhitshelveslistsId");
            return (Criteria) this;
        }

        public Criteria andImhitshelveslistsIdLessThanOrEqualTo(Integer value) {
            addCriterion("IMHitShelvesLists_ID <=", value, "imhitshelveslistsId");
            return (Criteria) this;
        }

        public Criteria andImhitshelveslistsIdIn(List<Integer> values) {
            addCriterion("IMHitShelvesLists_ID in", values, "imhitshelveslistsId");
            return (Criteria) this;
        }

        public Criteria andImhitshelveslistsIdNotIn(List<Integer> values) {
            addCriterion("IMHitShelvesLists_ID not in", values, "imhitshelveslistsId");
            return (Criteria) this;
        }

        public Criteria andImhitshelveslistsIdBetween(Integer value1, Integer value2) {
            addCriterion("IMHitShelvesLists_ID between", value1, value2, "imhitshelveslistsId");
            return (Criteria) this;
        }

        public Criteria andImhitshelveslistsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("IMHitShelvesLists_ID not between", value1, value2, "imhitshelveslistsId");
            return (Criteria) this;
        }

        public Criteria andImhitshelveslistsPremodifiedstateIsNull() {
            addCriterion("IMHitShelvesLists_PreModifiedState is null");
            return (Criteria) this;
        }

        public Criteria andImhitshelveslistsPremodifiedstateIsNotNull() {
            addCriterion("IMHitShelvesLists_PreModifiedState is not null");
            return (Criteria) this;
        }

        public Criteria andImhitshelveslistsPremodifiedstateEqualTo(String value) {
            addCriterion("IMHitShelvesLists_PreModifiedState =", value, "imhitshelveslistsPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andImhitshelveslistsPremodifiedstateNotEqualTo(String value) {
            addCriterion("IMHitShelvesLists_PreModifiedState <>", value, "imhitshelveslistsPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andImhitshelveslistsPremodifiedstateGreaterThan(String value) {
            addCriterion("IMHitShelvesLists_PreModifiedState >", value, "imhitshelveslistsPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andImhitshelveslistsPremodifiedstateGreaterThanOrEqualTo(String value) {
            addCriterion("IMHitShelvesLists_PreModifiedState >=", value, "imhitshelveslistsPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andImhitshelveslistsPremodifiedstateLessThan(String value) {
            addCriterion("IMHitShelvesLists_PreModifiedState <", value, "imhitshelveslistsPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andImhitshelveslistsPremodifiedstateLessThanOrEqualTo(String value) {
            addCriterion("IMHitShelvesLists_PreModifiedState <=", value, "imhitshelveslistsPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andImhitshelveslistsPremodifiedstateLike(String value) {
            addCriterion("IMHitShelvesLists_PreModifiedState like", value, "imhitshelveslistsPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andImhitshelveslistsPremodifiedstateNotLike(String value) {
            addCriterion("IMHitShelvesLists_PreModifiedState not like", value, "imhitshelveslistsPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andImhitshelveslistsPremodifiedstateIn(List<String> values) {
            addCriterion("IMHitShelvesLists_PreModifiedState in", values, "imhitshelveslistsPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andImhitshelveslistsPremodifiedstateNotIn(List<String> values) {
            addCriterion("IMHitShelvesLists_PreModifiedState not in", values, "imhitshelveslistsPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andImhitshelveslistsPremodifiedstateBetween(String value1, String value2) {
            addCriterion("IMHitShelvesLists_PreModifiedState between", value1, value2, "imhitshelveslistsPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andImhitshelveslistsPremodifiedstateNotBetween(String value1, String value2) {
            addCriterion("IMHitShelvesLists_PreModifiedState not between", value1, value2, "imhitshelveslistsPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andImhitshelveslistsModifiedstateIsNull() {
            addCriterion("IMHitShelvesLists_ModifiedState is null");
            return (Criteria) this;
        }

        public Criteria andImhitshelveslistsModifiedstateIsNotNull() {
            addCriterion("IMHitShelvesLists_ModifiedState is not null");
            return (Criteria) this;
        }

        public Criteria andImhitshelveslistsModifiedstateEqualTo(String value) {
            addCriterion("IMHitShelvesLists_ModifiedState =", value, "imhitshelveslistsModifiedstate");
            return (Criteria) this;
        }

        public Criteria andImhitshelveslistsModifiedstateNotEqualTo(String value) {
            addCriterion("IMHitShelvesLists_ModifiedState <>", value, "imhitshelveslistsModifiedstate");
            return (Criteria) this;
        }

        public Criteria andImhitshelveslistsModifiedstateGreaterThan(String value) {
            addCriterion("IMHitShelvesLists_ModifiedState >", value, "imhitshelveslistsModifiedstate");
            return (Criteria) this;
        }

        public Criteria andImhitshelveslistsModifiedstateGreaterThanOrEqualTo(String value) {
            addCriterion("IMHitShelvesLists_ModifiedState >=", value, "imhitshelveslistsModifiedstate");
            return (Criteria) this;
        }

        public Criteria andImhitshelveslistsModifiedstateLessThan(String value) {
            addCriterion("IMHitShelvesLists_ModifiedState <", value, "imhitshelveslistsModifiedstate");
            return (Criteria) this;
        }

        public Criteria andImhitshelveslistsModifiedstateLessThanOrEqualTo(String value) {
            addCriterion("IMHitShelvesLists_ModifiedState <=", value, "imhitshelveslistsModifiedstate");
            return (Criteria) this;
        }

        public Criteria andImhitshelveslistsModifiedstateLike(String value) {
            addCriterion("IMHitShelvesLists_ModifiedState like", value, "imhitshelveslistsModifiedstate");
            return (Criteria) this;
        }

        public Criteria andImhitshelveslistsModifiedstateNotLike(String value) {
            addCriterion("IMHitShelvesLists_ModifiedState not like", value, "imhitshelveslistsModifiedstate");
            return (Criteria) this;
        }

        public Criteria andImhitshelveslistsModifiedstateIn(List<String> values) {
            addCriterion("IMHitShelvesLists_ModifiedState in", values, "imhitshelveslistsModifiedstate");
            return (Criteria) this;
        }

        public Criteria andImhitshelveslistsModifiedstateNotIn(List<String> values) {
            addCriterion("IMHitShelvesLists_ModifiedState not in", values, "imhitshelveslistsModifiedstate");
            return (Criteria) this;
        }

        public Criteria andImhitshelveslistsModifiedstateBetween(String value1, String value2) {
            addCriterion("IMHitShelvesLists_ModifiedState between", value1, value2, "imhitshelveslistsModifiedstate");
            return (Criteria) this;
        }

        public Criteria andImhitshelveslistsModifiedstateNotBetween(String value1, String value2) {
            addCriterion("IMHitShelvesLists_ModifiedState not between", value1, value2, "imhitshelveslistsModifiedstate");
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
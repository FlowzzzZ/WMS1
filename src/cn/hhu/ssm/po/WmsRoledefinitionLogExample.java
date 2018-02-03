package cn.hhu.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WmsRoledefinitionLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WmsRoledefinitionLogExample() {
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

        public Criteria andRoleLogidIsNull() {
            addCriterion("Role_LogID is null");
            return (Criteria) this;
        }

        public Criteria andRoleLogidIsNotNull() {
            addCriterion("Role_LogID is not null");
            return (Criteria) this;
        }

        public Criteria andRoleLogidEqualTo(Integer value) {
            addCriterion("Role_LogID =", value, "roleLogid");
            return (Criteria) this;
        }

        public Criteria andRoleLogidNotEqualTo(Integer value) {
            addCriterion("Role_LogID <>", value, "roleLogid");
            return (Criteria) this;
        }

        public Criteria andRoleLogidGreaterThan(Integer value) {
            addCriterion("Role_LogID >", value, "roleLogid");
            return (Criteria) this;
        }

        public Criteria andRoleLogidGreaterThanOrEqualTo(Integer value) {
            addCriterion("Role_LogID >=", value, "roleLogid");
            return (Criteria) this;
        }

        public Criteria andRoleLogidLessThan(Integer value) {
            addCriterion("Role_LogID <", value, "roleLogid");
            return (Criteria) this;
        }

        public Criteria andRoleLogidLessThanOrEqualTo(Integer value) {
            addCriterion("Role_LogID <=", value, "roleLogid");
            return (Criteria) this;
        }

        public Criteria andRoleLogidIn(List<Integer> values) {
            addCriterion("Role_LogID in", values, "roleLogid");
            return (Criteria) this;
        }

        public Criteria andRoleLogidNotIn(List<Integer> values) {
            addCriterion("Role_LogID not in", values, "roleLogid");
            return (Criteria) this;
        }

        public Criteria andRoleLogidBetween(Integer value1, Integer value2) {
            addCriterion("Role_LogID between", value1, value2, "roleLogid");
            return (Criteria) this;
        }

        public Criteria andRoleLogidNotBetween(Integer value1, Integer value2) {
            addCriterion("Role_LogID not between", value1, value2, "roleLogid");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNull() {
            addCriterion("Role_ID is null");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNotNull() {
            addCriterion("Role_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRoleIdEqualTo(Integer value) {
            addCriterion("Role_ID =", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotEqualTo(Integer value) {
            addCriterion("Role_ID <>", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThan(Integer value) {
            addCriterion("Role_ID >", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Role_ID >=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThan(Integer value) {
            addCriterion("Role_ID <", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThanOrEqualTo(Integer value) {
            addCriterion("Role_ID <=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdIn(List<Integer> values) {
            addCriterion("Role_ID in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotIn(List<Integer> values) {
            addCriterion("Role_ID not in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdBetween(Integer value1, Integer value2) {
            addCriterion("Role_ID between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Role_ID not between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andRolePremodifiedstateIsNull() {
            addCriterion("Role_PreModifiedState is null");
            return (Criteria) this;
        }

        public Criteria andRolePremodifiedstateIsNotNull() {
            addCriterion("Role_PreModifiedState is not null");
            return (Criteria) this;
        }

        public Criteria andRolePremodifiedstateEqualTo(String value) {
            addCriterion("Role_PreModifiedState =", value, "rolePremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andRolePremodifiedstateNotEqualTo(String value) {
            addCriterion("Role_PreModifiedState <>", value, "rolePremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andRolePremodifiedstateGreaterThan(String value) {
            addCriterion("Role_PreModifiedState >", value, "rolePremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andRolePremodifiedstateGreaterThanOrEqualTo(String value) {
            addCriterion("Role_PreModifiedState >=", value, "rolePremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andRolePremodifiedstateLessThan(String value) {
            addCriterion("Role_PreModifiedState <", value, "rolePremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andRolePremodifiedstateLessThanOrEqualTo(String value) {
            addCriterion("Role_PreModifiedState <=", value, "rolePremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andRolePremodifiedstateLike(String value) {
            addCriterion("Role_PreModifiedState like", value, "rolePremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andRolePremodifiedstateNotLike(String value) {
            addCriterion("Role_PreModifiedState not like", value, "rolePremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andRolePremodifiedstateIn(List<String> values) {
            addCriterion("Role_PreModifiedState in", values, "rolePremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andRolePremodifiedstateNotIn(List<String> values) {
            addCriterion("Role_PreModifiedState not in", values, "rolePremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andRolePremodifiedstateBetween(String value1, String value2) {
            addCriterion("Role_PreModifiedState between", value1, value2, "rolePremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andRolePremodifiedstateNotBetween(String value1, String value2) {
            addCriterion("Role_PreModifiedState not between", value1, value2, "rolePremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andRoleModifiedstateIsNull() {
            addCriterion("Role_ModifiedState is null");
            return (Criteria) this;
        }

        public Criteria andRoleModifiedstateIsNotNull() {
            addCriterion("Role_ModifiedState is not null");
            return (Criteria) this;
        }

        public Criteria andRoleModifiedstateEqualTo(String value) {
            addCriterion("Role_ModifiedState =", value, "roleModifiedstate");
            return (Criteria) this;
        }

        public Criteria andRoleModifiedstateNotEqualTo(String value) {
            addCriterion("Role_ModifiedState <>", value, "roleModifiedstate");
            return (Criteria) this;
        }

        public Criteria andRoleModifiedstateGreaterThan(String value) {
            addCriterion("Role_ModifiedState >", value, "roleModifiedstate");
            return (Criteria) this;
        }

        public Criteria andRoleModifiedstateGreaterThanOrEqualTo(String value) {
            addCriterion("Role_ModifiedState >=", value, "roleModifiedstate");
            return (Criteria) this;
        }

        public Criteria andRoleModifiedstateLessThan(String value) {
            addCriterion("Role_ModifiedState <", value, "roleModifiedstate");
            return (Criteria) this;
        }

        public Criteria andRoleModifiedstateLessThanOrEqualTo(String value) {
            addCriterion("Role_ModifiedState <=", value, "roleModifiedstate");
            return (Criteria) this;
        }

        public Criteria andRoleModifiedstateLike(String value) {
            addCriterion("Role_ModifiedState like", value, "roleModifiedstate");
            return (Criteria) this;
        }

        public Criteria andRoleModifiedstateNotLike(String value) {
            addCriterion("Role_ModifiedState not like", value, "roleModifiedstate");
            return (Criteria) this;
        }

        public Criteria andRoleModifiedstateIn(List<String> values) {
            addCriterion("Role_ModifiedState in", values, "roleModifiedstate");
            return (Criteria) this;
        }

        public Criteria andRoleModifiedstateNotIn(List<String> values) {
            addCriterion("Role_ModifiedState not in", values, "roleModifiedstate");
            return (Criteria) this;
        }

        public Criteria andRoleModifiedstateBetween(String value1, String value2) {
            addCriterion("Role_ModifiedState between", value1, value2, "roleModifiedstate");
            return (Criteria) this;
        }

        public Criteria andRoleModifiedstateNotBetween(String value1, String value2) {
            addCriterion("Role_ModifiedState not between", value1, value2, "roleModifiedstate");
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
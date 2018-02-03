package cn.hhu.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WmsRoledefinitionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WmsRoledefinitionExample() {
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

        public Criteria andRoledefinitionNumberIsNull() {
            addCriterion("RoleDefinition_Number is null");
            return (Criteria) this;
        }

        public Criteria andRoledefinitionNumberIsNotNull() {
            addCriterion("RoleDefinition_Number is not null");
            return (Criteria) this;
        }

        public Criteria andRoledefinitionNumberEqualTo(String value) {
            addCriterion("RoleDefinition_Number =", value, "roledefinitionNumber");
            return (Criteria) this;
        }

        public Criteria andRoledefinitionNumberNotEqualTo(String value) {
            addCriterion("RoleDefinition_Number <>", value, "roledefinitionNumber");
            return (Criteria) this;
        }

        public Criteria andRoledefinitionNumberGreaterThan(String value) {
            addCriterion("RoleDefinition_Number >", value, "roledefinitionNumber");
            return (Criteria) this;
        }

        public Criteria andRoledefinitionNumberGreaterThanOrEqualTo(String value) {
            addCriterion("RoleDefinition_Number >=", value, "roledefinitionNumber");
            return (Criteria) this;
        }

        public Criteria andRoledefinitionNumberLessThan(String value) {
            addCriterion("RoleDefinition_Number <", value, "roledefinitionNumber");
            return (Criteria) this;
        }

        public Criteria andRoledefinitionNumberLessThanOrEqualTo(String value) {
            addCriterion("RoleDefinition_Number <=", value, "roledefinitionNumber");
            return (Criteria) this;
        }

        public Criteria andRoledefinitionNumberLike(String value) {
            addCriterion("RoleDefinition_Number like", value, "roledefinitionNumber");
            return (Criteria) this;
        }

        public Criteria andRoledefinitionNumberNotLike(String value) {
            addCriterion("RoleDefinition_Number not like", value, "roledefinitionNumber");
            return (Criteria) this;
        }

        public Criteria andRoledefinitionNumberIn(List<String> values) {
            addCriterion("RoleDefinition_Number in", values, "roledefinitionNumber");
            return (Criteria) this;
        }

        public Criteria andRoledefinitionNumberNotIn(List<String> values) {
            addCriterion("RoleDefinition_Number not in", values, "roledefinitionNumber");
            return (Criteria) this;
        }

        public Criteria andRoledefinitionNumberBetween(String value1, String value2) {
            addCriterion("RoleDefinition_Number between", value1, value2, "roledefinitionNumber");
            return (Criteria) this;
        }

        public Criteria andRoledefinitionNumberNotBetween(String value1, String value2) {
            addCriterion("RoleDefinition_Number not between", value1, value2, "roledefinitionNumber");
            return (Criteria) this;
        }

        public Criteria andRolenameIsNull() {
            addCriterion("RoleName is null");
            return (Criteria) this;
        }

        public Criteria andRolenameIsNotNull() {
            addCriterion("RoleName is not null");
            return (Criteria) this;
        }

        public Criteria andRolenameEqualTo(String value) {
            addCriterion("RoleName =", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameNotEqualTo(String value) {
            addCriterion("RoleName <>", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameGreaterThan(String value) {
            addCriterion("RoleName >", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameGreaterThanOrEqualTo(String value) {
            addCriterion("RoleName >=", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameLessThan(String value) {
            addCriterion("RoleName <", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameLessThanOrEqualTo(String value) {
            addCriterion("RoleName <=", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameLike(String value) {
            addCriterion("RoleName like", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameNotLike(String value) {
            addCriterion("RoleName not like", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameIn(List<String> values) {
            addCriterion("RoleName in", values, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameNotIn(List<String> values) {
            addCriterion("RoleName not in", values, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameBetween(String value1, String value2) {
            addCriterion("RoleName between", value1, value2, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameNotBetween(String value1, String value2) {
            addCriterion("RoleName not between", value1, value2, "rolename");
            return (Criteria) this;
        }

        public Criteria andRoledescriptionIsNull() {
            addCriterion("RoleDescription is null");
            return (Criteria) this;
        }

        public Criteria andRoledescriptionIsNotNull() {
            addCriterion("RoleDescription is not null");
            return (Criteria) this;
        }

        public Criteria andRoledescriptionEqualTo(String value) {
            addCriterion("RoleDescription =", value, "roledescription");
            return (Criteria) this;
        }

        public Criteria andRoledescriptionNotEqualTo(String value) {
            addCriterion("RoleDescription <>", value, "roledescription");
            return (Criteria) this;
        }

        public Criteria andRoledescriptionGreaterThan(String value) {
            addCriterion("RoleDescription >", value, "roledescription");
            return (Criteria) this;
        }

        public Criteria andRoledescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("RoleDescription >=", value, "roledescription");
            return (Criteria) this;
        }

        public Criteria andRoledescriptionLessThan(String value) {
            addCriterion("RoleDescription <", value, "roledescription");
            return (Criteria) this;
        }

        public Criteria andRoledescriptionLessThanOrEqualTo(String value) {
            addCriterion("RoleDescription <=", value, "roledescription");
            return (Criteria) this;
        }

        public Criteria andRoledescriptionLike(String value) {
            addCriterion("RoleDescription like", value, "roledescription");
            return (Criteria) this;
        }

        public Criteria andRoledescriptionNotLike(String value) {
            addCriterion("RoleDescription not like", value, "roledescription");
            return (Criteria) this;
        }

        public Criteria andRoledescriptionIn(List<String> values) {
            addCriterion("RoleDescription in", values, "roledescription");
            return (Criteria) this;
        }

        public Criteria andRoledescriptionNotIn(List<String> values) {
            addCriterion("RoleDescription not in", values, "roledescription");
            return (Criteria) this;
        }

        public Criteria andRoledescriptionBetween(String value1, String value2) {
            addCriterion("RoleDescription between", value1, value2, "roledescription");
            return (Criteria) this;
        }

        public Criteria andRoledescriptionNotBetween(String value1, String value2) {
            addCriterion("RoleDescription not between", value1, value2, "roledescription");
            return (Criteria) this;
        }

        public Criteria andMakeorderdateIsNull() {
            addCriterion("MakeOrderDate is null");
            return (Criteria) this;
        }

        public Criteria andMakeorderdateIsNotNull() {
            addCriterion("MakeOrderDate is not null");
            return (Criteria) this;
        }

        public Criteria andMakeorderdateEqualTo(Date value) {
            addCriterion("MakeOrderDate =", value, "makeorderdate");
            return (Criteria) this;
        }

        public Criteria andMakeorderdateNotEqualTo(Date value) {
            addCriterion("MakeOrderDate <>", value, "makeorderdate");
            return (Criteria) this;
        }

        public Criteria andMakeorderdateGreaterThan(Date value) {
            addCriterion("MakeOrderDate >", value, "makeorderdate");
            return (Criteria) this;
        }

        public Criteria andMakeorderdateGreaterThanOrEqualTo(Date value) {
            addCriterion("MakeOrderDate >=", value, "makeorderdate");
            return (Criteria) this;
        }

        public Criteria andMakeorderdateLessThan(Date value) {
            addCriterion("MakeOrderDate <", value, "makeorderdate");
            return (Criteria) this;
        }

        public Criteria andMakeorderdateLessThanOrEqualTo(Date value) {
            addCriterion("MakeOrderDate <=", value, "makeorderdate");
            return (Criteria) this;
        }

        public Criteria andMakeorderdateIn(List<Date> values) {
            addCriterion("MakeOrderDate in", values, "makeorderdate");
            return (Criteria) this;
        }

        public Criteria andMakeorderdateNotIn(List<Date> values) {
            addCriterion("MakeOrderDate not in", values, "makeorderdate");
            return (Criteria) this;
        }

        public Criteria andMakeorderdateBetween(Date value1, Date value2) {
            addCriterion("MakeOrderDate between", value1, value2, "makeorderdate");
            return (Criteria) this;
        }

        public Criteria andMakeorderdateNotBetween(Date value1, Date value2) {
            addCriterion("MakeOrderDate not between", value1, value2, "makeorderdate");
            return (Criteria) this;
        }

        public Criteria andMakeordermanIsNull() {
            addCriterion("MakeOrderMan is null");
            return (Criteria) this;
        }

        public Criteria andMakeordermanIsNotNull() {
            addCriterion("MakeOrderMan is not null");
            return (Criteria) this;
        }

        public Criteria andMakeordermanEqualTo(Integer value) {
            addCriterion("MakeOrderMan =", value, "makeorderman");
            return (Criteria) this;
        }

        public Criteria andMakeordermanNotEqualTo(Integer value) {
            addCriterion("MakeOrderMan <>", value, "makeorderman");
            return (Criteria) this;
        }

        public Criteria andMakeordermanGreaterThan(Integer value) {
            addCriterion("MakeOrderMan >", value, "makeorderman");
            return (Criteria) this;
        }

        public Criteria andMakeordermanGreaterThanOrEqualTo(Integer value) {
            addCriterion("MakeOrderMan >=", value, "makeorderman");
            return (Criteria) this;
        }

        public Criteria andMakeordermanLessThan(Integer value) {
            addCriterion("MakeOrderMan <", value, "makeorderman");
            return (Criteria) this;
        }

        public Criteria andMakeordermanLessThanOrEqualTo(Integer value) {
            addCriterion("MakeOrderMan <=", value, "makeorderman");
            return (Criteria) this;
        }

        public Criteria andMakeordermanIn(List<Integer> values) {
            addCriterion("MakeOrderMan in", values, "makeorderman");
            return (Criteria) this;
        }

        public Criteria andMakeordermanNotIn(List<Integer> values) {
            addCriterion("MakeOrderMan not in", values, "makeorderman");
            return (Criteria) this;
        }

        public Criteria andMakeordermanBetween(Integer value1, Integer value2) {
            addCriterion("MakeOrderMan between", value1, value2, "makeorderman");
            return (Criteria) this;
        }

        public Criteria andMakeordermanNotBetween(Integer value1, Integer value2) {
            addCriterion("MakeOrderMan not between", value1, value2, "makeorderman");
            return (Criteria) this;
        }

        public Criteria andIsclosedIsNull() {
            addCriterion("IsClosed is null");
            return (Criteria) this;
        }

        public Criteria andIsclosedIsNotNull() {
            addCriterion("IsClosed is not null");
            return (Criteria) this;
        }

        public Criteria andIsclosedEqualTo(Integer value) {
            addCriterion("IsClosed =", value, "isclosed");
            return (Criteria) this;
        }

        public Criteria andIsclosedNotEqualTo(Integer value) {
            addCriterion("IsClosed <>", value, "isclosed");
            return (Criteria) this;
        }

        public Criteria andIsclosedGreaterThan(Integer value) {
            addCriterion("IsClosed >", value, "isclosed");
            return (Criteria) this;
        }

        public Criteria andIsclosedGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsClosed >=", value, "isclosed");
            return (Criteria) this;
        }

        public Criteria andIsclosedLessThan(Integer value) {
            addCriterion("IsClosed <", value, "isclosed");
            return (Criteria) this;
        }

        public Criteria andIsclosedLessThanOrEqualTo(Integer value) {
            addCriterion("IsClosed <=", value, "isclosed");
            return (Criteria) this;
        }

        public Criteria andIsclosedIn(List<Integer> values) {
            addCriterion("IsClosed in", values, "isclosed");
            return (Criteria) this;
        }

        public Criteria andIsclosedNotIn(List<Integer> values) {
            addCriterion("IsClosed not in", values, "isclosed");
            return (Criteria) this;
        }

        public Criteria andIsclosedBetween(Integer value1, Integer value2) {
            addCriterion("IsClosed between", value1, value2, "isclosed");
            return (Criteria) this;
        }

        public Criteria andIsclosedNotBetween(Integer value1, Integer value2) {
            addCriterion("IsClosed not between", value1, value2, "isclosed");
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
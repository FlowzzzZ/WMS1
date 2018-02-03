package cn.hhu.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WmsFunclistExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WmsFunclistExample() {
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

        public Criteria andFuncIdIsNull() {
            addCriterion("Func_ID is null");
            return (Criteria) this;
        }

        public Criteria andFuncIdIsNotNull() {
            addCriterion("Func_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFuncIdEqualTo(Integer value) {
            addCriterion("Func_ID =", value, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdNotEqualTo(Integer value) {
            addCriterion("Func_ID <>", value, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdGreaterThan(Integer value) {
            addCriterion("Func_ID >", value, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Func_ID >=", value, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdLessThan(Integer value) {
            addCriterion("Func_ID <", value, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdLessThanOrEqualTo(Integer value) {
            addCriterion("Func_ID <=", value, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdIn(List<Integer> values) {
            addCriterion("Func_ID in", values, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdNotIn(List<Integer> values) {
            addCriterion("Func_ID not in", values, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdBetween(Integer value1, Integer value2) {
            addCriterion("Func_ID between", value1, value2, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Func_ID not between", value1, value2, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncNameIsNull() {
            addCriterion("Func_Name is null");
            return (Criteria) this;
        }

        public Criteria andFuncNameIsNotNull() {
            addCriterion("Func_Name is not null");
            return (Criteria) this;
        }

        public Criteria andFuncNameEqualTo(String value) {
            addCriterion("Func_Name =", value, "funcName");
            return (Criteria) this;
        }

        public Criteria andFuncNameNotEqualTo(String value) {
            addCriterion("Func_Name <>", value, "funcName");
            return (Criteria) this;
        }

        public Criteria andFuncNameGreaterThan(String value) {
            addCriterion("Func_Name >", value, "funcName");
            return (Criteria) this;
        }

        public Criteria andFuncNameGreaterThanOrEqualTo(String value) {
            addCriterion("Func_Name >=", value, "funcName");
            return (Criteria) this;
        }

        public Criteria andFuncNameLessThan(String value) {
            addCriterion("Func_Name <", value, "funcName");
            return (Criteria) this;
        }

        public Criteria andFuncNameLessThanOrEqualTo(String value) {
            addCriterion("Func_Name <=", value, "funcName");
            return (Criteria) this;
        }

        public Criteria andFuncNameLike(String value) {
            addCriterion("Func_Name like", value, "funcName");
            return (Criteria) this;
        }

        public Criteria andFuncNameNotLike(String value) {
            addCriterion("Func_Name not like", value, "funcName");
            return (Criteria) this;
        }

        public Criteria andFuncNameIn(List<String> values) {
            addCriterion("Func_Name in", values, "funcName");
            return (Criteria) this;
        }

        public Criteria andFuncNameNotIn(List<String> values) {
            addCriterion("Func_Name not in", values, "funcName");
            return (Criteria) this;
        }

        public Criteria andFuncNameBetween(String value1, String value2) {
            addCriterion("Func_Name between", value1, value2, "funcName");
            return (Criteria) this;
        }

        public Criteria andFuncNameNotBetween(String value1, String value2) {
            addCriterion("Func_Name not between", value1, value2, "funcName");
            return (Criteria) this;
        }

        public Criteria andFuncInterfaceIsNull() {
            addCriterion("Func_Interface is null");
            return (Criteria) this;
        }

        public Criteria andFuncInterfaceIsNotNull() {
            addCriterion("Func_Interface is not null");
            return (Criteria) this;
        }

        public Criteria andFuncInterfaceEqualTo(String value) {
            addCriterion("Func_Interface =", value, "funcInterface");
            return (Criteria) this;
        }

        public Criteria andFuncInterfaceNotEqualTo(String value) {
            addCriterion("Func_Interface <>", value, "funcInterface");
            return (Criteria) this;
        }

        public Criteria andFuncInterfaceGreaterThan(String value) {
            addCriterion("Func_Interface >", value, "funcInterface");
            return (Criteria) this;
        }

        public Criteria andFuncInterfaceGreaterThanOrEqualTo(String value) {
            addCriterion("Func_Interface >=", value, "funcInterface");
            return (Criteria) this;
        }

        public Criteria andFuncInterfaceLessThan(String value) {
            addCriterion("Func_Interface <", value, "funcInterface");
            return (Criteria) this;
        }

        public Criteria andFuncInterfaceLessThanOrEqualTo(String value) {
            addCriterion("Func_Interface <=", value, "funcInterface");
            return (Criteria) this;
        }

        public Criteria andFuncInterfaceLike(String value) {
            addCriterion("Func_Interface like", value, "funcInterface");
            return (Criteria) this;
        }

        public Criteria andFuncInterfaceNotLike(String value) {
            addCriterion("Func_Interface not like", value, "funcInterface");
            return (Criteria) this;
        }

        public Criteria andFuncInterfaceIn(List<String> values) {
            addCriterion("Func_Interface in", values, "funcInterface");
            return (Criteria) this;
        }

        public Criteria andFuncInterfaceNotIn(List<String> values) {
            addCriterion("Func_Interface not in", values, "funcInterface");
            return (Criteria) this;
        }

        public Criteria andFuncInterfaceBetween(String value1, String value2) {
            addCriterion("Func_Interface between", value1, value2, "funcInterface");
            return (Criteria) this;
        }

        public Criteria andFuncInterfaceNotBetween(String value1, String value2) {
            addCriterion("Func_Interface not between", value1, value2, "funcInterface");
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
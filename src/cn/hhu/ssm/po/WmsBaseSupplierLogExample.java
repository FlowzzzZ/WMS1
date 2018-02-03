package cn.hhu.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WmsBaseSupplierLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WmsBaseSupplierLogExample() {
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

        public Criteria andSupplierLogidIsNull() {
            addCriterion("Supplier_LogID is null");
            return (Criteria) this;
        }

        public Criteria andSupplierLogidIsNotNull() {
            addCriterion("Supplier_LogID is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierLogidEqualTo(Integer value) {
            addCriterion("Supplier_LogID =", value, "supplierLogid");
            return (Criteria) this;
        }

        public Criteria andSupplierLogidNotEqualTo(Integer value) {
            addCriterion("Supplier_LogID <>", value, "supplierLogid");
            return (Criteria) this;
        }

        public Criteria andSupplierLogidGreaterThan(Integer value) {
            addCriterion("Supplier_LogID >", value, "supplierLogid");
            return (Criteria) this;
        }

        public Criteria andSupplierLogidGreaterThanOrEqualTo(Integer value) {
            addCriterion("Supplier_LogID >=", value, "supplierLogid");
            return (Criteria) this;
        }

        public Criteria andSupplierLogidLessThan(Integer value) {
            addCriterion("Supplier_LogID <", value, "supplierLogid");
            return (Criteria) this;
        }

        public Criteria andSupplierLogidLessThanOrEqualTo(Integer value) {
            addCriterion("Supplier_LogID <=", value, "supplierLogid");
            return (Criteria) this;
        }

        public Criteria andSupplierLogidIn(List<Integer> values) {
            addCriterion("Supplier_LogID in", values, "supplierLogid");
            return (Criteria) this;
        }

        public Criteria andSupplierLogidNotIn(List<Integer> values) {
            addCriterion("Supplier_LogID not in", values, "supplierLogid");
            return (Criteria) this;
        }

        public Criteria andSupplierLogidBetween(Integer value1, Integer value2) {
            addCriterion("Supplier_LogID between", value1, value2, "supplierLogid");
            return (Criteria) this;
        }

        public Criteria andSupplierLogidNotBetween(Integer value1, Integer value2) {
            addCriterion("Supplier_LogID not between", value1, value2, "supplierLogid");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIsNull() {
            addCriterion("Supplier_ID is null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIsNotNull() {
            addCriterion("Supplier_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdEqualTo(Integer value) {
            addCriterion("Supplier_ID =", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotEqualTo(Integer value) {
            addCriterion("Supplier_ID <>", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThan(Integer value) {
            addCriterion("Supplier_ID >", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Supplier_ID >=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThan(Integer value) {
            addCriterion("Supplier_ID <", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThanOrEqualTo(Integer value) {
            addCriterion("Supplier_ID <=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIn(List<Integer> values) {
            addCriterion("Supplier_ID in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotIn(List<Integer> values) {
            addCriterion("Supplier_ID not in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdBetween(Integer value1, Integer value2) {
            addCriterion("Supplier_ID between", value1, value2, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Supplier_ID not between", value1, value2, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierPremodifiedstateIsNull() {
            addCriterion("Supplier_PreModifiedState is null");
            return (Criteria) this;
        }

        public Criteria andSupplierPremodifiedstateIsNotNull() {
            addCriterion("Supplier_PreModifiedState is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierPremodifiedstateEqualTo(String value) {
            addCriterion("Supplier_PreModifiedState =", value, "supplierPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andSupplierPremodifiedstateNotEqualTo(String value) {
            addCriterion("Supplier_PreModifiedState <>", value, "supplierPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andSupplierPremodifiedstateGreaterThan(String value) {
            addCriterion("Supplier_PreModifiedState >", value, "supplierPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andSupplierPremodifiedstateGreaterThanOrEqualTo(String value) {
            addCriterion("Supplier_PreModifiedState >=", value, "supplierPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andSupplierPremodifiedstateLessThan(String value) {
            addCriterion("Supplier_PreModifiedState <", value, "supplierPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andSupplierPremodifiedstateLessThanOrEqualTo(String value) {
            addCriterion("Supplier_PreModifiedState <=", value, "supplierPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andSupplierPremodifiedstateLike(String value) {
            addCriterion("Supplier_PreModifiedState like", value, "supplierPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andSupplierPremodifiedstateNotLike(String value) {
            addCriterion("Supplier_PreModifiedState not like", value, "supplierPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andSupplierPremodifiedstateIn(List<String> values) {
            addCriterion("Supplier_PreModifiedState in", values, "supplierPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andSupplierPremodifiedstateNotIn(List<String> values) {
            addCriterion("Supplier_PreModifiedState not in", values, "supplierPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andSupplierPremodifiedstateBetween(String value1, String value2) {
            addCriterion("Supplier_PreModifiedState between", value1, value2, "supplierPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andSupplierPremodifiedstateNotBetween(String value1, String value2) {
            addCriterion("Supplier_PreModifiedState not between", value1, value2, "supplierPremodifiedstate");
            return (Criteria) this;
        }

        public Criteria andSupplierModifiedstateIsNull() {
            addCriterion("Supplier_ModifiedState is null");
            return (Criteria) this;
        }

        public Criteria andSupplierModifiedstateIsNotNull() {
            addCriterion("Supplier_ModifiedState is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierModifiedstateEqualTo(String value) {
            addCriterion("Supplier_ModifiedState =", value, "supplierModifiedstate");
            return (Criteria) this;
        }

        public Criteria andSupplierModifiedstateNotEqualTo(String value) {
            addCriterion("Supplier_ModifiedState <>", value, "supplierModifiedstate");
            return (Criteria) this;
        }

        public Criteria andSupplierModifiedstateGreaterThan(String value) {
            addCriterion("Supplier_ModifiedState >", value, "supplierModifiedstate");
            return (Criteria) this;
        }

        public Criteria andSupplierModifiedstateGreaterThanOrEqualTo(String value) {
            addCriterion("Supplier_ModifiedState >=", value, "supplierModifiedstate");
            return (Criteria) this;
        }

        public Criteria andSupplierModifiedstateLessThan(String value) {
            addCriterion("Supplier_ModifiedState <", value, "supplierModifiedstate");
            return (Criteria) this;
        }

        public Criteria andSupplierModifiedstateLessThanOrEqualTo(String value) {
            addCriterion("Supplier_ModifiedState <=", value, "supplierModifiedstate");
            return (Criteria) this;
        }

        public Criteria andSupplierModifiedstateLike(String value) {
            addCriterion("Supplier_ModifiedState like", value, "supplierModifiedstate");
            return (Criteria) this;
        }

        public Criteria andSupplierModifiedstateNotLike(String value) {
            addCriterion("Supplier_ModifiedState not like", value, "supplierModifiedstate");
            return (Criteria) this;
        }

        public Criteria andSupplierModifiedstateIn(List<String> values) {
            addCriterion("Supplier_ModifiedState in", values, "supplierModifiedstate");
            return (Criteria) this;
        }

        public Criteria andSupplierModifiedstateNotIn(List<String> values) {
            addCriterion("Supplier_ModifiedState not in", values, "supplierModifiedstate");
            return (Criteria) this;
        }

        public Criteria andSupplierModifiedstateBetween(String value1, String value2) {
            addCriterion("Supplier_ModifiedState between", value1, value2, "supplierModifiedstate");
            return (Criteria) this;
        }

        public Criteria andSupplierModifiedstateNotBetween(String value1, String value2) {
            addCriterion("Supplier_ModifiedState not between", value1, value2, "supplierModifiedstate");
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
package cn.hhu.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WmsAreaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WmsAreaExample() {
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

        public Criteria andAreasIdIsNull() {
            addCriterion("Areas_ID is null");
            return (Criteria) this;
        }

        public Criteria andAreasIdIsNotNull() {
            addCriterion("Areas_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAreasIdEqualTo(Integer value) {
            addCriterion("Areas_ID =", value, "areasId");
            return (Criteria) this;
        }

        public Criteria andAreasIdNotEqualTo(Integer value) {
            addCriterion("Areas_ID <>", value, "areasId");
            return (Criteria) this;
        }

        public Criteria andAreasIdGreaterThan(Integer value) {
            addCriterion("Areas_ID >", value, "areasId");
            return (Criteria) this;
        }

        public Criteria andAreasIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Areas_ID >=", value, "areasId");
            return (Criteria) this;
        }

        public Criteria andAreasIdLessThan(Integer value) {
            addCriterion("Areas_ID <", value, "areasId");
            return (Criteria) this;
        }

        public Criteria andAreasIdLessThanOrEqualTo(Integer value) {
            addCriterion("Areas_ID <=", value, "areasId");
            return (Criteria) this;
        }

        public Criteria andAreasIdIn(List<Integer> values) {
            addCriterion("Areas_ID in", values, "areasId");
            return (Criteria) this;
        }

        public Criteria andAreasIdNotIn(List<Integer> values) {
            addCriterion("Areas_ID not in", values, "areasId");
            return (Criteria) this;
        }

        public Criteria andAreasIdBetween(Integer value1, Integer value2) {
            addCriterion("Areas_ID between", value1, value2, "areasId");
            return (Criteria) this;
        }

        public Criteria andAreasIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Areas_ID not between", value1, value2, "areasId");
            return (Criteria) this;
        }

        public Criteria andAreasNumberIsNull() {
            addCriterion("Areas_Number is null");
            return (Criteria) this;
        }

        public Criteria andAreasNumberIsNotNull() {
            addCriterion("Areas_Number is not null");
            return (Criteria) this;
        }

        public Criteria andAreasNumberEqualTo(String value) {
            addCriterion("Areas_Number =", value, "areasNumber");
            return (Criteria) this;
        }

        public Criteria andAreasNumberNotEqualTo(String value) {
            addCriterion("Areas_Number <>", value, "areasNumber");
            return (Criteria) this;
        }

        public Criteria andAreasNumberGreaterThan(String value) {
            addCriterion("Areas_Number >", value, "areasNumber");
            return (Criteria) this;
        }

        public Criteria andAreasNumberGreaterThanOrEqualTo(String value) {
            addCriterion("Areas_Number >=", value, "areasNumber");
            return (Criteria) this;
        }

        public Criteria andAreasNumberLessThan(String value) {
            addCriterion("Areas_Number <", value, "areasNumber");
            return (Criteria) this;
        }

        public Criteria andAreasNumberLessThanOrEqualTo(String value) {
            addCriterion("Areas_Number <=", value, "areasNumber");
            return (Criteria) this;
        }

        public Criteria andAreasNumberLike(String value) {
            addCriterion("Areas_Number like", value, "areasNumber");
            return (Criteria) this;
        }

        public Criteria andAreasNumberNotLike(String value) {
            addCriterion("Areas_Number not like", value, "areasNumber");
            return (Criteria) this;
        }

        public Criteria andAreasNumberIn(List<String> values) {
            addCriterion("Areas_Number in", values, "areasNumber");
            return (Criteria) this;
        }

        public Criteria andAreasNumberNotIn(List<String> values) {
            addCriterion("Areas_Number not in", values, "areasNumber");
            return (Criteria) this;
        }

        public Criteria andAreasNumberBetween(String value1, String value2) {
            addCriterion("Areas_Number between", value1, value2, "areasNumber");
            return (Criteria) this;
        }

        public Criteria andAreasNumberNotBetween(String value1, String value2) {
            addCriterion("Areas_Number not between", value1, value2, "areasNumber");
            return (Criteria) this;
        }

        public Criteria andParentstorehousesIdIsNull() {
            addCriterion("ParentStorehouses_ID is null");
            return (Criteria) this;
        }

        public Criteria andParentstorehousesIdIsNotNull() {
            addCriterion("ParentStorehouses_ID is not null");
            return (Criteria) this;
        }

        public Criteria andParentstorehousesIdEqualTo(Integer value) {
            addCriterion("ParentStorehouses_ID =", value, "parentstorehousesId");
            return (Criteria) this;
        }

        public Criteria andParentstorehousesIdNotEqualTo(Integer value) {
            addCriterion("ParentStorehouses_ID <>", value, "parentstorehousesId");
            return (Criteria) this;
        }

        public Criteria andParentstorehousesIdGreaterThan(Integer value) {
            addCriterion("ParentStorehouses_ID >", value, "parentstorehousesId");
            return (Criteria) this;
        }

        public Criteria andParentstorehousesIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ParentStorehouses_ID >=", value, "parentstorehousesId");
            return (Criteria) this;
        }

        public Criteria andParentstorehousesIdLessThan(Integer value) {
            addCriterion("ParentStorehouses_ID <", value, "parentstorehousesId");
            return (Criteria) this;
        }

        public Criteria andParentstorehousesIdLessThanOrEqualTo(Integer value) {
            addCriterion("ParentStorehouses_ID <=", value, "parentstorehousesId");
            return (Criteria) this;
        }

        public Criteria andParentstorehousesIdIn(List<Integer> values) {
            addCriterion("ParentStorehouses_ID in", values, "parentstorehousesId");
            return (Criteria) this;
        }

        public Criteria andParentstorehousesIdNotIn(List<Integer> values) {
            addCriterion("ParentStorehouses_ID not in", values, "parentstorehousesId");
            return (Criteria) this;
        }

        public Criteria andParentstorehousesIdBetween(Integer value1, Integer value2) {
            addCriterion("ParentStorehouses_ID between", value1, value2, "parentstorehousesId");
            return (Criteria) this;
        }

        public Criteria andParentstorehousesIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ParentStorehouses_ID not between", value1, value2, "parentstorehousesId");
            return (Criteria) this;
        }

        public Criteria andStorehousenameIsNull() {
            addCriterion("StorehouseName is null");
            return (Criteria) this;
        }

        public Criteria andStorehousenameIsNotNull() {
            addCriterion("StorehouseName is not null");
            return (Criteria) this;
        }

        public Criteria andStorehousenameEqualTo(String value) {
            addCriterion("StorehouseName =", value, "storehousename");
            return (Criteria) this;
        }

        public Criteria andStorehousenameNotEqualTo(String value) {
            addCriterion("StorehouseName <>", value, "storehousename");
            return (Criteria) this;
        }

        public Criteria andStorehousenameGreaterThan(String value) {
            addCriterion("StorehouseName >", value, "storehousename");
            return (Criteria) this;
        }

        public Criteria andStorehousenameGreaterThanOrEqualTo(String value) {
            addCriterion("StorehouseName >=", value, "storehousename");
            return (Criteria) this;
        }

        public Criteria andStorehousenameLessThan(String value) {
            addCriterion("StorehouseName <", value, "storehousename");
            return (Criteria) this;
        }

        public Criteria andStorehousenameLessThanOrEqualTo(String value) {
            addCriterion("StorehouseName <=", value, "storehousename");
            return (Criteria) this;
        }

        public Criteria andStorehousenameLike(String value) {
            addCriterion("StorehouseName like", value, "storehousename");
            return (Criteria) this;
        }

        public Criteria andStorehousenameNotLike(String value) {
            addCriterion("StorehouseName not like", value, "storehousename");
            return (Criteria) this;
        }

        public Criteria andStorehousenameIn(List<String> values) {
            addCriterion("StorehouseName in", values, "storehousename");
            return (Criteria) this;
        }

        public Criteria andStorehousenameNotIn(List<String> values) {
            addCriterion("StorehouseName not in", values, "storehousename");
            return (Criteria) this;
        }

        public Criteria andStorehousenameBetween(String value1, String value2) {
            addCriterion("StorehouseName between", value1, value2, "storehousename");
            return (Criteria) this;
        }

        public Criteria andStorehousenameNotBetween(String value1, String value2) {
            addCriterion("StorehouseName not between", value1, value2, "storehousename");
            return (Criteria) this;
        }

        public Criteria andAreanameIsNull() {
            addCriterion("AreaName is null");
            return (Criteria) this;
        }

        public Criteria andAreanameIsNotNull() {
            addCriterion("AreaName is not null");
            return (Criteria) this;
        }

        public Criteria andAreanameEqualTo(String value) {
            addCriterion("AreaName =", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameNotEqualTo(String value) {
            addCriterion("AreaName <>", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameGreaterThan(String value) {
            addCriterion("AreaName >", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameGreaterThanOrEqualTo(String value) {
            addCriterion("AreaName >=", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameLessThan(String value) {
            addCriterion("AreaName <", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameLessThanOrEqualTo(String value) {
            addCriterion("AreaName <=", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameLike(String value) {
            addCriterion("AreaName like", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameNotLike(String value) {
            addCriterion("AreaName not like", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameIn(List<String> values) {
            addCriterion("AreaName in", values, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameNotIn(List<String> values) {
            addCriterion("AreaName not in", values, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameBetween(String value1, String value2) {
            addCriterion("AreaName between", value1, value2, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameNotBetween(String value1, String value2) {
            addCriterion("AreaName not between", value1, value2, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreacodeIsNull() {
            addCriterion("AreaCode is null");
            return (Criteria) this;
        }

        public Criteria andAreacodeIsNotNull() {
            addCriterion("AreaCode is not null");
            return (Criteria) this;
        }

        public Criteria andAreacodeEqualTo(String value) {
            addCriterion("AreaCode =", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeNotEqualTo(String value) {
            addCriterion("AreaCode <>", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeGreaterThan(String value) {
            addCriterion("AreaCode >", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeGreaterThanOrEqualTo(String value) {
            addCriterion("AreaCode >=", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeLessThan(String value) {
            addCriterion("AreaCode <", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeLessThanOrEqualTo(String value) {
            addCriterion("AreaCode <=", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeLike(String value) {
            addCriterion("AreaCode like", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeNotLike(String value) {
            addCriterion("AreaCode not like", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeIn(List<String> values) {
            addCriterion("AreaCode in", values, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeNotIn(List<String> values) {
            addCriterion("AreaCode not in", values, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeBetween(String value1, String value2) {
            addCriterion("AreaCode between", value1, value2, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeNotBetween(String value1, String value2) {
            addCriterion("AreaCode not between", value1, value2, "areacode");
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

        public Criteria andAreastypeIsNull() {
            addCriterion("AreasType is null");
            return (Criteria) this;
        }

        public Criteria andAreastypeIsNotNull() {
            addCriterion("AreasType is not null");
            return (Criteria) this;
        }

        public Criteria andAreastypeEqualTo(Integer value) {
            addCriterion("AreasType =", value, "areastype");
            return (Criteria) this;
        }

        public Criteria andAreastypeNotEqualTo(Integer value) {
            addCriterion("AreasType <>", value, "areastype");
            return (Criteria) this;
        }

        public Criteria andAreastypeGreaterThan(Integer value) {
            addCriterion("AreasType >", value, "areastype");
            return (Criteria) this;
        }

        public Criteria andAreastypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("AreasType >=", value, "areastype");
            return (Criteria) this;
        }

        public Criteria andAreastypeLessThan(Integer value) {
            addCriterion("AreasType <", value, "areastype");
            return (Criteria) this;
        }

        public Criteria andAreastypeLessThanOrEqualTo(Integer value) {
            addCriterion("AreasType <=", value, "areastype");
            return (Criteria) this;
        }

        public Criteria andAreastypeIn(List<Integer> values) {
            addCriterion("AreasType in", values, "areastype");
            return (Criteria) this;
        }

        public Criteria andAreastypeNotIn(List<Integer> values) {
            addCriterion("AreasType not in", values, "areastype");
            return (Criteria) this;
        }

        public Criteria andAreastypeBetween(Integer value1, Integer value2) {
            addCriterion("AreasType between", value1, value2, "areastype");
            return (Criteria) this;
        }

        public Criteria andAreastypeNotBetween(Integer value1, Integer value2) {
            addCriterion("AreasType not between", value1, value2, "areastype");
            return (Criteria) this;
        }

        public Criteria andFunctiontypeIsNull() {
            addCriterion("FunctionType is null");
            return (Criteria) this;
        }

        public Criteria andFunctiontypeIsNotNull() {
            addCriterion("FunctionType is not null");
            return (Criteria) this;
        }

        public Criteria andFunctiontypeEqualTo(Integer value) {
            addCriterion("FunctionType =", value, "functiontype");
            return (Criteria) this;
        }

        public Criteria andFunctiontypeNotEqualTo(Integer value) {
            addCriterion("FunctionType <>", value, "functiontype");
            return (Criteria) this;
        }

        public Criteria andFunctiontypeGreaterThan(Integer value) {
            addCriterion("FunctionType >", value, "functiontype");
            return (Criteria) this;
        }

        public Criteria andFunctiontypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("FunctionType >=", value, "functiontype");
            return (Criteria) this;
        }

        public Criteria andFunctiontypeLessThan(Integer value) {
            addCriterion("FunctionType <", value, "functiontype");
            return (Criteria) this;
        }

        public Criteria andFunctiontypeLessThanOrEqualTo(Integer value) {
            addCriterion("FunctionType <=", value, "functiontype");
            return (Criteria) this;
        }

        public Criteria andFunctiontypeIn(List<Integer> values) {
            addCriterion("FunctionType in", values, "functiontype");
            return (Criteria) this;
        }

        public Criteria andFunctiontypeNotIn(List<Integer> values) {
            addCriterion("FunctionType not in", values, "functiontype");
            return (Criteria) this;
        }

        public Criteria andFunctiontypeBetween(Integer value1, Integer value2) {
            addCriterion("FunctionType between", value1, value2, "functiontype");
            return (Criteria) this;
        }

        public Criteria andFunctiontypeNotBetween(Integer value1, Integer value2) {
            addCriterion("FunctionType not between", value1, value2, "functiontype");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("Remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("Remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("Remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("Remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("Remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("Remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("Remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("Remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("Remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("Remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("Remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("Remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("Remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("Remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andMaxtemperatureIsNull() {
            addCriterion("MaxTemperature is null");
            return (Criteria) this;
        }

        public Criteria andMaxtemperatureIsNotNull() {
            addCriterion("MaxTemperature is not null");
            return (Criteria) this;
        }

        public Criteria andMaxtemperatureEqualTo(Float value) {
            addCriterion("MaxTemperature =", value, "maxtemperature");
            return (Criteria) this;
        }

        public Criteria andMaxtemperatureNotEqualTo(Float value) {
            addCriterion("MaxTemperature <>", value, "maxtemperature");
            return (Criteria) this;
        }

        public Criteria andMaxtemperatureGreaterThan(Float value) {
            addCriterion("MaxTemperature >", value, "maxtemperature");
            return (Criteria) this;
        }

        public Criteria andMaxtemperatureGreaterThanOrEqualTo(Float value) {
            addCriterion("MaxTemperature >=", value, "maxtemperature");
            return (Criteria) this;
        }

        public Criteria andMaxtemperatureLessThan(Float value) {
            addCriterion("MaxTemperature <", value, "maxtemperature");
            return (Criteria) this;
        }

        public Criteria andMaxtemperatureLessThanOrEqualTo(Float value) {
            addCriterion("MaxTemperature <=", value, "maxtemperature");
            return (Criteria) this;
        }

        public Criteria andMaxtemperatureIn(List<Float> values) {
            addCriterion("MaxTemperature in", values, "maxtemperature");
            return (Criteria) this;
        }

        public Criteria andMaxtemperatureNotIn(List<Float> values) {
            addCriterion("MaxTemperature not in", values, "maxtemperature");
            return (Criteria) this;
        }

        public Criteria andMaxtemperatureBetween(Float value1, Float value2) {
            addCriterion("MaxTemperature between", value1, value2, "maxtemperature");
            return (Criteria) this;
        }

        public Criteria andMaxtemperatureNotBetween(Float value1, Float value2) {
            addCriterion("MaxTemperature not between", value1, value2, "maxtemperature");
            return (Criteria) this;
        }

        public Criteria andMintemperatureIsNull() {
            addCriterion("MinTemperature is null");
            return (Criteria) this;
        }

        public Criteria andMintemperatureIsNotNull() {
            addCriterion("MinTemperature is not null");
            return (Criteria) this;
        }

        public Criteria andMintemperatureEqualTo(Float value) {
            addCriterion("MinTemperature =", value, "mintemperature");
            return (Criteria) this;
        }

        public Criteria andMintemperatureNotEqualTo(Float value) {
            addCriterion("MinTemperature <>", value, "mintemperature");
            return (Criteria) this;
        }

        public Criteria andMintemperatureGreaterThan(Float value) {
            addCriterion("MinTemperature >", value, "mintemperature");
            return (Criteria) this;
        }

        public Criteria andMintemperatureGreaterThanOrEqualTo(Float value) {
            addCriterion("MinTemperature >=", value, "mintemperature");
            return (Criteria) this;
        }

        public Criteria andMintemperatureLessThan(Float value) {
            addCriterion("MinTemperature <", value, "mintemperature");
            return (Criteria) this;
        }

        public Criteria andMintemperatureLessThanOrEqualTo(Float value) {
            addCriterion("MinTemperature <=", value, "mintemperature");
            return (Criteria) this;
        }

        public Criteria andMintemperatureIn(List<Float> values) {
            addCriterion("MinTemperature in", values, "mintemperature");
            return (Criteria) this;
        }

        public Criteria andMintemperatureNotIn(List<Float> values) {
            addCriterion("MinTemperature not in", values, "mintemperature");
            return (Criteria) this;
        }

        public Criteria andMintemperatureBetween(Float value1, Float value2) {
            addCriterion("MinTemperature between", value1, value2, "mintemperature");
            return (Criteria) this;
        }

        public Criteria andMintemperatureNotBetween(Float value1, Float value2) {
            addCriterion("MinTemperature not between", value1, value2, "mintemperature");
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
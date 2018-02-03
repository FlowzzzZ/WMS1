package cn.hhu.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WmsBaseConservationrecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WmsBaseConservationrecordExample() {
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

        public Criteria andConservationrecordIdIsNull() {
            addCriterion("ConservationRecord_ID is null");
            return (Criteria) this;
        }

        public Criteria andConservationrecordIdIsNotNull() {
            addCriterion("ConservationRecord_ID is not null");
            return (Criteria) this;
        }

        public Criteria andConservationrecordIdEqualTo(Integer value) {
            addCriterion("ConservationRecord_ID =", value, "conservationrecordId");
            return (Criteria) this;
        }

        public Criteria andConservationrecordIdNotEqualTo(Integer value) {
            addCriterion("ConservationRecord_ID <>", value, "conservationrecordId");
            return (Criteria) this;
        }

        public Criteria andConservationrecordIdGreaterThan(Integer value) {
            addCriterion("ConservationRecord_ID >", value, "conservationrecordId");
            return (Criteria) this;
        }

        public Criteria andConservationrecordIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ConservationRecord_ID >=", value, "conservationrecordId");
            return (Criteria) this;
        }

        public Criteria andConservationrecordIdLessThan(Integer value) {
            addCriterion("ConservationRecord_ID <", value, "conservationrecordId");
            return (Criteria) this;
        }

        public Criteria andConservationrecordIdLessThanOrEqualTo(Integer value) {
            addCriterion("ConservationRecord_ID <=", value, "conservationrecordId");
            return (Criteria) this;
        }

        public Criteria andConservationrecordIdIn(List<Integer> values) {
            addCriterion("ConservationRecord_ID in", values, "conservationrecordId");
            return (Criteria) this;
        }

        public Criteria andConservationrecordIdNotIn(List<Integer> values) {
            addCriterion("ConservationRecord_ID not in", values, "conservationrecordId");
            return (Criteria) this;
        }

        public Criteria andConservationrecordIdBetween(Integer value1, Integer value2) {
            addCriterion("ConservationRecord_ID between", value1, value2, "conservationrecordId");
            return (Criteria) this;
        }

        public Criteria andConservationrecordIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ConservationRecord_ID not between", value1, value2, "conservationrecordId");
            return (Criteria) this;
        }

        public Criteria andConservationrecordNumberIsNull() {
            addCriterion("ConservationRecord_Number is null");
            return (Criteria) this;
        }

        public Criteria andConservationrecordNumberIsNotNull() {
            addCriterion("ConservationRecord_Number is not null");
            return (Criteria) this;
        }

        public Criteria andConservationrecordNumberEqualTo(String value) {
            addCriterion("ConservationRecord_Number =", value, "conservationrecordNumber");
            return (Criteria) this;
        }

        public Criteria andConservationrecordNumberNotEqualTo(String value) {
            addCriterion("ConservationRecord_Number <>", value, "conservationrecordNumber");
            return (Criteria) this;
        }

        public Criteria andConservationrecordNumberGreaterThan(String value) {
            addCriterion("ConservationRecord_Number >", value, "conservationrecordNumber");
            return (Criteria) this;
        }

        public Criteria andConservationrecordNumberGreaterThanOrEqualTo(String value) {
            addCriterion("ConservationRecord_Number >=", value, "conservationrecordNumber");
            return (Criteria) this;
        }

        public Criteria andConservationrecordNumberLessThan(String value) {
            addCriterion("ConservationRecord_Number <", value, "conservationrecordNumber");
            return (Criteria) this;
        }

        public Criteria andConservationrecordNumberLessThanOrEqualTo(String value) {
            addCriterion("ConservationRecord_Number <=", value, "conservationrecordNumber");
            return (Criteria) this;
        }

        public Criteria andConservationrecordNumberLike(String value) {
            addCriterion("ConservationRecord_Number like", value, "conservationrecordNumber");
            return (Criteria) this;
        }

        public Criteria andConservationrecordNumberNotLike(String value) {
            addCriterion("ConservationRecord_Number not like", value, "conservationrecordNumber");
            return (Criteria) this;
        }

        public Criteria andConservationrecordNumberIn(List<String> values) {
            addCriterion("ConservationRecord_Number in", values, "conservationrecordNumber");
            return (Criteria) this;
        }

        public Criteria andConservationrecordNumberNotIn(List<String> values) {
            addCriterion("ConservationRecord_Number not in", values, "conservationrecordNumber");
            return (Criteria) this;
        }

        public Criteria andConservationrecordNumberBetween(String value1, String value2) {
            addCriterion("ConservationRecord_Number between", value1, value2, "conservationrecordNumber");
            return (Criteria) this;
        }

        public Criteria andConservationrecordNumberNotBetween(String value1, String value2) {
            addCriterion("ConservationRecord_Number not between", value1, value2, "conservationrecordNumber");
            return (Criteria) this;
        }

        public Criteria andConservationplanNumberIsNull() {
            addCriterion("ConservationPlan_Number is null");
            return (Criteria) this;
        }

        public Criteria andConservationplanNumberIsNotNull() {
            addCriterion("ConservationPlan_Number is not null");
            return (Criteria) this;
        }

        public Criteria andConservationplanNumberEqualTo(String value) {
            addCriterion("ConservationPlan_Number =", value, "conservationplanNumber");
            return (Criteria) this;
        }

        public Criteria andConservationplanNumberNotEqualTo(String value) {
            addCriterion("ConservationPlan_Number <>", value, "conservationplanNumber");
            return (Criteria) this;
        }

        public Criteria andConservationplanNumberGreaterThan(String value) {
            addCriterion("ConservationPlan_Number >", value, "conservationplanNumber");
            return (Criteria) this;
        }

        public Criteria andConservationplanNumberGreaterThanOrEqualTo(String value) {
            addCriterion("ConservationPlan_Number >=", value, "conservationplanNumber");
            return (Criteria) this;
        }

        public Criteria andConservationplanNumberLessThan(String value) {
            addCriterion("ConservationPlan_Number <", value, "conservationplanNumber");
            return (Criteria) this;
        }

        public Criteria andConservationplanNumberLessThanOrEqualTo(String value) {
            addCriterion("ConservationPlan_Number <=", value, "conservationplanNumber");
            return (Criteria) this;
        }

        public Criteria andConservationplanNumberLike(String value) {
            addCriterion("ConservationPlan_Number like", value, "conservationplanNumber");
            return (Criteria) this;
        }

        public Criteria andConservationplanNumberNotLike(String value) {
            addCriterion("ConservationPlan_Number not like", value, "conservationplanNumber");
            return (Criteria) this;
        }

        public Criteria andConservationplanNumberIn(List<String> values) {
            addCriterion("ConservationPlan_Number in", values, "conservationplanNumber");
            return (Criteria) this;
        }

        public Criteria andConservationplanNumberNotIn(List<String> values) {
            addCriterion("ConservationPlan_Number not in", values, "conservationplanNumber");
            return (Criteria) this;
        }

        public Criteria andConservationplanNumberBetween(String value1, String value2) {
            addCriterion("ConservationPlan_Number between", value1, value2, "conservationplanNumber");
            return (Criteria) this;
        }

        public Criteria andConservationplanNumberNotBetween(String value1, String value2) {
            addCriterion("ConservationPlan_Number not between", value1, value2, "conservationplanNumber");
            return (Criteria) this;
        }

        public Criteria andIsdeletedIsNull() {
            addCriterion("IsDeleted is null");
            return (Criteria) this;
        }

        public Criteria andIsdeletedIsNotNull() {
            addCriterion("IsDeleted is not null");
            return (Criteria) this;
        }

        public Criteria andIsdeletedEqualTo(Boolean value) {
            addCriterion("IsDeleted =", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedNotEqualTo(Boolean value) {
            addCriterion("IsDeleted <>", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedGreaterThan(Boolean value) {
            addCriterion("IsDeleted >", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsDeleted >=", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedLessThan(Boolean value) {
            addCriterion("IsDeleted <", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedLessThanOrEqualTo(Boolean value) {
            addCriterion("IsDeleted <=", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedIn(List<Boolean> values) {
            addCriterion("IsDeleted in", values, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedNotIn(List<Boolean> values) {
            addCriterion("IsDeleted not in", values, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedBetween(Boolean value1, Boolean value2) {
            addCriterion("IsDeleted between", value1, value2, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsDeleted not between", value1, value2, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andInventorynumberIsNull() {
            addCriterion("InventoryNumber is null");
            return (Criteria) this;
        }

        public Criteria andInventorynumberIsNotNull() {
            addCriterion("InventoryNumber is not null");
            return (Criteria) this;
        }

        public Criteria andInventorynumberEqualTo(Integer value) {
            addCriterion("InventoryNumber =", value, "inventorynumber");
            return (Criteria) this;
        }

        public Criteria andInventorynumberNotEqualTo(Integer value) {
            addCriterion("InventoryNumber <>", value, "inventorynumber");
            return (Criteria) this;
        }

        public Criteria andInventorynumberGreaterThan(Integer value) {
            addCriterion("InventoryNumber >", value, "inventorynumber");
            return (Criteria) this;
        }

        public Criteria andInventorynumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("InventoryNumber >=", value, "inventorynumber");
            return (Criteria) this;
        }

        public Criteria andInventorynumberLessThan(Integer value) {
            addCriterion("InventoryNumber <", value, "inventorynumber");
            return (Criteria) this;
        }

        public Criteria andInventorynumberLessThanOrEqualTo(Integer value) {
            addCriterion("InventoryNumber <=", value, "inventorynumber");
            return (Criteria) this;
        }

        public Criteria andInventorynumberIn(List<Integer> values) {
            addCriterion("InventoryNumber in", values, "inventorynumber");
            return (Criteria) this;
        }

        public Criteria andInventorynumberNotIn(List<Integer> values) {
            addCriterion("InventoryNumber not in", values, "inventorynumber");
            return (Criteria) this;
        }

        public Criteria andInventorynumberBetween(Integer value1, Integer value2) {
            addCriterion("InventoryNumber between", value1, value2, "inventorynumber");
            return (Criteria) this;
        }

        public Criteria andInventorynumberNotBetween(Integer value1, Integer value2) {
            addCriterion("InventoryNumber not between", value1, value2, "inventorynumber");
            return (Criteria) this;
        }

        public Criteria andInspectionsituationIsNull() {
            addCriterion("InspectionSituation is null");
            return (Criteria) this;
        }

        public Criteria andInspectionsituationIsNotNull() {
            addCriterion("InspectionSituation is not null");
            return (Criteria) this;
        }

        public Criteria andInspectionsituationEqualTo(String value) {
            addCriterion("InspectionSituation =", value, "inspectionsituation");
            return (Criteria) this;
        }

        public Criteria andInspectionsituationNotEqualTo(String value) {
            addCriterion("InspectionSituation <>", value, "inspectionsituation");
            return (Criteria) this;
        }

        public Criteria andInspectionsituationGreaterThan(String value) {
            addCriterion("InspectionSituation >", value, "inspectionsituation");
            return (Criteria) this;
        }

        public Criteria andInspectionsituationGreaterThanOrEqualTo(String value) {
            addCriterion("InspectionSituation >=", value, "inspectionsituation");
            return (Criteria) this;
        }

        public Criteria andInspectionsituationLessThan(String value) {
            addCriterion("InspectionSituation <", value, "inspectionsituation");
            return (Criteria) this;
        }

        public Criteria andInspectionsituationLessThanOrEqualTo(String value) {
            addCriterion("InspectionSituation <=", value, "inspectionsituation");
            return (Criteria) this;
        }

        public Criteria andInspectionsituationLike(String value) {
            addCriterion("InspectionSituation like", value, "inspectionsituation");
            return (Criteria) this;
        }

        public Criteria andInspectionsituationNotLike(String value) {
            addCriterion("InspectionSituation not like", value, "inspectionsituation");
            return (Criteria) this;
        }

        public Criteria andInspectionsituationIn(List<String> values) {
            addCriterion("InspectionSituation in", values, "inspectionsituation");
            return (Criteria) this;
        }

        public Criteria andInspectionsituationNotIn(List<String> values) {
            addCriterion("InspectionSituation not in", values, "inspectionsituation");
            return (Criteria) this;
        }

        public Criteria andInspectionsituationBetween(String value1, String value2) {
            addCriterion("InspectionSituation between", value1, value2, "inspectionsituation");
            return (Criteria) this;
        }

        public Criteria andInspectionsituationNotBetween(String value1, String value2) {
            addCriterion("InspectionSituation not between", value1, value2, "inspectionsituation");
            return (Criteria) this;
        }

        public Criteria andResultIsNull() {
            addCriterion("Result is null");
            return (Criteria) this;
        }

        public Criteria andResultIsNotNull() {
            addCriterion("Result is not null");
            return (Criteria) this;
        }

        public Criteria andResultEqualTo(String value) {
            addCriterion("Result =", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotEqualTo(String value) {
            addCriterion("Result <>", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThan(String value) {
            addCriterion("Result >", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThanOrEqualTo(String value) {
            addCriterion("Result >=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThan(String value) {
            addCriterion("Result <", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThanOrEqualTo(String value) {
            addCriterion("Result <=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLike(String value) {
            addCriterion("Result like", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotLike(String value) {
            addCriterion("Result not like", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultIn(List<String> values) {
            addCriterion("Result in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotIn(List<String> values) {
            addCriterion("Result not in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultBetween(String value1, String value2) {
            addCriterion("Result between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotBetween(String value1, String value2) {
            addCriterion("Result not between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria andConservationmanIsNull() {
            addCriterion("ConservationMan is null");
            return (Criteria) this;
        }

        public Criteria andConservationmanIsNotNull() {
            addCriterion("ConservationMan is not null");
            return (Criteria) this;
        }

        public Criteria andConservationmanEqualTo(String value) {
            addCriterion("ConservationMan =", value, "conservationman");
            return (Criteria) this;
        }

        public Criteria andConservationmanNotEqualTo(String value) {
            addCriterion("ConservationMan <>", value, "conservationman");
            return (Criteria) this;
        }

        public Criteria andConservationmanGreaterThan(String value) {
            addCriterion("ConservationMan >", value, "conservationman");
            return (Criteria) this;
        }

        public Criteria andConservationmanGreaterThanOrEqualTo(String value) {
            addCriterion("ConservationMan >=", value, "conservationman");
            return (Criteria) this;
        }

        public Criteria andConservationmanLessThan(String value) {
            addCriterion("ConservationMan <", value, "conservationman");
            return (Criteria) this;
        }

        public Criteria andConservationmanLessThanOrEqualTo(String value) {
            addCriterion("ConservationMan <=", value, "conservationman");
            return (Criteria) this;
        }

        public Criteria andConservationmanLike(String value) {
            addCriterion("ConservationMan like", value, "conservationman");
            return (Criteria) this;
        }

        public Criteria andConservationmanNotLike(String value) {
            addCriterion("ConservationMan not like", value, "conservationman");
            return (Criteria) this;
        }

        public Criteria andConservationmanIn(List<String> values) {
            addCriterion("ConservationMan in", values, "conservationman");
            return (Criteria) this;
        }

        public Criteria andConservationmanNotIn(List<String> values) {
            addCriterion("ConservationMan not in", values, "conservationman");
            return (Criteria) this;
        }

        public Criteria andConservationmanBetween(String value1, String value2) {
            addCriterion("ConservationMan between", value1, value2, "conservationman");
            return (Criteria) this;
        }

        public Criteria andConservationmanNotBetween(String value1, String value2) {
            addCriterion("ConservationMan not between", value1, value2, "conservationman");
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
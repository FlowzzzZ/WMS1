package cn.hhu.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WmsBaseConservationplanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WmsBaseConservationplanExample() {
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

        public Criteria andConservationplanIdIsNull() {
            addCriterion("ConservationPlan_ID is null");
            return (Criteria) this;
        }

        public Criteria andConservationplanIdIsNotNull() {
            addCriterion("ConservationPlan_ID is not null");
            return (Criteria) this;
        }

        public Criteria andConservationplanIdEqualTo(Integer value) {
            addCriterion("ConservationPlan_ID =", value, "conservationplanId");
            return (Criteria) this;
        }

        public Criteria andConservationplanIdNotEqualTo(Integer value) {
            addCriterion("ConservationPlan_ID <>", value, "conservationplanId");
            return (Criteria) this;
        }

        public Criteria andConservationplanIdGreaterThan(Integer value) {
            addCriterion("ConservationPlan_ID >", value, "conservationplanId");
            return (Criteria) this;
        }

        public Criteria andConservationplanIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ConservationPlan_ID >=", value, "conservationplanId");
            return (Criteria) this;
        }

        public Criteria andConservationplanIdLessThan(Integer value) {
            addCriterion("ConservationPlan_ID <", value, "conservationplanId");
            return (Criteria) this;
        }

        public Criteria andConservationplanIdLessThanOrEqualTo(Integer value) {
            addCriterion("ConservationPlan_ID <=", value, "conservationplanId");
            return (Criteria) this;
        }

        public Criteria andConservationplanIdIn(List<Integer> values) {
            addCriterion("ConservationPlan_ID in", values, "conservationplanId");
            return (Criteria) this;
        }

        public Criteria andConservationplanIdNotIn(List<Integer> values) {
            addCriterion("ConservationPlan_ID not in", values, "conservationplanId");
            return (Criteria) this;
        }

        public Criteria andConservationplanIdBetween(Integer value1, Integer value2) {
            addCriterion("ConservationPlan_ID between", value1, value2, "conservationplanId");
            return (Criteria) this;
        }

        public Criteria andConservationplanIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ConservationPlan_ID not between", value1, value2, "conservationplanId");
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

        public Criteria andShipperIdIsNull() {
            addCriterion("Shipper_ID is null");
            return (Criteria) this;
        }

        public Criteria andShipperIdIsNotNull() {
            addCriterion("Shipper_ID is not null");
            return (Criteria) this;
        }

        public Criteria andShipperIdEqualTo(String value) {
            addCriterion("Shipper_ID =", value, "shipperId");
            return (Criteria) this;
        }

        public Criteria andShipperIdNotEqualTo(String value) {
            addCriterion("Shipper_ID <>", value, "shipperId");
            return (Criteria) this;
        }

        public Criteria andShipperIdGreaterThan(String value) {
            addCriterion("Shipper_ID >", value, "shipperId");
            return (Criteria) this;
        }

        public Criteria andShipperIdGreaterThanOrEqualTo(String value) {
            addCriterion("Shipper_ID >=", value, "shipperId");
            return (Criteria) this;
        }

        public Criteria andShipperIdLessThan(String value) {
            addCriterion("Shipper_ID <", value, "shipperId");
            return (Criteria) this;
        }

        public Criteria andShipperIdLessThanOrEqualTo(String value) {
            addCriterion("Shipper_ID <=", value, "shipperId");
            return (Criteria) this;
        }

        public Criteria andShipperIdLike(String value) {
            addCriterion("Shipper_ID like", value, "shipperId");
            return (Criteria) this;
        }

        public Criteria andShipperIdNotLike(String value) {
            addCriterion("Shipper_ID not like", value, "shipperId");
            return (Criteria) this;
        }

        public Criteria andShipperIdIn(List<String> values) {
            addCriterion("Shipper_ID in", values, "shipperId");
            return (Criteria) this;
        }

        public Criteria andShipperIdNotIn(List<String> values) {
            addCriterion("Shipper_ID not in", values, "shipperId");
            return (Criteria) this;
        }

        public Criteria andShipperIdBetween(String value1, String value2) {
            addCriterion("Shipper_ID between", value1, value2, "shipperId");
            return (Criteria) this;
        }

        public Criteria andShipperIdNotBetween(String value1, String value2) {
            addCriterion("Shipper_ID not between", value1, value2, "shipperId");
            return (Criteria) this;
        }

        public Criteria andConservationdateIsNull() {
            addCriterion("ConservationDate is null");
            return (Criteria) this;
        }

        public Criteria andConservationdateIsNotNull() {
            addCriterion("ConservationDate is not null");
            return (Criteria) this;
        }

        public Criteria andConservationdateEqualTo(Date value) {
            addCriterion("ConservationDate =", value, "conservationdate");
            return (Criteria) this;
        }

        public Criteria andConservationdateNotEqualTo(Date value) {
            addCriterion("ConservationDate <>", value, "conservationdate");
            return (Criteria) this;
        }

        public Criteria andConservationdateGreaterThan(Date value) {
            addCriterion("ConservationDate >", value, "conservationdate");
            return (Criteria) this;
        }

        public Criteria andConservationdateGreaterThanOrEqualTo(Date value) {
            addCriterion("ConservationDate >=", value, "conservationdate");
            return (Criteria) this;
        }

        public Criteria andConservationdateLessThan(Date value) {
            addCriterion("ConservationDate <", value, "conservationdate");
            return (Criteria) this;
        }

        public Criteria andConservationdateLessThanOrEqualTo(Date value) {
            addCriterion("ConservationDate <=", value, "conservationdate");
            return (Criteria) this;
        }

        public Criteria andConservationdateIn(List<Date> values) {
            addCriterion("ConservationDate in", values, "conservationdate");
            return (Criteria) this;
        }

        public Criteria andConservationdateNotIn(List<Date> values) {
            addCriterion("ConservationDate not in", values, "conservationdate");
            return (Criteria) this;
        }

        public Criteria andConservationdateBetween(Date value1, Date value2) {
            addCriterion("ConservationDate between", value1, value2, "conservationdate");
            return (Criteria) this;
        }

        public Criteria andConservationdateNotBetween(Date value1, Date value2) {
            addCriterion("ConservationDate not between", value1, value2, "conservationdate");
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

        public Criteria andResultEqualTo(Boolean value) {
            addCriterion("Result =", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotEqualTo(Boolean value) {
            addCriterion("Result <>", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThan(Boolean value) {
            addCriterion("Result >", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThanOrEqualTo(Boolean value) {
            addCriterion("Result >=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThan(Boolean value) {
            addCriterion("Result <", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThanOrEqualTo(Boolean value) {
            addCriterion("Result <=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultIn(List<Boolean> values) {
            addCriterion("Result in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotIn(List<Boolean> values) {
            addCriterion("Result not in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultBetween(Boolean value1, Boolean value2) {
            addCriterion("Result between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotBetween(Boolean value1, Boolean value2) {
            addCriterion("Result not between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria andStoragerequirementIsNull() {
            addCriterion("StorageRequirement is null");
            return (Criteria) this;
        }

        public Criteria andStoragerequirementIsNotNull() {
            addCriterion("StorageRequirement is not null");
            return (Criteria) this;
        }

        public Criteria andStoragerequirementEqualTo(String value) {
            addCriterion("StorageRequirement =", value, "storagerequirement");
            return (Criteria) this;
        }

        public Criteria andStoragerequirementNotEqualTo(String value) {
            addCriterion("StorageRequirement <>", value, "storagerequirement");
            return (Criteria) this;
        }

        public Criteria andStoragerequirementGreaterThan(String value) {
            addCriterion("StorageRequirement >", value, "storagerequirement");
            return (Criteria) this;
        }

        public Criteria andStoragerequirementGreaterThanOrEqualTo(String value) {
            addCriterion("StorageRequirement >=", value, "storagerequirement");
            return (Criteria) this;
        }

        public Criteria andStoragerequirementLessThan(String value) {
            addCriterion("StorageRequirement <", value, "storagerequirement");
            return (Criteria) this;
        }

        public Criteria andStoragerequirementLessThanOrEqualTo(String value) {
            addCriterion("StorageRequirement <=", value, "storagerequirement");
            return (Criteria) this;
        }

        public Criteria andStoragerequirementLike(String value) {
            addCriterion("StorageRequirement like", value, "storagerequirement");
            return (Criteria) this;
        }

        public Criteria andStoragerequirementNotLike(String value) {
            addCriterion("StorageRequirement not like", value, "storagerequirement");
            return (Criteria) this;
        }

        public Criteria andStoragerequirementIn(List<String> values) {
            addCriterion("StorageRequirement in", values, "storagerequirement");
            return (Criteria) this;
        }

        public Criteria andStoragerequirementNotIn(List<String> values) {
            addCriterion("StorageRequirement not in", values, "storagerequirement");
            return (Criteria) this;
        }

        public Criteria andStoragerequirementBetween(String value1, String value2) {
            addCriterion("StorageRequirement between", value1, value2, "storagerequirement");
            return (Criteria) this;
        }

        public Criteria andStoragerequirementNotBetween(String value1, String value2) {
            addCriterion("StorageRequirement not between", value1, value2, "storagerequirement");
            return (Criteria) this;
        }

        public Criteria andOperatingprocessIsNull() {
            addCriterion("OperatingProcess is null");
            return (Criteria) this;
        }

        public Criteria andOperatingprocessIsNotNull() {
            addCriterion("OperatingProcess is not null");
            return (Criteria) this;
        }

        public Criteria andOperatingprocessEqualTo(String value) {
            addCriterion("OperatingProcess =", value, "operatingprocess");
            return (Criteria) this;
        }

        public Criteria andOperatingprocessNotEqualTo(String value) {
            addCriterion("OperatingProcess <>", value, "operatingprocess");
            return (Criteria) this;
        }

        public Criteria andOperatingprocessGreaterThan(String value) {
            addCriterion("OperatingProcess >", value, "operatingprocess");
            return (Criteria) this;
        }

        public Criteria andOperatingprocessGreaterThanOrEqualTo(String value) {
            addCriterion("OperatingProcess >=", value, "operatingprocess");
            return (Criteria) this;
        }

        public Criteria andOperatingprocessLessThan(String value) {
            addCriterion("OperatingProcess <", value, "operatingprocess");
            return (Criteria) this;
        }

        public Criteria andOperatingprocessLessThanOrEqualTo(String value) {
            addCriterion("OperatingProcess <=", value, "operatingprocess");
            return (Criteria) this;
        }

        public Criteria andOperatingprocessLike(String value) {
            addCriterion("OperatingProcess like", value, "operatingprocess");
            return (Criteria) this;
        }

        public Criteria andOperatingprocessNotLike(String value) {
            addCriterion("OperatingProcess not like", value, "operatingprocess");
            return (Criteria) this;
        }

        public Criteria andOperatingprocessIn(List<String> values) {
            addCriterion("OperatingProcess in", values, "operatingprocess");
            return (Criteria) this;
        }

        public Criteria andOperatingprocessNotIn(List<String> values) {
            addCriterion("OperatingProcess not in", values, "operatingprocess");
            return (Criteria) this;
        }

        public Criteria andOperatingprocessBetween(String value1, String value2) {
            addCriterion("OperatingProcess between", value1, value2, "operatingprocess");
            return (Criteria) this;
        }

        public Criteria andOperatingprocessNotBetween(String value1, String value2) {
            addCriterion("OperatingProcess not between", value1, value2, "operatingprocess");
            return (Criteria) this;
        }

        public Criteria andGoodsmarkingIsNull() {
            addCriterion("GoodsMarking is null");
            return (Criteria) this;
        }

        public Criteria andGoodsmarkingIsNotNull() {
            addCriterion("GoodsMarking is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsmarkingEqualTo(String value) {
            addCriterion("GoodsMarking =", value, "goodsmarking");
            return (Criteria) this;
        }

        public Criteria andGoodsmarkingNotEqualTo(String value) {
            addCriterion("GoodsMarking <>", value, "goodsmarking");
            return (Criteria) this;
        }

        public Criteria andGoodsmarkingGreaterThan(String value) {
            addCriterion("GoodsMarking >", value, "goodsmarking");
            return (Criteria) this;
        }

        public Criteria andGoodsmarkingGreaterThanOrEqualTo(String value) {
            addCriterion("GoodsMarking >=", value, "goodsmarking");
            return (Criteria) this;
        }

        public Criteria andGoodsmarkingLessThan(String value) {
            addCriterion("GoodsMarking <", value, "goodsmarking");
            return (Criteria) this;
        }

        public Criteria andGoodsmarkingLessThanOrEqualTo(String value) {
            addCriterion("GoodsMarking <=", value, "goodsmarking");
            return (Criteria) this;
        }

        public Criteria andGoodsmarkingLike(String value) {
            addCriterion("GoodsMarking like", value, "goodsmarking");
            return (Criteria) this;
        }

        public Criteria andGoodsmarkingNotLike(String value) {
            addCriterion("GoodsMarking not like", value, "goodsmarking");
            return (Criteria) this;
        }

        public Criteria andGoodsmarkingIn(List<String> values) {
            addCriterion("GoodsMarking in", values, "goodsmarking");
            return (Criteria) this;
        }

        public Criteria andGoodsmarkingNotIn(List<String> values) {
            addCriterion("GoodsMarking not in", values, "goodsmarking");
            return (Criteria) this;
        }

        public Criteria andGoodsmarkingBetween(String value1, String value2) {
            addCriterion("GoodsMarking between", value1, value2, "goodsmarking");
            return (Criteria) this;
        }

        public Criteria andGoodsmarkingNotBetween(String value1, String value2) {
            addCriterion("GoodsMarking not between", value1, value2, "goodsmarking");
            return (Criteria) this;
        }

        public Criteria andProtectivemeasuresIsNull() {
            addCriterion("ProtectiveMeasures is null");
            return (Criteria) this;
        }

        public Criteria andProtectivemeasuresIsNotNull() {
            addCriterion("ProtectiveMeasures is not null");
            return (Criteria) this;
        }

        public Criteria andProtectivemeasuresEqualTo(String value) {
            addCriterion("ProtectiveMeasures =", value, "protectivemeasures");
            return (Criteria) this;
        }

        public Criteria andProtectivemeasuresNotEqualTo(String value) {
            addCriterion("ProtectiveMeasures <>", value, "protectivemeasures");
            return (Criteria) this;
        }

        public Criteria andProtectivemeasuresGreaterThan(String value) {
            addCriterion("ProtectiveMeasures >", value, "protectivemeasures");
            return (Criteria) this;
        }

        public Criteria andProtectivemeasuresGreaterThanOrEqualTo(String value) {
            addCriterion("ProtectiveMeasures >=", value, "protectivemeasures");
            return (Criteria) this;
        }

        public Criteria andProtectivemeasuresLessThan(String value) {
            addCriterion("ProtectiveMeasures <", value, "protectivemeasures");
            return (Criteria) this;
        }

        public Criteria andProtectivemeasuresLessThanOrEqualTo(String value) {
            addCriterion("ProtectiveMeasures <=", value, "protectivemeasures");
            return (Criteria) this;
        }

        public Criteria andProtectivemeasuresLike(String value) {
            addCriterion("ProtectiveMeasures like", value, "protectivemeasures");
            return (Criteria) this;
        }

        public Criteria andProtectivemeasuresNotLike(String value) {
            addCriterion("ProtectiveMeasures not like", value, "protectivemeasures");
            return (Criteria) this;
        }

        public Criteria andProtectivemeasuresIn(List<String> values) {
            addCriterion("ProtectiveMeasures in", values, "protectivemeasures");
            return (Criteria) this;
        }

        public Criteria andProtectivemeasuresNotIn(List<String> values) {
            addCriterion("ProtectiveMeasures not in", values, "protectivemeasures");
            return (Criteria) this;
        }

        public Criteria andProtectivemeasuresBetween(String value1, String value2) {
            addCriterion("ProtectiveMeasures between", value1, value2, "protectivemeasures");
            return (Criteria) this;
        }

        public Criteria andProtectivemeasuresNotBetween(String value1, String value2) {
            addCriterion("ProtectiveMeasures not between", value1, value2, "protectivemeasures");
            return (Criteria) this;
        }

        public Criteria andHygienicenvironmentIsNull() {
            addCriterion("HygienicEnvironment is null");
            return (Criteria) this;
        }

        public Criteria andHygienicenvironmentIsNotNull() {
            addCriterion("HygienicEnvironment is not null");
            return (Criteria) this;
        }

        public Criteria andHygienicenvironmentEqualTo(String value) {
            addCriterion("HygienicEnvironment =", value, "hygienicenvironment");
            return (Criteria) this;
        }

        public Criteria andHygienicenvironmentNotEqualTo(String value) {
            addCriterion("HygienicEnvironment <>", value, "hygienicenvironment");
            return (Criteria) this;
        }

        public Criteria andHygienicenvironmentGreaterThan(String value) {
            addCriterion("HygienicEnvironment >", value, "hygienicenvironment");
            return (Criteria) this;
        }

        public Criteria andHygienicenvironmentGreaterThanOrEqualTo(String value) {
            addCriterion("HygienicEnvironment >=", value, "hygienicenvironment");
            return (Criteria) this;
        }

        public Criteria andHygienicenvironmentLessThan(String value) {
            addCriterion("HygienicEnvironment <", value, "hygienicenvironment");
            return (Criteria) this;
        }

        public Criteria andHygienicenvironmentLessThanOrEqualTo(String value) {
            addCriterion("HygienicEnvironment <=", value, "hygienicenvironment");
            return (Criteria) this;
        }

        public Criteria andHygienicenvironmentLike(String value) {
            addCriterion("HygienicEnvironment like", value, "hygienicenvironment");
            return (Criteria) this;
        }

        public Criteria andHygienicenvironmentNotLike(String value) {
            addCriterion("HygienicEnvironment not like", value, "hygienicenvironment");
            return (Criteria) this;
        }

        public Criteria andHygienicenvironmentIn(List<String> values) {
            addCriterion("HygienicEnvironment in", values, "hygienicenvironment");
            return (Criteria) this;
        }

        public Criteria andHygienicenvironmentNotIn(List<String> values) {
            addCriterion("HygienicEnvironment not in", values, "hygienicenvironment");
            return (Criteria) this;
        }

        public Criteria andHygienicenvironmentBetween(String value1, String value2) {
            addCriterion("HygienicEnvironment between", value1, value2, "hygienicenvironment");
            return (Criteria) this;
        }

        public Criteria andHygienicenvironmentNotBetween(String value1, String value2) {
            addCriterion("HygienicEnvironment not between", value1, value2, "hygienicenvironment");
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
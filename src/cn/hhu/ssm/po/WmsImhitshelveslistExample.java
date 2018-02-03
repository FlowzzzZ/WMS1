package cn.hhu.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WmsImhitshelveslistExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WmsImhitshelveslistExample() {
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

        public Criteria andImhitshelveslistsNumberIsNull() {
            addCriterion("IMHitShelvesLists_Number is null");
            return (Criteria) this;
        }

        public Criteria andImhitshelveslistsNumberIsNotNull() {
            addCriterion("IMHitShelvesLists_Number is not null");
            return (Criteria) this;
        }

        public Criteria andImhitshelveslistsNumberEqualTo(String value) {
            addCriterion("IMHitShelvesLists_Number =", value, "imhitshelveslistsNumber");
            return (Criteria) this;
        }

        public Criteria andImhitshelveslistsNumberNotEqualTo(String value) {
            addCriterion("IMHitShelvesLists_Number <>", value, "imhitshelveslistsNumber");
            return (Criteria) this;
        }

        public Criteria andImhitshelveslistsNumberGreaterThan(String value) {
            addCriterion("IMHitShelvesLists_Number >", value, "imhitshelveslistsNumber");
            return (Criteria) this;
        }

        public Criteria andImhitshelveslistsNumberGreaterThanOrEqualTo(String value) {
            addCriterion("IMHitShelvesLists_Number >=", value, "imhitshelveslistsNumber");
            return (Criteria) this;
        }

        public Criteria andImhitshelveslistsNumberLessThan(String value) {
            addCriterion("IMHitShelvesLists_Number <", value, "imhitshelveslistsNumber");
            return (Criteria) this;
        }

        public Criteria andImhitshelveslistsNumberLessThanOrEqualTo(String value) {
            addCriterion("IMHitShelvesLists_Number <=", value, "imhitshelveslistsNumber");
            return (Criteria) this;
        }

        public Criteria andImhitshelveslistsNumberLike(String value) {
            addCriterion("IMHitShelvesLists_Number like", value, "imhitshelveslistsNumber");
            return (Criteria) this;
        }

        public Criteria andImhitshelveslistsNumberNotLike(String value) {
            addCriterion("IMHitShelvesLists_Number not like", value, "imhitshelveslistsNumber");
            return (Criteria) this;
        }

        public Criteria andImhitshelveslistsNumberIn(List<String> values) {
            addCriterion("IMHitShelvesLists_Number in", values, "imhitshelveslistsNumber");
            return (Criteria) this;
        }

        public Criteria andImhitshelveslistsNumberNotIn(List<String> values) {
            addCriterion("IMHitShelvesLists_Number not in", values, "imhitshelveslistsNumber");
            return (Criteria) this;
        }

        public Criteria andImhitshelveslistsNumberBetween(String value1, String value2) {
            addCriterion("IMHitShelvesLists_Number between", value1, value2, "imhitshelveslistsNumber");
            return (Criteria) this;
        }

        public Criteria andImhitshelveslistsNumberNotBetween(String value1, String value2) {
            addCriterion("IMHitShelvesLists_Number not between", value1, value2, "imhitshelveslistsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNull() {
            addCriterion("Goods_ID is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("Goods_ID is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(Integer value) {
            addCriterion("Goods_ID =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(Integer value) {
            addCriterion("Goods_ID <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(Integer value) {
            addCriterion("Goods_ID >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Goods_ID >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(Integer value) {
            addCriterion("Goods_ID <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(Integer value) {
            addCriterion("Goods_ID <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<Integer> values) {
            addCriterion("Goods_ID in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<Integer> values) {
            addCriterion("Goods_ID not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(Integer value1, Integer value2) {
            addCriterion("Goods_ID between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Goods_ID not between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andLocationsIdIsNull() {
            addCriterion("Locations_ID is null");
            return (Criteria) this;
        }

        public Criteria andLocationsIdIsNotNull() {
            addCriterion("Locations_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLocationsIdEqualTo(Integer value) {
            addCriterion("Locations_ID =", value, "locationsId");
            return (Criteria) this;
        }

        public Criteria andLocationsIdNotEqualTo(Integer value) {
            addCriterion("Locations_ID <>", value, "locationsId");
            return (Criteria) this;
        }

        public Criteria andLocationsIdGreaterThan(Integer value) {
            addCriterion("Locations_ID >", value, "locationsId");
            return (Criteria) this;
        }

        public Criteria andLocationsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Locations_ID >=", value, "locationsId");
            return (Criteria) this;
        }

        public Criteria andLocationsIdLessThan(Integer value) {
            addCriterion("Locations_ID <", value, "locationsId");
            return (Criteria) this;
        }

        public Criteria andLocationsIdLessThanOrEqualTo(Integer value) {
            addCriterion("Locations_ID <=", value, "locationsId");
            return (Criteria) this;
        }

        public Criteria andLocationsIdIn(List<Integer> values) {
            addCriterion("Locations_ID in", values, "locationsId");
            return (Criteria) this;
        }

        public Criteria andLocationsIdNotIn(List<Integer> values) {
            addCriterion("Locations_ID not in", values, "locationsId");
            return (Criteria) this;
        }

        public Criteria andLocationsIdBetween(Integer value1, Integer value2) {
            addCriterion("Locations_ID between", value1, value2, "locationsId");
            return (Criteria) this;
        }

        public Criteria andLocationsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Locations_ID not between", value1, value2, "locationsId");
            return (Criteria) this;
        }

        public Criteria andGoodsnameIsNull() {
            addCriterion("GoodsName is null");
            return (Criteria) this;
        }

        public Criteria andGoodsnameIsNotNull() {
            addCriterion("GoodsName is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsnameEqualTo(String value) {
            addCriterion("GoodsName =", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotEqualTo(String value) {
            addCriterion("GoodsName <>", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameGreaterThan(String value) {
            addCriterion("GoodsName >", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameGreaterThanOrEqualTo(String value) {
            addCriterion("GoodsName >=", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameLessThan(String value) {
            addCriterion("GoodsName <", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameLessThanOrEqualTo(String value) {
            addCriterion("GoodsName <=", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameLike(String value) {
            addCriterion("GoodsName like", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotLike(String value) {
            addCriterion("GoodsName not like", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameIn(List<String> values) {
            addCriterion("GoodsName in", values, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotIn(List<String> values) {
            addCriterion("GoodsName not in", values, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameBetween(String value1, String value2) {
            addCriterion("GoodsName between", value1, value2, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotBetween(String value1, String value2) {
            addCriterion("GoodsName not between", value1, value2, "goodsname");
            return (Criteria) this;
        }

        public Criteria andRegistrationIsNull() {
            addCriterion("Registration is null");
            return (Criteria) this;
        }

        public Criteria andRegistrationIsNotNull() {
            addCriterion("Registration is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrationEqualTo(String value) {
            addCriterion("Registration =", value, "registration");
            return (Criteria) this;
        }

        public Criteria andRegistrationNotEqualTo(String value) {
            addCriterion("Registration <>", value, "registration");
            return (Criteria) this;
        }

        public Criteria andRegistrationGreaterThan(String value) {
            addCriterion("Registration >", value, "registration");
            return (Criteria) this;
        }

        public Criteria andRegistrationGreaterThanOrEqualTo(String value) {
            addCriterion("Registration >=", value, "registration");
            return (Criteria) this;
        }

        public Criteria andRegistrationLessThan(String value) {
            addCriterion("Registration <", value, "registration");
            return (Criteria) this;
        }

        public Criteria andRegistrationLessThanOrEqualTo(String value) {
            addCriterion("Registration <=", value, "registration");
            return (Criteria) this;
        }

        public Criteria andRegistrationLike(String value) {
            addCriterion("Registration like", value, "registration");
            return (Criteria) this;
        }

        public Criteria andRegistrationNotLike(String value) {
            addCriterion("Registration not like", value, "registration");
            return (Criteria) this;
        }

        public Criteria andRegistrationIn(List<String> values) {
            addCriterion("Registration in", values, "registration");
            return (Criteria) this;
        }

        public Criteria andRegistrationNotIn(List<String> values) {
            addCriterion("Registration not in", values, "registration");
            return (Criteria) this;
        }

        public Criteria andRegistrationBetween(String value1, String value2) {
            addCriterion("Registration between", value1, value2, "registration");
            return (Criteria) this;
        }

        public Criteria andRegistrationNotBetween(String value1, String value2) {
            addCriterion("Registration not between", value1, value2, "registration");
            return (Criteria) this;
        }

        public Criteria andSpecifiationtypeIsNull() {
            addCriterion("SpecifiationType is null");
            return (Criteria) this;
        }

        public Criteria andSpecifiationtypeIsNotNull() {
            addCriterion("SpecifiationType is not null");
            return (Criteria) this;
        }

        public Criteria andSpecifiationtypeEqualTo(String value) {
            addCriterion("SpecifiationType =", value, "specifiationtype");
            return (Criteria) this;
        }

        public Criteria andSpecifiationtypeNotEqualTo(String value) {
            addCriterion("SpecifiationType <>", value, "specifiationtype");
            return (Criteria) this;
        }

        public Criteria andSpecifiationtypeGreaterThan(String value) {
            addCriterion("SpecifiationType >", value, "specifiationtype");
            return (Criteria) this;
        }

        public Criteria andSpecifiationtypeGreaterThanOrEqualTo(String value) {
            addCriterion("SpecifiationType >=", value, "specifiationtype");
            return (Criteria) this;
        }

        public Criteria andSpecifiationtypeLessThan(String value) {
            addCriterion("SpecifiationType <", value, "specifiationtype");
            return (Criteria) this;
        }

        public Criteria andSpecifiationtypeLessThanOrEqualTo(String value) {
            addCriterion("SpecifiationType <=", value, "specifiationtype");
            return (Criteria) this;
        }

        public Criteria andSpecifiationtypeLike(String value) {
            addCriterion("SpecifiationType like", value, "specifiationtype");
            return (Criteria) this;
        }

        public Criteria andSpecifiationtypeNotLike(String value) {
            addCriterion("SpecifiationType not like", value, "specifiationtype");
            return (Criteria) this;
        }

        public Criteria andSpecifiationtypeIn(List<String> values) {
            addCriterion("SpecifiationType in", values, "specifiationtype");
            return (Criteria) this;
        }

        public Criteria andSpecifiationtypeNotIn(List<String> values) {
            addCriterion("SpecifiationType not in", values, "specifiationtype");
            return (Criteria) this;
        }

        public Criteria andSpecifiationtypeBetween(String value1, String value2) {
            addCriterion("SpecifiationType between", value1, value2, "specifiationtype");
            return (Criteria) this;
        }

        public Criteria andSpecifiationtypeNotBetween(String value1, String value2) {
            addCriterion("SpecifiationType not between", value1, value2, "specifiationtype");
            return (Criteria) this;
        }

        public Criteria andBatchnumberIsNull() {
            addCriterion("BatchNumber is null");
            return (Criteria) this;
        }

        public Criteria andBatchnumberIsNotNull() {
            addCriterion("BatchNumber is not null");
            return (Criteria) this;
        }

        public Criteria andBatchnumberEqualTo(String value) {
            addCriterion("BatchNumber =", value, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberNotEqualTo(String value) {
            addCriterion("BatchNumber <>", value, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberGreaterThan(String value) {
            addCriterion("BatchNumber >", value, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberGreaterThanOrEqualTo(String value) {
            addCriterion("BatchNumber >=", value, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberLessThan(String value) {
            addCriterion("BatchNumber <", value, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberLessThanOrEqualTo(String value) {
            addCriterion("BatchNumber <=", value, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberLike(String value) {
            addCriterion("BatchNumber like", value, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberNotLike(String value) {
            addCriterion("BatchNumber not like", value, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberIn(List<String> values) {
            addCriterion("BatchNumber in", values, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberNotIn(List<String> values) {
            addCriterion("BatchNumber not in", values, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberBetween(String value1, String value2) {
            addCriterion("BatchNumber between", value1, value2, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberNotBetween(String value1, String value2) {
            addCriterion("BatchNumber not between", value1, value2, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andSecondbatchnumberIsNull() {
            addCriterion("SecondBatchNumber is null");
            return (Criteria) this;
        }

        public Criteria andSecondbatchnumberIsNotNull() {
            addCriterion("SecondBatchNumber is not null");
            return (Criteria) this;
        }

        public Criteria andSecondbatchnumberEqualTo(String value) {
            addCriterion("SecondBatchNumber =", value, "secondbatchnumber");
            return (Criteria) this;
        }

        public Criteria andSecondbatchnumberNotEqualTo(String value) {
            addCriterion("SecondBatchNumber <>", value, "secondbatchnumber");
            return (Criteria) this;
        }

        public Criteria andSecondbatchnumberGreaterThan(String value) {
            addCriterion("SecondBatchNumber >", value, "secondbatchnumber");
            return (Criteria) this;
        }

        public Criteria andSecondbatchnumberGreaterThanOrEqualTo(String value) {
            addCriterion("SecondBatchNumber >=", value, "secondbatchnumber");
            return (Criteria) this;
        }

        public Criteria andSecondbatchnumberLessThan(String value) {
            addCriterion("SecondBatchNumber <", value, "secondbatchnumber");
            return (Criteria) this;
        }

        public Criteria andSecondbatchnumberLessThanOrEqualTo(String value) {
            addCriterion("SecondBatchNumber <=", value, "secondbatchnumber");
            return (Criteria) this;
        }

        public Criteria andSecondbatchnumberLike(String value) {
            addCriterion("SecondBatchNumber like", value, "secondbatchnumber");
            return (Criteria) this;
        }

        public Criteria andSecondbatchnumberNotLike(String value) {
            addCriterion("SecondBatchNumber not like", value, "secondbatchnumber");
            return (Criteria) this;
        }

        public Criteria andSecondbatchnumberIn(List<String> values) {
            addCriterion("SecondBatchNumber in", values, "secondbatchnumber");
            return (Criteria) this;
        }

        public Criteria andSecondbatchnumberNotIn(List<String> values) {
            addCriterion("SecondBatchNumber not in", values, "secondbatchnumber");
            return (Criteria) this;
        }

        public Criteria andSecondbatchnumberBetween(String value1, String value2) {
            addCriterion("SecondBatchNumber between", value1, value2, "secondbatchnumber");
            return (Criteria) this;
        }

        public Criteria andSecondbatchnumberNotBetween(String value1, String value2) {
            addCriterion("SecondBatchNumber not between", value1, value2, "secondbatchnumber");
            return (Criteria) this;
        }

        public Criteria andSerialnumberIdIsNull() {
            addCriterion("SerialNumber_ID is null");
            return (Criteria) this;
        }

        public Criteria andSerialnumberIdIsNotNull() {
            addCriterion("SerialNumber_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSerialnumberIdEqualTo(Integer value) {
            addCriterion("SerialNumber_ID =", value, "serialnumberId");
            return (Criteria) this;
        }

        public Criteria andSerialnumberIdNotEqualTo(Integer value) {
            addCriterion("SerialNumber_ID <>", value, "serialnumberId");
            return (Criteria) this;
        }

        public Criteria andSerialnumberIdGreaterThan(Integer value) {
            addCriterion("SerialNumber_ID >", value, "serialnumberId");
            return (Criteria) this;
        }

        public Criteria andSerialnumberIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SerialNumber_ID >=", value, "serialnumberId");
            return (Criteria) this;
        }

        public Criteria andSerialnumberIdLessThan(Integer value) {
            addCriterion("SerialNumber_ID <", value, "serialnumberId");
            return (Criteria) this;
        }

        public Criteria andSerialnumberIdLessThanOrEqualTo(Integer value) {
            addCriterion("SerialNumber_ID <=", value, "serialnumberId");
            return (Criteria) this;
        }

        public Criteria andSerialnumberIdIn(List<Integer> values) {
            addCriterion("SerialNumber_ID in", values, "serialnumberId");
            return (Criteria) this;
        }

        public Criteria andSerialnumberIdNotIn(List<Integer> values) {
            addCriterion("SerialNumber_ID not in", values, "serialnumberId");
            return (Criteria) this;
        }

        public Criteria andSerialnumberIdBetween(Integer value1, Integer value2) {
            addCriterion("SerialNumber_ID between", value1, value2, "serialnumberId");
            return (Criteria) this;
        }

        public Criteria andSerialnumberIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SerialNumber_ID not between", value1, value2, "serialnumberId");
            return (Criteria) this;
        }

        public Criteria andProducedateIsNull() {
            addCriterion("ProduceDate is null");
            return (Criteria) this;
        }

        public Criteria andProducedateIsNotNull() {
            addCriterion("ProduceDate is not null");
            return (Criteria) this;
        }

        public Criteria andProducedateEqualTo(Date value) {
            addCriterion("ProduceDate =", value, "producedate");
            return (Criteria) this;
        }

        public Criteria andProducedateNotEqualTo(Date value) {
            addCriterion("ProduceDate <>", value, "producedate");
            return (Criteria) this;
        }

        public Criteria andProducedateGreaterThan(Date value) {
            addCriterion("ProduceDate >", value, "producedate");
            return (Criteria) this;
        }

        public Criteria andProducedateGreaterThanOrEqualTo(Date value) {
            addCriterion("ProduceDate >=", value, "producedate");
            return (Criteria) this;
        }

        public Criteria andProducedateLessThan(Date value) {
            addCriterion("ProduceDate <", value, "producedate");
            return (Criteria) this;
        }

        public Criteria andProducedateLessThanOrEqualTo(Date value) {
            addCriterion("ProduceDate <=", value, "producedate");
            return (Criteria) this;
        }

        public Criteria andProducedateIn(List<Date> values) {
            addCriterion("ProduceDate in", values, "producedate");
            return (Criteria) this;
        }

        public Criteria andProducedateNotIn(List<Date> values) {
            addCriterion("ProduceDate not in", values, "producedate");
            return (Criteria) this;
        }

        public Criteria andProducedateBetween(Date value1, Date value2) {
            addCriterion("ProduceDate between", value1, value2, "producedate");
            return (Criteria) this;
        }

        public Criteria andProducedateNotBetween(Date value1, Date value2) {
            addCriterion("ProduceDate not between", value1, value2, "producedate");
            return (Criteria) this;
        }

        public Criteria andFailuredateIsNull() {
            addCriterion("FailureDate is null");
            return (Criteria) this;
        }

        public Criteria andFailuredateIsNotNull() {
            addCriterion("FailureDate is not null");
            return (Criteria) this;
        }

        public Criteria andFailuredateEqualTo(Date value) {
            addCriterion("FailureDate =", value, "failuredate");
            return (Criteria) this;
        }

        public Criteria andFailuredateNotEqualTo(Date value) {
            addCriterion("FailureDate <>", value, "failuredate");
            return (Criteria) this;
        }

        public Criteria andFailuredateGreaterThan(Date value) {
            addCriterion("FailureDate >", value, "failuredate");
            return (Criteria) this;
        }

        public Criteria andFailuredateGreaterThanOrEqualTo(Date value) {
            addCriterion("FailureDate >=", value, "failuredate");
            return (Criteria) this;
        }

        public Criteria andFailuredateLessThan(Date value) {
            addCriterion("FailureDate <", value, "failuredate");
            return (Criteria) this;
        }

        public Criteria andFailuredateLessThanOrEqualTo(Date value) {
            addCriterion("FailureDate <=", value, "failuredate");
            return (Criteria) this;
        }

        public Criteria andFailuredateIn(List<Date> values) {
            addCriterion("FailureDate in", values, "failuredate");
            return (Criteria) this;
        }

        public Criteria andFailuredateNotIn(List<Date> values) {
            addCriterion("FailureDate not in", values, "failuredate");
            return (Criteria) this;
        }

        public Criteria andFailuredateBetween(Date value1, Date value2) {
            addCriterion("FailureDate between", value1, value2, "failuredate");
            return (Criteria) this;
        }

        public Criteria andFailuredateNotBetween(Date value1, Date value2) {
            addCriterion("FailureDate not between", value1, value2, "failuredate");
            return (Criteria) this;
        }

        public Criteria andNumberIsNull() {
            addCriterion("Number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("Number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(Integer value) {
            addCriterion("Number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(Integer value) {
            addCriterion("Number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(Integer value) {
            addCriterion("Number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("Number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(Integer value) {
            addCriterion("Number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(Integer value) {
            addCriterion("Number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<Integer> values) {
            addCriterion("Number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<Integer> values) {
            addCriterion("Number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(Integer value1, Integer value2) {
            addCriterion("Number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("Number not between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andCountIsNull() {
            addCriterion("Count is null");
            return (Criteria) this;
        }

        public Criteria andCountIsNotNull() {
            addCriterion("Count is not null");
            return (Criteria) this;
        }

        public Criteria andCountEqualTo(Integer value) {
            addCriterion("Count =", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotEqualTo(Integer value) {
            addCriterion("Count <>", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThan(Integer value) {
            addCriterion("Count >", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("Count >=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThan(Integer value) {
            addCriterion("Count <", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThanOrEqualTo(Integer value) {
            addCriterion("Count <=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountIn(List<Integer> values) {
            addCriterion("Count in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotIn(List<Integer> values) {
            addCriterion("Count not in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountBetween(Integer value1, Integer value2) {
            addCriterion("Count between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotBetween(Integer value1, Integer value2) {
            addCriterion("Count not between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andConversionrateIsNull() {
            addCriterion("ConversionRate is null");
            return (Criteria) this;
        }

        public Criteria andConversionrateIsNotNull() {
            addCriterion("ConversionRate is not null");
            return (Criteria) this;
        }

        public Criteria andConversionrateEqualTo(Float value) {
            addCriterion("ConversionRate =", value, "conversionrate");
            return (Criteria) this;
        }

        public Criteria andConversionrateNotEqualTo(Float value) {
            addCriterion("ConversionRate <>", value, "conversionrate");
            return (Criteria) this;
        }

        public Criteria andConversionrateGreaterThan(Float value) {
            addCriterion("ConversionRate >", value, "conversionrate");
            return (Criteria) this;
        }

        public Criteria andConversionrateGreaterThanOrEqualTo(Float value) {
            addCriterion("ConversionRate >=", value, "conversionrate");
            return (Criteria) this;
        }

        public Criteria andConversionrateLessThan(Float value) {
            addCriterion("ConversionRate <", value, "conversionrate");
            return (Criteria) this;
        }

        public Criteria andConversionrateLessThanOrEqualTo(Float value) {
            addCriterion("ConversionRate <=", value, "conversionrate");
            return (Criteria) this;
        }

        public Criteria andConversionrateIn(List<Float> values) {
            addCriterion("ConversionRate in", values, "conversionrate");
            return (Criteria) this;
        }

        public Criteria andConversionrateNotIn(List<Float> values) {
            addCriterion("ConversionRate not in", values, "conversionrate");
            return (Criteria) this;
        }

        public Criteria andConversionrateBetween(Float value1, Float value2) {
            addCriterion("ConversionRate between", value1, value2, "conversionrate");
            return (Criteria) this;
        }

        public Criteria andConversionrateNotBetween(Float value1, Float value2) {
            addCriterion("ConversionRate not between", value1, value2, "conversionrate");
            return (Criteria) this;
        }

        public Criteria andHitshelvesnumberIsNull() {
            addCriterion("HitShelvesNumber is null");
            return (Criteria) this;
        }

        public Criteria andHitshelvesnumberIsNotNull() {
            addCriterion("HitShelvesNumber is not null");
            return (Criteria) this;
        }

        public Criteria andHitshelvesnumberEqualTo(Float value) {
            addCriterion("HitShelvesNumber =", value, "hitshelvesnumber");
            return (Criteria) this;
        }

        public Criteria andHitshelvesnumberNotEqualTo(Float value) {
            addCriterion("HitShelvesNumber <>", value, "hitshelvesnumber");
            return (Criteria) this;
        }

        public Criteria andHitshelvesnumberGreaterThan(Float value) {
            addCriterion("HitShelvesNumber >", value, "hitshelvesnumber");
            return (Criteria) this;
        }

        public Criteria andHitshelvesnumberGreaterThanOrEqualTo(Float value) {
            addCriterion("HitShelvesNumber >=", value, "hitshelvesnumber");
            return (Criteria) this;
        }

        public Criteria andHitshelvesnumberLessThan(Float value) {
            addCriterion("HitShelvesNumber <", value, "hitshelvesnumber");
            return (Criteria) this;
        }

        public Criteria andHitshelvesnumberLessThanOrEqualTo(Float value) {
            addCriterion("HitShelvesNumber <=", value, "hitshelvesnumber");
            return (Criteria) this;
        }

        public Criteria andHitshelvesnumberIn(List<Float> values) {
            addCriterion("HitShelvesNumber in", values, "hitshelvesnumber");
            return (Criteria) this;
        }

        public Criteria andHitshelvesnumberNotIn(List<Float> values) {
            addCriterion("HitShelvesNumber not in", values, "hitshelvesnumber");
            return (Criteria) this;
        }

        public Criteria andHitshelvesnumberBetween(Float value1, Float value2) {
            addCriterion("HitShelvesNumber between", value1, value2, "hitshelvesnumber");
            return (Criteria) this;
        }

        public Criteria andHitshelvesnumberNotBetween(Float value1, Float value2) {
            addCriterion("HitShelvesNumber not between", value1, value2, "hitshelvesnumber");
            return (Criteria) this;
        }

        public Criteria andHitshelvescountIsNull() {
            addCriterion("HitShelvesCount is null");
            return (Criteria) this;
        }

        public Criteria andHitshelvescountIsNotNull() {
            addCriterion("HitShelvesCount is not null");
            return (Criteria) this;
        }

        public Criteria andHitshelvescountEqualTo(Float value) {
            addCriterion("HitShelvesCount =", value, "hitshelvescount");
            return (Criteria) this;
        }

        public Criteria andHitshelvescountNotEqualTo(Float value) {
            addCriterion("HitShelvesCount <>", value, "hitshelvescount");
            return (Criteria) this;
        }

        public Criteria andHitshelvescountGreaterThan(Float value) {
            addCriterion("HitShelvesCount >", value, "hitshelvescount");
            return (Criteria) this;
        }

        public Criteria andHitshelvescountGreaterThanOrEqualTo(Float value) {
            addCriterion("HitShelvesCount >=", value, "hitshelvescount");
            return (Criteria) this;
        }

        public Criteria andHitshelvescountLessThan(Float value) {
            addCriterion("HitShelvesCount <", value, "hitshelvescount");
            return (Criteria) this;
        }

        public Criteria andHitshelvescountLessThanOrEqualTo(Float value) {
            addCriterion("HitShelvesCount <=", value, "hitshelvescount");
            return (Criteria) this;
        }

        public Criteria andHitshelvescountIn(List<Float> values) {
            addCriterion("HitShelvesCount in", values, "hitshelvescount");
            return (Criteria) this;
        }

        public Criteria andHitshelvescountNotIn(List<Float> values) {
            addCriterion("HitShelvesCount not in", values, "hitshelvescount");
            return (Criteria) this;
        }

        public Criteria andHitshelvescountBetween(Float value1, Float value2) {
            addCriterion("HitShelvesCount between", value1, value2, "hitshelvescount");
            return (Criteria) this;
        }

        public Criteria andHitshelvescountNotBetween(Float value1, Float value2) {
            addCriterion("HitShelvesCount not between", value1, value2, "hitshelvescount");
            return (Criteria) this;
        }

        public Criteria andLocationnameIsNull() {
            addCriterion("LocationName is null");
            return (Criteria) this;
        }

        public Criteria andLocationnameIsNotNull() {
            addCriterion("LocationName is not null");
            return (Criteria) this;
        }

        public Criteria andLocationnameEqualTo(String value) {
            addCriterion("LocationName =", value, "locationname");
            return (Criteria) this;
        }

        public Criteria andLocationnameNotEqualTo(String value) {
            addCriterion("LocationName <>", value, "locationname");
            return (Criteria) this;
        }

        public Criteria andLocationnameGreaterThan(String value) {
            addCriterion("LocationName >", value, "locationname");
            return (Criteria) this;
        }

        public Criteria andLocationnameGreaterThanOrEqualTo(String value) {
            addCriterion("LocationName >=", value, "locationname");
            return (Criteria) this;
        }

        public Criteria andLocationnameLessThan(String value) {
            addCriterion("LocationName <", value, "locationname");
            return (Criteria) this;
        }

        public Criteria andLocationnameLessThanOrEqualTo(String value) {
            addCriterion("LocationName <=", value, "locationname");
            return (Criteria) this;
        }

        public Criteria andLocationnameLike(String value) {
            addCriterion("LocationName like", value, "locationname");
            return (Criteria) this;
        }

        public Criteria andLocationnameNotLike(String value) {
            addCriterion("LocationName not like", value, "locationname");
            return (Criteria) this;
        }

        public Criteria andLocationnameIn(List<String> values) {
            addCriterion("LocationName in", values, "locationname");
            return (Criteria) this;
        }

        public Criteria andLocationnameNotIn(List<String> values) {
            addCriterion("LocationName not in", values, "locationname");
            return (Criteria) this;
        }

        public Criteria andLocationnameBetween(String value1, String value2) {
            addCriterion("LocationName between", value1, value2, "locationname");
            return (Criteria) this;
        }

        public Criteria andLocationnameNotBetween(String value1, String value2) {
            addCriterion("LocationName not between", value1, value2, "locationname");
            return (Criteria) this;
        }

        public Criteria andHitshelvesmanIsNull() {
            addCriterion("HitShelvesMan is null");
            return (Criteria) this;
        }

        public Criteria andHitshelvesmanIsNotNull() {
            addCriterion("HitShelvesMan is not null");
            return (Criteria) this;
        }

        public Criteria andHitshelvesmanEqualTo(String value) {
            addCriterion("HitShelvesMan =", value, "hitshelvesman");
            return (Criteria) this;
        }

        public Criteria andHitshelvesmanNotEqualTo(String value) {
            addCriterion("HitShelvesMan <>", value, "hitshelvesman");
            return (Criteria) this;
        }

        public Criteria andHitshelvesmanGreaterThan(String value) {
            addCriterion("HitShelvesMan >", value, "hitshelvesman");
            return (Criteria) this;
        }

        public Criteria andHitshelvesmanGreaterThanOrEqualTo(String value) {
            addCriterion("HitShelvesMan >=", value, "hitshelvesman");
            return (Criteria) this;
        }

        public Criteria andHitshelvesmanLessThan(String value) {
            addCriterion("HitShelvesMan <", value, "hitshelvesman");
            return (Criteria) this;
        }

        public Criteria andHitshelvesmanLessThanOrEqualTo(String value) {
            addCriterion("HitShelvesMan <=", value, "hitshelvesman");
            return (Criteria) this;
        }

        public Criteria andHitshelvesmanLike(String value) {
            addCriterion("HitShelvesMan like", value, "hitshelvesman");
            return (Criteria) this;
        }

        public Criteria andHitshelvesmanNotLike(String value) {
            addCriterion("HitShelvesMan not like", value, "hitshelvesman");
            return (Criteria) this;
        }

        public Criteria andHitshelvesmanIn(List<String> values) {
            addCriterion("HitShelvesMan in", values, "hitshelvesman");
            return (Criteria) this;
        }

        public Criteria andHitshelvesmanNotIn(List<String> values) {
            addCriterion("HitShelvesMan not in", values, "hitshelvesman");
            return (Criteria) this;
        }

        public Criteria andHitshelvesmanBetween(String value1, String value2) {
            addCriterion("HitShelvesMan between", value1, value2, "hitshelvesman");
            return (Criteria) this;
        }

        public Criteria andHitshelvesmanNotBetween(String value1, String value2) {
            addCriterion("HitShelvesMan not between", value1, value2, "hitshelvesman");
            return (Criteria) this;
        }

        public Criteria andHitshelvesremarkIsNull() {
            addCriterion("HitShelvesRemark is null");
            return (Criteria) this;
        }

        public Criteria andHitshelvesremarkIsNotNull() {
            addCriterion("HitShelvesRemark is not null");
            return (Criteria) this;
        }

        public Criteria andHitshelvesremarkEqualTo(String value) {
            addCriterion("HitShelvesRemark =", value, "hitshelvesremark");
            return (Criteria) this;
        }

        public Criteria andHitshelvesremarkNotEqualTo(String value) {
            addCriterion("HitShelvesRemark <>", value, "hitshelvesremark");
            return (Criteria) this;
        }

        public Criteria andHitshelvesremarkGreaterThan(String value) {
            addCriterion("HitShelvesRemark >", value, "hitshelvesremark");
            return (Criteria) this;
        }

        public Criteria andHitshelvesremarkGreaterThanOrEqualTo(String value) {
            addCriterion("HitShelvesRemark >=", value, "hitshelvesremark");
            return (Criteria) this;
        }

        public Criteria andHitshelvesremarkLessThan(String value) {
            addCriterion("HitShelvesRemark <", value, "hitshelvesremark");
            return (Criteria) this;
        }

        public Criteria andHitshelvesremarkLessThanOrEqualTo(String value) {
            addCriterion("HitShelvesRemark <=", value, "hitshelvesremark");
            return (Criteria) this;
        }

        public Criteria andHitshelvesremarkLike(String value) {
            addCriterion("HitShelvesRemark like", value, "hitshelvesremark");
            return (Criteria) this;
        }

        public Criteria andHitshelvesremarkNotLike(String value) {
            addCriterion("HitShelvesRemark not like", value, "hitshelvesremark");
            return (Criteria) this;
        }

        public Criteria andHitshelvesremarkIn(List<String> values) {
            addCriterion("HitShelvesRemark in", values, "hitshelvesremark");
            return (Criteria) this;
        }

        public Criteria andHitshelvesremarkNotIn(List<String> values) {
            addCriterion("HitShelvesRemark not in", values, "hitshelvesremark");
            return (Criteria) this;
        }

        public Criteria andHitshelvesremarkBetween(String value1, String value2) {
            addCriterion("HitShelvesRemark between", value1, value2, "hitshelvesremark");
            return (Criteria) this;
        }

        public Criteria andHitshelvesremarkNotBetween(String value1, String value2) {
            addCriterion("HitShelvesRemark not between", value1, value2, "hitshelvesremark");
            return (Criteria) this;
        }

        public Criteria andHitshelvesdateIsNull() {
            addCriterion("HitShelvesDate is null");
            return (Criteria) this;
        }

        public Criteria andHitshelvesdateIsNotNull() {
            addCriterion("HitShelvesDate is not null");
            return (Criteria) this;
        }

        public Criteria andHitshelvesdateEqualTo(Date value) {
            addCriterion("HitShelvesDate =", value, "hitshelvesdate");
            return (Criteria) this;
        }

        public Criteria andHitshelvesdateNotEqualTo(Date value) {
            addCriterion("HitShelvesDate <>", value, "hitshelvesdate");
            return (Criteria) this;
        }

        public Criteria andHitshelvesdateGreaterThan(Date value) {
            addCriterion("HitShelvesDate >", value, "hitshelvesdate");
            return (Criteria) this;
        }

        public Criteria andHitshelvesdateGreaterThanOrEqualTo(Date value) {
            addCriterion("HitShelvesDate >=", value, "hitshelvesdate");
            return (Criteria) this;
        }

        public Criteria andHitshelvesdateLessThan(Date value) {
            addCriterion("HitShelvesDate <", value, "hitshelvesdate");
            return (Criteria) this;
        }

        public Criteria andHitshelvesdateLessThanOrEqualTo(Date value) {
            addCriterion("HitShelvesDate <=", value, "hitshelvesdate");
            return (Criteria) this;
        }

        public Criteria andHitshelvesdateIn(List<Date> values) {
            addCriterion("HitShelvesDate in", values, "hitshelvesdate");
            return (Criteria) this;
        }

        public Criteria andHitshelvesdateNotIn(List<Date> values) {
            addCriterion("HitShelvesDate not in", values, "hitshelvesdate");
            return (Criteria) this;
        }

        public Criteria andHitshelvesdateBetween(Date value1, Date value2) {
            addCriterion("HitShelvesDate between", value1, value2, "hitshelvesdate");
            return (Criteria) this;
        }

        public Criteria andHitshelvesdateNotBetween(Date value1, Date value2) {
            addCriterion("HitShelvesDate not between", value1, value2, "hitshelvesdate");
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
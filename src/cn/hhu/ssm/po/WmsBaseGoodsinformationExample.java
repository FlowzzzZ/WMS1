package cn.hhu.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WmsBaseGoodsinformationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WmsBaseGoodsinformationExample() {
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

        public Criteria andGoodsinformationIdIsNull() {
            addCriterion("GoodsInformation_ID is null");
            return (Criteria) this;
        }

        public Criteria andGoodsinformationIdIsNotNull() {
            addCriterion("GoodsInformation_ID is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsinformationIdEqualTo(Integer value) {
            addCriterion("GoodsInformation_ID =", value, "goodsinformationId");
            return (Criteria) this;
        }

        public Criteria andGoodsinformationIdNotEqualTo(Integer value) {
            addCriterion("GoodsInformation_ID <>", value, "goodsinformationId");
            return (Criteria) this;
        }

        public Criteria andGoodsinformationIdGreaterThan(Integer value) {
            addCriterion("GoodsInformation_ID >", value, "goodsinformationId");
            return (Criteria) this;
        }

        public Criteria andGoodsinformationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("GoodsInformation_ID >=", value, "goodsinformationId");
            return (Criteria) this;
        }

        public Criteria andGoodsinformationIdLessThan(Integer value) {
            addCriterion("GoodsInformation_ID <", value, "goodsinformationId");
            return (Criteria) this;
        }

        public Criteria andGoodsinformationIdLessThanOrEqualTo(Integer value) {
            addCriterion("GoodsInformation_ID <=", value, "goodsinformationId");
            return (Criteria) this;
        }

        public Criteria andGoodsinformationIdIn(List<Integer> values) {
            addCriterion("GoodsInformation_ID in", values, "goodsinformationId");
            return (Criteria) this;
        }

        public Criteria andGoodsinformationIdNotIn(List<Integer> values) {
            addCriterion("GoodsInformation_ID not in", values, "goodsinformationId");
            return (Criteria) this;
        }

        public Criteria andGoodsinformationIdBetween(Integer value1, Integer value2) {
            addCriterion("GoodsInformation_ID between", value1, value2, "goodsinformationId");
            return (Criteria) this;
        }

        public Criteria andGoodsinformationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("GoodsInformation_ID not between", value1, value2, "goodsinformationId");
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

        public Criteria andShipperIdEqualTo(Integer value) {
            addCriterion("Shipper_ID =", value, "shipperId");
            return (Criteria) this;
        }

        public Criteria andShipperIdNotEqualTo(Integer value) {
            addCriterion("Shipper_ID <>", value, "shipperId");
            return (Criteria) this;
        }

        public Criteria andShipperIdGreaterThan(Integer value) {
            addCriterion("Shipper_ID >", value, "shipperId");
            return (Criteria) this;
        }

        public Criteria andShipperIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Shipper_ID >=", value, "shipperId");
            return (Criteria) this;
        }

        public Criteria andShipperIdLessThan(Integer value) {
            addCriterion("Shipper_ID <", value, "shipperId");
            return (Criteria) this;
        }

        public Criteria andShipperIdLessThanOrEqualTo(Integer value) {
            addCriterion("Shipper_ID <=", value, "shipperId");
            return (Criteria) this;
        }

        public Criteria andShipperIdIn(List<Integer> values) {
            addCriterion("Shipper_ID in", values, "shipperId");
            return (Criteria) this;
        }

        public Criteria andShipperIdNotIn(List<Integer> values) {
            addCriterion("Shipper_ID not in", values, "shipperId");
            return (Criteria) this;
        }

        public Criteria andShipperIdBetween(Integer value1, Integer value2) {
            addCriterion("Shipper_ID between", value1, value2, "shipperId");
            return (Criteria) this;
        }

        public Criteria andShipperIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Shipper_ID not between", value1, value2, "shipperId");
            return (Criteria) this;
        }

        public Criteria andShipperauthorizationIdIsNull() {
            addCriterion("ShipperAuthorization_ID is null");
            return (Criteria) this;
        }

        public Criteria andShipperauthorizationIdIsNotNull() {
            addCriterion("ShipperAuthorization_ID is not null");
            return (Criteria) this;
        }

        public Criteria andShipperauthorizationIdEqualTo(Integer value) {
            addCriterion("ShipperAuthorization_ID =", value, "shipperauthorizationId");
            return (Criteria) this;
        }

        public Criteria andShipperauthorizationIdNotEqualTo(Integer value) {
            addCriterion("ShipperAuthorization_ID <>", value, "shipperauthorizationId");
            return (Criteria) this;
        }

        public Criteria andShipperauthorizationIdGreaterThan(Integer value) {
            addCriterion("ShipperAuthorization_ID >", value, "shipperauthorizationId");
            return (Criteria) this;
        }

        public Criteria andShipperauthorizationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ShipperAuthorization_ID >=", value, "shipperauthorizationId");
            return (Criteria) this;
        }

        public Criteria andShipperauthorizationIdLessThan(Integer value) {
            addCriterion("ShipperAuthorization_ID <", value, "shipperauthorizationId");
            return (Criteria) this;
        }

        public Criteria andShipperauthorizationIdLessThanOrEqualTo(Integer value) {
            addCriterion("ShipperAuthorization_ID <=", value, "shipperauthorizationId");
            return (Criteria) this;
        }

        public Criteria andShipperauthorizationIdIn(List<Integer> values) {
            addCriterion("ShipperAuthorization_ID in", values, "shipperauthorizationId");
            return (Criteria) this;
        }

        public Criteria andShipperauthorizationIdNotIn(List<Integer> values) {
            addCriterion("ShipperAuthorization_ID not in", values, "shipperauthorizationId");
            return (Criteria) this;
        }

        public Criteria andShipperauthorizationIdBetween(Integer value1, Integer value2) {
            addCriterion("ShipperAuthorization_ID between", value1, value2, "shipperauthorizationId");
            return (Criteria) this;
        }

        public Criteria andShipperauthorizationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ShipperAuthorization_ID not between", value1, value2, "shipperauthorizationId");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberIsNull() {
            addCriterion("Goods_Number is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberIsNotNull() {
            addCriterion("Goods_Number is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberEqualTo(String value) {
            addCriterion("Goods_Number =", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberNotEqualTo(String value) {
            addCriterion("Goods_Number <>", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberGreaterThan(String value) {
            addCriterion("Goods_Number >", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberGreaterThanOrEqualTo(String value) {
            addCriterion("Goods_Number >=", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberLessThan(String value) {
            addCriterion("Goods_Number <", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberLessThanOrEqualTo(String value) {
            addCriterion("Goods_Number <=", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberLike(String value) {
            addCriterion("Goods_Number like", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberNotLike(String value) {
            addCriterion("Goods_Number not like", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberIn(List<String> values) {
            addCriterion("Goods_Number in", values, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberNotIn(List<String> values) {
            addCriterion("Goods_Number not in", values, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberBetween(String value1, String value2) {
            addCriterion("Goods_Number between", value1, value2, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberNotBetween(String value1, String value2) {
            addCriterion("Goods_Number not between", value1, value2, "goodsNumber");
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

        public Criteria andRegistrationIdIsNull() {
            addCriterion("Registration_ID is null");
            return (Criteria) this;
        }

        public Criteria andRegistrationIdIsNotNull() {
            addCriterion("Registration_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrationIdEqualTo(Integer value) {
            addCriterion("Registration_ID =", value, "registrationId");
            return (Criteria) this;
        }

        public Criteria andRegistrationIdNotEqualTo(Integer value) {
            addCriterion("Registration_ID <>", value, "registrationId");
            return (Criteria) this;
        }

        public Criteria andRegistrationIdGreaterThan(Integer value) {
            addCriterion("Registration_ID >", value, "registrationId");
            return (Criteria) this;
        }

        public Criteria andRegistrationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Registration_ID >=", value, "registrationId");
            return (Criteria) this;
        }

        public Criteria andRegistrationIdLessThan(Integer value) {
            addCriterion("Registration_ID <", value, "registrationId");
            return (Criteria) this;
        }

        public Criteria andRegistrationIdLessThanOrEqualTo(Integer value) {
            addCriterion("Registration_ID <=", value, "registrationId");
            return (Criteria) this;
        }

        public Criteria andRegistrationIdIn(List<Integer> values) {
            addCriterion("Registration_ID in", values, "registrationId");
            return (Criteria) this;
        }

        public Criteria andRegistrationIdNotIn(List<Integer> values) {
            addCriterion("Registration_ID not in", values, "registrationId");
            return (Criteria) this;
        }

        public Criteria andRegistrationIdBetween(Integer value1, Integer value2) {
            addCriterion("Registration_ID between", value1, value2, "registrationId");
            return (Criteria) this;
        }

        public Criteria andRegistrationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Registration_ID not between", value1, value2, "registrationId");
            return (Criteria) this;
        }

        public Criteria andRegistrationcodeIsNull() {
            addCriterion("RegistrationCode is null");
            return (Criteria) this;
        }

        public Criteria andRegistrationcodeIsNotNull() {
            addCriterion("RegistrationCode is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrationcodeEqualTo(String value) {
            addCriterion("RegistrationCode =", value, "registrationcode");
            return (Criteria) this;
        }

        public Criteria andRegistrationcodeNotEqualTo(String value) {
            addCriterion("RegistrationCode <>", value, "registrationcode");
            return (Criteria) this;
        }

        public Criteria andRegistrationcodeGreaterThan(String value) {
            addCriterion("RegistrationCode >", value, "registrationcode");
            return (Criteria) this;
        }

        public Criteria andRegistrationcodeGreaterThanOrEqualTo(String value) {
            addCriterion("RegistrationCode >=", value, "registrationcode");
            return (Criteria) this;
        }

        public Criteria andRegistrationcodeLessThan(String value) {
            addCriterion("RegistrationCode <", value, "registrationcode");
            return (Criteria) this;
        }

        public Criteria andRegistrationcodeLessThanOrEqualTo(String value) {
            addCriterion("RegistrationCode <=", value, "registrationcode");
            return (Criteria) this;
        }

        public Criteria andRegistrationcodeLike(String value) {
            addCriterion("RegistrationCode like", value, "registrationcode");
            return (Criteria) this;
        }

        public Criteria andRegistrationcodeNotLike(String value) {
            addCriterion("RegistrationCode not like", value, "registrationcode");
            return (Criteria) this;
        }

        public Criteria andRegistrationcodeIn(List<String> values) {
            addCriterion("RegistrationCode in", values, "registrationcode");
            return (Criteria) this;
        }

        public Criteria andRegistrationcodeNotIn(List<String> values) {
            addCriterion("RegistrationCode not in", values, "registrationcode");
            return (Criteria) this;
        }

        public Criteria andRegistrationcodeBetween(String value1, String value2) {
            addCriterion("RegistrationCode between", value1, value2, "registrationcode");
            return (Criteria) this;
        }

        public Criteria andRegistrationcodeNotBetween(String value1, String value2) {
            addCriterion("RegistrationCode not between", value1, value2, "registrationcode");
            return (Criteria) this;
        }

        public Criteria andSpecifiationIsNull() {
            addCriterion("Specifiation is null");
            return (Criteria) this;
        }

        public Criteria andSpecifiationIsNotNull() {
            addCriterion("Specifiation is not null");
            return (Criteria) this;
        }

        public Criteria andSpecifiationEqualTo(String value) {
            addCriterion("Specifiation =", value, "specifiation");
            return (Criteria) this;
        }

        public Criteria andSpecifiationNotEqualTo(String value) {
            addCriterion("Specifiation <>", value, "specifiation");
            return (Criteria) this;
        }

        public Criteria andSpecifiationGreaterThan(String value) {
            addCriterion("Specifiation >", value, "specifiation");
            return (Criteria) this;
        }

        public Criteria andSpecifiationGreaterThanOrEqualTo(String value) {
            addCriterion("Specifiation >=", value, "specifiation");
            return (Criteria) this;
        }

        public Criteria andSpecifiationLessThan(String value) {
            addCriterion("Specifiation <", value, "specifiation");
            return (Criteria) this;
        }

        public Criteria andSpecifiationLessThanOrEqualTo(String value) {
            addCriterion("Specifiation <=", value, "specifiation");
            return (Criteria) this;
        }

        public Criteria andSpecifiationLike(String value) {
            addCriterion("Specifiation like", value, "specifiation");
            return (Criteria) this;
        }

        public Criteria andSpecifiationNotLike(String value) {
            addCriterion("Specifiation not like", value, "specifiation");
            return (Criteria) this;
        }

        public Criteria andSpecifiationIn(List<String> values) {
            addCriterion("Specifiation in", values, "specifiation");
            return (Criteria) this;
        }

        public Criteria andSpecifiationNotIn(List<String> values) {
            addCriterion("Specifiation not in", values, "specifiation");
            return (Criteria) this;
        }

        public Criteria andSpecifiationBetween(String value1, String value2) {
            addCriterion("Specifiation between", value1, value2, "specifiation");
            return (Criteria) this;
        }

        public Criteria andSpecifiationNotBetween(String value1, String value2) {
            addCriterion("Specifiation not between", value1, value2, "specifiation");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("Type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("Type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("Type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("Type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("Type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("Type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("Type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("Type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("Type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("Type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("Type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("Type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("Type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("Type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andUnitIsNull() {
            addCriterion("Unit is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("Unit is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("Unit =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("Unit <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("Unit >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("Unit >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("Unit <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("Unit <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("Unit like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("Unit not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("Unit in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("Unit not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("Unit between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("Unit not between", value1, value2, "unit");
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

        public Criteria andLengthIsNull() {
            addCriterion("Length is null");
            return (Criteria) this;
        }

        public Criteria andLengthIsNotNull() {
            addCriterion("Length is not null");
            return (Criteria) this;
        }

        public Criteria andLengthEqualTo(Float value) {
            addCriterion("Length =", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotEqualTo(Float value) {
            addCriterion("Length <>", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthGreaterThan(Float value) {
            addCriterion("Length >", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthGreaterThanOrEqualTo(Float value) {
            addCriterion("Length >=", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthLessThan(Float value) {
            addCriterion("Length <", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthLessThanOrEqualTo(Float value) {
            addCriterion("Length <=", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthIn(List<Float> values) {
            addCriterion("Length in", values, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotIn(List<Float> values) {
            addCriterion("Length not in", values, "length");
            return (Criteria) this;
        }

        public Criteria andLengthBetween(Float value1, Float value2) {
            addCriterion("Length between", value1, value2, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotBetween(Float value1, Float value2) {
            addCriterion("Length not between", value1, value2, "length");
            return (Criteria) this;
        }

        public Criteria andWidthIsNull() {
            addCriterion("Width is null");
            return (Criteria) this;
        }

        public Criteria andWidthIsNotNull() {
            addCriterion("Width is not null");
            return (Criteria) this;
        }

        public Criteria andWidthEqualTo(Float value) {
            addCriterion("Width =", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotEqualTo(Float value) {
            addCriterion("Width <>", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthGreaterThan(Float value) {
            addCriterion("Width >", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthGreaterThanOrEqualTo(Float value) {
            addCriterion("Width >=", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthLessThan(Float value) {
            addCriterion("Width <", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthLessThanOrEqualTo(Float value) {
            addCriterion("Width <=", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthIn(List<Float> values) {
            addCriterion("Width in", values, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotIn(List<Float> values) {
            addCriterion("Width not in", values, "width");
            return (Criteria) this;
        }

        public Criteria andWidthBetween(Float value1, Float value2) {
            addCriterion("Width between", value1, value2, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotBetween(Float value1, Float value2) {
            addCriterion("Width not between", value1, value2, "width");
            return (Criteria) this;
        }

        public Criteria andHighIsNull() {
            addCriterion("High is null");
            return (Criteria) this;
        }

        public Criteria andHighIsNotNull() {
            addCriterion("High is not null");
            return (Criteria) this;
        }

        public Criteria andHighEqualTo(Float value) {
            addCriterion("High =", value, "high");
            return (Criteria) this;
        }

        public Criteria andHighNotEqualTo(Float value) {
            addCriterion("High <>", value, "high");
            return (Criteria) this;
        }

        public Criteria andHighGreaterThan(Float value) {
            addCriterion("High >", value, "high");
            return (Criteria) this;
        }

        public Criteria andHighGreaterThanOrEqualTo(Float value) {
            addCriterion("High >=", value, "high");
            return (Criteria) this;
        }

        public Criteria andHighLessThan(Float value) {
            addCriterion("High <", value, "high");
            return (Criteria) this;
        }

        public Criteria andHighLessThanOrEqualTo(Float value) {
            addCriterion("High <=", value, "high");
            return (Criteria) this;
        }

        public Criteria andHighIn(List<Float> values) {
            addCriterion("High in", values, "high");
            return (Criteria) this;
        }

        public Criteria andHighNotIn(List<Float> values) {
            addCriterion("High not in", values, "high");
            return (Criteria) this;
        }

        public Criteria andHighBetween(Float value1, Float value2) {
            addCriterion("High between", value1, value2, "high");
            return (Criteria) this;
        }

        public Criteria andHighNotBetween(Float value1, Float value2) {
            addCriterion("High not between", value1, value2, "high");
            return (Criteria) this;
        }

        public Criteria andProductlineIsNull() {
            addCriterion("ProductLine is null");
            return (Criteria) this;
        }

        public Criteria andProductlineIsNotNull() {
            addCriterion("ProductLine is not null");
            return (Criteria) this;
        }

        public Criteria andProductlineEqualTo(Integer value) {
            addCriterion("ProductLine =", value, "productline");
            return (Criteria) this;
        }

        public Criteria andProductlineNotEqualTo(Integer value) {
            addCriterion("ProductLine <>", value, "productline");
            return (Criteria) this;
        }

        public Criteria andProductlineGreaterThan(Integer value) {
            addCriterion("ProductLine >", value, "productline");
            return (Criteria) this;
        }

        public Criteria andProductlineGreaterThanOrEqualTo(Integer value) {
            addCriterion("ProductLine >=", value, "productline");
            return (Criteria) this;
        }

        public Criteria andProductlineLessThan(Integer value) {
            addCriterion("ProductLine <", value, "productline");
            return (Criteria) this;
        }

        public Criteria andProductlineLessThanOrEqualTo(Integer value) {
            addCriterion("ProductLine <=", value, "productline");
            return (Criteria) this;
        }

        public Criteria andProductlineIn(List<Integer> values) {
            addCriterion("ProductLine in", values, "productline");
            return (Criteria) this;
        }

        public Criteria andProductlineNotIn(List<Integer> values) {
            addCriterion("ProductLine not in", values, "productline");
            return (Criteria) this;
        }

        public Criteria andProductlineBetween(Integer value1, Integer value2) {
            addCriterion("ProductLine between", value1, value2, "productline");
            return (Criteria) this;
        }

        public Criteria andProductlineNotBetween(Integer value1, Integer value2) {
            addCriterion("ProductLine not between", value1, value2, "productline");
            return (Criteria) this;
        }

        public Criteria andCatalogIdIsNull() {
            addCriterion("Catalog_ID is null");
            return (Criteria) this;
        }

        public Criteria andCatalogIdIsNotNull() {
            addCriterion("Catalog_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCatalogIdEqualTo(Integer value) {
            addCriterion("Catalog_ID =", value, "catalogId");
            return (Criteria) this;
        }

        public Criteria andCatalogIdNotEqualTo(Integer value) {
            addCriterion("Catalog_ID <>", value, "catalogId");
            return (Criteria) this;
        }

        public Criteria andCatalogIdGreaterThan(Integer value) {
            addCriterion("Catalog_ID >", value, "catalogId");
            return (Criteria) this;
        }

        public Criteria andCatalogIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Catalog_ID >=", value, "catalogId");
            return (Criteria) this;
        }

        public Criteria andCatalogIdLessThan(Integer value) {
            addCriterion("Catalog_ID <", value, "catalogId");
            return (Criteria) this;
        }

        public Criteria andCatalogIdLessThanOrEqualTo(Integer value) {
            addCriterion("Catalog_ID <=", value, "catalogId");
            return (Criteria) this;
        }

        public Criteria andCatalogIdIn(List<Integer> values) {
            addCriterion("Catalog_ID in", values, "catalogId");
            return (Criteria) this;
        }

        public Criteria andCatalogIdNotIn(List<Integer> values) {
            addCriterion("Catalog_ID not in", values, "catalogId");
            return (Criteria) this;
        }

        public Criteria andCatalogIdBetween(Integer value1, Integer value2) {
            addCriterion("Catalog_ID between", value1, value2, "catalogId");
            return (Criteria) this;
        }

        public Criteria andCatalogIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Catalog_ID not between", value1, value2, "catalogId");
            return (Criteria) this;
        }

        public Criteria andManageclassificationIsNull() {
            addCriterion("ManageClassification is null");
            return (Criteria) this;
        }

        public Criteria andManageclassificationIsNotNull() {
            addCriterion("ManageClassification is not null");
            return (Criteria) this;
        }

        public Criteria andManageclassificationEqualTo(Integer value) {
            addCriterion("ManageClassification =", value, "manageclassification");
            return (Criteria) this;
        }

        public Criteria andManageclassificationNotEqualTo(Integer value) {
            addCriterion("ManageClassification <>", value, "manageclassification");
            return (Criteria) this;
        }

        public Criteria andManageclassificationGreaterThan(Integer value) {
            addCriterion("ManageClassification >", value, "manageclassification");
            return (Criteria) this;
        }

        public Criteria andManageclassificationGreaterThanOrEqualTo(Integer value) {
            addCriterion("ManageClassification >=", value, "manageclassification");
            return (Criteria) this;
        }

        public Criteria andManageclassificationLessThan(Integer value) {
            addCriterion("ManageClassification <", value, "manageclassification");
            return (Criteria) this;
        }

        public Criteria andManageclassificationLessThanOrEqualTo(Integer value) {
            addCriterion("ManageClassification <=", value, "manageclassification");
            return (Criteria) this;
        }

        public Criteria andManageclassificationIn(List<Integer> values) {
            addCriterion("ManageClassification in", values, "manageclassification");
            return (Criteria) this;
        }

        public Criteria andManageclassificationNotIn(List<Integer> values) {
            addCriterion("ManageClassification not in", values, "manageclassification");
            return (Criteria) this;
        }

        public Criteria andManageclassificationBetween(Integer value1, Integer value2) {
            addCriterion("ManageClassification between", value1, value2, "manageclassification");
            return (Criteria) this;
        }

        public Criteria andManageclassificationNotBetween(Integer value1, Integer value2) {
            addCriterion("ManageClassification not between", value1, value2, "manageclassification");
            return (Criteria) this;
        }

        public Criteria andPackagingrequirementIsNull() {
            addCriterion("PackagingRequirement is null");
            return (Criteria) this;
        }

        public Criteria andPackagingrequirementIsNotNull() {
            addCriterion("PackagingRequirement is not null");
            return (Criteria) this;
        }

        public Criteria andPackagingrequirementEqualTo(String value) {
            addCriterion("PackagingRequirement =", value, "packagingrequirement");
            return (Criteria) this;
        }

        public Criteria andPackagingrequirementNotEqualTo(String value) {
            addCriterion("PackagingRequirement <>", value, "packagingrequirement");
            return (Criteria) this;
        }

        public Criteria andPackagingrequirementGreaterThan(String value) {
            addCriterion("PackagingRequirement >", value, "packagingrequirement");
            return (Criteria) this;
        }

        public Criteria andPackagingrequirementGreaterThanOrEqualTo(String value) {
            addCriterion("PackagingRequirement >=", value, "packagingrequirement");
            return (Criteria) this;
        }

        public Criteria andPackagingrequirementLessThan(String value) {
            addCriterion("PackagingRequirement <", value, "packagingrequirement");
            return (Criteria) this;
        }

        public Criteria andPackagingrequirementLessThanOrEqualTo(String value) {
            addCriterion("PackagingRequirement <=", value, "packagingrequirement");
            return (Criteria) this;
        }

        public Criteria andPackagingrequirementLike(String value) {
            addCriterion("PackagingRequirement like", value, "packagingrequirement");
            return (Criteria) this;
        }

        public Criteria andPackagingrequirementNotLike(String value) {
            addCriterion("PackagingRequirement not like", value, "packagingrequirement");
            return (Criteria) this;
        }

        public Criteria andPackagingrequirementIn(List<String> values) {
            addCriterion("PackagingRequirement in", values, "packagingrequirement");
            return (Criteria) this;
        }

        public Criteria andPackagingrequirementNotIn(List<String> values) {
            addCriterion("PackagingRequirement not in", values, "packagingrequirement");
            return (Criteria) this;
        }

        public Criteria andPackagingrequirementBetween(String value1, String value2) {
            addCriterion("PackagingRequirement between", value1, value2, "packagingrequirement");
            return (Criteria) this;
        }

        public Criteria andPackagingrequirementNotBetween(String value1, String value2) {
            addCriterion("PackagingRequirement not between", value1, value2, "packagingrequirement");
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

        public Criteria andProducerIdIsNull() {
            addCriterion("Producer_ID is null");
            return (Criteria) this;
        }

        public Criteria andProducerIdIsNotNull() {
            addCriterion("Producer_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProducerIdEqualTo(Integer value) {
            addCriterion("Producer_ID =", value, "producerId");
            return (Criteria) this;
        }

        public Criteria andProducerIdNotEqualTo(Integer value) {
            addCriterion("Producer_ID <>", value, "producerId");
            return (Criteria) this;
        }

        public Criteria andProducerIdGreaterThan(Integer value) {
            addCriterion("Producer_ID >", value, "producerId");
            return (Criteria) this;
        }

        public Criteria andProducerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Producer_ID >=", value, "producerId");
            return (Criteria) this;
        }

        public Criteria andProducerIdLessThan(Integer value) {
            addCriterion("Producer_ID <", value, "producerId");
            return (Criteria) this;
        }

        public Criteria andProducerIdLessThanOrEqualTo(Integer value) {
            addCriterion("Producer_ID <=", value, "producerId");
            return (Criteria) this;
        }

        public Criteria andProducerIdIn(List<Integer> values) {
            addCriterion("Producer_ID in", values, "producerId");
            return (Criteria) this;
        }

        public Criteria andProducerIdNotIn(List<Integer> values) {
            addCriterion("Producer_ID not in", values, "producerId");
            return (Criteria) this;
        }

        public Criteria andProducerIdBetween(Integer value1, Integer value2) {
            addCriterion("Producer_ID between", value1, value2, "producerId");
            return (Criteria) this;
        }

        public Criteria andProducerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Producer_ID not between", value1, value2, "producerId");
            return (Criteria) this;
        }

        public Criteria andProducerNameIsNull() {
            addCriterion("Producer_Name is null");
            return (Criteria) this;
        }

        public Criteria andProducerNameIsNotNull() {
            addCriterion("Producer_Name is not null");
            return (Criteria) this;
        }

        public Criteria andProducerNameEqualTo(String value) {
            addCriterion("Producer_Name =", value, "producerName");
            return (Criteria) this;
        }

        public Criteria andProducerNameNotEqualTo(String value) {
            addCriterion("Producer_Name <>", value, "producerName");
            return (Criteria) this;
        }

        public Criteria andProducerNameGreaterThan(String value) {
            addCriterion("Producer_Name >", value, "producerName");
            return (Criteria) this;
        }

        public Criteria andProducerNameGreaterThanOrEqualTo(String value) {
            addCriterion("Producer_Name >=", value, "producerName");
            return (Criteria) this;
        }

        public Criteria andProducerNameLessThan(String value) {
            addCriterion("Producer_Name <", value, "producerName");
            return (Criteria) this;
        }

        public Criteria andProducerNameLessThanOrEqualTo(String value) {
            addCriterion("Producer_Name <=", value, "producerName");
            return (Criteria) this;
        }

        public Criteria andProducerNameLike(String value) {
            addCriterion("Producer_Name like", value, "producerName");
            return (Criteria) this;
        }

        public Criteria andProducerNameNotLike(String value) {
            addCriterion("Producer_Name not like", value, "producerName");
            return (Criteria) this;
        }

        public Criteria andProducerNameIn(List<String> values) {
            addCriterion("Producer_Name in", values, "producerName");
            return (Criteria) this;
        }

        public Criteria andProducerNameNotIn(List<String> values) {
            addCriterion("Producer_Name not in", values, "producerName");
            return (Criteria) this;
        }

        public Criteria andProducerNameBetween(String value1, String value2) {
            addCriterion("Producer_Name between", value1, value2, "producerName");
            return (Criteria) this;
        }

        public Criteria andProducerNameNotBetween(String value1, String value2) {
            addCriterion("Producer_Name not between", value1, value2, "producerName");
            return (Criteria) this;
        }

        public Criteria andSuppliersIdIsNull() {
            addCriterion("Suppliers_ID is null");
            return (Criteria) this;
        }

        public Criteria andSuppliersIdIsNotNull() {
            addCriterion("Suppliers_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSuppliersIdEqualTo(Integer value) {
            addCriterion("Suppliers_ID =", value, "suppliersId");
            return (Criteria) this;
        }

        public Criteria andSuppliersIdNotEqualTo(Integer value) {
            addCriterion("Suppliers_ID <>", value, "suppliersId");
            return (Criteria) this;
        }

        public Criteria andSuppliersIdGreaterThan(Integer value) {
            addCriterion("Suppliers_ID >", value, "suppliersId");
            return (Criteria) this;
        }

        public Criteria andSuppliersIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Suppliers_ID >=", value, "suppliersId");
            return (Criteria) this;
        }

        public Criteria andSuppliersIdLessThan(Integer value) {
            addCriterion("Suppliers_ID <", value, "suppliersId");
            return (Criteria) this;
        }

        public Criteria andSuppliersIdLessThanOrEqualTo(Integer value) {
            addCriterion("Suppliers_ID <=", value, "suppliersId");
            return (Criteria) this;
        }

        public Criteria andSuppliersIdIn(List<Integer> values) {
            addCriterion("Suppliers_ID in", values, "suppliersId");
            return (Criteria) this;
        }

        public Criteria andSuppliersIdNotIn(List<Integer> values) {
            addCriterion("Suppliers_ID not in", values, "suppliersId");
            return (Criteria) this;
        }

        public Criteria andSuppliersIdBetween(Integer value1, Integer value2) {
            addCriterion("Suppliers_ID between", value1, value2, "suppliersId");
            return (Criteria) this;
        }

        public Criteria andSuppliersIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Suppliers_ID not between", value1, value2, "suppliersId");
            return (Criteria) this;
        }

        public Criteria andSuppliersauthorizationIdIsNull() {
            addCriterion("SuppliersAuthorization_ID is null");
            return (Criteria) this;
        }

        public Criteria andSuppliersauthorizationIdIsNotNull() {
            addCriterion("SuppliersAuthorization_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSuppliersauthorizationIdEqualTo(Integer value) {
            addCriterion("SuppliersAuthorization_ID =", value, "suppliersauthorizationId");
            return (Criteria) this;
        }

        public Criteria andSuppliersauthorizationIdNotEqualTo(Integer value) {
            addCriterion("SuppliersAuthorization_ID <>", value, "suppliersauthorizationId");
            return (Criteria) this;
        }

        public Criteria andSuppliersauthorizationIdGreaterThan(Integer value) {
            addCriterion("SuppliersAuthorization_ID >", value, "suppliersauthorizationId");
            return (Criteria) this;
        }

        public Criteria andSuppliersauthorizationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SuppliersAuthorization_ID >=", value, "suppliersauthorizationId");
            return (Criteria) this;
        }

        public Criteria andSuppliersauthorizationIdLessThan(Integer value) {
            addCriterion("SuppliersAuthorization_ID <", value, "suppliersauthorizationId");
            return (Criteria) this;
        }

        public Criteria andSuppliersauthorizationIdLessThanOrEqualTo(Integer value) {
            addCriterion("SuppliersAuthorization_ID <=", value, "suppliersauthorizationId");
            return (Criteria) this;
        }

        public Criteria andSuppliersauthorizationIdIn(List<Integer> values) {
            addCriterion("SuppliersAuthorization_ID in", values, "suppliersauthorizationId");
            return (Criteria) this;
        }

        public Criteria andSuppliersauthorizationIdNotIn(List<Integer> values) {
            addCriterion("SuppliersAuthorization_ID not in", values, "suppliersauthorizationId");
            return (Criteria) this;
        }

        public Criteria andSuppliersauthorizationIdBetween(Integer value1, Integer value2) {
            addCriterion("SuppliersAuthorization_ID between", value1, value2, "suppliersauthorizationId");
            return (Criteria) this;
        }

        public Criteria andSuppliersauthorizationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SuppliersAuthorization_ID not between", value1, value2, "suppliersauthorizationId");
            return (Criteria) this;
        }

        public Criteria andSupplierssaleIdIsNull() {
            addCriterion("SuppliersSale_ID is null");
            return (Criteria) this;
        }

        public Criteria andSupplierssaleIdIsNotNull() {
            addCriterion("SuppliersSale_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierssaleIdEqualTo(Integer value) {
            addCriterion("SuppliersSale_ID =", value, "supplierssaleId");
            return (Criteria) this;
        }

        public Criteria andSupplierssaleIdNotEqualTo(Integer value) {
            addCriterion("SuppliersSale_ID <>", value, "supplierssaleId");
            return (Criteria) this;
        }

        public Criteria andSupplierssaleIdGreaterThan(Integer value) {
            addCriterion("SuppliersSale_ID >", value, "supplierssaleId");
            return (Criteria) this;
        }

        public Criteria andSupplierssaleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SuppliersSale_ID >=", value, "supplierssaleId");
            return (Criteria) this;
        }

        public Criteria andSupplierssaleIdLessThan(Integer value) {
            addCriterion("SuppliersSale_ID <", value, "supplierssaleId");
            return (Criteria) this;
        }

        public Criteria andSupplierssaleIdLessThanOrEqualTo(Integer value) {
            addCriterion("SuppliersSale_ID <=", value, "supplierssaleId");
            return (Criteria) this;
        }

        public Criteria andSupplierssaleIdIn(List<Integer> values) {
            addCriterion("SuppliersSale_ID in", values, "supplierssaleId");
            return (Criteria) this;
        }

        public Criteria andSupplierssaleIdNotIn(List<Integer> values) {
            addCriterion("SuppliersSale_ID not in", values, "supplierssaleId");
            return (Criteria) this;
        }

        public Criteria andSupplierssaleIdBetween(Integer value1, Integer value2) {
            addCriterion("SuppliersSale_ID between", value1, value2, "supplierssaleId");
            return (Criteria) this;
        }

        public Criteria andSupplierssaleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SuppliersSale_ID not between", value1, value2, "supplierssaleId");
            return (Criteria) this;
        }

        public Criteria andFirstbusinessIsNull() {
            addCriterion("FirstBusiness is null");
            return (Criteria) this;
        }

        public Criteria andFirstbusinessIsNotNull() {
            addCriterion("FirstBusiness is not null");
            return (Criteria) this;
        }

        public Criteria andFirstbusinessEqualTo(Integer value) {
            addCriterion("FirstBusiness =", value, "firstbusiness");
            return (Criteria) this;
        }

        public Criteria andFirstbusinessNotEqualTo(Integer value) {
            addCriterion("FirstBusiness <>", value, "firstbusiness");
            return (Criteria) this;
        }

        public Criteria andFirstbusinessGreaterThan(Integer value) {
            addCriterion("FirstBusiness >", value, "firstbusiness");
            return (Criteria) this;
        }

        public Criteria andFirstbusinessGreaterThanOrEqualTo(Integer value) {
            addCriterion("FirstBusiness >=", value, "firstbusiness");
            return (Criteria) this;
        }

        public Criteria andFirstbusinessLessThan(Integer value) {
            addCriterion("FirstBusiness <", value, "firstbusiness");
            return (Criteria) this;
        }

        public Criteria andFirstbusinessLessThanOrEqualTo(Integer value) {
            addCriterion("FirstBusiness <=", value, "firstbusiness");
            return (Criteria) this;
        }

        public Criteria andFirstbusinessIn(List<Integer> values) {
            addCriterion("FirstBusiness in", values, "firstbusiness");
            return (Criteria) this;
        }

        public Criteria andFirstbusinessNotIn(List<Integer> values) {
            addCriterion("FirstBusiness not in", values, "firstbusiness");
            return (Criteria) this;
        }

        public Criteria andFirstbusinessBetween(Integer value1, Integer value2) {
            addCriterion("FirstBusiness between", value1, value2, "firstbusiness");
            return (Criteria) this;
        }

        public Criteria andFirstbusinessNotBetween(Integer value1, Integer value2) {
            addCriterion("FirstBusiness not between", value1, value2, "firstbusiness");
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

        public Criteria andIsreviewIsNull() {
            addCriterion("IsReview is null");
            return (Criteria) this;
        }

        public Criteria andIsreviewIsNotNull() {
            addCriterion("IsReview is not null");
            return (Criteria) this;
        }

        public Criteria andIsreviewEqualTo(Boolean value) {
            addCriterion("IsReview =", value, "isreview");
            return (Criteria) this;
        }

        public Criteria andIsreviewNotEqualTo(Boolean value) {
            addCriterion("IsReview <>", value, "isreview");
            return (Criteria) this;
        }

        public Criteria andIsreviewGreaterThan(Boolean value) {
            addCriterion("IsReview >", value, "isreview");
            return (Criteria) this;
        }

        public Criteria andIsreviewGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsReview >=", value, "isreview");
            return (Criteria) this;
        }

        public Criteria andIsreviewLessThan(Boolean value) {
            addCriterion("IsReview <", value, "isreview");
            return (Criteria) this;
        }

        public Criteria andIsreviewLessThanOrEqualTo(Boolean value) {
            addCriterion("IsReview <=", value, "isreview");
            return (Criteria) this;
        }

        public Criteria andIsreviewIn(List<Boolean> values) {
            addCriterion("IsReview in", values, "isreview");
            return (Criteria) this;
        }

        public Criteria andIsreviewNotIn(List<Boolean> values) {
            addCriterion("IsReview not in", values, "isreview");
            return (Criteria) this;
        }

        public Criteria andIsreviewBetween(Boolean value1, Boolean value2) {
            addCriterion("IsReview between", value1, value2, "isreview");
            return (Criteria) this;
        }

        public Criteria andIsreviewNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsReview not between", value1, value2, "isreview");
            return (Criteria) this;
        }

        public Criteria andIssaleIsNull() {
            addCriterion("IsSale is null");
            return (Criteria) this;
        }

        public Criteria andIssaleIsNotNull() {
            addCriterion("IsSale is not null");
            return (Criteria) this;
        }

        public Criteria andIssaleEqualTo(Boolean value) {
            addCriterion("IsSale =", value, "issale");
            return (Criteria) this;
        }

        public Criteria andIssaleNotEqualTo(Boolean value) {
            addCriterion("IsSale <>", value, "issale");
            return (Criteria) this;
        }

        public Criteria andIssaleGreaterThan(Boolean value) {
            addCriterion("IsSale >", value, "issale");
            return (Criteria) this;
        }

        public Criteria andIssaleGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsSale >=", value, "issale");
            return (Criteria) this;
        }

        public Criteria andIssaleLessThan(Boolean value) {
            addCriterion("IsSale <", value, "issale");
            return (Criteria) this;
        }

        public Criteria andIssaleLessThanOrEqualTo(Boolean value) {
            addCriterion("IsSale <=", value, "issale");
            return (Criteria) this;
        }

        public Criteria andIssaleIn(List<Boolean> values) {
            addCriterion("IsSale in", values, "issale");
            return (Criteria) this;
        }

        public Criteria andIssaleNotIn(List<Boolean> values) {
            addCriterion("IsSale not in", values, "issale");
            return (Criteria) this;
        }

        public Criteria andIssaleBetween(Boolean value1, Boolean value2) {
            addCriterion("IsSale between", value1, value2, "issale");
            return (Criteria) this;
        }

        public Criteria andIssaleNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsSale not between", value1, value2, "issale");
            return (Criteria) this;
        }

        public Criteria andPackagingunitIsNull() {
            addCriterion("PackagingUnit is null");
            return (Criteria) this;
        }

        public Criteria andPackagingunitIsNotNull() {
            addCriterion("PackagingUnit is not null");
            return (Criteria) this;
        }

        public Criteria andPackagingunitEqualTo(String value) {
            addCriterion("PackagingUnit =", value, "packagingunit");
            return (Criteria) this;
        }

        public Criteria andPackagingunitNotEqualTo(String value) {
            addCriterion("PackagingUnit <>", value, "packagingunit");
            return (Criteria) this;
        }

        public Criteria andPackagingunitGreaterThan(String value) {
            addCriterion("PackagingUnit >", value, "packagingunit");
            return (Criteria) this;
        }

        public Criteria andPackagingunitGreaterThanOrEqualTo(String value) {
            addCriterion("PackagingUnit >=", value, "packagingunit");
            return (Criteria) this;
        }

        public Criteria andPackagingunitLessThan(String value) {
            addCriterion("PackagingUnit <", value, "packagingunit");
            return (Criteria) this;
        }

        public Criteria andPackagingunitLessThanOrEqualTo(String value) {
            addCriterion("PackagingUnit <=", value, "packagingunit");
            return (Criteria) this;
        }

        public Criteria andPackagingunitLike(String value) {
            addCriterion("PackagingUnit like", value, "packagingunit");
            return (Criteria) this;
        }

        public Criteria andPackagingunitNotLike(String value) {
            addCriterion("PackagingUnit not like", value, "packagingunit");
            return (Criteria) this;
        }

        public Criteria andPackagingunitIn(List<String> values) {
            addCriterion("PackagingUnit in", values, "packagingunit");
            return (Criteria) this;
        }

        public Criteria andPackagingunitNotIn(List<String> values) {
            addCriterion("PackagingUnit not in", values, "packagingunit");
            return (Criteria) this;
        }

        public Criteria andPackagingunitBetween(String value1, String value2) {
            addCriterion("PackagingUnit between", value1, value2, "packagingunit");
            return (Criteria) this;
        }

        public Criteria andPackagingunitNotBetween(String value1, String value2) {
            addCriterion("PackagingUnit not between", value1, value2, "packagingunit");
            return (Criteria) this;
        }

        public Criteria andGoodsbarcodeIsNull() {
            addCriterion("GoodsBarCode is null");
            return (Criteria) this;
        }

        public Criteria andGoodsbarcodeIsNotNull() {
            addCriterion("GoodsBarCode is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsbarcodeEqualTo(String value) {
            addCriterion("GoodsBarCode =", value, "goodsbarcode");
            return (Criteria) this;
        }

        public Criteria andGoodsbarcodeNotEqualTo(String value) {
            addCriterion("GoodsBarCode <>", value, "goodsbarcode");
            return (Criteria) this;
        }

        public Criteria andGoodsbarcodeGreaterThan(String value) {
            addCriterion("GoodsBarCode >", value, "goodsbarcode");
            return (Criteria) this;
        }

        public Criteria andGoodsbarcodeGreaterThanOrEqualTo(String value) {
            addCriterion("GoodsBarCode >=", value, "goodsbarcode");
            return (Criteria) this;
        }

        public Criteria andGoodsbarcodeLessThan(String value) {
            addCriterion("GoodsBarCode <", value, "goodsbarcode");
            return (Criteria) this;
        }

        public Criteria andGoodsbarcodeLessThanOrEqualTo(String value) {
            addCriterion("GoodsBarCode <=", value, "goodsbarcode");
            return (Criteria) this;
        }

        public Criteria andGoodsbarcodeLike(String value) {
            addCriterion("GoodsBarCode like", value, "goodsbarcode");
            return (Criteria) this;
        }

        public Criteria andGoodsbarcodeNotLike(String value) {
            addCriterion("GoodsBarCode not like", value, "goodsbarcode");
            return (Criteria) this;
        }

        public Criteria andGoodsbarcodeIn(List<String> values) {
            addCriterion("GoodsBarCode in", values, "goodsbarcode");
            return (Criteria) this;
        }

        public Criteria andGoodsbarcodeNotIn(List<String> values) {
            addCriterion("GoodsBarCode not in", values, "goodsbarcode");
            return (Criteria) this;
        }

        public Criteria andGoodsbarcodeBetween(String value1, String value2) {
            addCriterion("GoodsBarCode between", value1, value2, "goodsbarcode");
            return (Criteria) this;
        }

        public Criteria andGoodsbarcodeNotBetween(String value1, String value2) {
            addCriterion("GoodsBarCode not between", value1, value2, "goodsbarcode");
            return (Criteria) this;
        }

        public Criteria andGoodsspeciesIsNull() {
            addCriterion("GoodsSpecies is null");
            return (Criteria) this;
        }

        public Criteria andGoodsspeciesIsNotNull() {
            addCriterion("GoodsSpecies is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsspeciesEqualTo(Integer value) {
            addCriterion("GoodsSpecies =", value, "goodsspecies");
            return (Criteria) this;
        }

        public Criteria andGoodsspeciesNotEqualTo(Integer value) {
            addCriterion("GoodsSpecies <>", value, "goodsspecies");
            return (Criteria) this;
        }

        public Criteria andGoodsspeciesGreaterThan(Integer value) {
            addCriterion("GoodsSpecies >", value, "goodsspecies");
            return (Criteria) this;
        }

        public Criteria andGoodsspeciesGreaterThanOrEqualTo(Integer value) {
            addCriterion("GoodsSpecies >=", value, "goodsspecies");
            return (Criteria) this;
        }

        public Criteria andGoodsspeciesLessThan(Integer value) {
            addCriterion("GoodsSpecies <", value, "goodsspecies");
            return (Criteria) this;
        }

        public Criteria andGoodsspeciesLessThanOrEqualTo(Integer value) {
            addCriterion("GoodsSpecies <=", value, "goodsspecies");
            return (Criteria) this;
        }

        public Criteria andGoodsspeciesIn(List<Integer> values) {
            addCriterion("GoodsSpecies in", values, "goodsspecies");
            return (Criteria) this;
        }

        public Criteria andGoodsspeciesNotIn(List<Integer> values) {
            addCriterion("GoodsSpecies not in", values, "goodsspecies");
            return (Criteria) this;
        }

        public Criteria andGoodsspeciesBetween(Integer value1, Integer value2) {
            addCriterion("GoodsSpecies between", value1, value2, "goodsspecies");
            return (Criteria) this;
        }

        public Criteria andGoodsspeciesNotBetween(Integer value1, Integer value2) {
            addCriterion("GoodsSpecies not between", value1, value2, "goodsspecies");
            return (Criteria) this;
        }

        public Criteria andOriginIsNull() {
            addCriterion("Origin is null");
            return (Criteria) this;
        }

        public Criteria andOriginIsNotNull() {
            addCriterion("Origin is not null");
            return (Criteria) this;
        }

        public Criteria andOriginEqualTo(String value) {
            addCriterion("Origin =", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginNotEqualTo(String value) {
            addCriterion("Origin <>", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginGreaterThan(String value) {
            addCriterion("Origin >", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginGreaterThanOrEqualTo(String value) {
            addCriterion("Origin >=", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginLessThan(String value) {
            addCriterion("Origin <", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginLessThanOrEqualTo(String value) {
            addCriterion("Origin <=", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginLike(String value) {
            addCriterion("Origin like", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginNotLike(String value) {
            addCriterion("Origin not like", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginIn(List<String> values) {
            addCriterion("Origin in", values, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginNotIn(List<String> values) {
            addCriterion("Origin not in", values, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginBetween(String value1, String value2) {
            addCriterion("Origin between", value1, value2, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginNotBetween(String value1, String value2) {
            addCriterion("Origin not between", value1, value2, "origin");
            return (Criteria) this;
        }

        public Criteria andGoodsdescribationIsNull() {
            addCriterion("GoodsDescribation is null");
            return (Criteria) this;
        }

        public Criteria andGoodsdescribationIsNotNull() {
            addCriterion("GoodsDescribation is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsdescribationEqualTo(String value) {
            addCriterion("GoodsDescribation =", value, "goodsdescribation");
            return (Criteria) this;
        }

        public Criteria andGoodsdescribationNotEqualTo(String value) {
            addCriterion("GoodsDescribation <>", value, "goodsdescribation");
            return (Criteria) this;
        }

        public Criteria andGoodsdescribationGreaterThan(String value) {
            addCriterion("GoodsDescribation >", value, "goodsdescribation");
            return (Criteria) this;
        }

        public Criteria andGoodsdescribationGreaterThanOrEqualTo(String value) {
            addCriterion("GoodsDescribation >=", value, "goodsdescribation");
            return (Criteria) this;
        }

        public Criteria andGoodsdescribationLessThan(String value) {
            addCriterion("GoodsDescribation <", value, "goodsdescribation");
            return (Criteria) this;
        }

        public Criteria andGoodsdescribationLessThanOrEqualTo(String value) {
            addCriterion("GoodsDescribation <=", value, "goodsdescribation");
            return (Criteria) this;
        }

        public Criteria andGoodsdescribationLike(String value) {
            addCriterion("GoodsDescribation like", value, "goodsdescribation");
            return (Criteria) this;
        }

        public Criteria andGoodsdescribationNotLike(String value) {
            addCriterion("GoodsDescribation not like", value, "goodsdescribation");
            return (Criteria) this;
        }

        public Criteria andGoodsdescribationIn(List<String> values) {
            addCriterion("GoodsDescribation in", values, "goodsdescribation");
            return (Criteria) this;
        }

        public Criteria andGoodsdescribationNotIn(List<String> values) {
            addCriterion("GoodsDescribation not in", values, "goodsdescribation");
            return (Criteria) this;
        }

        public Criteria andGoodsdescribationBetween(String value1, String value2) {
            addCriterion("GoodsDescribation between", value1, value2, "goodsdescribation");
            return (Criteria) this;
        }

        public Criteria andGoodsdescribationNotBetween(String value1, String value2) {
            addCriterion("GoodsDescribation not between", value1, value2, "goodsdescribation");
            return (Criteria) this;
        }

        public Criteria andStoragetransportationrequirementIsNull() {
            addCriterion("StorageTransportationRequirement is null");
            return (Criteria) this;
        }

        public Criteria andStoragetransportationrequirementIsNotNull() {
            addCriterion("StorageTransportationRequirement is not null");
            return (Criteria) this;
        }

        public Criteria andStoragetransportationrequirementEqualTo(String value) {
            addCriterion("StorageTransportationRequirement =", value, "storagetransportationrequirement");
            return (Criteria) this;
        }

        public Criteria andStoragetransportationrequirementNotEqualTo(String value) {
            addCriterion("StorageTransportationRequirement <>", value, "storagetransportationrequirement");
            return (Criteria) this;
        }

        public Criteria andStoragetransportationrequirementGreaterThan(String value) {
            addCriterion("StorageTransportationRequirement >", value, "storagetransportationrequirement");
            return (Criteria) this;
        }

        public Criteria andStoragetransportationrequirementGreaterThanOrEqualTo(String value) {
            addCriterion("StorageTransportationRequirement >=", value, "storagetransportationrequirement");
            return (Criteria) this;
        }

        public Criteria andStoragetransportationrequirementLessThan(String value) {
            addCriterion("StorageTransportationRequirement <", value, "storagetransportationrequirement");
            return (Criteria) this;
        }

        public Criteria andStoragetransportationrequirementLessThanOrEqualTo(String value) {
            addCriterion("StorageTransportationRequirement <=", value, "storagetransportationrequirement");
            return (Criteria) this;
        }

        public Criteria andStoragetransportationrequirementLike(String value) {
            addCriterion("StorageTransportationRequirement like", value, "storagetransportationrequirement");
            return (Criteria) this;
        }

        public Criteria andStoragetransportationrequirementNotLike(String value) {
            addCriterion("StorageTransportationRequirement not like", value, "storagetransportationrequirement");
            return (Criteria) this;
        }

        public Criteria andStoragetransportationrequirementIn(List<String> values) {
            addCriterion("StorageTransportationRequirement in", values, "storagetransportationrequirement");
            return (Criteria) this;
        }

        public Criteria andStoragetransportationrequirementNotIn(List<String> values) {
            addCriterion("StorageTransportationRequirement not in", values, "storagetransportationrequirement");
            return (Criteria) this;
        }

        public Criteria andStoragetransportationrequirementBetween(String value1, String value2) {
            addCriterion("StorageTransportationRequirement between", value1, value2, "storagetransportationrequirement");
            return (Criteria) this;
        }

        public Criteria andStoragetransportationrequirementNotBetween(String value1, String value2) {
            addCriterion("StorageTransportationRequirement not between", value1, value2, "storagetransportationrequirement");
            return (Criteria) this;
        }

        public Criteria andStmaxtemperatureIsNull() {
            addCriterion("STMaxTemperature is null");
            return (Criteria) this;
        }

        public Criteria andStmaxtemperatureIsNotNull() {
            addCriterion("STMaxTemperature is not null");
            return (Criteria) this;
        }

        public Criteria andStmaxtemperatureEqualTo(Float value) {
            addCriterion("STMaxTemperature =", value, "stmaxtemperature");
            return (Criteria) this;
        }

        public Criteria andStmaxtemperatureNotEqualTo(Float value) {
            addCriterion("STMaxTemperature <>", value, "stmaxtemperature");
            return (Criteria) this;
        }

        public Criteria andStmaxtemperatureGreaterThan(Float value) {
            addCriterion("STMaxTemperature >", value, "stmaxtemperature");
            return (Criteria) this;
        }

        public Criteria andStmaxtemperatureGreaterThanOrEqualTo(Float value) {
            addCriterion("STMaxTemperature >=", value, "stmaxtemperature");
            return (Criteria) this;
        }

        public Criteria andStmaxtemperatureLessThan(Float value) {
            addCriterion("STMaxTemperature <", value, "stmaxtemperature");
            return (Criteria) this;
        }

        public Criteria andStmaxtemperatureLessThanOrEqualTo(Float value) {
            addCriterion("STMaxTemperature <=", value, "stmaxtemperature");
            return (Criteria) this;
        }

        public Criteria andStmaxtemperatureIn(List<Float> values) {
            addCriterion("STMaxTemperature in", values, "stmaxtemperature");
            return (Criteria) this;
        }

        public Criteria andStmaxtemperatureNotIn(List<Float> values) {
            addCriterion("STMaxTemperature not in", values, "stmaxtemperature");
            return (Criteria) this;
        }

        public Criteria andStmaxtemperatureBetween(Float value1, Float value2) {
            addCriterion("STMaxTemperature between", value1, value2, "stmaxtemperature");
            return (Criteria) this;
        }

        public Criteria andStmaxtemperatureNotBetween(Float value1, Float value2) {
            addCriterion("STMaxTemperature not between", value1, value2, "stmaxtemperature");
            return (Criteria) this;
        }

        public Criteria andStmintemperatureIsNull() {
            addCriterion("STMinTemperature is null");
            return (Criteria) this;
        }

        public Criteria andStmintemperatureIsNotNull() {
            addCriterion("STMinTemperature is not null");
            return (Criteria) this;
        }

        public Criteria andStmintemperatureEqualTo(Float value) {
            addCriterion("STMinTemperature =", value, "stmintemperature");
            return (Criteria) this;
        }

        public Criteria andStmintemperatureNotEqualTo(Float value) {
            addCriterion("STMinTemperature <>", value, "stmintemperature");
            return (Criteria) this;
        }

        public Criteria andStmintemperatureGreaterThan(Float value) {
            addCriterion("STMinTemperature >", value, "stmintemperature");
            return (Criteria) this;
        }

        public Criteria andStmintemperatureGreaterThanOrEqualTo(Float value) {
            addCriterion("STMinTemperature >=", value, "stmintemperature");
            return (Criteria) this;
        }

        public Criteria andStmintemperatureLessThan(Float value) {
            addCriterion("STMinTemperature <", value, "stmintemperature");
            return (Criteria) this;
        }

        public Criteria andStmintemperatureLessThanOrEqualTo(Float value) {
            addCriterion("STMinTemperature <=", value, "stmintemperature");
            return (Criteria) this;
        }

        public Criteria andStmintemperatureIn(List<Float> values) {
            addCriterion("STMinTemperature in", values, "stmintemperature");
            return (Criteria) this;
        }

        public Criteria andStmintemperatureNotIn(List<Float> values) {
            addCriterion("STMinTemperature not in", values, "stmintemperature");
            return (Criteria) this;
        }

        public Criteria andStmintemperatureBetween(Float value1, Float value2) {
            addCriterion("STMinTemperature between", value1, value2, "stmintemperature");
            return (Criteria) this;
        }

        public Criteria andStmintemperatureNotBetween(Float value1, Float value2) {
            addCriterion("STMinTemperature not between", value1, value2, "stmintemperature");
            return (Criteria) this;
        }

        public Criteria andColdchainproductidentificationIsNull() {
            addCriterion("ColdChainProductIdentification is null");
            return (Criteria) this;
        }

        public Criteria andColdchainproductidentificationIsNotNull() {
            addCriterion("ColdChainProductIdentification is not null");
            return (Criteria) this;
        }

        public Criteria andColdchainproductidentificationEqualTo(Integer value) {
            addCriterion("ColdChainProductIdentification =", value, "coldchainproductidentification");
            return (Criteria) this;
        }

        public Criteria andColdchainproductidentificationNotEqualTo(Integer value) {
            addCriterion("ColdChainProductIdentification <>", value, "coldchainproductidentification");
            return (Criteria) this;
        }

        public Criteria andColdchainproductidentificationGreaterThan(Integer value) {
            addCriterion("ColdChainProductIdentification >", value, "coldchainproductidentification");
            return (Criteria) this;
        }

        public Criteria andColdchainproductidentificationGreaterThanOrEqualTo(Integer value) {
            addCriterion("ColdChainProductIdentification >=", value, "coldchainproductidentification");
            return (Criteria) this;
        }

        public Criteria andColdchainproductidentificationLessThan(Integer value) {
            addCriterion("ColdChainProductIdentification <", value, "coldchainproductidentification");
            return (Criteria) this;
        }

        public Criteria andColdchainproductidentificationLessThanOrEqualTo(Integer value) {
            addCriterion("ColdChainProductIdentification <=", value, "coldchainproductidentification");
            return (Criteria) this;
        }

        public Criteria andColdchainproductidentificationIn(List<Integer> values) {
            addCriterion("ColdChainProductIdentification in", values, "coldchainproductidentification");
            return (Criteria) this;
        }

        public Criteria andColdchainproductidentificationNotIn(List<Integer> values) {
            addCriterion("ColdChainProductIdentification not in", values, "coldchainproductidentification");
            return (Criteria) this;
        }

        public Criteria andColdchainproductidentificationBetween(Integer value1, Integer value2) {
            addCriterion("ColdChainProductIdentification between", value1, value2, "coldchainproductidentification");
            return (Criteria) this;
        }

        public Criteria andColdchainproductidentificationNotBetween(Integer value1, Integer value2) {
            addCriterion("ColdChainProductIdentification not between", value1, value2, "coldchainproductidentification");
            return (Criteria) this;
        }

        public Criteria andIshomemadeIsNull() {
            addCriterion("IsHomemade is null");
            return (Criteria) this;
        }

        public Criteria andIshomemadeIsNotNull() {
            addCriterion("IsHomemade is not null");
            return (Criteria) this;
        }

        public Criteria andIshomemadeEqualTo(Integer value) {
            addCriterion("IsHomemade =", value, "ishomemade");
            return (Criteria) this;
        }

        public Criteria andIshomemadeNotEqualTo(Integer value) {
            addCriterion("IsHomemade <>", value, "ishomemade");
            return (Criteria) this;
        }

        public Criteria andIshomemadeGreaterThan(Integer value) {
            addCriterion("IsHomemade >", value, "ishomemade");
            return (Criteria) this;
        }

        public Criteria andIshomemadeGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsHomemade >=", value, "ishomemade");
            return (Criteria) this;
        }

        public Criteria andIshomemadeLessThan(Integer value) {
            addCriterion("IsHomemade <", value, "ishomemade");
            return (Criteria) this;
        }

        public Criteria andIshomemadeLessThanOrEqualTo(Integer value) {
            addCriterion("IsHomemade <=", value, "ishomemade");
            return (Criteria) this;
        }

        public Criteria andIshomemadeIn(List<Integer> values) {
            addCriterion("IsHomemade in", values, "ishomemade");
            return (Criteria) this;
        }

        public Criteria andIshomemadeNotIn(List<Integer> values) {
            addCriterion("IsHomemade not in", values, "ishomemade");
            return (Criteria) this;
        }

        public Criteria andIshomemadeBetween(Integer value1, Integer value2) {
            addCriterion("IsHomemade between", value1, value2, "ishomemade");
            return (Criteria) this;
        }

        public Criteria andIshomemadeNotBetween(Integer value1, Integer value2) {
            addCriterion("IsHomemade not between", value1, value2, "ishomemade");
            return (Criteria) this;
        }

        public Criteria andSterilizingbatchnumberIsNull() {
            addCriterion("SterilizingBatchNumber is null");
            return (Criteria) this;
        }

        public Criteria andSterilizingbatchnumberIsNotNull() {
            addCriterion("SterilizingBatchNumber is not null");
            return (Criteria) this;
        }

        public Criteria andSterilizingbatchnumberEqualTo(String value) {
            addCriterion("SterilizingBatchNumber =", value, "sterilizingbatchnumber");
            return (Criteria) this;
        }

        public Criteria andSterilizingbatchnumberNotEqualTo(String value) {
            addCriterion("SterilizingBatchNumber <>", value, "sterilizingbatchnumber");
            return (Criteria) this;
        }

        public Criteria andSterilizingbatchnumberGreaterThan(String value) {
            addCriterion("SterilizingBatchNumber >", value, "sterilizingbatchnumber");
            return (Criteria) this;
        }

        public Criteria andSterilizingbatchnumberGreaterThanOrEqualTo(String value) {
            addCriterion("SterilizingBatchNumber >=", value, "sterilizingbatchnumber");
            return (Criteria) this;
        }

        public Criteria andSterilizingbatchnumberLessThan(String value) {
            addCriterion("SterilizingBatchNumber <", value, "sterilizingbatchnumber");
            return (Criteria) this;
        }

        public Criteria andSterilizingbatchnumberLessThanOrEqualTo(String value) {
            addCriterion("SterilizingBatchNumber <=", value, "sterilizingbatchnumber");
            return (Criteria) this;
        }

        public Criteria andSterilizingbatchnumberLike(String value) {
            addCriterion("SterilizingBatchNumber like", value, "sterilizingbatchnumber");
            return (Criteria) this;
        }

        public Criteria andSterilizingbatchnumberNotLike(String value) {
            addCriterion("SterilizingBatchNumber not like", value, "sterilizingbatchnumber");
            return (Criteria) this;
        }

        public Criteria andSterilizingbatchnumberIn(List<String> values) {
            addCriterion("SterilizingBatchNumber in", values, "sterilizingbatchnumber");
            return (Criteria) this;
        }

        public Criteria andSterilizingbatchnumberNotIn(List<String> values) {
            addCriterion("SterilizingBatchNumber not in", values, "sterilizingbatchnumber");
            return (Criteria) this;
        }

        public Criteria andSterilizingbatchnumberBetween(String value1, String value2) {
            addCriterion("SterilizingBatchNumber between", value1, value2, "sterilizingbatchnumber");
            return (Criteria) this;
        }

        public Criteria andSterilizingbatchnumberNotBetween(String value1, String value2) {
            addCriterion("SterilizingBatchNumber not between", value1, value2, "sterilizingbatchnumber");
            return (Criteria) this;
        }

        public Criteria andSmaxtemperatureIsNull() {
            addCriterion("SMaxTemperature is null");
            return (Criteria) this;
        }

        public Criteria andSmaxtemperatureIsNotNull() {
            addCriterion("SMaxTemperature is not null");
            return (Criteria) this;
        }

        public Criteria andSmaxtemperatureEqualTo(Float value) {
            addCriterion("SMaxTemperature =", value, "smaxtemperature");
            return (Criteria) this;
        }

        public Criteria andSmaxtemperatureNotEqualTo(Float value) {
            addCriterion("SMaxTemperature <>", value, "smaxtemperature");
            return (Criteria) this;
        }

        public Criteria andSmaxtemperatureGreaterThan(Float value) {
            addCriterion("SMaxTemperature >", value, "smaxtemperature");
            return (Criteria) this;
        }

        public Criteria andSmaxtemperatureGreaterThanOrEqualTo(Float value) {
            addCriterion("SMaxTemperature >=", value, "smaxtemperature");
            return (Criteria) this;
        }

        public Criteria andSmaxtemperatureLessThan(Float value) {
            addCriterion("SMaxTemperature <", value, "smaxtemperature");
            return (Criteria) this;
        }

        public Criteria andSmaxtemperatureLessThanOrEqualTo(Float value) {
            addCriterion("SMaxTemperature <=", value, "smaxtemperature");
            return (Criteria) this;
        }

        public Criteria andSmaxtemperatureIn(List<Float> values) {
            addCriterion("SMaxTemperature in", values, "smaxtemperature");
            return (Criteria) this;
        }

        public Criteria andSmaxtemperatureNotIn(List<Float> values) {
            addCriterion("SMaxTemperature not in", values, "smaxtemperature");
            return (Criteria) this;
        }

        public Criteria andSmaxtemperatureBetween(Float value1, Float value2) {
            addCriterion("SMaxTemperature between", value1, value2, "smaxtemperature");
            return (Criteria) this;
        }

        public Criteria andSmaxtemperatureNotBetween(Float value1, Float value2) {
            addCriterion("SMaxTemperature not between", value1, value2, "smaxtemperature");
            return (Criteria) this;
        }

        public Criteria andSmintemperatureIsNull() {
            addCriterion("SMinTemperature is null");
            return (Criteria) this;
        }

        public Criteria andSmintemperatureIsNotNull() {
            addCriterion("SMinTemperature is not null");
            return (Criteria) this;
        }

        public Criteria andSmintemperatureEqualTo(Float value) {
            addCriterion("SMinTemperature =", value, "smintemperature");
            return (Criteria) this;
        }

        public Criteria andSmintemperatureNotEqualTo(Float value) {
            addCriterion("SMinTemperature <>", value, "smintemperature");
            return (Criteria) this;
        }

        public Criteria andSmintemperatureGreaterThan(Float value) {
            addCriterion("SMinTemperature >", value, "smintemperature");
            return (Criteria) this;
        }

        public Criteria andSmintemperatureGreaterThanOrEqualTo(Float value) {
            addCriterion("SMinTemperature >=", value, "smintemperature");
            return (Criteria) this;
        }

        public Criteria andSmintemperatureLessThan(Float value) {
            addCriterion("SMinTemperature <", value, "smintemperature");
            return (Criteria) this;
        }

        public Criteria andSmintemperatureLessThanOrEqualTo(Float value) {
            addCriterion("SMinTemperature <=", value, "smintemperature");
            return (Criteria) this;
        }

        public Criteria andSmintemperatureIn(List<Float> values) {
            addCriterion("SMinTemperature in", values, "smintemperature");
            return (Criteria) this;
        }

        public Criteria andSmintemperatureNotIn(List<Float> values) {
            addCriterion("SMinTemperature not in", values, "smintemperature");
            return (Criteria) this;
        }

        public Criteria andSmintemperatureBetween(Float value1, Float value2) {
            addCriterion("SMinTemperature between", value1, value2, "smintemperature");
            return (Criteria) this;
        }

        public Criteria andSmintemperatureNotBetween(Float value1, Float value2) {
            addCriterion("SMinTemperature not between", value1, value2, "smintemperature");
            return (Criteria) this;
        }

        public Criteria andSmaxhumidityIsNull() {
            addCriterion("SMaxHumidity is null");
            return (Criteria) this;
        }

        public Criteria andSmaxhumidityIsNotNull() {
            addCriterion("SMaxHumidity is not null");
            return (Criteria) this;
        }

        public Criteria andSmaxhumidityEqualTo(Float value) {
            addCriterion("SMaxHumidity =", value, "smaxhumidity");
            return (Criteria) this;
        }

        public Criteria andSmaxhumidityNotEqualTo(Float value) {
            addCriterion("SMaxHumidity <>", value, "smaxhumidity");
            return (Criteria) this;
        }

        public Criteria andSmaxhumidityGreaterThan(Float value) {
            addCriterion("SMaxHumidity >", value, "smaxhumidity");
            return (Criteria) this;
        }

        public Criteria andSmaxhumidityGreaterThanOrEqualTo(Float value) {
            addCriterion("SMaxHumidity >=", value, "smaxhumidity");
            return (Criteria) this;
        }

        public Criteria andSmaxhumidityLessThan(Float value) {
            addCriterion("SMaxHumidity <", value, "smaxhumidity");
            return (Criteria) this;
        }

        public Criteria andSmaxhumidityLessThanOrEqualTo(Float value) {
            addCriterion("SMaxHumidity <=", value, "smaxhumidity");
            return (Criteria) this;
        }

        public Criteria andSmaxhumidityIn(List<Float> values) {
            addCriterion("SMaxHumidity in", values, "smaxhumidity");
            return (Criteria) this;
        }

        public Criteria andSmaxhumidityNotIn(List<Float> values) {
            addCriterion("SMaxHumidity not in", values, "smaxhumidity");
            return (Criteria) this;
        }

        public Criteria andSmaxhumidityBetween(Float value1, Float value2) {
            addCriterion("SMaxHumidity between", value1, value2, "smaxhumidity");
            return (Criteria) this;
        }

        public Criteria andSmaxhumidityNotBetween(Float value1, Float value2) {
            addCriterion("SMaxHumidity not between", value1, value2, "smaxhumidity");
            return (Criteria) this;
        }

        public Criteria andSminhumidityIsNull() {
            addCriterion("SMinHumidity is null");
            return (Criteria) this;
        }

        public Criteria andSminhumidityIsNotNull() {
            addCriterion("SMinHumidity is not null");
            return (Criteria) this;
        }

        public Criteria andSminhumidityEqualTo(Float value) {
            addCriterion("SMinHumidity =", value, "sminhumidity");
            return (Criteria) this;
        }

        public Criteria andSminhumidityNotEqualTo(Float value) {
            addCriterion("SMinHumidity <>", value, "sminhumidity");
            return (Criteria) this;
        }

        public Criteria andSminhumidityGreaterThan(Float value) {
            addCriterion("SMinHumidity >", value, "sminhumidity");
            return (Criteria) this;
        }

        public Criteria andSminhumidityGreaterThanOrEqualTo(Float value) {
            addCriterion("SMinHumidity >=", value, "sminhumidity");
            return (Criteria) this;
        }

        public Criteria andSminhumidityLessThan(Float value) {
            addCriterion("SMinHumidity <", value, "sminhumidity");
            return (Criteria) this;
        }

        public Criteria andSminhumidityLessThanOrEqualTo(Float value) {
            addCriterion("SMinHumidity <=", value, "sminhumidity");
            return (Criteria) this;
        }

        public Criteria andSminhumidityIn(List<Float> values) {
            addCriterion("SMinHumidity in", values, "sminhumidity");
            return (Criteria) this;
        }

        public Criteria andSminhumidityNotIn(List<Float> values) {
            addCriterion("SMinHumidity not in", values, "sminhumidity");
            return (Criteria) this;
        }

        public Criteria andSminhumidityBetween(Float value1, Float value2) {
            addCriterion("SMinHumidity between", value1, value2, "sminhumidity");
            return (Criteria) this;
        }

        public Criteria andSminhumidityNotBetween(Float value1, Float value2) {
            addCriterion("SMinHumidity not between", value1, value2, "sminhumidity");
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
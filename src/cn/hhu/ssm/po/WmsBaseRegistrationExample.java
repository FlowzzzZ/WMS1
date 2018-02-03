package cn.hhu.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WmsBaseRegistrationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WmsBaseRegistrationExample() {
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

        public Criteria andRegistrationNumberIsNull() {
            addCriterion("Registration_Number is null");
            return (Criteria) this;
        }

        public Criteria andRegistrationNumberIsNotNull() {
            addCriterion("Registration_Number is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrationNumberEqualTo(String value) {
            addCriterion("Registration_Number =", value, "registrationNumber");
            return (Criteria) this;
        }

        public Criteria andRegistrationNumberNotEqualTo(String value) {
            addCriterion("Registration_Number <>", value, "registrationNumber");
            return (Criteria) this;
        }

        public Criteria andRegistrationNumberGreaterThan(String value) {
            addCriterion("Registration_Number >", value, "registrationNumber");
            return (Criteria) this;
        }

        public Criteria andRegistrationNumberGreaterThanOrEqualTo(String value) {
            addCriterion("Registration_Number >=", value, "registrationNumber");
            return (Criteria) this;
        }

        public Criteria andRegistrationNumberLessThan(String value) {
            addCriterion("Registration_Number <", value, "registrationNumber");
            return (Criteria) this;
        }

        public Criteria andRegistrationNumberLessThanOrEqualTo(String value) {
            addCriterion("Registration_Number <=", value, "registrationNumber");
            return (Criteria) this;
        }

        public Criteria andRegistrationNumberLike(String value) {
            addCriterion("Registration_Number like", value, "registrationNumber");
            return (Criteria) this;
        }

        public Criteria andRegistrationNumberNotLike(String value) {
            addCriterion("Registration_Number not like", value, "registrationNumber");
            return (Criteria) this;
        }

        public Criteria andRegistrationNumberIn(List<String> values) {
            addCriterion("Registration_Number in", values, "registrationNumber");
            return (Criteria) this;
        }

        public Criteria andRegistrationNumberNotIn(List<String> values) {
            addCriterion("Registration_Number not in", values, "registrationNumber");
            return (Criteria) this;
        }

        public Criteria andRegistrationNumberBetween(String value1, String value2) {
            addCriterion("Registration_Number between", value1, value2, "registrationNumber");
            return (Criteria) this;
        }

        public Criteria andRegistrationNumberNotBetween(String value1, String value2) {
            addCriterion("Registration_Number not between", value1, value2, "registrationNumber");
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

        public Criteria andProductstandardsIsNull() {
            addCriterion("ProductStandards is null");
            return (Criteria) this;
        }

        public Criteria andProductstandardsIsNotNull() {
            addCriterion("ProductStandards is not null");
            return (Criteria) this;
        }

        public Criteria andProductstandardsEqualTo(String value) {
            addCriterion("ProductStandards =", value, "productstandards");
            return (Criteria) this;
        }

        public Criteria andProductstandardsNotEqualTo(String value) {
            addCriterion("ProductStandards <>", value, "productstandards");
            return (Criteria) this;
        }

        public Criteria andProductstandardsGreaterThan(String value) {
            addCriterion("ProductStandards >", value, "productstandards");
            return (Criteria) this;
        }

        public Criteria andProductstandardsGreaterThanOrEqualTo(String value) {
            addCriterion("ProductStandards >=", value, "productstandards");
            return (Criteria) this;
        }

        public Criteria andProductstandardsLessThan(String value) {
            addCriterion("ProductStandards <", value, "productstandards");
            return (Criteria) this;
        }

        public Criteria andProductstandardsLessThanOrEqualTo(String value) {
            addCriterion("ProductStandards <=", value, "productstandards");
            return (Criteria) this;
        }

        public Criteria andProductstandardsLike(String value) {
            addCriterion("ProductStandards like", value, "productstandards");
            return (Criteria) this;
        }

        public Criteria andProductstandardsNotLike(String value) {
            addCriterion("ProductStandards not like", value, "productstandards");
            return (Criteria) this;
        }

        public Criteria andProductstandardsIn(List<String> values) {
            addCriterion("ProductStandards in", values, "productstandards");
            return (Criteria) this;
        }

        public Criteria andProductstandardsNotIn(List<String> values) {
            addCriterion("ProductStandards not in", values, "productstandards");
            return (Criteria) this;
        }

        public Criteria andProductstandardsBetween(String value1, String value2) {
            addCriterion("ProductStandards between", value1, value2, "productstandards");
            return (Criteria) this;
        }

        public Criteria andProductstandardsNotBetween(String value1, String value2) {
            addCriterion("ProductStandards not between", value1, value2, "productstandards");
            return (Criteria) this;
        }

        public Criteria andRegistrationvalidityIsNull() {
            addCriterion("RegistrationValidity is null");
            return (Criteria) this;
        }

        public Criteria andRegistrationvalidityIsNotNull() {
            addCriterion("RegistrationValidity is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrationvalidityEqualTo(Date value) {
            addCriterion("RegistrationValidity =", value, "registrationvalidity");
            return (Criteria) this;
        }

        public Criteria andRegistrationvalidityNotEqualTo(Date value) {
            addCriterion("RegistrationValidity <>", value, "registrationvalidity");
            return (Criteria) this;
        }

        public Criteria andRegistrationvalidityGreaterThan(Date value) {
            addCriterion("RegistrationValidity >", value, "registrationvalidity");
            return (Criteria) this;
        }

        public Criteria andRegistrationvalidityGreaterThanOrEqualTo(Date value) {
            addCriterion("RegistrationValidity >=", value, "registrationvalidity");
            return (Criteria) this;
        }

        public Criteria andRegistrationvalidityLessThan(Date value) {
            addCriterion("RegistrationValidity <", value, "registrationvalidity");
            return (Criteria) this;
        }

        public Criteria andRegistrationvalidityLessThanOrEqualTo(Date value) {
            addCriterion("RegistrationValidity <=", value, "registrationvalidity");
            return (Criteria) this;
        }

        public Criteria andRegistrationvalidityIn(List<Date> values) {
            addCriterion("RegistrationValidity in", values, "registrationvalidity");
            return (Criteria) this;
        }

        public Criteria andRegistrationvalidityNotIn(List<Date> values) {
            addCriterion("RegistrationValidity not in", values, "registrationvalidity");
            return (Criteria) this;
        }

        public Criteria andRegistrationvalidityBetween(Date value1, Date value2) {
            addCriterion("RegistrationValidity between", value1, value2, "registrationvalidity");
            return (Criteria) this;
        }

        public Criteria andRegistrationvalidityNotBetween(Date value1, Date value2) {
            addCriterion("RegistrationValidity not between", value1, value2, "registrationvalidity");
            return (Criteria) this;
        }

        public Criteria andRegistrationphotoIsNull() {
            addCriterion("RegistrationPhoto is null");
            return (Criteria) this;
        }

        public Criteria andRegistrationphotoIsNotNull() {
            addCriterion("RegistrationPhoto is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrationphotoEqualTo(String value) {
            addCriterion("RegistrationPhoto =", value, "registrationphoto");
            return (Criteria) this;
        }

        public Criteria andRegistrationphotoNotEqualTo(String value) {
            addCriterion("RegistrationPhoto <>", value, "registrationphoto");
            return (Criteria) this;
        }

        public Criteria andRegistrationphotoGreaterThan(String value) {
            addCriterion("RegistrationPhoto >", value, "registrationphoto");
            return (Criteria) this;
        }

        public Criteria andRegistrationphotoGreaterThanOrEqualTo(String value) {
            addCriterion("RegistrationPhoto >=", value, "registrationphoto");
            return (Criteria) this;
        }

        public Criteria andRegistrationphotoLessThan(String value) {
            addCriterion("RegistrationPhoto <", value, "registrationphoto");
            return (Criteria) this;
        }

        public Criteria andRegistrationphotoLessThanOrEqualTo(String value) {
            addCriterion("RegistrationPhoto <=", value, "registrationphoto");
            return (Criteria) this;
        }

        public Criteria andRegistrationphotoLike(String value) {
            addCriterion("RegistrationPhoto like", value, "registrationphoto");
            return (Criteria) this;
        }

        public Criteria andRegistrationphotoNotLike(String value) {
            addCriterion("RegistrationPhoto not like", value, "registrationphoto");
            return (Criteria) this;
        }

        public Criteria andRegistrationphotoIn(List<String> values) {
            addCriterion("RegistrationPhoto in", values, "registrationphoto");
            return (Criteria) this;
        }

        public Criteria andRegistrationphotoNotIn(List<String> values) {
            addCriterion("RegistrationPhoto not in", values, "registrationphoto");
            return (Criteria) this;
        }

        public Criteria andRegistrationphotoBetween(String value1, String value2) {
            addCriterion("RegistrationPhoto between", value1, value2, "registrationphoto");
            return (Criteria) this;
        }

        public Criteria andRegistrationphotoNotBetween(String value1, String value2) {
            addCriterion("RegistrationPhoto not between", value1, value2, "registrationphoto");
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

        public Criteria andIsfailureIsNull() {
            addCriterion("IsFailure is null");
            return (Criteria) this;
        }

        public Criteria andIsfailureIsNotNull() {
            addCriterion("IsFailure is not null");
            return (Criteria) this;
        }

        public Criteria andIsfailureEqualTo(Boolean value) {
            addCriterion("IsFailure =", value, "isfailure");
            return (Criteria) this;
        }

        public Criteria andIsfailureNotEqualTo(Boolean value) {
            addCriterion("IsFailure <>", value, "isfailure");
            return (Criteria) this;
        }

        public Criteria andIsfailureGreaterThan(Boolean value) {
            addCriterion("IsFailure >", value, "isfailure");
            return (Criteria) this;
        }

        public Criteria andIsfailureGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsFailure >=", value, "isfailure");
            return (Criteria) this;
        }

        public Criteria andIsfailureLessThan(Boolean value) {
            addCriterion("IsFailure <", value, "isfailure");
            return (Criteria) this;
        }

        public Criteria andIsfailureLessThanOrEqualTo(Boolean value) {
            addCriterion("IsFailure <=", value, "isfailure");
            return (Criteria) this;
        }

        public Criteria andIsfailureIn(List<Boolean> values) {
            addCriterion("IsFailure in", values, "isfailure");
            return (Criteria) this;
        }

        public Criteria andIsfailureNotIn(List<Boolean> values) {
            addCriterion("IsFailure not in", values, "isfailure");
            return (Criteria) this;
        }

        public Criteria andIsfailureBetween(Boolean value1, Boolean value2) {
            addCriterion("IsFailure between", value1, value2, "isfailure");
            return (Criteria) this;
        }

        public Criteria andIsfailureNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsFailure not between", value1, value2, "isfailure");
            return (Criteria) this;
        }

        public Criteria andChinesenumberIsNull() {
            addCriterion("ChineseNumber is null");
            return (Criteria) this;
        }

        public Criteria andChinesenumberIsNotNull() {
            addCriterion("ChineseNumber is not null");
            return (Criteria) this;
        }

        public Criteria andChinesenumberEqualTo(String value) {
            addCriterion("ChineseNumber =", value, "chinesenumber");
            return (Criteria) this;
        }

        public Criteria andChinesenumberNotEqualTo(String value) {
            addCriterion("ChineseNumber <>", value, "chinesenumber");
            return (Criteria) this;
        }

        public Criteria andChinesenumberGreaterThan(String value) {
            addCriterion("ChineseNumber >", value, "chinesenumber");
            return (Criteria) this;
        }

        public Criteria andChinesenumberGreaterThanOrEqualTo(String value) {
            addCriterion("ChineseNumber >=", value, "chinesenumber");
            return (Criteria) this;
        }

        public Criteria andChinesenumberLessThan(String value) {
            addCriterion("ChineseNumber <", value, "chinesenumber");
            return (Criteria) this;
        }

        public Criteria andChinesenumberLessThanOrEqualTo(String value) {
            addCriterion("ChineseNumber <=", value, "chinesenumber");
            return (Criteria) this;
        }

        public Criteria andChinesenumberLike(String value) {
            addCriterion("ChineseNumber like", value, "chinesenumber");
            return (Criteria) this;
        }

        public Criteria andChinesenumberNotLike(String value) {
            addCriterion("ChineseNumber not like", value, "chinesenumber");
            return (Criteria) this;
        }

        public Criteria andChinesenumberIn(List<String> values) {
            addCriterion("ChineseNumber in", values, "chinesenumber");
            return (Criteria) this;
        }

        public Criteria andChinesenumberNotIn(List<String> values) {
            addCriterion("ChineseNumber not in", values, "chinesenumber");
            return (Criteria) this;
        }

        public Criteria andChinesenumberBetween(String value1, String value2) {
            addCriterion("ChineseNumber between", value1, value2, "chinesenumber");
            return (Criteria) this;
        }

        public Criteria andChinesenumberNotBetween(String value1, String value2) {
            addCriterion("ChineseNumber not between", value1, value2, "chinesenumber");
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

        public Criteria andProductionenterprisenumberIsNull() {
            addCriterion("ProductionEnterpriseNumber is null");
            return (Criteria) this;
        }

        public Criteria andProductionenterprisenumberIsNotNull() {
            addCriterion("ProductionEnterpriseNumber is not null");
            return (Criteria) this;
        }

        public Criteria andProductionenterprisenumberEqualTo(Integer value) {
            addCriterion("ProductionEnterpriseNumber =", value, "productionenterprisenumber");
            return (Criteria) this;
        }

        public Criteria andProductionenterprisenumberNotEqualTo(Integer value) {
            addCriterion("ProductionEnterpriseNumber <>", value, "productionenterprisenumber");
            return (Criteria) this;
        }

        public Criteria andProductionenterprisenumberGreaterThan(Integer value) {
            addCriterion("ProductionEnterpriseNumber >", value, "productionenterprisenumber");
            return (Criteria) this;
        }

        public Criteria andProductionenterprisenumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("ProductionEnterpriseNumber >=", value, "productionenterprisenumber");
            return (Criteria) this;
        }

        public Criteria andProductionenterprisenumberLessThan(Integer value) {
            addCriterion("ProductionEnterpriseNumber <", value, "productionenterprisenumber");
            return (Criteria) this;
        }

        public Criteria andProductionenterprisenumberLessThanOrEqualTo(Integer value) {
            addCriterion("ProductionEnterpriseNumber <=", value, "productionenterprisenumber");
            return (Criteria) this;
        }

        public Criteria andProductionenterprisenumberIn(List<Integer> values) {
            addCriterion("ProductionEnterpriseNumber in", values, "productionenterprisenumber");
            return (Criteria) this;
        }

        public Criteria andProductionenterprisenumberNotIn(List<Integer> values) {
            addCriterion("ProductionEnterpriseNumber not in", values, "productionenterprisenumber");
            return (Criteria) this;
        }

        public Criteria andProductionenterprisenumberBetween(Integer value1, Integer value2) {
            addCriterion("ProductionEnterpriseNumber between", value1, value2, "productionenterprisenumber");
            return (Criteria) this;
        }

        public Criteria andProductionenterprisenumberNotBetween(Integer value1, Integer value2) {
            addCriterion("ProductionEnterpriseNumber not between", value1, value2, "productionenterprisenumber");
            return (Criteria) this;
        }

        public Criteria andApplicationscopeIsNull() {
            addCriterion("ApplicationScope is null");
            return (Criteria) this;
        }

        public Criteria andApplicationscopeIsNotNull() {
            addCriterion("ApplicationScope is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationscopeEqualTo(String value) {
            addCriterion("ApplicationScope =", value, "applicationscope");
            return (Criteria) this;
        }

        public Criteria andApplicationscopeNotEqualTo(String value) {
            addCriterion("ApplicationScope <>", value, "applicationscope");
            return (Criteria) this;
        }

        public Criteria andApplicationscopeGreaterThan(String value) {
            addCriterion("ApplicationScope >", value, "applicationscope");
            return (Criteria) this;
        }

        public Criteria andApplicationscopeGreaterThanOrEqualTo(String value) {
            addCriterion("ApplicationScope >=", value, "applicationscope");
            return (Criteria) this;
        }

        public Criteria andApplicationscopeLessThan(String value) {
            addCriterion("ApplicationScope <", value, "applicationscope");
            return (Criteria) this;
        }

        public Criteria andApplicationscopeLessThanOrEqualTo(String value) {
            addCriterion("ApplicationScope <=", value, "applicationscope");
            return (Criteria) this;
        }

        public Criteria andApplicationscopeLike(String value) {
            addCriterion("ApplicationScope like", value, "applicationscope");
            return (Criteria) this;
        }

        public Criteria andApplicationscopeNotLike(String value) {
            addCriterion("ApplicationScope not like", value, "applicationscope");
            return (Criteria) this;
        }

        public Criteria andApplicationscopeIn(List<String> values) {
            addCriterion("ApplicationScope in", values, "applicationscope");
            return (Criteria) this;
        }

        public Criteria andApplicationscopeNotIn(List<String> values) {
            addCriterion("ApplicationScope not in", values, "applicationscope");
            return (Criteria) this;
        }

        public Criteria andApplicationscopeBetween(String value1, String value2) {
            addCriterion("ApplicationScope between", value1, value2, "applicationscope");
            return (Criteria) this;
        }

        public Criteria andApplicationscopeNotBetween(String value1, String value2) {
            addCriterion("ApplicationScope not between", value1, value2, "applicationscope");
            return (Criteria) this;
        }

        public Criteria andRegisteredagentIsNull() {
            addCriterion("RegisteredAgent is null");
            return (Criteria) this;
        }

        public Criteria andRegisteredagentIsNotNull() {
            addCriterion("RegisteredAgent is not null");
            return (Criteria) this;
        }

        public Criteria andRegisteredagentEqualTo(String value) {
            addCriterion("RegisteredAgent =", value, "registeredagent");
            return (Criteria) this;
        }

        public Criteria andRegisteredagentNotEqualTo(String value) {
            addCriterion("RegisteredAgent <>", value, "registeredagent");
            return (Criteria) this;
        }

        public Criteria andRegisteredagentGreaterThan(String value) {
            addCriterion("RegisteredAgent >", value, "registeredagent");
            return (Criteria) this;
        }

        public Criteria andRegisteredagentGreaterThanOrEqualTo(String value) {
            addCriterion("RegisteredAgent >=", value, "registeredagent");
            return (Criteria) this;
        }

        public Criteria andRegisteredagentLessThan(String value) {
            addCriterion("RegisteredAgent <", value, "registeredagent");
            return (Criteria) this;
        }

        public Criteria andRegisteredagentLessThanOrEqualTo(String value) {
            addCriterion("RegisteredAgent <=", value, "registeredagent");
            return (Criteria) this;
        }

        public Criteria andRegisteredagentLike(String value) {
            addCriterion("RegisteredAgent like", value, "registeredagent");
            return (Criteria) this;
        }

        public Criteria andRegisteredagentNotLike(String value) {
            addCriterion("RegisteredAgent not like", value, "registeredagent");
            return (Criteria) this;
        }

        public Criteria andRegisteredagentIn(List<String> values) {
            addCriterion("RegisteredAgent in", values, "registeredagent");
            return (Criteria) this;
        }

        public Criteria andRegisteredagentNotIn(List<String> values) {
            addCriterion("RegisteredAgent not in", values, "registeredagent");
            return (Criteria) this;
        }

        public Criteria andRegisteredagentBetween(String value1, String value2) {
            addCriterion("RegisteredAgent between", value1, value2, "registeredagent");
            return (Criteria) this;
        }

        public Criteria andRegisteredagentNotBetween(String value1, String value2) {
            addCriterion("RegisteredAgent not between", value1, value2, "registeredagent");
            return (Criteria) this;
        }

        public Criteria andAftersalesserviceIsNull() {
            addCriterion("AfterSalesService is null");
            return (Criteria) this;
        }

        public Criteria andAftersalesserviceIsNotNull() {
            addCriterion("AfterSalesService is not null");
            return (Criteria) this;
        }

        public Criteria andAftersalesserviceEqualTo(String value) {
            addCriterion("AfterSalesService =", value, "aftersalesservice");
            return (Criteria) this;
        }

        public Criteria andAftersalesserviceNotEqualTo(String value) {
            addCriterion("AfterSalesService <>", value, "aftersalesservice");
            return (Criteria) this;
        }

        public Criteria andAftersalesserviceGreaterThan(String value) {
            addCriterion("AfterSalesService >", value, "aftersalesservice");
            return (Criteria) this;
        }

        public Criteria andAftersalesserviceGreaterThanOrEqualTo(String value) {
            addCriterion("AfterSalesService >=", value, "aftersalesservice");
            return (Criteria) this;
        }

        public Criteria andAftersalesserviceLessThan(String value) {
            addCriterion("AfterSalesService <", value, "aftersalesservice");
            return (Criteria) this;
        }

        public Criteria andAftersalesserviceLessThanOrEqualTo(String value) {
            addCriterion("AfterSalesService <=", value, "aftersalesservice");
            return (Criteria) this;
        }

        public Criteria andAftersalesserviceLike(String value) {
            addCriterion("AfterSalesService like", value, "aftersalesservice");
            return (Criteria) this;
        }

        public Criteria andAftersalesserviceNotLike(String value) {
            addCriterion("AfterSalesService not like", value, "aftersalesservice");
            return (Criteria) this;
        }

        public Criteria andAftersalesserviceIn(List<String> values) {
            addCriterion("AfterSalesService in", values, "aftersalesservice");
            return (Criteria) this;
        }

        public Criteria andAftersalesserviceNotIn(List<String> values) {
            addCriterion("AfterSalesService not in", values, "aftersalesservice");
            return (Criteria) this;
        }

        public Criteria andAftersalesserviceBetween(String value1, String value2) {
            addCriterion("AfterSalesService between", value1, value2, "aftersalesservice");
            return (Criteria) this;
        }

        public Criteria andAftersalesserviceNotBetween(String value1, String value2) {
            addCriterion("AfterSalesService not between", value1, value2, "aftersalesservice");
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

        public Criteria andApprovaldateIsNull() {
            addCriterion("ApprovalDate is null");
            return (Criteria) this;
        }

        public Criteria andApprovaldateIsNotNull() {
            addCriterion("ApprovalDate is not null");
            return (Criteria) this;
        }

        public Criteria andApprovaldateEqualTo(Date value) {
            addCriterion("ApprovalDate =", value, "approvaldate");
            return (Criteria) this;
        }

        public Criteria andApprovaldateNotEqualTo(Date value) {
            addCriterion("ApprovalDate <>", value, "approvaldate");
            return (Criteria) this;
        }

        public Criteria andApprovaldateGreaterThan(Date value) {
            addCriterion("ApprovalDate >", value, "approvaldate");
            return (Criteria) this;
        }

        public Criteria andApprovaldateGreaterThanOrEqualTo(Date value) {
            addCriterion("ApprovalDate >=", value, "approvaldate");
            return (Criteria) this;
        }

        public Criteria andApprovaldateLessThan(Date value) {
            addCriterion("ApprovalDate <", value, "approvaldate");
            return (Criteria) this;
        }

        public Criteria andApprovaldateLessThanOrEqualTo(Date value) {
            addCriterion("ApprovalDate <=", value, "approvaldate");
            return (Criteria) this;
        }

        public Criteria andApprovaldateIn(List<Date> values) {
            addCriterion("ApprovalDate in", values, "approvaldate");
            return (Criteria) this;
        }

        public Criteria andApprovaldateNotIn(List<Date> values) {
            addCriterion("ApprovalDate not in", values, "approvaldate");
            return (Criteria) this;
        }

        public Criteria andApprovaldateBetween(Date value1, Date value2) {
            addCriterion("ApprovalDate between", value1, value2, "approvaldate");
            return (Criteria) this;
        }

        public Criteria andApprovaldateNotBetween(Date value1, Date value2) {
            addCriterion("ApprovalDate not between", value1, value2, "approvaldate");
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
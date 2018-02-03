package cn.hhu.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WmsExhistoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;
   
    protected Integer offset;
    protected Integer limit;
    
    public Integer getOffset() {
		return offset;
	}

	public void setOffset(Integer offset) {
		this.offset = offset;
	}

	public Integer getLimit() {
		return limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
	}

	public WmsExhistoryExample() {
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

        public Criteria andExhistoryIdIsNull() {
            addCriterion("EXHistory_ID is null");
            return (Criteria) this;
        }

        public Criteria andExhistoryIdIsNotNull() {
            addCriterion("EXHistory_ID is not null");
            return (Criteria) this;
        }

        public Criteria andExhistoryIdEqualTo(Integer value) {
            addCriterion("EXHistory_ID =", value, "exhistoryId");
            return (Criteria) this;
        }

        public Criteria andExhistoryIdNotEqualTo(Integer value) {
            addCriterion("EXHistory_ID <>", value, "exhistoryId");
            return (Criteria) this;
        }

        public Criteria andExhistoryIdGreaterThan(Integer value) {
            addCriterion("EXHistory_ID >", value, "exhistoryId");
            return (Criteria) this;
        }

        public Criteria andExhistoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("EXHistory_ID >=", value, "exhistoryId");
            return (Criteria) this;
        }

        public Criteria andExhistoryIdLessThan(Integer value) {
            addCriterion("EXHistory_ID <", value, "exhistoryId");
            return (Criteria) this;
        }

        public Criteria andExhistoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("EXHistory_ID <=", value, "exhistoryId");
            return (Criteria) this;
        }

        public Criteria andExhistoryIdIn(List<Integer> values) {
            addCriterion("EXHistory_ID in", values, "exhistoryId");
            return (Criteria) this;
        }

        public Criteria andExhistoryIdNotIn(List<Integer> values) {
            addCriterion("EXHistory_ID not in", values, "exhistoryId");
            return (Criteria) this;
        }

        public Criteria andExhistoryIdBetween(Integer value1, Integer value2) {
            addCriterion("EXHistory_ID between", value1, value2, "exhistoryId");
            return (Criteria) this;
        }

        public Criteria andExhistoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("EXHistory_ID not between", value1, value2, "exhistoryId");
            return (Criteria) this;
        }

        public Criteria andExhistoryNumerIsNull() {
            addCriterion("EXHistory_Numer is null");
            return (Criteria) this;
        }

        public Criteria andExhistoryNumerIsNotNull() {
            addCriterion("EXHistory_Numer is not null");
            return (Criteria) this;
        }

        public Criteria andExhistoryNumerEqualTo(String value) {
            addCriterion("EXHistory_Numer =", value, "exhistoryNumer");
            return (Criteria) this;
        }

        public Criteria andExhistoryNumerNotEqualTo(String value) {
            addCriterion("EXHistory_Numer <>", value, "exhistoryNumer");
            return (Criteria) this;
        }

        public Criteria andExhistoryNumerGreaterThan(String value) {
            addCriterion("EXHistory_Numer >", value, "exhistoryNumer");
            return (Criteria) this;
        }

        public Criteria andExhistoryNumerGreaterThanOrEqualTo(String value) {
            addCriterion("EXHistory_Numer >=", value, "exhistoryNumer");
            return (Criteria) this;
        }

        public Criteria andExhistoryNumerLessThan(String value) {
            addCriterion("EXHistory_Numer <", value, "exhistoryNumer");
            return (Criteria) this;
        }

        public Criteria andExhistoryNumerLessThanOrEqualTo(String value) {
            addCriterion("EXHistory_Numer <=", value, "exhistoryNumer");
            return (Criteria) this;
        }

        public Criteria andExhistoryNumerLike(String value) {
            addCriterion("EXHistory_Numer like", value, "exhistoryNumer");
            return (Criteria) this;
        }

        public Criteria andExhistoryNumerNotLike(String value) {
            addCriterion("EXHistory_Numer not like", value, "exhistoryNumer");
            return (Criteria) this;
        }

        public Criteria andExhistoryNumerIn(List<String> values) {
            addCriterion("EXHistory_Numer in", values, "exhistoryNumer");
            return (Criteria) this;
        }

        public Criteria andExhistoryNumerNotIn(List<String> values) {
            addCriterion("EXHistory_Numer not in", values, "exhistoryNumer");
            return (Criteria) this;
        }

        public Criteria andExhistoryNumerBetween(String value1, String value2) {
            addCriterion("EXHistory_Numer between", value1, value2, "exhistoryNumer");
            return (Criteria) this;
        }

        public Criteria andExhistoryNumerNotBetween(String value1, String value2) {
            addCriterion("EXHistory_Numer not between", value1, value2, "exhistoryNumer");
            return (Criteria) this;
        }

        public Criteria andPriidIsNull() {
            addCriterion("PriID is null");
            return (Criteria) this;
        }

        public Criteria andPriidIsNotNull() {
            addCriterion("PriID is not null");
            return (Criteria) this;
        }

        public Criteria andPriidEqualTo(String value) {
            addCriterion("PriID =", value, "priid");
            return (Criteria) this;
        }

        public Criteria andPriidNotEqualTo(String value) {
            addCriterion("PriID <>", value, "priid");
            return (Criteria) this;
        }

        public Criteria andPriidGreaterThan(String value) {
            addCriterion("PriID >", value, "priid");
            return (Criteria) this;
        }

        public Criteria andPriidGreaterThanOrEqualTo(String value) {
            addCriterion("PriID >=", value, "priid");
            return (Criteria) this;
        }

        public Criteria andPriidLessThan(String value) {
            addCriterion("PriID <", value, "priid");
            return (Criteria) this;
        }

        public Criteria andPriidLessThanOrEqualTo(String value) {
            addCriterion("PriID <=", value, "priid");
            return (Criteria) this;
        }

        public Criteria andPriidLike(String value) {
            addCriterion("PriID like", value, "priid");
            return (Criteria) this;
        }

        public Criteria andPriidNotLike(String value) {
            addCriterion("PriID not like", value, "priid");
            return (Criteria) this;
        }

        public Criteria andPriidIn(List<String> values) {
            addCriterion("PriID in", values, "priid");
            return (Criteria) this;
        }

        public Criteria andPriidNotIn(List<String> values) {
            addCriterion("PriID not in", values, "priid");
            return (Criteria) this;
        }

        public Criteria andPriidBetween(String value1, String value2) {
            addCriterion("PriID between", value1, value2, "priid");
            return (Criteria) this;
        }

        public Criteria andPriidNotBetween(String value1, String value2) {
            addCriterion("PriID not between", value1, value2, "priid");
            return (Criteria) this;
        }

        public Criteria andPrincipalnameIsNull() {
            addCriterion("PrincipalName is null");
            return (Criteria) this;
        }

        public Criteria andPrincipalnameIsNotNull() {
            addCriterion("PrincipalName is not null");
            return (Criteria) this;
        }

        public Criteria andPrincipalnameEqualTo(String value) {
            addCriterion("PrincipalName =", value, "principalname");
            return (Criteria) this;
        }

        public Criteria andPrincipalnameNotEqualTo(String value) {
            addCriterion("PrincipalName <>", value, "principalname");
            return (Criteria) this;
        }

        public Criteria andPrincipalnameGreaterThan(String value) {
            addCriterion("PrincipalName >", value, "principalname");
            return (Criteria) this;
        }

        public Criteria andPrincipalnameGreaterThanOrEqualTo(String value) {
            addCriterion("PrincipalName >=", value, "principalname");
            return (Criteria) this;
        }

        public Criteria andPrincipalnameLessThan(String value) {
            addCriterion("PrincipalName <", value, "principalname");
            return (Criteria) this;
        }

        public Criteria andPrincipalnameLessThanOrEqualTo(String value) {
            addCriterion("PrincipalName <=", value, "principalname");
            return (Criteria) this;
        }

        public Criteria andPrincipalnameLike(String value) {
            addCriterion("PrincipalName like", value, "principalname");
            return (Criteria) this;
        }

        public Criteria andPrincipalnameNotLike(String value) {
            addCriterion("PrincipalName not like", value, "principalname");
            return (Criteria) this;
        }

        public Criteria andPrincipalnameIn(List<String> values) {
            addCriterion("PrincipalName in", values, "principalname");
            return (Criteria) this;
        }

        public Criteria andPrincipalnameNotIn(List<String> values) {
            addCriterion("PrincipalName not in", values, "principalname");
            return (Criteria) this;
        }

        public Criteria andPrincipalnameBetween(String value1, String value2) {
            addCriterion("PrincipalName between", value1, value2, "principalname");
            return (Criteria) this;
        }

        public Criteria andPrincipalnameNotBetween(String value1, String value2) {
            addCriterion("PrincipalName not between", value1, value2, "principalname");
            return (Criteria) this;
        }

        public Criteria andExdateIsNull() {
            addCriterion("EXDate is null");
            return (Criteria) this;
        }

        public Criteria andExdateIsNotNull() {
            addCriterion("EXDate is not null");
            return (Criteria) this;
        }

        public Criteria andExdateEqualTo(Date value) {
            addCriterion("EXDate =", value, "exdate");
            return (Criteria) this;
        }

        public Criteria andExdateNotEqualTo(Date value) {
            addCriterion("EXDate <>", value, "exdate");
            return (Criteria) this;
        }

        public Criteria andExdateGreaterThan(Date value) {
            addCriterion("EXDate >", value, "exdate");
            return (Criteria) this;
        }

        public Criteria andExdateGreaterThanOrEqualTo(Date value) {
            addCriterion("EXDate >=", value, "exdate");
            return (Criteria) this;
        }

        public Criteria andExdateLessThan(Date value) {
            addCriterion("EXDate <", value, "exdate");
            return (Criteria) this;
        }

        public Criteria andExdateLessThanOrEqualTo(Date value) {
            addCriterion("EXDate <=", value, "exdate");
            return (Criteria) this;
        }

        public Criteria andExdateIn(List<Date> values) {
            addCriterion("EXDate in", values, "exdate");
            return (Criteria) this;
        }

        public Criteria andExdateNotIn(List<Date> values) {
            addCriterion("EXDate not in", values, "exdate");
            return (Criteria) this;
        }

        public Criteria andExdateBetween(Date value1, Date value2) {
            addCriterion("EXDate between", value1, value2, "exdate");
            return (Criteria) this;
        }

        public Criteria andExdateNotBetween(Date value1, Date value2) {
            addCriterion("EXDate not between", value1, value2, "exdate");
            return (Criteria) this;
        }

        public Criteria andExtypeIsNull() {
            addCriterion("EXType is null");
            return (Criteria) this;
        }

        public Criteria andExtypeIsNotNull() {
            addCriterion("EXType is not null");
            return (Criteria) this;
        }

        public Criteria andExtypeEqualTo(String value) {
            addCriterion("EXType =", value, "extype");
            return (Criteria) this;
        }

        public Criteria andExtypeNotEqualTo(String value) {
            addCriterion("EXType <>", value, "extype");
            return (Criteria) this;
        }

        public Criteria andExtypeGreaterThan(String value) {
            addCriterion("EXType >", value, "extype");
            return (Criteria) this;
        }

        public Criteria andExtypeGreaterThanOrEqualTo(String value) {
            addCriterion("EXType >=", value, "extype");
            return (Criteria) this;
        }

        public Criteria andExtypeLessThan(String value) {
            addCriterion("EXType <", value, "extype");
            return (Criteria) this;
        }

        public Criteria andExtypeLessThanOrEqualTo(String value) {
            addCriterion("EXType <=", value, "extype");
            return (Criteria) this;
        }

        public Criteria andExtypeLike(String value) {
            addCriterion("EXType like", value, "extype");
            return (Criteria) this;
        }

        public Criteria andExtypeNotLike(String value) {
            addCriterion("EXType not like", value, "extype");
            return (Criteria) this;
        }

        public Criteria andExtypeIn(List<String> values) {
            addCriterion("EXType in", values, "extype");
            return (Criteria) this;
        }

        public Criteria andExtypeNotIn(List<String> values) {
            addCriterion("EXType not in", values, "extype");
            return (Criteria) this;
        }

        public Criteria andExtypeBetween(String value1, String value2) {
            addCriterion("EXType between", value1, value2, "extype");
            return (Criteria) this;
        }

        public Criteria andExtypeNotBetween(String value1, String value2) {
            addCriterion("EXType not between", value1, value2, "extype");
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

        public Criteria andSpecificatintypeIsNull() {
            addCriterion("SpecificatinType is null");
            return (Criteria) this;
        }

        public Criteria andSpecificatintypeIsNotNull() {
            addCriterion("SpecificatinType is not null");
            return (Criteria) this;
        }

        public Criteria andSpecificatintypeEqualTo(String value) {
            addCriterion("SpecificatinType =", value, "specificatintype");
            return (Criteria) this;
        }

        public Criteria andSpecificatintypeNotEqualTo(String value) {
            addCriterion("SpecificatinType <>", value, "specificatintype");
            return (Criteria) this;
        }

        public Criteria andSpecificatintypeGreaterThan(String value) {
            addCriterion("SpecificatinType >", value, "specificatintype");
            return (Criteria) this;
        }

        public Criteria andSpecificatintypeGreaterThanOrEqualTo(String value) {
            addCriterion("SpecificatinType >=", value, "specificatintype");
            return (Criteria) this;
        }

        public Criteria andSpecificatintypeLessThan(String value) {
            addCriterion("SpecificatinType <", value, "specificatintype");
            return (Criteria) this;
        }

        public Criteria andSpecificatintypeLessThanOrEqualTo(String value) {
            addCriterion("SpecificatinType <=", value, "specificatintype");
            return (Criteria) this;
        }

        public Criteria andSpecificatintypeLike(String value) {
            addCriterion("SpecificatinType like", value, "specificatintype");
            return (Criteria) this;
        }

        public Criteria andSpecificatintypeNotLike(String value) {
            addCriterion("SpecificatinType not like", value, "specificatintype");
            return (Criteria) this;
        }

        public Criteria andSpecificatintypeIn(List<String> values) {
            addCriterion("SpecificatinType in", values, "specificatintype");
            return (Criteria) this;
        }

        public Criteria andSpecificatintypeNotIn(List<String> values) {
            addCriterion("SpecificatinType not in", values, "specificatintype");
            return (Criteria) this;
        }

        public Criteria andSpecificatintypeBetween(String value1, String value2) {
            addCriterion("SpecificatinType between", value1, value2, "specificatintype");
            return (Criteria) this;
        }

        public Criteria andSpecificatintypeNotBetween(String value1, String value2) {
            addCriterion("SpecificatinType not between", value1, value2, "specificatintype");
            return (Criteria) this;
        }

        public Criteria andProduceenterpriseIsNull() {
            addCriterion("ProduceEnterprise is null");
            return (Criteria) this;
        }

        public Criteria andProduceenterpriseIsNotNull() {
            addCriterion("ProduceEnterprise is not null");
            return (Criteria) this;
        }

        public Criteria andProduceenterpriseEqualTo(String value) {
            addCriterion("ProduceEnterprise =", value, "produceenterprise");
            return (Criteria) this;
        }

        public Criteria andProduceenterpriseNotEqualTo(String value) {
            addCriterion("ProduceEnterprise <>", value, "produceenterprise");
            return (Criteria) this;
        }

        public Criteria andProduceenterpriseGreaterThan(String value) {
            addCriterion("ProduceEnterprise >", value, "produceenterprise");
            return (Criteria) this;
        }

        public Criteria andProduceenterpriseGreaterThanOrEqualTo(String value) {
            addCriterion("ProduceEnterprise >=", value, "produceenterprise");
            return (Criteria) this;
        }

        public Criteria andProduceenterpriseLessThan(String value) {
            addCriterion("ProduceEnterprise <", value, "produceenterprise");
            return (Criteria) this;
        }

        public Criteria andProduceenterpriseLessThanOrEqualTo(String value) {
            addCriterion("ProduceEnterprise <=", value, "produceenterprise");
            return (Criteria) this;
        }

        public Criteria andProduceenterpriseLike(String value) {
            addCriterion("ProduceEnterprise like", value, "produceenterprise");
            return (Criteria) this;
        }

        public Criteria andProduceenterpriseNotLike(String value) {
            addCriterion("ProduceEnterprise not like", value, "produceenterprise");
            return (Criteria) this;
        }

        public Criteria andProduceenterpriseIn(List<String> values) {
            addCriterion("ProduceEnterprise in", values, "produceenterprise");
            return (Criteria) this;
        }

        public Criteria andProduceenterpriseNotIn(List<String> values) {
            addCriterion("ProduceEnterprise not in", values, "produceenterprise");
            return (Criteria) this;
        }

        public Criteria andProduceenterpriseBetween(String value1, String value2) {
            addCriterion("ProduceEnterprise between", value1, value2, "produceenterprise");
            return (Criteria) this;
        }

        public Criteria andProduceenterpriseNotBetween(String value1, String value2) {
            addCriterion("ProduceEnterprise not between", value1, value2, "produceenterprise");
            return (Criteria) this;
        }

        public Criteria andProduceregistrationnumberorrecordcertificatenumberIsNull() {
            addCriterion("ProduceRegistrationNumberOrRecordCertificateNumber is null");
            return (Criteria) this;
        }

        public Criteria andProduceregistrationnumberorrecordcertificatenumberIsNotNull() {
            addCriterion("ProduceRegistrationNumberOrRecordCertificateNumber is not null");
            return (Criteria) this;
        }

        public Criteria andProduceregistrationnumberorrecordcertificatenumberEqualTo(String value) {
            addCriterion("ProduceRegistrationNumberOrRecordCertificateNumber =", value, "produceregistrationnumberorrecordcertificatenumber");
            return (Criteria) this;
        }

        public Criteria andProduceregistrationnumberorrecordcertificatenumberNotEqualTo(String value) {
            addCriterion("ProduceRegistrationNumberOrRecordCertificateNumber <>", value, "produceregistrationnumberorrecordcertificatenumber");
            return (Criteria) this;
        }

        public Criteria andProduceregistrationnumberorrecordcertificatenumberGreaterThan(String value) {
            addCriterion("ProduceRegistrationNumberOrRecordCertificateNumber >", value, "produceregistrationnumberorrecordcertificatenumber");
            return (Criteria) this;
        }

        public Criteria andProduceregistrationnumberorrecordcertificatenumberGreaterThanOrEqualTo(String value) {
            addCriterion("ProduceRegistrationNumberOrRecordCertificateNumber >=", value, "produceregistrationnumberorrecordcertificatenumber");
            return (Criteria) this;
        }

        public Criteria andProduceregistrationnumberorrecordcertificatenumberLessThan(String value) {
            addCriterion("ProduceRegistrationNumberOrRecordCertificateNumber <", value, "produceregistrationnumberorrecordcertificatenumber");
            return (Criteria) this;
        }

        public Criteria andProduceregistrationnumberorrecordcertificatenumberLessThanOrEqualTo(String value) {
            addCriterion("ProduceRegistrationNumberOrRecordCertificateNumber <=", value, "produceregistrationnumberorrecordcertificatenumber");
            return (Criteria) this;
        }

        public Criteria andProduceregistrationnumberorrecordcertificatenumberLike(String value) {
            addCriterion("ProduceRegistrationNumberOrRecordCertificateNumber like", value, "produceregistrationnumberorrecordcertificatenumber");
            return (Criteria) this;
        }

        public Criteria andProduceregistrationnumberorrecordcertificatenumberNotLike(String value) {
            addCriterion("ProduceRegistrationNumberOrRecordCertificateNumber not like", value, "produceregistrationnumberorrecordcertificatenumber");
            return (Criteria) this;
        }

        public Criteria andProduceregistrationnumberorrecordcertificatenumberIn(List<String> values) {
            addCriterion("ProduceRegistrationNumberOrRecordCertificateNumber in", values, "produceregistrationnumberorrecordcertificatenumber");
            return (Criteria) this;
        }

        public Criteria andProduceregistrationnumberorrecordcertificatenumberNotIn(List<String> values) {
            addCriterion("ProduceRegistrationNumberOrRecordCertificateNumber not in", values, "produceregistrationnumberorrecordcertificatenumber");
            return (Criteria) this;
        }

        public Criteria andProduceregistrationnumberorrecordcertificatenumberBetween(String value1, String value2) {
            addCriterion("ProduceRegistrationNumberOrRecordCertificateNumber between", value1, value2, "produceregistrationnumberorrecordcertificatenumber");
            return (Criteria) this;
        }

        public Criteria andProduceregistrationnumberorrecordcertificatenumberNotBetween(String value1, String value2) {
            addCriterion("ProduceRegistrationNumberOrRecordCertificateNumber not between", value1, value2, "produceregistrationnumberorrecordcertificatenumber");
            return (Criteria) this;
        }

        public Criteria andProducebatchnumberorserialnumberIsNull() {
            addCriterion("ProduceBatchNumberOrSerialNumber is null");
            return (Criteria) this;
        }

        public Criteria andProducebatchnumberorserialnumberIsNotNull() {
            addCriterion("ProduceBatchNumberOrSerialNumber is not null");
            return (Criteria) this;
        }

        public Criteria andProducebatchnumberorserialnumberEqualTo(String value) {
            addCriterion("ProduceBatchNumberOrSerialNumber =", value, "producebatchnumberorserialnumber");
            return (Criteria) this;
        }

        public Criteria andProducebatchnumberorserialnumberNotEqualTo(String value) {
            addCriterion("ProduceBatchNumberOrSerialNumber <>", value, "producebatchnumberorserialnumber");
            return (Criteria) this;
        }

        public Criteria andProducebatchnumberorserialnumberGreaterThan(String value) {
            addCriterion("ProduceBatchNumberOrSerialNumber >", value, "producebatchnumberorserialnumber");
            return (Criteria) this;
        }

        public Criteria andProducebatchnumberorserialnumberGreaterThanOrEqualTo(String value) {
            addCriterion("ProduceBatchNumberOrSerialNumber >=", value, "producebatchnumberorserialnumber");
            return (Criteria) this;
        }

        public Criteria andProducebatchnumberorserialnumberLessThan(String value) {
            addCriterion("ProduceBatchNumberOrSerialNumber <", value, "producebatchnumberorserialnumber");
            return (Criteria) this;
        }

        public Criteria andProducebatchnumberorserialnumberLessThanOrEqualTo(String value) {
            addCriterion("ProduceBatchNumberOrSerialNumber <=", value, "producebatchnumberorserialnumber");
            return (Criteria) this;
        }

        public Criteria andProducebatchnumberorserialnumberLike(String value) {
            addCriterion("ProduceBatchNumberOrSerialNumber like", value, "producebatchnumberorserialnumber");
            return (Criteria) this;
        }

        public Criteria andProducebatchnumberorserialnumberNotLike(String value) {
            addCriterion("ProduceBatchNumberOrSerialNumber not like", value, "producebatchnumberorserialnumber");
            return (Criteria) this;
        }

        public Criteria andProducebatchnumberorserialnumberIn(List<String> values) {
            addCriterion("ProduceBatchNumberOrSerialNumber in", values, "producebatchnumberorserialnumber");
            return (Criteria) this;
        }

        public Criteria andProducebatchnumberorserialnumberNotIn(List<String> values) {
            addCriterion("ProduceBatchNumberOrSerialNumber not in", values, "producebatchnumberorserialnumber");
            return (Criteria) this;
        }

        public Criteria andProducebatchnumberorserialnumberBetween(String value1, String value2) {
            addCriterion("ProduceBatchNumberOrSerialNumber between", value1, value2, "producebatchnumberorserialnumber");
            return (Criteria) this;
        }

        public Criteria andProducebatchnumberorserialnumberNotBetween(String value1, String value2) {
            addCriterion("ProduceBatchNumberOrSerialNumber not between", value1, value2, "producebatchnumberorserialnumber");
            return (Criteria) this;
        }

        public Criteria andStoragetransportationconditionIsNull() {
            addCriterion("StorageTransportationCondition is null");
            return (Criteria) this;
        }

        public Criteria andStoragetransportationconditionIsNotNull() {
            addCriterion("StorageTransportationCondition is not null");
            return (Criteria) this;
        }

        public Criteria andStoragetransportationconditionEqualTo(String value) {
            addCriterion("StorageTransportationCondition =", value, "storagetransportationcondition");
            return (Criteria) this;
        }

        public Criteria andStoragetransportationconditionNotEqualTo(String value) {
            addCriterion("StorageTransportationCondition <>", value, "storagetransportationcondition");
            return (Criteria) this;
        }

        public Criteria andStoragetransportationconditionGreaterThan(String value) {
            addCriterion("StorageTransportationCondition >", value, "storagetransportationcondition");
            return (Criteria) this;
        }

        public Criteria andStoragetransportationconditionGreaterThanOrEqualTo(String value) {
            addCriterion("StorageTransportationCondition >=", value, "storagetransportationcondition");
            return (Criteria) this;
        }

        public Criteria andStoragetransportationconditionLessThan(String value) {
            addCriterion("StorageTransportationCondition <", value, "storagetransportationcondition");
            return (Criteria) this;
        }

        public Criteria andStoragetransportationconditionLessThanOrEqualTo(String value) {
            addCriterion("StorageTransportationCondition <=", value, "storagetransportationcondition");
            return (Criteria) this;
        }

        public Criteria andStoragetransportationconditionLike(String value) {
            addCriterion("StorageTransportationCondition like", value, "storagetransportationcondition");
            return (Criteria) this;
        }

        public Criteria andStoragetransportationconditionNotLike(String value) {
            addCriterion("StorageTransportationCondition not like", value, "storagetransportationcondition");
            return (Criteria) this;
        }

        public Criteria andStoragetransportationconditionIn(List<String> values) {
            addCriterion("StorageTransportationCondition in", values, "storagetransportationcondition");
            return (Criteria) this;
        }

        public Criteria andStoragetransportationconditionNotIn(List<String> values) {
            addCriterion("StorageTransportationCondition not in", values, "storagetransportationcondition");
            return (Criteria) this;
        }

        public Criteria andStoragetransportationconditionBetween(String value1, String value2) {
            addCriterion("StorageTransportationCondition between", value1, value2, "storagetransportationcondition");
            return (Criteria) this;
        }

        public Criteria andStoragetransportationconditionNotBetween(String value1, String value2) {
            addCriterion("StorageTransportationCondition not between", value1, value2, "storagetransportationcondition");
            return (Criteria) this;
        }

        public Criteria andProducedateandvalidityIsNull() {
            addCriterion("ProduceDateAndValidity is null");
            return (Criteria) this;
        }

        public Criteria andProducedateandvalidityIsNotNull() {
            addCriterion("ProduceDateAndValidity is not null");
            return (Criteria) this;
        }

        public Criteria andProducedateandvalidityEqualTo(String value) {
            addCriterion("ProduceDateAndValidity =", value, "producedateandvalidity");
            return (Criteria) this;
        }

        public Criteria andProducedateandvalidityNotEqualTo(String value) {
            addCriterion("ProduceDateAndValidity <>", value, "producedateandvalidity");
            return (Criteria) this;
        }

        public Criteria andProducedateandvalidityGreaterThan(String value) {
            addCriterion("ProduceDateAndValidity >", value, "producedateandvalidity");
            return (Criteria) this;
        }

        public Criteria andProducedateandvalidityGreaterThanOrEqualTo(String value) {
            addCriterion("ProduceDateAndValidity >=", value, "producedateandvalidity");
            return (Criteria) this;
        }

        public Criteria andProducedateandvalidityLessThan(String value) {
            addCriterion("ProduceDateAndValidity <", value, "producedateandvalidity");
            return (Criteria) this;
        }

        public Criteria andProducedateandvalidityLessThanOrEqualTo(String value) {
            addCriterion("ProduceDateAndValidity <=", value, "producedateandvalidity");
            return (Criteria) this;
        }

        public Criteria andProducedateandvalidityLike(String value) {
            addCriterion("ProduceDateAndValidity like", value, "producedateandvalidity");
            return (Criteria) this;
        }

        public Criteria andProducedateandvalidityNotLike(String value) {
            addCriterion("ProduceDateAndValidity not like", value, "producedateandvalidity");
            return (Criteria) this;
        }

        public Criteria andProducedateandvalidityIn(List<String> values) {
            addCriterion("ProduceDateAndValidity in", values, "producedateandvalidity");
            return (Criteria) this;
        }

        public Criteria andProducedateandvalidityNotIn(List<String> values) {
            addCriterion("ProduceDateAndValidity not in", values, "producedateandvalidity");
            return (Criteria) this;
        }

        public Criteria andProducedateandvalidityBetween(String value1, String value2) {
            addCriterion("ProduceDateAndValidity between", value1, value2, "producedateandvalidity");
            return (Criteria) this;
        }

        public Criteria andProducedateandvalidityNotBetween(String value1, String value2) {
            addCriterion("ProduceDateAndValidity not between", value1, value2, "producedateandvalidity");
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

        public Criteria andQuantityIsNull() {
            addCriterion("Quantity is null");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNotNull() {
            addCriterion("Quantity is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityEqualTo(String value) {
            addCriterion("Quantity =", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotEqualTo(String value) {
            addCriterion("Quantity <>", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThan(String value) {
            addCriterion("Quantity >", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThanOrEqualTo(String value) {
            addCriterion("Quantity >=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThan(String value) {
            addCriterion("Quantity <", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThanOrEqualTo(String value) {
            addCriterion("Quantity <=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLike(String value) {
            addCriterion("Quantity like", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotLike(String value) {
            addCriterion("Quantity not like", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityIn(List<String> values) {
            addCriterion("Quantity in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotIn(List<String> values) {
            addCriterion("Quantity not in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityBetween(String value1, String value2) {
            addCriterion("Quantity between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotBetween(String value1, String value2) {
            addCriterion("Quantity not between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andReceivingcustomernameIsNull() {
            addCriterion("ReceivingCustomerName is null");
            return (Criteria) this;
        }

        public Criteria andReceivingcustomernameIsNotNull() {
            addCriterion("ReceivingCustomerName is not null");
            return (Criteria) this;
        }

        public Criteria andReceivingcustomernameEqualTo(String value) {
            addCriterion("ReceivingCustomerName =", value, "receivingcustomername");
            return (Criteria) this;
        }

        public Criteria andReceivingcustomernameNotEqualTo(String value) {
            addCriterion("ReceivingCustomerName <>", value, "receivingcustomername");
            return (Criteria) this;
        }

        public Criteria andReceivingcustomernameGreaterThan(String value) {
            addCriterion("ReceivingCustomerName >", value, "receivingcustomername");
            return (Criteria) this;
        }

        public Criteria andReceivingcustomernameGreaterThanOrEqualTo(String value) {
            addCriterion("ReceivingCustomerName >=", value, "receivingcustomername");
            return (Criteria) this;
        }

        public Criteria andReceivingcustomernameLessThan(String value) {
            addCriterion("ReceivingCustomerName <", value, "receivingcustomername");
            return (Criteria) this;
        }

        public Criteria andReceivingcustomernameLessThanOrEqualTo(String value) {
            addCriterion("ReceivingCustomerName <=", value, "receivingcustomername");
            return (Criteria) this;
        }

        public Criteria andReceivingcustomernameLike(String value) {
            addCriterion("ReceivingCustomerName like", value, "receivingcustomername");
            return (Criteria) this;
        }

        public Criteria andReceivingcustomernameNotLike(String value) {
            addCriterion("ReceivingCustomerName not like", value, "receivingcustomername");
            return (Criteria) this;
        }

        public Criteria andReceivingcustomernameIn(List<String> values) {
            addCriterion("ReceivingCustomerName in", values, "receivingcustomername");
            return (Criteria) this;
        }

        public Criteria andReceivingcustomernameNotIn(List<String> values) {
            addCriterion("ReceivingCustomerName not in", values, "receivingcustomername");
            return (Criteria) this;
        }

        public Criteria andReceivingcustomernameBetween(String value1, String value2) {
            addCriterion("ReceivingCustomerName between", value1, value2, "receivingcustomername");
            return (Criteria) this;
        }

        public Criteria andReceivingcustomernameNotBetween(String value1, String value2) {
            addCriterion("ReceivingCustomerName not between", value1, value2, "receivingcustomername");
            return (Criteria) this;
        }

        public Criteria andReceivingaddressIsNull() {
            addCriterion("ReceivingAddress is null");
            return (Criteria) this;
        }

        public Criteria andReceivingaddressIsNotNull() {
            addCriterion("ReceivingAddress is not null");
            return (Criteria) this;
        }

        public Criteria andReceivingaddressEqualTo(String value) {
            addCriterion("ReceivingAddress =", value, "receivingaddress");
            return (Criteria) this;
        }

        public Criteria andReceivingaddressNotEqualTo(String value) {
            addCriterion("ReceivingAddress <>", value, "receivingaddress");
            return (Criteria) this;
        }

        public Criteria andReceivingaddressGreaterThan(String value) {
            addCriterion("ReceivingAddress >", value, "receivingaddress");
            return (Criteria) this;
        }

        public Criteria andReceivingaddressGreaterThanOrEqualTo(String value) {
            addCriterion("ReceivingAddress >=", value, "receivingaddress");
            return (Criteria) this;
        }

        public Criteria andReceivingaddressLessThan(String value) {
            addCriterion("ReceivingAddress <", value, "receivingaddress");
            return (Criteria) this;
        }

        public Criteria andReceivingaddressLessThanOrEqualTo(String value) {
            addCriterion("ReceivingAddress <=", value, "receivingaddress");
            return (Criteria) this;
        }

        public Criteria andReceivingaddressLike(String value) {
            addCriterion("ReceivingAddress like", value, "receivingaddress");
            return (Criteria) this;
        }

        public Criteria andReceivingaddressNotLike(String value) {
            addCriterion("ReceivingAddress not like", value, "receivingaddress");
            return (Criteria) this;
        }

        public Criteria andReceivingaddressIn(List<String> values) {
            addCriterion("ReceivingAddress in", values, "receivingaddress");
            return (Criteria) this;
        }

        public Criteria andReceivingaddressNotIn(List<String> values) {
            addCriterion("ReceivingAddress not in", values, "receivingaddress");
            return (Criteria) this;
        }

        public Criteria andReceivingaddressBetween(String value1, String value2) {
            addCriterion("ReceivingAddress between", value1, value2, "receivingaddress");
            return (Criteria) this;
        }

        public Criteria andReceivingaddressNotBetween(String value1, String value2) {
            addCriterion("ReceivingAddress not between", value1, value2, "receivingaddress");
            return (Criteria) this;
        }

        public Criteria andContactmanIsNull() {
            addCriterion("ContactMan is null");
            return (Criteria) this;
        }

        public Criteria andContactmanIsNotNull() {
            addCriterion("ContactMan is not null");
            return (Criteria) this;
        }

        public Criteria andContactmanEqualTo(String value) {
            addCriterion("ContactMan =", value, "contactman");
            return (Criteria) this;
        }

        public Criteria andContactmanNotEqualTo(String value) {
            addCriterion("ContactMan <>", value, "contactman");
            return (Criteria) this;
        }

        public Criteria andContactmanGreaterThan(String value) {
            addCriterion("ContactMan >", value, "contactman");
            return (Criteria) this;
        }

        public Criteria andContactmanGreaterThanOrEqualTo(String value) {
            addCriterion("ContactMan >=", value, "contactman");
            return (Criteria) this;
        }

        public Criteria andContactmanLessThan(String value) {
            addCriterion("ContactMan <", value, "contactman");
            return (Criteria) this;
        }

        public Criteria andContactmanLessThanOrEqualTo(String value) {
            addCriterion("ContactMan <=", value, "contactman");
            return (Criteria) this;
        }

        public Criteria andContactmanLike(String value) {
            addCriterion("ContactMan like", value, "contactman");
            return (Criteria) this;
        }

        public Criteria andContactmanNotLike(String value) {
            addCriterion("ContactMan not like", value, "contactman");
            return (Criteria) this;
        }

        public Criteria andContactmanIn(List<String> values) {
            addCriterion("ContactMan in", values, "contactman");
            return (Criteria) this;
        }

        public Criteria andContactmanNotIn(List<String> values) {
            addCriterion("ContactMan not in", values, "contactman");
            return (Criteria) this;
        }

        public Criteria andContactmanBetween(String value1, String value2) {
            addCriterion("ContactMan between", value1, value2, "contactman");
            return (Criteria) this;
        }

        public Criteria andContactmanNotBetween(String value1, String value2) {
            addCriterion("ContactMan not between", value1, value2, "contactman");
            return (Criteria) this;
        }

        public Criteria andContacttelIsNull() {
            addCriterion("ContactTel is null");
            return (Criteria) this;
        }

        public Criteria andContacttelIsNotNull() {
            addCriterion("ContactTel is not null");
            return (Criteria) this;
        }

        public Criteria andContacttelEqualTo(String value) {
            addCriterion("ContactTel =", value, "contacttel");
            return (Criteria) this;
        }

        public Criteria andContacttelNotEqualTo(String value) {
            addCriterion("ContactTel <>", value, "contacttel");
            return (Criteria) this;
        }

        public Criteria andContacttelGreaterThan(String value) {
            addCriterion("ContactTel >", value, "contacttel");
            return (Criteria) this;
        }

        public Criteria andContacttelGreaterThanOrEqualTo(String value) {
            addCriterion("ContactTel >=", value, "contacttel");
            return (Criteria) this;
        }

        public Criteria andContacttelLessThan(String value) {
            addCriterion("ContactTel <", value, "contacttel");
            return (Criteria) this;
        }

        public Criteria andContacttelLessThanOrEqualTo(String value) {
            addCriterion("ContactTel <=", value, "contacttel");
            return (Criteria) this;
        }

        public Criteria andContacttelLike(String value) {
            addCriterion("ContactTel like", value, "contacttel");
            return (Criteria) this;
        }

        public Criteria andContacttelNotLike(String value) {
            addCriterion("ContactTel not like", value, "contacttel");
            return (Criteria) this;
        }

        public Criteria andContacttelIn(List<String> values) {
            addCriterion("ContactTel in", values, "contacttel");
            return (Criteria) this;
        }

        public Criteria andContacttelNotIn(List<String> values) {
            addCriterion("ContactTel not in", values, "contacttel");
            return (Criteria) this;
        }

        public Criteria andContacttelBetween(String value1, String value2) {
            addCriterion("ContactTel between", value1, value2, "contacttel");
            return (Criteria) this;
        }

        public Criteria andContacttelNotBetween(String value1, String value2) {
            addCriterion("ContactTel not between", value1, value2, "contacttel");
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
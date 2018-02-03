package cn.hhu.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WmsBaseShipperExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WmsBaseShipperExample() {
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

        public Criteria andClientIdIsNull() {
            addCriterion("Client_ID is null");
            return (Criteria) this;
        }

        public Criteria andClientIdIsNotNull() {
            addCriterion("Client_ID is not null");
            return (Criteria) this;
        }

        public Criteria andClientIdEqualTo(Integer value) {
            addCriterion("Client_ID =", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdNotEqualTo(Integer value) {
            addCriterion("Client_ID <>", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdGreaterThan(Integer value) {
            addCriterion("Client_ID >", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Client_ID >=", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdLessThan(Integer value) {
            addCriterion("Client_ID <", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdLessThanOrEqualTo(Integer value) {
            addCriterion("Client_ID <=", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdIn(List<Integer> values) {
            addCriterion("Client_ID in", values, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdNotIn(List<Integer> values) {
            addCriterion("Client_ID not in", values, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdBetween(Integer value1, Integer value2) {
            addCriterion("Client_ID between", value1, value2, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Client_ID not between", value1, value2, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientNumberIsNull() {
            addCriterion("Client_Number is null");
            return (Criteria) this;
        }

        public Criteria andClientNumberIsNotNull() {
            addCriterion("Client_Number is not null");
            return (Criteria) this;
        }

        public Criteria andClientNumberEqualTo(String value) {
            addCriterion("Client_Number =", value, "clientNumber");
            return (Criteria) this;
        }

        public Criteria andClientNumberNotEqualTo(String value) {
            addCriterion("Client_Number <>", value, "clientNumber");
            return (Criteria) this;
        }

        public Criteria andClientNumberGreaterThan(String value) {
            addCriterion("Client_Number >", value, "clientNumber");
            return (Criteria) this;
        }

        public Criteria andClientNumberGreaterThanOrEqualTo(String value) {
            addCriterion("Client_Number >=", value, "clientNumber");
            return (Criteria) this;
        }

        public Criteria andClientNumberLessThan(String value) {
            addCriterion("Client_Number <", value, "clientNumber");
            return (Criteria) this;
        }

        public Criteria andClientNumberLessThanOrEqualTo(String value) {
            addCriterion("Client_Number <=", value, "clientNumber");
            return (Criteria) this;
        }

        public Criteria andClientNumberLike(String value) {
            addCriterion("Client_Number like", value, "clientNumber");
            return (Criteria) this;
        }

        public Criteria andClientNumberNotLike(String value) {
            addCriterion("Client_Number not like", value, "clientNumber");
            return (Criteria) this;
        }

        public Criteria andClientNumberIn(List<String> values) {
            addCriterion("Client_Number in", values, "clientNumber");
            return (Criteria) this;
        }

        public Criteria andClientNumberNotIn(List<String> values) {
            addCriterion("Client_Number not in", values, "clientNumber");
            return (Criteria) this;
        }

        public Criteria andClientNumberBetween(String value1, String value2) {
            addCriterion("Client_Number between", value1, value2, "clientNumber");
            return (Criteria) this;
        }

        public Criteria andClientNumberNotBetween(String value1, String value2) {
            addCriterion("Client_Number not between", value1, value2, "clientNumber");
            return (Criteria) this;
        }

        public Criteria andClientabbreviationIsNull() {
            addCriterion("ClientAbbreviation is null");
            return (Criteria) this;
        }

        public Criteria andClientabbreviationIsNotNull() {
            addCriterion("ClientAbbreviation is not null");
            return (Criteria) this;
        }

        public Criteria andClientabbreviationEqualTo(String value) {
            addCriterion("ClientAbbreviation =", value, "clientabbreviation");
            return (Criteria) this;
        }

        public Criteria andClientabbreviationNotEqualTo(String value) {
            addCriterion("ClientAbbreviation <>", value, "clientabbreviation");
            return (Criteria) this;
        }

        public Criteria andClientabbreviationGreaterThan(String value) {
            addCriterion("ClientAbbreviation >", value, "clientabbreviation");
            return (Criteria) this;
        }

        public Criteria andClientabbreviationGreaterThanOrEqualTo(String value) {
            addCriterion("ClientAbbreviation >=", value, "clientabbreviation");
            return (Criteria) this;
        }

        public Criteria andClientabbreviationLessThan(String value) {
            addCriterion("ClientAbbreviation <", value, "clientabbreviation");
            return (Criteria) this;
        }

        public Criteria andClientabbreviationLessThanOrEqualTo(String value) {
            addCriterion("ClientAbbreviation <=", value, "clientabbreviation");
            return (Criteria) this;
        }

        public Criteria andClientabbreviationLike(String value) {
            addCriterion("ClientAbbreviation like", value, "clientabbreviation");
            return (Criteria) this;
        }

        public Criteria andClientabbreviationNotLike(String value) {
            addCriterion("ClientAbbreviation not like", value, "clientabbreviation");
            return (Criteria) this;
        }

        public Criteria andClientabbreviationIn(List<String> values) {
            addCriterion("ClientAbbreviation in", values, "clientabbreviation");
            return (Criteria) this;
        }

        public Criteria andClientabbreviationNotIn(List<String> values) {
            addCriterion("ClientAbbreviation not in", values, "clientabbreviation");
            return (Criteria) this;
        }

        public Criteria andClientabbreviationBetween(String value1, String value2) {
            addCriterion("ClientAbbreviation between", value1, value2, "clientabbreviation");
            return (Criteria) this;
        }

        public Criteria andClientabbreviationNotBetween(String value1, String value2) {
            addCriterion("ClientAbbreviation not between", value1, value2, "clientabbreviation");
            return (Criteria) this;
        }

        public Criteria andClientnameIsNull() {
            addCriterion("ClientName is null");
            return (Criteria) this;
        }

        public Criteria andClientnameIsNotNull() {
            addCriterion("ClientName is not null");
            return (Criteria) this;
        }

        public Criteria andClientnameEqualTo(String value) {
            addCriterion("ClientName =", value, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameNotEqualTo(String value) {
            addCriterion("ClientName <>", value, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameGreaterThan(String value) {
            addCriterion("ClientName >", value, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameGreaterThanOrEqualTo(String value) {
            addCriterion("ClientName >=", value, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameLessThan(String value) {
            addCriterion("ClientName <", value, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameLessThanOrEqualTo(String value) {
            addCriterion("ClientName <=", value, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameLike(String value) {
            addCriterion("ClientName like", value, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameNotLike(String value) {
            addCriterion("ClientName not like", value, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameIn(List<String> values) {
            addCriterion("ClientName in", values, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameNotIn(List<String> values) {
            addCriterion("ClientName not in", values, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameBetween(String value1, String value2) {
            addCriterion("ClientName between", value1, value2, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameNotBetween(String value1, String value2) {
            addCriterion("ClientName not between", value1, value2, "clientname");
            return (Criteria) this;
        }

        public Criteria andClienttypeIsNull() {
            addCriterion("ClientType is null");
            return (Criteria) this;
        }

        public Criteria andClienttypeIsNotNull() {
            addCriterion("ClientType is not null");
            return (Criteria) this;
        }

        public Criteria andClienttypeEqualTo(Integer value) {
            addCriterion("ClientType =", value, "clienttype");
            return (Criteria) this;
        }

        public Criteria andClienttypeNotEqualTo(Integer value) {
            addCriterion("ClientType <>", value, "clienttype");
            return (Criteria) this;
        }

        public Criteria andClienttypeGreaterThan(Integer value) {
            addCriterion("ClientType >", value, "clienttype");
            return (Criteria) this;
        }

        public Criteria andClienttypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ClientType >=", value, "clienttype");
            return (Criteria) this;
        }

        public Criteria andClienttypeLessThan(Integer value) {
            addCriterion("ClientType <", value, "clienttype");
            return (Criteria) this;
        }

        public Criteria andClienttypeLessThanOrEqualTo(Integer value) {
            addCriterion("ClientType <=", value, "clienttype");
            return (Criteria) this;
        }

        public Criteria andClienttypeIn(List<Integer> values) {
            addCriterion("ClientType in", values, "clienttype");
            return (Criteria) this;
        }

        public Criteria andClienttypeNotIn(List<Integer> values) {
            addCriterion("ClientType not in", values, "clienttype");
            return (Criteria) this;
        }

        public Criteria andClienttypeBetween(Integer value1, Integer value2) {
            addCriterion("ClientType between", value1, value2, "clienttype");
            return (Criteria) this;
        }

        public Criteria andClienttypeNotBetween(Integer value1, Integer value2) {
            addCriterion("ClientType not between", value1, value2, "clienttype");
            return (Criteria) this;
        }

        public Criteria andContractIdIsNull() {
            addCriterion("Contract_ID is null");
            return (Criteria) this;
        }

        public Criteria andContractIdIsNotNull() {
            addCriterion("Contract_ID is not null");
            return (Criteria) this;
        }

        public Criteria andContractIdEqualTo(String value) {
            addCriterion("Contract_ID =", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotEqualTo(String value) {
            addCriterion("Contract_ID <>", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdGreaterThan(String value) {
            addCriterion("Contract_ID >", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdGreaterThanOrEqualTo(String value) {
            addCriterion("Contract_ID >=", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdLessThan(String value) {
            addCriterion("Contract_ID <", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdLessThanOrEqualTo(String value) {
            addCriterion("Contract_ID <=", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdLike(String value) {
            addCriterion("Contract_ID like", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotLike(String value) {
            addCriterion("Contract_ID not like", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdIn(List<String> values) {
            addCriterion("Contract_ID in", values, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotIn(List<String> values) {
            addCriterion("Contract_ID not in", values, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdBetween(String value1, String value2) {
            addCriterion("Contract_ID between", value1, value2, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotBetween(String value1, String value2) {
            addCriterion("Contract_ID not between", value1, value2, "contractId");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseIdIsNull() {
            addCriterion("BusinessLicense_ID is null");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseIdIsNotNull() {
            addCriterion("BusinessLicense_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseIdEqualTo(String value) {
            addCriterion("BusinessLicense_ID =", value, "businesslicenseId");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseIdNotEqualTo(String value) {
            addCriterion("BusinessLicense_ID <>", value, "businesslicenseId");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseIdGreaterThan(String value) {
            addCriterion("BusinessLicense_ID >", value, "businesslicenseId");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseIdGreaterThanOrEqualTo(String value) {
            addCriterion("BusinessLicense_ID >=", value, "businesslicenseId");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseIdLessThan(String value) {
            addCriterion("BusinessLicense_ID <", value, "businesslicenseId");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseIdLessThanOrEqualTo(String value) {
            addCriterion("BusinessLicense_ID <=", value, "businesslicenseId");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseIdLike(String value) {
            addCriterion("BusinessLicense_ID like", value, "businesslicenseId");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseIdNotLike(String value) {
            addCriterion("BusinessLicense_ID not like", value, "businesslicenseId");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseIdIn(List<String> values) {
            addCriterion("BusinessLicense_ID in", values, "businesslicenseId");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseIdNotIn(List<String> values) {
            addCriterion("BusinessLicense_ID not in", values, "businesslicenseId");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseIdBetween(String value1, String value2) {
            addCriterion("BusinessLicense_ID between", value1, value2, "businesslicenseId");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseIdNotBetween(String value1, String value2) {
            addCriterion("BusinessLicense_ID not between", value1, value2, "businesslicenseId");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseeffectivedateIsNull() {
            addCriterion("BusinessLicenseEffectiveDate is null");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseeffectivedateIsNotNull() {
            addCriterion("BusinessLicenseEffectiveDate is not null");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseeffectivedateEqualTo(Date value) {
            addCriterion("BusinessLicenseEffectiveDate =", value, "businesslicenseeffectivedate");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseeffectivedateNotEqualTo(Date value) {
            addCriterion("BusinessLicenseEffectiveDate <>", value, "businesslicenseeffectivedate");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseeffectivedateGreaterThan(Date value) {
            addCriterion("BusinessLicenseEffectiveDate >", value, "businesslicenseeffectivedate");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseeffectivedateGreaterThanOrEqualTo(Date value) {
            addCriterion("BusinessLicenseEffectiveDate >=", value, "businesslicenseeffectivedate");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseeffectivedateLessThan(Date value) {
            addCriterion("BusinessLicenseEffectiveDate <", value, "businesslicenseeffectivedate");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseeffectivedateLessThanOrEqualTo(Date value) {
            addCriterion("BusinessLicenseEffectiveDate <=", value, "businesslicenseeffectivedate");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseeffectivedateIn(List<Date> values) {
            addCriterion("BusinessLicenseEffectiveDate in", values, "businesslicenseeffectivedate");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseeffectivedateNotIn(List<Date> values) {
            addCriterion("BusinessLicenseEffectiveDate not in", values, "businesslicenseeffectivedate");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseeffectivedateBetween(Date value1, Date value2) {
            addCriterion("BusinessLicenseEffectiveDate between", value1, value2, "businesslicenseeffectivedate");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseeffectivedateNotBetween(Date value1, Date value2) {
            addCriterion("BusinessLicenseEffectiveDate not between", value1, value2, "businesslicenseeffectivedate");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseimageIsNull() {
            addCriterion("BusinessLicenseImage is null");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseimageIsNotNull() {
            addCriterion("BusinessLicenseImage is not null");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseimageEqualTo(String value) {
            addCriterion("BusinessLicenseImage =", value, "businesslicenseimage");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseimageNotEqualTo(String value) {
            addCriterion("BusinessLicenseImage <>", value, "businesslicenseimage");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseimageGreaterThan(String value) {
            addCriterion("BusinessLicenseImage >", value, "businesslicenseimage");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseimageGreaterThanOrEqualTo(String value) {
            addCriterion("BusinessLicenseImage >=", value, "businesslicenseimage");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseimageLessThan(String value) {
            addCriterion("BusinessLicenseImage <", value, "businesslicenseimage");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseimageLessThanOrEqualTo(String value) {
            addCriterion("BusinessLicenseImage <=", value, "businesslicenseimage");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseimageLike(String value) {
            addCriterion("BusinessLicenseImage like", value, "businesslicenseimage");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseimageNotLike(String value) {
            addCriterion("BusinessLicenseImage not like", value, "businesslicenseimage");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseimageIn(List<String> values) {
            addCriterion("BusinessLicenseImage in", values, "businesslicenseimage");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseimageNotIn(List<String> values) {
            addCriterion("BusinessLicenseImage not in", values, "businesslicenseimage");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseimageBetween(String value1, String value2) {
            addCriterion("BusinessLicenseImage between", value1, value2, "businesslicenseimage");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseimageNotBetween(String value1, String value2) {
            addCriterion("BusinessLicenseImage not between", value1, value2, "businesslicenseimage");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdIsNull() {
            addCriterion("Organization_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdIsNotNull() {
            addCriterion("Organization_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdEqualTo(String value) {
            addCriterion("Organization_ID =", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdNotEqualTo(String value) {
            addCriterion("Organization_ID <>", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdGreaterThan(String value) {
            addCriterion("Organization_ID >", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdGreaterThanOrEqualTo(String value) {
            addCriterion("Organization_ID >=", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdLessThan(String value) {
            addCriterion("Organization_ID <", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdLessThanOrEqualTo(String value) {
            addCriterion("Organization_ID <=", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdLike(String value) {
            addCriterion("Organization_ID like", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdNotLike(String value) {
            addCriterion("Organization_ID not like", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdIn(List<String> values) {
            addCriterion("Organization_ID in", values, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdNotIn(List<String> values) {
            addCriterion("Organization_ID not in", values, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdBetween(String value1, String value2) {
            addCriterion("Organization_ID between", value1, value2, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdNotBetween(String value1, String value2) {
            addCriterion("Organization_ID not between", value1, value2, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationeffectivedateIsNull() {
            addCriterion("OrganizationEffectiveDate is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationeffectivedateIsNotNull() {
            addCriterion("OrganizationEffectiveDate is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationeffectivedateEqualTo(Date value) {
            addCriterion("OrganizationEffectiveDate =", value, "organizationeffectivedate");
            return (Criteria) this;
        }

        public Criteria andOrganizationeffectivedateNotEqualTo(Date value) {
            addCriterion("OrganizationEffectiveDate <>", value, "organizationeffectivedate");
            return (Criteria) this;
        }

        public Criteria andOrganizationeffectivedateGreaterThan(Date value) {
            addCriterion("OrganizationEffectiveDate >", value, "organizationeffectivedate");
            return (Criteria) this;
        }

        public Criteria andOrganizationeffectivedateGreaterThanOrEqualTo(Date value) {
            addCriterion("OrganizationEffectiveDate >=", value, "organizationeffectivedate");
            return (Criteria) this;
        }

        public Criteria andOrganizationeffectivedateLessThan(Date value) {
            addCriterion("OrganizationEffectiveDate <", value, "organizationeffectivedate");
            return (Criteria) this;
        }

        public Criteria andOrganizationeffectivedateLessThanOrEqualTo(Date value) {
            addCriterion("OrganizationEffectiveDate <=", value, "organizationeffectivedate");
            return (Criteria) this;
        }

        public Criteria andOrganizationeffectivedateIn(List<Date> values) {
            addCriterion("OrganizationEffectiveDate in", values, "organizationeffectivedate");
            return (Criteria) this;
        }

        public Criteria andOrganizationeffectivedateNotIn(List<Date> values) {
            addCriterion("OrganizationEffectiveDate not in", values, "organizationeffectivedate");
            return (Criteria) this;
        }

        public Criteria andOrganizationeffectivedateBetween(Date value1, Date value2) {
            addCriterion("OrganizationEffectiveDate between", value1, value2, "organizationeffectivedate");
            return (Criteria) this;
        }

        public Criteria andOrganizationeffectivedateNotBetween(Date value1, Date value2) {
            addCriterion("OrganizationEffectiveDate not between", value1, value2, "organizationeffectivedate");
            return (Criteria) this;
        }

        public Criteria andOrganizationimageIsNull() {
            addCriterion("OrganizationImage is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationimageIsNotNull() {
            addCriterion("OrganizationImage is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationimageEqualTo(String value) {
            addCriterion("OrganizationImage =", value, "organizationimage");
            return (Criteria) this;
        }

        public Criteria andOrganizationimageNotEqualTo(String value) {
            addCriterion("OrganizationImage <>", value, "organizationimage");
            return (Criteria) this;
        }

        public Criteria andOrganizationimageGreaterThan(String value) {
            addCriterion("OrganizationImage >", value, "organizationimage");
            return (Criteria) this;
        }

        public Criteria andOrganizationimageGreaterThanOrEqualTo(String value) {
            addCriterion("OrganizationImage >=", value, "organizationimage");
            return (Criteria) this;
        }

        public Criteria andOrganizationimageLessThan(String value) {
            addCriterion("OrganizationImage <", value, "organizationimage");
            return (Criteria) this;
        }

        public Criteria andOrganizationimageLessThanOrEqualTo(String value) {
            addCriterion("OrganizationImage <=", value, "organizationimage");
            return (Criteria) this;
        }

        public Criteria andOrganizationimageLike(String value) {
            addCriterion("OrganizationImage like", value, "organizationimage");
            return (Criteria) this;
        }

        public Criteria andOrganizationimageNotLike(String value) {
            addCriterion("OrganizationImage not like", value, "organizationimage");
            return (Criteria) this;
        }

        public Criteria andOrganizationimageIn(List<String> values) {
            addCriterion("OrganizationImage in", values, "organizationimage");
            return (Criteria) this;
        }

        public Criteria andOrganizationimageNotIn(List<String> values) {
            addCriterion("OrganizationImage not in", values, "organizationimage");
            return (Criteria) this;
        }

        public Criteria andOrganizationimageBetween(String value1, String value2) {
            addCriterion("OrganizationImage between", value1, value2, "organizationimage");
            return (Criteria) this;
        }

        public Criteria andOrganizationimageNotBetween(String value1, String value2) {
            addCriterion("OrganizationImage not between", value1, value2, "organizationimage");
            return (Criteria) this;
        }

        public Criteria andTaxregistrationIdIsNull() {
            addCriterion("TaxRegistration_ID is null");
            return (Criteria) this;
        }

        public Criteria andTaxregistrationIdIsNotNull() {
            addCriterion("TaxRegistration_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTaxregistrationIdEqualTo(String value) {
            addCriterion("TaxRegistration_ID =", value, "taxregistrationId");
            return (Criteria) this;
        }

        public Criteria andTaxregistrationIdNotEqualTo(String value) {
            addCriterion("TaxRegistration_ID <>", value, "taxregistrationId");
            return (Criteria) this;
        }

        public Criteria andTaxregistrationIdGreaterThan(String value) {
            addCriterion("TaxRegistration_ID >", value, "taxregistrationId");
            return (Criteria) this;
        }

        public Criteria andTaxregistrationIdGreaterThanOrEqualTo(String value) {
            addCriterion("TaxRegistration_ID >=", value, "taxregistrationId");
            return (Criteria) this;
        }

        public Criteria andTaxregistrationIdLessThan(String value) {
            addCriterion("TaxRegistration_ID <", value, "taxregistrationId");
            return (Criteria) this;
        }

        public Criteria andTaxregistrationIdLessThanOrEqualTo(String value) {
            addCriterion("TaxRegistration_ID <=", value, "taxregistrationId");
            return (Criteria) this;
        }

        public Criteria andTaxregistrationIdLike(String value) {
            addCriterion("TaxRegistration_ID like", value, "taxregistrationId");
            return (Criteria) this;
        }

        public Criteria andTaxregistrationIdNotLike(String value) {
            addCriterion("TaxRegistration_ID not like", value, "taxregistrationId");
            return (Criteria) this;
        }

        public Criteria andTaxregistrationIdIn(List<String> values) {
            addCriterion("TaxRegistration_ID in", values, "taxregistrationId");
            return (Criteria) this;
        }

        public Criteria andTaxregistrationIdNotIn(List<String> values) {
            addCriterion("TaxRegistration_ID not in", values, "taxregistrationId");
            return (Criteria) this;
        }

        public Criteria andTaxregistrationIdBetween(String value1, String value2) {
            addCriterion("TaxRegistration_ID between", value1, value2, "taxregistrationId");
            return (Criteria) this;
        }

        public Criteria andTaxregistrationIdNotBetween(String value1, String value2) {
            addCriterion("TaxRegistration_ID not between", value1, value2, "taxregistrationId");
            return (Criteria) this;
        }

        public Criteria andTaxregistrationeffectivedateIsNull() {
            addCriterion("TaxRegistrationEffectiveDate is null");
            return (Criteria) this;
        }

        public Criteria andTaxregistrationeffectivedateIsNotNull() {
            addCriterion("TaxRegistrationEffectiveDate is not null");
            return (Criteria) this;
        }

        public Criteria andTaxregistrationeffectivedateEqualTo(Date value) {
            addCriterion("TaxRegistrationEffectiveDate =", value, "taxregistrationeffectivedate");
            return (Criteria) this;
        }

        public Criteria andTaxregistrationeffectivedateNotEqualTo(Date value) {
            addCriterion("TaxRegistrationEffectiveDate <>", value, "taxregistrationeffectivedate");
            return (Criteria) this;
        }

        public Criteria andTaxregistrationeffectivedateGreaterThan(Date value) {
            addCriterion("TaxRegistrationEffectiveDate >", value, "taxregistrationeffectivedate");
            return (Criteria) this;
        }

        public Criteria andTaxregistrationeffectivedateGreaterThanOrEqualTo(Date value) {
            addCriterion("TaxRegistrationEffectiveDate >=", value, "taxregistrationeffectivedate");
            return (Criteria) this;
        }

        public Criteria andTaxregistrationeffectivedateLessThan(Date value) {
            addCriterion("TaxRegistrationEffectiveDate <", value, "taxregistrationeffectivedate");
            return (Criteria) this;
        }

        public Criteria andTaxregistrationeffectivedateLessThanOrEqualTo(Date value) {
            addCriterion("TaxRegistrationEffectiveDate <=", value, "taxregistrationeffectivedate");
            return (Criteria) this;
        }

        public Criteria andTaxregistrationeffectivedateIn(List<Date> values) {
            addCriterion("TaxRegistrationEffectiveDate in", values, "taxregistrationeffectivedate");
            return (Criteria) this;
        }

        public Criteria andTaxregistrationeffectivedateNotIn(List<Date> values) {
            addCriterion("TaxRegistrationEffectiveDate not in", values, "taxregistrationeffectivedate");
            return (Criteria) this;
        }

        public Criteria andTaxregistrationeffectivedateBetween(Date value1, Date value2) {
            addCriterion("TaxRegistrationEffectiveDate between", value1, value2, "taxregistrationeffectivedate");
            return (Criteria) this;
        }

        public Criteria andTaxregistrationeffectivedateNotBetween(Date value1, Date value2) {
            addCriterion("TaxRegistrationEffectiveDate not between", value1, value2, "taxregistrationeffectivedate");
            return (Criteria) this;
        }

        public Criteria andTaxregistrationimageIsNull() {
            addCriterion("TaxRegistrationImage is null");
            return (Criteria) this;
        }

        public Criteria andTaxregistrationimageIsNotNull() {
            addCriterion("TaxRegistrationImage is not null");
            return (Criteria) this;
        }

        public Criteria andTaxregistrationimageEqualTo(String value) {
            addCriterion("TaxRegistrationImage =", value, "taxregistrationimage");
            return (Criteria) this;
        }

        public Criteria andTaxregistrationimageNotEqualTo(String value) {
            addCriterion("TaxRegistrationImage <>", value, "taxregistrationimage");
            return (Criteria) this;
        }

        public Criteria andTaxregistrationimageGreaterThan(String value) {
            addCriterion("TaxRegistrationImage >", value, "taxregistrationimage");
            return (Criteria) this;
        }

        public Criteria andTaxregistrationimageGreaterThanOrEqualTo(String value) {
            addCriterion("TaxRegistrationImage >=", value, "taxregistrationimage");
            return (Criteria) this;
        }

        public Criteria andTaxregistrationimageLessThan(String value) {
            addCriterion("TaxRegistrationImage <", value, "taxregistrationimage");
            return (Criteria) this;
        }

        public Criteria andTaxregistrationimageLessThanOrEqualTo(String value) {
            addCriterion("TaxRegistrationImage <=", value, "taxregistrationimage");
            return (Criteria) this;
        }

        public Criteria andTaxregistrationimageLike(String value) {
            addCriterion("TaxRegistrationImage like", value, "taxregistrationimage");
            return (Criteria) this;
        }

        public Criteria andTaxregistrationimageNotLike(String value) {
            addCriterion("TaxRegistrationImage not like", value, "taxregistrationimage");
            return (Criteria) this;
        }

        public Criteria andTaxregistrationimageIn(List<String> values) {
            addCriterion("TaxRegistrationImage in", values, "taxregistrationimage");
            return (Criteria) this;
        }

        public Criteria andTaxregistrationimageNotIn(List<String> values) {
            addCriterion("TaxRegistrationImage not in", values, "taxregistrationimage");
            return (Criteria) this;
        }

        public Criteria andTaxregistrationimageBetween(String value1, String value2) {
            addCriterion("TaxRegistrationImage between", value1, value2, "taxregistrationimage");
            return (Criteria) this;
        }

        public Criteria andTaxregistrationimageNotBetween(String value1, String value2) {
            addCriterion("TaxRegistrationImage not between", value1, value2, "taxregistrationimage");
            return (Criteria) this;
        }

        public Criteria andBusinessokIdIsNull() {
            addCriterion("BusinessOK_ID is null");
            return (Criteria) this;
        }

        public Criteria andBusinessokIdIsNotNull() {
            addCriterion("BusinessOK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessokIdEqualTo(String value) {
            addCriterion("BusinessOK_ID =", value, "businessokId");
            return (Criteria) this;
        }

        public Criteria andBusinessokIdNotEqualTo(String value) {
            addCriterion("BusinessOK_ID <>", value, "businessokId");
            return (Criteria) this;
        }

        public Criteria andBusinessokIdGreaterThan(String value) {
            addCriterion("BusinessOK_ID >", value, "businessokId");
            return (Criteria) this;
        }

        public Criteria andBusinessokIdGreaterThanOrEqualTo(String value) {
            addCriterion("BusinessOK_ID >=", value, "businessokId");
            return (Criteria) this;
        }

        public Criteria andBusinessokIdLessThan(String value) {
            addCriterion("BusinessOK_ID <", value, "businessokId");
            return (Criteria) this;
        }

        public Criteria andBusinessokIdLessThanOrEqualTo(String value) {
            addCriterion("BusinessOK_ID <=", value, "businessokId");
            return (Criteria) this;
        }

        public Criteria andBusinessokIdLike(String value) {
            addCriterion("BusinessOK_ID like", value, "businessokId");
            return (Criteria) this;
        }

        public Criteria andBusinessokIdNotLike(String value) {
            addCriterion("BusinessOK_ID not like", value, "businessokId");
            return (Criteria) this;
        }

        public Criteria andBusinessokIdIn(List<String> values) {
            addCriterion("BusinessOK_ID in", values, "businessokId");
            return (Criteria) this;
        }

        public Criteria andBusinessokIdNotIn(List<String> values) {
            addCriterion("BusinessOK_ID not in", values, "businessokId");
            return (Criteria) this;
        }

        public Criteria andBusinessokIdBetween(String value1, String value2) {
            addCriterion("BusinessOK_ID between", value1, value2, "businessokId");
            return (Criteria) this;
        }

        public Criteria andBusinessokIdNotBetween(String value1, String value2) {
            addCriterion("BusinessOK_ID not between", value1, value2, "businessokId");
            return (Criteria) this;
        }

        public Criteria andBusinessokeffectivedateIsNull() {
            addCriterion("BusinessOKEffectiveDate is null");
            return (Criteria) this;
        }

        public Criteria andBusinessokeffectivedateIsNotNull() {
            addCriterion("BusinessOKEffectiveDate is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessokeffectivedateEqualTo(Date value) {
            addCriterion("BusinessOKEffectiveDate =", value, "businessokeffectivedate");
            return (Criteria) this;
        }

        public Criteria andBusinessokeffectivedateNotEqualTo(Date value) {
            addCriterion("BusinessOKEffectiveDate <>", value, "businessokeffectivedate");
            return (Criteria) this;
        }

        public Criteria andBusinessokeffectivedateGreaterThan(Date value) {
            addCriterion("BusinessOKEffectiveDate >", value, "businessokeffectivedate");
            return (Criteria) this;
        }

        public Criteria andBusinessokeffectivedateGreaterThanOrEqualTo(Date value) {
            addCriterion("BusinessOKEffectiveDate >=", value, "businessokeffectivedate");
            return (Criteria) this;
        }

        public Criteria andBusinessokeffectivedateLessThan(Date value) {
            addCriterion("BusinessOKEffectiveDate <", value, "businessokeffectivedate");
            return (Criteria) this;
        }

        public Criteria andBusinessokeffectivedateLessThanOrEqualTo(Date value) {
            addCriterion("BusinessOKEffectiveDate <=", value, "businessokeffectivedate");
            return (Criteria) this;
        }

        public Criteria andBusinessokeffectivedateIn(List<Date> values) {
            addCriterion("BusinessOKEffectiveDate in", values, "businessokeffectivedate");
            return (Criteria) this;
        }

        public Criteria andBusinessokeffectivedateNotIn(List<Date> values) {
            addCriterion("BusinessOKEffectiveDate not in", values, "businessokeffectivedate");
            return (Criteria) this;
        }

        public Criteria andBusinessokeffectivedateBetween(Date value1, Date value2) {
            addCriterion("BusinessOKEffectiveDate between", value1, value2, "businessokeffectivedate");
            return (Criteria) this;
        }

        public Criteria andBusinessokeffectivedateNotBetween(Date value1, Date value2) {
            addCriterion("BusinessOKEffectiveDate not between", value1, value2, "businessokeffectivedate");
            return (Criteria) this;
        }

        public Criteria andBusinessokimageIsNull() {
            addCriterion("BusinessOKImage is null");
            return (Criteria) this;
        }

        public Criteria andBusinessokimageIsNotNull() {
            addCriterion("BusinessOKImage is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessokimageEqualTo(String value) {
            addCriterion("BusinessOKImage =", value, "businessokimage");
            return (Criteria) this;
        }

        public Criteria andBusinessokimageNotEqualTo(String value) {
            addCriterion("BusinessOKImage <>", value, "businessokimage");
            return (Criteria) this;
        }

        public Criteria andBusinessokimageGreaterThan(String value) {
            addCriterion("BusinessOKImage >", value, "businessokimage");
            return (Criteria) this;
        }

        public Criteria andBusinessokimageGreaterThanOrEqualTo(String value) {
            addCriterion("BusinessOKImage >=", value, "businessokimage");
            return (Criteria) this;
        }

        public Criteria andBusinessokimageLessThan(String value) {
            addCriterion("BusinessOKImage <", value, "businessokimage");
            return (Criteria) this;
        }

        public Criteria andBusinessokimageLessThanOrEqualTo(String value) {
            addCriterion("BusinessOKImage <=", value, "businessokimage");
            return (Criteria) this;
        }

        public Criteria andBusinessokimageLike(String value) {
            addCriterion("BusinessOKImage like", value, "businessokimage");
            return (Criteria) this;
        }

        public Criteria andBusinessokimageNotLike(String value) {
            addCriterion("BusinessOKImage not like", value, "businessokimage");
            return (Criteria) this;
        }

        public Criteria andBusinessokimageIn(List<String> values) {
            addCriterion("BusinessOKImage in", values, "businessokimage");
            return (Criteria) this;
        }

        public Criteria andBusinessokimageNotIn(List<String> values) {
            addCriterion("BusinessOKImage not in", values, "businessokimage");
            return (Criteria) this;
        }

        public Criteria andBusinessokimageBetween(String value1, String value2) {
            addCriterion("BusinessOKImage between", value1, value2, "businessokimage");
            return (Criteria) this;
        }

        public Criteria andBusinessokimageNotBetween(String value1, String value2) {
            addCriterion("BusinessOKImage not between", value1, value2, "businessokimage");
            return (Criteria) this;
        }

        public Criteria andBusinessscopeIsNull() {
            addCriterion("BusinessScope is null");
            return (Criteria) this;
        }

        public Criteria andBusinessscopeIsNotNull() {
            addCriterion("BusinessScope is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessscopeEqualTo(String value) {
            addCriterion("BusinessScope =", value, "businessscope");
            return (Criteria) this;
        }

        public Criteria andBusinessscopeNotEqualTo(String value) {
            addCriterion("BusinessScope <>", value, "businessscope");
            return (Criteria) this;
        }

        public Criteria andBusinessscopeGreaterThan(String value) {
            addCriterion("BusinessScope >", value, "businessscope");
            return (Criteria) this;
        }

        public Criteria andBusinessscopeGreaterThanOrEqualTo(String value) {
            addCriterion("BusinessScope >=", value, "businessscope");
            return (Criteria) this;
        }

        public Criteria andBusinessscopeLessThan(String value) {
            addCriterion("BusinessScope <", value, "businessscope");
            return (Criteria) this;
        }

        public Criteria andBusinessscopeLessThanOrEqualTo(String value) {
            addCriterion("BusinessScope <=", value, "businessscope");
            return (Criteria) this;
        }

        public Criteria andBusinessscopeLike(String value) {
            addCriterion("BusinessScope like", value, "businessscope");
            return (Criteria) this;
        }

        public Criteria andBusinessscopeNotLike(String value) {
            addCriterion("BusinessScope not like", value, "businessscope");
            return (Criteria) this;
        }

        public Criteria andBusinessscopeIn(List<String> values) {
            addCriterion("BusinessScope in", values, "businessscope");
            return (Criteria) this;
        }

        public Criteria andBusinessscopeNotIn(List<String> values) {
            addCriterion("BusinessScope not in", values, "businessscope");
            return (Criteria) this;
        }

        public Criteria andBusinessscopeBetween(String value1, String value2) {
            addCriterion("BusinessScope between", value1, value2, "businessscope");
            return (Criteria) this;
        }

        public Criteria andBusinessscopeNotBetween(String value1, String value2) {
            addCriterion("BusinessScope not between", value1, value2, "businessscope");
            return (Criteria) this;
        }

        public Criteria andBusinessscopecodeIsNull() {
            addCriterion("BusinessScopeCode is null");
            return (Criteria) this;
        }

        public Criteria andBusinessscopecodeIsNotNull() {
            addCriterion("BusinessScopeCode is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessscopecodeEqualTo(String value) {
            addCriterion("BusinessScopeCode =", value, "businessscopecode");
            return (Criteria) this;
        }

        public Criteria andBusinessscopecodeNotEqualTo(String value) {
            addCriterion("BusinessScopeCode <>", value, "businessscopecode");
            return (Criteria) this;
        }

        public Criteria andBusinessscopecodeGreaterThan(String value) {
            addCriterion("BusinessScopeCode >", value, "businessscopecode");
            return (Criteria) this;
        }

        public Criteria andBusinessscopecodeGreaterThanOrEqualTo(String value) {
            addCriterion("BusinessScopeCode >=", value, "businessscopecode");
            return (Criteria) this;
        }

        public Criteria andBusinessscopecodeLessThan(String value) {
            addCriterion("BusinessScopeCode <", value, "businessscopecode");
            return (Criteria) this;
        }

        public Criteria andBusinessscopecodeLessThanOrEqualTo(String value) {
            addCriterion("BusinessScopeCode <=", value, "businessscopecode");
            return (Criteria) this;
        }

        public Criteria andBusinessscopecodeLike(String value) {
            addCriterion("BusinessScopeCode like", value, "businessscopecode");
            return (Criteria) this;
        }

        public Criteria andBusinessscopecodeNotLike(String value) {
            addCriterion("BusinessScopeCode not like", value, "businessscopecode");
            return (Criteria) this;
        }

        public Criteria andBusinessscopecodeIn(List<String> values) {
            addCriterion("BusinessScopeCode in", values, "businessscopecode");
            return (Criteria) this;
        }

        public Criteria andBusinessscopecodeNotIn(List<String> values) {
            addCriterion("BusinessScopeCode not in", values, "businessscopecode");
            return (Criteria) this;
        }

        public Criteria andBusinessscopecodeBetween(String value1, String value2) {
            addCriterion("BusinessScopeCode between", value1, value2, "businessscopecode");
            return (Criteria) this;
        }

        public Criteria andBusinessscopecodeNotBetween(String value1, String value2) {
            addCriterion("BusinessScopeCode not between", value1, value2, "businessscopecode");
            return (Criteria) this;
        }

        public Criteria andProductionpermitNumberIsNull() {
            addCriterion("ProductionPermit_Number is null");
            return (Criteria) this;
        }

        public Criteria andProductionpermitNumberIsNotNull() {
            addCriterion("ProductionPermit_Number is not null");
            return (Criteria) this;
        }

        public Criteria andProductionpermitNumberEqualTo(String value) {
            addCriterion("ProductionPermit_Number =", value, "productionpermitNumber");
            return (Criteria) this;
        }

        public Criteria andProductionpermitNumberNotEqualTo(String value) {
            addCriterion("ProductionPermit_Number <>", value, "productionpermitNumber");
            return (Criteria) this;
        }

        public Criteria andProductionpermitNumberGreaterThan(String value) {
            addCriterion("ProductionPermit_Number >", value, "productionpermitNumber");
            return (Criteria) this;
        }

        public Criteria andProductionpermitNumberGreaterThanOrEqualTo(String value) {
            addCriterion("ProductionPermit_Number >=", value, "productionpermitNumber");
            return (Criteria) this;
        }

        public Criteria andProductionpermitNumberLessThan(String value) {
            addCriterion("ProductionPermit_Number <", value, "productionpermitNumber");
            return (Criteria) this;
        }

        public Criteria andProductionpermitNumberLessThanOrEqualTo(String value) {
            addCriterion("ProductionPermit_Number <=", value, "productionpermitNumber");
            return (Criteria) this;
        }

        public Criteria andProductionpermitNumberLike(String value) {
            addCriterion("ProductionPermit_Number like", value, "productionpermitNumber");
            return (Criteria) this;
        }

        public Criteria andProductionpermitNumberNotLike(String value) {
            addCriterion("ProductionPermit_Number not like", value, "productionpermitNumber");
            return (Criteria) this;
        }

        public Criteria andProductionpermitNumberIn(List<String> values) {
            addCriterion("ProductionPermit_Number in", values, "productionpermitNumber");
            return (Criteria) this;
        }

        public Criteria andProductionpermitNumberNotIn(List<String> values) {
            addCriterion("ProductionPermit_Number not in", values, "productionpermitNumber");
            return (Criteria) this;
        }

        public Criteria andProductionpermitNumberBetween(String value1, String value2) {
            addCriterion("ProductionPermit_Number between", value1, value2, "productionpermitNumber");
            return (Criteria) this;
        }

        public Criteria andProductionpermitNumberNotBetween(String value1, String value2) {
            addCriterion("ProductionPermit_Number not between", value1, value2, "productionpermitNumber");
            return (Criteria) this;
        }

        public Criteria andBppermitvalidityIsNull() {
            addCriterion("BPPermitValidity is null");
            return (Criteria) this;
        }

        public Criteria andBppermitvalidityIsNotNull() {
            addCriterion("BPPermitValidity is not null");
            return (Criteria) this;
        }

        public Criteria andBppermitvalidityEqualTo(Date value) {
            addCriterion("BPPermitValidity =", value, "bppermitvalidity");
            return (Criteria) this;
        }

        public Criteria andBppermitvalidityNotEqualTo(Date value) {
            addCriterion("BPPermitValidity <>", value, "bppermitvalidity");
            return (Criteria) this;
        }

        public Criteria andBppermitvalidityGreaterThan(Date value) {
            addCriterion("BPPermitValidity >", value, "bppermitvalidity");
            return (Criteria) this;
        }

        public Criteria andBppermitvalidityGreaterThanOrEqualTo(Date value) {
            addCriterion("BPPermitValidity >=", value, "bppermitvalidity");
            return (Criteria) this;
        }

        public Criteria andBppermitvalidityLessThan(Date value) {
            addCriterion("BPPermitValidity <", value, "bppermitvalidity");
            return (Criteria) this;
        }

        public Criteria andBppermitvalidityLessThanOrEqualTo(Date value) {
            addCriterion("BPPermitValidity <=", value, "bppermitvalidity");
            return (Criteria) this;
        }

        public Criteria andBppermitvalidityIn(List<Date> values) {
            addCriterion("BPPermitValidity in", values, "bppermitvalidity");
            return (Criteria) this;
        }

        public Criteria andBppermitvalidityNotIn(List<Date> values) {
            addCriterion("BPPermitValidity not in", values, "bppermitvalidity");
            return (Criteria) this;
        }

        public Criteria andBppermitvalidityBetween(Date value1, Date value2) {
            addCriterion("BPPermitValidity between", value1, value2, "bppermitvalidity");
            return (Criteria) this;
        }

        public Criteria andBppermitvalidityNotBetween(Date value1, Date value2) {
            addCriterion("BPPermitValidity not between", value1, value2, "bppermitvalidity");
            return (Criteria) this;
        }

        public Criteria andProductionpermitpictureIsNull() {
            addCriterion("ProductionPermitPicture is null");
            return (Criteria) this;
        }

        public Criteria andProductionpermitpictureIsNotNull() {
            addCriterion("ProductionPermitPicture is not null");
            return (Criteria) this;
        }

        public Criteria andProductionpermitpictureEqualTo(String value) {
            addCriterion("ProductionPermitPicture =", value, "productionpermitpicture");
            return (Criteria) this;
        }

        public Criteria andProductionpermitpictureNotEqualTo(String value) {
            addCriterion("ProductionPermitPicture <>", value, "productionpermitpicture");
            return (Criteria) this;
        }

        public Criteria andProductionpermitpictureGreaterThan(String value) {
            addCriterion("ProductionPermitPicture >", value, "productionpermitpicture");
            return (Criteria) this;
        }

        public Criteria andProductionpermitpictureGreaterThanOrEqualTo(String value) {
            addCriterion("ProductionPermitPicture >=", value, "productionpermitpicture");
            return (Criteria) this;
        }

        public Criteria andProductionpermitpictureLessThan(String value) {
            addCriterion("ProductionPermitPicture <", value, "productionpermitpicture");
            return (Criteria) this;
        }

        public Criteria andProductionpermitpictureLessThanOrEqualTo(String value) {
            addCriterion("ProductionPermitPicture <=", value, "productionpermitpicture");
            return (Criteria) this;
        }

        public Criteria andProductionpermitpictureLike(String value) {
            addCriterion("ProductionPermitPicture like", value, "productionpermitpicture");
            return (Criteria) this;
        }

        public Criteria andProductionpermitpictureNotLike(String value) {
            addCriterion("ProductionPermitPicture not like", value, "productionpermitpicture");
            return (Criteria) this;
        }

        public Criteria andProductionpermitpictureIn(List<String> values) {
            addCriterion("ProductionPermitPicture in", values, "productionpermitpicture");
            return (Criteria) this;
        }

        public Criteria andProductionpermitpictureNotIn(List<String> values) {
            addCriterion("ProductionPermitPicture not in", values, "productionpermitpicture");
            return (Criteria) this;
        }

        public Criteria andProductionpermitpictureBetween(String value1, String value2) {
            addCriterion("ProductionPermitPicture between", value1, value2, "productionpermitpicture");
            return (Criteria) this;
        }

        public Criteria andProductionpermitpictureNotBetween(String value1, String value2) {
            addCriterion("ProductionPermitPicture not between", value1, value2, "productionpermitpicture");
            return (Criteria) this;
        }

        public Criteria andCertificaterangeIsNull() {
            addCriterion("CertificateRange is null");
            return (Criteria) this;
        }

        public Criteria andCertificaterangeIsNotNull() {
            addCriterion("CertificateRange is not null");
            return (Criteria) this;
        }

        public Criteria andCertificaterangeEqualTo(String value) {
            addCriterion("CertificateRange =", value, "certificaterange");
            return (Criteria) this;
        }

        public Criteria andCertificaterangeNotEqualTo(String value) {
            addCriterion("CertificateRange <>", value, "certificaterange");
            return (Criteria) this;
        }

        public Criteria andCertificaterangeGreaterThan(String value) {
            addCriterion("CertificateRange >", value, "certificaterange");
            return (Criteria) this;
        }

        public Criteria andCertificaterangeGreaterThanOrEqualTo(String value) {
            addCriterion("CertificateRange >=", value, "certificaterange");
            return (Criteria) this;
        }

        public Criteria andCertificaterangeLessThan(String value) {
            addCriterion("CertificateRange <", value, "certificaterange");
            return (Criteria) this;
        }

        public Criteria andCertificaterangeLessThanOrEqualTo(String value) {
            addCriterion("CertificateRange <=", value, "certificaterange");
            return (Criteria) this;
        }

        public Criteria andCertificaterangeLike(String value) {
            addCriterion("CertificateRange like", value, "certificaterange");
            return (Criteria) this;
        }

        public Criteria andCertificaterangeNotLike(String value) {
            addCriterion("CertificateRange not like", value, "certificaterange");
            return (Criteria) this;
        }

        public Criteria andCertificaterangeIn(List<String> values) {
            addCriterion("CertificateRange in", values, "certificaterange");
            return (Criteria) this;
        }

        public Criteria andCertificaterangeNotIn(List<String> values) {
            addCriterion("CertificateRange not in", values, "certificaterange");
            return (Criteria) this;
        }

        public Criteria andCertificaterangeBetween(String value1, String value2) {
            addCriterion("CertificateRange between", value1, value2, "certificaterange");
            return (Criteria) this;
        }

        public Criteria andCertificaterangeNotBetween(String value1, String value2) {
            addCriterion("CertificateRange not between", value1, value2, "certificaterange");
            return (Criteria) this;
        }

        public Criteria andCertificaterangenumberIsNull() {
            addCriterion("CertificateRangeNumber is null");
            return (Criteria) this;
        }

        public Criteria andCertificaterangenumberIsNotNull() {
            addCriterion("CertificateRangeNumber is not null");
            return (Criteria) this;
        }

        public Criteria andCertificaterangenumberEqualTo(String value) {
            addCriterion("CertificateRangeNumber =", value, "certificaterangenumber");
            return (Criteria) this;
        }

        public Criteria andCertificaterangenumberNotEqualTo(String value) {
            addCriterion("CertificateRangeNumber <>", value, "certificaterangenumber");
            return (Criteria) this;
        }

        public Criteria andCertificaterangenumberGreaterThan(String value) {
            addCriterion("CertificateRangeNumber >", value, "certificaterangenumber");
            return (Criteria) this;
        }

        public Criteria andCertificaterangenumberGreaterThanOrEqualTo(String value) {
            addCriterion("CertificateRangeNumber >=", value, "certificaterangenumber");
            return (Criteria) this;
        }

        public Criteria andCertificaterangenumberLessThan(String value) {
            addCriterion("CertificateRangeNumber <", value, "certificaterangenumber");
            return (Criteria) this;
        }

        public Criteria andCertificaterangenumberLessThanOrEqualTo(String value) {
            addCriterion("CertificateRangeNumber <=", value, "certificaterangenumber");
            return (Criteria) this;
        }

        public Criteria andCertificaterangenumberLike(String value) {
            addCriterion("CertificateRangeNumber like", value, "certificaterangenumber");
            return (Criteria) this;
        }

        public Criteria andCertificaterangenumberNotLike(String value) {
            addCriterion("CertificateRangeNumber not like", value, "certificaterangenumber");
            return (Criteria) this;
        }

        public Criteria andCertificaterangenumberIn(List<String> values) {
            addCriterion("CertificateRangeNumber in", values, "certificaterangenumber");
            return (Criteria) this;
        }

        public Criteria andCertificaterangenumberNotIn(List<String> values) {
            addCriterion("CertificateRangeNumber not in", values, "certificaterangenumber");
            return (Criteria) this;
        }

        public Criteria andCertificaterangenumberBetween(String value1, String value2) {
            addCriterion("CertificateRangeNumber between", value1, value2, "certificaterangenumber");
            return (Criteria) this;
        }

        public Criteria andCertificaterangenumberNotBetween(String value1, String value2) {
            addCriterion("CertificateRangeNumber not between", value1, value2, "certificaterangenumber");
            return (Criteria) this;
        }

        public Criteria andProduceaddressIsNull() {
            addCriterion("ProduceAddress is null");
            return (Criteria) this;
        }

        public Criteria andProduceaddressIsNotNull() {
            addCriterion("ProduceAddress is not null");
            return (Criteria) this;
        }

        public Criteria andProduceaddressEqualTo(String value) {
            addCriterion("ProduceAddress =", value, "produceaddress");
            return (Criteria) this;
        }

        public Criteria andProduceaddressNotEqualTo(String value) {
            addCriterion("ProduceAddress <>", value, "produceaddress");
            return (Criteria) this;
        }

        public Criteria andProduceaddressGreaterThan(String value) {
            addCriterion("ProduceAddress >", value, "produceaddress");
            return (Criteria) this;
        }

        public Criteria andProduceaddressGreaterThanOrEqualTo(String value) {
            addCriterion("ProduceAddress >=", value, "produceaddress");
            return (Criteria) this;
        }

        public Criteria andProduceaddressLessThan(String value) {
            addCriterion("ProduceAddress <", value, "produceaddress");
            return (Criteria) this;
        }

        public Criteria andProduceaddressLessThanOrEqualTo(String value) {
            addCriterion("ProduceAddress <=", value, "produceaddress");
            return (Criteria) this;
        }

        public Criteria andProduceaddressLike(String value) {
            addCriterion("ProduceAddress like", value, "produceaddress");
            return (Criteria) this;
        }

        public Criteria andProduceaddressNotLike(String value) {
            addCriterion("ProduceAddress not like", value, "produceaddress");
            return (Criteria) this;
        }

        public Criteria andProduceaddressIn(List<String> values) {
            addCriterion("ProduceAddress in", values, "produceaddress");
            return (Criteria) this;
        }

        public Criteria andProduceaddressNotIn(List<String> values) {
            addCriterion("ProduceAddress not in", values, "produceaddress");
            return (Criteria) this;
        }

        public Criteria andProduceaddressBetween(String value1, String value2) {
            addCriterion("ProduceAddress between", value1, value2, "produceaddress");
            return (Criteria) this;
        }

        public Criteria andProduceaddressNotBetween(String value1, String value2) {
            addCriterion("ProduceAddress not between", value1, value2, "produceaddress");
            return (Criteria) this;
        }

        public Criteria andContractmanIsNull() {
            addCriterion("ContractMan is null");
            return (Criteria) this;
        }

        public Criteria andContractmanIsNotNull() {
            addCriterion("ContractMan is not null");
            return (Criteria) this;
        }

        public Criteria andContractmanEqualTo(String value) {
            addCriterion("ContractMan =", value, "contractman");
            return (Criteria) this;
        }

        public Criteria andContractmanNotEqualTo(String value) {
            addCriterion("ContractMan <>", value, "contractman");
            return (Criteria) this;
        }

        public Criteria andContractmanGreaterThan(String value) {
            addCriterion("ContractMan >", value, "contractman");
            return (Criteria) this;
        }

        public Criteria andContractmanGreaterThanOrEqualTo(String value) {
            addCriterion("ContractMan >=", value, "contractman");
            return (Criteria) this;
        }

        public Criteria andContractmanLessThan(String value) {
            addCriterion("ContractMan <", value, "contractman");
            return (Criteria) this;
        }

        public Criteria andContractmanLessThanOrEqualTo(String value) {
            addCriterion("ContractMan <=", value, "contractman");
            return (Criteria) this;
        }

        public Criteria andContractmanLike(String value) {
            addCriterion("ContractMan like", value, "contractman");
            return (Criteria) this;
        }

        public Criteria andContractmanNotLike(String value) {
            addCriterion("ContractMan not like", value, "contractman");
            return (Criteria) this;
        }

        public Criteria andContractmanIn(List<String> values) {
            addCriterion("ContractMan in", values, "contractman");
            return (Criteria) this;
        }

        public Criteria andContractmanNotIn(List<String> values) {
            addCriterion("ContractMan not in", values, "contractman");
            return (Criteria) this;
        }

        public Criteria andContractmanBetween(String value1, String value2) {
            addCriterion("ContractMan between", value1, value2, "contractman");
            return (Criteria) this;
        }

        public Criteria andContractmanNotBetween(String value1, String value2) {
            addCriterion("ContractMan not between", value1, value2, "contractman");
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

        public Criteria andCooperationstatusIsNull() {
            addCriterion("CooperationStatus is null");
            return (Criteria) this;
        }

        public Criteria andCooperationstatusIsNotNull() {
            addCriterion("CooperationStatus is not null");
            return (Criteria) this;
        }

        public Criteria andCooperationstatusEqualTo(Boolean value) {
            addCriterion("CooperationStatus =", value, "cooperationstatus");
            return (Criteria) this;
        }

        public Criteria andCooperationstatusNotEqualTo(Boolean value) {
            addCriterion("CooperationStatus <>", value, "cooperationstatus");
            return (Criteria) this;
        }

        public Criteria andCooperationstatusGreaterThan(Boolean value) {
            addCriterion("CooperationStatus >", value, "cooperationstatus");
            return (Criteria) this;
        }

        public Criteria andCooperationstatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("CooperationStatus >=", value, "cooperationstatus");
            return (Criteria) this;
        }

        public Criteria andCooperationstatusLessThan(Boolean value) {
            addCriterion("CooperationStatus <", value, "cooperationstatus");
            return (Criteria) this;
        }

        public Criteria andCooperationstatusLessThanOrEqualTo(Boolean value) {
            addCriterion("CooperationStatus <=", value, "cooperationstatus");
            return (Criteria) this;
        }

        public Criteria andCooperationstatusIn(List<Boolean> values) {
            addCriterion("CooperationStatus in", values, "cooperationstatus");
            return (Criteria) this;
        }

        public Criteria andCooperationstatusNotIn(List<Boolean> values) {
            addCriterion("CooperationStatus not in", values, "cooperationstatus");
            return (Criteria) this;
        }

        public Criteria andCooperationstatusBetween(Boolean value1, Boolean value2) {
            addCriterion("CooperationStatus between", value1, value2, "cooperationstatus");
            return (Criteria) this;
        }

        public Criteria andCooperationstatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("CooperationStatus not between", value1, value2, "cooperationstatus");
            return (Criteria) this;
        }

        public Criteria andRecordnumberIsNull() {
            addCriterion("RecordNumber is null");
            return (Criteria) this;
        }

        public Criteria andRecordnumberIsNotNull() {
            addCriterion("RecordNumber is not null");
            return (Criteria) this;
        }

        public Criteria andRecordnumberEqualTo(String value) {
            addCriterion("RecordNumber =", value, "recordnumber");
            return (Criteria) this;
        }

        public Criteria andRecordnumberNotEqualTo(String value) {
            addCriterion("RecordNumber <>", value, "recordnumber");
            return (Criteria) this;
        }

        public Criteria andRecordnumberGreaterThan(String value) {
            addCriterion("RecordNumber >", value, "recordnumber");
            return (Criteria) this;
        }

        public Criteria andRecordnumberGreaterThanOrEqualTo(String value) {
            addCriterion("RecordNumber >=", value, "recordnumber");
            return (Criteria) this;
        }

        public Criteria andRecordnumberLessThan(String value) {
            addCriterion("RecordNumber <", value, "recordnumber");
            return (Criteria) this;
        }

        public Criteria andRecordnumberLessThanOrEqualTo(String value) {
            addCriterion("RecordNumber <=", value, "recordnumber");
            return (Criteria) this;
        }

        public Criteria andRecordnumberLike(String value) {
            addCriterion("RecordNumber like", value, "recordnumber");
            return (Criteria) this;
        }

        public Criteria andRecordnumberNotLike(String value) {
            addCriterion("RecordNumber not like", value, "recordnumber");
            return (Criteria) this;
        }

        public Criteria andRecordnumberIn(List<String> values) {
            addCriterion("RecordNumber in", values, "recordnumber");
            return (Criteria) this;
        }

        public Criteria andRecordnumberNotIn(List<String> values) {
            addCriterion("RecordNumber not in", values, "recordnumber");
            return (Criteria) this;
        }

        public Criteria andRecordnumberBetween(String value1, String value2) {
            addCriterion("RecordNumber between", value1, value2, "recordnumber");
            return (Criteria) this;
        }

        public Criteria andRecordnumberNotBetween(String value1, String value2) {
            addCriterion("RecordNumber not between", value1, value2, "recordnumber");
            return (Criteria) this;
        }

        public Criteria andRecordeffectivedateIsNull() {
            addCriterion("RecordEffectiveDate is null");
            return (Criteria) this;
        }

        public Criteria andRecordeffectivedateIsNotNull() {
            addCriterion("RecordEffectiveDate is not null");
            return (Criteria) this;
        }

        public Criteria andRecordeffectivedateEqualTo(Date value) {
            addCriterion("RecordEffectiveDate =", value, "recordeffectivedate");
            return (Criteria) this;
        }

        public Criteria andRecordeffectivedateNotEqualTo(Date value) {
            addCriterion("RecordEffectiveDate <>", value, "recordeffectivedate");
            return (Criteria) this;
        }

        public Criteria andRecordeffectivedateGreaterThan(Date value) {
            addCriterion("RecordEffectiveDate >", value, "recordeffectivedate");
            return (Criteria) this;
        }

        public Criteria andRecordeffectivedateGreaterThanOrEqualTo(Date value) {
            addCriterion("RecordEffectiveDate >=", value, "recordeffectivedate");
            return (Criteria) this;
        }

        public Criteria andRecordeffectivedateLessThan(Date value) {
            addCriterion("RecordEffectiveDate <", value, "recordeffectivedate");
            return (Criteria) this;
        }

        public Criteria andRecordeffectivedateLessThanOrEqualTo(Date value) {
            addCriterion("RecordEffectiveDate <=", value, "recordeffectivedate");
            return (Criteria) this;
        }

        public Criteria andRecordeffectivedateIn(List<Date> values) {
            addCriterion("RecordEffectiveDate in", values, "recordeffectivedate");
            return (Criteria) this;
        }

        public Criteria andRecordeffectivedateNotIn(List<Date> values) {
            addCriterion("RecordEffectiveDate not in", values, "recordeffectivedate");
            return (Criteria) this;
        }

        public Criteria andRecordeffectivedateBetween(Date value1, Date value2) {
            addCriterion("RecordEffectiveDate between", value1, value2, "recordeffectivedate");
            return (Criteria) this;
        }

        public Criteria andRecordeffectivedateNotBetween(Date value1, Date value2) {
            addCriterion("RecordEffectiveDate not between", value1, value2, "recordeffectivedate");
            return (Criteria) this;
        }

        public Criteria andRecordapprovaldateIsNull() {
            addCriterion("RecordApprovalDate is null");
            return (Criteria) this;
        }

        public Criteria andRecordapprovaldateIsNotNull() {
            addCriterion("RecordApprovalDate is not null");
            return (Criteria) this;
        }

        public Criteria andRecordapprovaldateEqualTo(Date value) {
            addCriterion("RecordApprovalDate =", value, "recordapprovaldate");
            return (Criteria) this;
        }

        public Criteria andRecordapprovaldateNotEqualTo(Date value) {
            addCriterion("RecordApprovalDate <>", value, "recordapprovaldate");
            return (Criteria) this;
        }

        public Criteria andRecordapprovaldateGreaterThan(Date value) {
            addCriterion("RecordApprovalDate >", value, "recordapprovaldate");
            return (Criteria) this;
        }

        public Criteria andRecordapprovaldateGreaterThanOrEqualTo(Date value) {
            addCriterion("RecordApprovalDate >=", value, "recordapprovaldate");
            return (Criteria) this;
        }

        public Criteria andRecordapprovaldateLessThan(Date value) {
            addCriterion("RecordApprovalDate <", value, "recordapprovaldate");
            return (Criteria) this;
        }

        public Criteria andRecordapprovaldateLessThanOrEqualTo(Date value) {
            addCriterion("RecordApprovalDate <=", value, "recordapprovaldate");
            return (Criteria) this;
        }

        public Criteria andRecordapprovaldateIn(List<Date> values) {
            addCriterion("RecordApprovalDate in", values, "recordapprovaldate");
            return (Criteria) this;
        }

        public Criteria andRecordapprovaldateNotIn(List<Date> values) {
            addCriterion("RecordApprovalDate not in", values, "recordapprovaldate");
            return (Criteria) this;
        }

        public Criteria andRecordapprovaldateBetween(Date value1, Date value2) {
            addCriterion("RecordApprovalDate between", value1, value2, "recordapprovaldate");
            return (Criteria) this;
        }

        public Criteria andRecordapprovaldateNotBetween(Date value1, Date value2) {
            addCriterion("RecordApprovalDate not between", value1, value2, "recordapprovaldate");
            return (Criteria) this;
        }

        public Criteria andIssuerecordorganIsNull() {
            addCriterion("IssueRecordOrgan is null");
            return (Criteria) this;
        }

        public Criteria andIssuerecordorganIsNotNull() {
            addCriterion("IssueRecordOrgan is not null");
            return (Criteria) this;
        }

        public Criteria andIssuerecordorganEqualTo(String value) {
            addCriterion("IssueRecordOrgan =", value, "issuerecordorgan");
            return (Criteria) this;
        }

        public Criteria andIssuerecordorganNotEqualTo(String value) {
            addCriterion("IssueRecordOrgan <>", value, "issuerecordorgan");
            return (Criteria) this;
        }

        public Criteria andIssuerecordorganGreaterThan(String value) {
            addCriterion("IssueRecordOrgan >", value, "issuerecordorgan");
            return (Criteria) this;
        }

        public Criteria andIssuerecordorganGreaterThanOrEqualTo(String value) {
            addCriterion("IssueRecordOrgan >=", value, "issuerecordorgan");
            return (Criteria) this;
        }

        public Criteria andIssuerecordorganLessThan(String value) {
            addCriterion("IssueRecordOrgan <", value, "issuerecordorgan");
            return (Criteria) this;
        }

        public Criteria andIssuerecordorganLessThanOrEqualTo(String value) {
            addCriterion("IssueRecordOrgan <=", value, "issuerecordorgan");
            return (Criteria) this;
        }

        public Criteria andIssuerecordorganLike(String value) {
            addCriterion("IssueRecordOrgan like", value, "issuerecordorgan");
            return (Criteria) this;
        }

        public Criteria andIssuerecordorganNotLike(String value) {
            addCriterion("IssueRecordOrgan not like", value, "issuerecordorgan");
            return (Criteria) this;
        }

        public Criteria andIssuerecordorganIn(List<String> values) {
            addCriterion("IssueRecordOrgan in", values, "issuerecordorgan");
            return (Criteria) this;
        }

        public Criteria andIssuerecordorganNotIn(List<String> values) {
            addCriterion("IssueRecordOrgan not in", values, "issuerecordorgan");
            return (Criteria) this;
        }

        public Criteria andIssuerecordorganBetween(String value1, String value2) {
            addCriterion("IssueRecordOrgan between", value1, value2, "issuerecordorgan");
            return (Criteria) this;
        }

        public Criteria andIssuerecordorganNotBetween(String value1, String value2) {
            addCriterion("IssueRecordOrgan not between", value1, value2, "issuerecordorgan");
            return (Criteria) this;
        }

        public Criteria andRecordimageIsNull() {
            addCriterion("RecordImage is null");
            return (Criteria) this;
        }

        public Criteria andRecordimageIsNotNull() {
            addCriterion("RecordImage is not null");
            return (Criteria) this;
        }

        public Criteria andRecordimageEqualTo(String value) {
            addCriterion("RecordImage =", value, "recordimage");
            return (Criteria) this;
        }

        public Criteria andRecordimageNotEqualTo(String value) {
            addCriterion("RecordImage <>", value, "recordimage");
            return (Criteria) this;
        }

        public Criteria andRecordimageGreaterThan(String value) {
            addCriterion("RecordImage >", value, "recordimage");
            return (Criteria) this;
        }

        public Criteria andRecordimageGreaterThanOrEqualTo(String value) {
            addCriterion("RecordImage >=", value, "recordimage");
            return (Criteria) this;
        }

        public Criteria andRecordimageLessThan(String value) {
            addCriterion("RecordImage <", value, "recordimage");
            return (Criteria) this;
        }

        public Criteria andRecordimageLessThanOrEqualTo(String value) {
            addCriterion("RecordImage <=", value, "recordimage");
            return (Criteria) this;
        }

        public Criteria andRecordimageLike(String value) {
            addCriterion("RecordImage like", value, "recordimage");
            return (Criteria) this;
        }

        public Criteria andRecordimageNotLike(String value) {
            addCriterion("RecordImage not like", value, "recordimage");
            return (Criteria) this;
        }

        public Criteria andRecordimageIn(List<String> values) {
            addCriterion("RecordImage in", values, "recordimage");
            return (Criteria) this;
        }

        public Criteria andRecordimageNotIn(List<String> values) {
            addCriterion("RecordImage not in", values, "recordimage");
            return (Criteria) this;
        }

        public Criteria andRecordimageBetween(String value1, String value2) {
            addCriterion("RecordImage between", value1, value2, "recordimage");
            return (Criteria) this;
        }

        public Criteria andRecordimageNotBetween(String value1, String value2) {
            addCriterion("RecordImage not between", value1, value2, "recordimage");
            return (Criteria) this;
        }

        public Criteria andAllowapprovaldateIsNull() {
            addCriterion("AllowApprovalDate is null");
            return (Criteria) this;
        }

        public Criteria andAllowapprovaldateIsNotNull() {
            addCriterion("AllowApprovalDate is not null");
            return (Criteria) this;
        }

        public Criteria andAllowapprovaldateEqualTo(Date value) {
            addCriterion("AllowApprovalDate =", value, "allowapprovaldate");
            return (Criteria) this;
        }

        public Criteria andAllowapprovaldateNotEqualTo(Date value) {
            addCriterion("AllowApprovalDate <>", value, "allowapprovaldate");
            return (Criteria) this;
        }

        public Criteria andAllowapprovaldateGreaterThan(Date value) {
            addCriterion("AllowApprovalDate >", value, "allowapprovaldate");
            return (Criteria) this;
        }

        public Criteria andAllowapprovaldateGreaterThanOrEqualTo(Date value) {
            addCriterion("AllowApprovalDate >=", value, "allowapprovaldate");
            return (Criteria) this;
        }

        public Criteria andAllowapprovaldateLessThan(Date value) {
            addCriterion("AllowApprovalDate <", value, "allowapprovaldate");
            return (Criteria) this;
        }

        public Criteria andAllowapprovaldateLessThanOrEqualTo(Date value) {
            addCriterion("AllowApprovalDate <=", value, "allowapprovaldate");
            return (Criteria) this;
        }

        public Criteria andAllowapprovaldateIn(List<Date> values) {
            addCriterion("AllowApprovalDate in", values, "allowapprovaldate");
            return (Criteria) this;
        }

        public Criteria andAllowapprovaldateNotIn(List<Date> values) {
            addCriterion("AllowApprovalDate not in", values, "allowapprovaldate");
            return (Criteria) this;
        }

        public Criteria andAllowapprovaldateBetween(Date value1, Date value2) {
            addCriterion("AllowApprovalDate between", value1, value2, "allowapprovaldate");
            return (Criteria) this;
        }

        public Criteria andAllowapprovaldateNotBetween(Date value1, Date value2) {
            addCriterion("AllowApprovalDate not between", value1, value2, "allowapprovaldate");
            return (Criteria) this;
        }

        public Criteria andAllowapprovalorganIsNull() {
            addCriterion("AllowApprovalOrgan is null");
            return (Criteria) this;
        }

        public Criteria andAllowapprovalorganIsNotNull() {
            addCriterion("AllowApprovalOrgan is not null");
            return (Criteria) this;
        }

        public Criteria andAllowapprovalorganEqualTo(String value) {
            addCriterion("AllowApprovalOrgan =", value, "allowapprovalorgan");
            return (Criteria) this;
        }

        public Criteria andAllowapprovalorganNotEqualTo(String value) {
            addCriterion("AllowApprovalOrgan <>", value, "allowapprovalorgan");
            return (Criteria) this;
        }

        public Criteria andAllowapprovalorganGreaterThan(String value) {
            addCriterion("AllowApprovalOrgan >", value, "allowapprovalorgan");
            return (Criteria) this;
        }

        public Criteria andAllowapprovalorganGreaterThanOrEqualTo(String value) {
            addCriterion("AllowApprovalOrgan >=", value, "allowapprovalorgan");
            return (Criteria) this;
        }

        public Criteria andAllowapprovalorganLessThan(String value) {
            addCriterion("AllowApprovalOrgan <", value, "allowapprovalorgan");
            return (Criteria) this;
        }

        public Criteria andAllowapprovalorganLessThanOrEqualTo(String value) {
            addCriterion("AllowApprovalOrgan <=", value, "allowapprovalorgan");
            return (Criteria) this;
        }

        public Criteria andAllowapprovalorganLike(String value) {
            addCriterion("AllowApprovalOrgan like", value, "allowapprovalorgan");
            return (Criteria) this;
        }

        public Criteria andAllowapprovalorganNotLike(String value) {
            addCriterion("AllowApprovalOrgan not like", value, "allowapprovalorgan");
            return (Criteria) this;
        }

        public Criteria andAllowapprovalorganIn(List<String> values) {
            addCriterion("AllowApprovalOrgan in", values, "allowapprovalorgan");
            return (Criteria) this;
        }

        public Criteria andAllowapprovalorganNotIn(List<String> values) {
            addCriterion("AllowApprovalOrgan not in", values, "allowapprovalorgan");
            return (Criteria) this;
        }

        public Criteria andAllowapprovalorganBetween(String value1, String value2) {
            addCriterion("AllowApprovalOrgan between", value1, value2, "allowapprovalorgan");
            return (Criteria) this;
        }

        public Criteria andAllowapprovalorganNotBetween(String value1, String value2) {
            addCriterion("AllowApprovalOrgan not between", value1, value2, "allowapprovalorgan");
            return (Criteria) this;
        }

        public Criteria andRegistereaddressIsNull() {
            addCriterion("RegistereAddress is null");
            return (Criteria) this;
        }

        public Criteria andRegistereaddressIsNotNull() {
            addCriterion("RegistereAddress is not null");
            return (Criteria) this;
        }

        public Criteria andRegistereaddressEqualTo(String value) {
            addCriterion("RegistereAddress =", value, "registereaddress");
            return (Criteria) this;
        }

        public Criteria andRegistereaddressNotEqualTo(String value) {
            addCriterion("RegistereAddress <>", value, "registereaddress");
            return (Criteria) this;
        }

        public Criteria andRegistereaddressGreaterThan(String value) {
            addCriterion("RegistereAddress >", value, "registereaddress");
            return (Criteria) this;
        }

        public Criteria andRegistereaddressGreaterThanOrEqualTo(String value) {
            addCriterion("RegistereAddress >=", value, "registereaddress");
            return (Criteria) this;
        }

        public Criteria andRegistereaddressLessThan(String value) {
            addCriterion("RegistereAddress <", value, "registereaddress");
            return (Criteria) this;
        }

        public Criteria andRegistereaddressLessThanOrEqualTo(String value) {
            addCriterion("RegistereAddress <=", value, "registereaddress");
            return (Criteria) this;
        }

        public Criteria andRegistereaddressLike(String value) {
            addCriterion("RegistereAddress like", value, "registereaddress");
            return (Criteria) this;
        }

        public Criteria andRegistereaddressNotLike(String value) {
            addCriterion("RegistereAddress not like", value, "registereaddress");
            return (Criteria) this;
        }

        public Criteria andRegistereaddressIn(List<String> values) {
            addCriterion("RegistereAddress in", values, "registereaddress");
            return (Criteria) this;
        }

        public Criteria andRegistereaddressNotIn(List<String> values) {
            addCriterion("RegistereAddress not in", values, "registereaddress");
            return (Criteria) this;
        }

        public Criteria andRegistereaddressBetween(String value1, String value2) {
            addCriterion("RegistereAddress between", value1, value2, "registereaddress");
            return (Criteria) this;
        }

        public Criteria andRegistereaddressNotBetween(String value1, String value2) {
            addCriterion("RegistereAddress not between", value1, value2, "registereaddress");
            return (Criteria) this;
        }

        public Criteria andBusinessaddressIsNull() {
            addCriterion("BusinessAddress is null");
            return (Criteria) this;
        }

        public Criteria andBusinessaddressIsNotNull() {
            addCriterion("BusinessAddress is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessaddressEqualTo(String value) {
            addCriterion("BusinessAddress =", value, "businessaddress");
            return (Criteria) this;
        }

        public Criteria andBusinessaddressNotEqualTo(String value) {
            addCriterion("BusinessAddress <>", value, "businessaddress");
            return (Criteria) this;
        }

        public Criteria andBusinessaddressGreaterThan(String value) {
            addCriterion("BusinessAddress >", value, "businessaddress");
            return (Criteria) this;
        }

        public Criteria andBusinessaddressGreaterThanOrEqualTo(String value) {
            addCriterion("BusinessAddress >=", value, "businessaddress");
            return (Criteria) this;
        }

        public Criteria andBusinessaddressLessThan(String value) {
            addCriterion("BusinessAddress <", value, "businessaddress");
            return (Criteria) this;
        }

        public Criteria andBusinessaddressLessThanOrEqualTo(String value) {
            addCriterion("BusinessAddress <=", value, "businessaddress");
            return (Criteria) this;
        }

        public Criteria andBusinessaddressLike(String value) {
            addCriterion("BusinessAddress like", value, "businessaddress");
            return (Criteria) this;
        }

        public Criteria andBusinessaddressNotLike(String value) {
            addCriterion("BusinessAddress not like", value, "businessaddress");
            return (Criteria) this;
        }

        public Criteria andBusinessaddressIn(List<String> values) {
            addCriterion("BusinessAddress in", values, "businessaddress");
            return (Criteria) this;
        }

        public Criteria andBusinessaddressNotIn(List<String> values) {
            addCriterion("BusinessAddress not in", values, "businessaddress");
            return (Criteria) this;
        }

        public Criteria andBusinessaddressBetween(String value1, String value2) {
            addCriterion("BusinessAddress between", value1, value2, "businessaddress");
            return (Criteria) this;
        }

        public Criteria andBusinessaddressNotBetween(String value1, String value2) {
            addCriterion("BusinessAddress not between", value1, value2, "businessaddress");
            return (Criteria) this;
        }

        public Criteria andStorehousesaddressIsNull() {
            addCriterion("StorehousesAddress is null");
            return (Criteria) this;
        }

        public Criteria andStorehousesaddressIsNotNull() {
            addCriterion("StorehousesAddress is not null");
            return (Criteria) this;
        }

        public Criteria andStorehousesaddressEqualTo(String value) {
            addCriterion("StorehousesAddress =", value, "storehousesaddress");
            return (Criteria) this;
        }

        public Criteria andStorehousesaddressNotEqualTo(String value) {
            addCriterion("StorehousesAddress <>", value, "storehousesaddress");
            return (Criteria) this;
        }

        public Criteria andStorehousesaddressGreaterThan(String value) {
            addCriterion("StorehousesAddress >", value, "storehousesaddress");
            return (Criteria) this;
        }

        public Criteria andStorehousesaddressGreaterThanOrEqualTo(String value) {
            addCriterion("StorehousesAddress >=", value, "storehousesaddress");
            return (Criteria) this;
        }

        public Criteria andStorehousesaddressLessThan(String value) {
            addCriterion("StorehousesAddress <", value, "storehousesaddress");
            return (Criteria) this;
        }

        public Criteria andStorehousesaddressLessThanOrEqualTo(String value) {
            addCriterion("StorehousesAddress <=", value, "storehousesaddress");
            return (Criteria) this;
        }

        public Criteria andStorehousesaddressLike(String value) {
            addCriterion("StorehousesAddress like", value, "storehousesaddress");
            return (Criteria) this;
        }

        public Criteria andStorehousesaddressNotLike(String value) {
            addCriterion("StorehousesAddress not like", value, "storehousesaddress");
            return (Criteria) this;
        }

        public Criteria andStorehousesaddressIn(List<String> values) {
            addCriterion("StorehousesAddress in", values, "storehousesaddress");
            return (Criteria) this;
        }

        public Criteria andStorehousesaddressNotIn(List<String> values) {
            addCriterion("StorehousesAddress not in", values, "storehousesaddress");
            return (Criteria) this;
        }

        public Criteria andStorehousesaddressBetween(String value1, String value2) {
            addCriterion("StorehousesAddress between", value1, value2, "storehousesaddress");
            return (Criteria) this;
        }

        public Criteria andStorehousesaddressNotBetween(String value1, String value2) {
            addCriterion("StorehousesAddress not between", value1, value2, "storehousesaddress");
            return (Criteria) this;
        }

        public Criteria andEntrustcontentIsNull() {
            addCriterion("EntrustContent is null");
            return (Criteria) this;
        }

        public Criteria andEntrustcontentIsNotNull() {
            addCriterion("EntrustContent is not null");
            return (Criteria) this;
        }

        public Criteria andEntrustcontentEqualTo(Integer value) {
            addCriterion("EntrustContent =", value, "entrustcontent");
            return (Criteria) this;
        }

        public Criteria andEntrustcontentNotEqualTo(Integer value) {
            addCriterion("EntrustContent <>", value, "entrustcontent");
            return (Criteria) this;
        }

        public Criteria andEntrustcontentGreaterThan(Integer value) {
            addCriterion("EntrustContent >", value, "entrustcontent");
            return (Criteria) this;
        }

        public Criteria andEntrustcontentGreaterThanOrEqualTo(Integer value) {
            addCriterion("EntrustContent >=", value, "entrustcontent");
            return (Criteria) this;
        }

        public Criteria andEntrustcontentLessThan(Integer value) {
            addCriterion("EntrustContent <", value, "entrustcontent");
            return (Criteria) this;
        }

        public Criteria andEntrustcontentLessThanOrEqualTo(Integer value) {
            addCriterion("EntrustContent <=", value, "entrustcontent");
            return (Criteria) this;
        }

        public Criteria andEntrustcontentIn(List<Integer> values) {
            addCriterion("EntrustContent in", values, "entrustcontent");
            return (Criteria) this;
        }

        public Criteria andEntrustcontentNotIn(List<Integer> values) {
            addCriterion("EntrustContent not in", values, "entrustcontent");
            return (Criteria) this;
        }

        public Criteria andEntrustcontentBetween(Integer value1, Integer value2) {
            addCriterion("EntrustContent between", value1, value2, "entrustcontent");
            return (Criteria) this;
        }

        public Criteria andEntrustcontentNotBetween(Integer value1, Integer value2) {
            addCriterion("EntrustContent not between", value1, value2, "entrustcontent");
            return (Criteria) this;
        }

        public Criteria andEntruststartdateIsNull() {
            addCriterion("EntrustStartDate is null");
            return (Criteria) this;
        }

        public Criteria andEntruststartdateIsNotNull() {
            addCriterion("EntrustStartDate is not null");
            return (Criteria) this;
        }

        public Criteria andEntruststartdateEqualTo(Date value) {
            addCriterion("EntrustStartDate =", value, "entruststartdate");
            return (Criteria) this;
        }

        public Criteria andEntruststartdateNotEqualTo(Date value) {
            addCriterion("EntrustStartDate <>", value, "entruststartdate");
            return (Criteria) this;
        }

        public Criteria andEntruststartdateGreaterThan(Date value) {
            addCriterion("EntrustStartDate >", value, "entruststartdate");
            return (Criteria) this;
        }

        public Criteria andEntruststartdateGreaterThanOrEqualTo(Date value) {
            addCriterion("EntrustStartDate >=", value, "entruststartdate");
            return (Criteria) this;
        }

        public Criteria andEntruststartdateLessThan(Date value) {
            addCriterion("EntrustStartDate <", value, "entruststartdate");
            return (Criteria) this;
        }

        public Criteria andEntruststartdateLessThanOrEqualTo(Date value) {
            addCriterion("EntrustStartDate <=", value, "entruststartdate");
            return (Criteria) this;
        }

        public Criteria andEntruststartdateIn(List<Date> values) {
            addCriterion("EntrustStartDate in", values, "entruststartdate");
            return (Criteria) this;
        }

        public Criteria andEntruststartdateNotIn(List<Date> values) {
            addCriterion("EntrustStartDate not in", values, "entruststartdate");
            return (Criteria) this;
        }

        public Criteria andEntruststartdateBetween(Date value1, Date value2) {
            addCriterion("EntrustStartDate between", value1, value2, "entruststartdate");
            return (Criteria) this;
        }

        public Criteria andEntruststartdateNotBetween(Date value1, Date value2) {
            addCriterion("EntrustStartDate not between", value1, value2, "entruststartdate");
            return (Criteria) this;
        }

        public Criteria andEntrustenddateIsNull() {
            addCriterion("EntrustEndDate is null");
            return (Criteria) this;
        }

        public Criteria andEntrustenddateIsNotNull() {
            addCriterion("EntrustEndDate is not null");
            return (Criteria) this;
        }

        public Criteria andEntrustenddateEqualTo(Date value) {
            addCriterion("EntrustEndDate =", value, "entrustenddate");
            return (Criteria) this;
        }

        public Criteria andEntrustenddateNotEqualTo(Date value) {
            addCriterion("EntrustEndDate <>", value, "entrustenddate");
            return (Criteria) this;
        }

        public Criteria andEntrustenddateGreaterThan(Date value) {
            addCriterion("EntrustEndDate >", value, "entrustenddate");
            return (Criteria) this;
        }

        public Criteria andEntrustenddateGreaterThanOrEqualTo(Date value) {
            addCriterion("EntrustEndDate >=", value, "entrustenddate");
            return (Criteria) this;
        }

        public Criteria andEntrustenddateLessThan(Date value) {
            addCriterion("EntrustEndDate <", value, "entrustenddate");
            return (Criteria) this;
        }

        public Criteria andEntrustenddateLessThanOrEqualTo(Date value) {
            addCriterion("EntrustEndDate <=", value, "entrustenddate");
            return (Criteria) this;
        }

        public Criteria andEntrustenddateIn(List<Date> values) {
            addCriterion("EntrustEndDate in", values, "entrustenddate");
            return (Criteria) this;
        }

        public Criteria andEntrustenddateNotIn(List<Date> values) {
            addCriterion("EntrustEndDate not in", values, "entrustenddate");
            return (Criteria) this;
        }

        public Criteria andEntrustenddateBetween(Date value1, Date value2) {
            addCriterion("EntrustEndDate between", value1, value2, "entrustenddate");
            return (Criteria) this;
        }

        public Criteria andEntrustenddateNotBetween(Date value1, Date value2) {
            addCriterion("EntrustEndDate not between", value1, value2, "entrustenddate");
            return (Criteria) this;
        }

        public Criteria andEntrustqxIsNull() {
            addCriterion("EntrustQX is null");
            return (Criteria) this;
        }

        public Criteria andEntrustqxIsNotNull() {
            addCriterion("EntrustQX is not null");
            return (Criteria) this;
        }

        public Criteria andEntrustqxEqualTo(Integer value) {
            addCriterion("EntrustQX =", value, "entrustqx");
            return (Criteria) this;
        }

        public Criteria andEntrustqxNotEqualTo(Integer value) {
            addCriterion("EntrustQX <>", value, "entrustqx");
            return (Criteria) this;
        }

        public Criteria andEntrustqxGreaterThan(Integer value) {
            addCriterion("EntrustQX >", value, "entrustqx");
            return (Criteria) this;
        }

        public Criteria andEntrustqxGreaterThanOrEqualTo(Integer value) {
            addCriterion("EntrustQX >=", value, "entrustqx");
            return (Criteria) this;
        }

        public Criteria andEntrustqxLessThan(Integer value) {
            addCriterion("EntrustQX <", value, "entrustqx");
            return (Criteria) this;
        }

        public Criteria andEntrustqxLessThanOrEqualTo(Integer value) {
            addCriterion("EntrustQX <=", value, "entrustqx");
            return (Criteria) this;
        }

        public Criteria andEntrustqxIn(List<Integer> values) {
            addCriterion("EntrustQX in", values, "entrustqx");
            return (Criteria) this;
        }

        public Criteria andEntrustqxNotIn(List<Integer> values) {
            addCriterion("EntrustQX not in", values, "entrustqx");
            return (Criteria) this;
        }

        public Criteria andEntrustqxBetween(Integer value1, Integer value2) {
            addCriterion("EntrustQX between", value1, value2, "entrustqx");
            return (Criteria) this;
        }

        public Criteria andEntrustqxNotBetween(Integer value1, Integer value2) {
            addCriterion("EntrustQX not between", value1, value2, "entrustqx");
            return (Criteria) this;
        }

        public Criteria andIschineselabelIsNull() {
            addCriterion("IsChineseLabel is null");
            return (Criteria) this;
        }

        public Criteria andIschineselabelIsNotNull() {
            addCriterion("IsChineseLabel is not null");
            return (Criteria) this;
        }

        public Criteria andIschineselabelEqualTo(Boolean value) {
            addCriterion("IsChineseLabel =", value, "ischineselabel");
            return (Criteria) this;
        }

        public Criteria andIschineselabelNotEqualTo(Boolean value) {
            addCriterion("IsChineseLabel <>", value, "ischineselabel");
            return (Criteria) this;
        }

        public Criteria andIschineselabelGreaterThan(Boolean value) {
            addCriterion("IsChineseLabel >", value, "ischineselabel");
            return (Criteria) this;
        }

        public Criteria andIschineselabelGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsChineseLabel >=", value, "ischineselabel");
            return (Criteria) this;
        }

        public Criteria andIschineselabelLessThan(Boolean value) {
            addCriterion("IsChineseLabel <", value, "ischineselabel");
            return (Criteria) this;
        }

        public Criteria andIschineselabelLessThanOrEqualTo(Boolean value) {
            addCriterion("IsChineseLabel <=", value, "ischineselabel");
            return (Criteria) this;
        }

        public Criteria andIschineselabelIn(List<Boolean> values) {
            addCriterion("IsChineseLabel in", values, "ischineselabel");
            return (Criteria) this;
        }

        public Criteria andIschineselabelNotIn(List<Boolean> values) {
            addCriterion("IsChineseLabel not in", values, "ischineselabel");
            return (Criteria) this;
        }

        public Criteria andIschineselabelBetween(Boolean value1, Boolean value2) {
            addCriterion("IsChineseLabel between", value1, value2, "ischineselabel");
            return (Criteria) this;
        }

        public Criteria andIschineselabelNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsChineseLabel not between", value1, value2, "ischineselabel");
            return (Criteria) this;
        }

        public Criteria andContractdocumentsIsNull() {
            addCriterion("ContractDocuments is null");
            return (Criteria) this;
        }

        public Criteria andContractdocumentsIsNotNull() {
            addCriterion("ContractDocuments is not null");
            return (Criteria) this;
        }

        public Criteria andContractdocumentsEqualTo(String value) {
            addCriterion("ContractDocuments =", value, "contractdocuments");
            return (Criteria) this;
        }

        public Criteria andContractdocumentsNotEqualTo(String value) {
            addCriterion("ContractDocuments <>", value, "contractdocuments");
            return (Criteria) this;
        }

        public Criteria andContractdocumentsGreaterThan(String value) {
            addCriterion("ContractDocuments >", value, "contractdocuments");
            return (Criteria) this;
        }

        public Criteria andContractdocumentsGreaterThanOrEqualTo(String value) {
            addCriterion("ContractDocuments >=", value, "contractdocuments");
            return (Criteria) this;
        }

        public Criteria andContractdocumentsLessThan(String value) {
            addCriterion("ContractDocuments <", value, "contractdocuments");
            return (Criteria) this;
        }

        public Criteria andContractdocumentsLessThanOrEqualTo(String value) {
            addCriterion("ContractDocuments <=", value, "contractdocuments");
            return (Criteria) this;
        }

        public Criteria andContractdocumentsLike(String value) {
            addCriterion("ContractDocuments like", value, "contractdocuments");
            return (Criteria) this;
        }

        public Criteria andContractdocumentsNotLike(String value) {
            addCriterion("ContractDocuments not like", value, "contractdocuments");
            return (Criteria) this;
        }

        public Criteria andContractdocumentsIn(List<String> values) {
            addCriterion("ContractDocuments in", values, "contractdocuments");
            return (Criteria) this;
        }

        public Criteria andContractdocumentsNotIn(List<String> values) {
            addCriterion("ContractDocuments not in", values, "contractdocuments");
            return (Criteria) this;
        }

        public Criteria andContractdocumentsBetween(String value1, String value2) {
            addCriterion("ContractDocuments between", value1, value2, "contractdocuments");
            return (Criteria) this;
        }

        public Criteria andContractdocumentsNotBetween(String value1, String value2) {
            addCriterion("ContractDocuments not between", value1, value2, "contractdocuments");
            return (Criteria) this;
        }

        public Criteria andLegalrepresentativeIsNull() {
            addCriterion("LegalRepresentative is null");
            return (Criteria) this;
        }

        public Criteria andLegalrepresentativeIsNotNull() {
            addCriterion("LegalRepresentative is not null");
            return (Criteria) this;
        }

        public Criteria andLegalrepresentativeEqualTo(String value) {
            addCriterion("LegalRepresentative =", value, "legalrepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalrepresentativeNotEqualTo(String value) {
            addCriterion("LegalRepresentative <>", value, "legalrepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalrepresentativeGreaterThan(String value) {
            addCriterion("LegalRepresentative >", value, "legalrepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalrepresentativeGreaterThanOrEqualTo(String value) {
            addCriterion("LegalRepresentative >=", value, "legalrepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalrepresentativeLessThan(String value) {
            addCriterion("LegalRepresentative <", value, "legalrepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalrepresentativeLessThanOrEqualTo(String value) {
            addCriterion("LegalRepresentative <=", value, "legalrepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalrepresentativeLike(String value) {
            addCriterion("LegalRepresentative like", value, "legalrepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalrepresentativeNotLike(String value) {
            addCriterion("LegalRepresentative not like", value, "legalrepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalrepresentativeIn(List<String> values) {
            addCriterion("LegalRepresentative in", values, "legalrepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalrepresentativeNotIn(List<String> values) {
            addCriterion("LegalRepresentative not in", values, "legalrepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalrepresentativeBetween(String value1, String value2) {
            addCriterion("LegalRepresentative between", value1, value2, "legalrepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalrepresentativeNotBetween(String value1, String value2) {
            addCriterion("LegalRepresentative not between", value1, value2, "legalrepresentative");
            return (Criteria) this;
        }

        public Criteria andBusinessownerIsNull() {
            addCriterion("BusinessOwner is null");
            return (Criteria) this;
        }

        public Criteria andBusinessownerIsNotNull() {
            addCriterion("BusinessOwner is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessownerEqualTo(String value) {
            addCriterion("BusinessOwner =", value, "businessowner");
            return (Criteria) this;
        }

        public Criteria andBusinessownerNotEqualTo(String value) {
            addCriterion("BusinessOwner <>", value, "businessowner");
            return (Criteria) this;
        }

        public Criteria andBusinessownerGreaterThan(String value) {
            addCriterion("BusinessOwner >", value, "businessowner");
            return (Criteria) this;
        }

        public Criteria andBusinessownerGreaterThanOrEqualTo(String value) {
            addCriterion("BusinessOwner >=", value, "businessowner");
            return (Criteria) this;
        }

        public Criteria andBusinessownerLessThan(String value) {
            addCriterion("BusinessOwner <", value, "businessowner");
            return (Criteria) this;
        }

        public Criteria andBusinessownerLessThanOrEqualTo(String value) {
            addCriterion("BusinessOwner <=", value, "businessowner");
            return (Criteria) this;
        }

        public Criteria andBusinessownerLike(String value) {
            addCriterion("BusinessOwner like", value, "businessowner");
            return (Criteria) this;
        }

        public Criteria andBusinessownerNotLike(String value) {
            addCriterion("BusinessOwner not like", value, "businessowner");
            return (Criteria) this;
        }

        public Criteria andBusinessownerIn(List<String> values) {
            addCriterion("BusinessOwner in", values, "businessowner");
            return (Criteria) this;
        }

        public Criteria andBusinessownerNotIn(List<String> values) {
            addCriterion("BusinessOwner not in", values, "businessowner");
            return (Criteria) this;
        }

        public Criteria andBusinessownerBetween(String value1, String value2) {
            addCriterion("BusinessOwner between", value1, value2, "businessowner");
            return (Criteria) this;
        }

        public Criteria andBusinessownerNotBetween(String value1, String value2) {
            addCriterion("BusinessOwner not between", value1, value2, "businessowner");
            return (Criteria) this;
        }

        public Criteria andIs3to1IsNull() {
            addCriterion("Is3To1 is null");
            return (Criteria) this;
        }

        public Criteria andIs3to1IsNotNull() {
            addCriterion("Is3To1 is not null");
            return (Criteria) this;
        }

        public Criteria andIs3to1EqualTo(Boolean value) {
            addCriterion("Is3To1 =", value, "is3to1");
            return (Criteria) this;
        }

        public Criteria andIs3to1NotEqualTo(Boolean value) {
            addCriterion("Is3To1 <>", value, "is3to1");
            return (Criteria) this;
        }

        public Criteria andIs3to1GreaterThan(Boolean value) {
            addCriterion("Is3To1 >", value, "is3to1");
            return (Criteria) this;
        }

        public Criteria andIs3to1GreaterThanOrEqualTo(Boolean value) {
            addCriterion("Is3To1 >=", value, "is3to1");
            return (Criteria) this;
        }

        public Criteria andIs3to1LessThan(Boolean value) {
            addCriterion("Is3To1 <", value, "is3to1");
            return (Criteria) this;
        }

        public Criteria andIs3to1LessThanOrEqualTo(Boolean value) {
            addCriterion("Is3To1 <=", value, "is3to1");
            return (Criteria) this;
        }

        public Criteria andIs3to1In(List<Boolean> values) {
            addCriterion("Is3To1 in", values, "is3to1");
            return (Criteria) this;
        }

        public Criteria andIs3to1NotIn(List<Boolean> values) {
            addCriterion("Is3To1 not in", values, "is3to1");
            return (Criteria) this;
        }

        public Criteria andIs3to1Between(Boolean value1, Boolean value2) {
            addCriterion("Is3To1 between", value1, value2, "is3to1");
            return (Criteria) this;
        }

        public Criteria andIs3to1NotBetween(Boolean value1, Boolean value2) {
            addCriterion("Is3To1 not between", value1, value2, "is3to1");
            return (Criteria) this;
        }

        public Criteria andRemindingtimeIsNull() {
            addCriterion("RemindingTime is null");
            return (Criteria) this;
        }

        public Criteria andRemindingtimeIsNotNull() {
            addCriterion("RemindingTime is not null");
            return (Criteria) this;
        }

        public Criteria andRemindingtimeEqualTo(Integer value) {
            addCriterion("RemindingTime =", value, "remindingtime");
            return (Criteria) this;
        }

        public Criteria andRemindingtimeNotEqualTo(Integer value) {
            addCriterion("RemindingTime <>", value, "remindingtime");
            return (Criteria) this;
        }

        public Criteria andRemindingtimeGreaterThan(Integer value) {
            addCriterion("RemindingTime >", value, "remindingtime");
            return (Criteria) this;
        }

        public Criteria andRemindingtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("RemindingTime >=", value, "remindingtime");
            return (Criteria) this;
        }

        public Criteria andRemindingtimeLessThan(Integer value) {
            addCriterion("RemindingTime <", value, "remindingtime");
            return (Criteria) this;
        }

        public Criteria andRemindingtimeLessThanOrEqualTo(Integer value) {
            addCriterion("RemindingTime <=", value, "remindingtime");
            return (Criteria) this;
        }

        public Criteria andRemindingtimeIn(List<Integer> values) {
            addCriterion("RemindingTime in", values, "remindingtime");
            return (Criteria) this;
        }

        public Criteria andRemindingtimeNotIn(List<Integer> values) {
            addCriterion("RemindingTime not in", values, "remindingtime");
            return (Criteria) this;
        }

        public Criteria andRemindingtimeBetween(Integer value1, Integer value2) {
            addCriterion("RemindingTime between", value1, value2, "remindingtime");
            return (Criteria) this;
        }

        public Criteria andRemindingtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("RemindingTime not between", value1, value2, "remindingtime");
            return (Criteria) this;
        }

        public Criteria andSelectionstrategyIsNull() {
            addCriterion("SelectionStrategy is null");
            return (Criteria) this;
        }

        public Criteria andSelectionstrategyIsNotNull() {
            addCriterion("SelectionStrategy is not null");
            return (Criteria) this;
        }

        public Criteria andSelectionstrategyEqualTo(Integer value) {
            addCriterion("SelectionStrategy =", value, "selectionstrategy");
            return (Criteria) this;
        }

        public Criteria andSelectionstrategyNotEqualTo(Integer value) {
            addCriterion("SelectionStrategy <>", value, "selectionstrategy");
            return (Criteria) this;
        }

        public Criteria andSelectionstrategyGreaterThan(Integer value) {
            addCriterion("SelectionStrategy >", value, "selectionstrategy");
            return (Criteria) this;
        }

        public Criteria andSelectionstrategyGreaterThanOrEqualTo(Integer value) {
            addCriterion("SelectionStrategy >=", value, "selectionstrategy");
            return (Criteria) this;
        }

        public Criteria andSelectionstrategyLessThan(Integer value) {
            addCriterion("SelectionStrategy <", value, "selectionstrategy");
            return (Criteria) this;
        }

        public Criteria andSelectionstrategyLessThanOrEqualTo(Integer value) {
            addCriterion("SelectionStrategy <=", value, "selectionstrategy");
            return (Criteria) this;
        }

        public Criteria andSelectionstrategyIn(List<Integer> values) {
            addCriterion("SelectionStrategy in", values, "selectionstrategy");
            return (Criteria) this;
        }

        public Criteria andSelectionstrategyNotIn(List<Integer> values) {
            addCriterion("SelectionStrategy not in", values, "selectionstrategy");
            return (Criteria) this;
        }

        public Criteria andSelectionstrategyBetween(Integer value1, Integer value2) {
            addCriterion("SelectionStrategy between", value1, value2, "selectionstrategy");
            return (Criteria) this;
        }

        public Criteria andSelectionstrategyNotBetween(Integer value1, Integer value2) {
            addCriterion("SelectionStrategy not between", value1, value2, "selectionstrategy");
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
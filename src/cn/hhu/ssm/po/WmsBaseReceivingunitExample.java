package cn.hhu.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WmsBaseReceivingunitExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WmsBaseReceivingunitExample() {
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

        public Criteria andShipperNumberIsNull() {
            addCriterion("Shipper_Number is null");
            return (Criteria) this;
        }

        public Criteria andShipperNumberIsNotNull() {
            addCriterion("Shipper_Number is not null");
            return (Criteria) this;
        }

        public Criteria andShipperNumberEqualTo(String value) {
            addCriterion("Shipper_Number =", value, "shipperNumber");
            return (Criteria) this;
        }

        public Criteria andShipperNumberNotEqualTo(String value) {
            addCriterion("Shipper_Number <>", value, "shipperNumber");
            return (Criteria) this;
        }

        public Criteria andShipperNumberGreaterThan(String value) {
            addCriterion("Shipper_Number >", value, "shipperNumber");
            return (Criteria) this;
        }

        public Criteria andShipperNumberGreaterThanOrEqualTo(String value) {
            addCriterion("Shipper_Number >=", value, "shipperNumber");
            return (Criteria) this;
        }

        public Criteria andShipperNumberLessThan(String value) {
            addCriterion("Shipper_Number <", value, "shipperNumber");
            return (Criteria) this;
        }

        public Criteria andShipperNumberLessThanOrEqualTo(String value) {
            addCriterion("Shipper_Number <=", value, "shipperNumber");
            return (Criteria) this;
        }

        public Criteria andShipperNumberLike(String value) {
            addCriterion("Shipper_Number like", value, "shipperNumber");
            return (Criteria) this;
        }

        public Criteria andShipperNumberNotLike(String value) {
            addCriterion("Shipper_Number not like", value, "shipperNumber");
            return (Criteria) this;
        }

        public Criteria andShipperNumberIn(List<String> values) {
            addCriterion("Shipper_Number in", values, "shipperNumber");
            return (Criteria) this;
        }

        public Criteria andShipperNumberNotIn(List<String> values) {
            addCriterion("Shipper_Number not in", values, "shipperNumber");
            return (Criteria) this;
        }

        public Criteria andShipperNumberBetween(String value1, String value2) {
            addCriterion("Shipper_Number between", value1, value2, "shipperNumber");
            return (Criteria) this;
        }

        public Criteria andShipperNumberNotBetween(String value1, String value2) {
            addCriterion("Shipper_Number not between", value1, value2, "shipperNumber");
            return (Criteria) this;
        }

        public Criteria andUnitnameIsNull() {
            addCriterion("UnitName is null");
            return (Criteria) this;
        }

        public Criteria andUnitnameIsNotNull() {
            addCriterion("UnitName is not null");
            return (Criteria) this;
        }

        public Criteria andUnitnameEqualTo(String value) {
            addCriterion("UnitName =", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameNotEqualTo(String value) {
            addCriterion("UnitName <>", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameGreaterThan(String value) {
            addCriterion("UnitName >", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameGreaterThanOrEqualTo(String value) {
            addCriterion("UnitName >=", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameLessThan(String value) {
            addCriterion("UnitName <", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameLessThanOrEqualTo(String value) {
            addCriterion("UnitName <=", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameLike(String value) {
            addCriterion("UnitName like", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameNotLike(String value) {
            addCriterion("UnitName not like", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameIn(List<String> values) {
            addCriterion("UnitName in", values, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameNotIn(List<String> values) {
            addCriterion("UnitName not in", values, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameBetween(String value1, String value2) {
            addCriterion("UnitName between", value1, value2, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameNotBetween(String value1, String value2) {
            addCriterion("UnitName not between", value1, value2, "unitname");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseNumberIsNull() {
            addCriterion("BusinessLicense_Number is null");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseNumberIsNotNull() {
            addCriterion("BusinessLicense_Number is not null");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseNumberEqualTo(String value) {
            addCriterion("BusinessLicense_Number =", value, "businesslicenseNumber");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseNumberNotEqualTo(String value) {
            addCriterion("BusinessLicense_Number <>", value, "businesslicenseNumber");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseNumberGreaterThan(String value) {
            addCriterion("BusinessLicense_Number >", value, "businesslicenseNumber");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseNumberGreaterThanOrEqualTo(String value) {
            addCriterion("BusinessLicense_Number >=", value, "businesslicenseNumber");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseNumberLessThan(String value) {
            addCriterion("BusinessLicense_Number <", value, "businesslicenseNumber");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseNumberLessThanOrEqualTo(String value) {
            addCriterion("BusinessLicense_Number <=", value, "businesslicenseNumber");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseNumberLike(String value) {
            addCriterion("BusinessLicense_Number like", value, "businesslicenseNumber");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseNumberNotLike(String value) {
            addCriterion("BusinessLicense_Number not like", value, "businesslicenseNumber");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseNumberIn(List<String> values) {
            addCriterion("BusinessLicense_Number in", values, "businesslicenseNumber");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseNumberNotIn(List<String> values) {
            addCriterion("BusinessLicense_Number not in", values, "businesslicenseNumber");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseNumberBetween(String value1, String value2) {
            addCriterion("BusinessLicense_Number between", value1, value2, "businesslicenseNumber");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseNumberNotBetween(String value1, String value2) {
            addCriterion("BusinessLicense_Number not between", value1, value2, "businesslicenseNumber");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensevalidityIsNull() {
            addCriterion("BusinessLicenseValidity is null");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensevalidityIsNotNull() {
            addCriterion("BusinessLicenseValidity is not null");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensevalidityEqualTo(Date value) {
            addCriterion("BusinessLicenseValidity =", value, "businesslicensevalidity");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensevalidityNotEqualTo(Date value) {
            addCriterion("BusinessLicenseValidity <>", value, "businesslicensevalidity");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensevalidityGreaterThan(Date value) {
            addCriterion("BusinessLicenseValidity >", value, "businesslicensevalidity");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensevalidityGreaterThanOrEqualTo(Date value) {
            addCriterion("BusinessLicenseValidity >=", value, "businesslicensevalidity");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensevalidityLessThan(Date value) {
            addCriterion("BusinessLicenseValidity <", value, "businesslicensevalidity");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensevalidityLessThanOrEqualTo(Date value) {
            addCriterion("BusinessLicenseValidity <=", value, "businesslicensevalidity");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensevalidityIn(List<Date> values) {
            addCriterion("BusinessLicenseValidity in", values, "businesslicensevalidity");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensevalidityNotIn(List<Date> values) {
            addCriterion("BusinessLicenseValidity not in", values, "businesslicensevalidity");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensevalidityBetween(Date value1, Date value2) {
            addCriterion("BusinessLicenseValidity between", value1, value2, "businesslicensevalidity");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensevalidityNotBetween(Date value1, Date value2) {
            addCriterion("BusinessLicenseValidity not between", value1, value2, "businesslicensevalidity");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensephotoIsNull() {
            addCriterion("BusinessLicensePhoto is null");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensephotoIsNotNull() {
            addCriterion("BusinessLicensePhoto is not null");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensephotoEqualTo(String value) {
            addCriterion("BusinessLicensePhoto =", value, "businesslicensephoto");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensephotoNotEqualTo(String value) {
            addCriterion("BusinessLicensePhoto <>", value, "businesslicensephoto");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensephotoGreaterThan(String value) {
            addCriterion("BusinessLicensePhoto >", value, "businesslicensephoto");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensephotoGreaterThanOrEqualTo(String value) {
            addCriterion("BusinessLicensePhoto >=", value, "businesslicensephoto");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensephotoLessThan(String value) {
            addCriterion("BusinessLicensePhoto <", value, "businesslicensephoto");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensephotoLessThanOrEqualTo(String value) {
            addCriterion("BusinessLicensePhoto <=", value, "businesslicensephoto");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensephotoLike(String value) {
            addCriterion("BusinessLicensePhoto like", value, "businesslicensephoto");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensephotoNotLike(String value) {
            addCriterion("BusinessLicensePhoto not like", value, "businesslicensephoto");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensephotoIn(List<String> values) {
            addCriterion("BusinessLicensePhoto in", values, "businesslicensephoto");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensephotoNotIn(List<String> values) {
            addCriterion("BusinessLicensePhoto not in", values, "businesslicensephoto");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensephotoBetween(String value1, String value2) {
            addCriterion("BusinessLicensePhoto between", value1, value2, "businesslicensephoto");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensephotoNotBetween(String value1, String value2) {
            addCriterion("BusinessLicensePhoto not between", value1, value2, "businesslicensephoto");
            return (Criteria) this;
        }

        public Criteria andBusinessallowNumberIsNull() {
            addCriterion("BusinessAllow_Number is null");
            return (Criteria) this;
        }

        public Criteria andBusinessallowNumberIsNotNull() {
            addCriterion("BusinessAllow_Number is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessallowNumberEqualTo(String value) {
            addCriterion("BusinessAllow_Number =", value, "businessallowNumber");
            return (Criteria) this;
        }

        public Criteria andBusinessallowNumberNotEqualTo(String value) {
            addCriterion("BusinessAllow_Number <>", value, "businessallowNumber");
            return (Criteria) this;
        }

        public Criteria andBusinessallowNumberGreaterThan(String value) {
            addCriterion("BusinessAllow_Number >", value, "businessallowNumber");
            return (Criteria) this;
        }

        public Criteria andBusinessallowNumberGreaterThanOrEqualTo(String value) {
            addCriterion("BusinessAllow_Number >=", value, "businessallowNumber");
            return (Criteria) this;
        }

        public Criteria andBusinessallowNumberLessThan(String value) {
            addCriterion("BusinessAllow_Number <", value, "businessallowNumber");
            return (Criteria) this;
        }

        public Criteria andBusinessallowNumberLessThanOrEqualTo(String value) {
            addCriterion("BusinessAllow_Number <=", value, "businessallowNumber");
            return (Criteria) this;
        }

        public Criteria andBusinessallowNumberLike(String value) {
            addCriterion("BusinessAllow_Number like", value, "businessallowNumber");
            return (Criteria) this;
        }

        public Criteria andBusinessallowNumberNotLike(String value) {
            addCriterion("BusinessAllow_Number not like", value, "businessallowNumber");
            return (Criteria) this;
        }

        public Criteria andBusinessallowNumberIn(List<String> values) {
            addCriterion("BusinessAllow_Number in", values, "businessallowNumber");
            return (Criteria) this;
        }

        public Criteria andBusinessallowNumberNotIn(List<String> values) {
            addCriterion("BusinessAllow_Number not in", values, "businessallowNumber");
            return (Criteria) this;
        }

        public Criteria andBusinessallowNumberBetween(String value1, String value2) {
            addCriterion("BusinessAllow_Number between", value1, value2, "businessallowNumber");
            return (Criteria) this;
        }

        public Criteria andBusinessallowNumberNotBetween(String value1, String value2) {
            addCriterion("BusinessAllow_Number not between", value1, value2, "businessallowNumber");
            return (Criteria) this;
        }

        public Criteria andBusinessallowvalidityIsNull() {
            addCriterion("BusinessAllowValidity is null");
            return (Criteria) this;
        }

        public Criteria andBusinessallowvalidityIsNotNull() {
            addCriterion("BusinessAllowValidity is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessallowvalidityEqualTo(Date value) {
            addCriterion("BusinessAllowValidity =", value, "businessallowvalidity");
            return (Criteria) this;
        }

        public Criteria andBusinessallowvalidityNotEqualTo(Date value) {
            addCriterion("BusinessAllowValidity <>", value, "businessallowvalidity");
            return (Criteria) this;
        }

        public Criteria andBusinessallowvalidityGreaterThan(Date value) {
            addCriterion("BusinessAllowValidity >", value, "businessallowvalidity");
            return (Criteria) this;
        }

        public Criteria andBusinessallowvalidityGreaterThanOrEqualTo(Date value) {
            addCriterion("BusinessAllowValidity >=", value, "businessallowvalidity");
            return (Criteria) this;
        }

        public Criteria andBusinessallowvalidityLessThan(Date value) {
            addCriterion("BusinessAllowValidity <", value, "businessallowvalidity");
            return (Criteria) this;
        }

        public Criteria andBusinessallowvalidityLessThanOrEqualTo(Date value) {
            addCriterion("BusinessAllowValidity <=", value, "businessallowvalidity");
            return (Criteria) this;
        }

        public Criteria andBusinessallowvalidityIn(List<Date> values) {
            addCriterion("BusinessAllowValidity in", values, "businessallowvalidity");
            return (Criteria) this;
        }

        public Criteria andBusinessallowvalidityNotIn(List<Date> values) {
            addCriterion("BusinessAllowValidity not in", values, "businessallowvalidity");
            return (Criteria) this;
        }

        public Criteria andBusinessallowvalidityBetween(Date value1, Date value2) {
            addCriterion("BusinessAllowValidity between", value1, value2, "businessallowvalidity");
            return (Criteria) this;
        }

        public Criteria andBusinessallowvalidityNotBetween(Date value1, Date value2) {
            addCriterion("BusinessAllowValidity not between", value1, value2, "businessallowvalidity");
            return (Criteria) this;
        }

        public Criteria andBusinessallowphotoIsNull() {
            addCriterion("BusinessAllowPhoto is null");
            return (Criteria) this;
        }

        public Criteria andBusinessallowphotoIsNotNull() {
            addCriterion("BusinessAllowPhoto is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessallowphotoEqualTo(String value) {
            addCriterion("BusinessAllowPhoto =", value, "businessallowphoto");
            return (Criteria) this;
        }

        public Criteria andBusinessallowphotoNotEqualTo(String value) {
            addCriterion("BusinessAllowPhoto <>", value, "businessallowphoto");
            return (Criteria) this;
        }

        public Criteria andBusinessallowphotoGreaterThan(String value) {
            addCriterion("BusinessAllowPhoto >", value, "businessallowphoto");
            return (Criteria) this;
        }

        public Criteria andBusinessallowphotoGreaterThanOrEqualTo(String value) {
            addCriterion("BusinessAllowPhoto >=", value, "businessallowphoto");
            return (Criteria) this;
        }

        public Criteria andBusinessallowphotoLessThan(String value) {
            addCriterion("BusinessAllowPhoto <", value, "businessallowphoto");
            return (Criteria) this;
        }

        public Criteria andBusinessallowphotoLessThanOrEqualTo(String value) {
            addCriterion("BusinessAllowPhoto <=", value, "businessallowphoto");
            return (Criteria) this;
        }

        public Criteria andBusinessallowphotoLike(String value) {
            addCriterion("BusinessAllowPhoto like", value, "businessallowphoto");
            return (Criteria) this;
        }

        public Criteria andBusinessallowphotoNotLike(String value) {
            addCriterion("BusinessAllowPhoto not like", value, "businessallowphoto");
            return (Criteria) this;
        }

        public Criteria andBusinessallowphotoIn(List<String> values) {
            addCriterion("BusinessAllowPhoto in", values, "businessallowphoto");
            return (Criteria) this;
        }

        public Criteria andBusinessallowphotoNotIn(List<String> values) {
            addCriterion("BusinessAllowPhoto not in", values, "businessallowphoto");
            return (Criteria) this;
        }

        public Criteria andBusinessallowphotoBetween(String value1, String value2) {
            addCriterion("BusinessAllowPhoto between", value1, value2, "businessallowphoto");
            return (Criteria) this;
        }

        public Criteria andBusinessallowphotoNotBetween(String value1, String value2) {
            addCriterion("BusinessAllowPhoto not between", value1, value2, "businessallowphoto");
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

        public Criteria andBusinessareaIsNull() {
            addCriterion("BusinessArea is null");
            return (Criteria) this;
        }

        public Criteria andBusinessareaIsNotNull() {
            addCriterion("BusinessArea is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessareaEqualTo(String value) {
            addCriterion("BusinessArea =", value, "businessarea");
            return (Criteria) this;
        }

        public Criteria andBusinessareaNotEqualTo(String value) {
            addCriterion("BusinessArea <>", value, "businessarea");
            return (Criteria) this;
        }

        public Criteria andBusinessareaGreaterThan(String value) {
            addCriterion("BusinessArea >", value, "businessarea");
            return (Criteria) this;
        }

        public Criteria andBusinessareaGreaterThanOrEqualTo(String value) {
            addCriterion("BusinessArea >=", value, "businessarea");
            return (Criteria) this;
        }

        public Criteria andBusinessareaLessThan(String value) {
            addCriterion("BusinessArea <", value, "businessarea");
            return (Criteria) this;
        }

        public Criteria andBusinessareaLessThanOrEqualTo(String value) {
            addCriterion("BusinessArea <=", value, "businessarea");
            return (Criteria) this;
        }

        public Criteria andBusinessareaLike(String value) {
            addCriterion("BusinessArea like", value, "businessarea");
            return (Criteria) this;
        }

        public Criteria andBusinessareaNotLike(String value) {
            addCriterion("BusinessArea not like", value, "businessarea");
            return (Criteria) this;
        }

        public Criteria andBusinessareaIn(List<String> values) {
            addCriterion("BusinessArea in", values, "businessarea");
            return (Criteria) this;
        }

        public Criteria andBusinessareaNotIn(List<String> values) {
            addCriterion("BusinessArea not in", values, "businessarea");
            return (Criteria) this;
        }

        public Criteria andBusinessareaBetween(String value1, String value2) {
            addCriterion("BusinessArea between", value1, value2, "businessarea");
            return (Criteria) this;
        }

        public Criteria andBusinessareaNotBetween(String value1, String value2) {
            addCriterion("BusinessArea not between", value1, value2, "businessarea");
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

        public Criteria andRecordvalidityIsNull() {
            addCriterion("RecordValidity is null");
            return (Criteria) this;
        }

        public Criteria andRecordvalidityIsNotNull() {
            addCriterion("RecordValidity is not null");
            return (Criteria) this;
        }

        public Criteria andRecordvalidityEqualTo(Date value) {
            addCriterion("RecordValidity =", value, "recordvalidity");
            return (Criteria) this;
        }

        public Criteria andRecordvalidityNotEqualTo(Date value) {
            addCriterion("RecordValidity <>", value, "recordvalidity");
            return (Criteria) this;
        }

        public Criteria andRecordvalidityGreaterThan(Date value) {
            addCriterion("RecordValidity >", value, "recordvalidity");
            return (Criteria) this;
        }

        public Criteria andRecordvalidityGreaterThanOrEqualTo(Date value) {
            addCriterion("RecordValidity >=", value, "recordvalidity");
            return (Criteria) this;
        }

        public Criteria andRecordvalidityLessThan(Date value) {
            addCriterion("RecordValidity <", value, "recordvalidity");
            return (Criteria) this;
        }

        public Criteria andRecordvalidityLessThanOrEqualTo(Date value) {
            addCriterion("RecordValidity <=", value, "recordvalidity");
            return (Criteria) this;
        }

        public Criteria andRecordvalidityIn(List<Date> values) {
            addCriterion("RecordValidity in", values, "recordvalidity");
            return (Criteria) this;
        }

        public Criteria andRecordvalidityNotIn(List<Date> values) {
            addCriterion("RecordValidity not in", values, "recordvalidity");
            return (Criteria) this;
        }

        public Criteria andRecordvalidityBetween(Date value1, Date value2) {
            addCriterion("RecordValidity between", value1, value2, "recordvalidity");
            return (Criteria) this;
        }

        public Criteria andRecordvalidityNotBetween(Date value1, Date value2) {
            addCriterion("RecordValidity not between", value1, value2, "recordvalidity");
            return (Criteria) this;
        }

        public Criteria andRecordapprovedateIsNull() {
            addCriterion("RecordApproveDate is null");
            return (Criteria) this;
        }

        public Criteria andRecordapprovedateIsNotNull() {
            addCriterion("RecordApproveDate is not null");
            return (Criteria) this;
        }

        public Criteria andRecordapprovedateEqualTo(Date value) {
            addCriterion("RecordApproveDate =", value, "recordapprovedate");
            return (Criteria) this;
        }

        public Criteria andRecordapprovedateNotEqualTo(Date value) {
            addCriterion("RecordApproveDate <>", value, "recordapprovedate");
            return (Criteria) this;
        }

        public Criteria andRecordapprovedateGreaterThan(Date value) {
            addCriterion("RecordApproveDate >", value, "recordapprovedate");
            return (Criteria) this;
        }

        public Criteria andRecordapprovedateGreaterThanOrEqualTo(Date value) {
            addCriterion("RecordApproveDate >=", value, "recordapprovedate");
            return (Criteria) this;
        }

        public Criteria andRecordapprovedateLessThan(Date value) {
            addCriterion("RecordApproveDate <", value, "recordapprovedate");
            return (Criteria) this;
        }

        public Criteria andRecordapprovedateLessThanOrEqualTo(Date value) {
            addCriterion("RecordApproveDate <=", value, "recordapprovedate");
            return (Criteria) this;
        }

        public Criteria andRecordapprovedateIn(List<Date> values) {
            addCriterion("RecordApproveDate in", values, "recordapprovedate");
            return (Criteria) this;
        }

        public Criteria andRecordapprovedateNotIn(List<Date> values) {
            addCriterion("RecordApproveDate not in", values, "recordapprovedate");
            return (Criteria) this;
        }

        public Criteria andRecordapprovedateBetween(Date value1, Date value2) {
            addCriterion("RecordApproveDate between", value1, value2, "recordapprovedate");
            return (Criteria) this;
        }

        public Criteria andRecordapprovedateNotBetween(Date value1, Date value2) {
            addCriterion("RecordApproveDate not between", value1, value2, "recordapprovedate");
            return (Criteria) this;
        }

        public Criteria andRecordissuingauthorityIsNull() {
            addCriterion("RecordIssuingAuthority is null");
            return (Criteria) this;
        }

        public Criteria andRecordissuingauthorityIsNotNull() {
            addCriterion("RecordIssuingAuthority is not null");
            return (Criteria) this;
        }

        public Criteria andRecordissuingauthorityEqualTo(String value) {
            addCriterion("RecordIssuingAuthority =", value, "recordissuingauthority");
            return (Criteria) this;
        }

        public Criteria andRecordissuingauthorityNotEqualTo(String value) {
            addCriterion("RecordIssuingAuthority <>", value, "recordissuingauthority");
            return (Criteria) this;
        }

        public Criteria andRecordissuingauthorityGreaterThan(String value) {
            addCriterion("RecordIssuingAuthority >", value, "recordissuingauthority");
            return (Criteria) this;
        }

        public Criteria andRecordissuingauthorityGreaterThanOrEqualTo(String value) {
            addCriterion("RecordIssuingAuthority >=", value, "recordissuingauthority");
            return (Criteria) this;
        }

        public Criteria andRecordissuingauthorityLessThan(String value) {
            addCriterion("RecordIssuingAuthority <", value, "recordissuingauthority");
            return (Criteria) this;
        }

        public Criteria andRecordissuingauthorityLessThanOrEqualTo(String value) {
            addCriterion("RecordIssuingAuthority <=", value, "recordissuingauthority");
            return (Criteria) this;
        }

        public Criteria andRecordissuingauthorityLike(String value) {
            addCriterion("RecordIssuingAuthority like", value, "recordissuingauthority");
            return (Criteria) this;
        }

        public Criteria andRecordissuingauthorityNotLike(String value) {
            addCriterion("RecordIssuingAuthority not like", value, "recordissuingauthority");
            return (Criteria) this;
        }

        public Criteria andRecordissuingauthorityIn(List<String> values) {
            addCriterion("RecordIssuingAuthority in", values, "recordissuingauthority");
            return (Criteria) this;
        }

        public Criteria andRecordissuingauthorityNotIn(List<String> values) {
            addCriterion("RecordIssuingAuthority not in", values, "recordissuingauthority");
            return (Criteria) this;
        }

        public Criteria andRecordissuingauthorityBetween(String value1, String value2) {
            addCriterion("RecordIssuingAuthority between", value1, value2, "recordissuingauthority");
            return (Criteria) this;
        }

        public Criteria andRecordissuingauthorityNotBetween(String value1, String value2) {
            addCriterion("RecordIssuingAuthority not between", value1, value2, "recordissuingauthority");
            return (Criteria) this;
        }

        public Criteria andRecordpictureIsNull() {
            addCriterion("RecordPicture is null");
            return (Criteria) this;
        }

        public Criteria andRecordpictureIsNotNull() {
            addCriterion("RecordPicture is not null");
            return (Criteria) this;
        }

        public Criteria andRecordpictureEqualTo(String value) {
            addCriterion("RecordPicture =", value, "recordpicture");
            return (Criteria) this;
        }

        public Criteria andRecordpictureNotEqualTo(String value) {
            addCriterion("RecordPicture <>", value, "recordpicture");
            return (Criteria) this;
        }

        public Criteria andRecordpictureGreaterThan(String value) {
            addCriterion("RecordPicture >", value, "recordpicture");
            return (Criteria) this;
        }

        public Criteria andRecordpictureGreaterThanOrEqualTo(String value) {
            addCriterion("RecordPicture >=", value, "recordpicture");
            return (Criteria) this;
        }

        public Criteria andRecordpictureLessThan(String value) {
            addCriterion("RecordPicture <", value, "recordpicture");
            return (Criteria) this;
        }

        public Criteria andRecordpictureLessThanOrEqualTo(String value) {
            addCriterion("RecordPicture <=", value, "recordpicture");
            return (Criteria) this;
        }

        public Criteria andRecordpictureLike(String value) {
            addCriterion("RecordPicture like", value, "recordpicture");
            return (Criteria) this;
        }

        public Criteria andRecordpictureNotLike(String value) {
            addCriterion("RecordPicture not like", value, "recordpicture");
            return (Criteria) this;
        }

        public Criteria andRecordpictureIn(List<String> values) {
            addCriterion("RecordPicture in", values, "recordpicture");
            return (Criteria) this;
        }

        public Criteria andRecordpictureNotIn(List<String> values) {
            addCriterion("RecordPicture not in", values, "recordpicture");
            return (Criteria) this;
        }

        public Criteria andRecordpictureBetween(String value1, String value2) {
            addCriterion("RecordPicture between", value1, value2, "recordpicture");
            return (Criteria) this;
        }

        public Criteria andRecordpictureNotBetween(String value1, String value2) {
            addCriterion("RecordPicture not between", value1, value2, "recordpicture");
            return (Criteria) this;
        }

        public Criteria andCertificateapprovedateIsNull() {
            addCriterion("CertificateApproveDate is null");
            return (Criteria) this;
        }

        public Criteria andCertificateapprovedateIsNotNull() {
            addCriterion("CertificateApproveDate is not null");
            return (Criteria) this;
        }

        public Criteria andCertificateapprovedateEqualTo(Date value) {
            addCriterion("CertificateApproveDate =", value, "certificateapprovedate");
            return (Criteria) this;
        }

        public Criteria andCertificateapprovedateNotEqualTo(Date value) {
            addCriterion("CertificateApproveDate <>", value, "certificateapprovedate");
            return (Criteria) this;
        }

        public Criteria andCertificateapprovedateGreaterThan(Date value) {
            addCriterion("CertificateApproveDate >", value, "certificateapprovedate");
            return (Criteria) this;
        }

        public Criteria andCertificateapprovedateGreaterThanOrEqualTo(Date value) {
            addCriterion("CertificateApproveDate >=", value, "certificateapprovedate");
            return (Criteria) this;
        }

        public Criteria andCertificateapprovedateLessThan(Date value) {
            addCriterion("CertificateApproveDate <", value, "certificateapprovedate");
            return (Criteria) this;
        }

        public Criteria andCertificateapprovedateLessThanOrEqualTo(Date value) {
            addCriterion("CertificateApproveDate <=", value, "certificateapprovedate");
            return (Criteria) this;
        }

        public Criteria andCertificateapprovedateIn(List<Date> values) {
            addCriterion("CertificateApproveDate in", values, "certificateapprovedate");
            return (Criteria) this;
        }

        public Criteria andCertificateapprovedateNotIn(List<Date> values) {
            addCriterion("CertificateApproveDate not in", values, "certificateapprovedate");
            return (Criteria) this;
        }

        public Criteria andCertificateapprovedateBetween(Date value1, Date value2) {
            addCriterion("CertificateApproveDate between", value1, value2, "certificateapprovedate");
            return (Criteria) this;
        }

        public Criteria andCertificateapprovedateNotBetween(Date value1, Date value2) {
            addCriterion("CertificateApproveDate not between", value1, value2, "certificateapprovedate");
            return (Criteria) this;
        }

        public Criteria andCertificateissuingauthorityIsNull() {
            addCriterion("CertificateIssuingAuthority is null");
            return (Criteria) this;
        }

        public Criteria andCertificateissuingauthorityIsNotNull() {
            addCriterion("CertificateIssuingAuthority is not null");
            return (Criteria) this;
        }

        public Criteria andCertificateissuingauthorityEqualTo(String value) {
            addCriterion("CertificateIssuingAuthority =", value, "certificateissuingauthority");
            return (Criteria) this;
        }

        public Criteria andCertificateissuingauthorityNotEqualTo(String value) {
            addCriterion("CertificateIssuingAuthority <>", value, "certificateissuingauthority");
            return (Criteria) this;
        }

        public Criteria andCertificateissuingauthorityGreaterThan(String value) {
            addCriterion("CertificateIssuingAuthority >", value, "certificateissuingauthority");
            return (Criteria) this;
        }

        public Criteria andCertificateissuingauthorityGreaterThanOrEqualTo(String value) {
            addCriterion("CertificateIssuingAuthority >=", value, "certificateissuingauthority");
            return (Criteria) this;
        }

        public Criteria andCertificateissuingauthorityLessThan(String value) {
            addCriterion("CertificateIssuingAuthority <", value, "certificateissuingauthority");
            return (Criteria) this;
        }

        public Criteria andCertificateissuingauthorityLessThanOrEqualTo(String value) {
            addCriterion("CertificateIssuingAuthority <=", value, "certificateissuingauthority");
            return (Criteria) this;
        }

        public Criteria andCertificateissuingauthorityLike(String value) {
            addCriterion("CertificateIssuingAuthority like", value, "certificateissuingauthority");
            return (Criteria) this;
        }

        public Criteria andCertificateissuingauthorityNotLike(String value) {
            addCriterion("CertificateIssuingAuthority not like", value, "certificateissuingauthority");
            return (Criteria) this;
        }

        public Criteria andCertificateissuingauthorityIn(List<String> values) {
            addCriterion("CertificateIssuingAuthority in", values, "certificateissuingauthority");
            return (Criteria) this;
        }

        public Criteria andCertificateissuingauthorityNotIn(List<String> values) {
            addCriterion("CertificateIssuingAuthority not in", values, "certificateissuingauthority");
            return (Criteria) this;
        }

        public Criteria andCertificateissuingauthorityBetween(String value1, String value2) {
            addCriterion("CertificateIssuingAuthority between", value1, value2, "certificateissuingauthority");
            return (Criteria) this;
        }

        public Criteria andCertificateissuingauthorityNotBetween(String value1, String value2) {
            addCriterion("CertificateIssuingAuthority not between", value1, value2, "certificateissuingauthority");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressIsNull() {
            addCriterion("CompanyAddress is null");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressIsNotNull() {
            addCriterion("CompanyAddress is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressEqualTo(String value) {
            addCriterion("CompanyAddress =", value, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressNotEqualTo(String value) {
            addCriterion("CompanyAddress <>", value, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressGreaterThan(String value) {
            addCriterion("CompanyAddress >", value, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressGreaterThanOrEqualTo(String value) {
            addCriterion("CompanyAddress >=", value, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressLessThan(String value) {
            addCriterion("CompanyAddress <", value, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressLessThanOrEqualTo(String value) {
            addCriterion("CompanyAddress <=", value, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressLike(String value) {
            addCriterion("CompanyAddress like", value, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressNotLike(String value) {
            addCriterion("CompanyAddress not like", value, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressIn(List<String> values) {
            addCriterion("CompanyAddress in", values, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressNotIn(List<String> values) {
            addCriterion("CompanyAddress not in", values, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressBetween(String value1, String value2) {
            addCriterion("CompanyAddress between", value1, value2, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressNotBetween(String value1, String value2) {
            addCriterion("CompanyAddress not between", value1, value2, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andToaddressIsNull() {
            addCriterion("ToAddress is null");
            return (Criteria) this;
        }

        public Criteria andToaddressIsNotNull() {
            addCriterion("ToAddress is not null");
            return (Criteria) this;
        }

        public Criteria andToaddressEqualTo(String value) {
            addCriterion("ToAddress =", value, "toaddress");
            return (Criteria) this;
        }

        public Criteria andToaddressNotEqualTo(String value) {
            addCriterion("ToAddress <>", value, "toaddress");
            return (Criteria) this;
        }

        public Criteria andToaddressGreaterThan(String value) {
            addCriterion("ToAddress >", value, "toaddress");
            return (Criteria) this;
        }

        public Criteria andToaddressGreaterThanOrEqualTo(String value) {
            addCriterion("ToAddress >=", value, "toaddress");
            return (Criteria) this;
        }

        public Criteria andToaddressLessThan(String value) {
            addCriterion("ToAddress <", value, "toaddress");
            return (Criteria) this;
        }

        public Criteria andToaddressLessThanOrEqualTo(String value) {
            addCriterion("ToAddress <=", value, "toaddress");
            return (Criteria) this;
        }

        public Criteria andToaddressLike(String value) {
            addCriterion("ToAddress like", value, "toaddress");
            return (Criteria) this;
        }

        public Criteria andToaddressNotLike(String value) {
            addCriterion("ToAddress not like", value, "toaddress");
            return (Criteria) this;
        }

        public Criteria andToaddressIn(List<String> values) {
            addCriterion("ToAddress in", values, "toaddress");
            return (Criteria) this;
        }

        public Criteria andToaddressNotIn(List<String> values) {
            addCriterion("ToAddress not in", values, "toaddress");
            return (Criteria) this;
        }

        public Criteria andToaddressBetween(String value1, String value2) {
            addCriterion("ToAddress between", value1, value2, "toaddress");
            return (Criteria) this;
        }

        public Criteria andToaddressNotBetween(String value1, String value2) {
            addCriterion("ToAddress not between", value1, value2, "toaddress");
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
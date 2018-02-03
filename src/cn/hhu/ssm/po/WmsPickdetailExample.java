package cn.hhu.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WmsPickdetailExample {
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

	public WmsPickdetailExample() {
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

        public Criteria andPickdetailIdIsNull() {
            addCriterion("PickDetail_ID is null");
            return (Criteria) this;
        }

        public Criteria andPickdetailIdIsNotNull() {
            addCriterion("PickDetail_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPickdetailIdEqualTo(Integer value) {
            addCriterion("PickDetail_ID =", value, "pickdetailId");
            return (Criteria) this;
        }

        public Criteria andPickdetailIdNotEqualTo(Integer value) {
            addCriterion("PickDetail_ID <>", value, "pickdetailId");
            return (Criteria) this;
        }

        public Criteria andPickdetailIdGreaterThan(Integer value) {
            addCriterion("PickDetail_ID >", value, "pickdetailId");
            return (Criteria) this;
        }

        public Criteria andPickdetailIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PickDetail_ID >=", value, "pickdetailId");
            return (Criteria) this;
        }

        public Criteria andPickdetailIdLessThan(Integer value) {
            addCriterion("PickDetail_ID <", value, "pickdetailId");
            return (Criteria) this;
        }

        public Criteria andPickdetailIdLessThanOrEqualTo(Integer value) {
            addCriterion("PickDetail_ID <=", value, "pickdetailId");
            return (Criteria) this;
        }

        public Criteria andPickdetailIdIn(List<Integer> values) {
            addCriterion("PickDetail_ID in", values, "pickdetailId");
            return (Criteria) this;
        }

        public Criteria andPickdetailIdNotIn(List<Integer> values) {
            addCriterion("PickDetail_ID not in", values, "pickdetailId");
            return (Criteria) this;
        }

        public Criteria andPickdetailIdBetween(Integer value1, Integer value2) {
            addCriterion("PickDetail_ID between", value1, value2, "pickdetailId");
            return (Criteria) this;
        }

        public Criteria andPickdetailIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PickDetail_ID not between", value1, value2, "pickdetailId");
            return (Criteria) this;
        }

        public Criteria andPickdetailNumberIsNull() {
            addCriterion("PickDetail_Number is null");
            return (Criteria) this;
        }

        public Criteria andPickdetailNumberIsNotNull() {
            addCriterion("PickDetail_Number is not null");
            return (Criteria) this;
        }

        public Criteria andPickdetailNumberEqualTo(String value) {
            addCriterion("PickDetail_Number =", value, "pickdetailNumber");
            return (Criteria) this;
        }

        public Criteria andPickdetailNumberNotEqualTo(String value) {
            addCriterion("PickDetail_Number <>", value, "pickdetailNumber");
            return (Criteria) this;
        }

        public Criteria andPickdetailNumberGreaterThan(String value) {
            addCriterion("PickDetail_Number >", value, "pickdetailNumber");
            return (Criteria) this;
        }

        public Criteria andPickdetailNumberGreaterThanOrEqualTo(String value) {
            addCriterion("PickDetail_Number >=", value, "pickdetailNumber");
            return (Criteria) this;
        }

        public Criteria andPickdetailNumberLessThan(String value) {
            addCriterion("PickDetail_Number <", value, "pickdetailNumber");
            return (Criteria) this;
        }

        public Criteria andPickdetailNumberLessThanOrEqualTo(String value) {
            addCriterion("PickDetail_Number <=", value, "pickdetailNumber");
            return (Criteria) this;
        }

        public Criteria andPickdetailNumberLike(String value) {
            addCriterion("PickDetail_Number like", value, "pickdetailNumber");
            return (Criteria) this;
        }

        public Criteria andPickdetailNumberNotLike(String value) {
            addCriterion("PickDetail_Number not like", value, "pickdetailNumber");
            return (Criteria) this;
        }

        public Criteria andPickdetailNumberIn(List<String> values) {
            addCriterion("PickDetail_Number in", values, "pickdetailNumber");
            return (Criteria) this;
        }

        public Criteria andPickdetailNumberNotIn(List<String> values) {
            addCriterion("PickDetail_Number not in", values, "pickdetailNumber");
            return (Criteria) this;
        }

        public Criteria andPickdetailNumberBetween(String value1, String value2) {
            addCriterion("PickDetail_Number between", value1, value2, "pickdetailNumber");
            return (Criteria) this;
        }

        public Criteria andPickdetailNumberNotBetween(String value1, String value2) {
            addCriterion("PickDetail_Number not between", value1, value2, "pickdetailNumber");
            return (Criteria) this;
        }

        public Criteria andDetailIdIsNull() {
            addCriterion("Detail_ID is null");
            return (Criteria) this;
        }

        public Criteria andDetailIdIsNotNull() {
            addCriterion("Detail_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDetailIdEqualTo(Integer value) {
            addCriterion("Detail_ID =", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdNotEqualTo(Integer value) {
            addCriterion("Detail_ID <>", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdGreaterThan(Integer value) {
            addCriterion("Detail_ID >", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Detail_ID >=", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdLessThan(Integer value) {
            addCriterion("Detail_ID <", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdLessThanOrEqualTo(Integer value) {
            addCriterion("Detail_ID <=", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdIn(List<Integer> values) {
            addCriterion("Detail_ID in", values, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdNotIn(List<Integer> values) {
            addCriterion("Detail_ID not in", values, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdBetween(Integer value1, Integer value2) {
            addCriterion("Detail_ID between", value1, value2, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Detail_ID not between", value1, value2, "detailId");
            return (Criteria) this;
        }

        public Criteria andStoragelocationcodeIsNull() {
            addCriterion("StorageLocationCode is null");
            return (Criteria) this;
        }

        public Criteria andStoragelocationcodeIsNotNull() {
            addCriterion("StorageLocationCode is not null");
            return (Criteria) this;
        }

        public Criteria andStoragelocationcodeEqualTo(String value) {
            addCriterion("StorageLocationCode =", value, "storagelocationcode");
            return (Criteria) this;
        }

        public Criteria andStoragelocationcodeNotEqualTo(String value) {
            addCriterion("StorageLocationCode <>", value, "storagelocationcode");
            return (Criteria) this;
        }

        public Criteria andStoragelocationcodeGreaterThan(String value) {
            addCriterion("StorageLocationCode >", value, "storagelocationcode");
            return (Criteria) this;
        }

        public Criteria andStoragelocationcodeGreaterThanOrEqualTo(String value) {
            addCriterion("StorageLocationCode >=", value, "storagelocationcode");
            return (Criteria) this;
        }

        public Criteria andStoragelocationcodeLessThan(String value) {
            addCriterion("StorageLocationCode <", value, "storagelocationcode");
            return (Criteria) this;
        }

        public Criteria andStoragelocationcodeLessThanOrEqualTo(String value) {
            addCriterion("StorageLocationCode <=", value, "storagelocationcode");
            return (Criteria) this;
        }

        public Criteria andStoragelocationcodeLike(String value) {
            addCriterion("StorageLocationCode like", value, "storagelocationcode");
            return (Criteria) this;
        }

        public Criteria andStoragelocationcodeNotLike(String value) {
            addCriterion("StorageLocationCode not like", value, "storagelocationcode");
            return (Criteria) this;
        }

        public Criteria andStoragelocationcodeIn(List<String> values) {
            addCriterion("StorageLocationCode in", values, "storagelocationcode");
            return (Criteria) this;
        }

        public Criteria andStoragelocationcodeNotIn(List<String> values) {
            addCriterion("StorageLocationCode not in", values, "storagelocationcode");
            return (Criteria) this;
        }

        public Criteria andStoragelocationcodeBetween(String value1, String value2) {
            addCriterion("StorageLocationCode between", value1, value2, "storagelocationcode");
            return (Criteria) this;
        }

        public Criteria andStoragelocationcodeNotBetween(String value1, String value2) {
            addCriterion("StorageLocationCode not between", value1, value2, "storagelocationcode");
            return (Criteria) this;
        }

        public Criteria andStoragelocationIdIsNull() {
            addCriterion("StorageLocation_ID is null");
            return (Criteria) this;
        }

        public Criteria andStoragelocationIdIsNotNull() {
            addCriterion("StorageLocation_ID is not null");
            return (Criteria) this;
        }

        public Criteria andStoragelocationIdEqualTo(Integer value) {
            addCriterion("StorageLocation_ID =", value, "storagelocationId");
            return (Criteria) this;
        }

        public Criteria andStoragelocationIdNotEqualTo(Integer value) {
            addCriterion("StorageLocation_ID <>", value, "storagelocationId");
            return (Criteria) this;
        }

        public Criteria andStoragelocationIdGreaterThan(Integer value) {
            addCriterion("StorageLocation_ID >", value, "storagelocationId");
            return (Criteria) this;
        }

        public Criteria andStoragelocationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("StorageLocation_ID >=", value, "storagelocationId");
            return (Criteria) this;
        }

        public Criteria andStoragelocationIdLessThan(Integer value) {
            addCriterion("StorageLocation_ID <", value, "storagelocationId");
            return (Criteria) this;
        }

        public Criteria andStoragelocationIdLessThanOrEqualTo(Integer value) {
            addCriterion("StorageLocation_ID <=", value, "storagelocationId");
            return (Criteria) this;
        }

        public Criteria andStoragelocationIdIn(List<Integer> values) {
            addCriterion("StorageLocation_ID in", values, "storagelocationId");
            return (Criteria) this;
        }

        public Criteria andStoragelocationIdNotIn(List<Integer> values) {
            addCriterion("StorageLocation_ID not in", values, "storagelocationId");
            return (Criteria) this;
        }

        public Criteria andStoragelocationIdBetween(Integer value1, Integer value2) {
            addCriterion("StorageLocation_ID between", value1, value2, "storagelocationId");
            return (Criteria) this;
        }

        public Criteria andStoragelocationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("StorageLocation_ID not between", value1, value2, "storagelocationId");
            return (Criteria) this;
        }

        public Criteria andRemainpickquantityIsNull() {
            addCriterion("RemainPickQuantity is null");
            return (Criteria) this;
        }

        public Criteria andRemainpickquantityIsNotNull() {
            addCriterion("RemainPickQuantity is not null");
            return (Criteria) this;
        }

        public Criteria andRemainpickquantityEqualTo(Float value) {
            addCriterion("RemainPickQuantity =", value, "remainpickquantity");
            return (Criteria) this;
        }

        public Criteria andRemainpickquantityNotEqualTo(Float value) {
            addCriterion("RemainPickQuantity <>", value, "remainpickquantity");
            return (Criteria) this;
        }

        public Criteria andRemainpickquantityGreaterThan(Float value) {
            addCriterion("RemainPickQuantity >", value, "remainpickquantity");
            return (Criteria) this;
        }

        public Criteria andRemainpickquantityGreaterThanOrEqualTo(Float value) {
            addCriterion("RemainPickQuantity >=", value, "remainpickquantity");
            return (Criteria) this;
        }

        public Criteria andRemainpickquantityLessThan(Float value) {
            addCriterion("RemainPickQuantity <", value, "remainpickquantity");
            return (Criteria) this;
        }

        public Criteria andRemainpickquantityLessThanOrEqualTo(Float value) {
            addCriterion("RemainPickQuantity <=", value, "remainpickquantity");
            return (Criteria) this;
        }

        public Criteria andRemainpickquantityIn(List<Float> values) {
            addCriterion("RemainPickQuantity in", values, "remainpickquantity");
            return (Criteria) this;
        }

        public Criteria andRemainpickquantityNotIn(List<Float> values) {
            addCriterion("RemainPickQuantity not in", values, "remainpickquantity");
            return (Criteria) this;
        }

        public Criteria andRemainpickquantityBetween(Float value1, Float value2) {
            addCriterion("RemainPickQuantity between", value1, value2, "remainpickquantity");
            return (Criteria) this;
        }

        public Criteria andRemainpickquantityNotBetween(Float value1, Float value2) {
            addCriterion("RemainPickQuantity not between", value1, value2, "remainpickquantity");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("Weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("Weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(Float value) {
            addCriterion("Weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(Float value) {
            addCriterion("Weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(Float value) {
            addCriterion("Weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(Float value) {
            addCriterion("Weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(Float value) {
            addCriterion("Weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(Float value) {
            addCriterion("Weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<Float> values) {
            addCriterion("Weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<Float> values) {
            addCriterion("Weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(Float value1, Float value2) {
            addCriterion("Weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(Float value1, Float value2) {
            addCriterion("Weight not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andNetweightIsNull() {
            addCriterion("NetWeight is null");
            return (Criteria) this;
        }

        public Criteria andNetweightIsNotNull() {
            addCriterion("NetWeight is not null");
            return (Criteria) this;
        }

        public Criteria andNetweightEqualTo(Float value) {
            addCriterion("NetWeight =", value, "netweight");
            return (Criteria) this;
        }

        public Criteria andNetweightNotEqualTo(Float value) {
            addCriterion("NetWeight <>", value, "netweight");
            return (Criteria) this;
        }

        public Criteria andNetweightGreaterThan(Float value) {
            addCriterion("NetWeight >", value, "netweight");
            return (Criteria) this;
        }

        public Criteria andNetweightGreaterThanOrEqualTo(Float value) {
            addCriterion("NetWeight >=", value, "netweight");
            return (Criteria) this;
        }

        public Criteria andNetweightLessThan(Float value) {
            addCriterion("NetWeight <", value, "netweight");
            return (Criteria) this;
        }

        public Criteria andNetweightLessThanOrEqualTo(Float value) {
            addCriterion("NetWeight <=", value, "netweight");
            return (Criteria) this;
        }

        public Criteria andNetweightIn(List<Float> values) {
            addCriterion("NetWeight in", values, "netweight");
            return (Criteria) this;
        }

        public Criteria andNetweightNotIn(List<Float> values) {
            addCriterion("NetWeight not in", values, "netweight");
            return (Criteria) this;
        }

        public Criteria andNetweightBetween(Float value1, Float value2) {
            addCriterion("NetWeight between", value1, value2, "netweight");
            return (Criteria) this;
        }

        public Criteria andNetweightNotBetween(Float value1, Float value2) {
            addCriterion("NetWeight not between", value1, value2, "netweight");
            return (Criteria) this;
        }

        public Criteria andVolumeIsNull() {
            addCriterion("Volume is null");
            return (Criteria) this;
        }

        public Criteria andVolumeIsNotNull() {
            addCriterion("Volume is not null");
            return (Criteria) this;
        }

        public Criteria andVolumeEqualTo(Float value) {
            addCriterion("Volume =", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotEqualTo(Float value) {
            addCriterion("Volume <>", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeGreaterThan(Float value) {
            addCriterion("Volume >", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeGreaterThanOrEqualTo(Float value) {
            addCriterion("Volume >=", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeLessThan(Float value) {
            addCriterion("Volume <", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeLessThanOrEqualTo(Float value) {
            addCriterion("Volume <=", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeIn(List<Float> values) {
            addCriterion("Volume in", values, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotIn(List<Float> values) {
            addCriterion("Volume not in", values, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeBetween(Float value1, Float value2) {
            addCriterion("Volume between", value1, value2, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotBetween(Float value1, Float value2) {
            addCriterion("Volume not between", value1, value2, "volume");
            return (Criteria) this;
        }

        public Criteria andPayabletonIsNull() {
            addCriterion("PayableTon is null");
            return (Criteria) this;
        }

        public Criteria andPayabletonIsNotNull() {
            addCriterion("PayableTon is not null");
            return (Criteria) this;
        }

        public Criteria andPayabletonEqualTo(Float value) {
            addCriterion("PayableTon =", value, "payableton");
            return (Criteria) this;
        }

        public Criteria andPayabletonNotEqualTo(Float value) {
            addCriterion("PayableTon <>", value, "payableton");
            return (Criteria) this;
        }

        public Criteria andPayabletonGreaterThan(Float value) {
            addCriterion("PayableTon >", value, "payableton");
            return (Criteria) this;
        }

        public Criteria andPayabletonGreaterThanOrEqualTo(Float value) {
            addCriterion("PayableTon >=", value, "payableton");
            return (Criteria) this;
        }

        public Criteria andPayabletonLessThan(Float value) {
            addCriterion("PayableTon <", value, "payableton");
            return (Criteria) this;
        }

        public Criteria andPayabletonLessThanOrEqualTo(Float value) {
            addCriterion("PayableTon <=", value, "payableton");
            return (Criteria) this;
        }

        public Criteria andPayabletonIn(List<Float> values) {
            addCriterion("PayableTon in", values, "payableton");
            return (Criteria) this;
        }

        public Criteria andPayabletonNotIn(List<Float> values) {
            addCriterion("PayableTon not in", values, "payableton");
            return (Criteria) this;
        }

        public Criteria andPayabletonBetween(Float value1, Float value2) {
            addCriterion("PayableTon between", value1, value2, "payableton");
            return (Criteria) this;
        }

        public Criteria andPayabletonNotBetween(Float value1, Float value2) {
            addCriterion("PayableTon not between", value1, value2, "payableton");
            return (Criteria) this;
        }

        public Criteria andPickedquantityIsNull() {
            addCriterion("PickedQuantity is null");
            return (Criteria) this;
        }

        public Criteria andPickedquantityIsNotNull() {
            addCriterion("PickedQuantity is not null");
            return (Criteria) this;
        }

        public Criteria andPickedquantityEqualTo(Float value) {
            addCriterion("PickedQuantity =", value, "pickedquantity");
            return (Criteria) this;
        }

        public Criteria andPickedquantityNotEqualTo(Float value) {
            addCriterion("PickedQuantity <>", value, "pickedquantity");
            return (Criteria) this;
        }

        public Criteria andPickedquantityGreaterThan(Float value) {
            addCriterion("PickedQuantity >", value, "pickedquantity");
            return (Criteria) this;
        }

        public Criteria andPickedquantityGreaterThanOrEqualTo(Float value) {
            addCriterion("PickedQuantity >=", value, "pickedquantity");
            return (Criteria) this;
        }

        public Criteria andPickedquantityLessThan(Float value) {
            addCriterion("PickedQuantity <", value, "pickedquantity");
            return (Criteria) this;
        }

        public Criteria andPickedquantityLessThanOrEqualTo(Float value) {
            addCriterion("PickedQuantity <=", value, "pickedquantity");
            return (Criteria) this;
        }

        public Criteria andPickedquantityIn(List<Float> values) {
            addCriterion("PickedQuantity in", values, "pickedquantity");
            return (Criteria) this;
        }

        public Criteria andPickedquantityNotIn(List<Float> values) {
            addCriterion("PickedQuantity not in", values, "pickedquantity");
            return (Criteria) this;
        }

        public Criteria andPickedquantityBetween(Float value1, Float value2) {
            addCriterion("PickedQuantity between", value1, value2, "pickedquantity");
            return (Criteria) this;
        }

        public Criteria andPickedquantityNotBetween(Float value1, Float value2) {
            addCriterion("PickedQuantity not between", value1, value2, "pickedquantity");
            return (Criteria) this;
        }

        public Criteria andPickinstructionIsNull() {
            addCriterion("PickInstruction is null");
            return (Criteria) this;
        }

        public Criteria andPickinstructionIsNotNull() {
            addCriterion("PickInstruction is not null");
            return (Criteria) this;
        }

        public Criteria andPickinstructionEqualTo(String value) {
            addCriterion("PickInstruction =", value, "pickinstruction");
            return (Criteria) this;
        }

        public Criteria andPickinstructionNotEqualTo(String value) {
            addCriterion("PickInstruction <>", value, "pickinstruction");
            return (Criteria) this;
        }

        public Criteria andPickinstructionGreaterThan(String value) {
            addCriterion("PickInstruction >", value, "pickinstruction");
            return (Criteria) this;
        }

        public Criteria andPickinstructionGreaterThanOrEqualTo(String value) {
            addCriterion("PickInstruction >=", value, "pickinstruction");
            return (Criteria) this;
        }

        public Criteria andPickinstructionLessThan(String value) {
            addCriterion("PickInstruction <", value, "pickinstruction");
            return (Criteria) this;
        }

        public Criteria andPickinstructionLessThanOrEqualTo(String value) {
            addCriterion("PickInstruction <=", value, "pickinstruction");
            return (Criteria) this;
        }

        public Criteria andPickinstructionLike(String value) {
            addCriterion("PickInstruction like", value, "pickinstruction");
            return (Criteria) this;
        }

        public Criteria andPickinstructionNotLike(String value) {
            addCriterion("PickInstruction not like", value, "pickinstruction");
            return (Criteria) this;
        }

        public Criteria andPickinstructionIn(List<String> values) {
            addCriterion("PickInstruction in", values, "pickinstruction");
            return (Criteria) this;
        }

        public Criteria andPickinstructionNotIn(List<String> values) {
            addCriterion("PickInstruction not in", values, "pickinstruction");
            return (Criteria) this;
        }

        public Criteria andPickinstructionBetween(String value1, String value2) {
            addCriterion("PickInstruction between", value1, value2, "pickinstruction");
            return (Criteria) this;
        }

        public Criteria andPickinstructionNotBetween(String value1, String value2) {
            addCriterion("PickInstruction not between", value1, value2, "pickinstruction");
            return (Criteria) this;
        }

        public Criteria andPickmanIsNull() {
            addCriterion("PickMan is null");
            return (Criteria) this;
        }

        public Criteria andPickmanIsNotNull() {
            addCriterion("PickMan is not null");
            return (Criteria) this;
        }

        public Criteria andPickmanEqualTo(Integer value) {
            addCriterion("PickMan =", value, "pickman");
            return (Criteria) this;
        }

        public Criteria andPickmanNotEqualTo(Integer value) {
            addCriterion("PickMan <>", value, "pickman");
            return (Criteria) this;
        }

        public Criteria andPickmanGreaterThan(Integer value) {
            addCriterion("PickMan >", value, "pickman");
            return (Criteria) this;
        }

        public Criteria andPickmanGreaterThanOrEqualTo(Integer value) {
            addCriterion("PickMan >=", value, "pickman");
            return (Criteria) this;
        }

        public Criteria andPickmanLessThan(Integer value) {
            addCriterion("PickMan <", value, "pickman");
            return (Criteria) this;
        }

        public Criteria andPickmanLessThanOrEqualTo(Integer value) {
            addCriterion("PickMan <=", value, "pickman");
            return (Criteria) this;
        }

        public Criteria andPickmanIn(List<Integer> values) {
            addCriterion("PickMan in", values, "pickman");
            return (Criteria) this;
        }

        public Criteria andPickmanNotIn(List<Integer> values) {
            addCriterion("PickMan not in", values, "pickman");
            return (Criteria) this;
        }

        public Criteria andPickmanBetween(Integer value1, Integer value2) {
            addCriterion("PickMan between", value1, value2, "pickman");
            return (Criteria) this;
        }

        public Criteria andPickmanNotBetween(Integer value1, Integer value2) {
            addCriterion("PickMan not between", value1, value2, "pickman");
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

        public Criteria andQualityIsNull() {
            addCriterion("Quality is null");
            return (Criteria) this;
        }

        public Criteria andQualityIsNotNull() {
            addCriterion("Quality is not null");
            return (Criteria) this;
        }

        public Criteria andQualityEqualTo(Integer value) {
            addCriterion("Quality =", value, "quality");
            return (Criteria) this;
        }

        public Criteria andQualityNotEqualTo(Integer value) {
            addCriterion("Quality <>", value, "quality");
            return (Criteria) this;
        }

        public Criteria andQualityGreaterThan(Integer value) {
            addCriterion("Quality >", value, "quality");
            return (Criteria) this;
        }

        public Criteria andQualityGreaterThanOrEqualTo(Integer value) {
            addCriterion("Quality >=", value, "quality");
            return (Criteria) this;
        }

        public Criteria andQualityLessThan(Integer value) {
            addCriterion("Quality <", value, "quality");
            return (Criteria) this;
        }

        public Criteria andQualityLessThanOrEqualTo(Integer value) {
            addCriterion("Quality <=", value, "quality");
            return (Criteria) this;
        }

        public Criteria andQualityIn(List<Integer> values) {
            addCriterion("Quality in", values, "quality");
            return (Criteria) this;
        }

        public Criteria andQualityNotIn(List<Integer> values) {
            addCriterion("Quality not in", values, "quality");
            return (Criteria) this;
        }

        public Criteria andQualityBetween(Integer value1, Integer value2) {
            addCriterion("Quality between", value1, value2, "quality");
            return (Criteria) this;
        }

        public Criteria andQualityNotBetween(Integer value1, Integer value2) {
            addCriterion("Quality not between", value1, value2, "quality");
            return (Criteria) this;
        }

        public Criteria andPicktimeIsNull() {
            addCriterion("PickTime is null");
            return (Criteria) this;
        }

        public Criteria andPicktimeIsNotNull() {
            addCriterion("PickTime is not null");
            return (Criteria) this;
        }

        public Criteria andPicktimeEqualTo(Date value) {
            addCriterion("PickTime =", value, "picktime");
            return (Criteria) this;
        }

        public Criteria andPicktimeNotEqualTo(Date value) {
            addCriterion("PickTime <>", value, "picktime");
            return (Criteria) this;
        }

        public Criteria andPicktimeGreaterThan(Date value) {
            addCriterion("PickTime >", value, "picktime");
            return (Criteria) this;
        }

        public Criteria andPicktimeGreaterThanOrEqualTo(Date value) {
            addCriterion("PickTime >=", value, "picktime");
            return (Criteria) this;
        }

        public Criteria andPicktimeLessThan(Date value) {
            addCriterion("PickTime <", value, "picktime");
            return (Criteria) this;
        }

        public Criteria andPicktimeLessThanOrEqualTo(Date value) {
            addCriterion("PickTime <=", value, "picktime");
            return (Criteria) this;
        }

        public Criteria andPicktimeIn(List<Date> values) {
            addCriterion("PickTime in", values, "picktime");
            return (Criteria) this;
        }

        public Criteria andPicktimeNotIn(List<Date> values) {
            addCriterion("PickTime not in", values, "picktime");
            return (Criteria) this;
        }

        public Criteria andPicktimeBetween(Date value1, Date value2) {
            addCriterion("PickTime between", value1, value2, "picktime");
            return (Criteria) this;
        }

        public Criteria andPicktimeNotBetween(Date value1, Date value2) {
            addCriterion("PickTime not between", value1, value2, "picktime");
            return (Criteria) this;
        }

        public Criteria andStockIdIsNull() {
            addCriterion("Stock_ID is null");
            return (Criteria) this;
        }

        public Criteria andStockIdIsNotNull() {
            addCriterion("Stock_ID is not null");
            return (Criteria) this;
        }

        public Criteria andStockIdEqualTo(Integer value) {
            addCriterion("Stock_ID =", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdNotEqualTo(Integer value) {
            addCriterion("Stock_ID <>", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdGreaterThan(Integer value) {
            addCriterion("Stock_ID >", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Stock_ID >=", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdLessThan(Integer value) {
            addCriterion("Stock_ID <", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdLessThanOrEqualTo(Integer value) {
            addCriterion("Stock_ID <=", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdIn(List<Integer> values) {
            addCriterion("Stock_ID in", values, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdNotIn(List<Integer> values) {
            addCriterion("Stock_ID not in", values, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdBetween(Integer value1, Integer value2) {
            addCriterion("Stock_ID between", value1, value2, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Stock_ID not between", value1, value2, "stockId");
            return (Criteria) this;
        }

        public Criteria andIsfinishedIsNull() {
            addCriterion("IsFinished is null");
            return (Criteria) this;
        }

        public Criteria andIsfinishedIsNotNull() {
            addCriterion("IsFinished is not null");
            return (Criteria) this;
        }

        public Criteria andIsfinishedEqualTo(Integer value) {
            addCriterion("IsFinished =", value, "isfinished");
            return (Criteria) this;
        }

        public Criteria andIsfinishedNotEqualTo(Integer value) {
            addCriterion("IsFinished <>", value, "isfinished");
            return (Criteria) this;
        }

        public Criteria andIsfinishedGreaterThan(Integer value) {
            addCriterion("IsFinished >", value, "isfinished");
            return (Criteria) this;
        }

        public Criteria andIsfinishedGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsFinished >=", value, "isfinished");
            return (Criteria) this;
        }

        public Criteria andIsfinishedLessThan(Integer value) {
            addCriterion("IsFinished <", value, "isfinished");
            return (Criteria) this;
        }

        public Criteria andIsfinishedLessThanOrEqualTo(Integer value) {
            addCriterion("IsFinished <=", value, "isfinished");
            return (Criteria) this;
        }

        public Criteria andIsfinishedIn(List<Integer> values) {
            addCriterion("IsFinished in", values, "isfinished");
            return (Criteria) this;
        }

        public Criteria andIsfinishedNotIn(List<Integer> values) {
            addCriterion("IsFinished not in", values, "isfinished");
            return (Criteria) this;
        }

        public Criteria andIsfinishedBetween(Integer value1, Integer value2) {
            addCriterion("IsFinished between", value1, value2, "isfinished");
            return (Criteria) this;
        }

        public Criteria andIsfinishedNotBetween(Integer value1, Integer value2) {
            addCriterion("IsFinished not between", value1, value2, "isfinished");
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
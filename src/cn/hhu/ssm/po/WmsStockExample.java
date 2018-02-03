package cn.hhu.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WmsStockExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WmsStockExample() {
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

        public Criteria andStocksIdIsNull() {
            addCriterion("Stocks_ID is null");
            return (Criteria) this;
        }

        public Criteria andStocksIdIsNotNull() {
            addCriterion("Stocks_ID is not null");
            return (Criteria) this;
        }

        public Criteria andStocksIdEqualTo(Integer value) {
            addCriterion("Stocks_ID =", value, "stocksId");
            return (Criteria) this;
        }

        public Criteria andStocksIdNotEqualTo(Integer value) {
            addCriterion("Stocks_ID <>", value, "stocksId");
            return (Criteria) this;
        }

        public Criteria andStocksIdGreaterThan(Integer value) {
            addCriterion("Stocks_ID >", value, "stocksId");
            return (Criteria) this;
        }

        public Criteria andStocksIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Stocks_ID >=", value, "stocksId");
            return (Criteria) this;
        }

        public Criteria andStocksIdLessThan(Integer value) {
            addCriterion("Stocks_ID <", value, "stocksId");
            return (Criteria) this;
        }

        public Criteria andStocksIdLessThanOrEqualTo(Integer value) {
            addCriterion("Stocks_ID <=", value, "stocksId");
            return (Criteria) this;
        }

        public Criteria andStocksIdIn(List<Integer> values) {
            addCriterion("Stocks_ID in", values, "stocksId");
            return (Criteria) this;
        }

        public Criteria andStocksIdNotIn(List<Integer> values) {
            addCriterion("Stocks_ID not in", values, "stocksId");
            return (Criteria) this;
        }

        public Criteria andStocksIdBetween(Integer value1, Integer value2) {
            addCriterion("Stocks_ID between", value1, value2, "stocksId");
            return (Criteria) this;
        }

        public Criteria andStocksIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Stocks_ID not between", value1, value2, "stocksId");
            return (Criteria) this;
        }

        public Criteria andStocksNumberIsNull() {
            addCriterion("Stocks_Number is null");
            return (Criteria) this;
        }

        public Criteria andStocksNumberIsNotNull() {
            addCriterion("Stocks_Number is not null");
            return (Criteria) this;
        }

        public Criteria andStocksNumberEqualTo(String value) {
            addCriterion("Stocks_Number =", value, "stocksNumber");
            return (Criteria) this;
        }

        public Criteria andStocksNumberNotEqualTo(String value) {
            addCriterion("Stocks_Number <>", value, "stocksNumber");
            return (Criteria) this;
        }

        public Criteria andStocksNumberGreaterThan(String value) {
            addCriterion("Stocks_Number >", value, "stocksNumber");
            return (Criteria) this;
        }

        public Criteria andStocksNumberGreaterThanOrEqualTo(String value) {
            addCriterion("Stocks_Number >=", value, "stocksNumber");
            return (Criteria) this;
        }

        public Criteria andStocksNumberLessThan(String value) {
            addCriterion("Stocks_Number <", value, "stocksNumber");
            return (Criteria) this;
        }

        public Criteria andStocksNumberLessThanOrEqualTo(String value) {
            addCriterion("Stocks_Number <=", value, "stocksNumber");
            return (Criteria) this;
        }

        public Criteria andStocksNumberLike(String value) {
            addCriterion("Stocks_Number like", value, "stocksNumber");
            return (Criteria) this;
        }

        public Criteria andStocksNumberNotLike(String value) {
            addCriterion("Stocks_Number not like", value, "stocksNumber");
            return (Criteria) this;
        }

        public Criteria andStocksNumberIn(List<String> values) {
            addCriterion("Stocks_Number in", values, "stocksNumber");
            return (Criteria) this;
        }

        public Criteria andStocksNumberNotIn(List<String> values) {
            addCriterion("Stocks_Number not in", values, "stocksNumber");
            return (Criteria) this;
        }

        public Criteria andStocksNumberBetween(String value1, String value2) {
            addCriterion("Stocks_Number between", value1, value2, "stocksNumber");
            return (Criteria) this;
        }

        public Criteria andStocksNumberNotBetween(String value1, String value2) {
            addCriterion("Stocks_Number not between", value1, value2, "stocksNumber");
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

        public Criteria andLocationsNumberIsNull() {
            addCriterion("Locations_Number is null");
            return (Criteria) this;
        }

        public Criteria andLocationsNumberIsNotNull() {
            addCriterion("Locations_Number is not null");
            return (Criteria) this;
        }

        public Criteria andLocationsNumberEqualTo(String value) {
            addCriterion("Locations_Number =", value, "locationsNumber");
            return (Criteria) this;
        }

        public Criteria andLocationsNumberNotEqualTo(String value) {
            addCriterion("Locations_Number <>", value, "locationsNumber");
            return (Criteria) this;
        }

        public Criteria andLocationsNumberGreaterThan(String value) {
            addCriterion("Locations_Number >", value, "locationsNumber");
            return (Criteria) this;
        }

        public Criteria andLocationsNumberGreaterThanOrEqualTo(String value) {
            addCriterion("Locations_Number >=", value, "locationsNumber");
            return (Criteria) this;
        }

        public Criteria andLocationsNumberLessThan(String value) {
            addCriterion("Locations_Number <", value, "locationsNumber");
            return (Criteria) this;
        }

        public Criteria andLocationsNumberLessThanOrEqualTo(String value) {
            addCriterion("Locations_Number <=", value, "locationsNumber");
            return (Criteria) this;
        }

        public Criteria andLocationsNumberLike(String value) {
            addCriterion("Locations_Number like", value, "locationsNumber");
            return (Criteria) this;
        }

        public Criteria andLocationsNumberNotLike(String value) {
            addCriterion("Locations_Number not like", value, "locationsNumber");
            return (Criteria) this;
        }

        public Criteria andLocationsNumberIn(List<String> values) {
            addCriterion("Locations_Number in", values, "locationsNumber");
            return (Criteria) this;
        }

        public Criteria andLocationsNumberNotIn(List<String> values) {
            addCriterion("Locations_Number not in", values, "locationsNumber");
            return (Criteria) this;
        }

        public Criteria andLocationsNumberBetween(String value1, String value2) {
            addCriterion("Locations_Number between", value1, value2, "locationsNumber");
            return (Criteria) this;
        }

        public Criteria andLocationsNumberNotBetween(String value1, String value2) {
            addCriterion("Locations_Number not between", value1, value2, "locationsNumber");
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

        public Criteria andQuantityIsNull() {
            addCriterion("Quantity is null");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNotNull() {
            addCriterion("Quantity is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityEqualTo(Float value) {
            addCriterion("Quantity =", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotEqualTo(Float value) {
            addCriterion("Quantity <>", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThan(Float value) {
            addCriterion("Quantity >", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThanOrEqualTo(Float value) {
            addCriterion("Quantity >=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThan(Float value) {
            addCriterion("Quantity <", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThanOrEqualTo(Float value) {
            addCriterion("Quantity <=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityIn(List<Float> values) {
            addCriterion("Quantity in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotIn(List<Float> values) {
            addCriterion("Quantity not in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityBetween(Float value1, Float value2) {
            addCriterion("Quantity between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotBetween(Float value1, Float value2) {
            addCriterion("Quantity not between", value1, value2, "quantity");
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

        public Criteria andIslockedIsNull() {
            addCriterion("IsLocked is null");
            return (Criteria) this;
        }

        public Criteria andIslockedIsNotNull() {
            addCriterion("IsLocked is not null");
            return (Criteria) this;
        }

        public Criteria andIslockedEqualTo(Integer value) {
            addCriterion("IsLocked =", value, "islocked");
            return (Criteria) this;
        }

        public Criteria andIslockedNotEqualTo(Integer value) {
            addCriterion("IsLocked <>", value, "islocked");
            return (Criteria) this;
        }

        public Criteria andIslockedGreaterThan(Integer value) {
            addCriterion("IsLocked >", value, "islocked");
            return (Criteria) this;
        }

        public Criteria andIslockedGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsLocked >=", value, "islocked");
            return (Criteria) this;
        }

        public Criteria andIslockedLessThan(Integer value) {
            addCriterion("IsLocked <", value, "islocked");
            return (Criteria) this;
        }

        public Criteria andIslockedLessThanOrEqualTo(Integer value) {
            addCriterion("IsLocked <=", value, "islocked");
            return (Criteria) this;
        }

        public Criteria andIslockedIn(List<Integer> values) {
            addCriterion("IsLocked in", values, "islocked");
            return (Criteria) this;
        }

        public Criteria andIslockedNotIn(List<Integer> values) {
            addCriterion("IsLocked not in", values, "islocked");
            return (Criteria) this;
        }

        public Criteria andIslockedBetween(Integer value1, Integer value2) {
            addCriterion("IsLocked between", value1, value2, "islocked");
            return (Criteria) this;
        }

        public Criteria andIslockedNotBetween(Integer value1, Integer value2) {
            addCriterion("IsLocked not between", value1, value2, "islocked");
            return (Criteria) this;
        }

        public Criteria andStockstatusIsNull() {
            addCriterion("StockStatus is null");
            return (Criteria) this;
        }

        public Criteria andStockstatusIsNotNull() {
            addCriterion("StockStatus is not null");
            return (Criteria) this;
        }

        public Criteria andStockstatusEqualTo(Integer value) {
            addCriterion("StockStatus =", value, "stockstatus");
            return (Criteria) this;
        }

        public Criteria andStockstatusNotEqualTo(Integer value) {
            addCriterion("StockStatus <>", value, "stockstatus");
            return (Criteria) this;
        }

        public Criteria andStockstatusGreaterThan(Integer value) {
            addCriterion("StockStatus >", value, "stockstatus");
            return (Criteria) this;
        }

        public Criteria andStockstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("StockStatus >=", value, "stockstatus");
            return (Criteria) this;
        }

        public Criteria andStockstatusLessThan(Integer value) {
            addCriterion("StockStatus <", value, "stockstatus");
            return (Criteria) this;
        }

        public Criteria andStockstatusLessThanOrEqualTo(Integer value) {
            addCriterion("StockStatus <=", value, "stockstatus");
            return (Criteria) this;
        }

        public Criteria andStockstatusIn(List<Integer> values) {
            addCriterion("StockStatus in", values, "stockstatus");
            return (Criteria) this;
        }

        public Criteria andStockstatusNotIn(List<Integer> values) {
            addCriterion("StockStatus not in", values, "stockstatus");
            return (Criteria) this;
        }

        public Criteria andStockstatusBetween(Integer value1, Integer value2) {
            addCriterion("StockStatus between", value1, value2, "stockstatus");
            return (Criteria) this;
        }

        public Criteria andStockstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("StockStatus not between", value1, value2, "stockstatus");
            return (Criteria) this;
        }

        public Criteria andIsaddgoodsIsNull() {
            addCriterion("IsAddGoods is null");
            return (Criteria) this;
        }

        public Criteria andIsaddgoodsIsNotNull() {
            addCriterion("IsAddGoods is not null");
            return (Criteria) this;
        }

        public Criteria andIsaddgoodsEqualTo(Integer value) {
            addCriterion("IsAddGoods =", value, "isaddgoods");
            return (Criteria) this;
        }

        public Criteria andIsaddgoodsNotEqualTo(Integer value) {
            addCriterion("IsAddGoods <>", value, "isaddgoods");
            return (Criteria) this;
        }

        public Criteria andIsaddgoodsGreaterThan(Integer value) {
            addCriterion("IsAddGoods >", value, "isaddgoods");
            return (Criteria) this;
        }

        public Criteria andIsaddgoodsGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsAddGoods >=", value, "isaddgoods");
            return (Criteria) this;
        }

        public Criteria andIsaddgoodsLessThan(Integer value) {
            addCriterion("IsAddGoods <", value, "isaddgoods");
            return (Criteria) this;
        }

        public Criteria andIsaddgoodsLessThanOrEqualTo(Integer value) {
            addCriterion("IsAddGoods <=", value, "isaddgoods");
            return (Criteria) this;
        }

        public Criteria andIsaddgoodsIn(List<Integer> values) {
            addCriterion("IsAddGoods in", values, "isaddgoods");
            return (Criteria) this;
        }

        public Criteria andIsaddgoodsNotIn(List<Integer> values) {
            addCriterion("IsAddGoods not in", values, "isaddgoods");
            return (Criteria) this;
        }

        public Criteria andIsaddgoodsBetween(Integer value1, Integer value2) {
            addCriterion("IsAddGoods between", value1, value2, "isaddgoods");
            return (Criteria) this;
        }

        public Criteria andIsaddgoodsNotBetween(Integer value1, Integer value2) {
            addCriterion("IsAddGoods not between", value1, value2, "isaddgoods");
            return (Criteria) this;
        }

        public Criteria andStockinstructionIsNull() {
            addCriterion("StockInstruction is null");
            return (Criteria) this;
        }

        public Criteria andStockinstructionIsNotNull() {
            addCriterion("StockInstruction is not null");
            return (Criteria) this;
        }

        public Criteria andStockinstructionEqualTo(String value) {
            addCriterion("StockInstruction =", value, "stockinstruction");
            return (Criteria) this;
        }

        public Criteria andStockinstructionNotEqualTo(String value) {
            addCriterion("StockInstruction <>", value, "stockinstruction");
            return (Criteria) this;
        }

        public Criteria andStockinstructionGreaterThan(String value) {
            addCriterion("StockInstruction >", value, "stockinstruction");
            return (Criteria) this;
        }

        public Criteria andStockinstructionGreaterThanOrEqualTo(String value) {
            addCriterion("StockInstruction >=", value, "stockinstruction");
            return (Criteria) this;
        }

        public Criteria andStockinstructionLessThan(String value) {
            addCriterion("StockInstruction <", value, "stockinstruction");
            return (Criteria) this;
        }

        public Criteria andStockinstructionLessThanOrEqualTo(String value) {
            addCriterion("StockInstruction <=", value, "stockinstruction");
            return (Criteria) this;
        }

        public Criteria andStockinstructionLike(String value) {
            addCriterion("StockInstruction like", value, "stockinstruction");
            return (Criteria) this;
        }

        public Criteria andStockinstructionNotLike(String value) {
            addCriterion("StockInstruction not like", value, "stockinstruction");
            return (Criteria) this;
        }

        public Criteria andStockinstructionIn(List<String> values) {
            addCriterion("StockInstruction in", values, "stockinstruction");
            return (Criteria) this;
        }

        public Criteria andStockinstructionNotIn(List<String> values) {
            addCriterion("StockInstruction not in", values, "stockinstruction");
            return (Criteria) this;
        }

        public Criteria andStockinstructionBetween(String value1, String value2) {
            addCriterion("StockInstruction between", value1, value2, "stockinstruction");
            return (Criteria) this;
        }

        public Criteria andStockinstructionNotBetween(String value1, String value2) {
            addCriterion("StockInstruction not between", value1, value2, "stockinstruction");
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

        public Criteria andIsdeletedEqualTo(Integer value) {
            addCriterion("IsDeleted =", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedNotEqualTo(Integer value) {
            addCriterion("IsDeleted <>", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedGreaterThan(Integer value) {
            addCriterion("IsDeleted >", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsDeleted >=", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedLessThan(Integer value) {
            addCriterion("IsDeleted <", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedLessThanOrEqualTo(Integer value) {
            addCriterion("IsDeleted <=", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedIn(List<Integer> values) {
            addCriterion("IsDeleted in", values, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedNotIn(List<Integer> values) {
            addCriterion("IsDeleted not in", values, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedBetween(Integer value1, Integer value2) {
            addCriterion("IsDeleted between", value1, value2, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedNotBetween(Integer value1, Integer value2) {
            addCriterion("IsDeleted not between", value1, value2, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsqualifiedIsNull() {
            addCriterion("IsQualified is null");
            return (Criteria) this;
        }

        public Criteria andIsqualifiedIsNotNull() {
            addCriterion("IsQualified is not null");
            return (Criteria) this;
        }

        public Criteria andIsqualifiedEqualTo(Integer value) {
            addCriterion("IsQualified =", value, "isqualified");
            return (Criteria) this;
        }

        public Criteria andIsqualifiedNotEqualTo(Integer value) {
            addCriterion("IsQualified <>", value, "isqualified");
            return (Criteria) this;
        }

        public Criteria andIsqualifiedGreaterThan(Integer value) {
            addCriterion("IsQualified >", value, "isqualified");
            return (Criteria) this;
        }

        public Criteria andIsqualifiedGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsQualified >=", value, "isqualified");
            return (Criteria) this;
        }

        public Criteria andIsqualifiedLessThan(Integer value) {
            addCriterion("IsQualified <", value, "isqualified");
            return (Criteria) this;
        }

        public Criteria andIsqualifiedLessThanOrEqualTo(Integer value) {
            addCriterion("IsQualified <=", value, "isqualified");
            return (Criteria) this;
        }

        public Criteria andIsqualifiedIn(List<Integer> values) {
            addCriterion("IsQualified in", values, "isqualified");
            return (Criteria) this;
        }

        public Criteria andIsqualifiedNotIn(List<Integer> values) {
            addCriterion("IsQualified not in", values, "isqualified");
            return (Criteria) this;
        }

        public Criteria andIsqualifiedBetween(Integer value1, Integer value2) {
            addCriterion("IsQualified between", value1, value2, "isqualified");
            return (Criteria) this;
        }

        public Criteria andIsqualifiedNotBetween(Integer value1, Integer value2) {
            addCriterion("IsQualified not between", value1, value2, "isqualified");
            return (Criteria) this;
        }

        public Criteria andMaxstorageIsNull() {
            addCriterion("MaxStorage is null");
            return (Criteria) this;
        }

        public Criteria andMaxstorageIsNotNull() {
            addCriterion("MaxStorage is not null");
            return (Criteria) this;
        }

        public Criteria andMaxstorageEqualTo(Integer value) {
            addCriterion("MaxStorage =", value, "maxstorage");
            return (Criteria) this;
        }

        public Criteria andMaxstorageNotEqualTo(Integer value) {
            addCriterion("MaxStorage <>", value, "maxstorage");
            return (Criteria) this;
        }

        public Criteria andMaxstorageGreaterThan(Integer value) {
            addCriterion("MaxStorage >", value, "maxstorage");
            return (Criteria) this;
        }

        public Criteria andMaxstorageGreaterThanOrEqualTo(Integer value) {
            addCriterion("MaxStorage >=", value, "maxstorage");
            return (Criteria) this;
        }

        public Criteria andMaxstorageLessThan(Integer value) {
            addCriterion("MaxStorage <", value, "maxstorage");
            return (Criteria) this;
        }

        public Criteria andMaxstorageLessThanOrEqualTo(Integer value) {
            addCriterion("MaxStorage <=", value, "maxstorage");
            return (Criteria) this;
        }

        public Criteria andMaxstorageIn(List<Integer> values) {
            addCriterion("MaxStorage in", values, "maxstorage");
            return (Criteria) this;
        }

        public Criteria andMaxstorageNotIn(List<Integer> values) {
            addCriterion("MaxStorage not in", values, "maxstorage");
            return (Criteria) this;
        }

        public Criteria andMaxstorageBetween(Integer value1, Integer value2) {
            addCriterion("MaxStorage between", value1, value2, "maxstorage");
            return (Criteria) this;
        }

        public Criteria andMaxstorageNotBetween(Integer value1, Integer value2) {
            addCriterion("MaxStorage not between", value1, value2, "maxstorage");
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
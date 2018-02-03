package cn.hhu.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WmsLocationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WmsLocationExample() {
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

        public Criteria andParentareaIdIsNull() {
            addCriterion("ParentArea_ID is null");
            return (Criteria) this;
        }

        public Criteria andParentareaIdIsNotNull() {
            addCriterion("ParentArea_ID is not null");
            return (Criteria) this;
        }

        public Criteria andParentareaIdEqualTo(Integer value) {
            addCriterion("ParentArea_ID =", value, "parentareaId");
            return (Criteria) this;
        }

        public Criteria andParentareaIdNotEqualTo(Integer value) {
            addCriterion("ParentArea_ID <>", value, "parentareaId");
            return (Criteria) this;
        }

        public Criteria andParentareaIdGreaterThan(Integer value) {
            addCriterion("ParentArea_ID >", value, "parentareaId");
            return (Criteria) this;
        }

        public Criteria andParentareaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ParentArea_ID >=", value, "parentareaId");
            return (Criteria) this;
        }

        public Criteria andParentareaIdLessThan(Integer value) {
            addCriterion("ParentArea_ID <", value, "parentareaId");
            return (Criteria) this;
        }

        public Criteria andParentareaIdLessThanOrEqualTo(Integer value) {
            addCriterion("ParentArea_ID <=", value, "parentareaId");
            return (Criteria) this;
        }

        public Criteria andParentareaIdIn(List<Integer> values) {
            addCriterion("ParentArea_ID in", values, "parentareaId");
            return (Criteria) this;
        }

        public Criteria andParentareaIdNotIn(List<Integer> values) {
            addCriterion("ParentArea_ID not in", values, "parentareaId");
            return (Criteria) this;
        }

        public Criteria andParentareaIdBetween(Integer value1, Integer value2) {
            addCriterion("ParentArea_ID between", value1, value2, "parentareaId");
            return (Criteria) this;
        }

        public Criteria andParentareaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ParentArea_ID not between", value1, value2, "parentareaId");
            return (Criteria) this;
        }

        public Criteria andLocationattributeIsNull() {
            addCriterion("LocationAttribute is null");
            return (Criteria) this;
        }

        public Criteria andLocationattributeIsNotNull() {
            addCriterion("LocationAttribute is not null");
            return (Criteria) this;
        }

        public Criteria andLocationattributeEqualTo(String value) {
            addCriterion("LocationAttribute =", value, "locationattribute");
            return (Criteria) this;
        }

        public Criteria andLocationattributeNotEqualTo(String value) {
            addCriterion("LocationAttribute <>", value, "locationattribute");
            return (Criteria) this;
        }

        public Criteria andLocationattributeGreaterThan(String value) {
            addCriterion("LocationAttribute >", value, "locationattribute");
            return (Criteria) this;
        }

        public Criteria andLocationattributeGreaterThanOrEqualTo(String value) {
            addCriterion("LocationAttribute >=", value, "locationattribute");
            return (Criteria) this;
        }

        public Criteria andLocationattributeLessThan(String value) {
            addCriterion("LocationAttribute <", value, "locationattribute");
            return (Criteria) this;
        }

        public Criteria andLocationattributeLessThanOrEqualTo(String value) {
            addCriterion("LocationAttribute <=", value, "locationattribute");
            return (Criteria) this;
        }

        public Criteria andLocationattributeLike(String value) {
            addCriterion("LocationAttribute like", value, "locationattribute");
            return (Criteria) this;
        }

        public Criteria andLocationattributeNotLike(String value) {
            addCriterion("LocationAttribute not like", value, "locationattribute");
            return (Criteria) this;
        }

        public Criteria andLocationattributeIn(List<String> values) {
            addCriterion("LocationAttribute in", values, "locationattribute");
            return (Criteria) this;
        }

        public Criteria andLocationattributeNotIn(List<String> values) {
            addCriterion("LocationAttribute not in", values, "locationattribute");
            return (Criteria) this;
        }

        public Criteria andLocationattributeBetween(String value1, String value2) {
            addCriterion("LocationAttribute between", value1, value2, "locationattribute");
            return (Criteria) this;
        }

        public Criteria andLocationattributeNotBetween(String value1, String value2) {
            addCriterion("LocationAttribute not between", value1, value2, "locationattribute");
            return (Criteria) this;
        }

        public Criteria andShelvesIsNull() {
            addCriterion("Shelves is null");
            return (Criteria) this;
        }

        public Criteria andShelvesIsNotNull() {
            addCriterion("Shelves is not null");
            return (Criteria) this;
        }

        public Criteria andShelvesEqualTo(Integer value) {
            addCriterion("Shelves =", value, "shelves");
            return (Criteria) this;
        }

        public Criteria andShelvesNotEqualTo(Integer value) {
            addCriterion("Shelves <>", value, "shelves");
            return (Criteria) this;
        }

        public Criteria andShelvesGreaterThan(Integer value) {
            addCriterion("Shelves >", value, "shelves");
            return (Criteria) this;
        }

        public Criteria andShelvesGreaterThanOrEqualTo(Integer value) {
            addCriterion("Shelves >=", value, "shelves");
            return (Criteria) this;
        }

        public Criteria andShelvesLessThan(Integer value) {
            addCriterion("Shelves <", value, "shelves");
            return (Criteria) this;
        }

        public Criteria andShelvesLessThanOrEqualTo(Integer value) {
            addCriterion("Shelves <=", value, "shelves");
            return (Criteria) this;
        }

        public Criteria andShelvesIn(List<Integer> values) {
            addCriterion("Shelves in", values, "shelves");
            return (Criteria) this;
        }

        public Criteria andShelvesNotIn(List<Integer> values) {
            addCriterion("Shelves not in", values, "shelves");
            return (Criteria) this;
        }

        public Criteria andShelvesBetween(Integer value1, Integer value2) {
            addCriterion("Shelves between", value1, value2, "shelves");
            return (Criteria) this;
        }

        public Criteria andShelvesNotBetween(Integer value1, Integer value2) {
            addCriterion("Shelves not between", value1, value2, "shelves");
            return (Criteria) this;
        }

        public Criteria andLayersnumberIsNull() {
            addCriterion("LayersNumber is null");
            return (Criteria) this;
        }

        public Criteria andLayersnumberIsNotNull() {
            addCriterion("LayersNumber is not null");
            return (Criteria) this;
        }

        public Criteria andLayersnumberEqualTo(Integer value) {
            addCriterion("LayersNumber =", value, "layersnumber");
            return (Criteria) this;
        }

        public Criteria andLayersnumberNotEqualTo(Integer value) {
            addCriterion("LayersNumber <>", value, "layersnumber");
            return (Criteria) this;
        }

        public Criteria andLayersnumberGreaterThan(Integer value) {
            addCriterion("LayersNumber >", value, "layersnumber");
            return (Criteria) this;
        }

        public Criteria andLayersnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("LayersNumber >=", value, "layersnumber");
            return (Criteria) this;
        }

        public Criteria andLayersnumberLessThan(Integer value) {
            addCriterion("LayersNumber <", value, "layersnumber");
            return (Criteria) this;
        }

        public Criteria andLayersnumberLessThanOrEqualTo(Integer value) {
            addCriterion("LayersNumber <=", value, "layersnumber");
            return (Criteria) this;
        }

        public Criteria andLayersnumberIn(List<Integer> values) {
            addCriterion("LayersNumber in", values, "layersnumber");
            return (Criteria) this;
        }

        public Criteria andLayersnumberNotIn(List<Integer> values) {
            addCriterion("LayersNumber not in", values, "layersnumber");
            return (Criteria) this;
        }

        public Criteria andLayersnumberBetween(Integer value1, Integer value2) {
            addCriterion("LayersNumber between", value1, value2, "layersnumber");
            return (Criteria) this;
        }

        public Criteria andLayersnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("LayersNumber not between", value1, value2, "layersnumber");
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

        public Criteria andGoodsNumberIsNull() {
            addCriterion("Goods_Number is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberIsNotNull() {
            addCriterion("Goods_Number is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberEqualTo(Float value) {
            addCriterion("Goods_Number =", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberNotEqualTo(Float value) {
            addCriterion("Goods_Number <>", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberGreaterThan(Float value) {
            addCriterion("Goods_Number >", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberGreaterThanOrEqualTo(Float value) {
            addCriterion("Goods_Number >=", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberLessThan(Float value) {
            addCriterion("Goods_Number <", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberLessThanOrEqualTo(Float value) {
            addCriterion("Goods_Number <=", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberIn(List<Float> values) {
            addCriterion("Goods_Number in", values, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberNotIn(List<Float> values) {
            addCriterion("Goods_Number not in", values, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberBetween(Float value1, Float value2) {
            addCriterion("Goods_Number between", value1, value2, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberNotBetween(Float value1, Float value2) {
            addCriterion("Goods_Number not between", value1, value2, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andPicislIsNull() {
            addCriterion("PiciSL is null");
            return (Criteria) this;
        }

        public Criteria andPicislIsNotNull() {
            addCriterion("PiciSL is not null");
            return (Criteria) this;
        }

        public Criteria andPicislEqualTo(Float value) {
            addCriterion("PiciSL =", value, "picisl");
            return (Criteria) this;
        }

        public Criteria andPicislNotEqualTo(Float value) {
            addCriterion("PiciSL <>", value, "picisl");
            return (Criteria) this;
        }

        public Criteria andPicislGreaterThan(Float value) {
            addCriterion("PiciSL >", value, "picisl");
            return (Criteria) this;
        }

        public Criteria andPicislGreaterThanOrEqualTo(Float value) {
            addCriterion("PiciSL >=", value, "picisl");
            return (Criteria) this;
        }

        public Criteria andPicislLessThan(Float value) {
            addCriterion("PiciSL <", value, "picisl");
            return (Criteria) this;
        }

        public Criteria andPicislLessThanOrEqualTo(Float value) {
            addCriterion("PiciSL <=", value, "picisl");
            return (Criteria) this;
        }

        public Criteria andPicislIn(List<Float> values) {
            addCriterion("PiciSL in", values, "picisl");
            return (Criteria) this;
        }

        public Criteria andPicislNotIn(List<Float> values) {
            addCriterion("PiciSL not in", values, "picisl");
            return (Criteria) this;
        }

        public Criteria andPicislBetween(Float value1, Float value2) {
            addCriterion("PiciSL between", value1, value2, "picisl");
            return (Criteria) this;
        }

        public Criteria andPicislNotBetween(Float value1, Float value2) {
            addCriterion("PiciSL not between", value1, value2, "picisl");
            return (Criteria) this;
        }

        public Criteria andMaxweightIsNull() {
            addCriterion("MaxWeight is null");
            return (Criteria) this;
        }

        public Criteria andMaxweightIsNotNull() {
            addCriterion("MaxWeight is not null");
            return (Criteria) this;
        }

        public Criteria andMaxweightEqualTo(Float value) {
            addCriterion("MaxWeight =", value, "maxweight");
            return (Criteria) this;
        }

        public Criteria andMaxweightNotEqualTo(Float value) {
            addCriterion("MaxWeight <>", value, "maxweight");
            return (Criteria) this;
        }

        public Criteria andMaxweightGreaterThan(Float value) {
            addCriterion("MaxWeight >", value, "maxweight");
            return (Criteria) this;
        }

        public Criteria andMaxweightGreaterThanOrEqualTo(Float value) {
            addCriterion("MaxWeight >=", value, "maxweight");
            return (Criteria) this;
        }

        public Criteria andMaxweightLessThan(Float value) {
            addCriterion("MaxWeight <", value, "maxweight");
            return (Criteria) this;
        }

        public Criteria andMaxweightLessThanOrEqualTo(Float value) {
            addCriterion("MaxWeight <=", value, "maxweight");
            return (Criteria) this;
        }

        public Criteria andMaxweightIn(List<Float> values) {
            addCriterion("MaxWeight in", values, "maxweight");
            return (Criteria) this;
        }

        public Criteria andMaxweightNotIn(List<Float> values) {
            addCriterion("MaxWeight not in", values, "maxweight");
            return (Criteria) this;
        }

        public Criteria andMaxweightBetween(Float value1, Float value2) {
            addCriterion("MaxWeight between", value1, value2, "maxweight");
            return (Criteria) this;
        }

        public Criteria andMaxweightNotBetween(Float value1, Float value2) {
            addCriterion("MaxWeight not between", value1, value2, "maxweight");
            return (Criteria) this;
        }

        public Criteria andMaxvolumnIsNull() {
            addCriterion("MaxVolumn is null");
            return (Criteria) this;
        }

        public Criteria andMaxvolumnIsNotNull() {
            addCriterion("MaxVolumn is not null");
            return (Criteria) this;
        }

        public Criteria andMaxvolumnEqualTo(Float value) {
            addCriterion("MaxVolumn =", value, "maxvolumn");
            return (Criteria) this;
        }

        public Criteria andMaxvolumnNotEqualTo(Float value) {
            addCriterion("MaxVolumn <>", value, "maxvolumn");
            return (Criteria) this;
        }

        public Criteria andMaxvolumnGreaterThan(Float value) {
            addCriterion("MaxVolumn >", value, "maxvolumn");
            return (Criteria) this;
        }

        public Criteria andMaxvolumnGreaterThanOrEqualTo(Float value) {
            addCriterion("MaxVolumn >=", value, "maxvolumn");
            return (Criteria) this;
        }

        public Criteria andMaxvolumnLessThan(Float value) {
            addCriterion("MaxVolumn <", value, "maxvolumn");
            return (Criteria) this;
        }

        public Criteria andMaxvolumnLessThanOrEqualTo(Float value) {
            addCriterion("MaxVolumn <=", value, "maxvolumn");
            return (Criteria) this;
        }

        public Criteria andMaxvolumnIn(List<Float> values) {
            addCriterion("MaxVolumn in", values, "maxvolumn");
            return (Criteria) this;
        }

        public Criteria andMaxvolumnNotIn(List<Float> values) {
            addCriterion("MaxVolumn not in", values, "maxvolumn");
            return (Criteria) this;
        }

        public Criteria andMaxvolumnBetween(Float value1, Float value2) {
            addCriterion("MaxVolumn between", value1, value2, "maxvolumn");
            return (Criteria) this;
        }

        public Criteria andMaxvolumnNotBetween(Float value1, Float value2) {
            addCriterion("MaxVolumn not between", value1, value2, "maxvolumn");
            return (Criteria) this;
        }

        public Criteria andIsusedIsNull() {
            addCriterion("IsUsed is null");
            return (Criteria) this;
        }

        public Criteria andIsusedIsNotNull() {
            addCriterion("IsUsed is not null");
            return (Criteria) this;
        }

        public Criteria andIsusedEqualTo(Integer value) {
            addCriterion("IsUsed =", value, "isused");
            return (Criteria) this;
        }

        public Criteria andIsusedNotEqualTo(Integer value) {
            addCriterion("IsUsed <>", value, "isused");
            return (Criteria) this;
        }

        public Criteria andIsusedGreaterThan(Integer value) {
            addCriterion("IsUsed >", value, "isused");
            return (Criteria) this;
        }

        public Criteria andIsusedGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsUsed >=", value, "isused");
            return (Criteria) this;
        }

        public Criteria andIsusedLessThan(Integer value) {
            addCriterion("IsUsed <", value, "isused");
            return (Criteria) this;
        }

        public Criteria andIsusedLessThanOrEqualTo(Integer value) {
            addCriterion("IsUsed <=", value, "isused");
            return (Criteria) this;
        }

        public Criteria andIsusedIn(List<Integer> values) {
            addCriterion("IsUsed in", values, "isused");
            return (Criteria) this;
        }

        public Criteria andIsusedNotIn(List<Integer> values) {
            addCriterion("IsUsed not in", values, "isused");
            return (Criteria) this;
        }

        public Criteria andIsusedBetween(Integer value1, Integer value2) {
            addCriterion("IsUsed between", value1, value2, "isused");
            return (Criteria) this;
        }

        public Criteria andIsusedNotBetween(Integer value1, Integer value2) {
            addCriterion("IsUsed not between", value1, value2, "isused");
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

        public Criteria andColumncountIsNull() {
            addCriterion("ColumnCount is null");
            return (Criteria) this;
        }

        public Criteria andColumncountIsNotNull() {
            addCriterion("ColumnCount is not null");
            return (Criteria) this;
        }

        public Criteria andColumncountEqualTo(Integer value) {
            addCriterion("ColumnCount =", value, "columncount");
            return (Criteria) this;
        }

        public Criteria andColumncountNotEqualTo(Integer value) {
            addCriterion("ColumnCount <>", value, "columncount");
            return (Criteria) this;
        }

        public Criteria andColumncountGreaterThan(Integer value) {
            addCriterion("ColumnCount >", value, "columncount");
            return (Criteria) this;
        }

        public Criteria andColumncountGreaterThanOrEqualTo(Integer value) {
            addCriterion("ColumnCount >=", value, "columncount");
            return (Criteria) this;
        }

        public Criteria andColumncountLessThan(Integer value) {
            addCriterion("ColumnCount <", value, "columncount");
            return (Criteria) this;
        }

        public Criteria andColumncountLessThanOrEqualTo(Integer value) {
            addCriterion("ColumnCount <=", value, "columncount");
            return (Criteria) this;
        }

        public Criteria andColumncountIn(List<Integer> values) {
            addCriterion("ColumnCount in", values, "columncount");
            return (Criteria) this;
        }

        public Criteria andColumncountNotIn(List<Integer> values) {
            addCriterion("ColumnCount not in", values, "columncount");
            return (Criteria) this;
        }

        public Criteria andColumncountBetween(Integer value1, Integer value2) {
            addCriterion("ColumnCount between", value1, value2, "columncount");
            return (Criteria) this;
        }

        public Criteria andColumncountNotBetween(Integer value1, Integer value2) {
            addCriterion("ColumnCount not between", value1, value2, "columncount");
            return (Criteria) this;
        }

        public Criteria andAreanameIsNull() {
            addCriterion("AreaName is null");
            return (Criteria) this;
        }

        public Criteria andAreanameIsNotNull() {
            addCriterion("AreaName is not null");
            return (Criteria) this;
        }

        public Criteria andAreanameEqualTo(String value) {
            addCriterion("AreaName =", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameNotEqualTo(String value) {
            addCriterion("AreaName <>", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameGreaterThan(String value) {
            addCriterion("AreaName >", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameGreaterThanOrEqualTo(String value) {
            addCriterion("AreaName >=", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameLessThan(String value) {
            addCriterion("AreaName <", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameLessThanOrEqualTo(String value) {
            addCriterion("AreaName <=", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameLike(String value) {
            addCriterion("AreaName like", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameNotLike(String value) {
            addCriterion("AreaName not like", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameIn(List<String> values) {
            addCriterion("AreaName in", values, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameNotIn(List<String> values) {
            addCriterion("AreaName not in", values, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameBetween(String value1, String value2) {
            addCriterion("AreaName between", value1, value2, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameNotBetween(String value1, String value2) {
            addCriterion("AreaName not between", value1, value2, "areaname");
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
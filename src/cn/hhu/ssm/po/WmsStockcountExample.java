package cn.hhu.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WmsStockcountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WmsStockcountExample() {
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

        public Criteria andStockcountsIdIsNull() {
            addCriterion("StockCounts_ID is null");
            return (Criteria) this;
        }

        public Criteria andStockcountsIdIsNotNull() {
            addCriterion("StockCounts_ID is not null");
            return (Criteria) this;
        }

        public Criteria andStockcountsIdEqualTo(Integer value) {
            addCriterion("StockCounts_ID =", value, "stockcountsId");
            return (Criteria) this;
        }

        public Criteria andStockcountsIdNotEqualTo(Integer value) {
            addCriterion("StockCounts_ID <>", value, "stockcountsId");
            return (Criteria) this;
        }

        public Criteria andStockcountsIdGreaterThan(Integer value) {
            addCriterion("StockCounts_ID >", value, "stockcountsId");
            return (Criteria) this;
        }

        public Criteria andStockcountsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("StockCounts_ID >=", value, "stockcountsId");
            return (Criteria) this;
        }

        public Criteria andStockcountsIdLessThan(Integer value) {
            addCriterion("StockCounts_ID <", value, "stockcountsId");
            return (Criteria) this;
        }

        public Criteria andStockcountsIdLessThanOrEqualTo(Integer value) {
            addCriterion("StockCounts_ID <=", value, "stockcountsId");
            return (Criteria) this;
        }

        public Criteria andStockcountsIdIn(List<Integer> values) {
            addCriterion("StockCounts_ID in", values, "stockcountsId");
            return (Criteria) this;
        }

        public Criteria andStockcountsIdNotIn(List<Integer> values) {
            addCriterion("StockCounts_ID not in", values, "stockcountsId");
            return (Criteria) this;
        }

        public Criteria andStockcountsIdBetween(Integer value1, Integer value2) {
            addCriterion("StockCounts_ID between", value1, value2, "stockcountsId");
            return (Criteria) this;
        }

        public Criteria andStockcountsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("StockCounts_ID not between", value1, value2, "stockcountsId");
            return (Criteria) this;
        }

        public Criteria andStockcountsNumberIsNull() {
            addCriterion("StockCounts_Number is null");
            return (Criteria) this;
        }

        public Criteria andStockcountsNumberIsNotNull() {
            addCriterion("StockCounts_Number is not null");
            return (Criteria) this;
        }

        public Criteria andStockcountsNumberEqualTo(String value) {
            addCriterion("StockCounts_Number =", value, "stockcountsNumber");
            return (Criteria) this;
        }

        public Criteria andStockcountsNumberNotEqualTo(String value) {
            addCriterion("StockCounts_Number <>", value, "stockcountsNumber");
            return (Criteria) this;
        }

        public Criteria andStockcountsNumberGreaterThan(String value) {
            addCriterion("StockCounts_Number >", value, "stockcountsNumber");
            return (Criteria) this;
        }

        public Criteria andStockcountsNumberGreaterThanOrEqualTo(String value) {
            addCriterion("StockCounts_Number >=", value, "stockcountsNumber");
            return (Criteria) this;
        }

        public Criteria andStockcountsNumberLessThan(String value) {
            addCriterion("StockCounts_Number <", value, "stockcountsNumber");
            return (Criteria) this;
        }

        public Criteria andStockcountsNumberLessThanOrEqualTo(String value) {
            addCriterion("StockCounts_Number <=", value, "stockcountsNumber");
            return (Criteria) this;
        }

        public Criteria andStockcountsNumberLike(String value) {
            addCriterion("StockCounts_Number like", value, "stockcountsNumber");
            return (Criteria) this;
        }

        public Criteria andStockcountsNumberNotLike(String value) {
            addCriterion("StockCounts_Number not like", value, "stockcountsNumber");
            return (Criteria) this;
        }

        public Criteria andStockcountsNumberIn(List<String> values) {
            addCriterion("StockCounts_Number in", values, "stockcountsNumber");
            return (Criteria) this;
        }

        public Criteria andStockcountsNumberNotIn(List<String> values) {
            addCriterion("StockCounts_Number not in", values, "stockcountsNumber");
            return (Criteria) this;
        }

        public Criteria andStockcountsNumberBetween(String value1, String value2) {
            addCriterion("StockCounts_Number between", value1, value2, "stockcountsNumber");
            return (Criteria) this;
        }

        public Criteria andStockcountsNumberNotBetween(String value1, String value2) {
            addCriterion("StockCounts_Number not between", value1, value2, "stockcountsNumber");
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

        public Criteria andWarndateIsNull() {
            addCriterion("WarnDate is null");
            return (Criteria) this;
        }

        public Criteria andWarndateIsNotNull() {
            addCriterion("WarnDate is not null");
            return (Criteria) this;
        }

        public Criteria andWarndateEqualTo(Date value) {
            addCriterion("WarnDate =", value, "warndate");
            return (Criteria) this;
        }

        public Criteria andWarndateNotEqualTo(Date value) {
            addCriterion("WarnDate <>", value, "warndate");
            return (Criteria) this;
        }

        public Criteria andWarndateGreaterThan(Date value) {
            addCriterion("WarnDate >", value, "warndate");
            return (Criteria) this;
        }

        public Criteria andWarndateGreaterThanOrEqualTo(Date value) {
            addCriterion("WarnDate >=", value, "warndate");
            return (Criteria) this;
        }

        public Criteria andWarndateLessThan(Date value) {
            addCriterion("WarnDate <", value, "warndate");
            return (Criteria) this;
        }

        public Criteria andWarndateLessThanOrEqualTo(Date value) {
            addCriterion("WarnDate <=", value, "warndate");
            return (Criteria) this;
        }

        public Criteria andWarndateIn(List<Date> values) {
            addCriterion("WarnDate in", values, "warndate");
            return (Criteria) this;
        }

        public Criteria andWarndateNotIn(List<Date> values) {
            addCriterion("WarnDate not in", values, "warndate");
            return (Criteria) this;
        }

        public Criteria andWarndateBetween(Date value1, Date value2) {
            addCriterion("WarnDate between", value1, value2, "warndate");
            return (Criteria) this;
        }

        public Criteria andWarndateNotBetween(Date value1, Date value2) {
            addCriterion("WarnDate not between", value1, value2, "warndate");
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

        public Criteria andConversionrateIsNull() {
            addCriterion("ConversionRate is null");
            return (Criteria) this;
        }

        public Criteria andConversionrateIsNotNull() {
            addCriterion("ConversionRate is not null");
            return (Criteria) this;
        }

        public Criteria andConversionrateEqualTo(String value) {
            addCriterion("ConversionRate =", value, "conversionrate");
            return (Criteria) this;
        }

        public Criteria andConversionrateNotEqualTo(String value) {
            addCriterion("ConversionRate <>", value, "conversionrate");
            return (Criteria) this;
        }

        public Criteria andConversionrateGreaterThan(String value) {
            addCriterion("ConversionRate >", value, "conversionrate");
            return (Criteria) this;
        }

        public Criteria andConversionrateGreaterThanOrEqualTo(String value) {
            addCriterion("ConversionRate >=", value, "conversionrate");
            return (Criteria) this;
        }

        public Criteria andConversionrateLessThan(String value) {
            addCriterion("ConversionRate <", value, "conversionrate");
            return (Criteria) this;
        }

        public Criteria andConversionrateLessThanOrEqualTo(String value) {
            addCriterion("ConversionRate <=", value, "conversionrate");
            return (Criteria) this;
        }

        public Criteria andConversionrateLike(String value) {
            addCriterion("ConversionRate like", value, "conversionrate");
            return (Criteria) this;
        }

        public Criteria andConversionrateNotLike(String value) {
            addCriterion("ConversionRate not like", value, "conversionrate");
            return (Criteria) this;
        }

        public Criteria andConversionrateIn(List<String> values) {
            addCriterion("ConversionRate in", values, "conversionrate");
            return (Criteria) this;
        }

        public Criteria andConversionrateNotIn(List<String> values) {
            addCriterion("ConversionRate not in", values, "conversionrate");
            return (Criteria) this;
        }

        public Criteria andConversionrateBetween(String value1, String value2) {
            addCriterion("ConversionRate between", value1, value2, "conversionrate");
            return (Criteria) this;
        }

        public Criteria andConversionrateNotBetween(String value1, String value2) {
            addCriterion("ConversionRate not between", value1, value2, "conversionrate");
            return (Criteria) this;
        }

        public Criteria andLockedNumberIsNull() {
            addCriterion("Locked_Number is null");
            return (Criteria) this;
        }

        public Criteria andLockedNumberIsNotNull() {
            addCriterion("Locked_Number is not null");
            return (Criteria) this;
        }

        public Criteria andLockedNumberEqualTo(Float value) {
            addCriterion("Locked_Number =", value, "lockedNumber");
            return (Criteria) this;
        }

        public Criteria andLockedNumberNotEqualTo(Float value) {
            addCriterion("Locked_Number <>", value, "lockedNumber");
            return (Criteria) this;
        }

        public Criteria andLockedNumberGreaterThan(Float value) {
            addCriterion("Locked_Number >", value, "lockedNumber");
            return (Criteria) this;
        }

        public Criteria andLockedNumberGreaterThanOrEqualTo(Float value) {
            addCriterion("Locked_Number >=", value, "lockedNumber");
            return (Criteria) this;
        }

        public Criteria andLockedNumberLessThan(Float value) {
            addCriterion("Locked_Number <", value, "lockedNumber");
            return (Criteria) this;
        }

        public Criteria andLockedNumberLessThanOrEqualTo(Float value) {
            addCriterion("Locked_Number <=", value, "lockedNumber");
            return (Criteria) this;
        }

        public Criteria andLockedNumberIn(List<Float> values) {
            addCriterion("Locked_Number in", values, "lockedNumber");
            return (Criteria) this;
        }

        public Criteria andLockedNumberNotIn(List<Float> values) {
            addCriterion("Locked_Number not in", values, "lockedNumber");
            return (Criteria) this;
        }

        public Criteria andLockedNumberBetween(Float value1, Float value2) {
            addCriterion("Locked_Number between", value1, value2, "lockedNumber");
            return (Criteria) this;
        }

        public Criteria andLockedNumberNotBetween(Float value1, Float value2) {
            addCriterion("Locked_Number not between", value1, value2, "lockedNumber");
            return (Criteria) this;
        }

        public Criteria andStockcountIsNull() {
            addCriterion("StockCount is null");
            return (Criteria) this;
        }

        public Criteria andStockcountIsNotNull() {
            addCriterion("StockCount is not null");
            return (Criteria) this;
        }

        public Criteria andStockcountEqualTo(Float value) {
            addCriterion("StockCount =", value, "stockcount");
            return (Criteria) this;
        }

        public Criteria andStockcountNotEqualTo(Float value) {
            addCriterion("StockCount <>", value, "stockcount");
            return (Criteria) this;
        }

        public Criteria andStockcountGreaterThan(Float value) {
            addCriterion("StockCount >", value, "stockcount");
            return (Criteria) this;
        }

        public Criteria andStockcountGreaterThanOrEqualTo(Float value) {
            addCriterion("StockCount >=", value, "stockcount");
            return (Criteria) this;
        }

        public Criteria andStockcountLessThan(Float value) {
            addCriterion("StockCount <", value, "stockcount");
            return (Criteria) this;
        }

        public Criteria andStockcountLessThanOrEqualTo(Float value) {
            addCriterion("StockCount <=", value, "stockcount");
            return (Criteria) this;
        }

        public Criteria andStockcountIn(List<Float> values) {
            addCriterion("StockCount in", values, "stockcount");
            return (Criteria) this;
        }

        public Criteria andStockcountNotIn(List<Float> values) {
            addCriterion("StockCount not in", values, "stockcount");
            return (Criteria) this;
        }

        public Criteria andStockcountBetween(Float value1, Float value2) {
            addCriterion("StockCount between", value1, value2, "stockcount");
            return (Criteria) this;
        }

        public Criteria andStockcountNotBetween(Float value1, Float value2) {
            addCriterion("StockCount not between", value1, value2, "stockcount");
            return (Criteria) this;
        }

        public Criteria andAbledgoodsIsNull() {
            addCriterion("AbledGoods is null");
            return (Criteria) this;
        }

        public Criteria andAbledgoodsIsNotNull() {
            addCriterion("AbledGoods is not null");
            return (Criteria) this;
        }

        public Criteria andAbledgoodsEqualTo(Float value) {
            addCriterion("AbledGoods =", value, "abledgoods");
            return (Criteria) this;
        }

        public Criteria andAbledgoodsNotEqualTo(Float value) {
            addCriterion("AbledGoods <>", value, "abledgoods");
            return (Criteria) this;
        }

        public Criteria andAbledgoodsGreaterThan(Float value) {
            addCriterion("AbledGoods >", value, "abledgoods");
            return (Criteria) this;
        }

        public Criteria andAbledgoodsGreaterThanOrEqualTo(Float value) {
            addCriterion("AbledGoods >=", value, "abledgoods");
            return (Criteria) this;
        }

        public Criteria andAbledgoodsLessThan(Float value) {
            addCriterion("AbledGoods <", value, "abledgoods");
            return (Criteria) this;
        }

        public Criteria andAbledgoodsLessThanOrEqualTo(Float value) {
            addCriterion("AbledGoods <=", value, "abledgoods");
            return (Criteria) this;
        }

        public Criteria andAbledgoodsIn(List<Float> values) {
            addCriterion("AbledGoods in", values, "abledgoods");
            return (Criteria) this;
        }

        public Criteria andAbledgoodsNotIn(List<Float> values) {
            addCriterion("AbledGoods not in", values, "abledgoods");
            return (Criteria) this;
        }

        public Criteria andAbledgoodsBetween(Float value1, Float value2) {
            addCriterion("AbledGoods between", value1, value2, "abledgoods");
            return (Criteria) this;
        }

        public Criteria andAbledgoodsNotBetween(Float value1, Float value2) {
            addCriterion("AbledGoods not between", value1, value2, "abledgoods");
            return (Criteria) this;
        }

        public Criteria andWarnstockIsNull() {
            addCriterion("WarnStock is null");
            return (Criteria) this;
        }

        public Criteria andWarnstockIsNotNull() {
            addCriterion("WarnStock is not null");
            return (Criteria) this;
        }

        public Criteria andWarnstockEqualTo(Float value) {
            addCriterion("WarnStock =", value, "warnstock");
            return (Criteria) this;
        }

        public Criteria andWarnstockNotEqualTo(Float value) {
            addCriterion("WarnStock <>", value, "warnstock");
            return (Criteria) this;
        }

        public Criteria andWarnstockGreaterThan(Float value) {
            addCriterion("WarnStock >", value, "warnstock");
            return (Criteria) this;
        }

        public Criteria andWarnstockGreaterThanOrEqualTo(Float value) {
            addCriterion("WarnStock >=", value, "warnstock");
            return (Criteria) this;
        }

        public Criteria andWarnstockLessThan(Float value) {
            addCriterion("WarnStock <", value, "warnstock");
            return (Criteria) this;
        }

        public Criteria andWarnstockLessThanOrEqualTo(Float value) {
            addCriterion("WarnStock <=", value, "warnstock");
            return (Criteria) this;
        }

        public Criteria andWarnstockIn(List<Float> values) {
            addCriterion("WarnStock in", values, "warnstock");
            return (Criteria) this;
        }

        public Criteria andWarnstockNotIn(List<Float> values) {
            addCriterion("WarnStock not in", values, "warnstock");
            return (Criteria) this;
        }

        public Criteria andWarnstockBetween(Float value1, Float value2) {
            addCriterion("WarnStock between", value1, value2, "warnstock");
            return (Criteria) this;
        }

        public Criteria andWarnstockNotBetween(Float value1, Float value2) {
            addCriterion("WarnStock not between", value1, value2, "warnstock");
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
package cn.hhu.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WmsPackingcontentExample {
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

	public WmsPackingcontentExample() {
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

        public Criteria andPackingcontentIdIsNull() {
            addCriterion("PackingContent_ID is null");
            return (Criteria) this;
        }

        public Criteria andPackingcontentIdIsNotNull() {
            addCriterion("PackingContent_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPackingcontentIdEqualTo(Integer value) {
            addCriterion("PackingContent_ID =", value, "packingcontentId");
            return (Criteria) this;
        }

        public Criteria andPackingcontentIdNotEqualTo(Integer value) {
            addCriterion("PackingContent_ID <>", value, "packingcontentId");
            return (Criteria) this;
        }

        public Criteria andPackingcontentIdGreaterThan(Integer value) {
            addCriterion("PackingContent_ID >", value, "packingcontentId");
            return (Criteria) this;
        }

        public Criteria andPackingcontentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PackingContent_ID >=", value, "packingcontentId");
            return (Criteria) this;
        }

        public Criteria andPackingcontentIdLessThan(Integer value) {
            addCriterion("PackingContent_ID <", value, "packingcontentId");
            return (Criteria) this;
        }

        public Criteria andPackingcontentIdLessThanOrEqualTo(Integer value) {
            addCriterion("PackingContent_ID <=", value, "packingcontentId");
            return (Criteria) this;
        }

        public Criteria andPackingcontentIdIn(List<Integer> values) {
            addCriterion("PackingContent_ID in", values, "packingcontentId");
            return (Criteria) this;
        }

        public Criteria andPackingcontentIdNotIn(List<Integer> values) {
            addCriterion("PackingContent_ID not in", values, "packingcontentId");
            return (Criteria) this;
        }

        public Criteria andPackingcontentIdBetween(Integer value1, Integer value2) {
            addCriterion("PackingContent_ID between", value1, value2, "packingcontentId");
            return (Criteria) this;
        }

        public Criteria andPackingcontentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PackingContent_ID not between", value1, value2, "packingcontentId");
            return (Criteria) this;
        }

        public Criteria andPackingcontentNumberIsNull() {
            addCriterion("PackingContent_Number is null");
            return (Criteria) this;
        }

        public Criteria andPackingcontentNumberIsNotNull() {
            addCriterion("PackingContent_Number is not null");
            return (Criteria) this;
        }

        public Criteria andPackingcontentNumberEqualTo(String value) {
            addCriterion("PackingContent_Number =", value, "packingcontentNumber");
            return (Criteria) this;
        }

        public Criteria andPackingcontentNumberNotEqualTo(String value) {
            addCriterion("PackingContent_Number <>", value, "packingcontentNumber");
            return (Criteria) this;
        }

        public Criteria andPackingcontentNumberGreaterThan(String value) {
            addCriterion("PackingContent_Number >", value, "packingcontentNumber");
            return (Criteria) this;
        }

        public Criteria andPackingcontentNumberGreaterThanOrEqualTo(String value) {
            addCriterion("PackingContent_Number >=", value, "packingcontentNumber");
            return (Criteria) this;
        }

        public Criteria andPackingcontentNumberLessThan(String value) {
            addCriterion("PackingContent_Number <", value, "packingcontentNumber");
            return (Criteria) this;
        }

        public Criteria andPackingcontentNumberLessThanOrEqualTo(String value) {
            addCriterion("PackingContent_Number <=", value, "packingcontentNumber");
            return (Criteria) this;
        }

        public Criteria andPackingcontentNumberLike(String value) {
            addCriterion("PackingContent_Number like", value, "packingcontentNumber");
            return (Criteria) this;
        }

        public Criteria andPackingcontentNumberNotLike(String value) {
            addCriterion("PackingContent_Number not like", value, "packingcontentNumber");
            return (Criteria) this;
        }

        public Criteria andPackingcontentNumberIn(List<String> values) {
            addCriterion("PackingContent_Number in", values, "packingcontentNumber");
            return (Criteria) this;
        }

        public Criteria andPackingcontentNumberNotIn(List<String> values) {
            addCriterion("PackingContent_Number not in", values, "packingcontentNumber");
            return (Criteria) this;
        }

        public Criteria andPackingcontentNumberBetween(String value1, String value2) {
            addCriterion("PackingContent_Number between", value1, value2, "packingcontentNumber");
            return (Criteria) this;
        }

        public Criteria andPackingcontentNumberNotBetween(String value1, String value2) {
            addCriterion("PackingContent_Number not between", value1, value2, "packingcontentNumber");
            return (Criteria) this;
        }

        public Criteria andBoxIdIsNull() {
            addCriterion("Box_ID is null");
            return (Criteria) this;
        }

        public Criteria andBoxIdIsNotNull() {
            addCriterion("Box_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBoxIdEqualTo(Integer value) {
            addCriterion("Box_ID =", value, "boxId");
            return (Criteria) this;
        }

        public Criteria andBoxIdNotEqualTo(Integer value) {
            addCriterion("Box_ID <>", value, "boxId");
            return (Criteria) this;
        }

        public Criteria andBoxIdGreaterThan(Integer value) {
            addCriterion("Box_ID >", value, "boxId");
            return (Criteria) this;
        }

        public Criteria andBoxIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Box_ID >=", value, "boxId");
            return (Criteria) this;
        }

        public Criteria andBoxIdLessThan(Integer value) {
            addCriterion("Box_ID <", value, "boxId");
            return (Criteria) this;
        }

        public Criteria andBoxIdLessThanOrEqualTo(Integer value) {
            addCriterion("Box_ID <=", value, "boxId");
            return (Criteria) this;
        }

        public Criteria andBoxIdIn(List<Integer> values) {
            addCriterion("Box_ID in", values, "boxId");
            return (Criteria) this;
        }

        public Criteria andBoxIdNotIn(List<Integer> values) {
            addCriterion("Box_ID not in", values, "boxId");
            return (Criteria) this;
        }

        public Criteria andBoxIdBetween(Integer value1, Integer value2) {
            addCriterion("Box_ID between", value1, value2, "boxId");
            return (Criteria) this;
        }

        public Criteria andBoxIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Box_ID not between", value1, value2, "boxId");
            return (Criteria) this;
        }

        public Criteria andExdetailIsNull() {
            addCriterion("EXDetail is null");
            return (Criteria) this;
        }

        public Criteria andExdetailIsNotNull() {
            addCriterion("EXDetail is not null");
            return (Criteria) this;
        }

        public Criteria andExdetailEqualTo(Integer value) {
            addCriterion("EXDetail =", value, "exdetail");
            return (Criteria) this;
        }

        public Criteria andExdetailNotEqualTo(Integer value) {
            addCriterion("EXDetail <>", value, "exdetail");
            return (Criteria) this;
        }

        public Criteria andExdetailGreaterThan(Integer value) {
            addCriterion("EXDetail >", value, "exdetail");
            return (Criteria) this;
        }

        public Criteria andExdetailGreaterThanOrEqualTo(Integer value) {
            addCriterion("EXDetail >=", value, "exdetail");
            return (Criteria) this;
        }

        public Criteria andExdetailLessThan(Integer value) {
            addCriterion("EXDetail <", value, "exdetail");
            return (Criteria) this;
        }

        public Criteria andExdetailLessThanOrEqualTo(Integer value) {
            addCriterion("EXDetail <=", value, "exdetail");
            return (Criteria) this;
        }

        public Criteria andExdetailIn(List<Integer> values) {
            addCriterion("EXDetail in", values, "exdetail");
            return (Criteria) this;
        }

        public Criteria andExdetailNotIn(List<Integer> values) {
            addCriterion("EXDetail not in", values, "exdetail");
            return (Criteria) this;
        }

        public Criteria andExdetailBetween(Integer value1, Integer value2) {
            addCriterion("EXDetail between", value1, value2, "exdetail");
            return (Criteria) this;
        }

        public Criteria andExdetailNotBetween(Integer value1, Integer value2) {
            addCriterion("EXDetail not between", value1, value2, "exdetail");
            return (Criteria) this;
        }

        public Criteria andPackingquantityIsNull() {
            addCriterion("PackingQuantity is null");
            return (Criteria) this;
        }

        public Criteria andPackingquantityIsNotNull() {
            addCriterion("PackingQuantity is not null");
            return (Criteria) this;
        }

        public Criteria andPackingquantityEqualTo(Float value) {
            addCriterion("PackingQuantity =", value, "packingquantity");
            return (Criteria) this;
        }

        public Criteria andPackingquantityNotEqualTo(Float value) {
            addCriterion("PackingQuantity <>", value, "packingquantity");
            return (Criteria) this;
        }

        public Criteria andPackingquantityGreaterThan(Float value) {
            addCriterion("PackingQuantity >", value, "packingquantity");
            return (Criteria) this;
        }

        public Criteria andPackingquantityGreaterThanOrEqualTo(Float value) {
            addCriterion("PackingQuantity >=", value, "packingquantity");
            return (Criteria) this;
        }

        public Criteria andPackingquantityLessThan(Float value) {
            addCriterion("PackingQuantity <", value, "packingquantity");
            return (Criteria) this;
        }

        public Criteria andPackingquantityLessThanOrEqualTo(Float value) {
            addCriterion("PackingQuantity <=", value, "packingquantity");
            return (Criteria) this;
        }

        public Criteria andPackingquantityIn(List<Float> values) {
            addCriterion("PackingQuantity in", values, "packingquantity");
            return (Criteria) this;
        }

        public Criteria andPackingquantityNotIn(List<Float> values) {
            addCriterion("PackingQuantity not in", values, "packingquantity");
            return (Criteria) this;
        }

        public Criteria andPackingquantityBetween(Float value1, Float value2) {
            addCriterion("PackingQuantity between", value1, value2, "packingquantity");
            return (Criteria) this;
        }

        public Criteria andPackingquantityNotBetween(Float value1, Float value2) {
            addCriterion("PackingQuantity not between", value1, value2, "packingquantity");
            return (Criteria) this;
        }

        public Criteria andPackinginstructionIsNull() {
            addCriterion("PackingInstruction is null");
            return (Criteria) this;
        }

        public Criteria andPackinginstructionIsNotNull() {
            addCriterion("PackingInstruction is not null");
            return (Criteria) this;
        }

        public Criteria andPackinginstructionEqualTo(String value) {
            addCriterion("PackingInstruction =", value, "packinginstruction");
            return (Criteria) this;
        }

        public Criteria andPackinginstructionNotEqualTo(String value) {
            addCriterion("PackingInstruction <>", value, "packinginstruction");
            return (Criteria) this;
        }

        public Criteria andPackinginstructionGreaterThan(String value) {
            addCriterion("PackingInstruction >", value, "packinginstruction");
            return (Criteria) this;
        }

        public Criteria andPackinginstructionGreaterThanOrEqualTo(String value) {
            addCriterion("PackingInstruction >=", value, "packinginstruction");
            return (Criteria) this;
        }

        public Criteria andPackinginstructionLessThan(String value) {
            addCriterion("PackingInstruction <", value, "packinginstruction");
            return (Criteria) this;
        }

        public Criteria andPackinginstructionLessThanOrEqualTo(String value) {
            addCriterion("PackingInstruction <=", value, "packinginstruction");
            return (Criteria) this;
        }

        public Criteria andPackinginstructionLike(String value) {
            addCriterion("PackingInstruction like", value, "packinginstruction");
            return (Criteria) this;
        }

        public Criteria andPackinginstructionNotLike(String value) {
            addCriterion("PackingInstruction not like", value, "packinginstruction");
            return (Criteria) this;
        }

        public Criteria andPackinginstructionIn(List<String> values) {
            addCriterion("PackingInstruction in", values, "packinginstruction");
            return (Criteria) this;
        }

        public Criteria andPackinginstructionNotIn(List<String> values) {
            addCriterion("PackingInstruction not in", values, "packinginstruction");
            return (Criteria) this;
        }

        public Criteria andPackinginstructionBetween(String value1, String value2) {
            addCriterion("PackingInstruction between", value1, value2, "packinginstruction");
            return (Criteria) this;
        }

        public Criteria andPackinginstructionNotBetween(String value1, String value2) {
            addCriterion("PackingInstruction not between", value1, value2, "packinginstruction");
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
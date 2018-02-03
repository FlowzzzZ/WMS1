package cn.hhu.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WmsSelectboxExample {
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

	public WmsSelectboxExample() {
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

        public Criteria andSelectboxIdIsNull() {
            addCriterion("SelectBox_ID is null");
            return (Criteria) this;
        }

        public Criteria andSelectboxIdIsNotNull() {
            addCriterion("SelectBox_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSelectboxIdEqualTo(Integer value) {
            addCriterion("SelectBox_ID =", value, "selectboxId");
            return (Criteria) this;
        }

        public Criteria andSelectboxIdNotEqualTo(Integer value) {
            addCriterion("SelectBox_ID <>", value, "selectboxId");
            return (Criteria) this;
        }

        public Criteria andSelectboxIdGreaterThan(Integer value) {
            addCriterion("SelectBox_ID >", value, "selectboxId");
            return (Criteria) this;
        }

        public Criteria andSelectboxIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SelectBox_ID >=", value, "selectboxId");
            return (Criteria) this;
        }

        public Criteria andSelectboxIdLessThan(Integer value) {
            addCriterion("SelectBox_ID <", value, "selectboxId");
            return (Criteria) this;
        }

        public Criteria andSelectboxIdLessThanOrEqualTo(Integer value) {
            addCriterion("SelectBox_ID <=", value, "selectboxId");
            return (Criteria) this;
        }

        public Criteria andSelectboxIdIn(List<Integer> values) {
            addCriterion("SelectBox_ID in", values, "selectboxId");
            return (Criteria) this;
        }

        public Criteria andSelectboxIdNotIn(List<Integer> values) {
            addCriterion("SelectBox_ID not in", values, "selectboxId");
            return (Criteria) this;
        }

        public Criteria andSelectboxIdBetween(Integer value1, Integer value2) {
            addCriterion("SelectBox_ID between", value1, value2, "selectboxId");
            return (Criteria) this;
        }

        public Criteria andSelectboxIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SelectBox_ID not between", value1, value2, "selectboxId");
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

        public Criteria andExorderIdIsNull() {
            addCriterion("EXOrder_ID is null");
            return (Criteria) this;
        }

        public Criteria andExorderIdIsNotNull() {
            addCriterion("EXOrder_ID is not null");
            return (Criteria) this;
        }

        public Criteria andExorderIdEqualTo(Integer value) {
            addCriterion("EXOrder_ID =", value, "exorderId");
            return (Criteria) this;
        }

        public Criteria andExorderIdNotEqualTo(Integer value) {
            addCriterion("EXOrder_ID <>", value, "exorderId");
            return (Criteria) this;
        }

        public Criteria andExorderIdGreaterThan(Integer value) {
            addCriterion("EXOrder_ID >", value, "exorderId");
            return (Criteria) this;
        }

        public Criteria andExorderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("EXOrder_ID >=", value, "exorderId");
            return (Criteria) this;
        }

        public Criteria andExorderIdLessThan(Integer value) {
            addCriterion("EXOrder_ID <", value, "exorderId");
            return (Criteria) this;
        }

        public Criteria andExorderIdLessThanOrEqualTo(Integer value) {
            addCriterion("EXOrder_ID <=", value, "exorderId");
            return (Criteria) this;
        }

        public Criteria andExorderIdIn(List<Integer> values) {
            addCriterion("EXOrder_ID in", values, "exorderId");
            return (Criteria) this;
        }

        public Criteria andExorderIdNotIn(List<Integer> values) {
            addCriterion("EXOrder_ID not in", values, "exorderId");
            return (Criteria) this;
        }

        public Criteria andExorderIdBetween(Integer value1, Integer value2) {
            addCriterion("EXOrder_ID between", value1, value2, "exorderId");
            return (Criteria) this;
        }

        public Criteria andExorderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("EXOrder_ID not between", value1, value2, "exorderId");
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
            addCriterion("MakeOrderMAN is null");
            return (Criteria) this;
        }

        public Criteria andMakeordermanIsNotNull() {
            addCriterion("MakeOrderMAN is not null");
            return (Criteria) this;
        }

        public Criteria andMakeordermanEqualTo(Integer value) {
            addCriterion("MakeOrderMAN =", value, "makeorderman");
            return (Criteria) this;
        }

        public Criteria andMakeordermanNotEqualTo(Integer value) {
            addCriterion("MakeOrderMAN <>", value, "makeorderman");
            return (Criteria) this;
        }

        public Criteria andMakeordermanGreaterThan(Integer value) {
            addCriterion("MakeOrderMAN >", value, "makeorderman");
            return (Criteria) this;
        }

        public Criteria andMakeordermanGreaterThanOrEqualTo(Integer value) {
            addCriterion("MakeOrderMAN >=", value, "makeorderman");
            return (Criteria) this;
        }

        public Criteria andMakeordermanLessThan(Integer value) {
            addCriterion("MakeOrderMAN <", value, "makeorderman");
            return (Criteria) this;
        }

        public Criteria andMakeordermanLessThanOrEqualTo(Integer value) {
            addCriterion("MakeOrderMAN <=", value, "makeorderman");
            return (Criteria) this;
        }

        public Criteria andMakeordermanIn(List<Integer> values) {
            addCriterion("MakeOrderMAN in", values, "makeorderman");
            return (Criteria) this;
        }

        public Criteria andMakeordermanNotIn(List<Integer> values) {
            addCriterion("MakeOrderMAN not in", values, "makeorderman");
            return (Criteria) this;
        }

        public Criteria andMakeordermanBetween(Integer value1, Integer value2) {
            addCriterion("MakeOrderMAN between", value1, value2, "makeorderman");
            return (Criteria) this;
        }

        public Criteria andMakeordermanNotBetween(Integer value1, Integer value2) {
            addCriterion("MakeOrderMAN not between", value1, value2, "makeorderman");
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
package cn.hhu.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WmsExcheckExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WmsExcheckExample() {
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

        public Criteria andExcheckIdIsNull() {
            addCriterion("EXCheck_ID is null");
            return (Criteria) this;
        }

        public Criteria andExcheckIdIsNotNull() {
            addCriterion("EXCheck_ID is not null");
            return (Criteria) this;
        }

        public Criteria andExcheckIdEqualTo(Integer value) {
            addCriterion("EXCheck_ID =", value, "excheckId");
            return (Criteria) this;
        }

        public Criteria andExcheckIdNotEqualTo(Integer value) {
            addCriterion("EXCheck_ID <>", value, "excheckId");
            return (Criteria) this;
        }

        public Criteria andExcheckIdGreaterThan(Integer value) {
            addCriterion("EXCheck_ID >", value, "excheckId");
            return (Criteria) this;
        }

        public Criteria andExcheckIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("EXCheck_ID >=", value, "excheckId");
            return (Criteria) this;
        }

        public Criteria andExcheckIdLessThan(Integer value) {
            addCriterion("EXCheck_ID <", value, "excheckId");
            return (Criteria) this;
        }

        public Criteria andExcheckIdLessThanOrEqualTo(Integer value) {
            addCriterion("EXCheck_ID <=", value, "excheckId");
            return (Criteria) this;
        }

        public Criteria andExcheckIdIn(List<Integer> values) {
            addCriterion("EXCheck_ID in", values, "excheckId");
            return (Criteria) this;
        }

        public Criteria andExcheckIdNotIn(List<Integer> values) {
            addCriterion("EXCheck_ID not in", values, "excheckId");
            return (Criteria) this;
        }

        public Criteria andExcheckIdBetween(Integer value1, Integer value2) {
            addCriterion("EXCheck_ID between", value1, value2, "excheckId");
            return (Criteria) this;
        }

        public Criteria andExcheckIdNotBetween(Integer value1, Integer value2) {
            addCriterion("EXCheck_ID not between", value1, value2, "excheckId");
            return (Criteria) this;
        }

        public Criteria andExcheckNumberIsNull() {
            addCriterion("EXCheck_Number is null");
            return (Criteria) this;
        }

        public Criteria andExcheckNumberIsNotNull() {
            addCriterion("EXCheck_Number is not null");
            return (Criteria) this;
        }

        public Criteria andExcheckNumberEqualTo(String value) {
            addCriterion("EXCheck_Number =", value, "excheckNumber");
            return (Criteria) this;
        }

        public Criteria andExcheckNumberNotEqualTo(String value) {
            addCriterion("EXCheck_Number <>", value, "excheckNumber");
            return (Criteria) this;
        }

        public Criteria andExcheckNumberGreaterThan(String value) {
            addCriterion("EXCheck_Number >", value, "excheckNumber");
            return (Criteria) this;
        }

        public Criteria andExcheckNumberGreaterThanOrEqualTo(String value) {
            addCriterion("EXCheck_Number >=", value, "excheckNumber");
            return (Criteria) this;
        }

        public Criteria andExcheckNumberLessThan(String value) {
            addCriterion("EXCheck_Number <", value, "excheckNumber");
            return (Criteria) this;
        }

        public Criteria andExcheckNumberLessThanOrEqualTo(String value) {
            addCriterion("EXCheck_Number <=", value, "excheckNumber");
            return (Criteria) this;
        }

        public Criteria andExcheckNumberLike(String value) {
            addCriterion("EXCheck_Number like", value, "excheckNumber");
            return (Criteria) this;
        }

        public Criteria andExcheckNumberNotLike(String value) {
            addCriterion("EXCheck_Number not like", value, "excheckNumber");
            return (Criteria) this;
        }

        public Criteria andExcheckNumberIn(List<String> values) {
            addCriterion("EXCheck_Number in", values, "excheckNumber");
            return (Criteria) this;
        }

        public Criteria andExcheckNumberNotIn(List<String> values) {
            addCriterion("EXCheck_Number not in", values, "excheckNumber");
            return (Criteria) this;
        }

        public Criteria andExcheckNumberBetween(String value1, String value2) {
            addCriterion("EXCheck_Number between", value1, value2, "excheckNumber");
            return (Criteria) this;
        }

        public Criteria andExcheckNumberNotBetween(String value1, String value2) {
            addCriterion("EXCheck_Number not between", value1, value2, "excheckNumber");
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

        public Criteria andCheckquantityIsNull() {
            addCriterion("CheckQuantity is null");
            return (Criteria) this;
        }

        public Criteria andCheckquantityIsNotNull() {
            addCriterion("CheckQuantity is not null");
            return (Criteria) this;
        }

        public Criteria andCheckquantityEqualTo(Float value) {
            addCriterion("CheckQuantity =", value, "checkquantity");
            return (Criteria) this;
        }

        public Criteria andCheckquantityNotEqualTo(Float value) {
            addCriterion("CheckQuantity <>", value, "checkquantity");
            return (Criteria) this;
        }

        public Criteria andCheckquantityGreaterThan(Float value) {
            addCriterion("CheckQuantity >", value, "checkquantity");
            return (Criteria) this;
        }

        public Criteria andCheckquantityGreaterThanOrEqualTo(Float value) {
            addCriterion("CheckQuantity >=", value, "checkquantity");
            return (Criteria) this;
        }

        public Criteria andCheckquantityLessThan(Float value) {
            addCriterion("CheckQuantity <", value, "checkquantity");
            return (Criteria) this;
        }

        public Criteria andCheckquantityLessThanOrEqualTo(Float value) {
            addCriterion("CheckQuantity <=", value, "checkquantity");
            return (Criteria) this;
        }

        public Criteria andCheckquantityIn(List<Float> values) {
            addCriterion("CheckQuantity in", values, "checkquantity");
            return (Criteria) this;
        }

        public Criteria andCheckquantityNotIn(List<Float> values) {
            addCriterion("CheckQuantity not in", values, "checkquantity");
            return (Criteria) this;
        }

        public Criteria andCheckquantityBetween(Float value1, Float value2) {
            addCriterion("CheckQuantity between", value1, value2, "checkquantity");
            return (Criteria) this;
        }

        public Criteria andCheckquantityNotBetween(Float value1, Float value2) {
            addCriterion("CheckQuantity not between", value1, value2, "checkquantity");
            return (Criteria) this;
        }

        public Criteria andCheckresultIsNull() {
            addCriterion("CheckResult is null");
            return (Criteria) this;
        }

        public Criteria andCheckresultIsNotNull() {
            addCriterion("CheckResult is not null");
            return (Criteria) this;
        }

        public Criteria andCheckresultEqualTo(Integer value) {
            addCriterion("CheckResult =", value, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultNotEqualTo(Integer value) {
            addCriterion("CheckResult <>", value, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultGreaterThan(Integer value) {
            addCriterion("CheckResult >", value, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultGreaterThanOrEqualTo(Integer value) {
            addCriterion("CheckResult >=", value, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultLessThan(Integer value) {
            addCriterion("CheckResult <", value, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultLessThanOrEqualTo(Integer value) {
            addCriterion("CheckResult <=", value, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultIn(List<Integer> values) {
            addCriterion("CheckResult in", values, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultNotIn(List<Integer> values) {
            addCriterion("CheckResult not in", values, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultBetween(Integer value1, Integer value2) {
            addCriterion("CheckResult between", value1, value2, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultNotBetween(Integer value1, Integer value2) {
            addCriterion("CheckResult not between", value1, value2, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckmanIsNull() {
            addCriterion("CheckMan is null");
            return (Criteria) this;
        }

        public Criteria andCheckmanIsNotNull() {
            addCriterion("CheckMan is not null");
            return (Criteria) this;
        }

        public Criteria andCheckmanEqualTo(String value) {
            addCriterion("CheckMan =", value, "checkman");
            return (Criteria) this;
        }

        public Criteria andCheckmanNotEqualTo(String value) {
            addCriterion("CheckMan <>", value, "checkman");
            return (Criteria) this;
        }

        public Criteria andCheckmanGreaterThan(String value) {
            addCriterion("CheckMan >", value, "checkman");
            return (Criteria) this;
        }

        public Criteria andCheckmanGreaterThanOrEqualTo(String value) {
            addCriterion("CheckMan >=", value, "checkman");
            return (Criteria) this;
        }

        public Criteria andCheckmanLessThan(String value) {
            addCriterion("CheckMan <", value, "checkman");
            return (Criteria) this;
        }

        public Criteria andCheckmanLessThanOrEqualTo(String value) {
            addCriterion("CheckMan <=", value, "checkman");
            return (Criteria) this;
        }

        public Criteria andCheckmanLike(String value) {
            addCriterion("CheckMan like", value, "checkman");
            return (Criteria) this;
        }

        public Criteria andCheckmanNotLike(String value) {
            addCriterion("CheckMan not like", value, "checkman");
            return (Criteria) this;
        }

        public Criteria andCheckmanIn(List<String> values) {
            addCriterion("CheckMan in", values, "checkman");
            return (Criteria) this;
        }

        public Criteria andCheckmanNotIn(List<String> values) {
            addCriterion("CheckMan not in", values, "checkman");
            return (Criteria) this;
        }

        public Criteria andCheckmanBetween(String value1, String value2) {
            addCriterion("CheckMan between", value1, value2, "checkman");
            return (Criteria) this;
        }

        public Criteria andCheckmanNotBetween(String value1, String value2) {
            addCriterion("CheckMan not between", value1, value2, "checkman");
            return (Criteria) this;
        }

        public Criteria andCheckinstructionIsNull() {
            addCriterion("CheckInstruction is null");
            return (Criteria) this;
        }

        public Criteria andCheckinstructionIsNotNull() {
            addCriterion("CheckInstruction is not null");
            return (Criteria) this;
        }

        public Criteria andCheckinstructionEqualTo(String value) {
            addCriterion("CheckInstruction =", value, "checkinstruction");
            return (Criteria) this;
        }

        public Criteria andCheckinstructionNotEqualTo(String value) {
            addCriterion("CheckInstruction <>", value, "checkinstruction");
            return (Criteria) this;
        }

        public Criteria andCheckinstructionGreaterThan(String value) {
            addCriterion("CheckInstruction >", value, "checkinstruction");
            return (Criteria) this;
        }

        public Criteria andCheckinstructionGreaterThanOrEqualTo(String value) {
            addCriterion("CheckInstruction >=", value, "checkinstruction");
            return (Criteria) this;
        }

        public Criteria andCheckinstructionLessThan(String value) {
            addCriterion("CheckInstruction <", value, "checkinstruction");
            return (Criteria) this;
        }

        public Criteria andCheckinstructionLessThanOrEqualTo(String value) {
            addCriterion("CheckInstruction <=", value, "checkinstruction");
            return (Criteria) this;
        }

        public Criteria andCheckinstructionLike(String value) {
            addCriterion("CheckInstruction like", value, "checkinstruction");
            return (Criteria) this;
        }

        public Criteria andCheckinstructionNotLike(String value) {
            addCriterion("CheckInstruction not like", value, "checkinstruction");
            return (Criteria) this;
        }

        public Criteria andCheckinstructionIn(List<String> values) {
            addCriterion("CheckInstruction in", values, "checkinstruction");
            return (Criteria) this;
        }

        public Criteria andCheckinstructionNotIn(List<String> values) {
            addCriterion("CheckInstruction not in", values, "checkinstruction");
            return (Criteria) this;
        }

        public Criteria andCheckinstructionBetween(String value1, String value2) {
            addCriterion("CheckInstruction between", value1, value2, "checkinstruction");
            return (Criteria) this;
        }

        public Criteria andCheckinstructionNotBetween(String value1, String value2) {
            addCriterion("CheckInstruction not between", value1, value2, "checkinstruction");
            return (Criteria) this;
        }

        public Criteria andCheckstateIsNull() {
            addCriterion("CheckState is null");
            return (Criteria) this;
        }

        public Criteria andCheckstateIsNotNull() {
            addCriterion("CheckState is not null");
            return (Criteria) this;
        }

        public Criteria andCheckstateEqualTo(Integer value) {
            addCriterion("CheckState =", value, "checkstate");
            return (Criteria) this;
        }

        public Criteria andCheckstateNotEqualTo(Integer value) {
            addCriterion("CheckState <>", value, "checkstate");
            return (Criteria) this;
        }

        public Criteria andCheckstateGreaterThan(Integer value) {
            addCriterion("CheckState >", value, "checkstate");
            return (Criteria) this;
        }

        public Criteria andCheckstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("CheckState >=", value, "checkstate");
            return (Criteria) this;
        }

        public Criteria andCheckstateLessThan(Integer value) {
            addCriterion("CheckState <", value, "checkstate");
            return (Criteria) this;
        }

        public Criteria andCheckstateLessThanOrEqualTo(Integer value) {
            addCriterion("CheckState <=", value, "checkstate");
            return (Criteria) this;
        }

        public Criteria andCheckstateIn(List<Integer> values) {
            addCriterion("CheckState in", values, "checkstate");
            return (Criteria) this;
        }

        public Criteria andCheckstateNotIn(List<Integer> values) {
            addCriterion("CheckState not in", values, "checkstate");
            return (Criteria) this;
        }

        public Criteria andCheckstateBetween(Integer value1, Integer value2) {
            addCriterion("CheckState between", value1, value2, "checkstate");
            return (Criteria) this;
        }

        public Criteria andCheckstateNotBetween(Integer value1, Integer value2) {
            addCriterion("CheckState not between", value1, value2, "checkstate");
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
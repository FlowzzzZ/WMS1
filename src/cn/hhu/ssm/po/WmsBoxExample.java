package cn.hhu.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WmsBoxExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WmsBoxExample() {
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

        public Criteria andBoxNumberIsNull() {
            addCriterion("Box_Number is null");
            return (Criteria) this;
        }

        public Criteria andBoxNumberIsNotNull() {
            addCriterion("Box_Number is not null");
            return (Criteria) this;
        }

        public Criteria andBoxNumberEqualTo(String value) {
            addCriterion("Box_Number =", value, "boxNumber");
            return (Criteria) this;
        }

        public Criteria andBoxNumberNotEqualTo(String value) {
            addCriterion("Box_Number <>", value, "boxNumber");
            return (Criteria) this;
        }

        public Criteria andBoxNumberGreaterThan(String value) {
            addCriterion("Box_Number >", value, "boxNumber");
            return (Criteria) this;
        }

        public Criteria andBoxNumberGreaterThanOrEqualTo(String value) {
            addCriterion("Box_Number >=", value, "boxNumber");
            return (Criteria) this;
        }

        public Criteria andBoxNumberLessThan(String value) {
            addCriterion("Box_Number <", value, "boxNumber");
            return (Criteria) this;
        }

        public Criteria andBoxNumberLessThanOrEqualTo(String value) {
            addCriterion("Box_Number <=", value, "boxNumber");
            return (Criteria) this;
        }

        public Criteria andBoxNumberLike(String value) {
            addCriterion("Box_Number like", value, "boxNumber");
            return (Criteria) this;
        }

        public Criteria andBoxNumberNotLike(String value) {
            addCriterion("Box_Number not like", value, "boxNumber");
            return (Criteria) this;
        }

        public Criteria andBoxNumberIn(List<String> values) {
            addCriterion("Box_Number in", values, "boxNumber");
            return (Criteria) this;
        }

        public Criteria andBoxNumberNotIn(List<String> values) {
            addCriterion("Box_Number not in", values, "boxNumber");
            return (Criteria) this;
        }

        public Criteria andBoxNumberBetween(String value1, String value2) {
            addCriterion("Box_Number between", value1, value2, "boxNumber");
            return (Criteria) this;
        }

        public Criteria andBoxNumberNotBetween(String value1, String value2) {
            addCriterion("Box_Number not between", value1, value2, "boxNumber");
            return (Criteria) this;
        }

        public Criteria andBoxtypeIsNull() {
            addCriterion("BoxType is null");
            return (Criteria) this;
        }

        public Criteria andBoxtypeIsNotNull() {
            addCriterion("BoxType is not null");
            return (Criteria) this;
        }

        public Criteria andBoxtypeEqualTo(Integer value) {
            addCriterion("BoxType =", value, "boxtype");
            return (Criteria) this;
        }

        public Criteria andBoxtypeNotEqualTo(Integer value) {
            addCriterion("BoxType <>", value, "boxtype");
            return (Criteria) this;
        }

        public Criteria andBoxtypeGreaterThan(Integer value) {
            addCriterion("BoxType >", value, "boxtype");
            return (Criteria) this;
        }

        public Criteria andBoxtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("BoxType >=", value, "boxtype");
            return (Criteria) this;
        }

        public Criteria andBoxtypeLessThan(Integer value) {
            addCriterion("BoxType <", value, "boxtype");
            return (Criteria) this;
        }

        public Criteria andBoxtypeLessThanOrEqualTo(Integer value) {
            addCriterion("BoxType <=", value, "boxtype");
            return (Criteria) this;
        }

        public Criteria andBoxtypeIn(List<Integer> values) {
            addCriterion("BoxType in", values, "boxtype");
            return (Criteria) this;
        }

        public Criteria andBoxtypeNotIn(List<Integer> values) {
            addCriterion("BoxType not in", values, "boxtype");
            return (Criteria) this;
        }

        public Criteria andBoxtypeBetween(Integer value1, Integer value2) {
            addCriterion("BoxType between", value1, value2, "boxtype");
            return (Criteria) this;
        }

        public Criteria andBoxtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("BoxType not between", value1, value2, "boxtype");
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

        public Criteria andStateIsNull() {
            addCriterion("State is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("State is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("State =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("State <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("State >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("State >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("State <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("State <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("State in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("State not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("State between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("State not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNull() {
            addCriterion("StartTime is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("StartTime is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(Date value) {
            addCriterion("StartTime =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(Date value) {
            addCriterion("StartTime <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(Date value) {
            addCriterion("StartTime >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("StartTime >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(Date value) {
            addCriterion("StartTime <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(Date value) {
            addCriterion("StartTime <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<Date> values) {
            addCriterion("StartTime in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<Date> values) {
            addCriterion("StartTime not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(Date value1, Date value2) {
            addCriterion("StartTime between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(Date value1, Date value2) {
            addCriterion("StartTime not between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("EndTime is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("EndTime is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(Date value) {
            addCriterion("EndTime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(Date value) {
            addCriterion("EndTime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(Date value) {
            addCriterion("EndTime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("EndTime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(Date value) {
            addCriterion("EndTime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("EndTime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<Date> values) {
            addCriterion("EndTime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<Date> values) {
            addCriterion("EndTime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(Date value1, Date value2) {
            addCriterion("EndTime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("EndTime not between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andIsoccupiedIsNull() {
            addCriterion("IsOccupied is null");
            return (Criteria) this;
        }

        public Criteria andIsoccupiedIsNotNull() {
            addCriterion("IsOccupied is not null");
            return (Criteria) this;
        }

        public Criteria andIsoccupiedEqualTo(Integer value) {
            addCriterion("IsOccupied =", value, "isoccupied");
            return (Criteria) this;
        }

        public Criteria andIsoccupiedNotEqualTo(Integer value) {
            addCriterion("IsOccupied <>", value, "isoccupied");
            return (Criteria) this;
        }

        public Criteria andIsoccupiedGreaterThan(Integer value) {
            addCriterion("IsOccupied >", value, "isoccupied");
            return (Criteria) this;
        }

        public Criteria andIsoccupiedGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsOccupied >=", value, "isoccupied");
            return (Criteria) this;
        }

        public Criteria andIsoccupiedLessThan(Integer value) {
            addCriterion("IsOccupied <", value, "isoccupied");
            return (Criteria) this;
        }

        public Criteria andIsoccupiedLessThanOrEqualTo(Integer value) {
            addCriterion("IsOccupied <=", value, "isoccupied");
            return (Criteria) this;
        }

        public Criteria andIsoccupiedIn(List<Integer> values) {
            addCriterion("IsOccupied in", values, "isoccupied");
            return (Criteria) this;
        }

        public Criteria andIsoccupiedNotIn(List<Integer> values) {
            addCriterion("IsOccupied not in", values, "isoccupied");
            return (Criteria) this;
        }

        public Criteria andIsoccupiedBetween(Integer value1, Integer value2) {
            addCriterion("IsOccupied between", value1, value2, "isoccupied");
            return (Criteria) this;
        }

        public Criteria andIsoccupiedNotBetween(Integer value1, Integer value2) {
            addCriterion("IsOccupied not between", value1, value2, "isoccupied");
            return (Criteria) this;
        }

        public Criteria andIsturnedIsNull() {
            addCriterion("IsTurned is null");
            return (Criteria) this;
        }

        public Criteria andIsturnedIsNotNull() {
            addCriterion("IsTurned is not null");
            return (Criteria) this;
        }

        public Criteria andIsturnedEqualTo(Integer value) {
            addCriterion("IsTurned =", value, "isturned");
            return (Criteria) this;
        }

        public Criteria andIsturnedNotEqualTo(Integer value) {
            addCriterion("IsTurned <>", value, "isturned");
            return (Criteria) this;
        }

        public Criteria andIsturnedGreaterThan(Integer value) {
            addCriterion("IsTurned >", value, "isturned");
            return (Criteria) this;
        }

        public Criteria andIsturnedGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsTurned >=", value, "isturned");
            return (Criteria) this;
        }

        public Criteria andIsturnedLessThan(Integer value) {
            addCriterion("IsTurned <", value, "isturned");
            return (Criteria) this;
        }

        public Criteria andIsturnedLessThanOrEqualTo(Integer value) {
            addCriterion("IsTurned <=", value, "isturned");
            return (Criteria) this;
        }

        public Criteria andIsturnedIn(List<Integer> values) {
            addCriterion("IsTurned in", values, "isturned");
            return (Criteria) this;
        }

        public Criteria andIsturnedNotIn(List<Integer> values) {
            addCriterion("IsTurned not in", values, "isturned");
            return (Criteria) this;
        }

        public Criteria andIsturnedBetween(Integer value1, Integer value2) {
            addCriterion("IsTurned between", value1, value2, "isturned");
            return (Criteria) this;
        }

        public Criteria andIsturnedNotBetween(Integer value1, Integer value2) {
            addCriterion("IsTurned not between", value1, value2, "isturned");
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
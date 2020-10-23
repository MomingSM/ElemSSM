package org.dennis.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoodsTypesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsTypesExample() {
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

        public Criteria andGtypIdIsNull() {
            addCriterion("gtyp_id is null");
            return (Criteria) this;
        }

        public Criteria andGtypIdIsNotNull() {
            addCriterion("gtyp_id is not null");
            return (Criteria) this;
        }

        public Criteria andGtypIdEqualTo(Integer value) {
            addCriterion("gtyp_id =", value, "gtypId");
            return (Criteria) this;
        }

        public Criteria andGtypIdNotEqualTo(Integer value) {
            addCriterion("gtyp_id <>", value, "gtypId");
            return (Criteria) this;
        }

        public Criteria andGtypIdGreaterThan(Integer value) {
            addCriterion("gtyp_id >", value, "gtypId");
            return (Criteria) this;
        }

        public Criteria andGtypIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("gtyp_id >=", value, "gtypId");
            return (Criteria) this;
        }

        public Criteria andGtypIdLessThan(Integer value) {
            addCriterion("gtyp_id <", value, "gtypId");
            return (Criteria) this;
        }

        public Criteria andGtypIdLessThanOrEqualTo(Integer value) {
            addCriterion("gtyp_id <=", value, "gtypId");
            return (Criteria) this;
        }

        public Criteria andGtypIdIn(List<Integer> values) {
            addCriterion("gtyp_id in", values, "gtypId");
            return (Criteria) this;
        }

        public Criteria andGtypIdNotIn(List<Integer> values) {
            addCriterion("gtyp_id not in", values, "gtypId");
            return (Criteria) this;
        }

        public Criteria andGtypIdBetween(Integer value1, Integer value2) {
            addCriterion("gtyp_id between", value1, value2, "gtypId");
            return (Criteria) this;
        }

        public Criteria andGtypIdNotBetween(Integer value1, Integer value2) {
            addCriterion("gtyp_id not between", value1, value2, "gtypId");
            return (Criteria) this;
        }

        public Criteria andGtypNameIsNull() {
            addCriterion("gtyp_name is null");
            return (Criteria) this;
        }

        public Criteria andGtypNameIsNotNull() {
            addCriterion("gtyp_name is not null");
            return (Criteria) this;
        }

        public Criteria andGtypNameEqualTo(String value) {
            addCriterion("gtyp_name =", value, "gtypName");
            return (Criteria) this;
        }

        public Criteria andGtypNameNotEqualTo(String value) {
            addCriterion("gtyp_name <>", value, "gtypName");
            return (Criteria) this;
        }

        public Criteria andGtypNameGreaterThan(String value) {
            addCriterion("gtyp_name >", value, "gtypName");
            return (Criteria) this;
        }

        public Criteria andGtypNameGreaterThanOrEqualTo(String value) {
            addCriterion("gtyp_name >=", value, "gtypName");
            return (Criteria) this;
        }

        public Criteria andGtypNameLessThan(String value) {
            addCriterion("gtyp_name <", value, "gtypName");
            return (Criteria) this;
        }

        public Criteria andGtypNameLessThanOrEqualTo(String value) {
            addCriterion("gtyp_name <=", value, "gtypName");
            return (Criteria) this;
        }

        public Criteria andGtypNameLike(String value) {
            addCriterion("gtyp_name like", value, "gtypName");
            return (Criteria) this;
        }

        public Criteria andGtypNameNotLike(String value) {
            addCriterion("gtyp_name not like", value, "gtypName");
            return (Criteria) this;
        }

        public Criteria andGtypNameIn(List<String> values) {
            addCriterion("gtyp_name in", values, "gtypName");
            return (Criteria) this;
        }

        public Criteria andGtypNameNotIn(List<String> values) {
            addCriterion("gtyp_name not in", values, "gtypName");
            return (Criteria) this;
        }

        public Criteria andGtypNameBetween(String value1, String value2) {
            addCriterion("gtyp_name between", value1, value2, "gtypName");
            return (Criteria) this;
        }

        public Criteria andGtypNameNotBetween(String value1, String value2) {
            addCriterion("gtyp_name not between", value1, value2, "gtypName");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNull() {
            addCriterion("add_time is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("add_time is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(Date value) {
            addCriterion("add_time =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(Date value) {
            addCriterion("add_time <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(Date value) {
            addCriterion("add_time >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("add_time >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(Date value) {
            addCriterion("add_time <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("add_time <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<Date> values) {
            addCriterion("add_time in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<Date> values) {
            addCriterion("add_time not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(Date value1, Date value2) {
            addCriterion("add_time between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("add_time not between", value1, value2, "addTime");
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
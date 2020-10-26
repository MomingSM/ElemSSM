package org.dennis.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoodsinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsinfoExample() {
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

        public Criteria andGinfoIdIsNull() {
            addCriterion("ginfo_id is null");
            return (Criteria) this;
        }

        public Criteria andGinfoIdIsNotNull() {
            addCriterion("ginfo_id is not null");
            return (Criteria) this;
        }

        public Criteria andGinfoIdEqualTo(Integer value) {
            addCriterion("ginfo_id =", value, "ginfoId");
            return (Criteria) this;
        }

        public Criteria andGinfoIdNotEqualTo(Integer value) {
            addCriterion("ginfo_id <>", value, "ginfoId");
            return (Criteria) this;
        }

        public Criteria andGinfoIdGreaterThan(Integer value) {
            addCriterion("ginfo_id >", value, "ginfoId");
            return (Criteria) this;
        }

        public Criteria andGinfoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ginfo_id >=", value, "ginfoId");
            return (Criteria) this;
        }

        public Criteria andGinfoIdLessThan(Integer value) {
            addCriterion("ginfo_id <", value, "ginfoId");
            return (Criteria) this;
        }

        public Criteria andGinfoIdLessThanOrEqualTo(Integer value) {
            addCriterion("ginfo_id <=", value, "ginfoId");
            return (Criteria) this;
        }

        public Criteria andGinfoIdIn(List<Integer> values) {
            addCriterion("ginfo_id in", values, "ginfoId");
            return (Criteria) this;
        }

        public Criteria andGinfoIdNotIn(List<Integer> values) {
            addCriterion("ginfo_id not in", values, "ginfoId");
            return (Criteria) this;
        }

        public Criteria andGinfoIdBetween(Integer value1, Integer value2) {
            addCriterion("ginfo_id between", value1, value2, "ginfoId");
            return (Criteria) this;
        }

        public Criteria andGinfoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ginfo_id not between", value1, value2, "ginfoId");
            return (Criteria) this;
        }

        public Criteria andGinfoNameIsNull() {
            addCriterion("ginfo_name is null");
            return (Criteria) this;
        }

        public Criteria andGinfoNameIsNotNull() {
            addCriterion("ginfo_name is not null");
            return (Criteria) this;
        }

        public Criteria andGinfoNameEqualTo(String value) {
            addCriterion("ginfo_name =", value, "ginfoName");
            return (Criteria) this;
        }

        public Criteria andGinfoNameNotEqualTo(String value) {
            addCriterion("ginfo_name <>", value, "ginfoName");
            return (Criteria) this;
        }

        public Criteria andGinfoNameGreaterThan(String value) {
            addCriterion("ginfo_name >", value, "ginfoName");
            return (Criteria) this;
        }

        public Criteria andGinfoNameGreaterThanOrEqualTo(String value) {
            addCriterion("ginfo_name >=", value, "ginfoName");
            return (Criteria) this;
        }

        public Criteria andGinfoNameLessThan(String value) {
            addCriterion("ginfo_name <", value, "ginfoName");
            return (Criteria) this;
        }

        public Criteria andGinfoNameLessThanOrEqualTo(String value) {
            addCriterion("ginfo_name <=", value, "ginfoName");
            return (Criteria) this;
        }

        public Criteria andGinfoNameLike(String value) {
            addCriterion("ginfo_name like", value, "ginfoName");
            return (Criteria) this;
        }

        public Criteria andGinfoNameNotLike(String value) {
            addCriterion("ginfo_name not like", value, "ginfoName");
            return (Criteria) this;
        }

        public Criteria andGinfoNameIn(List<String> values) {
            addCriterion("ginfo_name in", values, "ginfoName");
            return (Criteria) this;
        }

        public Criteria andGinfoNameNotIn(List<String> values) {
            addCriterion("ginfo_name not in", values, "ginfoName");
            return (Criteria) this;
        }

        public Criteria andGinfoNameBetween(String value1, String value2) {
            addCriterion("ginfo_name between", value1, value2, "ginfoName");
            return (Criteria) this;
        }

        public Criteria andGinfoNameNotBetween(String value1, String value2) {
            addCriterion("ginfo_name not between", value1, value2, "ginfoName");
            return (Criteria) this;
        }

        public Criteria andGinfoPhotoIsNull() {
            addCriterion("ginfo_photo is null");
            return (Criteria) this;
        }

        public Criteria andGinfoPhotoIsNotNull() {
            addCriterion("ginfo_photo is not null");
            return (Criteria) this;
        }

        public Criteria andGinfoPhotoEqualTo(String value) {
            addCriterion("ginfo_photo =", value, "ginfoPhoto");
            return (Criteria) this;
        }

        public Criteria andGinfoPhotoNotEqualTo(String value) {
            addCriterion("ginfo_photo <>", value, "ginfoPhoto");
            return (Criteria) this;
        }

        public Criteria andGinfoPhotoGreaterThan(String value) {
            addCriterion("ginfo_photo >", value, "ginfoPhoto");
            return (Criteria) this;
        }

        public Criteria andGinfoPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("ginfo_photo >=", value, "ginfoPhoto");
            return (Criteria) this;
        }

        public Criteria andGinfoPhotoLessThan(String value) {
            addCriterion("ginfo_photo <", value, "ginfoPhoto");
            return (Criteria) this;
        }

        public Criteria andGinfoPhotoLessThanOrEqualTo(String value) {
            addCriterion("ginfo_photo <=", value, "ginfoPhoto");
            return (Criteria) this;
        }

        public Criteria andGinfoPhotoLike(String value) {
            addCriterion("ginfo_photo like", value, "ginfoPhoto");
            return (Criteria) this;
        }

        public Criteria andGinfoPhotoNotLike(String value) {
            addCriterion("ginfo_photo not like", value, "ginfoPhoto");
            return (Criteria) this;
        }

        public Criteria andGinfoPhotoIn(List<String> values) {
            addCriterion("ginfo_photo in", values, "ginfoPhoto");
            return (Criteria) this;
        }

        public Criteria andGinfoPhotoNotIn(List<String> values) {
            addCriterion("ginfo_photo not in", values, "ginfoPhoto");
            return (Criteria) this;
        }

        public Criteria andGinfoPhotoBetween(String value1, String value2) {
            addCriterion("ginfo_photo between", value1, value2, "ginfoPhoto");
            return (Criteria) this;
        }

        public Criteria andGinfoPhotoNotBetween(String value1, String value2) {
            addCriterion("ginfo_photo not between", value1, value2, "ginfoPhoto");
            return (Criteria) this;
        }

        public Criteria andGinfoDesIsNull() {
            addCriterion("ginfo_des is null");
            return (Criteria) this;
        }

        public Criteria andGinfoDesIsNotNull() {
            addCriterion("ginfo_des is not null");
            return (Criteria) this;
        }

        public Criteria andGinfoDesEqualTo(String value) {
            addCriterion("ginfo_des =", value, "ginfoDes");
            return (Criteria) this;
        }

        public Criteria andGinfoDesNotEqualTo(String value) {
            addCriterion("ginfo_des <>", value, "ginfoDes");
            return (Criteria) this;
        }

        public Criteria andGinfoDesGreaterThan(String value) {
            addCriterion("ginfo_des >", value, "ginfoDes");
            return (Criteria) this;
        }

        public Criteria andGinfoDesGreaterThanOrEqualTo(String value) {
            addCriterion("ginfo_des >=", value, "ginfoDes");
            return (Criteria) this;
        }

        public Criteria andGinfoDesLessThan(String value) {
            addCriterion("ginfo_des <", value, "ginfoDes");
            return (Criteria) this;
        }

        public Criteria andGinfoDesLessThanOrEqualTo(String value) {
            addCriterion("ginfo_des <=", value, "ginfoDes");
            return (Criteria) this;
        }

        public Criteria andGinfoDesLike(String value) {
            addCriterion("ginfo_des like", value, "ginfoDes");
            return (Criteria) this;
        }

        public Criteria andGinfoDesNotLike(String value) {
            addCriterion("ginfo_des not like", value, "ginfoDes");
            return (Criteria) this;
        }

        public Criteria andGinfoDesIn(List<String> values) {
            addCriterion("ginfo_des in", values, "ginfoDes");
            return (Criteria) this;
        }

        public Criteria andGinfoDesNotIn(List<String> values) {
            addCriterion("ginfo_des not in", values, "ginfoDes");
            return (Criteria) this;
        }

        public Criteria andGinfoDesBetween(String value1, String value2) {
            addCriterion("ginfo_des between", value1, value2, "ginfoDes");
            return (Criteria) this;
        }

        public Criteria andGinfoDesNotBetween(String value1, String value2) {
            addCriterion("ginfo_des not between", value1, value2, "ginfoDes");
            return (Criteria) this;
        }

        public Criteria andGinfoPriceIsNull() {
            addCriterion("ginfo_price is null");
            return (Criteria) this;
        }

        public Criteria andGinfoPriceIsNotNull() {
            addCriterion("ginfo_price is not null");
            return (Criteria) this;
        }

        public Criteria andGinfoPriceEqualTo(Double value) {
            addCriterion("ginfo_price =", value, "ginfoPrice");
            return (Criteria) this;
        }

        public Criteria andGinfoPriceNotEqualTo(Double value) {
            addCriterion("ginfo_price <>", value, "ginfoPrice");
            return (Criteria) this;
        }

        public Criteria andGinfoPriceGreaterThan(Double value) {
            addCriterion("ginfo_price >", value, "ginfoPrice");
            return (Criteria) this;
        }

        public Criteria andGinfoPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("ginfo_price >=", value, "ginfoPrice");
            return (Criteria) this;
        }

        public Criteria andGinfoPriceLessThan(Double value) {
            addCriterion("ginfo_price <", value, "ginfoPrice");
            return (Criteria) this;
        }

        public Criteria andGinfoPriceLessThanOrEqualTo(Double value) {
            addCriterion("ginfo_price <=", value, "ginfoPrice");
            return (Criteria) this;
        }

        public Criteria andGinfoPriceIn(List<Double> values) {
            addCriterion("ginfo_price in", values, "ginfoPrice");
            return (Criteria) this;
        }

        public Criteria andGinfoPriceNotIn(List<Double> values) {
            addCriterion("ginfo_price not in", values, "ginfoPrice");
            return (Criteria) this;
        }

        public Criteria andGinfoPriceBetween(Double value1, Double value2) {
            addCriterion("ginfo_price between", value1, value2, "ginfoPrice");
            return (Criteria) this;
        }

        public Criteria andGinfoPriceNotBetween(Double value1, Double value2) {
            addCriterion("ginfo_price not between", value1, value2, "ginfoPrice");
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

        public Criteria andFBusidIsNull() {
            addCriterion("f_busid is null");
            return (Criteria) this;
        }

        public Criteria andFBusidIsNotNull() {
            addCriterion("f_busid is not null");
            return (Criteria) this;
        }

        public Criteria andFBusidEqualTo(Integer value) {
            addCriterion("f_busid =", value, "fBusid");
            return (Criteria) this;
        }

        public Criteria andFBusidNotEqualTo(Integer value) {
            addCriterion("f_busid <>", value, "fBusid");
            return (Criteria) this;
        }

        public Criteria andFBusidGreaterThan(Integer value) {
            addCriterion("f_busid >", value, "fBusid");
            return (Criteria) this;
        }

        public Criteria andFBusidGreaterThanOrEqualTo(Integer value) {
            addCriterion("f_busid >=", value, "fBusid");
            return (Criteria) this;
        }

        public Criteria andFBusidLessThan(Integer value) {
            addCriterion("f_busid <", value, "fBusid");
            return (Criteria) this;
        }

        public Criteria andFBusidLessThanOrEqualTo(Integer value) {
            addCriterion("f_busid <=", value, "fBusid");
            return (Criteria) this;
        }

        public Criteria andFBusidIn(List<Integer> values) {
            addCriterion("f_busid in", values, "fBusid");
            return (Criteria) this;
        }

        public Criteria andFBusidNotIn(List<Integer> values) {
            addCriterion("f_busid not in", values, "fBusid");
            return (Criteria) this;
        }

        public Criteria andFBusidBetween(Integer value1, Integer value2) {
            addCriterion("f_busid between", value1, value2, "fBusid");
            return (Criteria) this;
        }

        public Criteria andFBusidNotBetween(Integer value1, Integer value2) {
            addCriterion("f_busid not between", value1, value2, "fBusid");
            return (Criteria) this;
        }

        public Criteria andFGtypeIsNull() {
            addCriterion("f_gtype is null");
            return (Criteria) this;
        }

        public Criteria andFGtypeIsNotNull() {
            addCriterion("f_gtype is not null");
            return (Criteria) this;
        }

        public Criteria andFGtypeEqualTo(Integer value) {
            addCriterion("f_gtype =", value, "fGtype");
            return (Criteria) this;
        }

        public Criteria andFGtypeNotEqualTo(Integer value) {
            addCriterion("f_gtype <>", value, "fGtype");
            return (Criteria) this;
        }

        public Criteria andFGtypeGreaterThan(Integer value) {
            addCriterion("f_gtype >", value, "fGtype");
            return (Criteria) this;
        }

        public Criteria andFGtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("f_gtype >=", value, "fGtype");
            return (Criteria) this;
        }

        public Criteria andFGtypeLessThan(Integer value) {
            addCriterion("f_gtype <", value, "fGtype");
            return (Criteria) this;
        }

        public Criteria andFGtypeLessThanOrEqualTo(Integer value) {
            addCriterion("f_gtype <=", value, "fGtype");
            return (Criteria) this;
        }

        public Criteria andFGtypeIn(List<Integer> values) {
            addCriterion("f_gtype in", values, "fGtype");
            return (Criteria) this;
        }

        public Criteria andFGtypeNotIn(List<Integer> values) {
            addCriterion("f_gtype not in", values, "fGtype");
            return (Criteria) this;
        }

        public Criteria andFGtypeBetween(Integer value1, Integer value2) {
            addCriterion("f_gtype between", value1, value2, "fGtype");
            return (Criteria) this;
        }

        public Criteria andFGtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("f_gtype not between", value1, value2, "fGtype");
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
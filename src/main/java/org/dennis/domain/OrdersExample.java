package org.dennis.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdersExample() {
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

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderNameIsNull() {
            addCriterion("order_name is null");
            return (Criteria) this;
        }

        public Criteria andOrderNameIsNotNull() {
            addCriterion("order_name is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNameEqualTo(String value) {
            addCriterion("order_name =", value, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderNameNotEqualTo(String value) {
            addCriterion("order_name <>", value, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderNameGreaterThan(String value) {
            addCriterion("order_name >", value, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderNameGreaterThanOrEqualTo(String value) {
            addCriterion("order_name >=", value, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderNameLessThan(String value) {
            addCriterion("order_name <", value, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderNameLessThanOrEqualTo(String value) {
            addCriterion("order_name <=", value, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderNameLike(String value) {
            addCriterion("order_name like", value, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderNameNotLike(String value) {
            addCriterion("order_name not like", value, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderNameIn(List<String> values) {
            addCriterion("order_name in", values, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderNameNotIn(List<String> values) {
            addCriterion("order_name not in", values, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderNameBetween(String value1, String value2) {
            addCriterion("order_name between", value1, value2, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderNameNotBetween(String value1, String value2) {
            addCriterion("order_name not between", value1, value2, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderCntIsNull() {
            addCriterion("order_cnt is null");
            return (Criteria) this;
        }

        public Criteria andOrderCntIsNotNull() {
            addCriterion("order_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCntEqualTo(Integer value) {
            addCriterion("order_cnt =", value, "orderCnt");
            return (Criteria) this;
        }

        public Criteria andOrderCntNotEqualTo(Integer value) {
            addCriterion("order_cnt <>", value, "orderCnt");
            return (Criteria) this;
        }

        public Criteria andOrderCntGreaterThan(Integer value) {
            addCriterion("order_cnt >", value, "orderCnt");
            return (Criteria) this;
        }

        public Criteria andOrderCntGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_cnt >=", value, "orderCnt");
            return (Criteria) this;
        }

        public Criteria andOrderCntLessThan(Integer value) {
            addCriterion("order_cnt <", value, "orderCnt");
            return (Criteria) this;
        }

        public Criteria andOrderCntLessThanOrEqualTo(Integer value) {
            addCriterion("order_cnt <=", value, "orderCnt");
            return (Criteria) this;
        }

        public Criteria andOrderCntIn(List<Integer> values) {
            addCriterion("order_cnt in", values, "orderCnt");
            return (Criteria) this;
        }

        public Criteria andOrderCntNotIn(List<Integer> values) {
            addCriterion("order_cnt not in", values, "orderCnt");
            return (Criteria) this;
        }

        public Criteria andOrderCntBetween(Integer value1, Integer value2) {
            addCriterion("order_cnt between", value1, value2, "orderCnt");
            return (Criteria) this;
        }

        public Criteria andOrderCntNotBetween(Integer value1, Integer value2) {
            addCriterion("order_cnt not between", value1, value2, "orderCnt");
            return (Criteria) this;
        }

        public Criteria andOrderPaystatusIsNull() {
            addCriterion("order_paystatus is null");
            return (Criteria) this;
        }

        public Criteria andOrderPaystatusIsNotNull() {
            addCriterion("order_paystatus is not null");
            return (Criteria) this;
        }

        public Criteria andOrderPaystatusEqualTo(String value) {
            addCriterion("order_paystatus =", value, "orderPaystatus");
            return (Criteria) this;
        }

        public Criteria andOrderPaystatusNotEqualTo(String value) {
            addCriterion("order_paystatus <>", value, "orderPaystatus");
            return (Criteria) this;
        }

        public Criteria andOrderPaystatusGreaterThan(String value) {
            addCriterion("order_paystatus >", value, "orderPaystatus");
            return (Criteria) this;
        }

        public Criteria andOrderPaystatusGreaterThanOrEqualTo(String value) {
            addCriterion("order_paystatus >=", value, "orderPaystatus");
            return (Criteria) this;
        }

        public Criteria andOrderPaystatusLessThan(String value) {
            addCriterion("order_paystatus <", value, "orderPaystatus");
            return (Criteria) this;
        }

        public Criteria andOrderPaystatusLessThanOrEqualTo(String value) {
            addCriterion("order_paystatus <=", value, "orderPaystatus");
            return (Criteria) this;
        }

        public Criteria andOrderPaystatusLike(String value) {
            addCriterion("order_paystatus like", value, "orderPaystatus");
            return (Criteria) this;
        }

        public Criteria andOrderPaystatusNotLike(String value) {
            addCriterion("order_paystatus not like", value, "orderPaystatus");
            return (Criteria) this;
        }

        public Criteria andOrderPaystatusIn(List<String> values) {
            addCriterion("order_paystatus in", values, "orderPaystatus");
            return (Criteria) this;
        }

        public Criteria andOrderPaystatusNotIn(List<String> values) {
            addCriterion("order_paystatus not in", values, "orderPaystatus");
            return (Criteria) this;
        }

        public Criteria andOrderPaystatusBetween(String value1, String value2) {
            addCriterion("order_paystatus between", value1, value2, "orderPaystatus");
            return (Criteria) this;
        }

        public Criteria andOrderPaystatusNotBetween(String value1, String value2) {
            addCriterion("order_paystatus not between", value1, value2, "orderPaystatus");
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

        public Criteria andFCidIsNull() {
            addCriterion("f_cid is null");
            return (Criteria) this;
        }

        public Criteria andFCidIsNotNull() {
            addCriterion("f_cid is not null");
            return (Criteria) this;
        }

        public Criteria andFCidEqualTo(Integer value) {
            addCriterion("f_cid =", value, "fCid");
            return (Criteria) this;
        }

        public Criteria andFCidNotEqualTo(Integer value) {
            addCriterion("f_cid <>", value, "fCid");
            return (Criteria) this;
        }

        public Criteria andFCidGreaterThan(Integer value) {
            addCriterion("f_cid >", value, "fCid");
            return (Criteria) this;
        }

        public Criteria andFCidGreaterThanOrEqualTo(Integer value) {
            addCriterion("f_cid >=", value, "fCid");
            return (Criteria) this;
        }

        public Criteria andFCidLessThan(Integer value) {
            addCriterion("f_cid <", value, "fCid");
            return (Criteria) this;
        }

        public Criteria andFCidLessThanOrEqualTo(Integer value) {
            addCriterion("f_cid <=", value, "fCid");
            return (Criteria) this;
        }

        public Criteria andFCidIn(List<Integer> values) {
            addCriterion("f_cid in", values, "fCid");
            return (Criteria) this;
        }

        public Criteria andFCidNotIn(List<Integer> values) {
            addCriterion("f_cid not in", values, "fCid");
            return (Criteria) this;
        }

        public Criteria andFCidBetween(Integer value1, Integer value2) {
            addCriterion("f_cid between", value1, value2, "fCid");
            return (Criteria) this;
        }

        public Criteria andFCidNotBetween(Integer value1, Integer value2) {
            addCriterion("f_cid not between", value1, value2, "fCid");
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
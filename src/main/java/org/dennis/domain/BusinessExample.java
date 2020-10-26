package org.dennis.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BusinessExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BusinessExample() {
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

        public Criteria andBusIdIsNull() {
            addCriterion("bus_id is null");
            return (Criteria) this;
        }

        public Criteria andBusIdIsNotNull() {
            addCriterion("bus_id is not null");
            return (Criteria) this;
        }

        public Criteria andBusIdEqualTo(Integer value) {
            addCriterion("bus_id =", value, "busId");
            return (Criteria) this;
        }

        public Criteria andBusIdNotEqualTo(Integer value) {
            addCriterion("bus_id <>", value, "busId");
            return (Criteria) this;
        }

        public Criteria andBusIdGreaterThan(Integer value) {
            addCriterion("bus_id >", value, "busId");
            return (Criteria) this;
        }

        public Criteria andBusIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("bus_id >=", value, "busId");
            return (Criteria) this;
        }

        public Criteria andBusIdLessThan(Integer value) {
            addCriterion("bus_id <", value, "busId");
            return (Criteria) this;
        }

        public Criteria andBusIdLessThanOrEqualTo(Integer value) {
            addCriterion("bus_id <=", value, "busId");
            return (Criteria) this;
        }

        public Criteria andBusIdIn(List<Integer> values) {
            addCriterion("bus_id in", values, "busId");
            return (Criteria) this;
        }

        public Criteria andBusIdNotIn(List<Integer> values) {
            addCriterion("bus_id not in", values, "busId");
            return (Criteria) this;
        }

        public Criteria andBusIdBetween(Integer value1, Integer value2) {
            addCriterion("bus_id between", value1, value2, "busId");
            return (Criteria) this;
        }

        public Criteria andBusIdNotBetween(Integer value1, Integer value2) {
            addCriterion("bus_id not between", value1, value2, "busId");
            return (Criteria) this;
        }

        public Criteria andBusNameIsNull() {
            addCriterion("bus_name is null");
            return (Criteria) this;
        }

        public Criteria andBusNameIsNotNull() {
            addCriterion("bus_name is not null");
            return (Criteria) this;
        }

        public Criteria andBusNameEqualTo(String value) {
            addCriterion("bus_name =", value, "busName");
            return (Criteria) this;
        }

        public Criteria andBusNameNotEqualTo(String value) {
            addCriterion("bus_name <>", value, "busName");
            return (Criteria) this;
        }

        public Criteria andBusNameGreaterThan(String value) {
            addCriterion("bus_name >", value, "busName");
            return (Criteria) this;
        }

        public Criteria andBusNameGreaterThanOrEqualTo(String value) {
            addCriterion("bus_name >=", value, "busName");
            return (Criteria) this;
        }

        public Criteria andBusNameLessThan(String value) {
            addCriterion("bus_name <", value, "busName");
            return (Criteria) this;
        }

        public Criteria andBusNameLessThanOrEqualTo(String value) {
            addCriterion("bus_name <=", value, "busName");
            return (Criteria) this;
        }

        public Criteria andBusNameLike(String value) {
            addCriterion("bus_name like", value, "busName");
            return (Criteria) this;
        }

        public Criteria andBusNameNotLike(String value) {
            addCriterion("bus_name not like", value, "busName");
            return (Criteria) this;
        }

        public Criteria andBusNameIn(List<String> values) {
            addCriterion("bus_name in", values, "busName");
            return (Criteria) this;
        }

        public Criteria andBusNameNotIn(List<String> values) {
            addCriterion("bus_name not in", values, "busName");
            return (Criteria) this;
        }

        public Criteria andBusNameBetween(String value1, String value2) {
            addCriterion("bus_name between", value1, value2, "busName");
            return (Criteria) this;
        }

        public Criteria andBusNameNotBetween(String value1, String value2) {
            addCriterion("bus_name not between", value1, value2, "busName");
            return (Criteria) this;
        }

        public Criteria andBusPassIsNull() {
            addCriterion("bus_pass is null");
            return (Criteria) this;
        }

        public Criteria andBusPassIsNotNull() {
            addCriterion("bus_pass is not null");
            return (Criteria) this;
        }

        public Criteria andBusPassEqualTo(String value) {
            addCriterion("bus_pass =", value, "busPass");
            return (Criteria) this;
        }

        public Criteria andBusPassNotEqualTo(String value) {
            addCriterion("bus_pass <>", value, "busPass");
            return (Criteria) this;
        }

        public Criteria andBusPassGreaterThan(String value) {
            addCriterion("bus_pass >", value, "busPass");
            return (Criteria) this;
        }

        public Criteria andBusPassGreaterThanOrEqualTo(String value) {
            addCriterion("bus_pass >=", value, "busPass");
            return (Criteria) this;
        }

        public Criteria andBusPassLessThan(String value) {
            addCriterion("bus_pass <", value, "busPass");
            return (Criteria) this;
        }

        public Criteria andBusPassLessThanOrEqualTo(String value) {
            addCriterion("bus_pass <=", value, "busPass");
            return (Criteria) this;
        }

        public Criteria andBusPassLike(String value) {
            addCriterion("bus_pass like", value, "busPass");
            return (Criteria) this;
        }

        public Criteria andBusPassNotLike(String value) {
            addCriterion("bus_pass not like", value, "busPass");
            return (Criteria) this;
        }

        public Criteria andBusPassIn(List<String> values) {
            addCriterion("bus_pass in", values, "busPass");
            return (Criteria) this;
        }

        public Criteria andBusPassNotIn(List<String> values) {
            addCriterion("bus_pass not in", values, "busPass");
            return (Criteria) this;
        }

        public Criteria andBusPassBetween(String value1, String value2) {
            addCriterion("bus_pass between", value1, value2, "busPass");
            return (Criteria) this;
        }

        public Criteria andBusPassNotBetween(String value1, String value2) {
            addCriterion("bus_pass not between", value1, value2, "busPass");
            return (Criteria) this;
        }

        public Criteria andBusAvatarIsNull() {
            addCriterion("bus_avatar is null");
            return (Criteria) this;
        }

        public Criteria andBusAvatarIsNotNull() {
            addCriterion("bus_avatar is not null");
            return (Criteria) this;
        }

        public Criteria andBusAvatarEqualTo(String value) {
            addCriterion("bus_avatar =", value, "busAvatar");
            return (Criteria) this;
        }

        public Criteria andBusAvatarNotEqualTo(String value) {
            addCriterion("bus_avatar <>", value, "busAvatar");
            return (Criteria) this;
        }

        public Criteria andBusAvatarGreaterThan(String value) {
            addCriterion("bus_avatar >", value, "busAvatar");
            return (Criteria) this;
        }

        public Criteria andBusAvatarGreaterThanOrEqualTo(String value) {
            addCriterion("bus_avatar >=", value, "busAvatar");
            return (Criteria) this;
        }

        public Criteria andBusAvatarLessThan(String value) {
            addCriterion("bus_avatar <", value, "busAvatar");
            return (Criteria) this;
        }

        public Criteria andBusAvatarLessThanOrEqualTo(String value) {
            addCriterion("bus_avatar <=", value, "busAvatar");
            return (Criteria) this;
        }

        public Criteria andBusAvatarLike(String value) {
            addCriterion("bus_avatar like", value, "busAvatar");
            return (Criteria) this;
        }

        public Criteria andBusAvatarNotLike(String value) {
            addCriterion("bus_avatar not like", value, "busAvatar");
            return (Criteria) this;
        }

        public Criteria andBusAvatarIn(List<String> values) {
            addCriterion("bus_avatar in", values, "busAvatar");
            return (Criteria) this;
        }

        public Criteria andBusAvatarNotIn(List<String> values) {
            addCriterion("bus_avatar not in", values, "busAvatar");
            return (Criteria) this;
        }

        public Criteria andBusAvatarBetween(String value1, String value2) {
            addCriterion("bus_avatar between", value1, value2, "busAvatar");
            return (Criteria) this;
        }

        public Criteria andBusAvatarNotBetween(String value1, String value2) {
            addCriterion("bus_avatar not between", value1, value2, "busAvatar");
            return (Criteria) this;
        }

        public Criteria andBusScoreIsNull() {
            addCriterion("bus_score is null");
            return (Criteria) this;
        }

        public Criteria andBusScoreIsNotNull() {
            addCriterion("bus_score is not null");
            return (Criteria) this;
        }

        public Criteria andBusScoreEqualTo(Integer value) {
            addCriterion("bus_score =", value, "busScore");
            return (Criteria) this;
        }

        public Criteria andBusScoreNotEqualTo(Integer value) {
            addCriterion("bus_score <>", value, "busScore");
            return (Criteria) this;
        }

        public Criteria andBusScoreGreaterThan(Integer value) {
            addCriterion("bus_score >", value, "busScore");
            return (Criteria) this;
        }

        public Criteria andBusScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("bus_score >=", value, "busScore");
            return (Criteria) this;
        }

        public Criteria andBusScoreLessThan(Integer value) {
            addCriterion("bus_score <", value, "busScore");
            return (Criteria) this;
        }

        public Criteria andBusScoreLessThanOrEqualTo(Integer value) {
            addCriterion("bus_score <=", value, "busScore");
            return (Criteria) this;
        }

        public Criteria andBusScoreIn(List<Integer> values) {
            addCriterion("bus_score in", values, "busScore");
            return (Criteria) this;
        }

        public Criteria andBusScoreNotIn(List<Integer> values) {
            addCriterion("bus_score not in", values, "busScore");
            return (Criteria) this;
        }

        public Criteria andBusScoreBetween(Integer value1, Integer value2) {
            addCriterion("bus_score between", value1, value2, "busScore");
            return (Criteria) this;
        }

        public Criteria andBusScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("bus_score not between", value1, value2, "busScore");
            return (Criteria) this;
        }

        public Criteria andBusSendIsNull() {
            addCriterion("bus_send is null");
            return (Criteria) this;
        }

        public Criteria andBusSendIsNotNull() {
            addCriterion("bus_send is not null");
            return (Criteria) this;
        }

        public Criteria andBusSendEqualTo(String value) {
            addCriterion("bus_send =", value, "busSend");
            return (Criteria) this;
        }

        public Criteria andBusSendNotEqualTo(String value) {
            addCriterion("bus_send <>", value, "busSend");
            return (Criteria) this;
        }

        public Criteria andBusSendGreaterThan(String value) {
            addCriterion("bus_send >", value, "busSend");
            return (Criteria) this;
        }

        public Criteria andBusSendGreaterThanOrEqualTo(String value) {
            addCriterion("bus_send >=", value, "busSend");
            return (Criteria) this;
        }

        public Criteria andBusSendLessThan(String value) {
            addCriterion("bus_send <", value, "busSend");
            return (Criteria) this;
        }

        public Criteria andBusSendLessThanOrEqualTo(String value) {
            addCriterion("bus_send <=", value, "busSend");
            return (Criteria) this;
        }

        public Criteria andBusSendLike(String value) {
            addCriterion("bus_send like", value, "busSend");
            return (Criteria) this;
        }

        public Criteria andBusSendNotLike(String value) {
            addCriterion("bus_send not like", value, "busSend");
            return (Criteria) this;
        }

        public Criteria andBusSendIn(List<String> values) {
            addCriterion("bus_send in", values, "busSend");
            return (Criteria) this;
        }

        public Criteria andBusSendNotIn(List<String> values) {
            addCriterion("bus_send not in", values, "busSend");
            return (Criteria) this;
        }

        public Criteria andBusSendBetween(String value1, String value2) {
            addCriterion("bus_send between", value1, value2, "busSend");
            return (Criteria) this;
        }

        public Criteria andBusSendNotBetween(String value1, String value2) {
            addCriterion("bus_send not between", value1, value2, "busSend");
            return (Criteria) this;
        }

        public Criteria andBusPhoneIsNull() {
            addCriterion("bus_phone is null");
            return (Criteria) this;
        }

        public Criteria andBusPhoneIsNotNull() {
            addCriterion("bus_phone is not null");
            return (Criteria) this;
        }

        public Criteria andBusPhoneEqualTo(String value) {
            addCriterion("bus_phone =", value, "busPhone");
            return (Criteria) this;
        }

        public Criteria andBusPhoneNotEqualTo(String value) {
            addCriterion("bus_phone <>", value, "busPhone");
            return (Criteria) this;
        }

        public Criteria andBusPhoneGreaterThan(String value) {
            addCriterion("bus_phone >", value, "busPhone");
            return (Criteria) this;
        }

        public Criteria andBusPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("bus_phone >=", value, "busPhone");
            return (Criteria) this;
        }

        public Criteria andBusPhoneLessThan(String value) {
            addCriterion("bus_phone <", value, "busPhone");
            return (Criteria) this;
        }

        public Criteria andBusPhoneLessThanOrEqualTo(String value) {
            addCriterion("bus_phone <=", value, "busPhone");
            return (Criteria) this;
        }

        public Criteria andBusPhoneLike(String value) {
            addCriterion("bus_phone like", value, "busPhone");
            return (Criteria) this;
        }

        public Criteria andBusPhoneNotLike(String value) {
            addCriterion("bus_phone not like", value, "busPhone");
            return (Criteria) this;
        }

        public Criteria andBusPhoneIn(List<String> values) {
            addCriterion("bus_phone in", values, "busPhone");
            return (Criteria) this;
        }

        public Criteria andBusPhoneNotIn(List<String> values) {
            addCriterion("bus_phone not in", values, "busPhone");
            return (Criteria) this;
        }

        public Criteria andBusPhoneBetween(String value1, String value2) {
            addCriterion("bus_phone between", value1, value2, "busPhone");
            return (Criteria) this;
        }

        public Criteria andBusPhoneNotBetween(String value1, String value2) {
            addCriterion("bus_phone not between", value1, value2, "busPhone");
            return (Criteria) this;
        }

        public Criteria andBusAddrIsNull() {
            addCriterion("bus_addr is null");
            return (Criteria) this;
        }

        public Criteria andBusAddrIsNotNull() {
            addCriterion("bus_addr is not null");
            return (Criteria) this;
        }

        public Criteria andBusAddrEqualTo(String value) {
            addCriterion("bus_addr =", value, "busAddr");
            return (Criteria) this;
        }

        public Criteria andBusAddrNotEqualTo(String value) {
            addCriterion("bus_addr <>", value, "busAddr");
            return (Criteria) this;
        }

        public Criteria andBusAddrGreaterThan(String value) {
            addCriterion("bus_addr >", value, "busAddr");
            return (Criteria) this;
        }

        public Criteria andBusAddrGreaterThanOrEqualTo(String value) {
            addCriterion("bus_addr >=", value, "busAddr");
            return (Criteria) this;
        }

        public Criteria andBusAddrLessThan(String value) {
            addCriterion("bus_addr <", value, "busAddr");
            return (Criteria) this;
        }

        public Criteria andBusAddrLessThanOrEqualTo(String value) {
            addCriterion("bus_addr <=", value, "busAddr");
            return (Criteria) this;
        }

        public Criteria andBusAddrLike(String value) {
            addCriterion("bus_addr like", value, "busAddr");
            return (Criteria) this;
        }

        public Criteria andBusAddrNotLike(String value) {
            addCriterion("bus_addr not like", value, "busAddr");
            return (Criteria) this;
        }

        public Criteria andBusAddrIn(List<String> values) {
            addCriterion("bus_addr in", values, "busAddr");
            return (Criteria) this;
        }

        public Criteria andBusAddrNotIn(List<String> values) {
            addCriterion("bus_addr not in", values, "busAddr");
            return (Criteria) this;
        }

        public Criteria andBusAddrBetween(String value1, String value2) {
            addCriterion("bus_addr between", value1, value2, "busAddr");
            return (Criteria) this;
        }

        public Criteria andBusAddrNotBetween(String value1, String value2) {
            addCriterion("bus_addr not between", value1, value2, "busAddr");
            return (Criteria) this;
        }

        public Criteria andBusRecoIsNull() {
            addCriterion("bus_reco is null");
            return (Criteria) this;
        }

        public Criteria andBusRecoIsNotNull() {
            addCriterion("bus_reco is not null");
            return (Criteria) this;
        }

        public Criteria andBusRecoEqualTo(Integer value) {
            addCriterion("bus_reco =", value, "busReco");
            return (Criteria) this;
        }

        public Criteria andBusRecoNotEqualTo(Integer value) {
            addCriterion("bus_reco <>", value, "busReco");
            return (Criteria) this;
        }

        public Criteria andBusRecoGreaterThan(Integer value) {
            addCriterion("bus_reco >", value, "busReco");
            return (Criteria) this;
        }

        public Criteria andBusRecoGreaterThanOrEqualTo(Integer value) {
            addCriterion("bus_reco >=", value, "busReco");
            return (Criteria) this;
        }

        public Criteria andBusRecoLessThan(Integer value) {
            addCriterion("bus_reco <", value, "busReco");
            return (Criteria) this;
        }

        public Criteria andBusRecoLessThanOrEqualTo(Integer value) {
            addCriterion("bus_reco <=", value, "busReco");
            return (Criteria) this;
        }

        public Criteria andBusRecoIn(List<Integer> values) {
            addCriterion("bus_reco in", values, "busReco");
            return (Criteria) this;
        }

        public Criteria andBusRecoNotIn(List<Integer> values) {
            addCriterion("bus_reco not in", values, "busReco");
            return (Criteria) this;
        }

        public Criteria andBusRecoBetween(Integer value1, Integer value2) {
            addCriterion("bus_reco between", value1, value2, "busReco");
            return (Criteria) this;
        }

        public Criteria andBusRecoNotBetween(Integer value1, Integer value2) {
            addCriterion("bus_reco not between", value1, value2, "busReco");
            return (Criteria) this;
        }

        public Criteria andBusStatusIsNull() {
            addCriterion("bus_status is null");
            return (Criteria) this;
        }

        public Criteria andBusStatusIsNotNull() {
            addCriterion("bus_status is not null");
            return (Criteria) this;
        }

        public Criteria andBusStatusEqualTo(Boolean value) {
            addCriterion("bus_status =", value, "busStatus");
            return (Criteria) this;
        }

        public Criteria andBusStatusNotEqualTo(Boolean value) {
            addCriterion("bus_status <>", value, "busStatus");
            return (Criteria) this;
        }

        public Criteria andBusStatusGreaterThan(Boolean value) {
            addCriterion("bus_status >", value, "busStatus");
            return (Criteria) this;
        }

        public Criteria andBusStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("bus_status >=", value, "busStatus");
            return (Criteria) this;
        }

        public Criteria andBusStatusLessThan(Boolean value) {
            addCriterion("bus_status <", value, "busStatus");
            return (Criteria) this;
        }

        public Criteria andBusStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("bus_status <=", value, "busStatus");
            return (Criteria) this;
        }

        public Criteria andBusStatusIn(List<Boolean> values) {
            addCriterion("bus_status in", values, "busStatus");
            return (Criteria) this;
        }

        public Criteria andBusStatusNotIn(List<Boolean> values) {
            addCriterion("bus_status not in", values, "busStatus");
            return (Criteria) this;
        }

        public Criteria andBusStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("bus_status between", value1, value2, "busStatus");
            return (Criteria) this;
        }

        public Criteria andBusStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("bus_status not between", value1, value2, "busStatus");
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

        public Criteria andBusActIsNull() {
            addCriterion("bus_act is null");
            return (Criteria) this;
        }

        public Criteria andBusActIsNotNull() {
            addCriterion("bus_act is not null");
            return (Criteria) this;
        }

        public Criteria andBusActEqualTo(Integer value) {
            addCriterion("bus_act =", value, "busAct");
            return (Criteria) this;
        }

        public Criteria andBusActNotEqualTo(Integer value) {
            addCriterion("bus_act <>", value, "busAct");
            return (Criteria) this;
        }

        public Criteria andBusActGreaterThan(Integer value) {
            addCriterion("bus_act >", value, "busAct");
            return (Criteria) this;
        }

        public Criteria andBusActGreaterThanOrEqualTo(Integer value) {
            addCriterion("bus_act >=", value, "busAct");
            return (Criteria) this;
        }

        public Criteria andBusActLessThan(Integer value) {
            addCriterion("bus_act <", value, "busAct");
            return (Criteria) this;
        }

        public Criteria andBusActLessThanOrEqualTo(Integer value) {
            addCriterion("bus_act <=", value, "busAct");
            return (Criteria) this;
        }

        public Criteria andBusActIn(List<Integer> values) {
            addCriterion("bus_act in", values, "busAct");
            return (Criteria) this;
        }

        public Criteria andBusActNotIn(List<Integer> values) {
            addCriterion("bus_act not in", values, "busAct");
            return (Criteria) this;
        }

        public Criteria andBusActBetween(Integer value1, Integer value2) {
            addCriterion("bus_act between", value1, value2, "busAct");
            return (Criteria) this;
        }

        public Criteria andBusActNotBetween(Integer value1, Integer value2) {
            addCriterion("bus_act not between", value1, value2, "busAct");
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
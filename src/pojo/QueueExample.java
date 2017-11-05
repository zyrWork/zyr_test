package pojo;

import java.util.ArrayList;
import java.util.List;

public class QueueExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QueueExample() {
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

        public Criteria andQueueSerialIsNull() {
            addCriterion("queue_serial is null");
            return (Criteria) this;
        }

        public Criteria andQueueSerialIsNotNull() {
            addCriterion("queue_serial is not null");
            return (Criteria) this;
        }

        public Criteria andQueueSerialEqualTo(Integer value) {
            addCriterion("queue_serial =", value, "queueSerial");
            return (Criteria) this;
        }

        public Criteria andQueueSerialNotEqualTo(Integer value) {
            addCriterion("queue_serial <>", value, "queueSerial");
            return (Criteria) this;
        }

        public Criteria andQueueSerialGreaterThan(Integer value) {
            addCriterion("queue_serial >", value, "queueSerial");
            return (Criteria) this;
        }

        public Criteria andQueueSerialGreaterThanOrEqualTo(Integer value) {
            addCriterion("queue_serial >=", value, "queueSerial");
            return (Criteria) this;
        }

        public Criteria andQueueSerialLessThan(Integer value) {
            addCriterion("queue_serial <", value, "queueSerial");
            return (Criteria) this;
        }

        public Criteria andQueueSerialLessThanOrEqualTo(Integer value) {
            addCriterion("queue_serial <=", value, "queueSerial");
            return (Criteria) this;
        }

        public Criteria andQueueSerialIn(List<Integer> values) {
            addCriterion("queue_serial in", values, "queueSerial");
            return (Criteria) this;
        }

        public Criteria andQueueSerialNotIn(List<Integer> values) {
            addCriterion("queue_serial not in", values, "queueSerial");
            return (Criteria) this;
        }

        public Criteria andQueueSerialBetween(Integer value1, Integer value2) {
            addCriterion("queue_serial between", value1, value2, "queueSerial");
            return (Criteria) this;
        }

        public Criteria andQueueSerialNotBetween(Integer value1, Integer value2) {
            addCriterion("queue_serial not between", value1, value2, "queueSerial");
            return (Criteria) this;
        }

        public Criteria andMemberAccountIdIsNull() {
            addCriterion("member_account_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberAccountIdIsNotNull() {
            addCriterion("member_account_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberAccountIdEqualTo(Integer value) {
            addCriterion("member_account_id =", value, "memberAccountId");
            return (Criteria) this;
        }

        public Criteria andMemberAccountIdNotEqualTo(Integer value) {
            addCriterion("member_account_id <>", value, "memberAccountId");
            return (Criteria) this;
        }

        public Criteria andMemberAccountIdGreaterThan(Integer value) {
            addCriterion("member_account_id >", value, "memberAccountId");
            return (Criteria) this;
        }

        public Criteria andMemberAccountIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_account_id >=", value, "memberAccountId");
            return (Criteria) this;
        }

        public Criteria andMemberAccountIdLessThan(Integer value) {
            addCriterion("member_account_id <", value, "memberAccountId");
            return (Criteria) this;
        }

        public Criteria andMemberAccountIdLessThanOrEqualTo(Integer value) {
            addCriterion("member_account_id <=", value, "memberAccountId");
            return (Criteria) this;
        }

        public Criteria andMemberAccountIdIn(List<Integer> values) {
            addCriterion("member_account_id in", values, "memberAccountId");
            return (Criteria) this;
        }

        public Criteria andMemberAccountIdNotIn(List<Integer> values) {
            addCriterion("member_account_id not in", values, "memberAccountId");
            return (Criteria) this;
        }

        public Criteria andMemberAccountIdBetween(Integer value1, Integer value2) {
            addCriterion("member_account_id between", value1, value2, "memberAccountId");
            return (Criteria) this;
        }

        public Criteria andMemberAccountIdNotBetween(Integer value1, Integer value2) {
            addCriterion("member_account_id not between", value1, value2, "memberAccountId");
            return (Criteria) this;
        }

        public Criteria andShopAccountIdIsNull() {
            addCriterion("shop_account_id is null");
            return (Criteria) this;
        }

        public Criteria andShopAccountIdIsNotNull() {
            addCriterion("shop_account_id is not null");
            return (Criteria) this;
        }

        public Criteria andShopAccountIdEqualTo(Integer value) {
            addCriterion("shop_account_id =", value, "shopAccountId");
            return (Criteria) this;
        }

        public Criteria andShopAccountIdNotEqualTo(Integer value) {
            addCriterion("shop_account_id <>", value, "shopAccountId");
            return (Criteria) this;
        }

        public Criteria andShopAccountIdGreaterThan(Integer value) {
            addCriterion("shop_account_id >", value, "shopAccountId");
            return (Criteria) this;
        }

        public Criteria andShopAccountIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("shop_account_id >=", value, "shopAccountId");
            return (Criteria) this;
        }

        public Criteria andShopAccountIdLessThan(Integer value) {
            addCriterion("shop_account_id <", value, "shopAccountId");
            return (Criteria) this;
        }

        public Criteria andShopAccountIdLessThanOrEqualTo(Integer value) {
            addCriterion("shop_account_id <=", value, "shopAccountId");
            return (Criteria) this;
        }

        public Criteria andShopAccountIdIn(List<Integer> values) {
            addCriterion("shop_account_id in", values, "shopAccountId");
            return (Criteria) this;
        }

        public Criteria andShopAccountIdNotIn(List<Integer> values) {
            addCriterion("shop_account_id not in", values, "shopAccountId");
            return (Criteria) this;
        }

        public Criteria andShopAccountIdBetween(Integer value1, Integer value2) {
            addCriterion("shop_account_id between", value1, value2, "shopAccountId");
            return (Criteria) this;
        }

        public Criteria andShopAccountIdNotBetween(Integer value1, Integer value2) {
            addCriterion("shop_account_id not between", value1, value2, "shopAccountId");
            return (Criteria) this;
        }

        public Criteria andQueueNoIsNull() {
            addCriterion("queue_no is null");
            return (Criteria) this;
        }

        public Criteria andQueueNoIsNotNull() {
            addCriterion("queue_no is not null");
            return (Criteria) this;
        }

        public Criteria andQueueNoEqualTo(Integer value) {
            addCriterion("queue_no =", value, "queueNo");
            return (Criteria) this;
        }

        public Criteria andQueueNoNotEqualTo(Integer value) {
            addCriterion("queue_no <>", value, "queueNo");
            return (Criteria) this;
        }

        public Criteria andQueueNoGreaterThan(Integer value) {
            addCriterion("queue_no >", value, "queueNo");
            return (Criteria) this;
        }

        public Criteria andQueueNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("queue_no >=", value, "queueNo");
            return (Criteria) this;
        }

        public Criteria andQueueNoLessThan(Integer value) {
            addCriterion("queue_no <", value, "queueNo");
            return (Criteria) this;
        }

        public Criteria andQueueNoLessThanOrEqualTo(Integer value) {
            addCriterion("queue_no <=", value, "queueNo");
            return (Criteria) this;
        }

        public Criteria andQueueNoIn(List<Integer> values) {
            addCriterion("queue_no in", values, "queueNo");
            return (Criteria) this;
        }

        public Criteria andQueueNoNotIn(List<Integer> values) {
            addCriterion("queue_no not in", values, "queueNo");
            return (Criteria) this;
        }

        public Criteria andQueueNoBetween(Integer value1, Integer value2) {
            addCriterion("queue_no between", value1, value2, "queueNo");
            return (Criteria) this;
        }

        public Criteria andQueueNoNotBetween(Integer value1, Integer value2) {
            addCriterion("queue_no not between", value1, value2, "queueNo");
            return (Criteria) this;
        }

        public Criteria andSeatTypeIdIsNull() {
            addCriterion("seat_type_id is null");
            return (Criteria) this;
        }

        public Criteria andSeatTypeIdIsNotNull() {
            addCriterion("seat_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andSeatTypeIdEqualTo(Integer value) {
            addCriterion("seat_type_id =", value, "seatTypeId");
            return (Criteria) this;
        }

        public Criteria andSeatTypeIdNotEqualTo(Integer value) {
            addCriterion("seat_type_id <>", value, "seatTypeId");
            return (Criteria) this;
        }

        public Criteria andSeatTypeIdGreaterThan(Integer value) {
            addCriterion("seat_type_id >", value, "seatTypeId");
            return (Criteria) this;
        }

        public Criteria andSeatTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("seat_type_id >=", value, "seatTypeId");
            return (Criteria) this;
        }

        public Criteria andSeatTypeIdLessThan(Integer value) {
            addCriterion("seat_type_id <", value, "seatTypeId");
            return (Criteria) this;
        }

        public Criteria andSeatTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("seat_type_id <=", value, "seatTypeId");
            return (Criteria) this;
        }

        public Criteria andSeatTypeIdIn(List<Integer> values) {
            addCriterion("seat_type_id in", values, "seatTypeId");
            return (Criteria) this;
        }

        public Criteria andSeatTypeIdNotIn(List<Integer> values) {
            addCriterion("seat_type_id not in", values, "seatTypeId");
            return (Criteria) this;
        }

        public Criteria andSeatTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("seat_type_id between", value1, value2, "seatTypeId");
            return (Criteria) this;
        }

        public Criteria andSeatTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("seat_type_id not between", value1, value2, "seatTypeId");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(String value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(String value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(String value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(String value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(String value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(String value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLike(String value) {
            addCriterion("start_time like", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotLike(String value) {
            addCriterion("start_time not like", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<String> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<String> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(String value1, String value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(String value1, String value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(String value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(String value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(String value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(String value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(String value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(String value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLike(String value) {
            addCriterion("end_time like", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotLike(String value) {
            addCriterion("end_time not like", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<String> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<String> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(String value1, String value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(String value1, String value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
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
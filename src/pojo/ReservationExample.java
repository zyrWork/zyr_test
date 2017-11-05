package pojo;

import java.util.ArrayList;
import java.util.List;

public class ReservationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReservationExample() {
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

        public Criteria andReservationSerialIsNull() {
            addCriterion("reservation_serial is null");
            return (Criteria) this;
        }

        public Criteria andReservationSerialIsNotNull() {
            addCriterion("reservation_serial is not null");
            return (Criteria) this;
        }

        public Criteria andReservationSerialEqualTo(Integer value) {
            addCriterion("reservation_serial =", value, "reservationSerial");
            return (Criteria) this;
        }

        public Criteria andReservationSerialNotEqualTo(Integer value) {
            addCriterion("reservation_serial <>", value, "reservationSerial");
            return (Criteria) this;
        }

        public Criteria andReservationSerialGreaterThan(Integer value) {
            addCriterion("reservation_serial >", value, "reservationSerial");
            return (Criteria) this;
        }

        public Criteria andReservationSerialGreaterThanOrEqualTo(Integer value) {
            addCriterion("reservation_serial >=", value, "reservationSerial");
            return (Criteria) this;
        }

        public Criteria andReservationSerialLessThan(Integer value) {
            addCriterion("reservation_serial <", value, "reservationSerial");
            return (Criteria) this;
        }

        public Criteria andReservationSerialLessThanOrEqualTo(Integer value) {
            addCriterion("reservation_serial <=", value, "reservationSerial");
            return (Criteria) this;
        }

        public Criteria andReservationSerialIn(List<Integer> values) {
            addCriterion("reservation_serial in", values, "reservationSerial");
            return (Criteria) this;
        }

        public Criteria andReservationSerialNotIn(List<Integer> values) {
            addCriterion("reservation_serial not in", values, "reservationSerial");
            return (Criteria) this;
        }

        public Criteria andReservationSerialBetween(Integer value1, Integer value2) {
            addCriterion("reservation_serial between", value1, value2, "reservationSerial");
            return (Criteria) this;
        }

        public Criteria andReservationSerialNotBetween(Integer value1, Integer value2) {
            addCriterion("reservation_serial not between", value1, value2, "reservationSerial");
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

        public Criteria andCustomersNumberIsNull() {
            addCriterion("customers_number is null");
            return (Criteria) this;
        }

        public Criteria andCustomersNumberIsNotNull() {
            addCriterion("customers_number is not null");
            return (Criteria) this;
        }

        public Criteria andCustomersNumberEqualTo(Short value) {
            addCriterion("customers_number =", value, "customersNumber");
            return (Criteria) this;
        }

        public Criteria andCustomersNumberNotEqualTo(Short value) {
            addCriterion("customers_number <>", value, "customersNumber");
            return (Criteria) this;
        }

        public Criteria andCustomersNumberGreaterThan(Short value) {
            addCriterion("customers_number >", value, "customersNumber");
            return (Criteria) this;
        }

        public Criteria andCustomersNumberGreaterThanOrEqualTo(Short value) {
            addCriterion("customers_number >=", value, "customersNumber");
            return (Criteria) this;
        }

        public Criteria andCustomersNumberLessThan(Short value) {
            addCriterion("customers_number <", value, "customersNumber");
            return (Criteria) this;
        }

        public Criteria andCustomersNumberLessThanOrEqualTo(Short value) {
            addCriterion("customers_number <=", value, "customersNumber");
            return (Criteria) this;
        }

        public Criteria andCustomersNumberIn(List<Short> values) {
            addCriterion("customers_number in", values, "customersNumber");
            return (Criteria) this;
        }

        public Criteria andCustomersNumberNotIn(List<Short> values) {
            addCriterion("customers_number not in", values, "customersNumber");
            return (Criteria) this;
        }

        public Criteria andCustomersNumberBetween(Short value1, Short value2) {
            addCriterion("customers_number between", value1, value2, "customersNumber");
            return (Criteria) this;
        }

        public Criteria andCustomersNumberNotBetween(Short value1, Short value2) {
            addCriterion("customers_number not between", value1, value2, "customersNumber");
            return (Criteria) this;
        }

        public Criteria andReservationNameIsNull() {
            addCriterion("reservation_name is null");
            return (Criteria) this;
        }

        public Criteria andReservationNameIsNotNull() {
            addCriterion("reservation_name is not null");
            return (Criteria) this;
        }

        public Criteria andReservationNameEqualTo(String value) {
            addCriterion("reservation_name =", value, "reservationName");
            return (Criteria) this;
        }

        public Criteria andReservationNameNotEqualTo(String value) {
            addCriterion("reservation_name <>", value, "reservationName");
            return (Criteria) this;
        }

        public Criteria andReservationNameGreaterThan(String value) {
            addCriterion("reservation_name >", value, "reservationName");
            return (Criteria) this;
        }

        public Criteria andReservationNameGreaterThanOrEqualTo(String value) {
            addCriterion("reservation_name >=", value, "reservationName");
            return (Criteria) this;
        }

        public Criteria andReservationNameLessThan(String value) {
            addCriterion("reservation_name <", value, "reservationName");
            return (Criteria) this;
        }

        public Criteria andReservationNameLessThanOrEqualTo(String value) {
            addCriterion("reservation_name <=", value, "reservationName");
            return (Criteria) this;
        }

        public Criteria andReservationNameLike(String value) {
            addCriterion("reservation_name like", value, "reservationName");
            return (Criteria) this;
        }

        public Criteria andReservationNameNotLike(String value) {
            addCriterion("reservation_name not like", value, "reservationName");
            return (Criteria) this;
        }

        public Criteria andReservationNameIn(List<String> values) {
            addCriterion("reservation_name in", values, "reservationName");
            return (Criteria) this;
        }

        public Criteria andReservationNameNotIn(List<String> values) {
            addCriterion("reservation_name not in", values, "reservationName");
            return (Criteria) this;
        }

        public Criteria andReservationNameBetween(String value1, String value2) {
            addCriterion("reservation_name between", value1, value2, "reservationName");
            return (Criteria) this;
        }

        public Criteria andReservationNameNotBetween(String value1, String value2) {
            addCriterion("reservation_name not between", value1, value2, "reservationName");
            return (Criteria) this;
        }

        public Criteria andReservationTelIsNull() {
            addCriterion("reservation_tel is null");
            return (Criteria) this;
        }

        public Criteria andReservationTelIsNotNull() {
            addCriterion("reservation_tel is not null");
            return (Criteria) this;
        }

        public Criteria andReservationTelEqualTo(String value) {
            addCriterion("reservation_tel =", value, "reservationTel");
            return (Criteria) this;
        }

        public Criteria andReservationTelNotEqualTo(String value) {
            addCriterion("reservation_tel <>", value, "reservationTel");
            return (Criteria) this;
        }

        public Criteria andReservationTelGreaterThan(String value) {
            addCriterion("reservation_tel >", value, "reservationTel");
            return (Criteria) this;
        }

        public Criteria andReservationTelGreaterThanOrEqualTo(String value) {
            addCriterion("reservation_tel >=", value, "reservationTel");
            return (Criteria) this;
        }

        public Criteria andReservationTelLessThan(String value) {
            addCriterion("reservation_tel <", value, "reservationTel");
            return (Criteria) this;
        }

        public Criteria andReservationTelLessThanOrEqualTo(String value) {
            addCriterion("reservation_tel <=", value, "reservationTel");
            return (Criteria) this;
        }

        public Criteria andReservationTelLike(String value) {
            addCriterion("reservation_tel like", value, "reservationTel");
            return (Criteria) this;
        }

        public Criteria andReservationTelNotLike(String value) {
            addCriterion("reservation_tel not like", value, "reservationTel");
            return (Criteria) this;
        }

        public Criteria andReservationTelIn(List<String> values) {
            addCriterion("reservation_tel in", values, "reservationTel");
            return (Criteria) this;
        }

        public Criteria andReservationTelNotIn(List<String> values) {
            addCriterion("reservation_tel not in", values, "reservationTel");
            return (Criteria) this;
        }

        public Criteria andReservationTelBetween(String value1, String value2) {
            addCriterion("reservation_tel between", value1, value2, "reservationTel");
            return (Criteria) this;
        }

        public Criteria andReservationTelNotBetween(String value1, String value2) {
            addCriterion("reservation_tel not between", value1, value2, "reservationTel");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeIsNull() {
            addCriterion("arrival_time is null");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeIsNotNull() {
            addCriterion("arrival_time is not null");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeEqualTo(String value) {
            addCriterion("arrival_time =", value, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeNotEqualTo(String value) {
            addCriterion("arrival_time <>", value, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeGreaterThan(String value) {
            addCriterion("arrival_time >", value, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeGreaterThanOrEqualTo(String value) {
            addCriterion("arrival_time >=", value, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeLessThan(String value) {
            addCriterion("arrival_time <", value, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeLessThanOrEqualTo(String value) {
            addCriterion("arrival_time <=", value, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeLike(String value) {
            addCriterion("arrival_time like", value, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeNotLike(String value) {
            addCriterion("arrival_time not like", value, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeIn(List<String> values) {
            addCriterion("arrival_time in", values, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeNotIn(List<String> values) {
            addCriterion("arrival_time not in", values, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeBetween(String value1, String value2) {
            addCriterion("arrival_time between", value1, value2, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeNotBetween(String value1, String value2) {
            addCriterion("arrival_time not between", value1, value2, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(String value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(String value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(String value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(String value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(String value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLike(String value) {
            addCriterion("create_time like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotLike(String value) {
            addCriterion("create_time not like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<String> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<String> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(String value1, String value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(String value1, String value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andLastModifiedIsNull() {
            addCriterion("last_modified is null");
            return (Criteria) this;
        }

        public Criteria andLastModifiedIsNotNull() {
            addCriterion("last_modified is not null");
            return (Criteria) this;
        }

        public Criteria andLastModifiedEqualTo(String value) {
            addCriterion("last_modified =", value, "lastModified");
            return (Criteria) this;
        }

        public Criteria andLastModifiedNotEqualTo(String value) {
            addCriterion("last_modified <>", value, "lastModified");
            return (Criteria) this;
        }

        public Criteria andLastModifiedGreaterThan(String value) {
            addCriterion("last_modified >", value, "lastModified");
            return (Criteria) this;
        }

        public Criteria andLastModifiedGreaterThanOrEqualTo(String value) {
            addCriterion("last_modified >=", value, "lastModified");
            return (Criteria) this;
        }

        public Criteria andLastModifiedLessThan(String value) {
            addCriterion("last_modified <", value, "lastModified");
            return (Criteria) this;
        }

        public Criteria andLastModifiedLessThanOrEqualTo(String value) {
            addCriterion("last_modified <=", value, "lastModified");
            return (Criteria) this;
        }

        public Criteria andLastModifiedLike(String value) {
            addCriterion("last_modified like", value, "lastModified");
            return (Criteria) this;
        }

        public Criteria andLastModifiedNotLike(String value) {
            addCriterion("last_modified not like", value, "lastModified");
            return (Criteria) this;
        }

        public Criteria andLastModifiedIn(List<String> values) {
            addCriterion("last_modified in", values, "lastModified");
            return (Criteria) this;
        }

        public Criteria andLastModifiedNotIn(List<String> values) {
            addCriterion("last_modified not in", values, "lastModified");
            return (Criteria) this;
        }

        public Criteria andLastModifiedBetween(String value1, String value2) {
            addCriterion("last_modified between", value1, value2, "lastModified");
            return (Criteria) this;
        }

        public Criteria andLastModifiedNotBetween(String value1, String value2) {
            addCriterion("last_modified not between", value1, value2, "lastModified");
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
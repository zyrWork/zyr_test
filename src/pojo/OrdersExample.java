package pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
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

        public Criteria andOrderSerialIsNull() {
            addCriterion("order_serial is null");
            return (Criteria) this;
        }

        public Criteria andOrderSerialIsNotNull() {
            addCriterion("order_serial is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSerialEqualTo(Integer value) {
            addCriterion("order_serial =", value, "orderSerial");
            return (Criteria) this;
        }

        public Criteria andOrderSerialNotEqualTo(Integer value) {
            addCriterion("order_serial <>", value, "orderSerial");
            return (Criteria) this;
        }

        public Criteria andOrderSerialGreaterThan(Integer value) {
            addCriterion("order_serial >", value, "orderSerial");
            return (Criteria) this;
        }

        public Criteria andOrderSerialGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_serial >=", value, "orderSerial");
            return (Criteria) this;
        }

        public Criteria andOrderSerialLessThan(Integer value) {
            addCriterion("order_serial <", value, "orderSerial");
            return (Criteria) this;
        }

        public Criteria andOrderSerialLessThanOrEqualTo(Integer value) {
            addCriterion("order_serial <=", value, "orderSerial");
            return (Criteria) this;
        }

        public Criteria andOrderSerialIn(List<Integer> values) {
            addCriterion("order_serial in", values, "orderSerial");
            return (Criteria) this;
        }

        public Criteria andOrderSerialNotIn(List<Integer> values) {
            addCriterion("order_serial not in", values, "orderSerial");
            return (Criteria) this;
        }

        public Criteria andOrderSerialBetween(Integer value1, Integer value2) {
            addCriterion("order_serial between", value1, value2, "orderSerial");
            return (Criteria) this;
        }

        public Criteria andOrderSerialNotBetween(Integer value1, Integer value2) {
            addCriterion("order_serial not between", value1, value2, "orderSerial");
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

        public Criteria andOrderIdEqualTo(String value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(String value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(String value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(String value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(String value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLike(String value) {
            addCriterion("order_id like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotLike(String value) {
            addCriterion("order_id not like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<String> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<String> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(String value1, String value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(String value1, String value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
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

        public Criteria andOrderStatusIsNull() {
            addCriterion("order_status is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNotNull() {
            addCriterion("order_status is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusEqualTo(Short value) {
            addCriterion("order_status =", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotEqualTo(Short value) {
            addCriterion("order_status <>", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThan(Short value) {
            addCriterion("order_status >", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("order_status >=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThan(Short value) {
            addCriterion("order_status <", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThanOrEqualTo(Short value) {
            addCriterion("order_status <=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIn(List<Short> values) {
            addCriterion("order_status in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotIn(List<Short> values) {
            addCriterion("order_status not in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusBetween(Short value1, Short value2) {
            addCriterion("order_status between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotBetween(Short value1, Short value2) {
            addCriterion("order_status not between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNull() {
            addCriterion("order_type is null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNotNull() {
            addCriterion("order_type is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeEqualTo(Short value) {
            addCriterion("order_type =", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotEqualTo(Short value) {
            addCriterion("order_type <>", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThan(Short value) {
            addCriterion("order_type >", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("order_type >=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThan(Short value) {
            addCriterion("order_type <", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThanOrEqualTo(Short value) {
            addCriterion("order_type <=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIn(List<Short> values) {
            addCriterion("order_type in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotIn(List<Short> values) {
            addCriterion("order_type not in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeBetween(Short value1, Short value2) {
            addCriterion("order_type between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotBetween(Short value1, Short value2) {
            addCriterion("order_type not between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andWatingStartTimeIsNull() {
            addCriterion("wating_start_time is null");
            return (Criteria) this;
        }

        public Criteria andWatingStartTimeIsNotNull() {
            addCriterion("wating_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andWatingStartTimeEqualTo(String value) {
            addCriterion("wating_start_time =", value, "watingStartTime");
            return (Criteria) this;
        }

        public Criteria andWatingStartTimeNotEqualTo(String value) {
            addCriterion("wating_start_time <>", value, "watingStartTime");
            return (Criteria) this;
        }

        public Criteria andWatingStartTimeGreaterThan(String value) {
            addCriterion("wating_start_time >", value, "watingStartTime");
            return (Criteria) this;
        }

        public Criteria andWatingStartTimeGreaterThanOrEqualTo(String value) {
            addCriterion("wating_start_time >=", value, "watingStartTime");
            return (Criteria) this;
        }

        public Criteria andWatingStartTimeLessThan(String value) {
            addCriterion("wating_start_time <", value, "watingStartTime");
            return (Criteria) this;
        }

        public Criteria andWatingStartTimeLessThanOrEqualTo(String value) {
            addCriterion("wating_start_time <=", value, "watingStartTime");
            return (Criteria) this;
        }

        public Criteria andWatingStartTimeLike(String value) {
            addCriterion("wating_start_time like", value, "watingStartTime");
            return (Criteria) this;
        }

        public Criteria andWatingStartTimeNotLike(String value) {
            addCriterion("wating_start_time not like", value, "watingStartTime");
            return (Criteria) this;
        }

        public Criteria andWatingStartTimeIn(List<String> values) {
            addCriterion("wating_start_time in", values, "watingStartTime");
            return (Criteria) this;
        }

        public Criteria andWatingStartTimeNotIn(List<String> values) {
            addCriterion("wating_start_time not in", values, "watingStartTime");
            return (Criteria) this;
        }

        public Criteria andWatingStartTimeBetween(String value1, String value2) {
            addCriterion("wating_start_time between", value1, value2, "watingStartTime");
            return (Criteria) this;
        }

        public Criteria andWatingStartTimeNotBetween(String value1, String value2) {
            addCriterion("wating_start_time not between", value1, value2, "watingStartTime");
            return (Criteria) this;
        }

        public Criteria andWaitingEndTimeIsNull() {
            addCriterion("waiting_end_time is null");
            return (Criteria) this;
        }

        public Criteria andWaitingEndTimeIsNotNull() {
            addCriterion("waiting_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andWaitingEndTimeEqualTo(String value) {
            addCriterion("waiting_end_time =", value, "waitingEndTime");
            return (Criteria) this;
        }

        public Criteria andWaitingEndTimeNotEqualTo(String value) {
            addCriterion("waiting_end_time <>", value, "waitingEndTime");
            return (Criteria) this;
        }

        public Criteria andWaitingEndTimeGreaterThan(String value) {
            addCriterion("waiting_end_time >", value, "waitingEndTime");
            return (Criteria) this;
        }

        public Criteria andWaitingEndTimeGreaterThanOrEqualTo(String value) {
            addCriterion("waiting_end_time >=", value, "waitingEndTime");
            return (Criteria) this;
        }

        public Criteria andWaitingEndTimeLessThan(String value) {
            addCriterion("waiting_end_time <", value, "waitingEndTime");
            return (Criteria) this;
        }

        public Criteria andWaitingEndTimeLessThanOrEqualTo(String value) {
            addCriterion("waiting_end_time <=", value, "waitingEndTime");
            return (Criteria) this;
        }

        public Criteria andWaitingEndTimeLike(String value) {
            addCriterion("waiting_end_time like", value, "waitingEndTime");
            return (Criteria) this;
        }

        public Criteria andWaitingEndTimeNotLike(String value) {
            addCriterion("waiting_end_time not like", value, "waitingEndTime");
            return (Criteria) this;
        }

        public Criteria andWaitingEndTimeIn(List<String> values) {
            addCriterion("waiting_end_time in", values, "waitingEndTime");
            return (Criteria) this;
        }

        public Criteria andWaitingEndTimeNotIn(List<String> values) {
            addCriterion("waiting_end_time not in", values, "waitingEndTime");
            return (Criteria) this;
        }

        public Criteria andWaitingEndTimeBetween(String value1, String value2) {
            addCriterion("waiting_end_time between", value1, value2, "waitingEndTime");
            return (Criteria) this;
        }

        public Criteria andWaitingEndTimeNotBetween(String value1, String value2) {
            addCriterion("waiting_end_time not between", value1, value2, "waitingEndTime");
            return (Criteria) this;
        }

        public Criteria andEattingEndTimeIsNull() {
            addCriterion("eatting_end_time is null");
            return (Criteria) this;
        }

        public Criteria andEattingEndTimeIsNotNull() {
            addCriterion("eatting_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEattingEndTimeEqualTo(String value) {
            addCriterion("eatting_end_time =", value, "eattingEndTime");
            return (Criteria) this;
        }

        public Criteria andEattingEndTimeNotEqualTo(String value) {
            addCriterion("eatting_end_time <>", value, "eattingEndTime");
            return (Criteria) this;
        }

        public Criteria andEattingEndTimeGreaterThan(String value) {
            addCriterion("eatting_end_time >", value, "eattingEndTime");
            return (Criteria) this;
        }

        public Criteria andEattingEndTimeGreaterThanOrEqualTo(String value) {
            addCriterion("eatting_end_time >=", value, "eattingEndTime");
            return (Criteria) this;
        }

        public Criteria andEattingEndTimeLessThan(String value) {
            addCriterion("eatting_end_time <", value, "eattingEndTime");
            return (Criteria) this;
        }

        public Criteria andEattingEndTimeLessThanOrEqualTo(String value) {
            addCriterion("eatting_end_time <=", value, "eattingEndTime");
            return (Criteria) this;
        }

        public Criteria andEattingEndTimeLike(String value) {
            addCriterion("eatting_end_time like", value, "eattingEndTime");
            return (Criteria) this;
        }

        public Criteria andEattingEndTimeNotLike(String value) {
            addCriterion("eatting_end_time not like", value, "eattingEndTime");
            return (Criteria) this;
        }

        public Criteria andEattingEndTimeIn(List<String> values) {
            addCriterion("eatting_end_time in", values, "eattingEndTime");
            return (Criteria) this;
        }

        public Criteria andEattingEndTimeNotIn(List<String> values) {
            addCriterion("eatting_end_time not in", values, "eattingEndTime");
            return (Criteria) this;
        }

        public Criteria andEattingEndTimeBetween(String value1, String value2) {
            addCriterion("eatting_end_time between", value1, value2, "eattingEndTime");
            return (Criteria) this;
        }

        public Criteria andEattingEndTimeNotBetween(String value1, String value2) {
            addCriterion("eatting_end_time not between", value1, value2, "eattingEndTime");
            return (Criteria) this;
        }

        public Criteria andDeskNumberIsNull() {
            addCriterion("desk_number is null");
            return (Criteria) this;
        }

        public Criteria andDeskNumberIsNotNull() {
            addCriterion("desk_number is not null");
            return (Criteria) this;
        }

        public Criteria andDeskNumberEqualTo(Short value) {
            addCriterion("desk_number =", value, "deskNumber");
            return (Criteria) this;
        }

        public Criteria andDeskNumberNotEqualTo(Short value) {
            addCriterion("desk_number <>", value, "deskNumber");
            return (Criteria) this;
        }

        public Criteria andDeskNumberGreaterThan(Short value) {
            addCriterion("desk_number >", value, "deskNumber");
            return (Criteria) this;
        }

        public Criteria andDeskNumberGreaterThanOrEqualTo(Short value) {
            addCriterion("desk_number >=", value, "deskNumber");
            return (Criteria) this;
        }

        public Criteria andDeskNumberLessThan(Short value) {
            addCriterion("desk_number <", value, "deskNumber");
            return (Criteria) this;
        }

        public Criteria andDeskNumberLessThanOrEqualTo(Short value) {
            addCriterion("desk_number <=", value, "deskNumber");
            return (Criteria) this;
        }

        public Criteria andDeskNumberIn(List<Short> values) {
            addCriterion("desk_number in", values, "deskNumber");
            return (Criteria) this;
        }

        public Criteria andDeskNumberNotIn(List<Short> values) {
            addCriterion("desk_number not in", values, "deskNumber");
            return (Criteria) this;
        }

        public Criteria andDeskNumberBetween(Short value1, Short value2) {
            addCriterion("desk_number between", value1, value2, "deskNumber");
            return (Criteria) this;
        }

        public Criteria andDeskNumberNotBetween(Short value1, Short value2) {
            addCriterion("desk_number not between", value1, value2, "deskNumber");
            return (Criteria) this;
        }

        public Criteria andDishOriginTotalPriceIsNull() {
            addCriterion("dish_origin_total_price is null");
            return (Criteria) this;
        }

        public Criteria andDishOriginTotalPriceIsNotNull() {
            addCriterion("dish_origin_total_price is not null");
            return (Criteria) this;
        }

        public Criteria andDishOriginTotalPriceEqualTo(BigDecimal value) {
            addCriterion("dish_origin_total_price =", value, "dishOriginTotalPrice");
            return (Criteria) this;
        }

        public Criteria andDishOriginTotalPriceNotEqualTo(BigDecimal value) {
            addCriterion("dish_origin_total_price <>", value, "dishOriginTotalPrice");
            return (Criteria) this;
        }

        public Criteria andDishOriginTotalPriceGreaterThan(BigDecimal value) {
            addCriterion("dish_origin_total_price >", value, "dishOriginTotalPrice");
            return (Criteria) this;
        }

        public Criteria andDishOriginTotalPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("dish_origin_total_price >=", value, "dishOriginTotalPrice");
            return (Criteria) this;
        }

        public Criteria andDishOriginTotalPriceLessThan(BigDecimal value) {
            addCriterion("dish_origin_total_price <", value, "dishOriginTotalPrice");
            return (Criteria) this;
        }

        public Criteria andDishOriginTotalPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("dish_origin_total_price <=", value, "dishOriginTotalPrice");
            return (Criteria) this;
        }

        public Criteria andDishOriginTotalPriceIn(List<BigDecimal> values) {
            addCriterion("dish_origin_total_price in", values, "dishOriginTotalPrice");
            return (Criteria) this;
        }

        public Criteria andDishOriginTotalPriceNotIn(List<BigDecimal> values) {
            addCriterion("dish_origin_total_price not in", values, "dishOriginTotalPrice");
            return (Criteria) this;
        }

        public Criteria andDishOriginTotalPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dish_origin_total_price between", value1, value2, "dishOriginTotalPrice");
            return (Criteria) this;
        }

        public Criteria andDishOriginTotalPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dish_origin_total_price not between", value1, value2, "dishOriginTotalPrice");
            return (Criteria) this;
        }

        public Criteria andDishDiscountTotalPriceIsNull() {
            addCriterion("dish_discount_total_price is null");
            return (Criteria) this;
        }

        public Criteria andDishDiscountTotalPriceIsNotNull() {
            addCriterion("dish_discount_total_price is not null");
            return (Criteria) this;
        }

        public Criteria andDishDiscountTotalPriceEqualTo(BigDecimal value) {
            addCriterion("dish_discount_total_price =", value, "dishDiscountTotalPrice");
            return (Criteria) this;
        }

        public Criteria andDishDiscountTotalPriceNotEqualTo(BigDecimal value) {
            addCriterion("dish_discount_total_price <>", value, "dishDiscountTotalPrice");
            return (Criteria) this;
        }

        public Criteria andDishDiscountTotalPriceGreaterThan(BigDecimal value) {
            addCriterion("dish_discount_total_price >", value, "dishDiscountTotalPrice");
            return (Criteria) this;
        }

        public Criteria andDishDiscountTotalPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("dish_discount_total_price >=", value, "dishDiscountTotalPrice");
            return (Criteria) this;
        }

        public Criteria andDishDiscountTotalPriceLessThan(BigDecimal value) {
            addCriterion("dish_discount_total_price <", value, "dishDiscountTotalPrice");
            return (Criteria) this;
        }

        public Criteria andDishDiscountTotalPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("dish_discount_total_price <=", value, "dishDiscountTotalPrice");
            return (Criteria) this;
        }

        public Criteria andDishDiscountTotalPriceIn(List<BigDecimal> values) {
            addCriterion("dish_discount_total_price in", values, "dishDiscountTotalPrice");
            return (Criteria) this;
        }

        public Criteria andDishDiscountTotalPriceNotIn(List<BigDecimal> values) {
            addCriterion("dish_discount_total_price not in", values, "dishDiscountTotalPrice");
            return (Criteria) this;
        }

        public Criteria andDishDiscountTotalPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dish_discount_total_price between", value1, value2, "dishDiscountTotalPrice");
            return (Criteria) this;
        }

        public Criteria andDishDiscountTotalPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dish_discount_total_price not between", value1, value2, "dishDiscountTotalPrice");
            return (Criteria) this;
        }

        public Criteria andShopDiscountIsNull() {
            addCriterion("shop_discount is null");
            return (Criteria) this;
        }

        public Criteria andShopDiscountIsNotNull() {
            addCriterion("shop_discount is not null");
            return (Criteria) this;
        }

        public Criteria andShopDiscountEqualTo(Float value) {
            addCriterion("shop_discount =", value, "shopDiscount");
            return (Criteria) this;
        }

        public Criteria andShopDiscountNotEqualTo(Float value) {
            addCriterion("shop_discount <>", value, "shopDiscount");
            return (Criteria) this;
        }

        public Criteria andShopDiscountGreaterThan(Float value) {
            addCriterion("shop_discount >", value, "shopDiscount");
            return (Criteria) this;
        }

        public Criteria andShopDiscountGreaterThanOrEqualTo(Float value) {
            addCriterion("shop_discount >=", value, "shopDiscount");
            return (Criteria) this;
        }

        public Criteria andShopDiscountLessThan(Float value) {
            addCriterion("shop_discount <", value, "shopDiscount");
            return (Criteria) this;
        }

        public Criteria andShopDiscountLessThanOrEqualTo(Float value) {
            addCriterion("shop_discount <=", value, "shopDiscount");
            return (Criteria) this;
        }

        public Criteria andShopDiscountIn(List<Float> values) {
            addCriterion("shop_discount in", values, "shopDiscount");
            return (Criteria) this;
        }

        public Criteria andShopDiscountNotIn(List<Float> values) {
            addCriterion("shop_discount not in", values, "shopDiscount");
            return (Criteria) this;
        }

        public Criteria andShopDiscountBetween(Float value1, Float value2) {
            addCriterion("shop_discount between", value1, value2, "shopDiscount");
            return (Criteria) this;
        }

        public Criteria andShopDiscountNotBetween(Float value1, Float value2) {
            addCriterion("shop_discount not between", value1, value2, "shopDiscount");
            return (Criteria) this;
        }

        public Criteria andPayTotalPriceIsNull() {
            addCriterion("pay_total_price is null");
            return (Criteria) this;
        }

        public Criteria andPayTotalPriceIsNotNull() {
            addCriterion("pay_total_price is not null");
            return (Criteria) this;
        }

        public Criteria andPayTotalPriceEqualTo(BigDecimal value) {
            addCriterion("pay_total_price =", value, "payTotalPrice");
            return (Criteria) this;
        }

        public Criteria andPayTotalPriceNotEqualTo(BigDecimal value) {
            addCriterion("pay_total_price <>", value, "payTotalPrice");
            return (Criteria) this;
        }

        public Criteria andPayTotalPriceGreaterThan(BigDecimal value) {
            addCriterion("pay_total_price >", value, "payTotalPrice");
            return (Criteria) this;
        }

        public Criteria andPayTotalPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pay_total_price >=", value, "payTotalPrice");
            return (Criteria) this;
        }

        public Criteria andPayTotalPriceLessThan(BigDecimal value) {
            addCriterion("pay_total_price <", value, "payTotalPrice");
            return (Criteria) this;
        }

        public Criteria andPayTotalPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pay_total_price <=", value, "payTotalPrice");
            return (Criteria) this;
        }

        public Criteria andPayTotalPriceIn(List<BigDecimal> values) {
            addCriterion("pay_total_price in", values, "payTotalPrice");
            return (Criteria) this;
        }

        public Criteria andPayTotalPriceNotIn(List<BigDecimal> values) {
            addCriterion("pay_total_price not in", values, "payTotalPrice");
            return (Criteria) this;
        }

        public Criteria andPayTotalPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pay_total_price between", value1, value2, "payTotalPrice");
            return (Criteria) this;
        }

        public Criteria andPayTotalPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pay_total_price not between", value1, value2, "payTotalPrice");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNull() {
            addCriterion("pay_type is null");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNotNull() {
            addCriterion("pay_type is not null");
            return (Criteria) this;
        }

        public Criteria andPayTypeEqualTo(Short value) {
            addCriterion("pay_type =", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotEqualTo(Short value) {
            addCriterion("pay_type <>", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThan(Short value) {
            addCriterion("pay_type >", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("pay_type >=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThan(Short value) {
            addCriterion("pay_type <", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThanOrEqualTo(Short value) {
            addCriterion("pay_type <=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeIn(List<Short> values) {
            addCriterion("pay_type in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotIn(List<Short> values) {
            addCriterion("pay_type not in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeBetween(Short value1, Short value2) {
            addCriterion("pay_type between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotBetween(Short value1, Short value2) {
            addCriterion("pay_type not between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andTransactionIdIsNull() {
            addCriterion("transaction_id is null");
            return (Criteria) this;
        }

        public Criteria andTransactionIdIsNotNull() {
            addCriterion("transaction_id is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionIdEqualTo(String value) {
            addCriterion("transaction_id =", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdNotEqualTo(String value) {
            addCriterion("transaction_id <>", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdGreaterThan(String value) {
            addCriterion("transaction_id >", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdGreaterThanOrEqualTo(String value) {
            addCriterion("transaction_id >=", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdLessThan(String value) {
            addCriterion("transaction_id <", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdLessThanOrEqualTo(String value) {
            addCriterion("transaction_id <=", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdLike(String value) {
            addCriterion("transaction_id like", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdNotLike(String value) {
            addCriterion("transaction_id not like", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdIn(List<String> values) {
            addCriterion("transaction_id in", values, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdNotIn(List<String> values) {
            addCriterion("transaction_id not in", values, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdBetween(String value1, String value2) {
            addCriterion("transaction_id between", value1, value2, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdNotBetween(String value1, String value2) {
            addCriterion("transaction_id not between", value1, value2, "transactionId");
            return (Criteria) this;
        }

        public Criteria andPayStatusIsNull() {
            addCriterion("pay_status is null");
            return (Criteria) this;
        }

        public Criteria andPayStatusIsNotNull() {
            addCriterion("pay_status is not null");
            return (Criteria) this;
        }

        public Criteria andPayStatusEqualTo(Short value) {
            addCriterion("pay_status =", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotEqualTo(Short value) {
            addCriterion("pay_status <>", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusGreaterThan(Short value) {
            addCriterion("pay_status >", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("pay_status >=", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLessThan(Short value) {
            addCriterion("pay_status <", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLessThanOrEqualTo(Short value) {
            addCriterion("pay_status <=", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusIn(List<Short> values) {
            addCriterion("pay_status in", values, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotIn(List<Short> values) {
            addCriterion("pay_status not in", values, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusBetween(Short value1, Short value2) {
            addCriterion("pay_status between", value1, value2, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotBetween(Short value1, Short value2) {
            addCriterion("pay_status not between", value1, value2, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNull() {
            addCriterion("pay_time is null");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNotNull() {
            addCriterion("pay_time is not null");
            return (Criteria) this;
        }

        public Criteria andPayTimeEqualTo(String value) {
            addCriterion("pay_time =", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotEqualTo(String value) {
            addCriterion("pay_time <>", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThan(String value) {
            addCriterion("pay_time >", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThanOrEqualTo(String value) {
            addCriterion("pay_time >=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThan(String value) {
            addCriterion("pay_time <", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThanOrEqualTo(String value) {
            addCriterion("pay_time <=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLike(String value) {
            addCriterion("pay_time like", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotLike(String value) {
            addCriterion("pay_time not like", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeIn(List<String> values) {
            addCriterion("pay_time in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotIn(List<String> values) {
            addCriterion("pay_time not in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeBetween(String value1, String value2) {
            addCriterion("pay_time between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotBetween(String value1, String value2) {
            addCriterion("pay_time not between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleIsNull() {
            addCriterion("invoice_title is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleIsNotNull() {
            addCriterion("invoice_title is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleEqualTo(String value) {
            addCriterion("invoice_title =", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleNotEqualTo(String value) {
            addCriterion("invoice_title <>", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleGreaterThan(String value) {
            addCriterion("invoice_title >", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleGreaterThanOrEqualTo(String value) {
            addCriterion("invoice_title >=", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleLessThan(String value) {
            addCriterion("invoice_title <", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleLessThanOrEqualTo(String value) {
            addCriterion("invoice_title <=", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleLike(String value) {
            addCriterion("invoice_title like", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleNotLike(String value) {
            addCriterion("invoice_title not like", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleIn(List<String> values) {
            addCriterion("invoice_title in", values, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleNotIn(List<String> values) {
            addCriterion("invoice_title not in", values, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleBetween(String value1, String value2) {
            addCriterion("invoice_title between", value1, value2, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleNotBetween(String value1, String value2) {
            addCriterion("invoice_title not between", value1, value2, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoIsNull() {
            addCriterion("invoice_no is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoIsNotNull() {
            addCriterion("invoice_no is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoEqualTo(String value) {
            addCriterion("invoice_no =", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoNotEqualTo(String value) {
            addCriterion("invoice_no <>", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoGreaterThan(String value) {
            addCriterion("invoice_no >", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoGreaterThanOrEqualTo(String value) {
            addCriterion("invoice_no >=", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoLessThan(String value) {
            addCriterion("invoice_no <", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoLessThanOrEqualTo(String value) {
            addCriterion("invoice_no <=", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoLike(String value) {
            addCriterion("invoice_no like", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoNotLike(String value) {
            addCriterion("invoice_no not like", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoIn(List<String> values) {
            addCriterion("invoice_no in", values, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoNotIn(List<String> values) {
            addCriterion("invoice_no not in", values, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoBetween(String value1, String value2) {
            addCriterion("invoice_no between", value1, value2, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoNotBetween(String value1, String value2) {
            addCriterion("invoice_no not between", value1, value2, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIsNull() {
            addCriterion("invoice_type is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIsNotNull() {
            addCriterion("invoice_type is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeEqualTo(Short value) {
            addCriterion("invoice_type =", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNotEqualTo(Short value) {
            addCriterion("invoice_type <>", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeGreaterThan(Short value) {
            addCriterion("invoice_type >", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("invoice_type >=", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeLessThan(Short value) {
            addCriterion("invoice_type <", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeLessThanOrEqualTo(Short value) {
            addCriterion("invoice_type <=", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIn(List<Short> values) {
            addCriterion("invoice_type in", values, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNotIn(List<Short> values) {
            addCriterion("invoice_type not in", values, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeBetween(Short value1, Short value2) {
            addCriterion("invoice_type between", value1, value2, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNotBetween(Short value1, Short value2) {
            addCriterion("invoice_type not between", value1, value2, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceCodeIsNull() {
            addCriterion("invoice_code is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceCodeIsNotNull() {
            addCriterion("invoice_code is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceCodeEqualTo(String value) {
            addCriterion("invoice_code =", value, "invoiceCode");
            return (Criteria) this;
        }

        public Criteria andInvoiceCodeNotEqualTo(String value) {
            addCriterion("invoice_code <>", value, "invoiceCode");
            return (Criteria) this;
        }

        public Criteria andInvoiceCodeGreaterThan(String value) {
            addCriterion("invoice_code >", value, "invoiceCode");
            return (Criteria) this;
        }

        public Criteria andInvoiceCodeGreaterThanOrEqualTo(String value) {
            addCriterion("invoice_code >=", value, "invoiceCode");
            return (Criteria) this;
        }

        public Criteria andInvoiceCodeLessThan(String value) {
            addCriterion("invoice_code <", value, "invoiceCode");
            return (Criteria) this;
        }

        public Criteria andInvoiceCodeLessThanOrEqualTo(String value) {
            addCriterion("invoice_code <=", value, "invoiceCode");
            return (Criteria) this;
        }

        public Criteria andInvoiceCodeLike(String value) {
            addCriterion("invoice_code like", value, "invoiceCode");
            return (Criteria) this;
        }

        public Criteria andInvoiceCodeNotLike(String value) {
            addCriterion("invoice_code not like", value, "invoiceCode");
            return (Criteria) this;
        }

        public Criteria andInvoiceCodeIn(List<String> values) {
            addCriterion("invoice_code in", values, "invoiceCode");
            return (Criteria) this;
        }

        public Criteria andInvoiceCodeNotIn(List<String> values) {
            addCriterion("invoice_code not in", values, "invoiceCode");
            return (Criteria) this;
        }

        public Criteria andInvoiceCodeBetween(String value1, String value2) {
            addCriterion("invoice_code between", value1, value2, "invoiceCode");
            return (Criteria) this;
        }

        public Criteria andInvoiceCodeNotBetween(String value1, String value2) {
            addCriterion("invoice_code not between", value1, value2, "invoiceCode");
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
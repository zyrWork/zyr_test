package pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TakeoutExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TakeoutExample() {
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

        public Criteria andTakeoutSerialIsNull() {
            addCriterion("takeout_serial is null");
            return (Criteria) this;
        }

        public Criteria andTakeoutSerialIsNotNull() {
            addCriterion("takeout_serial is not null");
            return (Criteria) this;
        }

        public Criteria andTakeoutSerialEqualTo(Integer value) {
            addCriterion("takeout_serial =", value, "takeoutSerial");
            return (Criteria) this;
        }

        public Criteria andTakeoutSerialNotEqualTo(Integer value) {
            addCriterion("takeout_serial <>", value, "takeoutSerial");
            return (Criteria) this;
        }

        public Criteria andTakeoutSerialGreaterThan(Integer value) {
            addCriterion("takeout_serial >", value, "takeoutSerial");
            return (Criteria) this;
        }

        public Criteria andTakeoutSerialGreaterThanOrEqualTo(Integer value) {
            addCriterion("takeout_serial >=", value, "takeoutSerial");
            return (Criteria) this;
        }

        public Criteria andTakeoutSerialLessThan(Integer value) {
            addCriterion("takeout_serial <", value, "takeoutSerial");
            return (Criteria) this;
        }

        public Criteria andTakeoutSerialLessThanOrEqualTo(Integer value) {
            addCriterion("takeout_serial <=", value, "takeoutSerial");
            return (Criteria) this;
        }

        public Criteria andTakeoutSerialIn(List<Integer> values) {
            addCriterion("takeout_serial in", values, "takeoutSerial");
            return (Criteria) this;
        }

        public Criteria andTakeoutSerialNotIn(List<Integer> values) {
            addCriterion("takeout_serial not in", values, "takeoutSerial");
            return (Criteria) this;
        }

        public Criteria andTakeoutSerialBetween(Integer value1, Integer value2) {
            addCriterion("takeout_serial between", value1, value2, "takeoutSerial");
            return (Criteria) this;
        }

        public Criteria andTakeoutSerialNotBetween(Integer value1, Integer value2) {
            addCriterion("takeout_serial not between", value1, value2, "takeoutSerial");
            return (Criteria) this;
        }

        public Criteria andTakeoutIdIsNull() {
            addCriterion("takeout_id is null");
            return (Criteria) this;
        }

        public Criteria andTakeoutIdIsNotNull() {
            addCriterion("takeout_id is not null");
            return (Criteria) this;
        }

        public Criteria andTakeoutIdEqualTo(Integer value) {
            addCriterion("takeout_id =", value, "takeoutId");
            return (Criteria) this;
        }

        public Criteria andTakeoutIdNotEqualTo(Integer value) {
            addCriterion("takeout_id <>", value, "takeoutId");
            return (Criteria) this;
        }

        public Criteria andTakeoutIdGreaterThan(Integer value) {
            addCriterion("takeout_id >", value, "takeoutId");
            return (Criteria) this;
        }

        public Criteria andTakeoutIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("takeout_id >=", value, "takeoutId");
            return (Criteria) this;
        }

        public Criteria andTakeoutIdLessThan(Integer value) {
            addCriterion("takeout_id <", value, "takeoutId");
            return (Criteria) this;
        }

        public Criteria andTakeoutIdLessThanOrEqualTo(Integer value) {
            addCriterion("takeout_id <=", value, "takeoutId");
            return (Criteria) this;
        }

        public Criteria andTakeoutIdIn(List<Integer> values) {
            addCriterion("takeout_id in", values, "takeoutId");
            return (Criteria) this;
        }

        public Criteria andTakeoutIdNotIn(List<Integer> values) {
            addCriterion("takeout_id not in", values, "takeoutId");
            return (Criteria) this;
        }

        public Criteria andTakeoutIdBetween(Integer value1, Integer value2) {
            addCriterion("takeout_id between", value1, value2, "takeoutId");
            return (Criteria) this;
        }

        public Criteria andTakeoutIdNotBetween(Integer value1, Integer value2) {
            addCriterion("takeout_id not between", value1, value2, "takeoutId");
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

        public Criteria andTakeoutStatusIsNull() {
            addCriterion("takeout_status is null");
            return (Criteria) this;
        }

        public Criteria andTakeoutStatusIsNotNull() {
            addCriterion("takeout_status is not null");
            return (Criteria) this;
        }

        public Criteria andTakeoutStatusEqualTo(Short value) {
            addCriterion("takeout_status =", value, "takeoutStatus");
            return (Criteria) this;
        }

        public Criteria andTakeoutStatusNotEqualTo(Short value) {
            addCriterion("takeout_status <>", value, "takeoutStatus");
            return (Criteria) this;
        }

        public Criteria andTakeoutStatusGreaterThan(Short value) {
            addCriterion("takeout_status >", value, "takeoutStatus");
            return (Criteria) this;
        }

        public Criteria andTakeoutStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("takeout_status >=", value, "takeoutStatus");
            return (Criteria) this;
        }

        public Criteria andTakeoutStatusLessThan(Short value) {
            addCriterion("takeout_status <", value, "takeoutStatus");
            return (Criteria) this;
        }

        public Criteria andTakeoutStatusLessThanOrEqualTo(Short value) {
            addCriterion("takeout_status <=", value, "takeoutStatus");
            return (Criteria) this;
        }

        public Criteria andTakeoutStatusIn(List<Short> values) {
            addCriterion("takeout_status in", values, "takeoutStatus");
            return (Criteria) this;
        }

        public Criteria andTakeoutStatusNotIn(List<Short> values) {
            addCriterion("takeout_status not in", values, "takeoutStatus");
            return (Criteria) this;
        }

        public Criteria andTakeoutStatusBetween(Short value1, Short value2) {
            addCriterion("takeout_status between", value1, value2, "takeoutStatus");
            return (Criteria) this;
        }

        public Criteria andTakeoutStatusNotBetween(Short value1, Short value2) {
            addCriterion("takeout_status not between", value1, value2, "takeoutStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerTelIsNull() {
            addCriterion("customer_tel is null");
            return (Criteria) this;
        }

        public Criteria andCustomerTelIsNotNull() {
            addCriterion("customer_tel is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerTelEqualTo(String value) {
            addCriterion("customer_tel =", value, "customerTel");
            return (Criteria) this;
        }

        public Criteria andCustomerTelNotEqualTo(String value) {
            addCriterion("customer_tel <>", value, "customerTel");
            return (Criteria) this;
        }

        public Criteria andCustomerTelGreaterThan(String value) {
            addCriterion("customer_tel >", value, "customerTel");
            return (Criteria) this;
        }

        public Criteria andCustomerTelGreaterThanOrEqualTo(String value) {
            addCriterion("customer_tel >=", value, "customerTel");
            return (Criteria) this;
        }

        public Criteria andCustomerTelLessThan(String value) {
            addCriterion("customer_tel <", value, "customerTel");
            return (Criteria) this;
        }

        public Criteria andCustomerTelLessThanOrEqualTo(String value) {
            addCriterion("customer_tel <=", value, "customerTel");
            return (Criteria) this;
        }

        public Criteria andCustomerTelLike(String value) {
            addCriterion("customer_tel like", value, "customerTel");
            return (Criteria) this;
        }

        public Criteria andCustomerTelNotLike(String value) {
            addCriterion("customer_tel not like", value, "customerTel");
            return (Criteria) this;
        }

        public Criteria andCustomerTelIn(List<String> values) {
            addCriterion("customer_tel in", values, "customerTel");
            return (Criteria) this;
        }

        public Criteria andCustomerTelNotIn(List<String> values) {
            addCriterion("customer_tel not in", values, "customerTel");
            return (Criteria) this;
        }

        public Criteria andCustomerTelBetween(String value1, String value2) {
            addCriterion("customer_tel between", value1, value2, "customerTel");
            return (Criteria) this;
        }

        public Criteria andCustomerTelNotBetween(String value1, String value2) {
            addCriterion("customer_tel not between", value1, value2, "customerTel");
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

        public Criteria andPayPriceIsNull() {
            addCriterion("pay_price is null");
            return (Criteria) this;
        }

        public Criteria andPayPriceIsNotNull() {
            addCriterion("pay_price is not null");
            return (Criteria) this;
        }

        public Criteria andPayPriceEqualTo(BigDecimal value) {
            addCriterion("pay_price =", value, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceNotEqualTo(BigDecimal value) {
            addCriterion("pay_price <>", value, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceGreaterThan(BigDecimal value) {
            addCriterion("pay_price >", value, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pay_price >=", value, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceLessThan(BigDecimal value) {
            addCriterion("pay_price <", value, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pay_price <=", value, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceIn(List<BigDecimal> values) {
            addCriterion("pay_price in", values, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceNotIn(List<BigDecimal> values) {
            addCriterion("pay_price not in", values, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pay_price between", value1, value2, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pay_price not between", value1, value2, "payPrice");
            return (Criteria) this;
        }

        public Criteria andDeliveryNameIsNull() {
            addCriterion("delivery_name is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryNameIsNotNull() {
            addCriterion("delivery_name is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryNameEqualTo(String value) {
            addCriterion("delivery_name =", value, "deliveryName");
            return (Criteria) this;
        }

        public Criteria andDeliveryNameNotEqualTo(String value) {
            addCriterion("delivery_name <>", value, "deliveryName");
            return (Criteria) this;
        }

        public Criteria andDeliveryNameGreaterThan(String value) {
            addCriterion("delivery_name >", value, "deliveryName");
            return (Criteria) this;
        }

        public Criteria andDeliveryNameGreaterThanOrEqualTo(String value) {
            addCriterion("delivery_name >=", value, "deliveryName");
            return (Criteria) this;
        }

        public Criteria andDeliveryNameLessThan(String value) {
            addCriterion("delivery_name <", value, "deliveryName");
            return (Criteria) this;
        }

        public Criteria andDeliveryNameLessThanOrEqualTo(String value) {
            addCriterion("delivery_name <=", value, "deliveryName");
            return (Criteria) this;
        }

        public Criteria andDeliveryNameLike(String value) {
            addCriterion("delivery_name like", value, "deliveryName");
            return (Criteria) this;
        }

        public Criteria andDeliveryNameNotLike(String value) {
            addCriterion("delivery_name not like", value, "deliveryName");
            return (Criteria) this;
        }

        public Criteria andDeliveryNameIn(List<String> values) {
            addCriterion("delivery_name in", values, "deliveryName");
            return (Criteria) this;
        }

        public Criteria andDeliveryNameNotIn(List<String> values) {
            addCriterion("delivery_name not in", values, "deliveryName");
            return (Criteria) this;
        }

        public Criteria andDeliveryNameBetween(String value1, String value2) {
            addCriterion("delivery_name between", value1, value2, "deliveryName");
            return (Criteria) this;
        }

        public Criteria andDeliveryNameNotBetween(String value1, String value2) {
            addCriterion("delivery_name not between", value1, value2, "deliveryName");
            return (Criteria) this;
        }

        public Criteria andDeliveryTelIsNull() {
            addCriterion("delivery_tel is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryTelIsNotNull() {
            addCriterion("delivery_tel is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryTelEqualTo(String value) {
            addCriterion("delivery_tel =", value, "deliveryTel");
            return (Criteria) this;
        }

        public Criteria andDeliveryTelNotEqualTo(String value) {
            addCriterion("delivery_tel <>", value, "deliveryTel");
            return (Criteria) this;
        }

        public Criteria andDeliveryTelGreaterThan(String value) {
            addCriterion("delivery_tel >", value, "deliveryTel");
            return (Criteria) this;
        }

        public Criteria andDeliveryTelGreaterThanOrEqualTo(String value) {
            addCriterion("delivery_tel >=", value, "deliveryTel");
            return (Criteria) this;
        }

        public Criteria andDeliveryTelLessThan(String value) {
            addCriterion("delivery_tel <", value, "deliveryTel");
            return (Criteria) this;
        }

        public Criteria andDeliveryTelLessThanOrEqualTo(String value) {
            addCriterion("delivery_tel <=", value, "deliveryTel");
            return (Criteria) this;
        }

        public Criteria andDeliveryTelLike(String value) {
            addCriterion("delivery_tel like", value, "deliveryTel");
            return (Criteria) this;
        }

        public Criteria andDeliveryTelNotLike(String value) {
            addCriterion("delivery_tel not like", value, "deliveryTel");
            return (Criteria) this;
        }

        public Criteria andDeliveryTelIn(List<String> values) {
            addCriterion("delivery_tel in", values, "deliveryTel");
            return (Criteria) this;
        }

        public Criteria andDeliveryTelNotIn(List<String> values) {
            addCriterion("delivery_tel not in", values, "deliveryTel");
            return (Criteria) this;
        }

        public Criteria andDeliveryTelBetween(String value1, String value2) {
            addCriterion("delivery_tel between", value1, value2, "deliveryTel");
            return (Criteria) this;
        }

        public Criteria andDeliveryTelNotBetween(String value1, String value2) {
            addCriterion("delivery_tel not between", value1, value2, "deliveryTel");
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
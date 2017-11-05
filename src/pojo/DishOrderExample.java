package pojo;

import java.util.ArrayList;
import java.util.List;

public class DishOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DishOrderExample() {
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

        public Criteria andDishTableSerialIsNull() {
            addCriterion("dish_table_serial is null");
            return (Criteria) this;
        }

        public Criteria andDishTableSerialIsNotNull() {
            addCriterion("dish_table_serial is not null");
            return (Criteria) this;
        }

        public Criteria andDishTableSerialEqualTo(Integer value) {
            addCriterion("dish_table_serial =", value, "dishTableSerial");
            return (Criteria) this;
        }

        public Criteria andDishTableSerialNotEqualTo(Integer value) {
            addCriterion("dish_table_serial <>", value, "dishTableSerial");
            return (Criteria) this;
        }

        public Criteria andDishTableSerialGreaterThan(Integer value) {
            addCriterion("dish_table_serial >", value, "dishTableSerial");
            return (Criteria) this;
        }

        public Criteria andDishTableSerialGreaterThanOrEqualTo(Integer value) {
            addCriterion("dish_table_serial >=", value, "dishTableSerial");
            return (Criteria) this;
        }

        public Criteria andDishTableSerialLessThan(Integer value) {
            addCriterion("dish_table_serial <", value, "dishTableSerial");
            return (Criteria) this;
        }

        public Criteria andDishTableSerialLessThanOrEqualTo(Integer value) {
            addCriterion("dish_table_serial <=", value, "dishTableSerial");
            return (Criteria) this;
        }

        public Criteria andDishTableSerialIn(List<Integer> values) {
            addCriterion("dish_table_serial in", values, "dishTableSerial");
            return (Criteria) this;
        }

        public Criteria andDishTableSerialNotIn(List<Integer> values) {
            addCriterion("dish_table_serial not in", values, "dishTableSerial");
            return (Criteria) this;
        }

        public Criteria andDishTableSerialBetween(Integer value1, Integer value2) {
            addCriterion("dish_table_serial between", value1, value2, "dishTableSerial");
            return (Criteria) this;
        }

        public Criteria andDishTableSerialNotBetween(Integer value1, Integer value2) {
            addCriterion("dish_table_serial not between", value1, value2, "dishTableSerial");
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

        public Criteria andOrderDishTimeIsNull() {
            addCriterion("order_dish_time is null");
            return (Criteria) this;
        }

        public Criteria andOrderDishTimeIsNotNull() {
            addCriterion("order_dish_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrderDishTimeEqualTo(String value) {
            addCriterion("order_dish_time =", value, "orderDishTime");
            return (Criteria) this;
        }

        public Criteria andOrderDishTimeNotEqualTo(String value) {
            addCriterion("order_dish_time <>", value, "orderDishTime");
            return (Criteria) this;
        }

        public Criteria andOrderDishTimeGreaterThan(String value) {
            addCriterion("order_dish_time >", value, "orderDishTime");
            return (Criteria) this;
        }

        public Criteria andOrderDishTimeGreaterThanOrEqualTo(String value) {
            addCriterion("order_dish_time >=", value, "orderDishTime");
            return (Criteria) this;
        }

        public Criteria andOrderDishTimeLessThan(String value) {
            addCriterion("order_dish_time <", value, "orderDishTime");
            return (Criteria) this;
        }

        public Criteria andOrderDishTimeLessThanOrEqualTo(String value) {
            addCriterion("order_dish_time <=", value, "orderDishTime");
            return (Criteria) this;
        }

        public Criteria andOrderDishTimeLike(String value) {
            addCriterion("order_dish_time like", value, "orderDishTime");
            return (Criteria) this;
        }

        public Criteria andOrderDishTimeNotLike(String value) {
            addCriterion("order_dish_time not like", value, "orderDishTime");
            return (Criteria) this;
        }

        public Criteria andOrderDishTimeIn(List<String> values) {
            addCriterion("order_dish_time in", values, "orderDishTime");
            return (Criteria) this;
        }

        public Criteria andOrderDishTimeNotIn(List<String> values) {
            addCriterion("order_dish_time not in", values, "orderDishTime");
            return (Criteria) this;
        }

        public Criteria andOrderDishTimeBetween(String value1, String value2) {
            addCriterion("order_dish_time between", value1, value2, "orderDishTime");
            return (Criteria) this;
        }

        public Criteria andOrderDishTimeNotBetween(String value1, String value2) {
            addCriterion("order_dish_time not between", value1, value2, "orderDishTime");
            return (Criteria) this;
        }

        public Criteria andDishTableTypeIsNull() {
            addCriterion("dish_table_type is null");
            return (Criteria) this;
        }

        public Criteria andDishTableTypeIsNotNull() {
            addCriterion("dish_table_type is not null");
            return (Criteria) this;
        }

        public Criteria andDishTableTypeEqualTo(Short value) {
            addCriterion("dish_table_type =", value, "dishTableType");
            return (Criteria) this;
        }

        public Criteria andDishTableTypeNotEqualTo(Short value) {
            addCriterion("dish_table_type <>", value, "dishTableType");
            return (Criteria) this;
        }

        public Criteria andDishTableTypeGreaterThan(Short value) {
            addCriterion("dish_table_type >", value, "dishTableType");
            return (Criteria) this;
        }

        public Criteria andDishTableTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("dish_table_type >=", value, "dishTableType");
            return (Criteria) this;
        }

        public Criteria andDishTableTypeLessThan(Short value) {
            addCriterion("dish_table_type <", value, "dishTableType");
            return (Criteria) this;
        }

        public Criteria andDishTableTypeLessThanOrEqualTo(Short value) {
            addCriterion("dish_table_type <=", value, "dishTableType");
            return (Criteria) this;
        }

        public Criteria andDishTableTypeIn(List<Short> values) {
            addCriterion("dish_table_type in", values, "dishTableType");
            return (Criteria) this;
        }

        public Criteria andDishTableTypeNotIn(List<Short> values) {
            addCriterion("dish_table_type not in", values, "dishTableType");
            return (Criteria) this;
        }

        public Criteria andDishTableTypeBetween(Short value1, Short value2) {
            addCriterion("dish_table_type between", value1, value2, "dishTableType");
            return (Criteria) this;
        }

        public Criteria andDishTableTypeNotBetween(Short value1, Short value2) {
            addCriterion("dish_table_type not between", value1, value2, "dishTableType");
            return (Criteria) this;
        }

        public Criteria andIsSendIsNull() {
            addCriterion("is_send is null");
            return (Criteria) this;
        }

        public Criteria andIsSendIsNotNull() {
            addCriterion("is_send is not null");
            return (Criteria) this;
        }

        public Criteria andIsSendEqualTo(Short value) {
            addCriterion("is_send =", value, "isSend");
            return (Criteria) this;
        }

        public Criteria andIsSendNotEqualTo(Short value) {
            addCriterion("is_send <>", value, "isSend");
            return (Criteria) this;
        }

        public Criteria andIsSendGreaterThan(Short value) {
            addCriterion("is_send >", value, "isSend");
            return (Criteria) this;
        }

        public Criteria andIsSendGreaterThanOrEqualTo(Short value) {
            addCriterion("is_send >=", value, "isSend");
            return (Criteria) this;
        }

        public Criteria andIsSendLessThan(Short value) {
            addCriterion("is_send <", value, "isSend");
            return (Criteria) this;
        }

        public Criteria andIsSendLessThanOrEqualTo(Short value) {
            addCriterion("is_send <=", value, "isSend");
            return (Criteria) this;
        }

        public Criteria andIsSendIn(List<Short> values) {
            addCriterion("is_send in", values, "isSend");
            return (Criteria) this;
        }

        public Criteria andIsSendNotIn(List<Short> values) {
            addCriterion("is_send not in", values, "isSend");
            return (Criteria) this;
        }

        public Criteria andIsSendBetween(Short value1, Short value2) {
            addCriterion("is_send between", value1, value2, "isSend");
            return (Criteria) this;
        }

        public Criteria andIsSendNotBetween(Short value1, Short value2) {
            addCriterion("is_send not between", value1, value2, "isSend");
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
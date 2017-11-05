package pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class OrderDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderDetailExample() {
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

        public Criteria andOrderDetailSerialIsNull() {
            addCriterion("order_detail_serial is null");
            return (Criteria) this;
        }

        public Criteria andOrderDetailSerialIsNotNull() {
            addCriterion("order_detail_serial is not null");
            return (Criteria) this;
        }

        public Criteria andOrderDetailSerialEqualTo(Integer value) {
            addCriterion("order_detail_serial =", value, "orderDetailSerial");
            return (Criteria) this;
        }

        public Criteria andOrderDetailSerialNotEqualTo(Integer value) {
            addCriterion("order_detail_serial <>", value, "orderDetailSerial");
            return (Criteria) this;
        }

        public Criteria andOrderDetailSerialGreaterThan(Integer value) {
            addCriterion("order_detail_serial >", value, "orderDetailSerial");
            return (Criteria) this;
        }

        public Criteria andOrderDetailSerialGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_detail_serial >=", value, "orderDetailSerial");
            return (Criteria) this;
        }

        public Criteria andOrderDetailSerialLessThan(Integer value) {
            addCriterion("order_detail_serial <", value, "orderDetailSerial");
            return (Criteria) this;
        }

        public Criteria andOrderDetailSerialLessThanOrEqualTo(Integer value) {
            addCriterion("order_detail_serial <=", value, "orderDetailSerial");
            return (Criteria) this;
        }

        public Criteria andOrderDetailSerialIn(List<Integer> values) {
            addCriterion("order_detail_serial in", values, "orderDetailSerial");
            return (Criteria) this;
        }

        public Criteria andOrderDetailSerialNotIn(List<Integer> values) {
            addCriterion("order_detail_serial not in", values, "orderDetailSerial");
            return (Criteria) this;
        }

        public Criteria andOrderDetailSerialBetween(Integer value1, Integer value2) {
            addCriterion("order_detail_serial between", value1, value2, "orderDetailSerial");
            return (Criteria) this;
        }

        public Criteria andOrderDetailSerialNotBetween(Integer value1, Integer value2) {
            addCriterion("order_detail_serial not between", value1, value2, "orderDetailSerial");
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

        public Criteria andDishIdIsNull() {
            addCriterion("dish_id is null");
            return (Criteria) this;
        }

        public Criteria andDishIdIsNotNull() {
            addCriterion("dish_id is not null");
            return (Criteria) this;
        }

        public Criteria andDishIdEqualTo(Integer value) {
            addCriterion("dish_id =", value, "dishId");
            return (Criteria) this;
        }

        public Criteria andDishIdNotEqualTo(Integer value) {
            addCriterion("dish_id <>", value, "dishId");
            return (Criteria) this;
        }

        public Criteria andDishIdGreaterThan(Integer value) {
            addCriterion("dish_id >", value, "dishId");
            return (Criteria) this;
        }

        public Criteria andDishIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dish_id >=", value, "dishId");
            return (Criteria) this;
        }

        public Criteria andDishIdLessThan(Integer value) {
            addCriterion("dish_id <", value, "dishId");
            return (Criteria) this;
        }

        public Criteria andDishIdLessThanOrEqualTo(Integer value) {
            addCriterion("dish_id <=", value, "dishId");
            return (Criteria) this;
        }

        public Criteria andDishIdIn(List<Integer> values) {
            addCriterion("dish_id in", values, "dishId");
            return (Criteria) this;
        }

        public Criteria andDishIdNotIn(List<Integer> values) {
            addCriterion("dish_id not in", values, "dishId");
            return (Criteria) this;
        }

        public Criteria andDishIdBetween(Integer value1, Integer value2) {
            addCriterion("dish_id between", value1, value2, "dishId");
            return (Criteria) this;
        }

        public Criteria andDishIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dish_id not between", value1, value2, "dishId");
            return (Criteria) this;
        }

        public Criteria andDishNumIsNull() {
            addCriterion("dish_num is null");
            return (Criteria) this;
        }

        public Criteria andDishNumIsNotNull() {
            addCriterion("dish_num is not null");
            return (Criteria) this;
        }

        public Criteria andDishNumEqualTo(Integer value) {
            addCriterion("dish_num =", value, "dishNum");
            return (Criteria) this;
        }

        public Criteria andDishNumNotEqualTo(Integer value) {
            addCriterion("dish_num <>", value, "dishNum");
            return (Criteria) this;
        }

        public Criteria andDishNumGreaterThan(Integer value) {
            addCriterion("dish_num >", value, "dishNum");
            return (Criteria) this;
        }

        public Criteria andDishNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("dish_num >=", value, "dishNum");
            return (Criteria) this;
        }

        public Criteria andDishNumLessThan(Integer value) {
            addCriterion("dish_num <", value, "dishNum");
            return (Criteria) this;
        }

        public Criteria andDishNumLessThanOrEqualTo(Integer value) {
            addCriterion("dish_num <=", value, "dishNum");
            return (Criteria) this;
        }

        public Criteria andDishNumIn(List<Integer> values) {
            addCriterion("dish_num in", values, "dishNum");
            return (Criteria) this;
        }

        public Criteria andDishNumNotIn(List<Integer> values) {
            addCriterion("dish_num not in", values, "dishNum");
            return (Criteria) this;
        }

        public Criteria andDishNumBetween(Integer value1, Integer value2) {
            addCriterion("dish_num between", value1, value2, "dishNum");
            return (Criteria) this;
        }

        public Criteria andDishNumNotBetween(Integer value1, Integer value2) {
            addCriterion("dish_num not between", value1, value2, "dishNum");
            return (Criteria) this;
        }

        public Criteria andDishNameIsNull() {
            addCriterion("dish_name is null");
            return (Criteria) this;
        }

        public Criteria andDishNameIsNotNull() {
            addCriterion("dish_name is not null");
            return (Criteria) this;
        }

        public Criteria andDishNameEqualTo(String value) {
            addCriterion("dish_name =", value, "dishName");
            return (Criteria) this;
        }

        public Criteria andDishNameNotEqualTo(String value) {
            addCriterion("dish_name <>", value, "dishName");
            return (Criteria) this;
        }

        public Criteria andDishNameGreaterThan(String value) {
            addCriterion("dish_name >", value, "dishName");
            return (Criteria) this;
        }

        public Criteria andDishNameGreaterThanOrEqualTo(String value) {
            addCriterion("dish_name >=", value, "dishName");
            return (Criteria) this;
        }

        public Criteria andDishNameLessThan(String value) {
            addCriterion("dish_name <", value, "dishName");
            return (Criteria) this;
        }

        public Criteria andDishNameLessThanOrEqualTo(String value) {
            addCriterion("dish_name <=", value, "dishName");
            return (Criteria) this;
        }

        public Criteria andDishNameLike(String value) {
            addCriterion("dish_name like", value, "dishName");
            return (Criteria) this;
        }

        public Criteria andDishNameNotLike(String value) {
            addCriterion("dish_name not like", value, "dishName");
            return (Criteria) this;
        }

        public Criteria andDishNameIn(List<String> values) {
            addCriterion("dish_name in", values, "dishName");
            return (Criteria) this;
        }

        public Criteria andDishNameNotIn(List<String> values) {
            addCriterion("dish_name not in", values, "dishName");
            return (Criteria) this;
        }

        public Criteria andDishNameBetween(String value1, String value2) {
            addCriterion("dish_name between", value1, value2, "dishName");
            return (Criteria) this;
        }

        public Criteria andDishNameNotBetween(String value1, String value2) {
            addCriterion("dish_name not between", value1, value2, "dishName");
            return (Criteria) this;
        }

        public Criteria andDishPicIsNull() {
            addCriterion("dish_pic is null");
            return (Criteria) this;
        }

        public Criteria andDishPicIsNotNull() {
            addCriterion("dish_pic is not null");
            return (Criteria) this;
        }

        public Criteria andDishPicEqualTo(String value) {
            addCriterion("dish_pic =", value, "dishPic");
            return (Criteria) this;
        }

        public Criteria andDishPicNotEqualTo(String value) {
            addCriterion("dish_pic <>", value, "dishPic");
            return (Criteria) this;
        }

        public Criteria andDishPicGreaterThan(String value) {
            addCriterion("dish_pic >", value, "dishPic");
            return (Criteria) this;
        }

        public Criteria andDishPicGreaterThanOrEqualTo(String value) {
            addCriterion("dish_pic >=", value, "dishPic");
            return (Criteria) this;
        }

        public Criteria andDishPicLessThan(String value) {
            addCriterion("dish_pic <", value, "dishPic");
            return (Criteria) this;
        }

        public Criteria andDishPicLessThanOrEqualTo(String value) {
            addCriterion("dish_pic <=", value, "dishPic");
            return (Criteria) this;
        }

        public Criteria andDishPicLike(String value) {
            addCriterion("dish_pic like", value, "dishPic");
            return (Criteria) this;
        }

        public Criteria andDishPicNotLike(String value) {
            addCriterion("dish_pic not like", value, "dishPic");
            return (Criteria) this;
        }

        public Criteria andDishPicIn(List<String> values) {
            addCriterion("dish_pic in", values, "dishPic");
            return (Criteria) this;
        }

        public Criteria andDishPicNotIn(List<String> values) {
            addCriterion("dish_pic not in", values, "dishPic");
            return (Criteria) this;
        }

        public Criteria andDishPicBetween(String value1, String value2) {
            addCriterion("dish_pic between", value1, value2, "dishPic");
            return (Criteria) this;
        }

        public Criteria andDishPicNotBetween(String value1, String value2) {
            addCriterion("dish_pic not between", value1, value2, "dishPic");
            return (Criteria) this;
        }

        public Criteria andDishPriceIsNull() {
            addCriterion("dish_price is null");
            return (Criteria) this;
        }

        public Criteria andDishPriceIsNotNull() {
            addCriterion("dish_price is not null");
            return (Criteria) this;
        }

        public Criteria andDishPriceEqualTo(BigDecimal value) {
            addCriterion("dish_price =", value, "dishPrice");
            return (Criteria) this;
        }

        public Criteria andDishPriceNotEqualTo(BigDecimal value) {
            addCriterion("dish_price <>", value, "dishPrice");
            return (Criteria) this;
        }

        public Criteria andDishPriceGreaterThan(BigDecimal value) {
            addCriterion("dish_price >", value, "dishPrice");
            return (Criteria) this;
        }

        public Criteria andDishPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("dish_price >=", value, "dishPrice");
            return (Criteria) this;
        }

        public Criteria andDishPriceLessThan(BigDecimal value) {
            addCriterion("dish_price <", value, "dishPrice");
            return (Criteria) this;
        }

        public Criteria andDishPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("dish_price <=", value, "dishPrice");
            return (Criteria) this;
        }

        public Criteria andDishPriceIn(List<BigDecimal> values) {
            addCriterion("dish_price in", values, "dishPrice");
            return (Criteria) this;
        }

        public Criteria andDishPriceNotIn(List<BigDecimal> values) {
            addCriterion("dish_price not in", values, "dishPrice");
            return (Criteria) this;
        }

        public Criteria andDishPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dish_price between", value1, value2, "dishPrice");
            return (Criteria) this;
        }

        public Criteria andDishPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dish_price not between", value1, value2, "dishPrice");
            return (Criteria) this;
        }

        public Criteria andDishPayPriceIsNull() {
            addCriterion("dish_pay_price is null");
            return (Criteria) this;
        }

        public Criteria andDishPayPriceIsNotNull() {
            addCriterion("dish_pay_price is not null");
            return (Criteria) this;
        }

        public Criteria andDishPayPriceEqualTo(BigDecimal value) {
            addCriterion("dish_pay_price =", value, "dishPayPrice");
            return (Criteria) this;
        }

        public Criteria andDishPayPriceNotEqualTo(BigDecimal value) {
            addCriterion("dish_pay_price <>", value, "dishPayPrice");
            return (Criteria) this;
        }

        public Criteria andDishPayPriceGreaterThan(BigDecimal value) {
            addCriterion("dish_pay_price >", value, "dishPayPrice");
            return (Criteria) this;
        }

        public Criteria andDishPayPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("dish_pay_price >=", value, "dishPayPrice");
            return (Criteria) this;
        }

        public Criteria andDishPayPriceLessThan(BigDecimal value) {
            addCriterion("dish_pay_price <", value, "dishPayPrice");
            return (Criteria) this;
        }

        public Criteria andDishPayPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("dish_pay_price <=", value, "dishPayPrice");
            return (Criteria) this;
        }

        public Criteria andDishPayPriceIn(List<BigDecimal> values) {
            addCriterion("dish_pay_price in", values, "dishPayPrice");
            return (Criteria) this;
        }

        public Criteria andDishPayPriceNotIn(List<BigDecimal> values) {
            addCriterion("dish_pay_price not in", values, "dishPayPrice");
            return (Criteria) this;
        }

        public Criteria andDishPayPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dish_pay_price between", value1, value2, "dishPayPrice");
            return (Criteria) this;
        }

        public Criteria andDishPayPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dish_pay_price not between", value1, value2, "dishPayPrice");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNull() {
            addCriterion("is_delete is null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNotNull() {
            addCriterion("is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteEqualTo(Boolean value) {
            addCriterion("is_delete =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(Boolean value) {
            addCriterion("is_delete <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(Boolean value) {
            addCriterion("is_delete >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_delete >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(Boolean value) {
            addCriterion("is_delete <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(Boolean value) {
            addCriterion("is_delete <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<Boolean> values) {
            addCriterion("is_delete in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<Boolean> values) {
            addCriterion("is_delete not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(Boolean value1, Boolean value2) {
            addCriterion("is_delete between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_delete not between", value1, value2, "isDelete");
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
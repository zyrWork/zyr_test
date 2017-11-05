package pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DishExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DishExample() {
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

        public Criteria andDishSerialIsNull() {
            addCriterion("dish_serial is null");
            return (Criteria) this;
        }

        public Criteria andDishSerialIsNotNull() {
            addCriterion("dish_serial is not null");
            return (Criteria) this;
        }

        public Criteria andDishSerialEqualTo(Integer value) {
            addCriterion("dish_serial =", value, "dishSerial");
            return (Criteria) this;
        }

        public Criteria andDishSerialNotEqualTo(Integer value) {
            addCriterion("dish_serial <>", value, "dishSerial");
            return (Criteria) this;
        }

        public Criteria andDishSerialGreaterThan(Integer value) {
            addCriterion("dish_serial >", value, "dishSerial");
            return (Criteria) this;
        }

        public Criteria andDishSerialGreaterThanOrEqualTo(Integer value) {
            addCriterion("dish_serial >=", value, "dishSerial");
            return (Criteria) this;
        }

        public Criteria andDishSerialLessThan(Integer value) {
            addCriterion("dish_serial <", value, "dishSerial");
            return (Criteria) this;
        }

        public Criteria andDishSerialLessThanOrEqualTo(Integer value) {
            addCriterion("dish_serial <=", value, "dishSerial");
            return (Criteria) this;
        }

        public Criteria andDishSerialIn(List<Integer> values) {
            addCriterion("dish_serial in", values, "dishSerial");
            return (Criteria) this;
        }

        public Criteria andDishSerialNotIn(List<Integer> values) {
            addCriterion("dish_serial not in", values, "dishSerial");
            return (Criteria) this;
        }

        public Criteria andDishSerialBetween(Integer value1, Integer value2) {
            addCriterion("dish_serial between", value1, value2, "dishSerial");
            return (Criteria) this;
        }

        public Criteria andDishSerialNotBetween(Integer value1, Integer value2) {
            addCriterion("dish_serial not between", value1, value2, "dishSerial");
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

        public Criteria andDishTypeIdIsNull() {
            addCriterion("dish_type_id is null");
            return (Criteria) this;
        }

        public Criteria andDishTypeIdIsNotNull() {
            addCriterion("dish_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andDishTypeIdEqualTo(Integer value) {
            addCriterion("dish_type_id =", value, "dishTypeId");
            return (Criteria) this;
        }

        public Criteria andDishTypeIdNotEqualTo(Integer value) {
            addCriterion("dish_type_id <>", value, "dishTypeId");
            return (Criteria) this;
        }

        public Criteria andDishTypeIdGreaterThan(Integer value) {
            addCriterion("dish_type_id >", value, "dishTypeId");
            return (Criteria) this;
        }

        public Criteria andDishTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dish_type_id >=", value, "dishTypeId");
            return (Criteria) this;
        }

        public Criteria andDishTypeIdLessThan(Integer value) {
            addCriterion("dish_type_id <", value, "dishTypeId");
            return (Criteria) this;
        }

        public Criteria andDishTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("dish_type_id <=", value, "dishTypeId");
            return (Criteria) this;
        }

        public Criteria andDishTypeIdIn(List<Integer> values) {
            addCriterion("dish_type_id in", values, "dishTypeId");
            return (Criteria) this;
        }

        public Criteria andDishTypeIdNotIn(List<Integer> values) {
            addCriterion("dish_type_id not in", values, "dishTypeId");
            return (Criteria) this;
        }

        public Criteria andDishTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("dish_type_id between", value1, value2, "dishTypeId");
            return (Criteria) this;
        }

        public Criteria andDishTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dish_type_id not between", value1, value2, "dishTypeId");
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

        public Criteria andOnShelfIsNull() {
            addCriterion("on_shelf is null");
            return (Criteria) this;
        }

        public Criteria andOnShelfIsNotNull() {
            addCriterion("on_shelf is not null");
            return (Criteria) this;
        }

        public Criteria andOnShelfEqualTo(Boolean value) {
            addCriterion("on_shelf =", value, "onShelf");
            return (Criteria) this;
        }

        public Criteria andOnShelfNotEqualTo(Boolean value) {
            addCriterion("on_shelf <>", value, "onShelf");
            return (Criteria) this;
        }

        public Criteria andOnShelfGreaterThan(Boolean value) {
            addCriterion("on_shelf >", value, "onShelf");
            return (Criteria) this;
        }

        public Criteria andOnShelfGreaterThanOrEqualTo(Boolean value) {
            addCriterion("on_shelf >=", value, "onShelf");
            return (Criteria) this;
        }

        public Criteria andOnShelfLessThan(Boolean value) {
            addCriterion("on_shelf <", value, "onShelf");
            return (Criteria) this;
        }

        public Criteria andOnShelfLessThanOrEqualTo(Boolean value) {
            addCriterion("on_shelf <=", value, "onShelf");
            return (Criteria) this;
        }

        public Criteria andOnShelfIn(List<Boolean> values) {
            addCriterion("on_shelf in", values, "onShelf");
            return (Criteria) this;
        }

        public Criteria andOnShelfNotIn(List<Boolean> values) {
            addCriterion("on_shelf not in", values, "onShelf");
            return (Criteria) this;
        }

        public Criteria andOnShelfBetween(Boolean value1, Boolean value2) {
            addCriterion("on_shelf between", value1, value2, "onShelf");
            return (Criteria) this;
        }

        public Criteria andOnShelfNotBetween(Boolean value1, Boolean value2) {
            addCriterion("on_shelf not between", value1, value2, "onShelf");
            return (Criteria) this;
        }

        public Criteria andOnSaleTimeIsNull() {
            addCriterion("on_sale_time is null");
            return (Criteria) this;
        }

        public Criteria andOnSaleTimeIsNotNull() {
            addCriterion("on_sale_time is not null");
            return (Criteria) this;
        }

        public Criteria andOnSaleTimeEqualTo(String value) {
            addCriterion("on_sale_time =", value, "onSaleTime");
            return (Criteria) this;
        }

        public Criteria andOnSaleTimeNotEqualTo(String value) {
            addCriterion("on_sale_time <>", value, "onSaleTime");
            return (Criteria) this;
        }

        public Criteria andOnSaleTimeGreaterThan(String value) {
            addCriterion("on_sale_time >", value, "onSaleTime");
            return (Criteria) this;
        }

        public Criteria andOnSaleTimeGreaterThanOrEqualTo(String value) {
            addCriterion("on_sale_time >=", value, "onSaleTime");
            return (Criteria) this;
        }

        public Criteria andOnSaleTimeLessThan(String value) {
            addCriterion("on_sale_time <", value, "onSaleTime");
            return (Criteria) this;
        }

        public Criteria andOnSaleTimeLessThanOrEqualTo(String value) {
            addCriterion("on_sale_time <=", value, "onSaleTime");
            return (Criteria) this;
        }

        public Criteria andOnSaleTimeLike(String value) {
            addCriterion("on_sale_time like", value, "onSaleTime");
            return (Criteria) this;
        }

        public Criteria andOnSaleTimeNotLike(String value) {
            addCriterion("on_sale_time not like", value, "onSaleTime");
            return (Criteria) this;
        }

        public Criteria andOnSaleTimeIn(List<String> values) {
            addCriterion("on_sale_time in", values, "onSaleTime");
            return (Criteria) this;
        }

        public Criteria andOnSaleTimeNotIn(List<String> values) {
            addCriterion("on_sale_time not in", values, "onSaleTime");
            return (Criteria) this;
        }

        public Criteria andOnSaleTimeBetween(String value1, String value2) {
            addCriterion("on_sale_time between", value1, value2, "onSaleTime");
            return (Criteria) this;
        }

        public Criteria andOnSaleTimeNotBetween(String value1, String value2) {
            addCriterion("on_sale_time not between", value1, value2, "onSaleTime");
            return (Criteria) this;
        }

        public Criteria andOnShelfTimeIsNull() {
            addCriterion("on_shelf_time is null");
            return (Criteria) this;
        }

        public Criteria andOnShelfTimeIsNotNull() {
            addCriterion("on_shelf_time is not null");
            return (Criteria) this;
        }

        public Criteria andOnShelfTimeEqualTo(String value) {
            addCriterion("on_shelf_time =", value, "onShelfTime");
            return (Criteria) this;
        }

        public Criteria andOnShelfTimeNotEqualTo(String value) {
            addCriterion("on_shelf_time <>", value, "onShelfTime");
            return (Criteria) this;
        }

        public Criteria andOnShelfTimeGreaterThan(String value) {
            addCriterion("on_shelf_time >", value, "onShelfTime");
            return (Criteria) this;
        }

        public Criteria andOnShelfTimeGreaterThanOrEqualTo(String value) {
            addCriterion("on_shelf_time >=", value, "onShelfTime");
            return (Criteria) this;
        }

        public Criteria andOnShelfTimeLessThan(String value) {
            addCriterion("on_shelf_time <", value, "onShelfTime");
            return (Criteria) this;
        }

        public Criteria andOnShelfTimeLessThanOrEqualTo(String value) {
            addCriterion("on_shelf_time <=", value, "onShelfTime");
            return (Criteria) this;
        }

        public Criteria andOnShelfTimeLike(String value) {
            addCriterion("on_shelf_time like", value, "onShelfTime");
            return (Criteria) this;
        }

        public Criteria andOnShelfTimeNotLike(String value) {
            addCriterion("on_shelf_time not like", value, "onShelfTime");
            return (Criteria) this;
        }

        public Criteria andOnShelfTimeIn(List<String> values) {
            addCriterion("on_shelf_time in", values, "onShelfTime");
            return (Criteria) this;
        }

        public Criteria andOnShelfTimeNotIn(List<String> values) {
            addCriterion("on_shelf_time not in", values, "onShelfTime");
            return (Criteria) this;
        }

        public Criteria andOnShelfTimeBetween(String value1, String value2) {
            addCriterion("on_shelf_time between", value1, value2, "onShelfTime");
            return (Criteria) this;
        }

        public Criteria andOnShelfTimeNotBetween(String value1, String value2) {
            addCriterion("on_shelf_time not between", value1, value2, "onShelfTime");
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

        public Criteria andDeleteTimeIsNull() {
            addCriterion("delete_time is null");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeIsNotNull() {
            addCriterion("delete_time is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeEqualTo(String value) {
            addCriterion("delete_time =", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeNotEqualTo(String value) {
            addCriterion("delete_time <>", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeGreaterThan(String value) {
            addCriterion("delete_time >", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeGreaterThanOrEqualTo(String value) {
            addCriterion("delete_time >=", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeLessThan(String value) {
            addCriterion("delete_time <", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeLessThanOrEqualTo(String value) {
            addCriterion("delete_time <=", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeLike(String value) {
            addCriterion("delete_time like", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeNotLike(String value) {
            addCriterion("delete_time not like", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeIn(List<String> values) {
            addCriterion("delete_time in", values, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeNotIn(List<String> values) {
            addCriterion("delete_time not in", values, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeBetween(String value1, String value2) {
            addCriterion("delete_time between", value1, value2, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeNotBetween(String value1, String value2) {
            addCriterion("delete_time not between", value1, value2, "deleteTime");
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
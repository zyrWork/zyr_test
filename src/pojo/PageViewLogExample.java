package pojo;

import java.util.ArrayList;
import java.util.List;

public class PageViewLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PageViewLogExample() {
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

        public Criteria andPageSerialIsNull() {
            addCriterion("page_serial is null");
            return (Criteria) this;
        }

        public Criteria andPageSerialIsNotNull() {
            addCriterion("page_serial is not null");
            return (Criteria) this;
        }

        public Criteria andPageSerialEqualTo(Integer value) {
            addCriterion("page_serial =", value, "pageSerial");
            return (Criteria) this;
        }

        public Criteria andPageSerialNotEqualTo(Integer value) {
            addCriterion("page_serial <>", value, "pageSerial");
            return (Criteria) this;
        }

        public Criteria andPageSerialGreaterThan(Integer value) {
            addCriterion("page_serial >", value, "pageSerial");
            return (Criteria) this;
        }

        public Criteria andPageSerialGreaterThanOrEqualTo(Integer value) {
            addCriterion("page_serial >=", value, "pageSerial");
            return (Criteria) this;
        }

        public Criteria andPageSerialLessThan(Integer value) {
            addCriterion("page_serial <", value, "pageSerial");
            return (Criteria) this;
        }

        public Criteria andPageSerialLessThanOrEqualTo(Integer value) {
            addCriterion("page_serial <=", value, "pageSerial");
            return (Criteria) this;
        }

        public Criteria andPageSerialIn(List<Integer> values) {
            addCriterion("page_serial in", values, "pageSerial");
            return (Criteria) this;
        }

        public Criteria andPageSerialNotIn(List<Integer> values) {
            addCriterion("page_serial not in", values, "pageSerial");
            return (Criteria) this;
        }

        public Criteria andPageSerialBetween(Integer value1, Integer value2) {
            addCriterion("page_serial between", value1, value2, "pageSerial");
            return (Criteria) this;
        }

        public Criteria andPageSerialNotBetween(Integer value1, Integer value2) {
            addCriterion("page_serial not between", value1, value2, "pageSerial");
            return (Criteria) this;
        }

        public Criteria andPageTypeIsNull() {
            addCriterion("page_type is null");
            return (Criteria) this;
        }

        public Criteria andPageTypeIsNotNull() {
            addCriterion("page_type is not null");
            return (Criteria) this;
        }

        public Criteria andPageTypeEqualTo(Short value) {
            addCriterion("page_type =", value, "pageType");
            return (Criteria) this;
        }

        public Criteria andPageTypeNotEqualTo(Short value) {
            addCriterion("page_type <>", value, "pageType");
            return (Criteria) this;
        }

        public Criteria andPageTypeGreaterThan(Short value) {
            addCriterion("page_type >", value, "pageType");
            return (Criteria) this;
        }

        public Criteria andPageTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("page_type >=", value, "pageType");
            return (Criteria) this;
        }

        public Criteria andPageTypeLessThan(Short value) {
            addCriterion("page_type <", value, "pageType");
            return (Criteria) this;
        }

        public Criteria andPageTypeLessThanOrEqualTo(Short value) {
            addCriterion("page_type <=", value, "pageType");
            return (Criteria) this;
        }

        public Criteria andPageTypeIn(List<Short> values) {
            addCriterion("page_type in", values, "pageType");
            return (Criteria) this;
        }

        public Criteria andPageTypeNotIn(List<Short> values) {
            addCriterion("page_type not in", values, "pageType");
            return (Criteria) this;
        }

        public Criteria andPageTypeBetween(Short value1, Short value2) {
            addCriterion("page_type between", value1, value2, "pageType");
            return (Criteria) this;
        }

        public Criteria andPageTypeNotBetween(Short value1, Short value2) {
            addCriterion("page_type not between", value1, value2, "pageType");
            return (Criteria) this;
        }

        public Criteria andShopJdIsNull() {
            addCriterion("shop_jd is null");
            return (Criteria) this;
        }

        public Criteria andShopJdIsNotNull() {
            addCriterion("shop_jd is not null");
            return (Criteria) this;
        }

        public Criteria andShopJdEqualTo(Integer value) {
            addCriterion("shop_jd =", value, "shopJd");
            return (Criteria) this;
        }

        public Criteria andShopJdNotEqualTo(Integer value) {
            addCriterion("shop_jd <>", value, "shopJd");
            return (Criteria) this;
        }

        public Criteria andShopJdGreaterThan(Integer value) {
            addCriterion("shop_jd >", value, "shopJd");
            return (Criteria) this;
        }

        public Criteria andShopJdGreaterThanOrEqualTo(Integer value) {
            addCriterion("shop_jd >=", value, "shopJd");
            return (Criteria) this;
        }

        public Criteria andShopJdLessThan(Integer value) {
            addCriterion("shop_jd <", value, "shopJd");
            return (Criteria) this;
        }

        public Criteria andShopJdLessThanOrEqualTo(Integer value) {
            addCriterion("shop_jd <=", value, "shopJd");
            return (Criteria) this;
        }

        public Criteria andShopJdIn(List<Integer> values) {
            addCriterion("shop_jd in", values, "shopJd");
            return (Criteria) this;
        }

        public Criteria andShopJdNotIn(List<Integer> values) {
            addCriterion("shop_jd not in", values, "shopJd");
            return (Criteria) this;
        }

        public Criteria andShopJdBetween(Integer value1, Integer value2) {
            addCriterion("shop_jd between", value1, value2, "shopJd");
            return (Criteria) this;
        }

        public Criteria andShopJdNotBetween(Integer value1, Integer value2) {
            addCriterion("shop_jd not between", value1, value2, "shopJd");
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

        public Criteria andViewerAccIdIsNull() {
            addCriterion("viewer_acc_id is null");
            return (Criteria) this;
        }

        public Criteria andViewerAccIdIsNotNull() {
            addCriterion("viewer_acc_id is not null");
            return (Criteria) this;
        }

        public Criteria andViewerAccIdEqualTo(Integer value) {
            addCriterion("viewer_acc_id =", value, "viewerAccId");
            return (Criteria) this;
        }

        public Criteria andViewerAccIdNotEqualTo(Integer value) {
            addCriterion("viewer_acc_id <>", value, "viewerAccId");
            return (Criteria) this;
        }

        public Criteria andViewerAccIdGreaterThan(Integer value) {
            addCriterion("viewer_acc_id >", value, "viewerAccId");
            return (Criteria) this;
        }

        public Criteria andViewerAccIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("viewer_acc_id >=", value, "viewerAccId");
            return (Criteria) this;
        }

        public Criteria andViewerAccIdLessThan(Integer value) {
            addCriterion("viewer_acc_id <", value, "viewerAccId");
            return (Criteria) this;
        }

        public Criteria andViewerAccIdLessThanOrEqualTo(Integer value) {
            addCriterion("viewer_acc_id <=", value, "viewerAccId");
            return (Criteria) this;
        }

        public Criteria andViewerAccIdIn(List<Integer> values) {
            addCriterion("viewer_acc_id in", values, "viewerAccId");
            return (Criteria) this;
        }

        public Criteria andViewerAccIdNotIn(List<Integer> values) {
            addCriterion("viewer_acc_id not in", values, "viewerAccId");
            return (Criteria) this;
        }

        public Criteria andViewerAccIdBetween(Integer value1, Integer value2) {
            addCriterion("viewer_acc_id between", value1, value2, "viewerAccId");
            return (Criteria) this;
        }

        public Criteria andViewerAccIdNotBetween(Integer value1, Integer value2) {
            addCriterion("viewer_acc_id not between", value1, value2, "viewerAccId");
            return (Criteria) this;
        }

        public Criteria andViewTimeIsNull() {
            addCriterion("view_time is null");
            return (Criteria) this;
        }

        public Criteria andViewTimeIsNotNull() {
            addCriterion("view_time is not null");
            return (Criteria) this;
        }

        public Criteria andViewTimeEqualTo(String value) {
            addCriterion("view_time =", value, "viewTime");
            return (Criteria) this;
        }

        public Criteria andViewTimeNotEqualTo(String value) {
            addCriterion("view_time <>", value, "viewTime");
            return (Criteria) this;
        }

        public Criteria andViewTimeGreaterThan(String value) {
            addCriterion("view_time >", value, "viewTime");
            return (Criteria) this;
        }

        public Criteria andViewTimeGreaterThanOrEqualTo(String value) {
            addCriterion("view_time >=", value, "viewTime");
            return (Criteria) this;
        }

        public Criteria andViewTimeLessThan(String value) {
            addCriterion("view_time <", value, "viewTime");
            return (Criteria) this;
        }

        public Criteria andViewTimeLessThanOrEqualTo(String value) {
            addCriterion("view_time <=", value, "viewTime");
            return (Criteria) this;
        }

        public Criteria andViewTimeLike(String value) {
            addCriterion("view_time like", value, "viewTime");
            return (Criteria) this;
        }

        public Criteria andViewTimeNotLike(String value) {
            addCriterion("view_time not like", value, "viewTime");
            return (Criteria) this;
        }

        public Criteria andViewTimeIn(List<String> values) {
            addCriterion("view_time in", values, "viewTime");
            return (Criteria) this;
        }

        public Criteria andViewTimeNotIn(List<String> values) {
            addCriterion("view_time not in", values, "viewTime");
            return (Criteria) this;
        }

        public Criteria andViewTimeBetween(String value1, String value2) {
            addCriterion("view_time between", value1, value2, "viewTime");
            return (Criteria) this;
        }

        public Criteria andViewTimeNotBetween(String value1, String value2) {
            addCriterion("view_time not between", value1, value2, "viewTime");
            return (Criteria) this;
        }

        public Criteria andNextPageIdIsNull() {
            addCriterion("next_page_id is null");
            return (Criteria) this;
        }

        public Criteria andNextPageIdIsNotNull() {
            addCriterion("next_page_id is not null");
            return (Criteria) this;
        }

        public Criteria andNextPageIdEqualTo(Integer value) {
            addCriterion("next_page_id =", value, "nextPageId");
            return (Criteria) this;
        }

        public Criteria andNextPageIdNotEqualTo(Integer value) {
            addCriterion("next_page_id <>", value, "nextPageId");
            return (Criteria) this;
        }

        public Criteria andNextPageIdGreaterThan(Integer value) {
            addCriterion("next_page_id >", value, "nextPageId");
            return (Criteria) this;
        }

        public Criteria andNextPageIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("next_page_id >=", value, "nextPageId");
            return (Criteria) this;
        }

        public Criteria andNextPageIdLessThan(Integer value) {
            addCriterion("next_page_id <", value, "nextPageId");
            return (Criteria) this;
        }

        public Criteria andNextPageIdLessThanOrEqualTo(Integer value) {
            addCriterion("next_page_id <=", value, "nextPageId");
            return (Criteria) this;
        }

        public Criteria andNextPageIdIn(List<Integer> values) {
            addCriterion("next_page_id in", values, "nextPageId");
            return (Criteria) this;
        }

        public Criteria andNextPageIdNotIn(List<Integer> values) {
            addCriterion("next_page_id not in", values, "nextPageId");
            return (Criteria) this;
        }

        public Criteria andNextPageIdBetween(Integer value1, Integer value2) {
            addCriterion("next_page_id between", value1, value2, "nextPageId");
            return (Criteria) this;
        }

        public Criteria andNextPageIdNotBetween(Integer value1, Integer value2) {
            addCriterion("next_page_id not between", value1, value2, "nextPageId");
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
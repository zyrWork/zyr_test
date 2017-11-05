package pojo;

import java.util.ArrayList;
import java.util.List;

public class ShopDiscountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShopDiscountExample() {
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

        public Criteria andShopDiscountSerialIsNull() {
            addCriterion("shop_discount_serial is null");
            return (Criteria) this;
        }

        public Criteria andShopDiscountSerialIsNotNull() {
            addCriterion("shop_discount_serial is not null");
            return (Criteria) this;
        }

        public Criteria andShopDiscountSerialEqualTo(Integer value) {
            addCriterion("shop_discount_serial =", value, "shopDiscountSerial");
            return (Criteria) this;
        }

        public Criteria andShopDiscountSerialNotEqualTo(Integer value) {
            addCriterion("shop_discount_serial <>", value, "shopDiscountSerial");
            return (Criteria) this;
        }

        public Criteria andShopDiscountSerialGreaterThan(Integer value) {
            addCriterion("shop_discount_serial >", value, "shopDiscountSerial");
            return (Criteria) this;
        }

        public Criteria andShopDiscountSerialGreaterThanOrEqualTo(Integer value) {
            addCriterion("shop_discount_serial >=", value, "shopDiscountSerial");
            return (Criteria) this;
        }

        public Criteria andShopDiscountSerialLessThan(Integer value) {
            addCriterion("shop_discount_serial <", value, "shopDiscountSerial");
            return (Criteria) this;
        }

        public Criteria andShopDiscountSerialLessThanOrEqualTo(Integer value) {
            addCriterion("shop_discount_serial <=", value, "shopDiscountSerial");
            return (Criteria) this;
        }

        public Criteria andShopDiscountSerialIn(List<Integer> values) {
            addCriterion("shop_discount_serial in", values, "shopDiscountSerial");
            return (Criteria) this;
        }

        public Criteria andShopDiscountSerialNotIn(List<Integer> values) {
            addCriterion("shop_discount_serial not in", values, "shopDiscountSerial");
            return (Criteria) this;
        }

        public Criteria andShopDiscountSerialBetween(Integer value1, Integer value2) {
            addCriterion("shop_discount_serial between", value1, value2, "shopDiscountSerial");
            return (Criteria) this;
        }

        public Criteria andShopDiscountSerialNotBetween(Integer value1, Integer value2) {
            addCriterion("shop_discount_serial not between", value1, value2, "shopDiscountSerial");
            return (Criteria) this;
        }

        public Criteria andDiscountNameIsNull() {
            addCriterion("discount_name is null");
            return (Criteria) this;
        }

        public Criteria andDiscountNameIsNotNull() {
            addCriterion("discount_name is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountNameEqualTo(String value) {
            addCriterion("discount_name =", value, "discountName");
            return (Criteria) this;
        }

        public Criteria andDiscountNameNotEqualTo(String value) {
            addCriterion("discount_name <>", value, "discountName");
            return (Criteria) this;
        }

        public Criteria andDiscountNameGreaterThan(String value) {
            addCriterion("discount_name >", value, "discountName");
            return (Criteria) this;
        }

        public Criteria andDiscountNameGreaterThanOrEqualTo(String value) {
            addCriterion("discount_name >=", value, "discountName");
            return (Criteria) this;
        }

        public Criteria andDiscountNameLessThan(String value) {
            addCriterion("discount_name <", value, "discountName");
            return (Criteria) this;
        }

        public Criteria andDiscountNameLessThanOrEqualTo(String value) {
            addCriterion("discount_name <=", value, "discountName");
            return (Criteria) this;
        }

        public Criteria andDiscountNameLike(String value) {
            addCriterion("discount_name like", value, "discountName");
            return (Criteria) this;
        }

        public Criteria andDiscountNameNotLike(String value) {
            addCriterion("discount_name not like", value, "discountName");
            return (Criteria) this;
        }

        public Criteria andDiscountNameIn(List<String> values) {
            addCriterion("discount_name in", values, "discountName");
            return (Criteria) this;
        }

        public Criteria andDiscountNameNotIn(List<String> values) {
            addCriterion("discount_name not in", values, "discountName");
            return (Criteria) this;
        }

        public Criteria andDiscountNameBetween(String value1, String value2) {
            addCriterion("discount_name between", value1, value2, "discountName");
            return (Criteria) this;
        }

        public Criteria andDiscountNameNotBetween(String value1, String value2) {
            addCriterion("discount_name not between", value1, value2, "discountName");
            return (Criteria) this;
        }

        public Criteria andDiscountPercentIsNull() {
            addCriterion("discount_percent is null");
            return (Criteria) this;
        }

        public Criteria andDiscountPercentIsNotNull() {
            addCriterion("discount_percent is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountPercentEqualTo(Float value) {
            addCriterion("discount_percent =", value, "discountPercent");
            return (Criteria) this;
        }

        public Criteria andDiscountPercentNotEqualTo(Float value) {
            addCriterion("discount_percent <>", value, "discountPercent");
            return (Criteria) this;
        }

        public Criteria andDiscountPercentGreaterThan(Float value) {
            addCriterion("discount_percent >", value, "discountPercent");
            return (Criteria) this;
        }

        public Criteria andDiscountPercentGreaterThanOrEqualTo(Float value) {
            addCriterion("discount_percent >=", value, "discountPercent");
            return (Criteria) this;
        }

        public Criteria andDiscountPercentLessThan(Float value) {
            addCriterion("discount_percent <", value, "discountPercent");
            return (Criteria) this;
        }

        public Criteria andDiscountPercentLessThanOrEqualTo(Float value) {
            addCriterion("discount_percent <=", value, "discountPercent");
            return (Criteria) this;
        }

        public Criteria andDiscountPercentIn(List<Float> values) {
            addCriterion("discount_percent in", values, "discountPercent");
            return (Criteria) this;
        }

        public Criteria andDiscountPercentNotIn(List<Float> values) {
            addCriterion("discount_percent not in", values, "discountPercent");
            return (Criteria) this;
        }

        public Criteria andDiscountPercentBetween(Float value1, Float value2) {
            addCriterion("discount_percent between", value1, value2, "discountPercent");
            return (Criteria) this;
        }

        public Criteria andDiscountPercentNotBetween(Float value1, Float value2) {
            addCriterion("discount_percent not between", value1, value2, "discountPercent");
            return (Criteria) this;
        }

        public Criteria andMemberTypeIdIsNull() {
            addCriterion("member_type_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberTypeIdIsNotNull() {
            addCriterion("member_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberTypeIdEqualTo(Integer value) {
            addCriterion("member_type_id =", value, "memberTypeId");
            return (Criteria) this;
        }

        public Criteria andMemberTypeIdNotEqualTo(Integer value) {
            addCriterion("member_type_id <>", value, "memberTypeId");
            return (Criteria) this;
        }

        public Criteria andMemberTypeIdGreaterThan(Integer value) {
            addCriterion("member_type_id >", value, "memberTypeId");
            return (Criteria) this;
        }

        public Criteria andMemberTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_type_id >=", value, "memberTypeId");
            return (Criteria) this;
        }

        public Criteria andMemberTypeIdLessThan(Integer value) {
            addCriterion("member_type_id <", value, "memberTypeId");
            return (Criteria) this;
        }

        public Criteria andMemberTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("member_type_id <=", value, "memberTypeId");
            return (Criteria) this;
        }

        public Criteria andMemberTypeIdIn(List<Integer> values) {
            addCriterion("member_type_id in", values, "memberTypeId");
            return (Criteria) this;
        }

        public Criteria andMemberTypeIdNotIn(List<Integer> values) {
            addCriterion("member_type_id not in", values, "memberTypeId");
            return (Criteria) this;
        }

        public Criteria andMemberTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("member_type_id between", value1, value2, "memberTypeId");
            return (Criteria) this;
        }

        public Criteria andMemberTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("member_type_id not between", value1, value2, "memberTypeId");
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
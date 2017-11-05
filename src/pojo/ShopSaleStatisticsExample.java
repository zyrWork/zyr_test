package pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ShopSaleStatisticsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShopSaleStatisticsExample() {
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

        public Criteria andShopSaleStatisticsSerialIsNull() {
            addCriterion("shop_sale_statistics_serial is null");
            return (Criteria) this;
        }

        public Criteria andShopSaleStatisticsSerialIsNotNull() {
            addCriterion("shop_sale_statistics_serial is not null");
            return (Criteria) this;
        }

        public Criteria andShopSaleStatisticsSerialEqualTo(Integer value) {
            addCriterion("shop_sale_statistics_serial =", value, "shopSaleStatisticsSerial");
            return (Criteria) this;
        }

        public Criteria andShopSaleStatisticsSerialNotEqualTo(Integer value) {
            addCriterion("shop_sale_statistics_serial <>", value, "shopSaleStatisticsSerial");
            return (Criteria) this;
        }

        public Criteria andShopSaleStatisticsSerialGreaterThan(Integer value) {
            addCriterion("shop_sale_statistics_serial >", value, "shopSaleStatisticsSerial");
            return (Criteria) this;
        }

        public Criteria andShopSaleStatisticsSerialGreaterThanOrEqualTo(Integer value) {
            addCriterion("shop_sale_statistics_serial >=", value, "shopSaleStatisticsSerial");
            return (Criteria) this;
        }

        public Criteria andShopSaleStatisticsSerialLessThan(Integer value) {
            addCriterion("shop_sale_statistics_serial <", value, "shopSaleStatisticsSerial");
            return (Criteria) this;
        }

        public Criteria andShopSaleStatisticsSerialLessThanOrEqualTo(Integer value) {
            addCriterion("shop_sale_statistics_serial <=", value, "shopSaleStatisticsSerial");
            return (Criteria) this;
        }

        public Criteria andShopSaleStatisticsSerialIn(List<Integer> values) {
            addCriterion("shop_sale_statistics_serial in", values, "shopSaleStatisticsSerial");
            return (Criteria) this;
        }

        public Criteria andShopSaleStatisticsSerialNotIn(List<Integer> values) {
            addCriterion("shop_sale_statistics_serial not in", values, "shopSaleStatisticsSerial");
            return (Criteria) this;
        }

        public Criteria andShopSaleStatisticsSerialBetween(Integer value1, Integer value2) {
            addCriterion("shop_sale_statistics_serial between", value1, value2, "shopSaleStatisticsSerial");
            return (Criteria) this;
        }

        public Criteria andShopSaleStatisticsSerialNotBetween(Integer value1, Integer value2) {
            addCriterion("shop_sale_statistics_serial not between", value1, value2, "shopSaleStatisticsSerial");
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

        public Criteria andShopOrderCountIsNull() {
            addCriterion("shop_order_count is null");
            return (Criteria) this;
        }

        public Criteria andShopOrderCountIsNotNull() {
            addCriterion("shop_order_count is not null");
            return (Criteria) this;
        }

        public Criteria andShopOrderCountEqualTo(Integer value) {
            addCriterion("shop_order_count =", value, "shopOrderCount");
            return (Criteria) this;
        }

        public Criteria andShopOrderCountNotEqualTo(Integer value) {
            addCriterion("shop_order_count <>", value, "shopOrderCount");
            return (Criteria) this;
        }

        public Criteria andShopOrderCountGreaterThan(Integer value) {
            addCriterion("shop_order_count >", value, "shopOrderCount");
            return (Criteria) this;
        }

        public Criteria andShopOrderCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("shop_order_count >=", value, "shopOrderCount");
            return (Criteria) this;
        }

        public Criteria andShopOrderCountLessThan(Integer value) {
            addCriterion("shop_order_count <", value, "shopOrderCount");
            return (Criteria) this;
        }

        public Criteria andShopOrderCountLessThanOrEqualTo(Integer value) {
            addCriterion("shop_order_count <=", value, "shopOrderCount");
            return (Criteria) this;
        }

        public Criteria andShopOrderCountIn(List<Integer> values) {
            addCriterion("shop_order_count in", values, "shopOrderCount");
            return (Criteria) this;
        }

        public Criteria andShopOrderCountNotIn(List<Integer> values) {
            addCriterion("shop_order_count not in", values, "shopOrderCount");
            return (Criteria) this;
        }

        public Criteria andShopOrderCountBetween(Integer value1, Integer value2) {
            addCriterion("shop_order_count between", value1, value2, "shopOrderCount");
            return (Criteria) this;
        }

        public Criteria andShopOrderCountNotBetween(Integer value1, Integer value2) {
            addCriterion("shop_order_count not between", value1, value2, "shopOrderCount");
            return (Criteria) this;
        }

        public Criteria andShopOrderAmountIsNull() {
            addCriterion("shop_order_amount is null");
            return (Criteria) this;
        }

        public Criteria andShopOrderAmountIsNotNull() {
            addCriterion("shop_order_amount is not null");
            return (Criteria) this;
        }

        public Criteria andShopOrderAmountEqualTo(BigDecimal value) {
            addCriterion("shop_order_amount =", value, "shopOrderAmount");
            return (Criteria) this;
        }

        public Criteria andShopOrderAmountNotEqualTo(BigDecimal value) {
            addCriterion("shop_order_amount <>", value, "shopOrderAmount");
            return (Criteria) this;
        }

        public Criteria andShopOrderAmountGreaterThan(BigDecimal value) {
            addCriterion("shop_order_amount >", value, "shopOrderAmount");
            return (Criteria) this;
        }

        public Criteria andShopOrderAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("shop_order_amount >=", value, "shopOrderAmount");
            return (Criteria) this;
        }

        public Criteria andShopOrderAmountLessThan(BigDecimal value) {
            addCriterion("shop_order_amount <", value, "shopOrderAmount");
            return (Criteria) this;
        }

        public Criteria andShopOrderAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("shop_order_amount <=", value, "shopOrderAmount");
            return (Criteria) this;
        }

        public Criteria andShopOrderAmountIn(List<BigDecimal> values) {
            addCriterion("shop_order_amount in", values, "shopOrderAmount");
            return (Criteria) this;
        }

        public Criteria andShopOrderAmountNotIn(List<BigDecimal> values) {
            addCriterion("shop_order_amount not in", values, "shopOrderAmount");
            return (Criteria) this;
        }

        public Criteria andShopOrderAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shop_order_amount between", value1, value2, "shopOrderAmount");
            return (Criteria) this;
        }

        public Criteria andShopOrderAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shop_order_amount not between", value1, value2, "shopOrderAmount");
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
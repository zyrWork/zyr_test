package pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DishSaleStatisticsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DishSaleStatisticsExample() {
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

        public Criteria andDishSaleStatisticsSerialIsNull() {
            addCriterion("dish_sale_statistics_serial is null");
            return (Criteria) this;
        }

        public Criteria andDishSaleStatisticsSerialIsNotNull() {
            addCriterion("dish_sale_statistics_serial is not null");
            return (Criteria) this;
        }

        public Criteria andDishSaleStatisticsSerialEqualTo(Integer value) {
            addCriterion("dish_sale_statistics_serial =", value, "dishSaleStatisticsSerial");
            return (Criteria) this;
        }

        public Criteria andDishSaleStatisticsSerialNotEqualTo(Integer value) {
            addCriterion("dish_sale_statistics_serial <>", value, "dishSaleStatisticsSerial");
            return (Criteria) this;
        }

        public Criteria andDishSaleStatisticsSerialGreaterThan(Integer value) {
            addCriterion("dish_sale_statistics_serial >", value, "dishSaleStatisticsSerial");
            return (Criteria) this;
        }

        public Criteria andDishSaleStatisticsSerialGreaterThanOrEqualTo(Integer value) {
            addCriterion("dish_sale_statistics_serial >=", value, "dishSaleStatisticsSerial");
            return (Criteria) this;
        }

        public Criteria andDishSaleStatisticsSerialLessThan(Integer value) {
            addCriterion("dish_sale_statistics_serial <", value, "dishSaleStatisticsSerial");
            return (Criteria) this;
        }

        public Criteria andDishSaleStatisticsSerialLessThanOrEqualTo(Integer value) {
            addCriterion("dish_sale_statistics_serial <=", value, "dishSaleStatisticsSerial");
            return (Criteria) this;
        }

        public Criteria andDishSaleStatisticsSerialIn(List<Integer> values) {
            addCriterion("dish_sale_statistics_serial in", values, "dishSaleStatisticsSerial");
            return (Criteria) this;
        }

        public Criteria andDishSaleStatisticsSerialNotIn(List<Integer> values) {
            addCriterion("dish_sale_statistics_serial not in", values, "dishSaleStatisticsSerial");
            return (Criteria) this;
        }

        public Criteria andDishSaleStatisticsSerialBetween(Integer value1, Integer value2) {
            addCriterion("dish_sale_statistics_serial between", value1, value2, "dishSaleStatisticsSerial");
            return (Criteria) this;
        }

        public Criteria andDishSaleStatisticsSerialNotBetween(Integer value1, Integer value2) {
            addCriterion("dish_sale_statistics_serial not between", value1, value2, "dishSaleStatisticsSerial");
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

        public Criteria andDishSaleCountIsNull() {
            addCriterion("dish_sale_count is null");
            return (Criteria) this;
        }

        public Criteria andDishSaleCountIsNotNull() {
            addCriterion("dish_sale_count is not null");
            return (Criteria) this;
        }

        public Criteria andDishSaleCountEqualTo(Integer value) {
            addCriterion("dish_sale_count =", value, "dishSaleCount");
            return (Criteria) this;
        }

        public Criteria andDishSaleCountNotEqualTo(Integer value) {
            addCriterion("dish_sale_count <>", value, "dishSaleCount");
            return (Criteria) this;
        }

        public Criteria andDishSaleCountGreaterThan(Integer value) {
            addCriterion("dish_sale_count >", value, "dishSaleCount");
            return (Criteria) this;
        }

        public Criteria andDishSaleCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("dish_sale_count >=", value, "dishSaleCount");
            return (Criteria) this;
        }

        public Criteria andDishSaleCountLessThan(Integer value) {
            addCriterion("dish_sale_count <", value, "dishSaleCount");
            return (Criteria) this;
        }

        public Criteria andDishSaleCountLessThanOrEqualTo(Integer value) {
            addCriterion("dish_sale_count <=", value, "dishSaleCount");
            return (Criteria) this;
        }

        public Criteria andDishSaleCountIn(List<Integer> values) {
            addCriterion("dish_sale_count in", values, "dishSaleCount");
            return (Criteria) this;
        }

        public Criteria andDishSaleCountNotIn(List<Integer> values) {
            addCriterion("dish_sale_count not in", values, "dishSaleCount");
            return (Criteria) this;
        }

        public Criteria andDishSaleCountBetween(Integer value1, Integer value2) {
            addCriterion("dish_sale_count between", value1, value2, "dishSaleCount");
            return (Criteria) this;
        }

        public Criteria andDishSaleCountNotBetween(Integer value1, Integer value2) {
            addCriterion("dish_sale_count not between", value1, value2, "dishSaleCount");
            return (Criteria) this;
        }

        public Criteria andDishSaleAmountIsNull() {
            addCriterion("dish_sale_amount is null");
            return (Criteria) this;
        }

        public Criteria andDishSaleAmountIsNotNull() {
            addCriterion("dish_sale_amount is not null");
            return (Criteria) this;
        }

        public Criteria andDishSaleAmountEqualTo(BigDecimal value) {
            addCriterion("dish_sale_amount =", value, "dishSaleAmount");
            return (Criteria) this;
        }

        public Criteria andDishSaleAmountNotEqualTo(BigDecimal value) {
            addCriterion("dish_sale_amount <>", value, "dishSaleAmount");
            return (Criteria) this;
        }

        public Criteria andDishSaleAmountGreaterThan(BigDecimal value) {
            addCriterion("dish_sale_amount >", value, "dishSaleAmount");
            return (Criteria) this;
        }

        public Criteria andDishSaleAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("dish_sale_amount >=", value, "dishSaleAmount");
            return (Criteria) this;
        }

        public Criteria andDishSaleAmountLessThan(BigDecimal value) {
            addCriterion("dish_sale_amount <", value, "dishSaleAmount");
            return (Criteria) this;
        }

        public Criteria andDishSaleAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("dish_sale_amount <=", value, "dishSaleAmount");
            return (Criteria) this;
        }

        public Criteria andDishSaleAmountIn(List<BigDecimal> values) {
            addCriterion("dish_sale_amount in", values, "dishSaleAmount");
            return (Criteria) this;
        }

        public Criteria andDishSaleAmountNotIn(List<BigDecimal> values) {
            addCriterion("dish_sale_amount not in", values, "dishSaleAmount");
            return (Criteria) this;
        }

        public Criteria andDishSaleAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dish_sale_amount between", value1, value2, "dishSaleAmount");
            return (Criteria) this;
        }

        public Criteria andDishSaleAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dish_sale_amount not between", value1, value2, "dishSaleAmount");
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
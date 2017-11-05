package pojo;

import java.util.ArrayList;
import java.util.List;

public class DishTableDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DishTableDetailExample() {
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

        public Criteria andDishTableDetailSerialIsNull() {
            addCriterion("dish_table_detail_serial is null");
            return (Criteria) this;
        }

        public Criteria andDishTableDetailSerialIsNotNull() {
            addCriterion("dish_table_detail_serial is not null");
            return (Criteria) this;
        }

        public Criteria andDishTableDetailSerialEqualTo(Integer value) {
            addCriterion("dish_table_detail_serial =", value, "dishTableDetailSerial");
            return (Criteria) this;
        }

        public Criteria andDishTableDetailSerialNotEqualTo(Integer value) {
            addCriterion("dish_table_detail_serial <>", value, "dishTableDetailSerial");
            return (Criteria) this;
        }

        public Criteria andDishTableDetailSerialGreaterThan(Integer value) {
            addCriterion("dish_table_detail_serial >", value, "dishTableDetailSerial");
            return (Criteria) this;
        }

        public Criteria andDishTableDetailSerialGreaterThanOrEqualTo(Integer value) {
            addCriterion("dish_table_detail_serial >=", value, "dishTableDetailSerial");
            return (Criteria) this;
        }

        public Criteria andDishTableDetailSerialLessThan(Integer value) {
            addCriterion("dish_table_detail_serial <", value, "dishTableDetailSerial");
            return (Criteria) this;
        }

        public Criteria andDishTableDetailSerialLessThanOrEqualTo(Integer value) {
            addCriterion("dish_table_detail_serial <=", value, "dishTableDetailSerial");
            return (Criteria) this;
        }

        public Criteria andDishTableDetailSerialIn(List<Integer> values) {
            addCriterion("dish_table_detail_serial in", values, "dishTableDetailSerial");
            return (Criteria) this;
        }

        public Criteria andDishTableDetailSerialNotIn(List<Integer> values) {
            addCriterion("dish_table_detail_serial not in", values, "dishTableDetailSerial");
            return (Criteria) this;
        }

        public Criteria andDishTableDetailSerialBetween(Integer value1, Integer value2) {
            addCriterion("dish_table_detail_serial between", value1, value2, "dishTableDetailSerial");
            return (Criteria) this;
        }

        public Criteria andDishTableDetailSerialNotBetween(Integer value1, Integer value2) {
            addCriterion("dish_table_detail_serial not between", value1, value2, "dishTableDetailSerial");
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

        public Criteria andDishIdEqualTo(String value) {
            addCriterion("dish_id =", value, "dishId");
            return (Criteria) this;
        }

        public Criteria andDishIdNotEqualTo(String value) {
            addCriterion("dish_id <>", value, "dishId");
            return (Criteria) this;
        }

        public Criteria andDishIdGreaterThan(String value) {
            addCriterion("dish_id >", value, "dishId");
            return (Criteria) this;
        }

        public Criteria andDishIdGreaterThanOrEqualTo(String value) {
            addCriterion("dish_id >=", value, "dishId");
            return (Criteria) this;
        }

        public Criteria andDishIdLessThan(String value) {
            addCriterion("dish_id <", value, "dishId");
            return (Criteria) this;
        }

        public Criteria andDishIdLessThanOrEqualTo(String value) {
            addCriterion("dish_id <=", value, "dishId");
            return (Criteria) this;
        }

        public Criteria andDishIdLike(String value) {
            addCriterion("dish_id like", value, "dishId");
            return (Criteria) this;
        }

        public Criteria andDishIdNotLike(String value) {
            addCriterion("dish_id not like", value, "dishId");
            return (Criteria) this;
        }

        public Criteria andDishIdIn(List<String> values) {
            addCriterion("dish_id in", values, "dishId");
            return (Criteria) this;
        }

        public Criteria andDishIdNotIn(List<String> values) {
            addCriterion("dish_id not in", values, "dishId");
            return (Criteria) this;
        }

        public Criteria andDishIdBetween(String value1, String value2) {
            addCriterion("dish_id between", value1, value2, "dishId");
            return (Criteria) this;
        }

        public Criteria andDishIdNotBetween(String value1, String value2) {
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
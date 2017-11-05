package pojo;

import java.util.ArrayList;
import java.util.List;

public class PointsChangeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PointsChangeExample() {
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

        public Criteria andPointsChangeSerialIsNull() {
            addCriterion("points_change_serial is null");
            return (Criteria) this;
        }

        public Criteria andPointsChangeSerialIsNotNull() {
            addCriterion("points_change_serial is not null");
            return (Criteria) this;
        }

        public Criteria andPointsChangeSerialEqualTo(Integer value) {
            addCriterion("points_change_serial =", value, "pointsChangeSerial");
            return (Criteria) this;
        }

        public Criteria andPointsChangeSerialNotEqualTo(Integer value) {
            addCriterion("points_change_serial <>", value, "pointsChangeSerial");
            return (Criteria) this;
        }

        public Criteria andPointsChangeSerialGreaterThan(Integer value) {
            addCriterion("points_change_serial >", value, "pointsChangeSerial");
            return (Criteria) this;
        }

        public Criteria andPointsChangeSerialGreaterThanOrEqualTo(Integer value) {
            addCriterion("points_change_serial >=", value, "pointsChangeSerial");
            return (Criteria) this;
        }

        public Criteria andPointsChangeSerialLessThan(Integer value) {
            addCriterion("points_change_serial <", value, "pointsChangeSerial");
            return (Criteria) this;
        }

        public Criteria andPointsChangeSerialLessThanOrEqualTo(Integer value) {
            addCriterion("points_change_serial <=", value, "pointsChangeSerial");
            return (Criteria) this;
        }

        public Criteria andPointsChangeSerialIn(List<Integer> values) {
            addCriterion("points_change_serial in", values, "pointsChangeSerial");
            return (Criteria) this;
        }

        public Criteria andPointsChangeSerialNotIn(List<Integer> values) {
            addCriterion("points_change_serial not in", values, "pointsChangeSerial");
            return (Criteria) this;
        }

        public Criteria andPointsChangeSerialBetween(Integer value1, Integer value2) {
            addCriterion("points_change_serial between", value1, value2, "pointsChangeSerial");
            return (Criteria) this;
        }

        public Criteria andPointsChangeSerialNotBetween(Integer value1, Integer value2) {
            addCriterion("points_change_serial not between", value1, value2, "pointsChangeSerial");
            return (Criteria) this;
        }

        public Criteria andPointsIdIsNull() {
            addCriterion("points_id is null");
            return (Criteria) this;
        }

        public Criteria andPointsIdIsNotNull() {
            addCriterion("points_id is not null");
            return (Criteria) this;
        }

        public Criteria andPointsIdEqualTo(Integer value) {
            addCriterion("points_id =", value, "pointsId");
            return (Criteria) this;
        }

        public Criteria andPointsIdNotEqualTo(Integer value) {
            addCriterion("points_id <>", value, "pointsId");
            return (Criteria) this;
        }

        public Criteria andPointsIdGreaterThan(Integer value) {
            addCriterion("points_id >", value, "pointsId");
            return (Criteria) this;
        }

        public Criteria andPointsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("points_id >=", value, "pointsId");
            return (Criteria) this;
        }

        public Criteria andPointsIdLessThan(Integer value) {
            addCriterion("points_id <", value, "pointsId");
            return (Criteria) this;
        }

        public Criteria andPointsIdLessThanOrEqualTo(Integer value) {
            addCriterion("points_id <=", value, "pointsId");
            return (Criteria) this;
        }

        public Criteria andPointsIdIn(List<Integer> values) {
            addCriterion("points_id in", values, "pointsId");
            return (Criteria) this;
        }

        public Criteria andPointsIdNotIn(List<Integer> values) {
            addCriterion("points_id not in", values, "pointsId");
            return (Criteria) this;
        }

        public Criteria andPointsIdBetween(Integer value1, Integer value2) {
            addCriterion("points_id between", value1, value2, "pointsId");
            return (Criteria) this;
        }

        public Criteria andPointsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("points_id not between", value1, value2, "pointsId");
            return (Criteria) this;
        }

        public Criteria andChangeTypeIsNull() {
            addCriterion("change_type is null");
            return (Criteria) this;
        }

        public Criteria andChangeTypeIsNotNull() {
            addCriterion("change_type is not null");
            return (Criteria) this;
        }

        public Criteria andChangeTypeEqualTo(Short value) {
            addCriterion("change_type =", value, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeNotEqualTo(Short value) {
            addCriterion("change_type <>", value, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeGreaterThan(Short value) {
            addCriterion("change_type >", value, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("change_type >=", value, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeLessThan(Short value) {
            addCriterion("change_type <", value, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeLessThanOrEqualTo(Short value) {
            addCriterion("change_type <=", value, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeIn(List<Short> values) {
            addCriterion("change_type in", values, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeNotIn(List<Short> values) {
            addCriterion("change_type not in", values, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeBetween(Short value1, Short value2) {
            addCriterion("change_type between", value1, value2, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeNotBetween(Short value1, Short value2) {
            addCriterion("change_type not between", value1, value2, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeAmountIsNull() {
            addCriterion("change_amount is null");
            return (Criteria) this;
        }

        public Criteria andChangeAmountIsNotNull() {
            addCriterion("change_amount is not null");
            return (Criteria) this;
        }

        public Criteria andChangeAmountEqualTo(Integer value) {
            addCriterion("change_amount =", value, "changeAmount");
            return (Criteria) this;
        }

        public Criteria andChangeAmountNotEqualTo(Integer value) {
            addCriterion("change_amount <>", value, "changeAmount");
            return (Criteria) this;
        }

        public Criteria andChangeAmountGreaterThan(Integer value) {
            addCriterion("change_amount >", value, "changeAmount");
            return (Criteria) this;
        }

        public Criteria andChangeAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("change_amount >=", value, "changeAmount");
            return (Criteria) this;
        }

        public Criteria andChangeAmountLessThan(Integer value) {
            addCriterion("change_amount <", value, "changeAmount");
            return (Criteria) this;
        }

        public Criteria andChangeAmountLessThanOrEqualTo(Integer value) {
            addCriterion("change_amount <=", value, "changeAmount");
            return (Criteria) this;
        }

        public Criteria andChangeAmountIn(List<Integer> values) {
            addCriterion("change_amount in", values, "changeAmount");
            return (Criteria) this;
        }

        public Criteria andChangeAmountNotIn(List<Integer> values) {
            addCriterion("change_amount not in", values, "changeAmount");
            return (Criteria) this;
        }

        public Criteria andChangeAmountBetween(Integer value1, Integer value2) {
            addCriterion("change_amount between", value1, value2, "changeAmount");
            return (Criteria) this;
        }

        public Criteria andChangeAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("change_amount not between", value1, value2, "changeAmount");
            return (Criteria) this;
        }

        public Criteria andPointsBalanceIsNull() {
            addCriterion("points_balance is null");
            return (Criteria) this;
        }

        public Criteria andPointsBalanceIsNotNull() {
            addCriterion("points_balance is not null");
            return (Criteria) this;
        }

        public Criteria andPointsBalanceEqualTo(Integer value) {
            addCriterion("points_balance =", value, "pointsBalance");
            return (Criteria) this;
        }

        public Criteria andPointsBalanceNotEqualTo(Integer value) {
            addCriterion("points_balance <>", value, "pointsBalance");
            return (Criteria) this;
        }

        public Criteria andPointsBalanceGreaterThan(Integer value) {
            addCriterion("points_balance >", value, "pointsBalance");
            return (Criteria) this;
        }

        public Criteria andPointsBalanceGreaterThanOrEqualTo(Integer value) {
            addCriterion("points_balance >=", value, "pointsBalance");
            return (Criteria) this;
        }

        public Criteria andPointsBalanceLessThan(Integer value) {
            addCriterion("points_balance <", value, "pointsBalance");
            return (Criteria) this;
        }

        public Criteria andPointsBalanceLessThanOrEqualTo(Integer value) {
            addCriterion("points_balance <=", value, "pointsBalance");
            return (Criteria) this;
        }

        public Criteria andPointsBalanceIn(List<Integer> values) {
            addCriterion("points_balance in", values, "pointsBalance");
            return (Criteria) this;
        }

        public Criteria andPointsBalanceNotIn(List<Integer> values) {
            addCriterion("points_balance not in", values, "pointsBalance");
            return (Criteria) this;
        }

        public Criteria andPointsBalanceBetween(Integer value1, Integer value2) {
            addCriterion("points_balance between", value1, value2, "pointsBalance");
            return (Criteria) this;
        }

        public Criteria andPointsBalanceNotBetween(Integer value1, Integer value2) {
            addCriterion("points_balance not between", value1, value2, "pointsBalance");
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

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
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
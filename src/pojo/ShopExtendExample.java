package pojo;

import java.util.ArrayList;
import java.util.List;

public class ShopExtendExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShopExtendExample() {
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

        public Criteria andExtendSerialIsNull() {
            addCriterion("extend_serial is null");
            return (Criteria) this;
        }

        public Criteria andExtendSerialIsNotNull() {
            addCriterion("extend_serial is not null");
            return (Criteria) this;
        }

        public Criteria andExtendSerialEqualTo(Integer value) {
            addCriterion("extend_serial =", value, "extendSerial");
            return (Criteria) this;
        }

        public Criteria andExtendSerialNotEqualTo(Integer value) {
            addCriterion("extend_serial <>", value, "extendSerial");
            return (Criteria) this;
        }

        public Criteria andExtendSerialGreaterThan(Integer value) {
            addCriterion("extend_serial >", value, "extendSerial");
            return (Criteria) this;
        }

        public Criteria andExtendSerialGreaterThanOrEqualTo(Integer value) {
            addCriterion("extend_serial >=", value, "extendSerial");
            return (Criteria) this;
        }

        public Criteria andExtendSerialLessThan(Integer value) {
            addCriterion("extend_serial <", value, "extendSerial");
            return (Criteria) this;
        }

        public Criteria andExtendSerialLessThanOrEqualTo(Integer value) {
            addCriterion("extend_serial <=", value, "extendSerial");
            return (Criteria) this;
        }

        public Criteria andExtendSerialIn(List<Integer> values) {
            addCriterion("extend_serial in", values, "extendSerial");
            return (Criteria) this;
        }

        public Criteria andExtendSerialNotIn(List<Integer> values) {
            addCriterion("extend_serial not in", values, "extendSerial");
            return (Criteria) this;
        }

        public Criteria andExtendSerialBetween(Integer value1, Integer value2) {
            addCriterion("extend_serial between", value1, value2, "extendSerial");
            return (Criteria) this;
        }

        public Criteria andExtendSerialNotBetween(Integer value1, Integer value2) {
            addCriterion("extend_serial not between", value1, value2, "extendSerial");
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

        public Criteria andWaitingServiceStatusIsNull() {
            addCriterion("waiting_service_status is null");
            return (Criteria) this;
        }

        public Criteria andWaitingServiceStatusIsNotNull() {
            addCriterion("waiting_service_status is not null");
            return (Criteria) this;
        }

        public Criteria andWaitingServiceStatusEqualTo(Short value) {
            addCriterion("waiting_service_status =", value, "waitingServiceStatus");
            return (Criteria) this;
        }

        public Criteria andWaitingServiceStatusNotEqualTo(Short value) {
            addCriterion("waiting_service_status <>", value, "waitingServiceStatus");
            return (Criteria) this;
        }

        public Criteria andWaitingServiceStatusGreaterThan(Short value) {
            addCriterion("waiting_service_status >", value, "waitingServiceStatus");
            return (Criteria) this;
        }

        public Criteria andWaitingServiceStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("waiting_service_status >=", value, "waitingServiceStatus");
            return (Criteria) this;
        }

        public Criteria andWaitingServiceStatusLessThan(Short value) {
            addCriterion("waiting_service_status <", value, "waitingServiceStatus");
            return (Criteria) this;
        }

        public Criteria andWaitingServiceStatusLessThanOrEqualTo(Short value) {
            addCriterion("waiting_service_status <=", value, "waitingServiceStatus");
            return (Criteria) this;
        }

        public Criteria andWaitingServiceStatusIn(List<Short> values) {
            addCriterion("waiting_service_status in", values, "waitingServiceStatus");
            return (Criteria) this;
        }

        public Criteria andWaitingServiceStatusNotIn(List<Short> values) {
            addCriterion("waiting_service_status not in", values, "waitingServiceStatus");
            return (Criteria) this;
        }

        public Criteria andWaitingServiceStatusBetween(Short value1, Short value2) {
            addCriterion("waiting_service_status between", value1, value2, "waitingServiceStatus");
            return (Criteria) this;
        }

        public Criteria andWaitingServiceStatusNotBetween(Short value1, Short value2) {
            addCriterion("waiting_service_status not between", value1, value2, "waitingServiceStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentWatingNumberIsNull() {
            addCriterion("current_wating_number is null");
            return (Criteria) this;
        }

        public Criteria andCurrentWatingNumberIsNotNull() {
            addCriterion("current_wating_number is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentWatingNumberEqualTo(Integer value) {
            addCriterion("current_wating_number =", value, "currentWatingNumber");
            return (Criteria) this;
        }

        public Criteria andCurrentWatingNumberNotEqualTo(Integer value) {
            addCriterion("current_wating_number <>", value, "currentWatingNumber");
            return (Criteria) this;
        }

        public Criteria andCurrentWatingNumberGreaterThan(Integer value) {
            addCriterion("current_wating_number >", value, "currentWatingNumber");
            return (Criteria) this;
        }

        public Criteria andCurrentWatingNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("current_wating_number >=", value, "currentWatingNumber");
            return (Criteria) this;
        }

        public Criteria andCurrentWatingNumberLessThan(Integer value) {
            addCriterion("current_wating_number <", value, "currentWatingNumber");
            return (Criteria) this;
        }

        public Criteria andCurrentWatingNumberLessThanOrEqualTo(Integer value) {
            addCriterion("current_wating_number <=", value, "currentWatingNumber");
            return (Criteria) this;
        }

        public Criteria andCurrentWatingNumberIn(List<Integer> values) {
            addCriterion("current_wating_number in", values, "currentWatingNumber");
            return (Criteria) this;
        }

        public Criteria andCurrentWatingNumberNotIn(List<Integer> values) {
            addCriterion("current_wating_number not in", values, "currentWatingNumber");
            return (Criteria) this;
        }

        public Criteria andCurrentWatingNumberBetween(Integer value1, Integer value2) {
            addCriterion("current_wating_number between", value1, value2, "currentWatingNumber");
            return (Criteria) this;
        }

        public Criteria andCurrentWatingNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("current_wating_number not between", value1, value2, "currentWatingNumber");
            return (Criteria) this;
        }

        public Criteria andRemindNumberIsNull() {
            addCriterion("remind_number is null");
            return (Criteria) this;
        }

        public Criteria andRemindNumberIsNotNull() {
            addCriterion("remind_number is not null");
            return (Criteria) this;
        }

        public Criteria andRemindNumberEqualTo(Integer value) {
            addCriterion("remind_number =", value, "remindNumber");
            return (Criteria) this;
        }

        public Criteria andRemindNumberNotEqualTo(Integer value) {
            addCriterion("remind_number <>", value, "remindNumber");
            return (Criteria) this;
        }

        public Criteria andRemindNumberGreaterThan(Integer value) {
            addCriterion("remind_number >", value, "remindNumber");
            return (Criteria) this;
        }

        public Criteria andRemindNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("remind_number >=", value, "remindNumber");
            return (Criteria) this;
        }

        public Criteria andRemindNumberLessThan(Integer value) {
            addCriterion("remind_number <", value, "remindNumber");
            return (Criteria) this;
        }

        public Criteria andRemindNumberLessThanOrEqualTo(Integer value) {
            addCriterion("remind_number <=", value, "remindNumber");
            return (Criteria) this;
        }

        public Criteria andRemindNumberIn(List<Integer> values) {
            addCriterion("remind_number in", values, "remindNumber");
            return (Criteria) this;
        }

        public Criteria andRemindNumberNotIn(List<Integer> values) {
            addCriterion("remind_number not in", values, "remindNumber");
            return (Criteria) this;
        }

        public Criteria andRemindNumberBetween(Integer value1, Integer value2) {
            addCriterion("remind_number between", value1, value2, "remindNumber");
            return (Criteria) this;
        }

        public Criteria andRemindNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("remind_number not between", value1, value2, "remindNumber");
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
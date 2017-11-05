package pojo;

import java.util.ArrayList;
import java.util.List;

public class PointRuleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PointRuleExample() {
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

        public Criteria andRuleSerialIsNull() {
            addCriterion("rule_serial is null");
            return (Criteria) this;
        }

        public Criteria andRuleSerialIsNotNull() {
            addCriterion("rule_serial is not null");
            return (Criteria) this;
        }

        public Criteria andRuleSerialEqualTo(Integer value) {
            addCriterion("rule_serial =", value, "ruleSerial");
            return (Criteria) this;
        }

        public Criteria andRuleSerialNotEqualTo(Integer value) {
            addCriterion("rule_serial <>", value, "ruleSerial");
            return (Criteria) this;
        }

        public Criteria andRuleSerialGreaterThan(Integer value) {
            addCriterion("rule_serial >", value, "ruleSerial");
            return (Criteria) this;
        }

        public Criteria andRuleSerialGreaterThanOrEqualTo(Integer value) {
            addCriterion("rule_serial >=", value, "ruleSerial");
            return (Criteria) this;
        }

        public Criteria andRuleSerialLessThan(Integer value) {
            addCriterion("rule_serial <", value, "ruleSerial");
            return (Criteria) this;
        }

        public Criteria andRuleSerialLessThanOrEqualTo(Integer value) {
            addCriterion("rule_serial <=", value, "ruleSerial");
            return (Criteria) this;
        }

        public Criteria andRuleSerialIn(List<Integer> values) {
            addCriterion("rule_serial in", values, "ruleSerial");
            return (Criteria) this;
        }

        public Criteria andRuleSerialNotIn(List<Integer> values) {
            addCriterion("rule_serial not in", values, "ruleSerial");
            return (Criteria) this;
        }

        public Criteria andRuleSerialBetween(Integer value1, Integer value2) {
            addCriterion("rule_serial between", value1, value2, "ruleSerial");
            return (Criteria) this;
        }

        public Criteria andRuleSerialNotBetween(Integer value1, Integer value2) {
            addCriterion("rule_serial not between", value1, value2, "ruleSerial");
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

        public Criteria andRuleTriggerIsNull() {
            addCriterion("rule_trigger is null");
            return (Criteria) this;
        }

        public Criteria andRuleTriggerIsNotNull() {
            addCriterion("rule_trigger is not null");
            return (Criteria) this;
        }

        public Criteria andRuleTriggerEqualTo(String value) {
            addCriterion("rule_trigger =", value, "ruleTrigger");
            return (Criteria) this;
        }

        public Criteria andRuleTriggerNotEqualTo(String value) {
            addCriterion("rule_trigger <>", value, "ruleTrigger");
            return (Criteria) this;
        }

        public Criteria andRuleTriggerGreaterThan(String value) {
            addCriterion("rule_trigger >", value, "ruleTrigger");
            return (Criteria) this;
        }

        public Criteria andRuleTriggerGreaterThanOrEqualTo(String value) {
            addCriterion("rule_trigger >=", value, "ruleTrigger");
            return (Criteria) this;
        }

        public Criteria andRuleTriggerLessThan(String value) {
            addCriterion("rule_trigger <", value, "ruleTrigger");
            return (Criteria) this;
        }

        public Criteria andRuleTriggerLessThanOrEqualTo(String value) {
            addCriterion("rule_trigger <=", value, "ruleTrigger");
            return (Criteria) this;
        }

        public Criteria andRuleTriggerLike(String value) {
            addCriterion("rule_trigger like", value, "ruleTrigger");
            return (Criteria) this;
        }

        public Criteria andRuleTriggerNotLike(String value) {
            addCriterion("rule_trigger not like", value, "ruleTrigger");
            return (Criteria) this;
        }

        public Criteria andRuleTriggerIn(List<String> values) {
            addCriterion("rule_trigger in", values, "ruleTrigger");
            return (Criteria) this;
        }

        public Criteria andRuleTriggerNotIn(List<String> values) {
            addCriterion("rule_trigger not in", values, "ruleTrigger");
            return (Criteria) this;
        }

        public Criteria andRuleTriggerBetween(String value1, String value2) {
            addCriterion("rule_trigger between", value1, value2, "ruleTrigger");
            return (Criteria) this;
        }

        public Criteria andRuleTriggerNotBetween(String value1, String value2) {
            addCriterion("rule_trigger not between", value1, value2, "ruleTrigger");
            return (Criteria) this;
        }

        public Criteria andRuleTypeIsNull() {
            addCriterion("rule_type is null");
            return (Criteria) this;
        }

        public Criteria andRuleTypeIsNotNull() {
            addCriterion("rule_type is not null");
            return (Criteria) this;
        }

        public Criteria andRuleTypeEqualTo(Short value) {
            addCriterion("rule_type =", value, "ruleType");
            return (Criteria) this;
        }

        public Criteria andRuleTypeNotEqualTo(Short value) {
            addCriterion("rule_type <>", value, "ruleType");
            return (Criteria) this;
        }

        public Criteria andRuleTypeGreaterThan(Short value) {
            addCriterion("rule_type >", value, "ruleType");
            return (Criteria) this;
        }

        public Criteria andRuleTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("rule_type >=", value, "ruleType");
            return (Criteria) this;
        }

        public Criteria andRuleTypeLessThan(Short value) {
            addCriterion("rule_type <", value, "ruleType");
            return (Criteria) this;
        }

        public Criteria andRuleTypeLessThanOrEqualTo(Short value) {
            addCriterion("rule_type <=", value, "ruleType");
            return (Criteria) this;
        }

        public Criteria andRuleTypeIn(List<Short> values) {
            addCriterion("rule_type in", values, "ruleType");
            return (Criteria) this;
        }

        public Criteria andRuleTypeNotIn(List<Short> values) {
            addCriterion("rule_type not in", values, "ruleType");
            return (Criteria) this;
        }

        public Criteria andRuleTypeBetween(Short value1, Short value2) {
            addCriterion("rule_type between", value1, value2, "ruleType");
            return (Criteria) this;
        }

        public Criteria andRuleTypeNotBetween(Short value1, Short value2) {
            addCriterion("rule_type not between", value1, value2, "ruleType");
            return (Criteria) this;
        }

        public Criteria andRuleNumberIsNull() {
            addCriterion("rule_number is null");
            return (Criteria) this;
        }

        public Criteria andRuleNumberIsNotNull() {
            addCriterion("rule_number is not null");
            return (Criteria) this;
        }

        public Criteria andRuleNumberEqualTo(Integer value) {
            addCriterion("rule_number =", value, "ruleNumber");
            return (Criteria) this;
        }

        public Criteria andRuleNumberNotEqualTo(Integer value) {
            addCriterion("rule_number <>", value, "ruleNumber");
            return (Criteria) this;
        }

        public Criteria andRuleNumberGreaterThan(Integer value) {
            addCriterion("rule_number >", value, "ruleNumber");
            return (Criteria) this;
        }

        public Criteria andRuleNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("rule_number >=", value, "ruleNumber");
            return (Criteria) this;
        }

        public Criteria andRuleNumberLessThan(Integer value) {
            addCriterion("rule_number <", value, "ruleNumber");
            return (Criteria) this;
        }

        public Criteria andRuleNumberLessThanOrEqualTo(Integer value) {
            addCriterion("rule_number <=", value, "ruleNumber");
            return (Criteria) this;
        }

        public Criteria andRuleNumberIn(List<Integer> values) {
            addCriterion("rule_number in", values, "ruleNumber");
            return (Criteria) this;
        }

        public Criteria andRuleNumberNotIn(List<Integer> values) {
            addCriterion("rule_number not in", values, "ruleNumber");
            return (Criteria) this;
        }

        public Criteria andRuleNumberBetween(Integer value1, Integer value2) {
            addCriterion("rule_number between", value1, value2, "ruleNumber");
            return (Criteria) this;
        }

        public Criteria andRuleNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("rule_number not between", value1, value2, "ruleNumber");
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
package pojo;

import java.util.ArrayList;
import java.util.List;

public class GroupPrivilegeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GroupPrivilegeExample() {
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

        public Criteria andGroupPrivSerialIsNull() {
            addCriterion("group_priv_serial is null");
            return (Criteria) this;
        }

        public Criteria andGroupPrivSerialIsNotNull() {
            addCriterion("group_priv_serial is not null");
            return (Criteria) this;
        }

        public Criteria andGroupPrivSerialEqualTo(Integer value) {
            addCriterion("group_priv_serial =", value, "groupPrivSerial");
            return (Criteria) this;
        }

        public Criteria andGroupPrivSerialNotEqualTo(Integer value) {
            addCriterion("group_priv_serial <>", value, "groupPrivSerial");
            return (Criteria) this;
        }

        public Criteria andGroupPrivSerialGreaterThan(Integer value) {
            addCriterion("group_priv_serial >", value, "groupPrivSerial");
            return (Criteria) this;
        }

        public Criteria andGroupPrivSerialGreaterThanOrEqualTo(Integer value) {
            addCriterion("group_priv_serial >=", value, "groupPrivSerial");
            return (Criteria) this;
        }

        public Criteria andGroupPrivSerialLessThan(Integer value) {
            addCriterion("group_priv_serial <", value, "groupPrivSerial");
            return (Criteria) this;
        }

        public Criteria andGroupPrivSerialLessThanOrEqualTo(Integer value) {
            addCriterion("group_priv_serial <=", value, "groupPrivSerial");
            return (Criteria) this;
        }

        public Criteria andGroupPrivSerialIn(List<Integer> values) {
            addCriterion("group_priv_serial in", values, "groupPrivSerial");
            return (Criteria) this;
        }

        public Criteria andGroupPrivSerialNotIn(List<Integer> values) {
            addCriterion("group_priv_serial not in", values, "groupPrivSerial");
            return (Criteria) this;
        }

        public Criteria andGroupPrivSerialBetween(Integer value1, Integer value2) {
            addCriterion("group_priv_serial between", value1, value2, "groupPrivSerial");
            return (Criteria) this;
        }

        public Criteria andGroupPrivSerialNotBetween(Integer value1, Integer value2) {
            addCriterion("group_priv_serial not between", value1, value2, "groupPrivSerial");
            return (Criteria) this;
        }

        public Criteria andGroupsIdIsNull() {
            addCriterion("groups_id is null");
            return (Criteria) this;
        }

        public Criteria andGroupsIdIsNotNull() {
            addCriterion("groups_id is not null");
            return (Criteria) this;
        }

        public Criteria andGroupsIdEqualTo(Integer value) {
            addCriterion("groups_id =", value, "groupsId");
            return (Criteria) this;
        }

        public Criteria andGroupsIdNotEqualTo(Integer value) {
            addCriterion("groups_id <>", value, "groupsId");
            return (Criteria) this;
        }

        public Criteria andGroupsIdGreaterThan(Integer value) {
            addCriterion("groups_id >", value, "groupsId");
            return (Criteria) this;
        }

        public Criteria andGroupsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("groups_id >=", value, "groupsId");
            return (Criteria) this;
        }

        public Criteria andGroupsIdLessThan(Integer value) {
            addCriterion("groups_id <", value, "groupsId");
            return (Criteria) this;
        }

        public Criteria andGroupsIdLessThanOrEqualTo(Integer value) {
            addCriterion("groups_id <=", value, "groupsId");
            return (Criteria) this;
        }

        public Criteria andGroupsIdIn(List<Integer> values) {
            addCriterion("groups_id in", values, "groupsId");
            return (Criteria) this;
        }

        public Criteria andGroupsIdNotIn(List<Integer> values) {
            addCriterion("groups_id not in", values, "groupsId");
            return (Criteria) this;
        }

        public Criteria andGroupsIdBetween(Integer value1, Integer value2) {
            addCriterion("groups_id between", value1, value2, "groupsId");
            return (Criteria) this;
        }

        public Criteria andGroupsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("groups_id not between", value1, value2, "groupsId");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
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
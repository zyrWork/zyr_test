package pojo;

import java.util.ArrayList;
import java.util.List;

public class MemberExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MemberExample() {
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

        public Criteria andMemberSerialIsNull() {
            addCriterion("member_serial is null");
            return (Criteria) this;
        }

        public Criteria andMemberSerialIsNotNull() {
            addCriterion("member_serial is not null");
            return (Criteria) this;
        }

        public Criteria andMemberSerialEqualTo(Integer value) {
            addCriterion("member_serial =", value, "memberSerial");
            return (Criteria) this;
        }

        public Criteria andMemberSerialNotEqualTo(Integer value) {
            addCriterion("member_serial <>", value, "memberSerial");
            return (Criteria) this;
        }

        public Criteria andMemberSerialGreaterThan(Integer value) {
            addCriterion("member_serial >", value, "memberSerial");
            return (Criteria) this;
        }

        public Criteria andMemberSerialGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_serial >=", value, "memberSerial");
            return (Criteria) this;
        }

        public Criteria andMemberSerialLessThan(Integer value) {
            addCriterion("member_serial <", value, "memberSerial");
            return (Criteria) this;
        }

        public Criteria andMemberSerialLessThanOrEqualTo(Integer value) {
            addCriterion("member_serial <=", value, "memberSerial");
            return (Criteria) this;
        }

        public Criteria andMemberSerialIn(List<Integer> values) {
            addCriterion("member_serial in", values, "memberSerial");
            return (Criteria) this;
        }

        public Criteria andMemberSerialNotIn(List<Integer> values) {
            addCriterion("member_serial not in", values, "memberSerial");
            return (Criteria) this;
        }

        public Criteria andMemberSerialBetween(Integer value1, Integer value2) {
            addCriterion("member_serial between", value1, value2, "memberSerial");
            return (Criteria) this;
        }

        public Criteria andMemberSerialNotBetween(Integer value1, Integer value2) {
            addCriterion("member_serial not between", value1, value2, "memberSerial");
            return (Criteria) this;
        }

        public Criteria andMemberAccountIdIsNull() {
            addCriterion("member_account_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberAccountIdIsNotNull() {
            addCriterion("member_account_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberAccountIdEqualTo(Integer value) {
            addCriterion("member_account_id =", value, "memberAccountId");
            return (Criteria) this;
        }

        public Criteria andMemberAccountIdNotEqualTo(Integer value) {
            addCriterion("member_account_id <>", value, "memberAccountId");
            return (Criteria) this;
        }

        public Criteria andMemberAccountIdGreaterThan(Integer value) {
            addCriterion("member_account_id >", value, "memberAccountId");
            return (Criteria) this;
        }

        public Criteria andMemberAccountIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_account_id >=", value, "memberAccountId");
            return (Criteria) this;
        }

        public Criteria andMemberAccountIdLessThan(Integer value) {
            addCriterion("member_account_id <", value, "memberAccountId");
            return (Criteria) this;
        }

        public Criteria andMemberAccountIdLessThanOrEqualTo(Integer value) {
            addCriterion("member_account_id <=", value, "memberAccountId");
            return (Criteria) this;
        }

        public Criteria andMemberAccountIdIn(List<Integer> values) {
            addCriterion("member_account_id in", values, "memberAccountId");
            return (Criteria) this;
        }

        public Criteria andMemberAccountIdNotIn(List<Integer> values) {
            addCriterion("member_account_id not in", values, "memberAccountId");
            return (Criteria) this;
        }

        public Criteria andMemberAccountIdBetween(Integer value1, Integer value2) {
            addCriterion("member_account_id between", value1, value2, "memberAccountId");
            return (Criteria) this;
        }

        public Criteria andMemberAccountIdNotBetween(Integer value1, Integer value2) {
            addCriterion("member_account_id not between", value1, value2, "memberAccountId");
            return (Criteria) this;
        }

        public Criteria andMemberNoIsNull() {
            addCriterion("member_no is null");
            return (Criteria) this;
        }

        public Criteria andMemberNoIsNotNull() {
            addCriterion("member_no is not null");
            return (Criteria) this;
        }

        public Criteria andMemberNoEqualTo(String value) {
            addCriterion("member_no =", value, "memberNo");
            return (Criteria) this;
        }

        public Criteria andMemberNoNotEqualTo(String value) {
            addCriterion("member_no <>", value, "memberNo");
            return (Criteria) this;
        }

        public Criteria andMemberNoGreaterThan(String value) {
            addCriterion("member_no >", value, "memberNo");
            return (Criteria) this;
        }

        public Criteria andMemberNoGreaterThanOrEqualTo(String value) {
            addCriterion("member_no >=", value, "memberNo");
            return (Criteria) this;
        }

        public Criteria andMemberNoLessThan(String value) {
            addCriterion("member_no <", value, "memberNo");
            return (Criteria) this;
        }

        public Criteria andMemberNoLessThanOrEqualTo(String value) {
            addCriterion("member_no <=", value, "memberNo");
            return (Criteria) this;
        }

        public Criteria andMemberNoLike(String value) {
            addCriterion("member_no like", value, "memberNo");
            return (Criteria) this;
        }

        public Criteria andMemberNoNotLike(String value) {
            addCriterion("member_no not like", value, "memberNo");
            return (Criteria) this;
        }

        public Criteria andMemberNoIn(List<String> values) {
            addCriterion("member_no in", values, "memberNo");
            return (Criteria) this;
        }

        public Criteria andMemberNoNotIn(List<String> values) {
            addCriterion("member_no not in", values, "memberNo");
            return (Criteria) this;
        }

        public Criteria andMemberNoBetween(String value1, String value2) {
            addCriterion("member_no between", value1, value2, "memberNo");
            return (Criteria) this;
        }

        public Criteria andMemberNoNotBetween(String value1, String value2) {
            addCriterion("member_no not between", value1, value2, "memberNo");
            return (Criteria) this;
        }

        public Criteria andMemberQqIsNull() {
            addCriterion("member_qq is null");
            return (Criteria) this;
        }

        public Criteria andMemberQqIsNotNull() {
            addCriterion("member_qq is not null");
            return (Criteria) this;
        }

        public Criteria andMemberQqEqualTo(String value) {
            addCriterion("member_qq =", value, "memberQq");
            return (Criteria) this;
        }

        public Criteria andMemberQqNotEqualTo(String value) {
            addCriterion("member_qq <>", value, "memberQq");
            return (Criteria) this;
        }

        public Criteria andMemberQqGreaterThan(String value) {
            addCriterion("member_qq >", value, "memberQq");
            return (Criteria) this;
        }

        public Criteria andMemberQqGreaterThanOrEqualTo(String value) {
            addCriterion("member_qq >=", value, "memberQq");
            return (Criteria) this;
        }

        public Criteria andMemberQqLessThan(String value) {
            addCriterion("member_qq <", value, "memberQq");
            return (Criteria) this;
        }

        public Criteria andMemberQqLessThanOrEqualTo(String value) {
            addCriterion("member_qq <=", value, "memberQq");
            return (Criteria) this;
        }

        public Criteria andMemberQqLike(String value) {
            addCriterion("member_qq like", value, "memberQq");
            return (Criteria) this;
        }

        public Criteria andMemberQqNotLike(String value) {
            addCriterion("member_qq not like", value, "memberQq");
            return (Criteria) this;
        }

        public Criteria andMemberQqIn(List<String> values) {
            addCriterion("member_qq in", values, "memberQq");
            return (Criteria) this;
        }

        public Criteria andMemberQqNotIn(List<String> values) {
            addCriterion("member_qq not in", values, "memberQq");
            return (Criteria) this;
        }

        public Criteria andMemberQqBetween(String value1, String value2) {
            addCriterion("member_qq between", value1, value2, "memberQq");
            return (Criteria) this;
        }

        public Criteria andMemberQqNotBetween(String value1, String value2) {
            addCriterion("member_qq not between", value1, value2, "memberQq");
            return (Criteria) this;
        }

        public Criteria andMemberMailIsNull() {
            addCriterion("member_mail is null");
            return (Criteria) this;
        }

        public Criteria andMemberMailIsNotNull() {
            addCriterion("member_mail is not null");
            return (Criteria) this;
        }

        public Criteria andMemberMailEqualTo(String value) {
            addCriterion("member_mail =", value, "memberMail");
            return (Criteria) this;
        }

        public Criteria andMemberMailNotEqualTo(String value) {
            addCriterion("member_mail <>", value, "memberMail");
            return (Criteria) this;
        }

        public Criteria andMemberMailGreaterThan(String value) {
            addCriterion("member_mail >", value, "memberMail");
            return (Criteria) this;
        }

        public Criteria andMemberMailGreaterThanOrEqualTo(String value) {
            addCriterion("member_mail >=", value, "memberMail");
            return (Criteria) this;
        }

        public Criteria andMemberMailLessThan(String value) {
            addCriterion("member_mail <", value, "memberMail");
            return (Criteria) this;
        }

        public Criteria andMemberMailLessThanOrEqualTo(String value) {
            addCriterion("member_mail <=", value, "memberMail");
            return (Criteria) this;
        }

        public Criteria andMemberMailLike(String value) {
            addCriterion("member_mail like", value, "memberMail");
            return (Criteria) this;
        }

        public Criteria andMemberMailNotLike(String value) {
            addCriterion("member_mail not like", value, "memberMail");
            return (Criteria) this;
        }

        public Criteria andMemberMailIn(List<String> values) {
            addCriterion("member_mail in", values, "memberMail");
            return (Criteria) this;
        }

        public Criteria andMemberMailNotIn(List<String> values) {
            addCriterion("member_mail not in", values, "memberMail");
            return (Criteria) this;
        }

        public Criteria andMemberMailBetween(String value1, String value2) {
            addCriterion("member_mail between", value1, value2, "memberMail");
            return (Criteria) this;
        }

        public Criteria andMemberMailNotBetween(String value1, String value2) {
            addCriterion("member_mail not between", value1, value2, "memberMail");
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
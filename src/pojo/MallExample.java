package pojo;

import java.util.ArrayList;
import java.util.List;

public class MallExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MallExample() {
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

        public Criteria andMallSerialIsNull() {
            addCriterion("mall_serial is null");
            return (Criteria) this;
        }

        public Criteria andMallSerialIsNotNull() {
            addCriterion("mall_serial is not null");
            return (Criteria) this;
        }

        public Criteria andMallSerialEqualTo(Integer value) {
            addCriterion("mall_serial =", value, "mallSerial");
            return (Criteria) this;
        }

        public Criteria andMallSerialNotEqualTo(Integer value) {
            addCriterion("mall_serial <>", value, "mallSerial");
            return (Criteria) this;
        }

        public Criteria andMallSerialGreaterThan(Integer value) {
            addCriterion("mall_serial >", value, "mallSerial");
            return (Criteria) this;
        }

        public Criteria andMallSerialGreaterThanOrEqualTo(Integer value) {
            addCriterion("mall_serial >=", value, "mallSerial");
            return (Criteria) this;
        }

        public Criteria andMallSerialLessThan(Integer value) {
            addCriterion("mall_serial <", value, "mallSerial");
            return (Criteria) this;
        }

        public Criteria andMallSerialLessThanOrEqualTo(Integer value) {
            addCriterion("mall_serial <=", value, "mallSerial");
            return (Criteria) this;
        }

        public Criteria andMallSerialIn(List<Integer> values) {
            addCriterion("mall_serial in", values, "mallSerial");
            return (Criteria) this;
        }

        public Criteria andMallSerialNotIn(List<Integer> values) {
            addCriterion("mall_serial not in", values, "mallSerial");
            return (Criteria) this;
        }

        public Criteria andMallSerialBetween(Integer value1, Integer value2) {
            addCriterion("mall_serial between", value1, value2, "mallSerial");
            return (Criteria) this;
        }

        public Criteria andMallSerialNotBetween(Integer value1, Integer value2) {
            addCriterion("mall_serial not between", value1, value2, "mallSerial");
            return (Criteria) this;
        }

        public Criteria andAdminAccountIdIsNull() {
            addCriterion("admin_account_id is null");
            return (Criteria) this;
        }

        public Criteria andAdminAccountIdIsNotNull() {
            addCriterion("admin_account_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdminAccountIdEqualTo(Integer value) {
            addCriterion("admin_account_id =", value, "adminAccountId");
            return (Criteria) this;
        }

        public Criteria andAdminAccountIdNotEqualTo(Integer value) {
            addCriterion("admin_account_id <>", value, "adminAccountId");
            return (Criteria) this;
        }

        public Criteria andAdminAccountIdGreaterThan(Integer value) {
            addCriterion("admin_account_id >", value, "adminAccountId");
            return (Criteria) this;
        }

        public Criteria andAdminAccountIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("admin_account_id >=", value, "adminAccountId");
            return (Criteria) this;
        }

        public Criteria andAdminAccountIdLessThan(Integer value) {
            addCriterion("admin_account_id <", value, "adminAccountId");
            return (Criteria) this;
        }

        public Criteria andAdminAccountIdLessThanOrEqualTo(Integer value) {
            addCriterion("admin_account_id <=", value, "adminAccountId");
            return (Criteria) this;
        }

        public Criteria andAdminAccountIdIn(List<Integer> values) {
            addCriterion("admin_account_id in", values, "adminAccountId");
            return (Criteria) this;
        }

        public Criteria andAdminAccountIdNotIn(List<Integer> values) {
            addCriterion("admin_account_id not in", values, "adminAccountId");
            return (Criteria) this;
        }

        public Criteria andAdminAccountIdBetween(Integer value1, Integer value2) {
            addCriterion("admin_account_id between", value1, value2, "adminAccountId");
            return (Criteria) this;
        }

        public Criteria andAdminAccountIdNotBetween(Integer value1, Integer value2) {
            addCriterion("admin_account_id not between", value1, value2, "adminAccountId");
            return (Criteria) this;
        }

        public Criteria andMallNameIsNull() {
            addCriterion("mall_name is null");
            return (Criteria) this;
        }

        public Criteria andMallNameIsNotNull() {
            addCriterion("mall_name is not null");
            return (Criteria) this;
        }

        public Criteria andMallNameEqualTo(String value) {
            addCriterion("mall_name =", value, "mallName");
            return (Criteria) this;
        }

        public Criteria andMallNameNotEqualTo(String value) {
            addCriterion("mall_name <>", value, "mallName");
            return (Criteria) this;
        }

        public Criteria andMallNameGreaterThan(String value) {
            addCriterion("mall_name >", value, "mallName");
            return (Criteria) this;
        }

        public Criteria andMallNameGreaterThanOrEqualTo(String value) {
            addCriterion("mall_name >=", value, "mallName");
            return (Criteria) this;
        }

        public Criteria andMallNameLessThan(String value) {
            addCriterion("mall_name <", value, "mallName");
            return (Criteria) this;
        }

        public Criteria andMallNameLessThanOrEqualTo(String value) {
            addCriterion("mall_name <=", value, "mallName");
            return (Criteria) this;
        }

        public Criteria andMallNameLike(String value) {
            addCriterion("mall_name like", value, "mallName");
            return (Criteria) this;
        }

        public Criteria andMallNameNotLike(String value) {
            addCriterion("mall_name not like", value, "mallName");
            return (Criteria) this;
        }

        public Criteria andMallNameIn(List<String> values) {
            addCriterion("mall_name in", values, "mallName");
            return (Criteria) this;
        }

        public Criteria andMallNameNotIn(List<String> values) {
            addCriterion("mall_name not in", values, "mallName");
            return (Criteria) this;
        }

        public Criteria andMallNameBetween(String value1, String value2) {
            addCriterion("mall_name between", value1, value2, "mallName");
            return (Criteria) this;
        }

        public Criteria andMallNameNotBetween(String value1, String value2) {
            addCriterion("mall_name not between", value1, value2, "mallName");
            return (Criteria) this;
        }

        public Criteria andServiceTelIsNull() {
            addCriterion("service_tel is null");
            return (Criteria) this;
        }

        public Criteria andServiceTelIsNotNull() {
            addCriterion("service_tel is not null");
            return (Criteria) this;
        }

        public Criteria andServiceTelEqualTo(String value) {
            addCriterion("service_tel =", value, "serviceTel");
            return (Criteria) this;
        }

        public Criteria andServiceTelNotEqualTo(String value) {
            addCriterion("service_tel <>", value, "serviceTel");
            return (Criteria) this;
        }

        public Criteria andServiceTelGreaterThan(String value) {
            addCriterion("service_tel >", value, "serviceTel");
            return (Criteria) this;
        }

        public Criteria andServiceTelGreaterThanOrEqualTo(String value) {
            addCriterion("service_tel >=", value, "serviceTel");
            return (Criteria) this;
        }

        public Criteria andServiceTelLessThan(String value) {
            addCriterion("service_tel <", value, "serviceTel");
            return (Criteria) this;
        }

        public Criteria andServiceTelLessThanOrEqualTo(String value) {
            addCriterion("service_tel <=", value, "serviceTel");
            return (Criteria) this;
        }

        public Criteria andServiceTelLike(String value) {
            addCriterion("service_tel like", value, "serviceTel");
            return (Criteria) this;
        }

        public Criteria andServiceTelNotLike(String value) {
            addCriterion("service_tel not like", value, "serviceTel");
            return (Criteria) this;
        }

        public Criteria andServiceTelIn(List<String> values) {
            addCriterion("service_tel in", values, "serviceTel");
            return (Criteria) this;
        }

        public Criteria andServiceTelNotIn(List<String> values) {
            addCriterion("service_tel not in", values, "serviceTel");
            return (Criteria) this;
        }

        public Criteria andServiceTelBetween(String value1, String value2) {
            addCriterion("service_tel between", value1, value2, "serviceTel");
            return (Criteria) this;
        }

        public Criteria andServiceTelNotBetween(String value1, String value2) {
            addCriterion("service_tel not between", value1, value2, "serviceTel");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNull() {
            addCriterion("is_delete is null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNotNull() {
            addCriterion("is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteEqualTo(Boolean value) {
            addCriterion("is_delete =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(Boolean value) {
            addCriterion("is_delete <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(Boolean value) {
            addCriterion("is_delete >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_delete >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(Boolean value) {
            addCriterion("is_delete <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(Boolean value) {
            addCriterion("is_delete <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<Boolean> values) {
            addCriterion("is_delete in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<Boolean> values) {
            addCriterion("is_delete not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(Boolean value1, Boolean value2) {
            addCriterion("is_delete between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_delete not between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeIsNull() {
            addCriterion("delete_time is null");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeIsNotNull() {
            addCriterion("delete_time is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeEqualTo(String value) {
            addCriterion("delete_time =", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeNotEqualTo(String value) {
            addCriterion("delete_time <>", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeGreaterThan(String value) {
            addCriterion("delete_time >", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeGreaterThanOrEqualTo(String value) {
            addCriterion("delete_time >=", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeLessThan(String value) {
            addCriterion("delete_time <", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeLessThanOrEqualTo(String value) {
            addCriterion("delete_time <=", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeLike(String value) {
            addCriterion("delete_time like", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeNotLike(String value) {
            addCriterion("delete_time not like", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeIn(List<String> values) {
            addCriterion("delete_time in", values, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeNotIn(List<String> values) {
            addCriterion("delete_time not in", values, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeBetween(String value1, String value2) {
            addCriterion("delete_time between", value1, value2, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeNotBetween(String value1, String value2) {
            addCriterion("delete_time not between", value1, value2, "deleteTime");
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
package pojo;

import java.util.ArrayList;
import java.util.List;

public class CustomerServiceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerServiceExample() {
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

        public Criteria andCustomerServiceSerialIsNull() {
            addCriterion("customer_service_serial is null");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceSerialIsNotNull() {
            addCriterion("customer_service_serial is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceSerialEqualTo(Integer value) {
            addCriterion("customer_service_serial =", value, "customerServiceSerial");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceSerialNotEqualTo(Integer value) {
            addCriterion("customer_service_serial <>", value, "customerServiceSerial");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceSerialGreaterThan(Integer value) {
            addCriterion("customer_service_serial >", value, "customerServiceSerial");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceSerialGreaterThanOrEqualTo(Integer value) {
            addCriterion("customer_service_serial >=", value, "customerServiceSerial");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceSerialLessThan(Integer value) {
            addCriterion("customer_service_serial <", value, "customerServiceSerial");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceSerialLessThanOrEqualTo(Integer value) {
            addCriterion("customer_service_serial <=", value, "customerServiceSerial");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceSerialIn(List<Integer> values) {
            addCriterion("customer_service_serial in", values, "customerServiceSerial");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceSerialNotIn(List<Integer> values) {
            addCriterion("customer_service_serial not in", values, "customerServiceSerial");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceSerialBetween(Integer value1, Integer value2) {
            addCriterion("customer_service_serial between", value1, value2, "customerServiceSerial");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceSerialNotBetween(Integer value1, Integer value2) {
            addCriterion("customer_service_serial not between", value1, value2, "customerServiceSerial");
            return (Criteria) this;
        }

        public Criteria andWorkNoIsNull() {
            addCriterion("work_no is null");
            return (Criteria) this;
        }

        public Criteria andWorkNoIsNotNull() {
            addCriterion("work_no is not null");
            return (Criteria) this;
        }

        public Criteria andWorkNoEqualTo(String value) {
            addCriterion("work_no =", value, "workNo");
            return (Criteria) this;
        }

        public Criteria andWorkNoNotEqualTo(String value) {
            addCriterion("work_no <>", value, "workNo");
            return (Criteria) this;
        }

        public Criteria andWorkNoGreaterThan(String value) {
            addCriterion("work_no >", value, "workNo");
            return (Criteria) this;
        }

        public Criteria andWorkNoGreaterThanOrEqualTo(String value) {
            addCriterion("work_no >=", value, "workNo");
            return (Criteria) this;
        }

        public Criteria andWorkNoLessThan(String value) {
            addCriterion("work_no <", value, "workNo");
            return (Criteria) this;
        }

        public Criteria andWorkNoLessThanOrEqualTo(String value) {
            addCriterion("work_no <=", value, "workNo");
            return (Criteria) this;
        }

        public Criteria andWorkNoLike(String value) {
            addCriterion("work_no like", value, "workNo");
            return (Criteria) this;
        }

        public Criteria andWorkNoNotLike(String value) {
            addCriterion("work_no not like", value, "workNo");
            return (Criteria) this;
        }

        public Criteria andWorkNoIn(List<String> values) {
            addCriterion("work_no in", values, "workNo");
            return (Criteria) this;
        }

        public Criteria andWorkNoNotIn(List<String> values) {
            addCriterion("work_no not in", values, "workNo");
            return (Criteria) this;
        }

        public Criteria andWorkNoBetween(String value1, String value2) {
            addCriterion("work_no between", value1, value2, "workNo");
            return (Criteria) this;
        }

        public Criteria andWorkNoNotBetween(String value1, String value2) {
            addCriterion("work_no not between", value1, value2, "workNo");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceNameIsNull() {
            addCriterion("customer_service_name is null");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceNameIsNotNull() {
            addCriterion("customer_service_name is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceNameEqualTo(String value) {
            addCriterion("customer_service_name =", value, "customerServiceName");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceNameNotEqualTo(String value) {
            addCriterion("customer_service_name <>", value, "customerServiceName");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceNameGreaterThan(String value) {
            addCriterion("customer_service_name >", value, "customerServiceName");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceNameGreaterThanOrEqualTo(String value) {
            addCriterion("customer_service_name >=", value, "customerServiceName");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceNameLessThan(String value) {
            addCriterion("customer_service_name <", value, "customerServiceName");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceNameLessThanOrEqualTo(String value) {
            addCriterion("customer_service_name <=", value, "customerServiceName");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceNameLike(String value) {
            addCriterion("customer_service_name like", value, "customerServiceName");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceNameNotLike(String value) {
            addCriterion("customer_service_name not like", value, "customerServiceName");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceNameIn(List<String> values) {
            addCriterion("customer_service_name in", values, "customerServiceName");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceNameNotIn(List<String> values) {
            addCriterion("customer_service_name not in", values, "customerServiceName");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceNameBetween(String value1, String value2) {
            addCriterion("customer_service_name between", value1, value2, "customerServiceName");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceNameNotBetween(String value1, String value2) {
            addCriterion("customer_service_name not between", value1, value2, "customerServiceName");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceTelIsNull() {
            addCriterion("customer_service_tel is null");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceTelIsNotNull() {
            addCriterion("customer_service_tel is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceTelEqualTo(String value) {
            addCriterion("customer_service_tel =", value, "customerServiceTel");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceTelNotEqualTo(String value) {
            addCriterion("customer_service_tel <>", value, "customerServiceTel");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceTelGreaterThan(String value) {
            addCriterion("customer_service_tel >", value, "customerServiceTel");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceTelGreaterThanOrEqualTo(String value) {
            addCriterion("customer_service_tel >=", value, "customerServiceTel");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceTelLessThan(String value) {
            addCriterion("customer_service_tel <", value, "customerServiceTel");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceTelLessThanOrEqualTo(String value) {
            addCriterion("customer_service_tel <=", value, "customerServiceTel");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceTelLike(String value) {
            addCriterion("customer_service_tel like", value, "customerServiceTel");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceTelNotLike(String value) {
            addCriterion("customer_service_tel not like", value, "customerServiceTel");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceTelIn(List<String> values) {
            addCriterion("customer_service_tel in", values, "customerServiceTel");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceTelNotIn(List<String> values) {
            addCriterion("customer_service_tel not in", values, "customerServiceTel");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceTelBetween(String value1, String value2) {
            addCriterion("customer_service_tel between", value1, value2, "customerServiceTel");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceTelNotBetween(String value1, String value2) {
            addCriterion("customer_service_tel not between", value1, value2, "customerServiceTel");
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
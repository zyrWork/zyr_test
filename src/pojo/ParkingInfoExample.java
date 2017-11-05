package pojo;

import java.util.ArrayList;
import java.util.List;

public class ParkingInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ParkingInfoExample() {
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

        public Criteria andParkingSerialIsNull() {
            addCriterion("parking_serial is null");
            return (Criteria) this;
        }

        public Criteria andParkingSerialIsNotNull() {
            addCriterion("parking_serial is not null");
            return (Criteria) this;
        }

        public Criteria andParkingSerialEqualTo(Integer value) {
            addCriterion("parking_serial =", value, "parkingSerial");
            return (Criteria) this;
        }

        public Criteria andParkingSerialNotEqualTo(Integer value) {
            addCriterion("parking_serial <>", value, "parkingSerial");
            return (Criteria) this;
        }

        public Criteria andParkingSerialGreaterThan(Integer value) {
            addCriterion("parking_serial >", value, "parkingSerial");
            return (Criteria) this;
        }

        public Criteria andParkingSerialGreaterThanOrEqualTo(Integer value) {
            addCriterion("parking_serial >=", value, "parkingSerial");
            return (Criteria) this;
        }

        public Criteria andParkingSerialLessThan(Integer value) {
            addCriterion("parking_serial <", value, "parkingSerial");
            return (Criteria) this;
        }

        public Criteria andParkingSerialLessThanOrEqualTo(Integer value) {
            addCriterion("parking_serial <=", value, "parkingSerial");
            return (Criteria) this;
        }

        public Criteria andParkingSerialIn(List<Integer> values) {
            addCriterion("parking_serial in", values, "parkingSerial");
            return (Criteria) this;
        }

        public Criteria andParkingSerialNotIn(List<Integer> values) {
            addCriterion("parking_serial not in", values, "parkingSerial");
            return (Criteria) this;
        }

        public Criteria andParkingSerialBetween(Integer value1, Integer value2) {
            addCriterion("parking_serial between", value1, value2, "parkingSerial");
            return (Criteria) this;
        }

        public Criteria andParkingSerialNotBetween(Integer value1, Integer value2) {
            addCriterion("parking_serial not between", value1, value2, "parkingSerial");
            return (Criteria) this;
        }

        public Criteria andParkingNoIsNull() {
            addCriterion("parking_no is null");
            return (Criteria) this;
        }

        public Criteria andParkingNoIsNotNull() {
            addCriterion("parking_no is not null");
            return (Criteria) this;
        }

        public Criteria andParkingNoEqualTo(String value) {
            addCriterion("parking_no =", value, "parkingNo");
            return (Criteria) this;
        }

        public Criteria andParkingNoNotEqualTo(String value) {
            addCriterion("parking_no <>", value, "parkingNo");
            return (Criteria) this;
        }

        public Criteria andParkingNoGreaterThan(String value) {
            addCriterion("parking_no >", value, "parkingNo");
            return (Criteria) this;
        }

        public Criteria andParkingNoGreaterThanOrEqualTo(String value) {
            addCriterion("parking_no >=", value, "parkingNo");
            return (Criteria) this;
        }

        public Criteria andParkingNoLessThan(String value) {
            addCriterion("parking_no <", value, "parkingNo");
            return (Criteria) this;
        }

        public Criteria andParkingNoLessThanOrEqualTo(String value) {
            addCriterion("parking_no <=", value, "parkingNo");
            return (Criteria) this;
        }

        public Criteria andParkingNoLike(String value) {
            addCriterion("parking_no like", value, "parkingNo");
            return (Criteria) this;
        }

        public Criteria andParkingNoNotLike(String value) {
            addCriterion("parking_no not like", value, "parkingNo");
            return (Criteria) this;
        }

        public Criteria andParkingNoIn(List<String> values) {
            addCriterion("parking_no in", values, "parkingNo");
            return (Criteria) this;
        }

        public Criteria andParkingNoNotIn(List<String> values) {
            addCriterion("parking_no not in", values, "parkingNo");
            return (Criteria) this;
        }

        public Criteria andParkingNoBetween(String value1, String value2) {
            addCriterion("parking_no between", value1, value2, "parkingNo");
            return (Criteria) this;
        }

        public Criteria andParkingNoNotBetween(String value1, String value2) {
            addCriterion("parking_no not between", value1, value2, "parkingNo");
            return (Criteria) this;
        }

        public Criteria andParkingFloorNoIsNull() {
            addCriterion("parking_floor_no is null");
            return (Criteria) this;
        }

        public Criteria andParkingFloorNoIsNotNull() {
            addCriterion("parking_floor_no is not null");
            return (Criteria) this;
        }

        public Criteria andParkingFloorNoEqualTo(String value) {
            addCriterion("parking_floor_no =", value, "parkingFloorNo");
            return (Criteria) this;
        }

        public Criteria andParkingFloorNoNotEqualTo(String value) {
            addCriterion("parking_floor_no <>", value, "parkingFloorNo");
            return (Criteria) this;
        }

        public Criteria andParkingFloorNoGreaterThan(String value) {
            addCriterion("parking_floor_no >", value, "parkingFloorNo");
            return (Criteria) this;
        }

        public Criteria andParkingFloorNoGreaterThanOrEqualTo(String value) {
            addCriterion("parking_floor_no >=", value, "parkingFloorNo");
            return (Criteria) this;
        }

        public Criteria andParkingFloorNoLessThan(String value) {
            addCriterion("parking_floor_no <", value, "parkingFloorNo");
            return (Criteria) this;
        }

        public Criteria andParkingFloorNoLessThanOrEqualTo(String value) {
            addCriterion("parking_floor_no <=", value, "parkingFloorNo");
            return (Criteria) this;
        }

        public Criteria andParkingFloorNoLike(String value) {
            addCriterion("parking_floor_no like", value, "parkingFloorNo");
            return (Criteria) this;
        }

        public Criteria andParkingFloorNoNotLike(String value) {
            addCriterion("parking_floor_no not like", value, "parkingFloorNo");
            return (Criteria) this;
        }

        public Criteria andParkingFloorNoIn(List<String> values) {
            addCriterion("parking_floor_no in", values, "parkingFloorNo");
            return (Criteria) this;
        }

        public Criteria andParkingFloorNoNotIn(List<String> values) {
            addCriterion("parking_floor_no not in", values, "parkingFloorNo");
            return (Criteria) this;
        }

        public Criteria andParkingFloorNoBetween(String value1, String value2) {
            addCriterion("parking_floor_no between", value1, value2, "parkingFloorNo");
            return (Criteria) this;
        }

        public Criteria andParkingFloorNoNotBetween(String value1, String value2) {
            addCriterion("parking_floor_no not between", value1, value2, "parkingFloorNo");
            return (Criteria) this;
        }

        public Criteria andParkingAreaIsNull() {
            addCriterion("parking_area is null");
            return (Criteria) this;
        }

        public Criteria andParkingAreaIsNotNull() {
            addCriterion("parking_area is not null");
            return (Criteria) this;
        }

        public Criteria andParkingAreaEqualTo(String value) {
            addCriterion("parking_area =", value, "parkingArea");
            return (Criteria) this;
        }

        public Criteria andParkingAreaNotEqualTo(String value) {
            addCriterion("parking_area <>", value, "parkingArea");
            return (Criteria) this;
        }

        public Criteria andParkingAreaGreaterThan(String value) {
            addCriterion("parking_area >", value, "parkingArea");
            return (Criteria) this;
        }

        public Criteria andParkingAreaGreaterThanOrEqualTo(String value) {
            addCriterion("parking_area >=", value, "parkingArea");
            return (Criteria) this;
        }

        public Criteria andParkingAreaLessThan(String value) {
            addCriterion("parking_area <", value, "parkingArea");
            return (Criteria) this;
        }

        public Criteria andParkingAreaLessThanOrEqualTo(String value) {
            addCriterion("parking_area <=", value, "parkingArea");
            return (Criteria) this;
        }

        public Criteria andParkingAreaLike(String value) {
            addCriterion("parking_area like", value, "parkingArea");
            return (Criteria) this;
        }

        public Criteria andParkingAreaNotLike(String value) {
            addCriterion("parking_area not like", value, "parkingArea");
            return (Criteria) this;
        }

        public Criteria andParkingAreaIn(List<String> values) {
            addCriterion("parking_area in", values, "parkingArea");
            return (Criteria) this;
        }

        public Criteria andParkingAreaNotIn(List<String> values) {
            addCriterion("parking_area not in", values, "parkingArea");
            return (Criteria) this;
        }

        public Criteria andParkingAreaBetween(String value1, String value2) {
            addCriterion("parking_area between", value1, value2, "parkingArea");
            return (Criteria) this;
        }

        public Criteria andParkingAreaNotBetween(String value1, String value2) {
            addCriterion("parking_area not between", value1, value2, "parkingArea");
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
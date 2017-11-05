package pojo;

import java.util.ArrayList;
import java.util.List;

public class ParkMapExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ParkMapExample() {
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

        public Criteria andParkMapSerialIsNull() {
            addCriterion("park_map_serial is null");
            return (Criteria) this;
        }

        public Criteria andParkMapSerialIsNotNull() {
            addCriterion("park_map_serial is not null");
            return (Criteria) this;
        }

        public Criteria andParkMapSerialEqualTo(Integer value) {
            addCriterion("park_map_serial =", value, "parkMapSerial");
            return (Criteria) this;
        }

        public Criteria andParkMapSerialNotEqualTo(Integer value) {
            addCriterion("park_map_serial <>", value, "parkMapSerial");
            return (Criteria) this;
        }

        public Criteria andParkMapSerialGreaterThan(Integer value) {
            addCriterion("park_map_serial >", value, "parkMapSerial");
            return (Criteria) this;
        }

        public Criteria andParkMapSerialGreaterThanOrEqualTo(Integer value) {
            addCriterion("park_map_serial >=", value, "parkMapSerial");
            return (Criteria) this;
        }

        public Criteria andParkMapSerialLessThan(Integer value) {
            addCriterion("park_map_serial <", value, "parkMapSerial");
            return (Criteria) this;
        }

        public Criteria andParkMapSerialLessThanOrEqualTo(Integer value) {
            addCriterion("park_map_serial <=", value, "parkMapSerial");
            return (Criteria) this;
        }

        public Criteria andParkMapSerialIn(List<Integer> values) {
            addCriterion("park_map_serial in", values, "parkMapSerial");
            return (Criteria) this;
        }

        public Criteria andParkMapSerialNotIn(List<Integer> values) {
            addCriterion("park_map_serial not in", values, "parkMapSerial");
            return (Criteria) this;
        }

        public Criteria andParkMapSerialBetween(Integer value1, Integer value2) {
            addCriterion("park_map_serial between", value1, value2, "parkMapSerial");
            return (Criteria) this;
        }

        public Criteria andParkMapSerialNotBetween(Integer value1, Integer value2) {
            addCriterion("park_map_serial not between", value1, value2, "parkMapSerial");
            return (Criteria) this;
        }

        public Criteria andMapFloorNoIsNull() {
            addCriterion("map_floor_no is null");
            return (Criteria) this;
        }

        public Criteria andMapFloorNoIsNotNull() {
            addCriterion("map_floor_no is not null");
            return (Criteria) this;
        }

        public Criteria andMapFloorNoEqualTo(String value) {
            addCriterion("map_floor_no =", value, "mapFloorNo");
            return (Criteria) this;
        }

        public Criteria andMapFloorNoNotEqualTo(String value) {
            addCriterion("map_floor_no <>", value, "mapFloorNo");
            return (Criteria) this;
        }

        public Criteria andMapFloorNoGreaterThan(String value) {
            addCriterion("map_floor_no >", value, "mapFloorNo");
            return (Criteria) this;
        }

        public Criteria andMapFloorNoGreaterThanOrEqualTo(String value) {
            addCriterion("map_floor_no >=", value, "mapFloorNo");
            return (Criteria) this;
        }

        public Criteria andMapFloorNoLessThan(String value) {
            addCriterion("map_floor_no <", value, "mapFloorNo");
            return (Criteria) this;
        }

        public Criteria andMapFloorNoLessThanOrEqualTo(String value) {
            addCriterion("map_floor_no <=", value, "mapFloorNo");
            return (Criteria) this;
        }

        public Criteria andMapFloorNoLike(String value) {
            addCriterion("map_floor_no like", value, "mapFloorNo");
            return (Criteria) this;
        }

        public Criteria andMapFloorNoNotLike(String value) {
            addCriterion("map_floor_no not like", value, "mapFloorNo");
            return (Criteria) this;
        }

        public Criteria andMapFloorNoIn(List<String> values) {
            addCriterion("map_floor_no in", values, "mapFloorNo");
            return (Criteria) this;
        }

        public Criteria andMapFloorNoNotIn(List<String> values) {
            addCriterion("map_floor_no not in", values, "mapFloorNo");
            return (Criteria) this;
        }

        public Criteria andMapFloorNoBetween(String value1, String value2) {
            addCriterion("map_floor_no between", value1, value2, "mapFloorNo");
            return (Criteria) this;
        }

        public Criteria andMapFloorNoNotBetween(String value1, String value2) {
            addCriterion("map_floor_no not between", value1, value2, "mapFloorNo");
            return (Criteria) this;
        }

        public Criteria andMapPicIsNull() {
            addCriterion("map_pic is null");
            return (Criteria) this;
        }

        public Criteria andMapPicIsNotNull() {
            addCriterion("map_pic is not null");
            return (Criteria) this;
        }

        public Criteria andMapPicEqualTo(String value) {
            addCriterion("map_pic =", value, "mapPic");
            return (Criteria) this;
        }

        public Criteria andMapPicNotEqualTo(String value) {
            addCriterion("map_pic <>", value, "mapPic");
            return (Criteria) this;
        }

        public Criteria andMapPicGreaterThan(String value) {
            addCriterion("map_pic >", value, "mapPic");
            return (Criteria) this;
        }

        public Criteria andMapPicGreaterThanOrEqualTo(String value) {
            addCriterion("map_pic >=", value, "mapPic");
            return (Criteria) this;
        }

        public Criteria andMapPicLessThan(String value) {
            addCriterion("map_pic <", value, "mapPic");
            return (Criteria) this;
        }

        public Criteria andMapPicLessThanOrEqualTo(String value) {
            addCriterion("map_pic <=", value, "mapPic");
            return (Criteria) this;
        }

        public Criteria andMapPicLike(String value) {
            addCriterion("map_pic like", value, "mapPic");
            return (Criteria) this;
        }

        public Criteria andMapPicNotLike(String value) {
            addCriterion("map_pic not like", value, "mapPic");
            return (Criteria) this;
        }

        public Criteria andMapPicIn(List<String> values) {
            addCriterion("map_pic in", values, "mapPic");
            return (Criteria) this;
        }

        public Criteria andMapPicNotIn(List<String> values) {
            addCriterion("map_pic not in", values, "mapPic");
            return (Criteria) this;
        }

        public Criteria andMapPicBetween(String value1, String value2) {
            addCriterion("map_pic between", value1, value2, "mapPic");
            return (Criteria) this;
        }

        public Criteria andMapPicNotBetween(String value1, String value2) {
            addCriterion("map_pic not between", value1, value2, "mapPic");
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
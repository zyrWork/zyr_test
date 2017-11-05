package pojo;

import java.util.ArrayList;
import java.util.List;

public class ShopTableInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShopTableInfoExample() {
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

        public Criteria andSeatTypeSerialIsNull() {
            addCriterion("seat_type_serial is null");
            return (Criteria) this;
        }

        public Criteria andSeatTypeSerialIsNotNull() {
            addCriterion("seat_type_serial is not null");
            return (Criteria) this;
        }

        public Criteria andSeatTypeSerialEqualTo(Integer value) {
            addCriterion("seat_type_serial =", value, "seatTypeSerial");
            return (Criteria) this;
        }

        public Criteria andSeatTypeSerialNotEqualTo(Integer value) {
            addCriterion("seat_type_serial <>", value, "seatTypeSerial");
            return (Criteria) this;
        }

        public Criteria andSeatTypeSerialGreaterThan(Integer value) {
            addCriterion("seat_type_serial >", value, "seatTypeSerial");
            return (Criteria) this;
        }

        public Criteria andSeatTypeSerialGreaterThanOrEqualTo(Integer value) {
            addCriterion("seat_type_serial >=", value, "seatTypeSerial");
            return (Criteria) this;
        }

        public Criteria andSeatTypeSerialLessThan(Integer value) {
            addCriterion("seat_type_serial <", value, "seatTypeSerial");
            return (Criteria) this;
        }

        public Criteria andSeatTypeSerialLessThanOrEqualTo(Integer value) {
            addCriterion("seat_type_serial <=", value, "seatTypeSerial");
            return (Criteria) this;
        }

        public Criteria andSeatTypeSerialIn(List<Integer> values) {
            addCriterion("seat_type_serial in", values, "seatTypeSerial");
            return (Criteria) this;
        }

        public Criteria andSeatTypeSerialNotIn(List<Integer> values) {
            addCriterion("seat_type_serial not in", values, "seatTypeSerial");
            return (Criteria) this;
        }

        public Criteria andSeatTypeSerialBetween(Integer value1, Integer value2) {
            addCriterion("seat_type_serial between", value1, value2, "seatTypeSerial");
            return (Criteria) this;
        }

        public Criteria andSeatTypeSerialNotBetween(Integer value1, Integer value2) {
            addCriterion("seat_type_serial not between", value1, value2, "seatTypeSerial");
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

        public Criteria andSmallTableNumIsNull() {
            addCriterion("small_table_num is null");
            return (Criteria) this;
        }

        public Criteria andSmallTableNumIsNotNull() {
            addCriterion("small_table_num is not null");
            return (Criteria) this;
        }

        public Criteria andSmallTableNumEqualTo(Integer value) {
            addCriterion("small_table_num =", value, "smallTableNum");
            return (Criteria) this;
        }

        public Criteria andSmallTableNumNotEqualTo(Integer value) {
            addCriterion("small_table_num <>", value, "smallTableNum");
            return (Criteria) this;
        }

        public Criteria andSmallTableNumGreaterThan(Integer value) {
            addCriterion("small_table_num >", value, "smallTableNum");
            return (Criteria) this;
        }

        public Criteria andSmallTableNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("small_table_num >=", value, "smallTableNum");
            return (Criteria) this;
        }

        public Criteria andSmallTableNumLessThan(Integer value) {
            addCriterion("small_table_num <", value, "smallTableNum");
            return (Criteria) this;
        }

        public Criteria andSmallTableNumLessThanOrEqualTo(Integer value) {
            addCriterion("small_table_num <=", value, "smallTableNum");
            return (Criteria) this;
        }

        public Criteria andSmallTableNumIn(List<Integer> values) {
            addCriterion("small_table_num in", values, "smallTableNum");
            return (Criteria) this;
        }

        public Criteria andSmallTableNumNotIn(List<Integer> values) {
            addCriterion("small_table_num not in", values, "smallTableNum");
            return (Criteria) this;
        }

        public Criteria andSmallTableNumBetween(Integer value1, Integer value2) {
            addCriterion("small_table_num between", value1, value2, "smallTableNum");
            return (Criteria) this;
        }

        public Criteria andSmallTableNumNotBetween(Integer value1, Integer value2) {
            addCriterion("small_table_num not between", value1, value2, "smallTableNum");
            return (Criteria) this;
        }

        public Criteria andTableNumIsNull() {
            addCriterion("table_num is null");
            return (Criteria) this;
        }

        public Criteria andTableNumIsNotNull() {
            addCriterion("table_num is not null");
            return (Criteria) this;
        }

        public Criteria andTableNumEqualTo(Integer value) {
            addCriterion("table_num =", value, "tableNum");
            return (Criteria) this;
        }

        public Criteria andTableNumNotEqualTo(Integer value) {
            addCriterion("table_num <>", value, "tableNum");
            return (Criteria) this;
        }

        public Criteria andTableNumGreaterThan(Integer value) {
            addCriterion("table_num >", value, "tableNum");
            return (Criteria) this;
        }

        public Criteria andTableNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("table_num >=", value, "tableNum");
            return (Criteria) this;
        }

        public Criteria andTableNumLessThan(Integer value) {
            addCriterion("table_num <", value, "tableNum");
            return (Criteria) this;
        }

        public Criteria andTableNumLessThanOrEqualTo(Integer value) {
            addCriterion("table_num <=", value, "tableNum");
            return (Criteria) this;
        }

        public Criteria andTableNumIn(List<Integer> values) {
            addCriterion("table_num in", values, "tableNum");
            return (Criteria) this;
        }

        public Criteria andTableNumNotIn(List<Integer> values) {
            addCriterion("table_num not in", values, "tableNum");
            return (Criteria) this;
        }

        public Criteria andTableNumBetween(Integer value1, Integer value2) {
            addCriterion("table_num between", value1, value2, "tableNum");
            return (Criteria) this;
        }

        public Criteria andTableNumNotBetween(Integer value1, Integer value2) {
            addCriterion("table_num not between", value1, value2, "tableNum");
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

        public Criteria andMiddleTableNumIsNull() {
            addCriterion("middle_table_num is null");
            return (Criteria) this;
        }

        public Criteria andMiddleTableNumIsNotNull() {
            addCriterion("middle_table_num is not null");
            return (Criteria) this;
        }

        public Criteria andMiddleTableNumEqualTo(Integer value) {
            addCriterion("middle_table_num =", value, "middleTableNum");
            return (Criteria) this;
        }

        public Criteria andMiddleTableNumNotEqualTo(Integer value) {
            addCriterion("middle_table_num <>", value, "middleTableNum");
            return (Criteria) this;
        }

        public Criteria andMiddleTableNumGreaterThan(Integer value) {
            addCriterion("middle_table_num >", value, "middleTableNum");
            return (Criteria) this;
        }

        public Criteria andMiddleTableNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("middle_table_num >=", value, "middleTableNum");
            return (Criteria) this;
        }

        public Criteria andMiddleTableNumLessThan(Integer value) {
            addCriterion("middle_table_num <", value, "middleTableNum");
            return (Criteria) this;
        }

        public Criteria andMiddleTableNumLessThanOrEqualTo(Integer value) {
            addCriterion("middle_table_num <=", value, "middleTableNum");
            return (Criteria) this;
        }

        public Criteria andMiddleTableNumIn(List<Integer> values) {
            addCriterion("middle_table_num in", values, "middleTableNum");
            return (Criteria) this;
        }

        public Criteria andMiddleTableNumNotIn(List<Integer> values) {
            addCriterion("middle_table_num not in", values, "middleTableNum");
            return (Criteria) this;
        }

        public Criteria andMiddleTableNumBetween(Integer value1, Integer value2) {
            addCriterion("middle_table_num between", value1, value2, "middleTableNum");
            return (Criteria) this;
        }

        public Criteria andMiddleTableNumNotBetween(Integer value1, Integer value2) {
            addCriterion("middle_table_num not between", value1, value2, "middleTableNum");
            return (Criteria) this;
        }

        public Criteria andBigTableNumIsNull() {
            addCriterion("big_table_num is null");
            return (Criteria) this;
        }

        public Criteria andBigTableNumIsNotNull() {
            addCriterion("big_table_num is not null");
            return (Criteria) this;
        }

        public Criteria andBigTableNumEqualTo(Integer value) {
            addCriterion("big_table_num =", value, "bigTableNum");
            return (Criteria) this;
        }

        public Criteria andBigTableNumNotEqualTo(Integer value) {
            addCriterion("big_table_num <>", value, "bigTableNum");
            return (Criteria) this;
        }

        public Criteria andBigTableNumGreaterThan(Integer value) {
            addCriterion("big_table_num >", value, "bigTableNum");
            return (Criteria) this;
        }

        public Criteria andBigTableNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("big_table_num >=", value, "bigTableNum");
            return (Criteria) this;
        }

        public Criteria andBigTableNumLessThan(Integer value) {
            addCriterion("big_table_num <", value, "bigTableNum");
            return (Criteria) this;
        }

        public Criteria andBigTableNumLessThanOrEqualTo(Integer value) {
            addCriterion("big_table_num <=", value, "bigTableNum");
            return (Criteria) this;
        }

        public Criteria andBigTableNumIn(List<Integer> values) {
            addCriterion("big_table_num in", values, "bigTableNum");
            return (Criteria) this;
        }

        public Criteria andBigTableNumNotIn(List<Integer> values) {
            addCriterion("big_table_num not in", values, "bigTableNum");
            return (Criteria) this;
        }

        public Criteria andBigTableNumBetween(Integer value1, Integer value2) {
            addCriterion("big_table_num between", value1, value2, "bigTableNum");
            return (Criteria) this;
        }

        public Criteria andBigTableNumNotBetween(Integer value1, Integer value2) {
            addCriterion("big_table_num not between", value1, value2, "bigTableNum");
            return (Criteria) this;
        }

        public Criteria andSmallThresholdIsNull() {
            addCriterion("small_threshold is null");
            return (Criteria) this;
        }

        public Criteria andSmallThresholdIsNotNull() {
            addCriterion("small_threshold is not null");
            return (Criteria) this;
        }

        public Criteria andSmallThresholdEqualTo(Integer value) {
            addCriterion("small_threshold =", value, "smallThreshold");
            return (Criteria) this;
        }

        public Criteria andSmallThresholdNotEqualTo(Integer value) {
            addCriterion("small_threshold <>", value, "smallThreshold");
            return (Criteria) this;
        }

        public Criteria andSmallThresholdGreaterThan(Integer value) {
            addCriterion("small_threshold >", value, "smallThreshold");
            return (Criteria) this;
        }

        public Criteria andSmallThresholdGreaterThanOrEqualTo(Integer value) {
            addCriterion("small_threshold >=", value, "smallThreshold");
            return (Criteria) this;
        }

        public Criteria andSmallThresholdLessThan(Integer value) {
            addCriterion("small_threshold <", value, "smallThreshold");
            return (Criteria) this;
        }

        public Criteria andSmallThresholdLessThanOrEqualTo(Integer value) {
            addCriterion("small_threshold <=", value, "smallThreshold");
            return (Criteria) this;
        }

        public Criteria andSmallThresholdIn(List<Integer> values) {
            addCriterion("small_threshold in", values, "smallThreshold");
            return (Criteria) this;
        }

        public Criteria andSmallThresholdNotIn(List<Integer> values) {
            addCriterion("small_threshold not in", values, "smallThreshold");
            return (Criteria) this;
        }

        public Criteria andSmallThresholdBetween(Integer value1, Integer value2) {
            addCriterion("small_threshold between", value1, value2, "smallThreshold");
            return (Criteria) this;
        }

        public Criteria andSmallThresholdNotBetween(Integer value1, Integer value2) {
            addCriterion("small_threshold not between", value1, value2, "smallThreshold");
            return (Criteria) this;
        }

        public Criteria andMiddleThresholdIsNull() {
            addCriterion("middle_threshold is null");
            return (Criteria) this;
        }

        public Criteria andMiddleThresholdIsNotNull() {
            addCriterion("middle_threshold is not null");
            return (Criteria) this;
        }

        public Criteria andMiddleThresholdEqualTo(Integer value) {
            addCriterion("middle_threshold =", value, "middleThreshold");
            return (Criteria) this;
        }

        public Criteria andMiddleThresholdNotEqualTo(Integer value) {
            addCriterion("middle_threshold <>", value, "middleThreshold");
            return (Criteria) this;
        }

        public Criteria andMiddleThresholdGreaterThan(Integer value) {
            addCriterion("middle_threshold >", value, "middleThreshold");
            return (Criteria) this;
        }

        public Criteria andMiddleThresholdGreaterThanOrEqualTo(Integer value) {
            addCriterion("middle_threshold >=", value, "middleThreshold");
            return (Criteria) this;
        }

        public Criteria andMiddleThresholdLessThan(Integer value) {
            addCriterion("middle_threshold <", value, "middleThreshold");
            return (Criteria) this;
        }

        public Criteria andMiddleThresholdLessThanOrEqualTo(Integer value) {
            addCriterion("middle_threshold <=", value, "middleThreshold");
            return (Criteria) this;
        }

        public Criteria andMiddleThresholdIn(List<Integer> values) {
            addCriterion("middle_threshold in", values, "middleThreshold");
            return (Criteria) this;
        }

        public Criteria andMiddleThresholdNotIn(List<Integer> values) {
            addCriterion("middle_threshold not in", values, "middleThreshold");
            return (Criteria) this;
        }

        public Criteria andMiddleThresholdBetween(Integer value1, Integer value2) {
            addCriterion("middle_threshold between", value1, value2, "middleThreshold");
            return (Criteria) this;
        }

        public Criteria andMiddleThresholdNotBetween(Integer value1, Integer value2) {
            addCriterion("middle_threshold not between", value1, value2, "middleThreshold");
            return (Criteria) this;
        }

        public Criteria andBigThresholdIsNull() {
            addCriterion("big_threshold is null");
            return (Criteria) this;
        }

        public Criteria andBigThresholdIsNotNull() {
            addCriterion("big_threshold is not null");
            return (Criteria) this;
        }

        public Criteria andBigThresholdEqualTo(Integer value) {
            addCriterion("big_threshold =", value, "bigThreshold");
            return (Criteria) this;
        }

        public Criteria andBigThresholdNotEqualTo(Integer value) {
            addCriterion("big_threshold <>", value, "bigThreshold");
            return (Criteria) this;
        }

        public Criteria andBigThresholdGreaterThan(Integer value) {
            addCriterion("big_threshold >", value, "bigThreshold");
            return (Criteria) this;
        }

        public Criteria andBigThresholdGreaterThanOrEqualTo(Integer value) {
            addCriterion("big_threshold >=", value, "bigThreshold");
            return (Criteria) this;
        }

        public Criteria andBigThresholdLessThan(Integer value) {
            addCriterion("big_threshold <", value, "bigThreshold");
            return (Criteria) this;
        }

        public Criteria andBigThresholdLessThanOrEqualTo(Integer value) {
            addCriterion("big_threshold <=", value, "bigThreshold");
            return (Criteria) this;
        }

        public Criteria andBigThresholdIn(List<Integer> values) {
            addCriterion("big_threshold in", values, "bigThreshold");
            return (Criteria) this;
        }

        public Criteria andBigThresholdNotIn(List<Integer> values) {
            addCriterion("big_threshold not in", values, "bigThreshold");
            return (Criteria) this;
        }

        public Criteria andBigThresholdBetween(Integer value1, Integer value2) {
            addCriterion("big_threshold between", value1, value2, "bigThreshold");
            return (Criteria) this;
        }

        public Criteria andBigThresholdNotBetween(Integer value1, Integer value2) {
            addCriterion("big_threshold not between", value1, value2, "bigThreshold");
            return (Criteria) this;
        }

        public Criteria andQueueIsOpenIsNull() {
            addCriterion("queue_is_open is null");
            return (Criteria) this;
        }

        public Criteria andQueueIsOpenIsNotNull() {
            addCriterion("queue_is_open is not null");
            return (Criteria) this;
        }

        public Criteria andQueueIsOpenEqualTo(Byte value) {
            addCriterion("queue_is_open =", value, "queueIsOpen");
            return (Criteria) this;
        }

        public Criteria andQueueIsOpenNotEqualTo(Byte value) {
            addCriterion("queue_is_open <>", value, "queueIsOpen");
            return (Criteria) this;
        }

        public Criteria andQueueIsOpenGreaterThan(Byte value) {
            addCriterion("queue_is_open >", value, "queueIsOpen");
            return (Criteria) this;
        }

        public Criteria andQueueIsOpenGreaterThanOrEqualTo(Byte value) {
            addCriterion("queue_is_open >=", value, "queueIsOpen");
            return (Criteria) this;
        }

        public Criteria andQueueIsOpenLessThan(Byte value) {
            addCriterion("queue_is_open <", value, "queueIsOpen");
            return (Criteria) this;
        }

        public Criteria andQueueIsOpenLessThanOrEqualTo(Byte value) {
            addCriterion("queue_is_open <=", value, "queueIsOpen");
            return (Criteria) this;
        }

        public Criteria andQueueIsOpenIn(List<Byte> values) {
            addCriterion("queue_is_open in", values, "queueIsOpen");
            return (Criteria) this;
        }

        public Criteria andQueueIsOpenNotIn(List<Byte> values) {
            addCriterion("queue_is_open not in", values, "queueIsOpen");
            return (Criteria) this;
        }

        public Criteria andQueueIsOpenBetween(Byte value1, Byte value2) {
            addCriterion("queue_is_open between", value1, value2, "queueIsOpen");
            return (Criteria) this;
        }

        public Criteria andQueueIsOpenNotBetween(Byte value1, Byte value2) {
            addCriterion("queue_is_open not between", value1, value2, "queueIsOpen");
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
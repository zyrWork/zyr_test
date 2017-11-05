package pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ShopExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShopExample() {
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

        public Criteria andShopSerialIsNull() {
            addCriterion("shop_serial is null");
            return (Criteria) this;
        }

        public Criteria andShopSerialIsNotNull() {
            addCriterion("shop_serial is not null");
            return (Criteria) this;
        }

        public Criteria andShopSerialEqualTo(Integer value) {
            addCriterion("shop_serial =", value, "shopSerial");
            return (Criteria) this;
        }

        public Criteria andShopSerialNotEqualTo(Integer value) {
            addCriterion("shop_serial <>", value, "shopSerial");
            return (Criteria) this;
        }

        public Criteria andShopSerialGreaterThan(Integer value) {
            addCriterion("shop_serial >", value, "shopSerial");
            return (Criteria) this;
        }

        public Criteria andShopSerialGreaterThanOrEqualTo(Integer value) {
            addCriterion("shop_serial >=", value, "shopSerial");
            return (Criteria) this;
        }

        public Criteria andShopSerialLessThan(Integer value) {
            addCriterion("shop_serial <", value, "shopSerial");
            return (Criteria) this;
        }

        public Criteria andShopSerialLessThanOrEqualTo(Integer value) {
            addCriterion("shop_serial <=", value, "shopSerial");
            return (Criteria) this;
        }

        public Criteria andShopSerialIn(List<Integer> values) {
            addCriterion("shop_serial in", values, "shopSerial");
            return (Criteria) this;
        }

        public Criteria andShopSerialNotIn(List<Integer> values) {
            addCriterion("shop_serial not in", values, "shopSerial");
            return (Criteria) this;
        }

        public Criteria andShopSerialBetween(Integer value1, Integer value2) {
            addCriterion("shop_serial between", value1, value2, "shopSerial");
            return (Criteria) this;
        }

        public Criteria andShopSerialNotBetween(Integer value1, Integer value2) {
            addCriterion("shop_serial not between", value1, value2, "shopSerial");
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

        public Criteria andShopNameIsNull() {
            addCriterion("shop_name is null");
            return (Criteria) this;
        }

        public Criteria andShopNameIsNotNull() {
            addCriterion("shop_name is not null");
            return (Criteria) this;
        }

        public Criteria andShopNameEqualTo(String value) {
            addCriterion("shop_name =", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotEqualTo(String value) {
            addCriterion("shop_name <>", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameGreaterThan(String value) {
            addCriterion("shop_name >", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameGreaterThanOrEqualTo(String value) {
            addCriterion("shop_name >=", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLessThan(String value) {
            addCriterion("shop_name <", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLessThanOrEqualTo(String value) {
            addCriterion("shop_name <=", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLike(String value) {
            addCriterion("shop_name like", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotLike(String value) {
            addCriterion("shop_name not like", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameIn(List<String> values) {
            addCriterion("shop_name in", values, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotIn(List<String> values) {
            addCriterion("shop_name not in", values, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameBetween(String value1, String value2) {
            addCriterion("shop_name between", value1, value2, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotBetween(String value1, String value2) {
            addCriterion("shop_name not between", value1, value2, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopLogoIsNull() {
            addCriterion("shop_logo is null");
            return (Criteria) this;
        }

        public Criteria andShopLogoIsNotNull() {
            addCriterion("shop_logo is not null");
            return (Criteria) this;
        }

        public Criteria andShopLogoEqualTo(String value) {
            addCriterion("shop_logo =", value, "shopLogo");
            return (Criteria) this;
        }

        public Criteria andShopLogoNotEqualTo(String value) {
            addCriterion("shop_logo <>", value, "shopLogo");
            return (Criteria) this;
        }

        public Criteria andShopLogoGreaterThan(String value) {
            addCriterion("shop_logo >", value, "shopLogo");
            return (Criteria) this;
        }

        public Criteria andShopLogoGreaterThanOrEqualTo(String value) {
            addCriterion("shop_logo >=", value, "shopLogo");
            return (Criteria) this;
        }

        public Criteria andShopLogoLessThan(String value) {
            addCriterion("shop_logo <", value, "shopLogo");
            return (Criteria) this;
        }

        public Criteria andShopLogoLessThanOrEqualTo(String value) {
            addCriterion("shop_logo <=", value, "shopLogo");
            return (Criteria) this;
        }

        public Criteria andShopLogoLike(String value) {
            addCriterion("shop_logo like", value, "shopLogo");
            return (Criteria) this;
        }

        public Criteria andShopLogoNotLike(String value) {
            addCriterion("shop_logo not like", value, "shopLogo");
            return (Criteria) this;
        }

        public Criteria andShopLogoIn(List<String> values) {
            addCriterion("shop_logo in", values, "shopLogo");
            return (Criteria) this;
        }

        public Criteria andShopLogoNotIn(List<String> values) {
            addCriterion("shop_logo not in", values, "shopLogo");
            return (Criteria) this;
        }

        public Criteria andShopLogoBetween(String value1, String value2) {
            addCriterion("shop_logo between", value1, value2, "shopLogo");
            return (Criteria) this;
        }

        public Criteria andShopLogoNotBetween(String value1, String value2) {
            addCriterion("shop_logo not between", value1, value2, "shopLogo");
            return (Criteria) this;
        }

        public Criteria andShopTypeIsNull() {
            addCriterion("shop_type is null");
            return (Criteria) this;
        }

        public Criteria andShopTypeIsNotNull() {
            addCriterion("shop_type is not null");
            return (Criteria) this;
        }

        public Criteria andShopTypeEqualTo(String value) {
            addCriterion("shop_type =", value, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeNotEqualTo(String value) {
            addCriterion("shop_type <>", value, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeGreaterThan(String value) {
            addCriterion("shop_type >", value, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeGreaterThanOrEqualTo(String value) {
            addCriterion("shop_type >=", value, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeLessThan(String value) {
            addCriterion("shop_type <", value, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeLessThanOrEqualTo(String value) {
            addCriterion("shop_type <=", value, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeLike(String value) {
            addCriterion("shop_type like", value, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeNotLike(String value) {
            addCriterion("shop_type not like", value, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeIn(List<String> values) {
            addCriterion("shop_type in", values, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeNotIn(List<String> values) {
            addCriterion("shop_type not in", values, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeBetween(String value1, String value2) {
            addCriterion("shop_type between", value1, value2, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeNotBetween(String value1, String value2) {
            addCriterion("shop_type not between", value1, value2, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopFeatureIsNull() {
            addCriterion("shop_feature is null");
            return (Criteria) this;
        }

        public Criteria andShopFeatureIsNotNull() {
            addCriterion("shop_feature is not null");
            return (Criteria) this;
        }

        public Criteria andShopFeatureEqualTo(String value) {
            addCriterion("shop_feature =", value, "shopFeature");
            return (Criteria) this;
        }

        public Criteria andShopFeatureNotEqualTo(String value) {
            addCriterion("shop_feature <>", value, "shopFeature");
            return (Criteria) this;
        }

        public Criteria andShopFeatureGreaterThan(String value) {
            addCriterion("shop_feature >", value, "shopFeature");
            return (Criteria) this;
        }

        public Criteria andShopFeatureGreaterThanOrEqualTo(String value) {
            addCriterion("shop_feature >=", value, "shopFeature");
            return (Criteria) this;
        }

        public Criteria andShopFeatureLessThan(String value) {
            addCriterion("shop_feature <", value, "shopFeature");
            return (Criteria) this;
        }

        public Criteria andShopFeatureLessThanOrEqualTo(String value) {
            addCriterion("shop_feature <=", value, "shopFeature");
            return (Criteria) this;
        }

        public Criteria andShopFeatureLike(String value) {
            addCriterion("shop_feature like", value, "shopFeature");
            return (Criteria) this;
        }

        public Criteria andShopFeatureNotLike(String value) {
            addCriterion("shop_feature not like", value, "shopFeature");
            return (Criteria) this;
        }

        public Criteria andShopFeatureIn(List<String> values) {
            addCriterion("shop_feature in", values, "shopFeature");
            return (Criteria) this;
        }

        public Criteria andShopFeatureNotIn(List<String> values) {
            addCriterion("shop_feature not in", values, "shopFeature");
            return (Criteria) this;
        }

        public Criteria andShopFeatureBetween(String value1, String value2) {
            addCriterion("shop_feature between", value1, value2, "shopFeature");
            return (Criteria) this;
        }

        public Criteria andShopFeatureNotBetween(String value1, String value2) {
            addCriterion("shop_feature not between", value1, value2, "shopFeature");
            return (Criteria) this;
        }

        public Criteria andShopTelIsNull() {
            addCriterion("shop_tel is null");
            return (Criteria) this;
        }

        public Criteria andShopTelIsNotNull() {
            addCriterion("shop_tel is not null");
            return (Criteria) this;
        }

        public Criteria andShopTelEqualTo(String value) {
            addCriterion("shop_tel =", value, "shopTel");
            return (Criteria) this;
        }

        public Criteria andShopTelNotEqualTo(String value) {
            addCriterion("shop_tel <>", value, "shopTel");
            return (Criteria) this;
        }

        public Criteria andShopTelGreaterThan(String value) {
            addCriterion("shop_tel >", value, "shopTel");
            return (Criteria) this;
        }

        public Criteria andShopTelGreaterThanOrEqualTo(String value) {
            addCriterion("shop_tel >=", value, "shopTel");
            return (Criteria) this;
        }

        public Criteria andShopTelLessThan(String value) {
            addCriterion("shop_tel <", value, "shopTel");
            return (Criteria) this;
        }

        public Criteria andShopTelLessThanOrEqualTo(String value) {
            addCriterion("shop_tel <=", value, "shopTel");
            return (Criteria) this;
        }

        public Criteria andShopTelLike(String value) {
            addCriterion("shop_tel like", value, "shopTel");
            return (Criteria) this;
        }

        public Criteria andShopTelNotLike(String value) {
            addCriterion("shop_tel not like", value, "shopTel");
            return (Criteria) this;
        }

        public Criteria andShopTelIn(List<String> values) {
            addCriterion("shop_tel in", values, "shopTel");
            return (Criteria) this;
        }

        public Criteria andShopTelNotIn(List<String> values) {
            addCriterion("shop_tel not in", values, "shopTel");
            return (Criteria) this;
        }

        public Criteria andShopTelBetween(String value1, String value2) {
            addCriterion("shop_tel between", value1, value2, "shopTel");
            return (Criteria) this;
        }

        public Criteria andShopTelNotBetween(String value1, String value2) {
            addCriterion("shop_tel not between", value1, value2, "shopTel");
            return (Criteria) this;
        }

        public Criteria andShopFloorNoIsNull() {
            addCriterion("shop_floor_no is null");
            return (Criteria) this;
        }

        public Criteria andShopFloorNoIsNotNull() {
            addCriterion("shop_floor_no is not null");
            return (Criteria) this;
        }

        public Criteria andShopFloorNoEqualTo(String value) {
            addCriterion("shop_floor_no =", value, "shopFloorNo");
            return (Criteria) this;
        }

        public Criteria andShopFloorNoNotEqualTo(String value) {
            addCriterion("shop_floor_no <>", value, "shopFloorNo");
            return (Criteria) this;
        }

        public Criteria andShopFloorNoGreaterThan(String value) {
            addCriterion("shop_floor_no >", value, "shopFloorNo");
            return (Criteria) this;
        }

        public Criteria andShopFloorNoGreaterThanOrEqualTo(String value) {
            addCriterion("shop_floor_no >=", value, "shopFloorNo");
            return (Criteria) this;
        }

        public Criteria andShopFloorNoLessThan(String value) {
            addCriterion("shop_floor_no <", value, "shopFloorNo");
            return (Criteria) this;
        }

        public Criteria andShopFloorNoLessThanOrEqualTo(String value) {
            addCriterion("shop_floor_no <=", value, "shopFloorNo");
            return (Criteria) this;
        }

        public Criteria andShopFloorNoLike(String value) {
            addCriterion("shop_floor_no like", value, "shopFloorNo");
            return (Criteria) this;
        }

        public Criteria andShopFloorNoNotLike(String value) {
            addCriterion("shop_floor_no not like", value, "shopFloorNo");
            return (Criteria) this;
        }

        public Criteria andShopFloorNoIn(List<String> values) {
            addCriterion("shop_floor_no in", values, "shopFloorNo");
            return (Criteria) this;
        }

        public Criteria andShopFloorNoNotIn(List<String> values) {
            addCriterion("shop_floor_no not in", values, "shopFloorNo");
            return (Criteria) this;
        }

        public Criteria andShopFloorNoBetween(String value1, String value2) {
            addCriterion("shop_floor_no between", value1, value2, "shopFloorNo");
            return (Criteria) this;
        }

        public Criteria andShopFloorNoNotBetween(String value1, String value2) {
            addCriterion("shop_floor_no not between", value1, value2, "shopFloorNo");
            return (Criteria) this;
        }

        public Criteria andShopRoomNoIsNull() {
            addCriterion("shop_room_no is null");
            return (Criteria) this;
        }

        public Criteria andShopRoomNoIsNotNull() {
            addCriterion("shop_room_no is not null");
            return (Criteria) this;
        }

        public Criteria andShopRoomNoEqualTo(String value) {
            addCriterion("shop_room_no =", value, "shopRoomNo");
            return (Criteria) this;
        }

        public Criteria andShopRoomNoNotEqualTo(String value) {
            addCriterion("shop_room_no <>", value, "shopRoomNo");
            return (Criteria) this;
        }

        public Criteria andShopRoomNoGreaterThan(String value) {
            addCriterion("shop_room_no >", value, "shopRoomNo");
            return (Criteria) this;
        }

        public Criteria andShopRoomNoGreaterThanOrEqualTo(String value) {
            addCriterion("shop_room_no >=", value, "shopRoomNo");
            return (Criteria) this;
        }

        public Criteria andShopRoomNoLessThan(String value) {
            addCriterion("shop_room_no <", value, "shopRoomNo");
            return (Criteria) this;
        }

        public Criteria andShopRoomNoLessThanOrEqualTo(String value) {
            addCriterion("shop_room_no <=", value, "shopRoomNo");
            return (Criteria) this;
        }

        public Criteria andShopRoomNoLike(String value) {
            addCriterion("shop_room_no like", value, "shopRoomNo");
            return (Criteria) this;
        }

        public Criteria andShopRoomNoNotLike(String value) {
            addCriterion("shop_room_no not like", value, "shopRoomNo");
            return (Criteria) this;
        }

        public Criteria andShopRoomNoIn(List<String> values) {
            addCriterion("shop_room_no in", values, "shopRoomNo");
            return (Criteria) this;
        }

        public Criteria andShopRoomNoNotIn(List<String> values) {
            addCriterion("shop_room_no not in", values, "shopRoomNo");
            return (Criteria) this;
        }

        public Criteria andShopRoomNoBetween(String value1, String value2) {
            addCriterion("shop_room_no between", value1, value2, "shopRoomNo");
            return (Criteria) this;
        }

        public Criteria andShopRoomNoNotBetween(String value1, String value2) {
            addCriterion("shop_room_no not between", value1, value2, "shopRoomNo");
            return (Criteria) this;
        }

        public Criteria andBusinessHoursIsNull() {
            addCriterion("business_hours is null");
            return (Criteria) this;
        }

        public Criteria andBusinessHoursIsNotNull() {
            addCriterion("business_hours is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessHoursEqualTo(String value) {
            addCriterion("business_hours =", value, "businessHours");
            return (Criteria) this;
        }

        public Criteria andBusinessHoursNotEqualTo(String value) {
            addCriterion("business_hours <>", value, "businessHours");
            return (Criteria) this;
        }

        public Criteria andBusinessHoursGreaterThan(String value) {
            addCriterion("business_hours >", value, "businessHours");
            return (Criteria) this;
        }

        public Criteria andBusinessHoursGreaterThanOrEqualTo(String value) {
            addCriterion("business_hours >=", value, "businessHours");
            return (Criteria) this;
        }

        public Criteria andBusinessHoursLessThan(String value) {
            addCriterion("business_hours <", value, "businessHours");
            return (Criteria) this;
        }

        public Criteria andBusinessHoursLessThanOrEqualTo(String value) {
            addCriterion("business_hours <=", value, "businessHours");
            return (Criteria) this;
        }

        public Criteria andBusinessHoursLike(String value) {
            addCriterion("business_hours like", value, "businessHours");
            return (Criteria) this;
        }

        public Criteria andBusinessHoursNotLike(String value) {
            addCriterion("business_hours not like", value, "businessHours");
            return (Criteria) this;
        }

        public Criteria andBusinessHoursIn(List<String> values) {
            addCriterion("business_hours in", values, "businessHours");
            return (Criteria) this;
        }

        public Criteria andBusinessHoursNotIn(List<String> values) {
            addCriterion("business_hours not in", values, "businessHours");
            return (Criteria) this;
        }

        public Criteria andBusinessHoursBetween(String value1, String value2) {
            addCriterion("business_hours between", value1, value2, "businessHours");
            return (Criteria) this;
        }

        public Criteria andBusinessHoursNotBetween(String value1, String value2) {
            addCriterion("business_hours not between", value1, value2, "businessHours");
            return (Criteria) this;
        }

        public Criteria andAveragePriceIsNull() {
            addCriterion("average_price is null");
            return (Criteria) this;
        }

        public Criteria andAveragePriceIsNotNull() {
            addCriterion("average_price is not null");
            return (Criteria) this;
        }

        public Criteria andAveragePriceEqualTo(BigDecimal value) {
            addCriterion("average_price =", value, "averagePrice");
            return (Criteria) this;
        }

        public Criteria andAveragePriceNotEqualTo(BigDecimal value) {
            addCriterion("average_price <>", value, "averagePrice");
            return (Criteria) this;
        }

        public Criteria andAveragePriceGreaterThan(BigDecimal value) {
            addCriterion("average_price >", value, "averagePrice");
            return (Criteria) this;
        }

        public Criteria andAveragePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("average_price >=", value, "averagePrice");
            return (Criteria) this;
        }

        public Criteria andAveragePriceLessThan(BigDecimal value) {
            addCriterion("average_price <", value, "averagePrice");
            return (Criteria) this;
        }

        public Criteria andAveragePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("average_price <=", value, "averagePrice");
            return (Criteria) this;
        }

        public Criteria andAveragePriceIn(List<BigDecimal> values) {
            addCriterion("average_price in", values, "averagePrice");
            return (Criteria) this;
        }

        public Criteria andAveragePriceNotIn(List<BigDecimal> values) {
            addCriterion("average_price not in", values, "averagePrice");
            return (Criteria) this;
        }

        public Criteria andAveragePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("average_price between", value1, value2, "averagePrice");
            return (Criteria) this;
        }

        public Criteria andAveragePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("average_price not between", value1, value2, "averagePrice");
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
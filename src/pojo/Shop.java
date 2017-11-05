package pojo;

import java.math.BigDecimal;

public class Shop {
    private Integer shopSerial;

    private Integer shopAccountId;

    private String shopName;

    private String shopLogo;

    private String shopType;

    private String shopFeature;

    private String shopTel;

    private String shopFloorNo;

    private String shopRoomNo;

    private String businessHours;

    private BigDecimal averagePrice;

    private Boolean isDelete;

    private String deleteTime;

    private String createTime;

    private String lastModified;

    public Integer getShopSerial() {
        return shopSerial;
    }

    public void setShopSerial(Integer shopSerial) {
        this.shopSerial = shopSerial;
    }

    public Integer getShopAccountId() {
        return shopAccountId;
    }

    public void setShopAccountId(Integer shopAccountId) {
        this.shopAccountId = shopAccountId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName == null ? null : shopName.trim();
    }

    public String getShopLogo() {
        return shopLogo;
    }

    public void setShopLogo(String shopLogo) {
        this.shopLogo = shopLogo == null ? null : shopLogo.trim();
    }

    public String getShopType() {
        return shopType;
    }

    public void setShopType(String shopType) {
        this.shopType = shopType == null ? null : shopType.trim();
    }

    public String getShopFeature() {
        return shopFeature;
    }

    public void setShopFeature(String shopFeature) {
        this.shopFeature = shopFeature == null ? null : shopFeature.trim();
    }

    public String getShopTel() {
        return shopTel;
    }

    public void setShopTel(String shopTel) {
        this.shopTel = shopTel == null ? null : shopTel.trim();
    }

    public String getShopFloorNo() {
        return shopFloorNo;
    }

    public void setShopFloorNo(String shopFloorNo) {
        this.shopFloorNo = shopFloorNo == null ? null : shopFloorNo.trim();
    }

    public String getShopRoomNo() {
        return shopRoomNo;
    }

    public void setShopRoomNo(String shopRoomNo) {
        this.shopRoomNo = shopRoomNo == null ? null : shopRoomNo.trim();
    }

    public String getBusinessHours() {
        return businessHours;
    }

    public void setBusinessHours(String businessHours) {
        this.businessHours = businessHours == null ? null : businessHours.trim();
    }

    public BigDecimal getAveragePrice() {
        return averagePrice;
    }

    public void setAveragePrice(BigDecimal averagePrice) {
        this.averagePrice = averagePrice;
    }

    public Boolean getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }

    public String getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(String deleteTime) {
        this.deleteTime = deleteTime == null ? null : deleteTime.trim();
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public String getLastModified() {
        return lastModified;
    }

    public void setLastModified(String lastModified) {
        this.lastModified = lastModified == null ? null : lastModified.trim();
    }
}
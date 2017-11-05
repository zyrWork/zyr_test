package pojo;

import java.math.BigDecimal;

public class Takeout {
    private Integer takeoutSerial;

    private Integer takeoutId;

    private Integer shopAccountId;

    private Short customersNumber;

    private Short takeoutStatus;

    private String customerTel;

    private String remarks;

    private BigDecimal payPrice;

    private String deliveryName;

    private String deliveryTel;

    private String createTime;

    private String lastModified;

    private String takeoutAddress;

    public Integer getTakeoutSerial() {
        return takeoutSerial;
    }

    public void setTakeoutSerial(Integer takeoutSerial) {
        this.takeoutSerial = takeoutSerial;
    }

    public Integer getTakeoutId() {
        return takeoutId;
    }

    public void setTakeoutId(Integer takeoutId) {
        this.takeoutId = takeoutId;
    }

    public Integer getShopAccountId() {
        return shopAccountId;
    }

    public void setShopAccountId(Integer shopAccountId) {
        this.shopAccountId = shopAccountId;
    }

    public Short getCustomersNumber() {
        return customersNumber;
    }

    public void setCustomersNumber(Short customersNumber) {
        this.customersNumber = customersNumber;
    }

    public Short getTakeoutStatus() {
        return takeoutStatus;
    }

    public void setTakeoutStatus(Short takeoutStatus) {
        this.takeoutStatus = takeoutStatus;
    }

    public String getCustomerTel() {
        return customerTel;
    }

    public void setCustomerTel(String customerTel) {
        this.customerTel = customerTel == null ? null : customerTel.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public BigDecimal getPayPrice() {
        return payPrice;
    }

    public void setPayPrice(BigDecimal payPrice) {
        this.payPrice = payPrice;
    }

    public String getDeliveryName() {
        return deliveryName;
    }

    public void setDeliveryName(String deliveryName) {
        this.deliveryName = deliveryName == null ? null : deliveryName.trim();
    }

    public String getDeliveryTel() {
        return deliveryTel;
    }

    public void setDeliveryTel(String deliveryTel) {
        this.deliveryTel = deliveryTel == null ? null : deliveryTel.trim();
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

    public String getTakeoutAddress() {
        return takeoutAddress;
    }

    public void setTakeoutAddress(String takeoutAddress) {
        this.takeoutAddress = takeoutAddress == null ? null : takeoutAddress.trim();
    }
}
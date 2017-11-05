package pojo;

import java.math.BigDecimal;

public class Orders {
    private Integer orderSerial;

    private String orderId;

    private Integer shopAccountId;

    private Integer memberAccountId;

    private Short customersNumber;

    private Short orderStatus;

    private Short orderType;

    private String watingStartTime;

    private String waitingEndTime;

    private String eattingEndTime;

    private Short deskNumber;

    private BigDecimal dishOriginTotalPrice;

    private BigDecimal dishDiscountTotalPrice;

    private Float shopDiscount;

    private BigDecimal payTotalPrice;

    private Short payType;

    private String transactionId;

    private Short payStatus;

    private String payTime;

    private String invoiceTitle;

    private String invoiceNo;

    private Short invoiceType;

    private String invoiceCode;

    private String createTime;

    private String lastModified;

    public Integer getOrderSerial() {
        return orderSerial;
    }

    public void setOrderSerial(Integer orderSerial) {
        this.orderSerial = orderSerial;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public Integer getShopAccountId() {
        return shopAccountId;
    }

    public void setShopAccountId(Integer shopAccountId) {
        this.shopAccountId = shopAccountId;
    }

    public Integer getMemberAccountId() {
        return memberAccountId;
    }

    public void setMemberAccountId(Integer memberAccountId) {
        this.memberAccountId = memberAccountId;
    }

    public Short getCustomersNumber() {
        return customersNumber;
    }

    public void setCustomersNumber(Short customersNumber) {
        this.customersNumber = customersNumber;
    }

    public Short getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Short orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Short getOrderType() {
        return orderType;
    }

    public void setOrderType(Short orderType) {
        this.orderType = orderType;
    }

    public String getWatingStartTime() {
        return watingStartTime;
    }

    public void setWatingStartTime(String watingStartTime) {
        this.watingStartTime = watingStartTime == null ? null : watingStartTime.trim();
    }

    public String getWaitingEndTime() {
        return waitingEndTime;
    }

    public void setWaitingEndTime(String waitingEndTime) {
        this.waitingEndTime = waitingEndTime == null ? null : waitingEndTime.trim();
    }

    public String getEattingEndTime() {
        return eattingEndTime;
    }

    public void setEattingEndTime(String eattingEndTime) {
        this.eattingEndTime = eattingEndTime == null ? null : eattingEndTime.trim();
    }

    public Short getDeskNumber() {
        return deskNumber;
    }

    public void setDeskNumber(Short deskNumber) {
        this.deskNumber = deskNumber;
    }

    public BigDecimal getDishOriginTotalPrice() {
        return dishOriginTotalPrice;
    }

    public void setDishOriginTotalPrice(BigDecimal dishOriginTotalPrice) {
        this.dishOriginTotalPrice = dishOriginTotalPrice;
    }

    public BigDecimal getDishDiscountTotalPrice() {
        return dishDiscountTotalPrice;
    }

    public void setDishDiscountTotalPrice(BigDecimal dishDiscountTotalPrice) {
        this.dishDiscountTotalPrice = dishDiscountTotalPrice;
    }

    public Float getShopDiscount() {
        return shopDiscount;
    }

    public void setShopDiscount(Float shopDiscount) {
        this.shopDiscount = shopDiscount;
    }

    public BigDecimal getPayTotalPrice() {
        return payTotalPrice;
    }

    public void setPayTotalPrice(BigDecimal payTotalPrice) {
        this.payTotalPrice = payTotalPrice;
    }

    public Short getPayType() {
        return payType;
    }

    public void setPayType(Short payType) {
        this.payType = payType;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId == null ? null : transactionId.trim();
    }

    public Short getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Short payStatus) {
        this.payStatus = payStatus;
    }

    public String getPayTime() {
        return payTime;
    }

    public void setPayTime(String payTime) {
        this.payTime = payTime == null ? null : payTime.trim();
    }

    public String getInvoiceTitle() {
        return invoiceTitle;
    }

    public void setInvoiceTitle(String invoiceTitle) {
        this.invoiceTitle = invoiceTitle == null ? null : invoiceTitle.trim();
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo == null ? null : invoiceNo.trim();
    }

    public Short getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(Short invoiceType) {
        this.invoiceType = invoiceType;
    }

    public String getInvoiceCode() {
        return invoiceCode;
    }

    public void setInvoiceCode(String invoiceCode) {
        this.invoiceCode = invoiceCode == null ? null : invoiceCode.trim();
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
package pojo;

import java.math.BigDecimal;

public class OrderDetail {
    private Integer orderDetailSerial;

    private String orderId;

    private Integer dishId;

    private Integer dishNum;

    private String dishName;

    private String dishPic;

    private BigDecimal dishPrice;

    private BigDecimal dishPayPrice;

    private Boolean isDelete;

    private String createTime;

    private String lastModified;

    public Integer getOrderDetailSerial() {
        return orderDetailSerial;
    }

    public void setOrderDetailSerial(Integer orderDetailSerial) {
        this.orderDetailSerial = orderDetailSerial;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public Integer getDishId() {
        return dishId;
    }

    public void setDishId(Integer dishId) {
        this.dishId = dishId;
    }

    public Integer getDishNum() {
        return dishNum;
    }

    public void setDishNum(Integer dishNum) {
        this.dishNum = dishNum;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName == null ? null : dishName.trim();
    }

    public String getDishPic() {
        return dishPic;
    }

    public void setDishPic(String dishPic) {
        this.dishPic = dishPic == null ? null : dishPic.trim();
    }

    public BigDecimal getDishPrice() {
        return dishPrice;
    }

    public void setDishPrice(BigDecimal dishPrice) {
        this.dishPrice = dishPrice;
    }

    public BigDecimal getDishPayPrice() {
        return dishPayPrice;
    }

    public void setDishPayPrice(BigDecimal dishPayPrice) {
        this.dishPayPrice = dishPayPrice;
    }

    public Boolean getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
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
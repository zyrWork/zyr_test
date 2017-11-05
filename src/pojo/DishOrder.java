package pojo;

public class DishOrder {
    private Integer dishTableSerial;

    private String orderId;

    private String orderDishTime;

    private Short dishTableType;

    private Short isSend;

    public Integer getDishTableSerial() {
        return dishTableSerial;
    }

    public void setDishTableSerial(Integer dishTableSerial) {
        this.dishTableSerial = dishTableSerial;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getOrderDishTime() {
        return orderDishTime;
    }

    public void setOrderDishTime(String orderDishTime) {
        this.orderDishTime = orderDishTime == null ? null : orderDishTime.trim();
    }

    public Short getDishTableType() {
        return dishTableType;
    }

    public void setDishTableType(Short dishTableType) {
        this.dishTableType = dishTableType;
    }

    public Short getIsSend() {
        return isSend;
    }

    public void setIsSend(Short isSend) {
        this.isSend = isSend;
    }
}
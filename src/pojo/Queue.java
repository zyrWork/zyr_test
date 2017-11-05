package pojo;

public class Queue {
    private Integer queueSerial;

    private Integer memberAccountId;

    private Integer shopAccountId;

    private Integer queueNo;

    private Integer seatTypeId;

    private String startTime;

    private String endTime;

    private Integer orderId;

    public Integer getQueueSerial() {
        return queueSerial;
    }

    public void setQueueSerial(Integer queueSerial) {
        this.queueSerial = queueSerial;
    }

    public Integer getMemberAccountId() {
        return memberAccountId;
    }

    public void setMemberAccountId(Integer memberAccountId) {
        this.memberAccountId = memberAccountId;
    }

    public Integer getShopAccountId() {
        return shopAccountId;
    }

    public void setShopAccountId(Integer shopAccountId) {
        this.shopAccountId = shopAccountId;
    }

    public Integer getQueueNo() {
        return queueNo;
    }

    public void setQueueNo(Integer queueNo) {
        this.queueNo = queueNo;
    }

    public Integer getSeatTypeId() {
        return seatTypeId;
    }

    public void setSeatTypeId(Integer seatTypeId) {
        this.seatTypeId = seatTypeId;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime == null ? null : startTime.trim();
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime == null ? null : endTime.trim();
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }
}
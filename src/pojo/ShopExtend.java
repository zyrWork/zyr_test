package pojo;

public class ShopExtend {
    private Integer extendSerial;

    private Integer shopAccountId;

    private Short waitingServiceStatus;

    private Integer currentWatingNumber;

    private Integer remindNumber;

    private String createTime;

    private String lastModified;

    public Integer getExtendSerial() {
        return extendSerial;
    }

    public void setExtendSerial(Integer extendSerial) {
        this.extendSerial = extendSerial;
    }

    public Integer getShopAccountId() {
        return shopAccountId;
    }

    public void setShopAccountId(Integer shopAccountId) {
        this.shopAccountId = shopAccountId;
    }

    public Short getWaitingServiceStatus() {
        return waitingServiceStatus;
    }

    public void setWaitingServiceStatus(Short waitingServiceStatus) {
        this.waitingServiceStatus = waitingServiceStatus;
    }

    public Integer getCurrentWatingNumber() {
        return currentWatingNumber;
    }

    public void setCurrentWatingNumber(Integer currentWatingNumber) {
        this.currentWatingNumber = currentWatingNumber;
    }

    public Integer getRemindNumber() {
        return remindNumber;
    }

    public void setRemindNumber(Integer remindNumber) {
        this.remindNumber = remindNumber;
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
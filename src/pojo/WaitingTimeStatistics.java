package pojo;

public class WaitingTimeStatistics {
    private Integer waitingTimeStatisticsSerial;

    private Integer shopAccountId;

    private Integer watingCount;

    private Integer watingTimeAmount;

    private Integer averageWaitingTime;

    private String createTime;

    private String lastModified;

    public Integer getWaitingTimeStatisticsSerial() {
        return waitingTimeStatisticsSerial;
    }

    public void setWaitingTimeStatisticsSerial(Integer waitingTimeStatisticsSerial) {
        this.waitingTimeStatisticsSerial = waitingTimeStatisticsSerial;
    }

    public Integer getShopAccountId() {
        return shopAccountId;
    }

    public void setShopAccountId(Integer shopAccountId) {
        this.shopAccountId = shopAccountId;
    }

    public Integer getWatingCount() {
        return watingCount;
    }

    public void setWatingCount(Integer watingCount) {
        this.watingCount = watingCount;
    }

    public Integer getWatingTimeAmount() {
        return watingTimeAmount;
    }

    public void setWatingTimeAmount(Integer watingTimeAmount) {
        this.watingTimeAmount = watingTimeAmount;
    }

    public Integer getAverageWaitingTime() {
        return averageWaitingTime;
    }

    public void setAverageWaitingTime(Integer averageWaitingTime) {
        this.averageWaitingTime = averageWaitingTime;
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
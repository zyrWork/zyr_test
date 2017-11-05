package pojo;

public class ShopTableInfo {
    private Integer seatTypeSerial;

    private Integer shopAccountId;

    private Integer smallTableNum;

    private Integer tableNum;

    private String createTime;

    private String lastModified;

    private Integer middleTableNum;

    private Integer bigTableNum;

    private Integer smallThreshold;

    private Integer middleThreshold;

    private Integer bigThreshold;

    private Byte queueIsOpen;

    public Integer getSeatTypeSerial() {
        return seatTypeSerial;
    }

    public void setSeatTypeSerial(Integer seatTypeSerial) {
        this.seatTypeSerial = seatTypeSerial;
    }

    public Integer getShopAccountId() {
        return shopAccountId;
    }

    public void setShopAccountId(Integer shopAccountId) {
        this.shopAccountId = shopAccountId;
    }

    public Integer getSmallTableNum() {
        return smallTableNum;
    }

    public void setSmallTableNum(Integer smallTableNum) {
        this.smallTableNum = smallTableNum;
    }

    public Integer getTableNum() {
        return tableNum;
    }

    public void setTableNum(Integer tableNum) {
        this.tableNum = tableNum;
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

    public Integer getMiddleTableNum() {
        return middleTableNum;
    }

    public void setMiddleTableNum(Integer middleTableNum) {
        this.middleTableNum = middleTableNum;
    }

    public Integer getBigTableNum() {
        return bigTableNum;
    }

    public void setBigTableNum(Integer bigTableNum) {
        this.bigTableNum = bigTableNum;
    }

    public Integer getSmallThreshold() {
        return smallThreshold;
    }

    public void setSmallThreshold(Integer smallThreshold) {
        this.smallThreshold = smallThreshold;
    }

    public Integer getMiddleThreshold() {
        return middleThreshold;
    }

    public void setMiddleThreshold(Integer middleThreshold) {
        this.middleThreshold = middleThreshold;
    }

    public Integer getBigThreshold() {
        return bigThreshold;
    }

    public void setBigThreshold(Integer bigThreshold) {
        this.bigThreshold = bigThreshold;
    }

    public Byte getQueueIsOpen() {
        return queueIsOpen;
    }

    public void setQueueIsOpen(Byte queueIsOpen) {
        this.queueIsOpen = queueIsOpen;
    }
}
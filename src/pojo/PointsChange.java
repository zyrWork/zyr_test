package pojo;

public class PointsChange {
    private Integer pointsChangeSerial;

    private Integer pointsId;

    private Short changeType;

    private Integer changeAmount;

    private Integer pointsBalance;

    private String createTime;

    private String description;

    public Integer getPointsChangeSerial() {
        return pointsChangeSerial;
    }

    public void setPointsChangeSerial(Integer pointsChangeSerial) {
        this.pointsChangeSerial = pointsChangeSerial;
    }

    public Integer getPointsId() {
        return pointsId;
    }

    public void setPointsId(Integer pointsId) {
        this.pointsId = pointsId;
    }

    public Short getChangeType() {
        return changeType;
    }

    public void setChangeType(Short changeType) {
        this.changeType = changeType;
    }

    public Integer getChangeAmount() {
        return changeAmount;
    }

    public void setChangeAmount(Integer changeAmount) {
        this.changeAmount = changeAmount;
    }

    public Integer getPointsBalance() {
        return pointsBalance;
    }

    public void setPointsBalance(Integer pointsBalance) {
        this.pointsBalance = pointsBalance;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}
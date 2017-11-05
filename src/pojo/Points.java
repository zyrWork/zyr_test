package pojo;

public class Points {
    private Integer pointsSerial;

    private Integer shopAccountId;

    private Integer memberAccountId;

    private Integer score;

    private String createTime;

    private String lastModified;

    public Integer getPointsSerial() {
        return pointsSerial;
    }

    public void setPointsSerial(Integer pointsSerial) {
        this.pointsSerial = pointsSerial;
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

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
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
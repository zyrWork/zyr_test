package pojo;

public class PointRule {
    private Integer ruleSerial;

    private Integer shopAccountId;

    private String ruleTrigger;

    private Short ruleType;

    private Integer ruleNumber;

    private String createTime;

    private String lastModified;

    public Integer getRuleSerial() {
        return ruleSerial;
    }

    public void setRuleSerial(Integer ruleSerial) {
        this.ruleSerial = ruleSerial;
    }

    public Integer getShopAccountId() {
        return shopAccountId;
    }

    public void setShopAccountId(Integer shopAccountId) {
        this.shopAccountId = shopAccountId;
    }

    public String getRuleTrigger() {
        return ruleTrigger;
    }

    public void setRuleTrigger(String ruleTrigger) {
        this.ruleTrigger = ruleTrigger == null ? null : ruleTrigger.trim();
    }

    public Short getRuleType() {
        return ruleType;
    }

    public void setRuleType(Short ruleType) {
        this.ruleType = ruleType;
    }

    public Integer getRuleNumber() {
        return ruleNumber;
    }

    public void setRuleNumber(Integer ruleNumber) {
        this.ruleNumber = ruleNumber;
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
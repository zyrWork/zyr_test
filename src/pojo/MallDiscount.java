package pojo;

public class MallDiscount {
    private Integer mallDiscountSerial;

    private String discountName;

    private Float discountPercent;

    private Integer memberTypeId;

    private String createTime;

    private String lastModified;

    public Integer getMallDiscountSerial() {
        return mallDiscountSerial;
    }

    public void setMallDiscountSerial(Integer mallDiscountSerial) {
        this.mallDiscountSerial = mallDiscountSerial;
    }

    public String getDiscountName() {
        return discountName;
    }

    public void setDiscountName(String discountName) {
        this.discountName = discountName == null ? null : discountName.trim();
    }

    public Float getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(Float discountPercent) {
        this.discountPercent = discountPercent;
    }

    public Integer getMemberTypeId() {
        return memberTypeId;
    }

    public void setMemberTypeId(Integer memberTypeId) {
        this.memberTypeId = memberTypeId;
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
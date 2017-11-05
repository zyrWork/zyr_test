package pojo;

public class Member {
    private Integer memberSerial;

    private Integer memberAccountId;

    private String memberNo;

    private String memberQq;

    private String memberMail;

    private Integer memberTypeId;

    private String createTime;

    private String lastModified;

    private String memberAddress;

    public Integer getMemberSerial() {
        return memberSerial;
    }

    public void setMemberSerial(Integer memberSerial) {
        this.memberSerial = memberSerial;
    }

    public Integer getMemberAccountId() {
        return memberAccountId;
    }

    public void setMemberAccountId(Integer memberAccountId) {
        this.memberAccountId = memberAccountId;
    }

    public String getMemberNo() {
        return memberNo;
    }

    public void setMemberNo(String memberNo) {
        this.memberNo = memberNo == null ? null : memberNo.trim();
    }

    public String getMemberQq() {
        return memberQq;
    }

    public void setMemberQq(String memberQq) {
        this.memberQq = memberQq == null ? null : memberQq.trim();
    }

    public String getMemberMail() {
        return memberMail;
    }

    public void setMemberMail(String memberMail) {
        this.memberMail = memberMail == null ? null : memberMail.trim();
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

    public String getMemberAddress() {
        return memberAddress;
    }

    public void setMemberAddress(String memberAddress) {
        this.memberAddress = memberAddress == null ? null : memberAddress.trim();
    }
}
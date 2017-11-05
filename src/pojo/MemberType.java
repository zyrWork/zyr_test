package pojo;

public class MemberType {
    private Integer memberTypeSerial;

    private String typeName;

    private String createTime;

    private String lastModified;

    public Integer getMemberTypeSerial() {
        return memberTypeSerial;
    }

    public void setMemberTypeSerial(Integer memberTypeSerial) {
        this.memberTypeSerial = memberTypeSerial;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
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
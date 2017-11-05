package pojo;

public class Groups {
    private Integer groupSerial;

    private String groupName;

    private String createTime;

    private String lastModified;

    public Integer getGroupSerial() {
        return groupSerial;
    }

    public void setGroupSerial(Integer groupSerial) {
        this.groupSerial = groupSerial;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName == null ? null : groupName.trim();
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
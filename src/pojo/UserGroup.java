package pojo;

public class UserGroup {
    private Integer userGroupSerial;

    private Integer groupsId;

    private Integer accountId;

    private String createTime;

    private String lastModified;

    public Integer getUserGroupSerial() {
        return userGroupSerial;
    }

    public void setUserGroupSerial(Integer userGroupSerial) {
        this.userGroupSerial = userGroupSerial;
    }

    public Integer getGroupsId() {
        return groupsId;
    }

    public void setGroupsId(Integer groupsId) {
        this.groupsId = groupsId;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
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
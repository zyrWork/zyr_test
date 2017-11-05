package pojo;

public class GroupPrivilege {
    private Integer groupPrivSerial;

    private Integer groupsId;

    private String code;

    private String createTime;

    public Integer getGroupPrivSerial() {
        return groupPrivSerial;
    }

    public void setGroupPrivSerial(Integer groupPrivSerial) {
        this.groupPrivSerial = groupPrivSerial;
    }

    public Integer getGroupsId() {
        return groupsId;
    }

    public void setGroupsId(Integer groupsId) {
        this.groupsId = groupsId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }
}
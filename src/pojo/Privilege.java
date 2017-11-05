package pojo;

public class Privilege {
    private Integer privSerial;

    private String code;

    private String createTime;

    private String lastModified;

    private String description;

    public Integer getPrivSerial() {
        return privSerial;
    }

    public void setPrivSerial(Integer privSerial) {
        this.privSerial = privSerial;
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

    public String getLastModified() {
        return lastModified;
    }

    public void setLastModified(String lastModified) {
        this.lastModified = lastModified == null ? null : lastModified.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}
package pojo;

public class MallMap {
    private Integer mallMapSerial;

    private String mapFloorNo;

    private String mapPic;

    private String createTime;

    private String lastModified;

    public Integer getMallMapSerial() {
        return mallMapSerial;
    }

    public void setMallMapSerial(Integer mallMapSerial) {
        this.mallMapSerial = mallMapSerial;
    }

    public String getMapFloorNo() {
        return mapFloorNo;
    }

    public void setMapFloorNo(String mapFloorNo) {
        this.mapFloorNo = mapFloorNo == null ? null : mapFloorNo.trim();
    }

    public String getMapPic() {
        return mapPic;
    }

    public void setMapPic(String mapPic) {
        this.mapPic = mapPic == null ? null : mapPic.trim();
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
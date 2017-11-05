package pojo;

public class ParkMap {
    private Integer parkMapSerial;

    private String mapFloorNo;

    private String mapPic;

    private String createTime;

    private String lastModified;

    public Integer getParkMapSerial() {
        return parkMapSerial;
    }

    public void setParkMapSerial(Integer parkMapSerial) {
        this.parkMapSerial = parkMapSerial;
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
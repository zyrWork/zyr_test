package pojo;

public class ParkingInfo {
    private Integer parkingSerial;

    private String parkingNo;

    private String parkingFloorNo;

    private String parkingArea;

    private String createTime;

    private String lastModified;

    public Integer getParkingSerial() {
        return parkingSerial;
    }

    public void setParkingSerial(Integer parkingSerial) {
        this.parkingSerial = parkingSerial;
    }

    public String getParkingNo() {
        return parkingNo;
    }

    public void setParkingNo(String parkingNo) {
        this.parkingNo = parkingNo == null ? null : parkingNo.trim();
    }

    public String getParkingFloorNo() {
        return parkingFloorNo;
    }

    public void setParkingFloorNo(String parkingFloorNo) {
        this.parkingFloorNo = parkingFloorNo == null ? null : parkingFloorNo.trim();
    }

    public String getParkingArea() {
        return parkingArea;
    }

    public void setParkingArea(String parkingArea) {
        this.parkingArea = parkingArea == null ? null : parkingArea.trim();
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
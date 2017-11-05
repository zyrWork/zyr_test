package pojo;

public class Mall {
    private Integer mallSerial;

    private Integer adminAccountId;

    private String mallName;

    private String serviceTel;

    private Boolean isDelete;

    private String deleteTime;

    private String createTime;

    private String lastModified;

    private String parkingFeeStandard;

    public Integer getMallSerial() {
        return mallSerial;
    }

    public void setMallSerial(Integer mallSerial) {
        this.mallSerial = mallSerial;
    }

    public Integer getAdminAccountId() {
        return adminAccountId;
    }

    public void setAdminAccountId(Integer adminAccountId) {
        this.adminAccountId = adminAccountId;
    }

    public String getMallName() {
        return mallName;
    }

    public void setMallName(String mallName) {
        this.mallName = mallName == null ? null : mallName.trim();
    }

    public String getServiceTel() {
        return serviceTel;
    }

    public void setServiceTel(String serviceTel) {
        this.serviceTel = serviceTel == null ? null : serviceTel.trim();
    }

    public Boolean getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }

    public String getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(String deleteTime) {
        this.deleteTime = deleteTime == null ? null : deleteTime.trim();
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

    public String getParkingFeeStandard() {
        return parkingFeeStandard;
    }

    public void setParkingFeeStandard(String parkingFeeStandard) {
        this.parkingFeeStandard = parkingFeeStandard == null ? null : parkingFeeStandard.trim();
    }
}
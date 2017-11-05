package pojo;

public class Reservation {
    private Integer reservationSerial;

    private Integer shopAccountId;

    private Integer memberAccountId;

    private Short customersNumber;

    private String reservationName;

    private String reservationTel;

    private String arrivalTime;

    private String remarks;

    private String createTime;

    private String lastModified;

    public Integer getReservationSerial() {
        return reservationSerial;
    }

    public void setReservationSerial(Integer reservationSerial) {
        this.reservationSerial = reservationSerial;
    }

    public Integer getShopAccountId() {
        return shopAccountId;
    }

    public void setShopAccountId(Integer shopAccountId) {
        this.shopAccountId = shopAccountId;
    }

    public Integer getMemberAccountId() {
        return memberAccountId;
    }

    public void setMemberAccountId(Integer memberAccountId) {
        this.memberAccountId = memberAccountId;
    }

    public Short getCustomersNumber() {
        return customersNumber;
    }

    public void setCustomersNumber(Short customersNumber) {
        this.customersNumber = customersNumber;
    }

    public String getReservationName() {
        return reservationName;
    }

    public void setReservationName(String reservationName) {
        this.reservationName = reservationName == null ? null : reservationName.trim();
    }

    public String getReservationTel() {
        return reservationTel;
    }

    public void setReservationTel(String reservationTel) {
        this.reservationTel = reservationTel == null ? null : reservationTel.trim();
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime == null ? null : arrivalTime.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
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
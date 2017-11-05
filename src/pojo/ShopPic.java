package pojo;

public class ShopPic {
    private Integer shopPicSerial;

    private Integer shopAccountId;

    private String picPath;

    private String picDescription;

    private String createTime;

    private String lastModified;

    public Integer getShopPicSerial() {
        return shopPicSerial;
    }

    public void setShopPicSerial(Integer shopPicSerial) {
        this.shopPicSerial = shopPicSerial;
    }

    public Integer getShopAccountId() {
        return shopAccountId;
    }

    public void setShopAccountId(Integer shopAccountId) {
        this.shopAccountId = shopAccountId;
    }

    public String getPicPath() {
        return picPath;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath == null ? null : picPath.trim();
    }

    public String getPicDescription() {
        return picDescription;
    }

    public void setPicDescription(String picDescription) {
        this.picDescription = picDescription == null ? null : picDescription.trim();
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
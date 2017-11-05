package pojo;

public class ShopWithBLOBs extends Shop {
    private String shopAddress;

    private String activityInfo;

    public String getShopAddress() {
        return shopAddress;
    }

    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress == null ? null : shopAddress.trim();
    }

    public String getActivityInfo() {
        return activityInfo;
    }

    public void setActivityInfo(String activityInfo) {
        this.activityInfo = activityInfo == null ? null : activityInfo.trim();
    }
}
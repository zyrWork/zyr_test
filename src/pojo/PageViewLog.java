package pojo;

public class PageViewLog {
    private Integer pageSerial;

    private Short pageType;

    private Integer shopJd;

    private Integer dishId;

    private Integer orderId;

    private Integer viewerAccId;

    private String viewTime;

    private Integer nextPageId;

    public Integer getPageSerial() {
        return pageSerial;
    }

    public void setPageSerial(Integer pageSerial) {
        this.pageSerial = pageSerial;
    }

    public Short getPageType() {
        return pageType;
    }

    public void setPageType(Short pageType) {
        this.pageType = pageType;
    }

    public Integer getShopJd() {
        return shopJd;
    }

    public void setShopJd(Integer shopJd) {
        this.shopJd = shopJd;
    }

    public Integer getDishId() {
        return dishId;
    }

    public void setDishId(Integer dishId) {
        this.dishId = dishId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getViewerAccId() {
        return viewerAccId;
    }

    public void setViewerAccId(Integer viewerAccId) {
        this.viewerAccId = viewerAccId;
    }

    public String getViewTime() {
        return viewTime;
    }

    public void setViewTime(String viewTime) {
        this.viewTime = viewTime == null ? null : viewTime.trim();
    }

    public Integer getNextPageId() {
        return nextPageId;
    }

    public void setNextPageId(Integer nextPageId) {
        this.nextPageId = nextPageId;
    }
}
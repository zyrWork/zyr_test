package pojo;

import java.math.BigDecimal;

public class ShopSaleStatistics {
    private Integer shopSaleStatisticsSerial;

    private Integer shopAccountId;

    private Integer shopOrderCount;

    private BigDecimal shopOrderAmount;

    private String createTime;

    private String lastModified;

    public Integer getShopSaleStatisticsSerial() {
        return shopSaleStatisticsSerial;
    }

    public void setShopSaleStatisticsSerial(Integer shopSaleStatisticsSerial) {
        this.shopSaleStatisticsSerial = shopSaleStatisticsSerial;
    }

    public Integer getShopAccountId() {
        return shopAccountId;
    }

    public void setShopAccountId(Integer shopAccountId) {
        this.shopAccountId = shopAccountId;
    }

    public Integer getShopOrderCount() {
        return shopOrderCount;
    }

    public void setShopOrderCount(Integer shopOrderCount) {
        this.shopOrderCount = shopOrderCount;
    }

    public BigDecimal getShopOrderAmount() {
        return shopOrderAmount;
    }

    public void setShopOrderAmount(BigDecimal shopOrderAmount) {
        this.shopOrderAmount = shopOrderAmount;
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
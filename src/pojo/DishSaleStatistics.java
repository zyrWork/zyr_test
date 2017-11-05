package pojo;

import java.math.BigDecimal;

public class DishSaleStatistics {
    private Integer dishSaleStatisticsSerial;

    private Integer dishId;

    private Integer dishSaleCount;

    private BigDecimal dishSaleAmount;

    private String createTime;

    private String lastModified;

    public Integer getDishSaleStatisticsSerial() {
        return dishSaleStatisticsSerial;
    }

    public void setDishSaleStatisticsSerial(Integer dishSaleStatisticsSerial) {
        this.dishSaleStatisticsSerial = dishSaleStatisticsSerial;
    }

    public Integer getDishId() {
        return dishId;
    }

    public void setDishId(Integer dishId) {
        this.dishId = dishId;
    }

    public Integer getDishSaleCount() {
        return dishSaleCount;
    }

    public void setDishSaleCount(Integer dishSaleCount) {
        this.dishSaleCount = dishSaleCount;
    }

    public BigDecimal getDishSaleAmount() {
        return dishSaleAmount;
    }

    public void setDishSaleAmount(BigDecimal dishSaleAmount) {
        this.dishSaleAmount = dishSaleAmount;
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
package pojo;

import java.math.BigDecimal;

public class Dish {
    private Integer dishSerial;

    private Integer dishId;

    private Integer shopAccountId;

    private String dishName;

    private Integer dishTypeId;

    private String dishPic;

    private BigDecimal dishPrice;

    private BigDecimal dishPayPrice;

    private Boolean onShelf;

    private String onSaleTime;

    private String onShelfTime;

    private Boolean isDelete;

    private String deleteTime;

    private String createTime;

    private String lastModified;

    private String dishDescription;

    public Integer getDishSerial() {
        return dishSerial;
    }

    public void setDishSerial(Integer dishSerial) {
        this.dishSerial = dishSerial;
    }

    public Integer getDishId() {
        return dishId;
    }

    public void setDishId(Integer dishId) {
        this.dishId = dishId;
    }

    public Integer getShopAccountId() {
        return shopAccountId;
    }

    public void setShopAccountId(Integer shopAccountId) {
        this.shopAccountId = shopAccountId;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName == null ? null : dishName.trim();
    }

    public Integer getDishTypeId() {
        return dishTypeId;
    }

    public void setDishTypeId(Integer dishTypeId) {
        this.dishTypeId = dishTypeId;
    }

    public String getDishPic() {
        return dishPic;
    }

    public void setDishPic(String dishPic) {
        this.dishPic = dishPic == null ? null : dishPic.trim();
    }

    public BigDecimal getDishPrice() {
        return dishPrice;
    }

    public void setDishPrice(BigDecimal dishPrice) {
        this.dishPrice = dishPrice;
    }

    public BigDecimal getDishPayPrice() {
        return dishPayPrice;
    }

    public void setDishPayPrice(BigDecimal dishPayPrice) {
        this.dishPayPrice = dishPayPrice;
    }

    public Boolean getOnShelf() {
        return onShelf;
    }

    public void setOnShelf(Boolean onShelf) {
        this.onShelf = onShelf;
    }

    public String getOnSaleTime() {
        return onSaleTime;
    }

    public void setOnSaleTime(String onSaleTime) {
        this.onSaleTime = onSaleTime == null ? null : onSaleTime.trim();
    }

    public String getOnShelfTime() {
        return onShelfTime;
    }

    public void setOnShelfTime(String onShelfTime) {
        this.onShelfTime = onShelfTime == null ? null : onShelfTime.trim();
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

    public String getDishDescription() {
        return dishDescription;
    }

    public void setDishDescription(String dishDescription) {
        this.dishDescription = dishDescription == null ? null : dishDescription.trim();
    }
}
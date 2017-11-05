package pojo;

public class DishTableDetail {
    private Integer dishTableDetailSerial;

    private String dishId;

    private Integer dishNum;

    private String dishName;

    public Integer getDishTableDetailSerial() {
        return dishTableDetailSerial;
    }

    public void setDishTableDetailSerial(Integer dishTableDetailSerial) {
        this.dishTableDetailSerial = dishTableDetailSerial;
    }

    public String getDishId() {
        return dishId;
    }

    public void setDishId(String dishId) {
        this.dishId = dishId == null ? null : dishId.trim();
    }

    public Integer getDishNum() {
        return dishNum;
    }

    public void setDishNum(Integer dishNum) {
        this.dishNum = dishNum;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName == null ? null : dishName.trim();
    }
}
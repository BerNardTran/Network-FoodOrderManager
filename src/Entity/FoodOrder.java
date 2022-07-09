package Entity;

import Handler.FoodHandler;

public class FoodOrder {
    private int foodOrderId;
    private int foodId;
    private int orderId;
    private int quantity;

    public FoodOrder() {}
    public FoodOrder(int foodOrderId, int foodId, int orderId, int quantity) {
        this.foodOrderId = foodOrderId;
        this.foodId = foodId;
        this.orderId = orderId;
        this.quantity = quantity;
    }
    public FoodOrder(int foodId, int orderId, int quantity){
        this.foodId = foodId;
        this.orderId = orderId;
        this.quantity = quantity;
    }
    public int getFoodOrderId() {
        return foodOrderId;
    }

    public int getFoodId() {
        return foodId;
    }

    public int getOrderId() {
        return orderId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setFoodOrderId(int foodOrderId) {
        this.foodOrderId = foodOrderId;
    }

    public void setFoodId(int foodId) {
        this.foodId = foodId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

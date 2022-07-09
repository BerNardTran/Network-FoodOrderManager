package Entity;

public class UserOrder {
    private int userOrderId;
    private int userId;
    private int orderId;

    public UserOrder(){}
    public UserOrder(int userOrderId, int userId, int orderId) {
        this.userOrderId = userOrderId;
        this.userId = userId;
        this.orderId = orderId;
    }

    public int getUserOrderId() {
        return userOrderId;
    }

    public int getUserId() {
        return userId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setUserOrderId(int userOrderId) {
        this.userOrderId = userOrderId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
}

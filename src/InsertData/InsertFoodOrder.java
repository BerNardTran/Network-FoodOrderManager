package InsertData;
import Entity.FoodOrder;
import Handler.FoodHandler;
import Handler.FoodOrderHandler;
import java.util.Scanner;

public class InsertFoodOrder {

    public static void InputFoodOrderDataFromKeyBoard () {
        FoodOrder foodOrder = new FoodOrder();
        Scanner input = new Scanner(System.in);
        System.out.print("Food ID - OrderID - Quantity: ");// fix is needed
        foodOrder.setFoodId(input.nextInt());
        foodOrder.setOrderId(input.nextInt());
        foodOrder.setQuantity(input.nextInt());
        input.close();
        FoodOrderHandler.insertOrderFood(foodOrder);
    }
}

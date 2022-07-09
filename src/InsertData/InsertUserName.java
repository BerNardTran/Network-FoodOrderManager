package InsertData;
import Entity.User;
import Handler.UserHandler;
import java.util.Scanner;

public class InsertUserName {
    public static String insertNameOfClient() {
        User user = new User();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Pls provide your name: ");
        user.setUserName(scanner.nextLine());
        scanner.close();
        UserHandler.insertUserName(user);
        return user.getUserName();
    }
}

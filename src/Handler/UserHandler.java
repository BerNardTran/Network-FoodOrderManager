package Handler;
import Entity.User;
import Server.ConnectionDatabase;

import java.sql.*;

public class UserHandler {
    public static void insertUserName(User user){
        Connection connection = null;
        connection = ConnectionDatabase.getConnection();

        try{
            String sqlQuery = "insert into [User] values ('" + user.getUserName() + "')";
//            System.out.println(sqlQuery);
//            preparedStatement = connection.prepareStatement(sqlQuery);
//            resultSet = preparedStatement.executeQuery();
            Statement statement = connection.createStatement();
            statement.executeUpdate(sqlQuery);
            System.out.println("Success add your name");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

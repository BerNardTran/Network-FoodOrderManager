package Handler;

import Server.ConnectionDatabase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FoodHandler {
    public static void getAllFood(){
        Connection connection = null;
        connection = ConnectionDatabase.getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            String sqlQuery = "select * from Food";
            preparedStatement = connection.prepareStatement(sqlQuery);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                System.out.println("ID" + resultSet.getInt(1) + " | Name: " + resultSet.getString(2) + " | " + "cost: " + resultSet.getFloat(3));
            }
//            String sql = "select * from LichSuDangNhap";
//                    pre = conn.prepareStatement(sql);
//                    rs = pre.executeQuery();
//                    tableModel.setRowCount(0);
//                    while (rs.next()) {
//                        Vector arr = new Vector();
//                        arr.add(rs.getString("maNV"));
//                        arr.add(rs.getString("suKien"));
//                        arr.add(rs.getString("thoiGian"));
//                        arr.add(rs.getString("quyenTruyCap"));
//                        tableModel.addRow(arr);
//                    }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

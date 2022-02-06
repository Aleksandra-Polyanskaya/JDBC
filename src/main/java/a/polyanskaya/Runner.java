package a.polyanskaya;

import a.polyanskaya.model.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/mydb";
        String name = "root";
        String password = "2784462Sascha";

        Connection connection = DriverManager.getConnection(url, name, password);
        Statement statement = connection.createStatement();
        String sql = "SELECT * FROM devel";

        ResultSet resultSet = statement.executeQuery(sql);
        List<User> users = new ArrayList<>();

        while (resultSet.next()){
            User user = new User();
            user.setId(resultSet.getLong("id"));
            user.setName(resultSet.getString("name"));
            user.setSpecialty(resultSet.getString("specialty"));
            user.setSalary(resultSet.getInt("salary"));
            users.add(user);
        }

        for (User user : users) {
            System.out.println(user);
        }




    }
}




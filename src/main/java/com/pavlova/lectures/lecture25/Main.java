package com.pavlova.lectures.lecture25;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        try {
            Connection connection = ConnectorFactory.getMySQLConnection();
            Statement statement = connection.createStatement();

            String sql = "SELECT * FROM world.city";
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String countryCode = resultSet.getString("countrycode");
                String district = resultSet.getString("district");
                int population = resultSet.getInt("population");
                System.out.println(id + " " + name + " " + countryCode + " " + district + " " + population);
            }
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}

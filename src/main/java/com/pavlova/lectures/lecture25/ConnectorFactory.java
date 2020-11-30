package com.pavlova.lectures.lecture25;

import java.sql.*;

public class ConnectorFactory {
    private static final String DB_USER_NAME="root";
    private static final String DB_USER_PASS = "root";
    private static final String DB_HOST = "localhost";
    private static  final String DB_DATABASE_NAME = "world";

    Connection connection;

    ResultSet rs;

    static {

        try{
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static Connection getMySQLConnection() throws SQLException{
        String url = "jdbc:mysql://" + DB_HOST + "/" + DB_DATABASE_NAME + "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        return DriverManager.getConnection(url, DB_USER_NAME, DB_USER_PASS);
    }
}

package com.example;

import java.sql.*;

public class Database {

    public static void main(String[] args) throws SQLException {
        System.out.println(isValidPassword("admin", "123456"));
    }

    private static Connection getConnect() throws SQLException {
        return DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/auth", "root", "123456");
    }

    private static boolean isValidPassword(String username, String password) throws SQLException {
        return isPrepared(username).equals(password);
    }

    private static String isPrepared(String username) throws SQLException {
        PreparedStatement preparedStatement = getConnect().prepareStatement("SELECT password FROM auth.user.user WHERE username = ?");
        preparedStatement.setString(1, username);

        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next())
            return resultSet.getString("password");

        return "error";
    }
}

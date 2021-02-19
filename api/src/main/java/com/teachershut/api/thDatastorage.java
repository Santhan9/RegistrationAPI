package com.teachershut.api;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class thDatastorage {
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
        }
    }

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://43.255.154.48:3306/testrubby",
                "test4321", "Passion@411");
    }

    private void closeConnection(Connection connection) {
        if (connection == null)
            return;
        try {
            connection.close();
        } catch (SQLException ex) {
        }
    }

    public void storeUserDetails(String name,String email, String phone) throws ClassNotFoundException {
        String sql = "INSERT INTO selenium (email,name,phone) VALUES ('"+email+"','"+name+"','"+phone+"');";

        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            int resultSet = statement.executeUpdate();
            // System.out.println("Executed"+email);
            System.out.println("Fine");

        }
        catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            closeConnection(connection);
        }
    }



}

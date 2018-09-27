package andi.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static void main(String[] args){

        try {
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/test-java",
                    "root",
                    "elias198");
            Statement statement = connection.createStatement();
            statement.execute("CREATE  TABLE contacts (name TEXT, phone INTEGER , email TEXT)");

        } catch (SQLException e) {
            System.out.println("something went wrong: " + e.getMessage());
        }

    }
}

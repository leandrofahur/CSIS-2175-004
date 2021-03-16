package com.company;

import java.util.Scanner;
import java.sql.*;

public class BillMain {
    public static void main(String[] args) {

        // Solve input:
        Scanner scanner = new Scanner(System.in);

        try {
            // Create database connection:
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection connection = DriverManager.getConnection("jdbc:ucanaccess:///Users/leandro/Desktop/le/douglas_college/CSIS_2175/assignment/03/assignment_db/Item.accdb");
            Statement statement = connection.createStatement();
            ResultSet resultSet = null;



            if(connection != null) {
//                 resultSet.close();
                statement.close();
                connection.close();
            }

        }
        catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
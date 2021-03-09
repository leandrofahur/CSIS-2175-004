package com.company;

import java.sql.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Solve input:
        Scanner scanner = new Scanner(System.in);

        // Create database connection:
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection connection = DriverManager.getConnection("jdbc:ucanaccess:///Users/leandro/Desktop/le/douglas_college/CSIS_2175/challenge/OnlineQuestionare/src/tables/Question.accdb");
            Statement statement = connection.createStatement();

            String ctrl = null;
            do {
                System.out.println("Please choose (c)reate question, (p)review or (e)xit >>");
                ctrl = scanner.next().toLowerCase();
                System.out.println(ctrl);
            } while(ctrl != "e");

            if(connection != null) {
                // resultSet.close();
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

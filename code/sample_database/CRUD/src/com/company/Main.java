package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {
	    try {
            Connection connection = DriverManager.getConnection("jdbc:ucanaccess://Users/leandro/Desktop/le/douglas_college/CSIS_2175/code/sample_database/db/Student.accdb");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM STUDENT");
            while(resultSet.next()) {
                System.out.println(resultSet.getString(2));
            }
	    } catch (Exception ex) {
	        ex.printStackTrace();
        }

    }
}

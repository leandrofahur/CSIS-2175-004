package com.company;

import com.company.DTO.User;

import java.sql.*;

public class Main {

    public static void main(String[] args) {
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection connection = DriverManager.getConnection("jdbc:ucanaccess:///Users/leandro/Documents/intellij-workspace/db/Student.accdb");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM User");

            // READ from database:
            while(resultSet.next()) {
                User user = new User();

                user.setID(resultSet.getInt("ID"));
                user.setFirstName(resultSet.getString("firstName"));
                user.setLastName(resultSet.getString("lastName"));

                System.out.println(user);
            }

            // Insert into database:
            User user = new User();
            user.setID(2);
            user.setFirstName("Mariana");
            user.setLastName("Magalhaes");

            // there is an error on purpose. It adds the first name twice!
            try {
                String query = "INSERT INTO User(ID,firstName,lastName) VALUES(" + user.getID() + ", '" + user.getFirstName() + "', '" + user.getFirstName() + "')";
                statement.executeUpdate(query);
                System.out.println(user);

            } catch (Exception ex) {
                throw new RuntimeException("Error connecting to the database", ex);
            }

            // Update into database:
            try {
                String query = "UPDATE User SET lastName='"+user.getLastName()+"' WHERE firstName='"+user.getFirstName()+"'";
                int rows=statement.executeUpdate(query);

                if(rows>0)
                    System.out.println("Record updated for "+user.getFirstName());
                else
                    System.out.println("Record not found for "+user.getFirstName());
            } catch (Exception ex) {
                throw new RuntimeException("Error connecting to the database", ex);
            }


            if(connection != null) {
                resultSet.close();
                statement.close();
                connection.close();
            }

        } catch (Exception ex) {
            throw new RuntimeException("Error connecting to the database", ex);
        }
    }
}

package P300326045;

import java.util.ArrayList;
import java.util.Scanner;
import java.sql.*;

public class BillMain {
    public static void main(String[] args) {        
       Scanner scanner = new Scanner(System.in);
       // receive user's input:

       // initialize
       String name = "";
       Ontario o = new Ontario();
       o.setItemName(name);


       try {
           // create database connection:
           Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
           Connection connection = DriverManager.getConnection("jdbc:ucanaccess:///Users/leandro/Desktop/le/douglas_college/CSIS_2175/assignment/03/assignment_db/Item.accdb");
           Statement statement = connection.createStatement();
           ResultSet resultSet = null;
           String query = "";

           // this variable will control the loop flux. Inside it, will be used by a switch-case, from the do-while
           // loop perspective, it offers the possibility to end the program:
           int ctrl = 0;

           do {
               System.out.println("Press 1 to insert a new Item,------ 2 to generate Bill for Ontario,----- 3 to generate bill for\n" +
                       "Alberta Store");
               ctrl = scanner.nextInt();

               // the basics variables that our objects will need:
               String itemName = "";
               Double price = 0.00;
               Double totalPrice = 0.00;
               int numberOfItems = 0;

               switch (ctrl) {
                   // in this case we add chocolate, but it is not necessary to:
                   case 1:
                       System.out.println("What is the item name?");
                       itemName = scanner.next();
                       System.out.println("What is the unit price?");
                       price = scanner.nextDouble();
                       query = "INSERT INTO Item(ItemName, UnitPrice$) VALUES('"+ itemName +"', " + price + " )";
                       statement.executeUpdate(query);
                       break;

                   case 2:
                       totalPrice = 0.00;
                       System.out.println("How many items are there in the bill for ontario");
                       numberOfItems = scanner.nextInt();

                       for(int i = 0; i < numberOfItems; i++) {
                           System.out.println("Enter name of Item purchased " + (i+1));
                           itemName = scanner.next();
                           System.out.println("Enter quantity of Item " + (i+1));
                           int n = scanner.nextInt();

                           query = "SELECT * FROM Item WHERE `ItemName`='"+itemName+"'";
                           resultSet = statement.executeQuery(query);
                           if(resultSet.next()){
                               Ontario ontario = new Ontario();
                               ontario.setItemName(resultSet.getString("ItemName"));
                               ontario.setItemId(n);
                               ontario.setUnitPrice(resultSet.getDouble("UnitPrice$"));
                               System.out.println(ontario);
                               totalPrice += ontario.getTotalPrice();
                           }
                       }
                       System.out.println("============================");
                       System.out.println("Total Bill: $"+ totalPrice);
                       break;

                   case 3:
                       totalPrice = 0.00;
                       System.out.println("How many items are there in the bill for Alberta");
                       numberOfItems = scanner.nextInt();

                       for(int i = 0; i < numberOfItems; i++) {
                           System.out.println("Enter name of Item purchased " + (i+1));
                           itemName = scanner.next();
                           System.out.println("Enter quantity of Item " + (i+1));
                           int n = scanner.nextInt();

                           query = "SELECT * FROM Item WHERE `ItemName`='"+itemName+"'";
                           resultSet = statement.executeQuery(query);
                           if(resultSet.next()){
                               Alberta alberta = new Alberta();
                               alberta.setItemName(resultSet.getString("ItemName"));
                               alberta.setItemId(n);
                               alberta.setUnitPrice(resultSet.getDouble("UnitPrice$"));
                               System.out.println(alberta);
                               totalPrice += alberta.getTotalPrice();
                           }
                       }
                       System.out.println("============================");
                       System.out.println("Total Bill: $"+ totalPrice);
                       break;
               }
           } while (ctrl != -1);

           if(connection != null) {
               resultSet.close();
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
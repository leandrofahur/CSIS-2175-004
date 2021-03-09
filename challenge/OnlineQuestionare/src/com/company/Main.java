package com.company;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Solve input:
        Scanner scanner = new Scanner(System.in);
        // Alphabet:
        char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();


        // Create database connection:
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection connection = DriverManager.getConnection("jdbc:ucanaccess:///Users/leandro/Desktop/le/douglas_college/CSIS_2175/challenge/OnlineQuestionare/src/tables/Question.accdb");
            Statement statement = connection.createStatement();

            String ctrl = null;
            String questionType = null;
            String qText = null;
            String answer = null;
            ArrayList<String> options = new ArrayList<String>();
            int numOfOptions;
            double points = 0.0;
            do {
                System.out.print("Please choose (c)reate question, (p)review or (e)xit >> ");
                ctrl = scanner.next().toLowerCase();

                if(ctrl.equals("c")) {
                    System.out.print("Enter the type of question (MC or TF) >> ");
                    questionType = scanner.next();

                    if(questionType.equals("MC")) {
                        System.out.print("Enter the question text >> ");
                        qText = scanner.nextLine();
                        System.out.print("How many options? ");
                        numOfOptions = scanner.nextInt();
                        scanner.nextLine();
                        for(int i = 0; i < numOfOptions; i++) {
                            System.out.print("Enter option " + alphabet[i] + " (Start with * for the correct answer) >> ");
                            options.add(scanner.nextLine());
                        }
                        System.out.print("How many points? ");
                        points = scanner.nextDouble();

                    } else {
                        System.out.print("Enter the question text >> ");
                        qText = scanner.nextLine();
                        System.out.print("Answer is True or False? ");
                        answer = scanner.next();
                        System.out.print("How many points? ");
                        points = scanner.nextDouble();
                    }
                }
            } while(!ctrl.equals("e"));

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

package connect;

import java.sql.*;
import java.util.Scanner;

public class StudentInsert {

	
	
	public static void main(String[] args) {
		Connection con=null;
		Statement stmt=null;
		try {
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			
			String db="D:\\Database1.accdb";
			String myPath="jdbc:ucanaccess://"+db;
			
			
			con=DriverManager.getConnection(myPath);
			stmt=con.createStatement();
			
			System.out.println("Enter information about the new student");
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter student name:");
			String name=sc.nextLine();
			
			System.out.println("Enter student age:");
			int age=sc.nextInt();
			
			System.out.println("Enter student percentage:");
			double percentage=sc.nextDouble();
			
			//INSERT INTO Student(StudentName,Age, Percentage) VALUES('Jim',34,67.8)
			String query="INSERT INTO Student(StudentName,Age, Percentage) VALUES('"+name+"',"+age+","+percentage+")";
			
			stmt.executeUpdate(query);
			
			
		} 
		catch (ClassNotFoundException e) {
			System.out.print("Problem in loading Driver");
			e.printStackTrace();
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			
			try {
				con.close();
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		

	}

}

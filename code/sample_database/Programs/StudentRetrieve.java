package connect;

import java.sql.*;
import java.util.Scanner;

public class StudentRetrieve {

	public static void main(String[] args) {
	Connection con=null;
	Statement stmt=null;
	ResultSet rs=null;
		
	try {
		//Loading Driver
		Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
		//System.out.println("Driver loaded properly");
		
		String db="D:\\Database1.accdb";
		String dbPath="jdbc:ucanaccess://"+db;
		
		con=DriverManager.getConnection(dbPath);
		//System.out.println("Connection is perfect");
		
		stmt=con.createStatement();
		//SELECT * FROM Student WHERE StudentName='John';
		
		System.out.println("Enter the name of the student whose information is required:");
		Scanner sc=new Scanner(System.in);
		
		String name=sc.nextLine();
		
		String query="SELECT * FROM Student WHERE StudentName='"+name+"'";
		rs=stmt.executeQuery(query);
		
		boolean isNotThere=true;
		
		while(rs.next()) {
			isNotThere=false;
			name=rs.getString(2);
			int age=rs.getInt(3);
			double percentage=rs.getDouble(4);
			
			System.out.println("Student Name: "+name+"--Student Age:"+age+"--Student Percentage:"+percentage);
			
		}
		if(isNotThere)
			System.out.print("No Record Found for "+name);
		
} catch (ClassNotFoundException e) {
		System.out.println("Problem loading the driver");
		e.printStackTrace();
	}	
	
	catch (SQLException e) {
		e.printStackTrace();
	}
	finally
	{
		
			try {
				rs.close();
				stmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		
	}

	}

}

package connect;

import java.sql.*;
import java.util.Scanner;

public class StudentDelete {

	public static void main(String[] args) {
		Connection con=null;
		Statement stmt=null;
		Scanner sc=null;
		try {
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			String db="D:\\Database1.accdb";
			String myPath="jdbc:ucanaccess://"+db;
				
			con=DriverManager.getConnection(myPath);
			
			stmt=con.createStatement();
			
			//DELETE FROM Student WHERE StudentName='Jim';
			sc=new Scanner(System.in);
			System.out.println("Enter the name of the student whose record is to be deleted");
			String name=sc.nextLine();
			
			
			
			String query="DELETE FROM Student WHERE StudentName='"+name+"'";
			
			int rows=stmt.executeUpdate(query);
			
			if(rows>0)
				System.out.print("Record deleted for "+name);
			else
				System.out.print("No Record found for "+name);
			
		} 
		
		catch (ClassNotFoundException e) {
			System.out.println("problem loading Driver");
			e.printStackTrace();
		}
		 catch (SQLException e) {
				e.printStackTrace();
			}
		finally
		{
			try {
				stmt.close();
				con.close();
				sc.close();
			} catch (SQLException e) {
				System.out.print("Problem in closing of connections");
				e.printStackTrace();
			}
		}

	}

}

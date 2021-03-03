package connect;
import java.sql.*;
import java.util.Scanner;

public class StudentUpdate {

	public static void main(String[] args) {
		Connection con=null;
		Statement stmt=null;
		
		try {
			

			
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			String db="D:\\Database1.accdb";
			String myPath="jdbc:ucanaccess://"+db;
			con=DriverManager.getConnection(myPath);
			stmt=con.createStatement();
			//UPDATE Student SET Percentage=88 WHERE StudentName='John';
			Scanner sc=new Scanner(System.in);
			
			
			System.out.println("Enter the name of the student whose percenatge is to be updated");
			String name=sc.nextLine();
			
			System.out.println("Enter the new update percentage");
			double percentage=sc.nextDouble();
			
			
			String query="UPDATE Student SET Percentage="+percentage+" WHERE StudentName='"+name+"'";
			int rows=stmt.executeUpdate(query);
			
			if(rows>0)
				System.out.println("Record updated for "+name);
			else
				System.out.println("Record not found for "+name);
		 
		} 
		
		
		
		
		catch (ClassNotFoundException e) {
			System.out.print("Problem loading Driver");
			e.printStackTrace();
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}

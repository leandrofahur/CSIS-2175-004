/*
1 * Suppose you have a student table in MS-Access with fields 
 * id, StudentId,StudentName,Course1,Course2,Course3
 * Program to retrieve, update, delete and insert data in the table
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StudentDatabase {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int choice,choose;
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		
		// Step 1: Loading or registering ucanaccess JDBC driver class
		
					try {
						//This method dynamically loads the driver's class file into memory, which automatically registers it. 
						Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
						String database = "D:\\Douglas\\csis2175\\jdbc\\TestDatabase.mdb";
						String databasePath = "jdbc:ucanaccess://" + database;
					
						// Step 2.A: Create and get connection using DriverManager class
						
						connection = DriverManager.getConnection(databasePath);
						// Step 2.B: Creating JDBC Statement
						statement = connection.createStatement();
						
		do
		{
		System.out.println("Press 1 to retreive. Press 2 to Insert.  Press 3 to Update marks of course 1.  Press 4 to Delete.");
		choose=sc.nextInt();
		switch(choose)
		{
			case 1:
			
			// Step 2.C: Executing SQL & retrieve data into ResultSet
				  resultSet = statement.executeQuery("SELECT * FROM STUDENT");
				  while (resultSet.next()) {
					    String id = resultSet.getString(2);
					    String name = resultSet.getString(3);
					    int c1=resultSet.getInt(4);
					    int c2=resultSet.getInt(5);
					    int c3=resultSet.getInt(6);
					    System.out.println("Student # " + id + " Name "+name+"\n"+" Marks "+c1+" "+c2+" "+c3+"\n");
				  }
				  
				break;
			case 2:
				System.out.println("Enter the ID of the student");
				Scanner sc1=new Scanner(System.in);
				String id=sc1.nextLine();
				
				System.out.println("Enter the name of the student");
				String name=sc1.nextLine();
				
				System.out.println("Enter the marks in course 1 of the student");
				int c1=sc1.nextInt();
				System.out.println("Enter the marks in course 2 of the student");
				int c2=sc1.nextInt();
				System.out.println("Enter the marks in course 3 of the student");
				int c3=sc1.nextInt();
				//Create an insert statement
				String insertSQL = "INSERT INTO STUDENT (StudentId,StudentName,Course1,Course2,Course3) VALUES ('"+id+"','"+name+"',"+c1+","+c2+","+c3+")";
				statement.executeUpdate(insertSQL);

				break;
			case 3:
				System.out.println("Enter the ID of the student");
				Scanner sc2=new Scanner(System.in);
				String id1=sc2.nextLine();
				
				System.out.println("Enter the marks in course 1");
				int c=sc2.nextInt();
				//Create an update statement
				String updateSQL = "UPDATE STUDENT SET Course1="+c+" WHERE StudentId='"+id1+"';";

				statement.executeUpdate(updateSQL);

				
				break;
			case 4:
				System.out.println("Enter the ID of the student");
				Scanner sc3=new Scanner(System.in);
				String id2=sc3.nextLine();
				//Create an delete statement
				String deleteSQL = "DELETE FROM STUDENT WHERE StudentId='"+id2+"';";

				statement.executeUpdate(deleteSQL);

				
				break;
				
		}
		
		System.out.print("Do you want to continue?");
		choice=sc.nextInt();
		}while(choice==1);

	
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	catch (ClassNotFoundException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	finally
	{
		try {
				connection.close();		
				statement.close();
				resultSet.close();
				sc.close();
				}
		catch (SQLException e) {
			System.out.println("Error in closing");
			e.printStackTrace();
			}
						
					}
	}

}

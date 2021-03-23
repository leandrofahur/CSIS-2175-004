package com.company;

import java.sql.*;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		try {
			
			//variaveis para começar a conexão
			
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			Connection connection = DriverManager.getConnection("jdbc:ucanaccess:///Users/leandro/Desktop/le/douglas_college/CSIS_2175/code/TodoList/src/com/company/db/OOP.accdb");
			Statement statement = connection.createStatement();
						
			//select
			
			////////////////////////////
			
			//delete
						
			System.out.println("Enter the breed of the record you want to delete");
			String breed = sc.nextLine();
			
			String query="DELETE FROM Dog WHERE breed='"+breed+"'";
			
			statement.execute(query);
			
			//update
			System.out.println("Enter the breed of the dog to update information");
			breed = sc.nextLine();
			
			System.out.println("Enter updated sound");
			String sound = sc.nextLine();
			
			
			query = "UPDATE Dog SET SOUND="+sound+" WHERE breed='"+breed+"'";
			statement.executeUpdate(query);
			
			//instaciar o objeto da classe cachorro 
			Dog dog = new Dog();
			
			//pegue do usuario breed e sound
			System.out.println("Add breed");
			breed = sc.nextLine();
			System.out.println("Add sound");
			sound = sc.nextLine();
			
			//colocar pra classe 
			
			
			//retornar breed e sound da classe (set get)

			
			//pedir para usuario ir adicionando na tabela e atualizar o id para começar em 1 
			
			System.out.println("Press 1 if you want to add another element");
			int input = sc.nextInt();
			
			int ID = 1;
			
			do {
				  ID++;
				  
				}
			
				while (input == 1);
		
			
			/*String breed = "ViraLata";
			//String sound = "auau";
			int ID = 0;*/
			
			query = "INSERT INTO Dog(ID, Breed, SOUND) VALUES("+ ID +",'"+ breed +"','"+ sound +"')";
			
			//linha para executar a Query
			statement.executeUpdate(query);
			
			//sempre lembrar de fechar a conexão
			if(connection != null)
			{
				//resultset.close();
				statement.close();
				connection.close();
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	
	}

}

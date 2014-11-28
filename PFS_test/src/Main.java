import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import domain.User;

import repositories.IRepository;

import repositories.impl.UserRepository;



public class Main {
	public static void main(String[] args) {
		String url="jdbc:hsqldb:hsql://localhost/workdb";
		User jnowak = new User();
		jnowak.setLogin("jarek");
		jnowak.setPassword("P@ssw0rD");
		
try {
			
			Connection connection = DriverManager.getConnection(url);
			/*
			String createTableSql = 
					"CREATE TABLE users("
					+ "id int GENERATED BY DEFAULT AS IDENTITY,"
					+ "login VARCHAR(20),"
					+ "password VARCHAR(20)"
					+ ")";
			Statement createTable = connection.createStatement();
			createTable.executeUpdate(createTableSql);
			*/
			IRepository<User> users = new UserRepository(connection);
			users.save(jnowak);
			List<User> usersFromDb= users.getAll();
			
			for(User userFromDb: usersFromDb)
				System.out.println(userFromDb.getId()+" "+userFromDb.getLogin()+" "+userFromDb.getPassword());
			
			User u = users.get(2);
			u.setPassword("1111111");
			users.update(u);
			users.delete(usersFromDb.get(0));
			
			for(User userFromDb: users.getAll())
				System.out.println(userFromDb.getId()+" "+userFromDb.getLogin()+" "+userFromDb.getPassword());
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("koniec");
	}
}

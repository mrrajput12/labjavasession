/*Wap to print the city started with s 
 * @Author: Abhishek Raj
 * @date: 15 dec 2022
 */
package com.ques2;

//importing the package
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//class started
public class TestConnection {

	public static Connection connect() throws SQLException {
		// input the username
		String Username = "root";
		// input the password
		String Password = "Abhishek@123";
		// input the url
		String url = "jdbc:mysql://localhost:3306";
		// Connection created with mysql
		return DriverManager.getConnection(url, Username, Password);

	}

//main started
	public static void main(String[] args) throws SQLException {
		// Creating connection object
		Connection conn = connect();

		Statement stmt = conn.createStatement();
		// Writting the like statement in query
		String query = "select * from author where city LIKE 's%'";
		// Executing the query
		ResultSet rs = stmt.executeQuery(query);
		// Printing the table whose city name start with s
		System.out.println("AuthorID  Name       City");
		while (rs.next()) {
			System.out.println("     " + rs.getString(1) + "     " + rs.getString(2) + "      " + rs.getString(3));
		}

	}
	// end of main
}
//end of class

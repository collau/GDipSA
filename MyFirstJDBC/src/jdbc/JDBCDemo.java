package jdbc;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;

import model.Student;

public class JDBCDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//Step 1: Loading a Driver
		//import java.sql.DriverManager
		//Throw Exception in case class cannot be found, or not properly referenced
		Class.forName("com.mysql.jdbc.Driver");

		//Step 2: Connecting to a database
		//import java.sql.Connection
		//import java.sql.SQLException
		//input ?useSSL=false as SSL connection is not established
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myFirstSchema?useSSL=false", "root", "password");
		
		//Step 3: Create Statement Object
		//import java.sql.Statement
		Statement statement = con.createStatement();
		
		//Step 4: Executing SQL
		//import java.sql.ResultSet
		//iterator
		ResultSet rs = statement.executeQuery("SELECT * FROM myFirstSchema.Student;");
		
		//Step 5: Processing Returned Data
		while (rs.next()) {
			Student student = new Student();
			student.setStudentID(rs.getInt(1));
			student.setStudentName(rs.getString("studentName"));
			student.setNickName(rs.getString("nickName"));
			System.out.println(student.toString());
			
		}
		
		//Step 6: Close Database Connection 
		statement.close();
		con.close(); 
		
		
	}

}

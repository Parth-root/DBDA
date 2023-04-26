package utils;
import java.sql.*;

public class DBUtils {
	private static Connection cn;
	
	public static Connection openConnection() throws SQLException	 {
		//1.load jdbc driver optional
	//	Class.forName("com.mysql.cj.jdbc.Driver");
		//get db connection :DriverManager
		//public static Connection getCOnnection(String dbURL,String userName,String password) throws SQLException
		String url = "jdbc:mysql://localhost:3306/dbda23?useSSL=false&allowPublicKeyRetrieval=true";//
		cn=DriverManager.getConnection(url,"root","dbda");
		System.out.println("Connection is established "+cn);
		return cn;
	}
	public static void closeConnection() throws SQLException {
	if(cn!=null)
		cn.close();
	System.out.println("user dao closed");
	}
}

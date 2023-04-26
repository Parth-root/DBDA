package tester;
import static utils.DBUtils.*;
import java.sql.*;


public class TestConnection {

	public static void main(String[] args) {
		
		try(Connection cn=openConnection()){
			System.out.println("Success");
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}

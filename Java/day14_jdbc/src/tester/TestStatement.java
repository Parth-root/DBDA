package tester;
import static utils.DBUtils.*;
import java.sql.*;


public class TestStatement {

	public static void main(String[] args) {
		
		try(//1.Establish connection
				Connection cn=openConnection();
				//2.Create a statement object to hold query
				Statement st=cn.createStatement();
				//3.Pass the sql and execute it
				ResultSet rst=st.executeQuery("select * from users");
				)
		{
			//Processing of the result set
			while(rst.next())
				System.out.println("ID "+rst.getInt(1)+" Name "+rst.getString(2)
				+"Email "+rst.getString(3)+"Password "+rst.getString(4)
				+"Reg amount"+rst.getDouble(5)+"Reg on "+rst.getDate(6)
				+"Role "+rst.getString(7));
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}

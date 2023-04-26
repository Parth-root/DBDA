package tester;
import static utils.DBUtils.*;
import java.sql.*;
import java.util.Scanner;


public class TestPreparedStatement{

	public static void main(String[] args) {
		
		try(Scanner sc=new Scanner(System.in);
			Connection cn=openConnection();
			PreparedStatement pst=cn.prepareStatement("select * from users where id=?");
			)
		
		{
			System.out.println("Enter user Id");
			//PST API public void setType(int paramIndex, Type value)
			pst.setInt(1, sc.nextInt());
			//execute query and process RST
			try(ResultSet rst = pst.executeQuery()){
				if(rst.next())
					System.out.println("ID "+rst.getInt(1)+" Name "+rst.getString(2)
					+"Email "+rst.getString(3)+"Password "+rst.getString(4)
					+"Reg amount"+rst.getDouble(5)+"Reg on "+rst.getDate(6)
					+"Role "+rst.getString(7));
				else 
					System.out.println("Invalid user ID : user not found!!!");
			}// rst.close
		} //
		
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}

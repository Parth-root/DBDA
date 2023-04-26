package dao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static utils.DBUtils.*;
import pojos.User;

public class UserDaoImpl implements UserDao {
	//state
	private Connection conn;
	private PreparedStatement pst1,pst2,pst3,pst4;
	

	public UserDaoImpl() throws SQLException {
		//open db connection()
		conn=openConnection();
		//create PST ready
		pst1=conn.prepareStatement("select * from users where id=?");
		pst2=conn.prepareStatement("select * from users where reg_date between ? and ? and role='CUSTOMER'");
		pst3=conn.prepareStatement("insert into users values (Default,?,?,?,?,?,?)");
		pst4=conn.prepareStatement("delete from users where id=?");
				System.out.println("user dao created!");
		// wehn adding data
				//| name    | email          | password | reg_amt | reg_date   | role
	}

	@Override
	public List<User> getCustumersByRegDate(Date begin, Date end) throws SQLException {
		//create empty AL
		List<User>users=new ArrayList<>();
		pst2.setDate(1,begin);
		pst2.setDate(2, end);
		//exec query--->get rst-->list<User>
		try(ResultSet rst=pst2.executeQuery())
		{
			while(rst.next())
			users.add(new User(rst.getInt(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getDouble(5),rst.getDate(6),rst.getString(7)));
			
		}
		return users;
	}
	public User addUserDetial(String name, String email, String password, double regAmount, Date regDate, String role) throws SQLException  {
		
		User a=new User(name,email,password,regAmount,regDate,role);
		pst3.setString(1,a.getName());
		pst3.setString(2,a.getEmail());
		pst3.setString(3,a.getPassword());
		pst3.setDouble(4,a.getRegAmount());
		pst3.setDate(5,a.getRegDate());
		pst3.setString(6,a.getRole());
		pst3.executeUpdate();
		return a;
		
	}
	
	
	public User removeUserDetailsById(int userId) throws SQLException {
		//1.setin param:user id
		pst4.setInt(1,userId);
		pst4.executeUpdate();
		//pst4.executeQuery();
		
		//2.exec qury(select)---->Rst--->process the rst
		/*try (ResultSet rst=pst1.executeQuery()){
			if(rst.next())
				
				//int userid, String name, String email, String password, double regAmount, Date regDate, String role
				return new User(userId,rst.getString(2),rst.getString(3),rst.getString(4),rst.getDouble(5),rst.getDate(6),rst.getString(7));
			
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		
		return null;
	}
	
	
	@Override
	public User getUserDetailsById(int userId) throws SQLException {
		//1.setin param:user id
		pst1.setInt(1,userId);
		//2.exec qury(select)---->Rst--->process the rst
		try (ResultSet rst=pst1.executeQuery()){
			if(rst.next())
				
				//int userid, String name, String email, String password, double regAmount, Date regDate, String role
				return new User(userId,rst.getString(2),rst.getString(3),rst.getString(4),rst.getDouble(5),rst.getDate(6),rst.getString(7));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	//clean up dao layer
	public void cleanUp() throws SQLException
	{
		//close PST
		if(pst1!=null)
			//close cn
			pst1.close();
		if(pst2!=null)
			//close cn
			pst2.close();
		
		closeConnection();
	}


	

}

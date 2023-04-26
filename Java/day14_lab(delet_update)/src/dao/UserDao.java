package dao;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

import pojos.User;

public interface UserDao {
//add a method declaration to get user details by id
	User getUserDetailsById(int userId)throws SQLException;
	//add a mathod to get user by thair reg data
	List<User>getCustumersByRegDate(Date begin,Date end)throws SQLException;
}

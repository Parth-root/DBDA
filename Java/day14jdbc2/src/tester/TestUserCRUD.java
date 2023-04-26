package tester;

import java.sql.Date;
import java.sql.SQLException;
//import java.util.Date;
import java.util.Scanner;

import dao.UserDaoImpl;
import pojos.User;

public class TestUserCRUD {

	public static void main(String[] args) throws SQLException {
		try(Scanner sc=new Scanner(System.in))
		{
			UserDaoImpl dao=new UserDaoImpl();
			boolean exit=false;
			while(!exit)
			{
				System.out.println("\noption \n1.getr user details by id"
						+ "\n2.Get user by date"
						+ "\n0.exit");
				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println("enter user id");
						User user=dao.getUserDetailsById(sc.nextInt());
						if(user!=null)
							System.out.println("Details"+user);
						else
							System.out.println("Invalid user ID!!!!!!!!!");
						break;
					case 2:
						System.out.println("Enter begin reg date and end reg date");
						Date d1=Date.valueOf(sc.next());
						Date d2=Date.valueOf(sc.next());
						dao.getCustumersByRegDate(d1,d2).forEach(System.out::println);
						
								
						break;
					case 0:
					exit=true;
					dao.cleanUp();

					default:
						break;
					}
					
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		}

	}

}

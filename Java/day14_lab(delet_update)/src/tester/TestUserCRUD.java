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
						+ "\n3.Add user"
						+ "\n4.Delet user"
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
					case 3:
						System.out.println("Enter detail to add user");
						User user1=dao.addUserDetial(sc.next(),sc.next() ,sc.next(),sc.nextDouble(),Date.valueOf(sc.next()),sc.next());
						System.out.println(user1);
						break;
					case 4:
						System.out.println("Enter user id to remove it from my sql\n");
						System.out.println("enter user id");
						User user11=dao.removeUserDetailsById(sc.nextInt());
						if(user11!=null)
							System.out.println("Details"+user11);
						else
							System.out.println("Invalid user ID!!!!!!!!!");
						
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

package tester;
import java.util.Scanner;


import inheritance.*;

public class TestPlayer {

	public static void main(String[] args) {
		Scanner op=new Scanner(System.in);
		System.out.println("Add maximum number of player to add");
		Player[] Players=new Player[op.nextInt()];
		char ch;
		int count=0;
		
		do {
			System.out.println("Add input acoording to number \n"
					+ "1. Add Cricket Player details\n"
					+ "2. Add Football Player details\n"
					+ "3. Add Tennis Player details\n"
					+ "4. Display detail of all player.\n"
					+ "5. Display play\n"
					+ "6. PLayer specific detail\n"
					+ "0.to exit from app");
		switch (op.nextInt()) {
			case 1:
			if(count<Players.length) {
				System.out.println("Enter Cricket Player detail");
				String name;
				int age;
				String country;
				int run;
				System.out.println("Enter player name:");
				name=op.next();
				System.out.println("Enter player age:");
				age=op.nextInt();
				System.out.println("Enter player country:");
				country=op.next();
				System.out.println("Enter player run:");
				run=op.nextInt();
				Players[count++]=new CricketPlayer(name,age, country,run);
				}
				
			else
				System.out.println("maximum player limit reched");
			break;
		case 2:
			if(count<Players.length) {
				System.out.println("Enter Football Player detail");
				String name;
				int age;
				String country;
				int goals;
				System.out.println("Enter player name:");
				name=op.next();
				System.out.println("Enter player age:");
				age=op.nextInt();
				System.out.println("Enter player country:");
				country=op.next();
				System.out.println("Enter player goals:");
				goals=op.nextInt();
				Players[count++]=new FootballPlayer(name,age,country,goals);
				}
				
			else
				System.out.println("maximum player limit reched");
			break;
			
		case 3:
			if(count<Players.length) {
				System.out.println("Enter Tennis Player detail");
				String name;
				int age;
				String country;
				int matches;
				System.out.println("Enter player name:");
				name=op.next();
				System.out.println("Enter player age:");
				age=op.nextInt();
				System.out.println("Enter player country:");
				country=op.next();
				System.out.println("Enter player matches:");
				matches=op.nextInt();
				Players[count++]=new TennisPlayer(name,age,country,matches);
				}
				
			else
				System.out.println("maximum player limit reched");
			break;
			
		case 4:
			System.out.println("Print all player detail");
			for(Player pl : Players) {
				if(pl!=null)
					System.out.println(pl);
				else 
					break;
			}
				
			break;
		case 5:
			for(Player pl : Players) {
				int i=0;
				for(Player pl1 : Players) {
				if(pl1!=null) {
					System.out.println(i+". "+pl1.getName());
					i++;	
				}
				}
			}
			int index=op.nextInt()-1;
			if (index>0 && index<=Players.length) {
				if(index<count) 
					System.out.println(Players[index].play());
				else
					System.out.println("Player "+(index+1)+"detail is not filled");
					
				}
			
			break;
		case 6:
			for(Player pl : Players) {
				int i=0;
				for(Player pl1 : Players) {
				if(pl1!=null) {
					System.out.println(i+". "+pl1.getName());
					i++;	
				}
				}
				int index1=op.nextInt()-1;
				if (index1>0 && index1<=Players.length) {
					if(index1<count) {
						if(Players[index1] instanceof CricketPlayer) {
						System.out.println("add score \n"
								+ "add played match");
						System.out.println(((CricketPlayer)Players[index1]).battingAverage(op.nextInt(),op.nextInt()));
						}
						if(Players[index1] instanceof FootballPlayer) {
							System.out.print("Enter goals defended: ");
							System.out.println(((FootballPlayer)Players[index1]).defGoals(op.nextInt()));
							}
						if(Players[index1] instanceof TennisPlayer) {
							System.out.print("Enter aces served: ");
							System.out.println(((TennisPlayer)Players[index1]).acesServed(op.nextInt()));
							}
					}
				}	

			}
			break;
		case 0:
			System.out.println("Program terminated");
			System.exit(0);
			break;

		default:
			System.out.println("Wrong input try again");
			break;
			
		}
		System.out.println("Continue Y/N");
		ch=op.next().charAt(0);
		
	}while(ch=='Y' || ch=='y');
	op.close();
}
}

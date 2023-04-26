package tester;

import java.util.Scanner;
import inheritance.*;

public class TestPlayer {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	char ch;
	int count=0;
	System.out.print("Enter the number of players: ");
	Player[] players=new Player[sc.nextInt()];
	do {
		System.out.println("1.Add Cricket Player \n2.Add Football Player"
				+ "\n3.Add Tennis Player \n4.Display details of all players"
				+ "\n5.Display play \n6.Display player specifc details"
				+ "\n0.Exit");
		
		switch (sc.nextInt()) {	
		case 1:
				if(count<players.length) {
					System.out.println("Enter cricket player details");
					System.out.println("name,age,country,run");
					players[count++]=new CricketPlayer(sc.next(), sc.nextInt(), sc.next(), sc.nextInt());
				}
				else
					System.out.println("Maximum number of players reached");
				break;
		
		case 2:
				if(count<players.length) {
					System.out.println("Enter football player details");
					System.out.println("name,age,country,goals");
					players[count++]=new FootballPlayer(sc.next(), sc.nextInt(), sc.next(), sc.nextInt());
				}
				else
					System.out.println("Maximum number of players reached");
				break;
			
		case 3:
				if(count<players.length) {
					System.out.println("Enter tennis player details");
					System.out.println("name,age,country,matches");
					players[count++]=new TennisPlayer(sc.next(), sc.nextInt(), sc.next(), sc.nextInt());
				}
				else
					System.out.println("Maximum number of players reached");
				break;
			
		case 4:
				System.out.println("Details of all players");
				for(Player pl : players) {
					if(pl!=null)
						System.out.println(pl);
					else
						break;
				}
				break;
			
		case 5:
				System.out.println("Displaying play");
				System.out.print("Enter player number: ");
				int index=sc.nextInt()-1;
				if(index>=0 && index<=players.length) {
					if(index<count)
						System.out.println(players[index].play());
					else
						System.out.println("Player"+(index+1)+" details not filled");
				}
				else
					System.out.println("Invalid number");
				break;
			
		case 6:
				System.out.println("Player specific details");
				System.out.print("Enter player number: ");
				int ind=sc.nextInt()-1;
				if(ind>=0 && ind<=players.length) {
					if(ind<count) {
						if(players[ind] instanceof CricketPlayer) {
							System.out.print("Enter batting average: ");
							System.out.println(((CricketPlayer)players[ind]).battingAvg(sc.nextInt()));
						}
						else if(players[ind] instanceof FootballPlayer) {
							System.out.print("Enter goals defended: ");
							System.out.println(((FootballPlayer)players[ind]).defGoals(sc.nextInt()));
						}
						else {
							System.out.print("Enter aces served: ");
							System.out.println(((TennisPlayer)players[ind]).acesServed(sc.nextInt()));
						}
					}
					else
						System.out.println("Player"+(ind+1)+" details not filled");
				}
				else
					System.out.println("Invalid number");
				break;
			
		case 0:
				System.out.println("Program terminated");
				System.exit(0);
				break;
			
		default:
				System.out.println("Wrong input. Try again");
				break;
		}
		
		System.out.println("Do you want to continue?(Y/N)");
		ch=sc.next().charAt(0);
	}while(ch=='Y' || ch=='y');
	
	sc.close();
	}

}

package tester;

import inheritance.*;

public class TestPlayer {

	public static void main(String[] args) {
			CricketPlayer c1=new CricketPlayer("Virat Kholi", 34, "India", 120);
			CricketPlayer c2=c1;
			if(c2==c1)
				System.out.println("Comparison by which object they're pointing to");
			FootballPlayer f1=new FootballPlayer("Cristiano Ronaldo", 32, "Portuguese", 4);
			TennisPlayer t1=new TennisPlayer("Roger Federer", 36, "Switzerland", 8);
			System.out.println(c1.play());
			System.out.println(f1.play());
			System.out.println(t1.play());
			}

}

package inheritance;

public class CricketPlayer extends Player{
	private int run;
	
	public CricketPlayer(String name,int age,String country,int run) {
		super(name,age,country);
		this.run=run;
	}
	
	public String play() {
		return "Runs Scored: "+run;
	}

	public String battingAvg(int matches) {
		return "Batting average: "+((double)run/(double)matches);
	}
			
}

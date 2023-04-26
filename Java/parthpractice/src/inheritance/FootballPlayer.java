package inheritance;

public class FootballPlayer extends Player{
	private int goals;
	
	public FootballPlayer(String name,int age,String country,int goals) {
		super(name,age,country);
		this.goals=goals;
	}
	
	public String play() {
		return "Playing Football\n"+"\n"+"Name: "+super.getName()+"\tGoals Scored:"+goals;
	}
	public String defGoals(int goals) {
		return "goals of "+super.getName()+goals;
	}
		
}

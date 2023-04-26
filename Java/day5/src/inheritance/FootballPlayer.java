package inheritance;

public class FootballPlayer extends Player{
	private int goals;
	
	public FootballPlayer(String name,int age,String country,int goals) {
		super(name,age,country);
		this.goals=goals;
	}
	
	public String play() {
		super.play();
		return super.play()+"\n"+"Name: "+super.getName()+"\tGoals Scored:"+goals;
	}
		
}

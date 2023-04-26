package inheritance;

public class FootballPlayer extends Player{
	private int goals;
	
	public FootballPlayer(String name,int age,String country,int goals) {
		super(name,age,country);
		this.goals=goals;
	}
	
	public String play() {
		return "Goals Scored:"+goals;
	}
		
	public String defGoals(int saves) {
		return "Goals defended: "+saves;
	}
}

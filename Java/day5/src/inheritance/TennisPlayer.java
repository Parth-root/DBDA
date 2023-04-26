package inheritance;

public class TennisPlayer extends Player{
	private int matches;
	
	public TennisPlayer(String name,int age,String country,int matches) {
		super(name,age,country);
		this.matches=matches;
	}
	
	public String play() {
		//super.play();
		return super.play()+"\n"+"Name: "+super.getName()+"\tMatches won:"+matches;
	}
		
}

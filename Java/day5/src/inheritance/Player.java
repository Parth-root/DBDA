package inheritance;

public class Player {
		private String name;
		private int age;
		private String country;
		
		public Player(String name, int age, String country) {
			this.name=name;
			this.age=age;
			this.country=country;
		}
		
		public String getName() {
			return name;
		}
		
		public String play() {
			return "Playing a sport";
		}
}

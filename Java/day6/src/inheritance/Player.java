package inheritance;

public abstract class Player {
		private String name;
		private int age;
		private String country;
		
		public Player(String name, int age, String country) {
			this.name=name;
			this.age=age;
			this.country=country;
		}
		
		@Override
		public String toString() {
			return "Name: "+name+"\tCountry: "+country;
		}
		
		public abstract String play();
}

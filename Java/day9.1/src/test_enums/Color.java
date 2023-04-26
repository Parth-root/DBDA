package test_enums;

public enum Color {
	WHITE, BLACK, SILVER, BLUE, RED;
	
	@Override
	public String toString() {
		return name().toLowerCase();
	}
}
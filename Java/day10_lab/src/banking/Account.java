package banking;

public enum Account {
	SAVINGS, CURRENT, DMAT, LOAN, FD;
	
	public String toString() {
		return name().toLowerCase();
	}
}

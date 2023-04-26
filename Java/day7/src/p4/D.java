package p4;

public class D implements C{

	@Override
	public boolean isEven(int num) {
		return num%2==0;
	}

	@Override
	public void show(String msg) {
		System.out.println("Message: "+msg);
	}

	@Override
	public double add(double d1, double d2) {
		return d1+d2;
	}
	
}

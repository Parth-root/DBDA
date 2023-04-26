package p3;

public class C implements A, B{

	@Override
	public boolean isEven(int num) {		
		return num%2==0;
	}
	
	@Override
	public void show() {
		System.out.println("Show invoked");
	}
}

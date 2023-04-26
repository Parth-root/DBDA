package string_handling;

public class Test2 {

	public static void main(String[] args) {
		//Testing the equality of strings
		String s1=new String("Hello");
		String s2=new String(s1);
		System.out.println(s1==s2);				//False - Checks for reference equality		
		System.out.println(s1.equals(s2));		//True - Checks for content equality		
		String s3=new String("HELLO");
		System.out.println(s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s3));
	}

}
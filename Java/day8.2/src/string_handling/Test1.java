package string_handling;

public class Test1 {

	public static void main(String[] args) {
		//Checking for immutability of strings
		String s=new String("Hello");
		String s1=s.concat(" Hi");
		System.out.println(s);						//Hello
		System.out.println(s1);						//Hello Hi
		s+=" 12345";
		System.out.println(s);						//Hello 12345
		String s2=s.toUpperCase();				
		System.out.println(s);						//Hello 12345
		System.out.println(s2);						//HELLO 12345
		System.out.println(s.substring(6));			//12345
		System.out.println(s2.substring(3,8));		//LO 12
		
		//Display True if s3 contains the substring 123 -> Searching for a substring
		System.out.println(s2.contains("123")?"True":"False");
		
		//Printing 1st and last character
		System.out.println((s.charAt(0)+" "+s.charAt(s.length()-1)));
		
		//Finding index of substring
		String st1="You would hope to find a dragon in a dragon's den";
		System.out.println(st1.indexOf("dragon")+" "+st1.lastIndexOf("dragon"));

	}

}

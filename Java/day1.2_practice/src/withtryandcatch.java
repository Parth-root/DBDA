
class withtryandcatch {

	public static void main(String[] args)
	{
		try {
		int num1= Integer.parseInt(args[0]);	//parseInt() is present in class Integer
		int num2= Integer.parseInt(args[1]);	//parseInt() converts string to integer
		System.out.println("Sum= "+(num1+num2));
		}catch(Exception e)
		{
		System.out.println("What a stupid Feloow You are");	
		}
		
	}

}

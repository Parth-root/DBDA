import java.util.Scanner;

public class CompoundInterest_assg9 {

	public static void main(String[] args) {
		double pri,rate,temp1,temp2,ci;
		int time;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the principle: ");
		pri=sc.nextDouble();
		System.out.print("Enter the rate of interest: ");
		rate=sc.nextDouble();
		System.out.print("Enter the time(in yrs): ");
		time=sc.nextInt();
		temp1=(1+(rate/100));
		temp2=Math.pow(temp1, time);
		ci=pri*temp2-pri;
		System.out.print("Compond interest= "+ci);
		sc.close();
	}

}

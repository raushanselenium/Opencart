package practiseSeleniumTopics;

import java.util.Scanner;

public class ReverseNumber {
	
	public static int numberReverse(int n)
	{
		int rev=0,rem=0;
		while(n!=0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		return rev;
	}

	public static void main(String[] args) {
	
		System.out.println("Enter number to reverse");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		System.out.println("Number entered is-->"+x);
		int rev=numberReverse(x);
		System.out.println("Number after reverse is-->"+rev);

	}

}

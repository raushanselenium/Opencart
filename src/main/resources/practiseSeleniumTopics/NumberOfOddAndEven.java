package practiseSeleniumTopics;

import java.util.Scanner;

public class NumberOfOddAndEven {

	public static void main(String[] args) {
		
		System.out.println("Enter number to find, number of odd and even digit contained!!!");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rem=0,x=n,even=0,odd=0;
		while(n!=0)
		{
			rem=n%10;
			if(rem%2==0)
				even++;
			else
				odd++;
			n=n/10;
		}
		System.out.println("Number od odd digit in "+x+" is "+odd);
		System.out.println("Number od even digit in "+x+" is "+even);
	}

}

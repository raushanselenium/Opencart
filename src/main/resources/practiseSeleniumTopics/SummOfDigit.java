package practiseSeleniumTopics;

import java.util.Scanner;

public class SummOfDigit {

	public static void main(String[] args) {
		
		System.out.println("Enter number to find sum of digit");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rem=0,sum=0,x=n;
		while(n!=0)
		{
			rem=n%10;
			sum+=rem;
			n=n/10;
		}
		System.out.println("Sumof digit of number "+x+" is "+sum);

	}

}

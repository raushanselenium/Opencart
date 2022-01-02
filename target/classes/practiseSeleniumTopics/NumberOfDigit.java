package practiseSeleniumTopics;

import java.util.Scanner;

public class NumberOfDigit {

	public static void main(String[] args) {
		
		System.out.println("Enter number to count number of digit");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(); 
		int count=0,x;
		x=n;
		while(n!=0)
		{
			count++;
			n=n/10;
		}
		System.out.println("Number of digit in "+x+" is "+count);

	}

}

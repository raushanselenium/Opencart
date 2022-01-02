package practiseSeleniumTopics;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		//a word, phrase, or sequence that reads the same backwards as forwards, e.g. madam or nursesrun
		System.out.println("palindrome Program");
		System.out.println("A number that reads the same backwards as forwards, e.g. 121,2442,etc");
		System.out.println("Enter number to check if Palindrome or not?");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int num=0,rev=0,rem=0;
		num=n;
		while(num!=0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
			
		}
		if(n==rev)
			System.out.println(n+" is Palindrome");
		else
			System.out.println(n+" is not Palindrome");

	}

}

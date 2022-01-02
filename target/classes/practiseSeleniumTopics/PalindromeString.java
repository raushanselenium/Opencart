package practiseSeleniumTopics;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		
		System.out.println("Enter string to check if Palindrome or not?");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int len=s.length();
		String s1="";
		for(int i=len-1;i>=0;i--)
		{
			s1+=s.charAt(i);
		}
		if(s.equals(s1))
			System.out.println(s+" is palindrome");
		else
			System.out.println(s+" is not palindrome");

	}

}

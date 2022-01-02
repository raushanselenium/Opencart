package practiseSeleniumTopics;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		System.out.println("Enter string to reverse");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println("String entered is-->"+s);
		String s1="";
		int len=s.length();
		for(int i=len-1;i>=0;i--)
		{
			s1=s1+s.charAt(i);	
		}
		System.out.println("Reverse of String is-->"+s1);

	}

}

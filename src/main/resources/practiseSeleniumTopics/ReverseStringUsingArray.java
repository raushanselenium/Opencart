package practiseSeleniumTopics;

import java.util.Scanner;

public class ReverseStringUsingArray {

	public static void main(String[] args) {
		
		System.out.println("Enter string to reverse");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println("String entered is-->"+s);
		char[] arr=s.toCharArray();
		String rs="";
		int len=arr.length;
		for(int i=len-1;i>=0;i--)
		{
			rs+=arr[i];
		}
		System.out.println("Reverse of String is-->"+rs);

	}

}

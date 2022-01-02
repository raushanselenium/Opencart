package practiseSeleniumTopics;

import java.util.Scanner;

public class SwapNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two Numbers to swap");
		System.out.println("Enter first number");
		int x=sc.nextInt();
		System.out.println("Enter second number");
		int y=sc.nextInt();
		//x=4,y=5
		x=x+y;//9
		y=x-y;//4
		x=x-y;//5
		System.out.println(x+"---"+y);
	}

}

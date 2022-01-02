package practiseSeleniumTopics;

import java.util.Scanner;

public class LargestOf3Numbers {

	public static void main(String[] args) {
	
		int[]  arr=new int[3];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 numbers to find the largest");
		for(int i=0;i<3;i++)
		{
			int counter=i+1;
			System.out.println("Enter "+counter+" number");
			arr[i]=sc.nextInt();
		}
		int  max=arr[0];
		for(int i=0;i<3;i++)
		{
			if(arr[i]>max)
				max=arr[i];
		}
		System.out.println("Maximum is -->"+max);
	}

}

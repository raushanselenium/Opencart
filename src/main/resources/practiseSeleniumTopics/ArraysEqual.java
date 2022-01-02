package practiseSeleniumTopics;

import org.bouncycastle.util.Arrays;

public class ArraysEqual {

	public static void main(String[] args) {
	
		int[] a= {1,2,3,4,5};
		int []b= {1,2,3,7,5};
		boolean equal=Arrays.areEqual(a, b);
		System.out.println(equal);
	

	}

}

package practiseSeleniumTopics;

import java.util.Random;

import org.apache.commons.lang.RandomStringUtils;

public class RandomNumber {

	public static void main(String[] args) {
		
		/*Random r=new Random();
		int n=r.nextInt();
		System.out.println(n);
		double nd=r.nextDouble();
		System.out.println(nd);*/
		System.out.println(Math.random());
		String rand=RandomStringUtils.randomAlphanumeric(10);
		System.out.println(rand);

	}

}

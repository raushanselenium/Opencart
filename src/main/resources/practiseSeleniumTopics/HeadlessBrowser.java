package practiseSeleniumTopics;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HeadlessBrowser {

	public static void main(String[] args) {
		
		HtmlUnitDriver unitdriver= new HtmlUnitDriver(true);
		unitdriver.get("https://demoqa.com/");
		System.out.println(unitdriver.getTitle());
		

	}

}

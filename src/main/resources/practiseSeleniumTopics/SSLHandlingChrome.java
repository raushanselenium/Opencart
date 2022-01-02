package practiseSeleniumTopics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SSLHandlingChrome {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions handlingSSL=new ChromeOptions();
		handlingSSL.setAcceptInsecureCerts(true);
		WebDriver driver=new ChromeDriver(handlingSSL);
		driver.get("https://expired.badssl.com/");
		System.out.println("The page title is : " +driver.getTitle());
		//driver.quit();
	}

}

package practiseSeleniumTopics;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickAllLinks {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/open-source/demo/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions ac=new Actions(driver);
		List<WebElement> links=driver.findElements(By.xpath("//div[@class='row footer_links']//a"));
		System.out.println(links.size());
		for(WebElement link : links)
		{
			//String lnk=link.getText();
			//System.out.println(lnk);
			link.click();
		}
		/*Set<String> windowHandles=driver.getWindowHandles();
		for(String wid:windowHandles)
		{
			driver.switchTo().window(wid);
			String title=driver.switchTo().window(wid).getTitle();
			System.out.println(title);
		}*/

	}

}

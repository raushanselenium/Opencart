package practiseSeleniumTopics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchingWindows {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@href='#Tabbed']")).click();
		driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button")).click();
		//System.out.println(driver.getTitle());
		String parentWindow=driver.getWindowHandle();
		Set<String> s=driver.getWindowHandles();
		for(String i:s)
		{
			String t=driver.switchTo().window(i).getTitle();
			if(t.equalsIgnoreCase("Selenium"))
			{
				driver.close();
			}
		}
		driver.switchTo().window(parentWindow);
		driver.findElement(By.xpath("//a[@href='#Seperate']")).click();
		driver.findElement(By.xpath("//div[@id='Seperate']/button")).click();
		s=driver.getWindowHandles();
		for(String i:s)
		{
			String windowTitle=driver.switchTo().window(i).getTitle();
			System.out.println(windowTitle);
		}
		
		
		

	}

}

package practiseSeleniumTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HoverOver {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://demoqa.com/droppable/");
		Actions act=new Actions(driver);
		//WebElement item2=driver.findElement(By.xpath("//a[text()='Main Item 2']"));
		//act.moveToElement(item2).perform();
		WebElement from=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement to=driver.findElement(By.xpath("//div[@id='simpleDropContainer']//div[@id='droppable']"));
		Action dragAndDrop=act.clickAndHold(from).moveToElement(to).release(to).build();
		dragAndDrop.perform();

	}

}

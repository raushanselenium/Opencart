package practiseSeleniumTopics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HiddenElement {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://courses.letskodeit.com/practice");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement btnHide = driver.findElement(By.xpath("//input[@id='hide-textbox']"));
		WebElement btnShow = driver.findElement(By.xpath("//input[@id='show-textbox']"));
		WebElement txtBox = driver.findElement(By.xpath("//input[@id='displayed-text']"));
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].scrollIntoView();", txtBox);
		txtBox.sendKeys("Raushan");
		Thread.sleep(2000);
		btnHide.click();
		Thread.sleep(2000);
		btnShow.click();
		Thread.sleep(2000);
		txtBox.clear();
		Thread.sleep(2000);
		btnHide.click();
		Thread.sleep(2000);
		j.executeScript("document.getElementById('displayed-text').value='Selenium';");
		String s = (String) j.executeScript("return document.getElementById('displayed-text').value");
		System.out.print("Value entered in hidden field: " + s);
		btnShow.click();
		Thread.sleep(2000);
		

	}

}

package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordPage {
	
	WebDriver driver;
	
	public ForgotPasswordPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "input-email")
	WebElement txtEmail;
	
	@FindBy(xpath = "//input[@value='Continue']")
	WebElement btnContinue;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement confirmationMessage;
	
	public void setEmail(String email)
	{
		txtEmail.sendKeys(email);
	}
	
	public void clickContinue()
	{
		btnContinue.click();
	}
	
	public String getConfirmation()
	{
		try {
			return (confirmationMessage.getText());
		}
		catch(Exception e)
		{
			return (e.getMessage());
		}
	}
	
	

}

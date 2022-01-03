package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.ForgotPasswordPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC_004_ForgotPassword extends BaseClass {
	
	@Test
	public void test_forgot_password()
	{
		try 
		{
			logger.info("*****Started TC_004_ForgotPassword*****");
			driver.get(rb.getString("url"));
			logger.info("Home Page Displayed");
			driver.manage().window().maximize();
			logger.info("Window Maximized");

			HomePage hp = new HomePage(driver);
			hp.clickMyAccount();
			logger.info("Clicked on My Account link");
			hp.clickLogin();
			logger.info("Clicked on login link");
			
			LoginPage lp=new LoginPage(driver);
			lp.clickForgottenpassword();
			logger.info("Clicked on Forgot Password link");
			
			ForgotPasswordPage fpp=new ForgotPasswordPage(driver);
			fpp.setEmail(rb.getString("email"));
			logger.info("Entered email in Email field to send forget password link");
			fpp.clickContinue();
			logger.info("Clicked on continue button");
			String confMsg=fpp.getConfirmation();
			if(confMsg.equalsIgnoreCase("An email with a confirmation link has been sent your email address."))
			{
				Assert.assertTrue(true);
				logger.info("Forgot password Link sent successfully ");
			}
			else
			{
				captureScreen(driver, "test_forgot_password");
				logger.info("Screenshot capture for failed steps");
				Assert.assertTrue(false);
			}
		}
		catch(Exception e) {
			logger.fatal("Exception occured");
			Assert.fail();
		}
		
		logger.info("*****Finished TC_004_ForgotPassword*****");
	}

}

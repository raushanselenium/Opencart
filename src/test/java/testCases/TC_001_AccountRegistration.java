package testCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_001_AccountRegistration extends BaseClass {

	@Test(groups= {"regression","master"})
	public void test_Account_Registration() {
		
		try {
		logger.info("*****Started TC_001_AccountRegistration*****");
		driver.get(rb.getString("url"));
		logger.info("Home Page Displayed");
		driver.manage().window().maximize();
		logger.info("Window Maximized");

		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		logger.info("Clicked on My Account link");
		hp.clickRegister();
		logger.info("Clicked on Register link");

		AccountRegistrationPage regpage = new AccountRegistrationPage(driver);
		regpage.setFirstName("John");
		logger.info("Entered First Name");
		regpage.setLastName("Cena");
		logger.info("Entered Last Name");
		regpage.setEmail(randomeString() + "@gmail.com");
		logger.info("Entered Email");
		regpage.setTelephone(randomeNumber());
		logger.info("Entered Telephone Number");
		regpage.setPassword("abcxyz");
		logger.info("Entered Password");
		regpage.setConfirmPassword("abcxyz");
		logger.info("Entered Confirm Password");
		regpage.setPrivacyPolicy();
		logger.info("Checked Privacy policy");
		regpage.clickContinue();
		logger.info("Clicked Continue button");

		String confmsg = regpage.getConfirmationMsg();
		if (confmsg.equals("Your Account Has Been Created!")) {
			AssertJUnit.assertTrue(true);
			logger.info("Account  Successfully registered");
		} else {
			captureScreen(driver, "test_Account_Registration");
			logger.error("Account Registration Failed");
			AssertJUnit.assertTrue(false);
		}
		}
		catch(Exception e)
		{
			logger.error("Account Registration Failed");
			AssertJUnit.fail();
		}
		
		logger.info("*****Finished TC_001_AccountRegistration*****");
		

	}

}

package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC_002_Login extends BaseClass {

	@Test(groups= {"sanity","master"})
	public void test_login() {

		try {
			logger.info("*****Started TC_002_Login*****");
			driver.get(rb.getString("url"));
			logger.info("Home Page Displayed");
			driver.manage().window().maximize();
			logger.info("Window Maximized");

			HomePage hp = new HomePage(driver);
			hp.clickMyAccount();
			logger.info("Clicked on My Account link on Home page");
			hp.clickLogin();
			logger.info("Clicked on Login on Home Page");

			LoginPage lp = new LoginPage(driver);
			lp.setEmail(rb.getString("email"));
			logger.info("Entered email on Login Page");
			lp.setPassword(rb.getString("password"));
			logger.info("Entered Password on Login Page");
			lp.clickLogin();
			logger.info("Clicked login button on Login Page");

			boolean targetPage = lp.isMyAccountPageExist();
			if (targetPage) {
				logger.info("Login is successful");
				Assert.assertTrue(true);
			} else {
				logger.error("Login failed");
				captureScreen(driver, "test_login");
				Assert.assertTrue(false);
			}

		} catch (Exception e) {
			logger.fatal("Login failed");
			Assert.fail();
		}
		
		logger.info("Finished TC_002_Login");

	}

}

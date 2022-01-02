package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;
import utilities.ExcelDataProvider;
import utilities.XLUtility;

public class TC_003_LoginDDT extends BaseClass {
	
	@Test(dataProvider="LoginData",dataProviderClass = ExcelDataProvider.class)
	public void test_LoginDDT(String email,String pwd,String exp)
	{
		logger.info("*****Starting test_LoginDDT*****");
		System.out.println(email+" "+pwd+" "+exp);
		try {
			driver.get(rb.getString("url"));
			logger.info("Home Page is displayed");
			
			driver.manage().window().maximize();
			
			HomePage hp=new HomePage(driver);
			hp.clickMyAccount();
			logger.info("Clicked My Account");
			hp.clickLogin();
			logger.info("Clicked on Login");
			
			LoginPage lp=new LoginPage(driver);
			lp.setEmail(email);
			logger.info("Entered email");
			lp.setPassword(pwd);
			logger.info("Entered password");
			lp.clickLogin();
			logger.info("Clicked on login");
			
			boolean targetpage=lp.isMyAccountPageExist();
			
			if(exp.equals("Valid"))
			{
				if(targetpage==true)
				{
					logger.info("Login is successful");
					MyAccountPage map=new MyAccountPage(driver);
					hp.clickMyAccount();
					map.clickLogout();
					Assert.assertTrue(true);
				}
				else {
					captureScreen(driver, "test_LoginDDT");
					logger.error("Account Login Failed");
					Assert.assertTrue(false);		
				}
			}
			
			if(exp.equals("Invalid"))
			{
				if(targetpage==true)
				{
					MyAccountPage map=new MyAccountPage(driver);
					hp.clickMyAccount();
					map.clickLogout();
					Assert.assertTrue(false);
				}
				else {
					logger.info("Login is failed");
					Assert.assertTrue(true);		
				}
			}
		}
		catch(Exception e) {
			logger.fatal("Login Failed");
			Assert.fail();
		}
		
		logger.info("*****Finished test_LoginDDT*****");
	}
}

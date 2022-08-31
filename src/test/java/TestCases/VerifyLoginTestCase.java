package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObjectsModel.LoginPageObjects;
import resources.BaseClass;

public class VerifyLoginTestCase extends BaseClass  {
	
	@Test
	public void login() throws IOException
	{
		browserLaunch();
		driver.get("https://login.salesforce.com/?locale=in");
		
		LoginPageObjects lpo=new LoginPageObjects(driver);
		lpo.enterUsername().sendKeys("user");
		lpo.enterPassword().sendKeys("secure");
		lpo.clickLogin().click();
	}

}

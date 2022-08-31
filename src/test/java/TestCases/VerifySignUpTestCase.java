package TestCases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import PageObjectsModel.LoginPageObjects;
import PageObjectsModel.SignupPageObjects;
import resources.BaseClass;

public class VerifySignUpTestCase extends BaseClass {
	
	
	
	@Test
	public void signup() throws IOException
	{
		browserLaunch();
		driver.get("https://login.salesforce.com/?locale=in");
		LoginPageObjects lpo=new LoginPageObjects(driver);
		
		lpo.clickTryForFree().click();
		
		SignupPageObjects spo=new SignupPageObjects(driver);
		//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.);
		
		//wait.until(((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
		
		new WebDriverWait(driver, Duration.ofSeconds(10)).until(
			      driver -> ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete"));
		
		spo.enterFirstName().sendKeys("TestUser");
		
		Select select=new Select(spo.selectJobTitle());
		select.selectByIndex(1);
		
		
	}

}

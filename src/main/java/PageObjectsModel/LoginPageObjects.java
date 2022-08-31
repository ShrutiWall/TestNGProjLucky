package PageObjectsModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {
	
	private By username=By.id("username");
	private By password=By.id("password");
	private By login=By.id("Login");
	private By tryForFree=By.id("signup_link");
	
	WebDriver driver;
	
	public LoginPageObjects(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement enterUsername()
	{
		return driver.findElement(username);
	}
	
	public WebElement enterPassword()
	{
		return driver.findElement(password);
	}
	
	public WebElement clickLogin()
	{
		return driver.findElement(login);
	}

	public WebElement clickTryForFree()
	{
		return driver.findElement(tryForFree);
	}

}

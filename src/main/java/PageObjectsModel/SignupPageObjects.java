package PageObjectsModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignupPageObjects {
	
	public WebDriver driver;
	
	private By firstName=By.name("UserFirstName");
	private By jobTitle=By.name("UserTitle");
	
	public SignupPageObjects(WebDriver driver) {
		this.driver=driver;
	}

	public WebElement enterFirstName()
	{
		return driver.findElement(firstName);
	}
	
	public WebElement selectJobTitle()
	{
		return driver.findElement(jobTitle);
	}

}

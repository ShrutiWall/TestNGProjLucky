package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public  WebDriver driver;
	public WebDriver browserLaunch() throws IOException {
		  
		  //This will help us to read data.properties file
		  FileInputStream fis=new FileInputStream("F:\\technogeeks\\JavaPractice\\testngProjLucky\\src\\main\\java\\resources\\data.properties");
		  
		  // Thisn will access the data.properties
		  Properties prop=new Properties();
		  
		  prop.load(fis);
		  
		  String browserName =prop.getProperty("browser");
		  
		  if(browserName.equalsIgnoreCase("chrome") ) {
		 
			  System.setProperty("webdriver.chrome.driver", "F:\\technogeeks\\SeleniumPractice\\WebDrivers\\chromedriver_win32\\chromedriver.exe");
		      driver= new ChromeDriver();
		   
		  }else if(browserName.equalsIgnoreCase("firefox")) {
		   
		   //FireFox code
		  }
		         else if(browserName.equalsIgnoreCase("Edge")) {
		   
		   //edge code
		  }
		         else {
		          System.out.println("please select valid browser");
		         }
		  
		  return driver;
		  
		 }
	
	

}

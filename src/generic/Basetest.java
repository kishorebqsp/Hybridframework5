package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Basetest implements Constant {
	public WebDriver driver;
	@BeforeMethod
	public void open()
	{
			System.setProperty(key,value);
			 driver=new ChromeDriver();
			String url1 = Property.getpropertydata(propertyfilepath,"url");
			driver.get(url1);
		}
	
	@AfterMethod
	public void cloaseapp()
	{
		driver.close();
	}

}

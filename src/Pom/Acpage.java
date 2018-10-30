package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Acpage {

	@FindBy(xpath="(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")
	private WebElement ac;
	
	public Acpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public void acimg()
	{
		ac.click();
	}

}

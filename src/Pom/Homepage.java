package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	@FindBy(id="twotabsearchtextbox")
	private WebElement serachtb;
	
	@FindBy(xpath="//input[@value=\"Go\"]")
	private WebElement serachbtn;
	
	public Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void serachtxtbox(String product)
	{
		serachtb.sendKeys(product);
	}
	
	public void serachbutton()
	{
		serachbtn.click();
	}

}

package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	@FindBy(xpath="//span[.='Hello. Sign in']")
	private WebElement signinbtn;
	
	@FindBy(id="ap_email")
	private WebElement emailaddress;
	
	@FindBy(id="ap_password")
	private WebElement password;
	
	@FindBy(id="signInSubmit")
	private WebElement login;
	
	public Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public void siginbutton()
	{
		signinbtn.click();
	}
	public void emailaddresstxtbox(String name)
	{
		emailaddress.sendKeys(name);
	}
	
	public void passwordtxtbox(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void loginbtn()
	{
		login.click();
	}
}

package scripts;

import org.testng.annotations.Test;

import Pom.Acpage;
import Pom.Cartpage;
import Pom.Homepage;
import Pom.Loginpage;
import generic.Basetest;
import generic.Excel;
import generic.Property;

public class Validlogin extends Basetest{
	@Test
	public void validlogin() {
		Loginpage l=new Loginpage(driver);
		l.siginbutton();
		String name = Property.getpropertydata(propertyfilepath,"email");
		l.emailaddresstxtbox(name);
		String pass = Excel.getdata(excelpath,"Sheet1",1,1);
		l.passwordtxtbox(pass);
		l.loginbtn();
		
		Homepage h=new Homepage(driver);
		String product = Excel.getdata(excelpath,"Sheet1",1,2);
		h.serachtxtbox(product);
		h.serachbutton();
		
		Acpage a=new Acpage(driver);
		a.acimg();
		Cartpage c=new Cartpage(driver);
		c.cartbtn();
		
		
	}

}

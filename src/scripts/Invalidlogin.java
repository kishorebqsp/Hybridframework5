package scripts;

import org.testng.annotations.Test;

import Pom.Loginpage;
import generic.Basetest;
import generic.Excel;

public class Invalidlogin extends Basetest {
	@Test
	public void abc()
	{
		Loginpage l=new Loginpage(driver);
		l.siginbutton();
		String name = Excel.getdata("excelpath","Sheet1",1,0);
		l.emailaddresstxtbox(name);
	}

}

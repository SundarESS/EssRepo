package scripts;

import org.testng.annotations.Test;

import pages.LoginPage;

public class TestForgetMail extends BaseTest
{
	@Test
	public void testLoginPage()
	{
		LoginPage l=new LoginPage(driver);
		l.forgetpwd("abc@bbc.comm");
	}
	

}

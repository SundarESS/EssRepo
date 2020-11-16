package scripts;

import org.testng.annotations.Test;

import pages.AdminPage;
import pages.LoginPage;

public class TestAdmin extends BaseTest
{
	
	@Test(priority=2)
	public void testAdminPage()
	{
		LoginPage l=new LoginPage(driver);
		l.logineip("admin", "default");
		AdminPage p=new AdminPage(driver);
		p.adminprivileges();
		p.verifytitle();
	}
	
}

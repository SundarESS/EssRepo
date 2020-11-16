package scripts;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;

public class TestLogin extends BaseTest //Test99GuruLogin = TestLogin
{
	
   	    @Test
	    public void testLoginPage() 
	    {
	        //Create Login Page object
	    	LoginPage l = new LoginPage(driver);
	    	
	    	System.out.println("Title of the page is "+l.getLoginTitle(driver));
	    	//Verify login page title
	    	// 	Assert.assertTrue(title.contains("SPP Web Plug-in"));
	 
	    	//login to application
	    	l.logineip("admin", "default");

	    	// go the next page
//	    	objBasePage = new BasePage(driver);
//	    	objBasePage.
//	  
	    	//Verify home page
	    	//Assert.assertTrue(objHomePage.getHomePageDashboardUserName().contains("Dashboard"));
	    	
	    }
}
package scripts;
//edited this file
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest 
{
	public WebDriver driver;
	
	@BeforeMethod
	public void preCondition()
	{
		System.setProperty("webdriver.chrome.driver","D:/eclipse/Automation/ess/exes/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://localhost/v12_eip/login.php");
	}
	
	@AfterClass
	public void postCondition()
	{
		driver.close();
	}

}

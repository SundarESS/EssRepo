package scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testing {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","D:/eclipse/Automation/ess/exes/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://localhost/v12_eip/login.php");
		String title=driver.getTitle();
		System.out.println(title);
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("default");
		driver.findElement(By.id("btn-login")).click();
		System.out.println("Login Clicked");
		Thread.sleep(10000);
		String text=driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[2]/li/a/span")).getText();
		System.out.println(text);
		if(text.equals("Administrator"))
		{
			System.out.println("Home Page successful");
			String HomePagetitle=driver.getTitle();
			System.out.println(HomePagetitle);
		}
		driver.close();
	}

}

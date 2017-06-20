import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {

	 WebDriver driver;
	 
	@BeforeSuite
	public void setup()
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\u036axd\\Desktop\\Software\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
		  driver.manage().window().maximize();
		 driver.get("http://way2automation.com/");
		 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS); 
	}
	
	@Test
	public void doLogin() throws InterruptedException
	{
		 driver.findElement(By.xpath("//a[@href='http://www.way2automation.com/demo.html']")).click();;
		 Thread.sleep(2000);
		 driver.findElement(By.xpath(""));
		 
				
	}
	
	@AfterSuite
	public void TearDown()
	{
		driver.quit();
	}
	
	
}

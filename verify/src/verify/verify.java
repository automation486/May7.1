package verify;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class verify {
	
	@Test
	public void verifyTitle()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Waqas\\Desktop\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://foodcourt.myavactis.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[text()='Log In']"))).build().perform();
		//action.click();
		//driver.findElement(By.xpath("//a[text()='Log In']")).click();
		System.out.println(driver.getTitle());
		
	}

}

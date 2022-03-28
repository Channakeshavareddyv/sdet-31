package testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.Test;

public class ParameterTest {
	@Test
	public void parameter() {
		System.out.println(System.getProperty("browser"));
		String Browser = System.getProperty("browser");
		System.out.println(System.getProperty("url"));
		String Url = System.getProperty("url");
		System.out.println(System.getProperty("username"));
		String UserName=System.getProperty("username");
		System.out.println(System.getProperty("password"));
		String Password=System.getProperty("password");
		
		/*
		 * WebDriver driver=null;
		 * 
		 * if(Browser.equalsIgnoreCase("chrome")) { driver= new ChromeDriver(); }else
		 * if(Browser.equalsIgnoreCase("firefox")){ driver=new FirefoxDriver(); }else
		 * if(Browser.equalsIgnoreCase("opera")){ driver=new OperaDriver(); } else {
		 * System.out.println("support only two browser"); }
		 * driver.manage().window().maximize();
		 * driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 * driver.get(Url);
		 * 
		 * driver.findElement(By.name("user_name")).sendKeys(UserName);
		 * driver.findElement(By.name("user_password")).sendKeys(Password);
		 * driver.findElement(By.id("submitButton")).click();
		 * 
		 * Actions ac= new Actions(driver);
		 * ac.moveToElement(driver.findElement(By.xpath(
		 * "//img[@src='themes/softed/images/user.PNG']"))).perform();
		 * driver.findElement(By.linkText("Sign Out")).click(); driver.quit();
		 */
	}

}

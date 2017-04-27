package SeleniumDay1Learning;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InvalidLogNshoreAlertHandle {
private WebDriver driver;

@Before
public void setup() throws Exception
{
	//System.setProperty("webdriver.chrome.driver", "C:\\CMAP\\automation\\appium\\Appium\\node_modules\\appium\\node_modules\\appium-chromedriver\\chromedriver\\win\\chromedriver.exe");
 driver = new FirefoxDriver();
 //driver =  new ChromeDriver();

}

	@Test
	public void InvalidNshoreLogin() throws InterruptedException {
		 driver.get("https://nshore.hitachiconsulting.net/login/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);		 
		 WebElement Username = driver.findElement(By.id("txtLogin"));
		 Username.sendKeys("primmanapudi");
		 WebElement Password =  driver.findElement(By.id("txtPassword"));
		 Password.sendKeys("sony@w550");
		 driver.findElement(By.xpath(".//*[@id='frmLogin']/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr[1]/td[1]/div/a/img")).click();
	
	Alert InvalidLogin = driver.switchTo().alert();
	String Alerttext = InvalidLogin.getText();
	System.out.println("Alert Text:"+Alerttext);
	Thread.sleep(3000);
	InvalidLogin.dismiss();
	
	
	
	}

}
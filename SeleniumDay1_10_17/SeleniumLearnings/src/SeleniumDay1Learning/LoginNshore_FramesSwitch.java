package SeleniumDay1Learning;

import static org.junit.Assert.*;


import java.util.concurrent.TimeUnit;

import javax.swing.text.html.HTMLDocument.Iterator;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.jasper.tagplugins.jstl.core.Set;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.thoughtworks.selenium.webdriven.commands.WaitForPageToLoad;

public class LoginNshore_FramesSwitch {
private WebDriver driver;
	@Before
	public void setUp() throws Exception {
		//System.setProperty("webdriver.chrome.driver","C:\\CMAP\\automation\\appium\\Appium\\node_modules\\appium\\node_modules\\appium-chromedriver\\chromedriver\\win\\chromedriver.exe");
driver = new FirefoxDriver();
//driver = new ChromeDriver();
}

	
	@Test
	public void LogintoNshore() throws Exception {
	driver.get("https://nshore.hitachiconsulting.net/login/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	WebElement Username = driver.findElement(By.id("txtLogin"));
	Username.sendKeys("primmanapudi");
	WebElement Password = driver.findElement(By.id("txtPassword"));
	Password.sendKeys("sony@w550i");
	driver.findElement(By.xpath(".//*[@id='frmLogin']/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr[1]/td[1]/div/a/img")).click();
   //Get total Frames in the window and then click on the element
	//List<WebElement> TotalFrames = driver.findElements(By.tagName("frame"));
	//System.out.println("No.of frames :" + TotalFrames.size());
 	//System.out.println("Starts Here");
	//for(int i=0;i<TotalFrames.size();i++)
	//{
		//driver.switchTo().frame(i);
		//String newxPath = ".//*[@id='frmLink']/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a[2]";
       // int link = driver.findElements(By.xpath(newxPath)).size();
	   // System.out.println("link size:"+link);
	//if(link==1)
	//{
	//System.out.println("Element is Present in " + i +"frame");
	//	driver.findElement(By.xpath(newxPath)).click();
	//}
	
	//}
	//Without get the no.of frames iterating
	driver.switchTo().frame(0);
	driver.findElement(By.xpath(".//*[@id='frmLink']/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a[2]")).click();
	driver.switchTo().defaultContent();
}
	
@After
public void teardown() throws Exception {
	
//driver.quit();
	
}

}
 
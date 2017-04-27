package Utilities;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TakeScreenshots {
private static WebDriver driver;
	public static void main(String[] args) throws IOException {
	//Setting up Properties for Gecko driver and Chrome Driver
	//System.setProperty("webdriver.chrome.driver","D:\\Arjun\\Educational  stuff\\Selenium\\chromedriver.exe");
	//System.setProperty("webdriver.gecko.driver","D:\\Arjun\\Educational  stuff\\Selenium\\geckodriver.exe");
		
	// Creating an object of WebDriver Interface
	//WebDriver driver = new ChromeDriver();
		
	}driver = new FirefoxDriver();
	//With the help of driver instance maximizing the windows		
	driver.manage().window().maximize();
		
	//With the help of driver instance adding implicit time out in order to find the elements or object of screen
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	 //Passing URL through Get
	 driver.get("http://www.americangolf.co.uk/");

	 //Type Conversion
	TakesScreenshot TakeScreen = (TakesScreenshot) driver;
	 
	 //With the help Take screen reference variable we have used GetScreenShotsAs method which comes Take screen shot Interface 
	 File srcFile = TakeScreen.getScreenshotAs(OutputType.FILE);
	
	 //Destination Folder

	 File destFile = new File("C:\\Users\\v-poori\\Desktop\\PoornimaInterniewrelated\\Screenprints\\ScreenPrint.jpeg");
	 //Through file Utils we are copying source File to destination file
	 FileUtils.copyFile(srcFile, destFile);
		}

	}



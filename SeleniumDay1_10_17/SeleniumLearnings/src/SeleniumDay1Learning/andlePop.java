package SeleniumDay1Learning;

import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import Utilities.Handlepopup;
import Utilities.TakeScreenshots;
public class andlePop {
private WebDriver driver;

@Test
	public void HandlePopupmethod() {
		
	//System.setProperty("webdriver.chrome.driver","D:\\Arjun\\Educational  stuff\\Selenium\\chromedriver.exe");
			//System.setProperty("webdriver.gecko.driver","D:\\Arjun\\Educational  stuff\\Selenium\\geckodriver.exe");
			 driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		
		//Set is an interface which allows us to put all the similar 
		//items in a list/matrix so that we can use if futhre
		Set<String> Allwindow = driver.getWindowHandles();
		
		//Through size we are identifying how many windows got created/generated
		//via Driver instance
		System.out.println("Number of Total Windows"+Allwindow.size());
		
		// Using for each loop we are identifying ids of each windows
		// IDs will be auto generated by Selenium webdriver package
		for (String ids : Allwindow) {
	   System.out.println("Total Id's"+ids);
	  }
		
		//once we get windows we need to iterate it in order to use it 
		//one by one
		Iterator<String> itr = Allwindow.iterator(); 
	 	
		//Putting all items in string and using Next method to to store it in 
		//iterator
		String mainWindow = itr.next();
	    String popUpWindow = itr.next();
	    //Thread.sleep(3000);
	    
	    //Finally we are switching it pop up window
	    driver.switchTo().window(popUpWindow).close();
	    driver.switchTo().window(mainWindow);
	 	}
	}


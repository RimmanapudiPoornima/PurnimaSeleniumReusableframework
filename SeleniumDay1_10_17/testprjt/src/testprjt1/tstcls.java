package testprjt1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class tstcls {
	private static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
			// TODO Auto-generated method stub
	//System.setProperty("webdriver.gecko.driver", "C:\\Users\\v-poori\\Desktop\\selenium\\geckodriver-v0.11.1-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.youtube.com/");
	}

}
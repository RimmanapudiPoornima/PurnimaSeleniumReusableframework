package JunitTestmethods;


import java.awt.Robot; 

import java.awt.event.KeyEvent; 

import org.junit.After; 

import org.junit.Before; 

import org.junit.Test; 

import org.openqa.selenium.By; 

import org.openqa.selenium.WebDriver; 

import org.openqa.selenium.firefox.FirefoxDriver; 


public class gmailcompose { 

WebDriver driver; 

 
@Before 

public void setUp() 

{ 

driver=new FirefoxDriver(); 

driver.get("https://gmail.com"); 

driver.manage().window().maximize(); 

} 

@Test 

public void testWindowAlert() throws Exception{ 

driver.findElement(By.id("Email")).sendKeys("purnima700@gmail.com"); 
driver.findElement(By.xpath(".//*[@id='next']")).click();

driver.findElement(By.id("Passwd")).sendKeys("rithu@purnima"); 


driver.findElement(By.id("signIn")).click(); 

Thread.sleep(30000); 

driver.findElement(By.xpath("//div[@class='z0']//div[contains(text(),'COMPOSE')]")).click(); 

driver.findElement(By.xpath("//div[contains(@command,'Files')]//div[contains(@class,'aaA')]")).click(); 

Robot rb =new Robot(); 

rb.keyPress(KeyEvent.VK_D); 

rb.keyRelease(KeyEvent.VK_D); 

Thread.sleep(2000); 

rb.keyPress(KeyEvent.VK_SHIFT); 

rb.keyPress(KeyEvent.VK_SEMICOLON); 

rb.keyRelease(KeyEvent.VK_SEMICOLON); 

rb.keyRelease(KeyEvent.VK_SHIFT); 

rb.keyPress(KeyEvent.VK_BACK_SLASH); 
 
rb.keyRelease(KeyEvent.VK_BACK_SLASH); 

Thread.sleep(2000); 

rb.keyPress(KeyEvent.VK_P); 

rb.keyRelease(KeyEvent.VK_P); 

rb.keyPress(KeyEvent.VK_I); 
 
rb.keyRelease(KeyEvent.VK_I); 

rb.keyPress(KeyEvent.VK_C); 

rb.keyRelease(KeyEvent.VK_C); 

Thread.sleep(2000); 


rb.keyPress(KeyEvent.VK_ENTER); 

rb.keyRelease(KeyEvent.VK_ENTER); 
 
Thread.sleep(2000); 

} 

@After 

public void tearDown() 
 
{
driver.quit(); 


} 




} 

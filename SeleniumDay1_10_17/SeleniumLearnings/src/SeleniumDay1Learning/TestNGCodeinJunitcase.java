package SeleniumDay1Learning;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class TestNGCodeinJunitcase {

	@BeforeMethod
	public void Bmethod()

	{
		
		System.out.println("BMethod");
	}
	@BeforeClass
	public void BClass()

	{
		
		System.out.println("BClass");
	}@AfterMethod
	public void Amethod()

	{
		
		System.out.println("Amethod");
	}@BeforeSuite
	public void BSuite()

	{
		
		System.out.println("BSuite");
	}@AfterClass
	public void Aclass()

	{
		
		System.out.println("Aclass");
	}
	@AfterSuite
	public void ASuite()

	{
		
		System.out.println("ASuite");
	}	
	@Test
	public void test1(){
		
		System.out.println("In Test1..");
	}
	@Test
	public void test2(){
		System.out.println("In Test2..");
	}
	
	@Test
	public void testmethod1(){
		
		System.out.println("TO test");
	}
		

}

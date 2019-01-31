package testScript;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import library.BaseTest;
import pom.MintMPOM;

public class Test1 extends BaseTest {
	
	public MintMPOM mintmpom;
	
	@Test
	public void test1()
	{	
	mintmpom=new MintMPOM(driver);
	mintmpom.emailTxBx("shivamrai10jan@gmail.com");
	mintmpom.passTxBx("10011996");
	mintmpom.submitBtn();
	driver.findElement(By.xpath("//a[@id='skipBtn']")).click();
	driver.findElement(By.xpath("//a[@class='dropdown-toggle text-white']")).click();
	driver.findElement(By.linkText("Logout")).click();
	
	
	//*********************************VERIFY CURRENT CLICK********************************************//
	mintmpom.imageclick();
	String acturl = driver.getCurrentUrl();
	System.out.println(acturl);
	String prefix="http://test";
	if(acturl.startsWith(prefix))
	{
	System.out.println("URL IS SAME");
	}
	System.out.println("URL IS NOT SAME");
}
}
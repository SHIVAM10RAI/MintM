package library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;



public class BaseTest implements Constant  {
	
	public WebDriver driver;
	//public WebDriverManager manager;
	
	@BeforeMethod
    public void openBrowser() 
	{
	System.setProperty(CHROME_KEY,CHROME_PATH);
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get(Test_URL);
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();

     }
	
	@AfterMethod
    public void closeBrowser() 
    {
		if (driver!=null)
		{
			driver.quit();
		}
    }
}

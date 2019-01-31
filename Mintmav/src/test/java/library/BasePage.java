package library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class BasePage {

	public WebDriver driver;       //Declaring Variable
	public WebDriverWait wait;     //Declaring Variable
	
	public BasePage(WebDriver driver)
	{
	PageFactory.initElements(driver, this);	
	wait=new WebDriverWait(driver, 30);
    }

}

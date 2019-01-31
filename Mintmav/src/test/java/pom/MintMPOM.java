package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import library.BasePage;

public class MintMPOM  extends BasePage{
	
	public MintMPOM(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//input[@type='email']")
		private WebElement emailTxBx;
	    public WebElement emailTxBx(String email) {
	    emailTxBx.sendKeys(email);
		return emailTxBx;
	}
	    @FindBy(xpath="//input[@type='password']")
		private WebElement passTxBx;
	    public WebElement passTxBx(String pass) {
	    passTxBx.sendKeys(pass);
		return emailTxBx;
	    }
	    @FindBy(xpath="//input[@value='Sign in']")
		private WebElement submitBtn;
	    public WebElement submitBtn() {
	    submitBtn.click();
		return submitBtn;
	    }
	    @FindBy(xpath="//img[@class='navbar-brand logo img img-responsive']")
	    private WebElement imageclick;
	    public WebElement imageclick() {
	    	imageclick.click();
	    	return imageclick;
	    	
	    }
	
}

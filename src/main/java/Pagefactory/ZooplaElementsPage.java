package Pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ca.basepage.SuperClass;

public class ZooplaElementsPage extends SuperClass {



   public ZooplaElementsPage()  {
	    PageFactory.initElements(driver, this);
}

  // @FindBy(xpath = "(//*[text()='Sign in'])[2]")
	//@CacheLookup
	//private WebElement clickSingButton;

	//@FindBy(id = "input-email-address")
	//@CacheLookup
	//private WebElement enterUserName;

	//@FindBy(id = "input-password")
	//@CacheLookup
	//private WebElement enterPassword;

	//@FindBy(xpath = "(//*[text()='Sign in'])[5]")
	//@CacheLookup
	//private WebElement clickLogginButton;

	
	//public WebElement getClickSingButton() {
	//	return clickSingButton;
	//}

	//public WebElement getEnterUserName() {
	//	return enterUserName;
	//}

	//public WebElement getEnterPassword() {
	//	return enterPassword;
	//}

	//public WebElement getClickLogginButton() {
		//return clickLogginButton;
	//}

//}

 
   @FindBy(xpath = "(//*[text()='Sign in'])[2])")
   @CacheLookup
   private WebElement clickSigninButton;
   
   
   @FindBy(id ="input-email-address")
   @CacheLookup
   private WebElement enterusername;

    @FindBy(id="input-password")
   @CacheLookup
   private WebElement enterpassword;
    
    
    @FindBy(xpath = "(//*[text()='Sign in'])[5]")
    @CacheLookup
    private WebElement ClickingSigninButton;


	public WebElement getClickSigninButton() {
		return clickSigninButton;
	}


	public WebElement getEnterusername() {
		return enterusername;
	}


	public WebElement getEnterpassword() {
		return enterpassword;
	}


	public WebElement getClickingSigninButton() {
		return ClickingSigninButton;
	}











}
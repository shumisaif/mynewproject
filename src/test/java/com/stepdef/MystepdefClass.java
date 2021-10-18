package com.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.ca.basepage.SuperClass;

import Pagefactory.ZooplaElementsPage;
import io.cucumber.java.en.*;

public class MystepdefClass extends SuperClass {
             ZooplaElementsPage pf;
             WebDriver driver;

	@Given("User can open any browser")
	public void user_can_open_any_browser() {
		
		pf = PageFactory.initElements(driver,ZooplaElementsPage.class);
		
		
		//system property for chrome driver
		System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver");
		//initiate chromedriver class
				 driver = new ChromeDriver();//up casting
	}  
	   
	@Given("User able to enter {string} url")
	public void user_able_to_enter_url(String url) {
	  driver.get("https://www.zoopla.co.uk/"); 
	   
	}

	@When("User able to click on the signin  button")
	public void user_able_to_click_on_the_signin_button() {
	 driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div/div/header/div/div/div[1]/div[2]/ul/li[4]/a/div/p")).click();  
	   
	}

	@When("User enter the userName {string} and password {string}")
	public void user_enter_the_user_name_and_password(String username, String password) {
		
		//pf.getEnterUserName().sendKeys(username);
		
		//pf.getEnterPassword().sendKeys(password);
		//basic step and then have to add webElement
		//driver.findElement(By.id("input-email-address")).sendKeys(username);
		//driver.findElement(By.id("input-password")).sendKeys(password);
		
		WebElement userN = driver.findElement(By.id("input-email-address")); 
	 userN.sendKeys(username);
	 WebElement password1 = driver.findElement(By.id("input-password"));
	 password1.sendKeys(password);
	}

	@When("User click on the signing button")
	public void user_click_on_the_signing_button() {
		//1 way
		pf.getClickingSigninButton().click();
	 // driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div/form/button")).click(); 
		
		//2nd way
	  WebElement element =  driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div/form/button"));
	  element.click();
	
	// 3rd way
	  WebElement element1 = driver.findElement(By.xpath(""));
	  Actions action = new Actions(driver);
	  action.moveToElement(element1).click().build().perform();
	}

	@Then("User able to verify successfully login & verify the homepage title")
	public void user_able_to_verify_successfully_login_verify_the_homepage_title() throws InterruptedException {
		//two way we can verify the title page one is if else condition 
		//and another one is assertion.
		String actual = "MyZoopla - Zoopla";
		
		if(driver.getPageSource().contains("Incorrect email or password. Please check and try again")) {
		driver.close();
		Assert.assertTrue(false);
		}
		else {
			Thread.sleep(2000);
			Assert.assertEquals(actual, driver.getTitle());
			System.out.println("My Expected result is"+ driver.getTitle());
		
		}
		
		
		
		
		
		//String title= "MyZoopla - Zoopla";
		
		//Assert.assertEquals(title, driver.getTitle());
		//System.out.println(driver.getTitle());
	   
	}
	  
	   
	}


























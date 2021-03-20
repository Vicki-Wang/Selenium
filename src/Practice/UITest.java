package Practice;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UITest {

/*	
	public static void main(String[] args) {
		 
		 System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			 String baseUrl = "https://www.facebook.com";
		        String expectedTitle = "Welcome: Mercury Tours";
		        String actualTitle = "";

		        // launch Fire fox and direct it to the Base URL
		        driver.get(baseUrl);
		        
		        SignInPage signInPage = new SignInPage(driver);
	    HomePage homePage = signInPage.loginValidUser("+8613501896650", "11015wamech@");
	    System.out.println(homePage.getMessageText());
		        
	 
	 }*/
	
		@Test
	  public void testLogin() {
		 System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			 String baseUrl = "https://www.facebook.com";

		        // launch Fire fox and direct it to the Base URL
		        driver.get(baseUrl);
	
	    SignInPage signInPage = new SignInPage(driver);
	    HomePage homePage = signInPage.loginValidUser("+8613501896650", "11015wamech@");
	    assertEquals(homePage.getMessageText(), "首页");
	  }

}

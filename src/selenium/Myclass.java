package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Myclass {
	
	 public static void main(String[] args) {
	        // declaration and instantiation of objects/variables
	    	/*System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();*/
			//comment the above 2 lines and uncomment below 2 lines to use Chrome
			System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
	    	
	        String baseUrl = "http://demo.guru99.com/test/newtours/";
	        String expectedTitle = "Welcome: Mercury Tours";
	        String actualTitle = "";

	        // launch Fire fox and direct it to the Base URL
	        driver.get(baseUrl);
	        /*
	        // get the actual value of the title
	        actualTitle = driver.getTitle();

	        
	         * compare the actual title of the page with the expected one and print
	         * the result as "Passed" or "Failed"
	         
	        if (actualTitle.contentEquals(expectedTitle)){
	            System.out.println("Test Passed!");
	        } else {
	            System.out.println("Test Failed");
	        }
	       
	        //close Fire fox
	        driver.close();
	        
	        */
	        //GUI
	        /*String baseUrl = "http://www.facebook.com";
	        String tagName = "";
	        
	        driver.get(baseUrl);
	        tagName = driver.findElement(By.id("email")).getTagName();
	        System.out.println(tagName);
	        driver.close();
	        System.exit(0);*/
	        
			//switchFrame
	        /*driver.get("http://demo.guru99.com/selenium/deprecated.html");
	        driver.switchTo().frame("classFrame");
	        driver.findElement(By.linkText("Deprecated")).click();
	        driver.close();*/
			
			//alert
			/*String alertMessage = "";

	        driver.get("http://jsbin.com/usidix/1");
	        driver.findElement(By.cssSelector("input[value=\"Go!\"]")).click();
	        alertMessage = driver.switchTo().alert().getText();
	        driver.switchTo().alert().accept();
	       
	        System.out.println(alertMessage);
	        driver.quit();*/
			
			//explicit wait
			WebDriverWait myWaitVar = new WebDriverWait(driver,10);
			try{
				myWaitVar.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
			}catch(TimeoutException toe){
				toe.printStackTrace();
			}
			
			WebElement txtbox_username = driver.findElement(By.id("username"));
			try{
				if(txtbox_username.isEnabled()){
					txtbox_username.sendKeys("tutorial");
				}
			}	
			catch(NoSuchElementException nsee){
	            System.out.println(nsee.toString());
			}
	       
	    }

}

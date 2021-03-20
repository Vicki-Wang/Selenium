package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	  protected WebDriver driver;

	  // <h1>Hello userName</h1>
	  private By messageBy = By.tagName("h1");
	  private By spanBy = By.xpath("//span[contains(@class='a8c37x1j')]");

	  public HomePage(WebDriver driver){
	    this.driver = driver;
	    if (!driver.getTitle().equals("Facebook")) {
	      throw new IllegalStateException("This is not Home Page of logged in user," +
	            " current page is: " + driver.getCurrentUrl()+" Title is:"+driver.getTitle());
	    }
	  }

	  /**
	    * Get message (h1 tag)
	    *
	    * @return String message text
	    */
	  public String getMessageText() {
	    return driver.findElement(messageBy).getText();
	  }

	  public HomePage manageProfile() {
	    // Page encapsulation to manage profile functionality
	    return new HomePage(driver);
	  }
	  /* More methods offering the services represented by Home Page
	  of Logged User. These methods in turn might return more Page Objects
	  for example click on Compose mail button could return ComposeMail class object */

}

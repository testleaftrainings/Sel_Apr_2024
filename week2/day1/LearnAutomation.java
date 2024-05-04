package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAutomation {
	
	/* Basic Locators:
	 *   id, name, classname, linkText, partialLinkText
	 * findElement() -> Find the first WebElement using the given method
	 * returns -> The first matching element on the current page
	 * The return type of findElement() -> WebElement
	 * to type on a textfield / input box -> sendKeys()
	 * to perform click action -> click()
	 * 
	 */
	public static void main(String[] args) {
		
		// Launch the chrome browser
		ChromeDriver driver = new ChromeDriver();
		
		// Load the url -> get() -> Load a new web page in the current browser window
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		// to maximize the window
		driver.manage().window().maximize();
		
		// Locate the username text field
		WebElement eleUsername = driver.findElement(By.id("username"));
		
		// perform the action on the WebELement
		eleUsername.sendKeys("Demosalesmanager");
		
		// enter the password in the password field
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		// Click on the Login button
		driver.findElement(By.className("decorativeSubmit")).click();
			
		
		//to get the title -> getTitle() -> Get the title of the current page. 
		System.out.println(driver.getTitle());
		
		// to close the browser -> close() -> Close the current window
		//driver.close();
		
	}

}

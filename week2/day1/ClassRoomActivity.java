package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassRoomActivity {
	
	public static void main(String[] args) {
		
		// Launch the chrome browser
		ChromeDriver driver = new ChromeDriver();
		// Load the url -> get() -> Load a new web page in the current browser window
		driver.get("https://www.facebook.com/");
		// to maximize the window
		driver.manage().window().maximize();
		// enter the email id
		driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		// enter the password
		driver.findElement(By.id("pass")).sendKeys("Tuna@321");
		// click on the login button
		driver.findElement(By.name("login")).click();
		// click find your account and log in
		driver.findElement(By.linkText("Find your account and log in.")).click();
		// verify the title
		System.out.println(driver.getTitle());
		
		
	}

}

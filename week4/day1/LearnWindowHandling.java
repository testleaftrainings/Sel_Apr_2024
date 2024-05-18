package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandling {
	
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//to get the address of the current window
		String pWindowHandle = driver.getWindowHandle();
		System.out.println("Parent window handle: "+pWindowHandle);
		// get the title of the parent window
		String pTitle = driver.getTitle();
		System.out.println("Parent Title : "+pTitle);
		//click open button
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		//get all the window handles -> A set of window handles which can be used to iterate over all open windows.
		Set<String> windowHandles = driver.getWindowHandles();
		// Convert Set into list
		List<String> list = new ArrayList<>(windowHandles);
		// to switch to the window
		driver.switchTo().window(list.get(1));
		// get the title of the child window
		String cTitle = driver.getTitle();
		System.out.println("child title : "+cTitle);
		// verify
		if (!pTitle.equals(cTitle)) {
			System.out.println("Control has been switched to the new window");
		}
		else {
			System.out.println("Control stays in the same window");
		}
		//Quits this driver, closing every associated window
		driver.quit();
		
		
	}

}

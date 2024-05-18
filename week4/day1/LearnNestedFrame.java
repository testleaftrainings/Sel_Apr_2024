package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnNestedFrame {
	/*
	 * Frame1
	 *  click()
	 *   Frame2
	 *     click()
	 */
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/frame.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//switch to the parent frame using index
		driver.switchTo().frame(2);
		//switch to the nested frame by using id/name
		driver.switchTo().frame("frame2");
		// click the click me button
		driver.findElement(By.id("Click")).click();
		driver.switchTo().parentFrame();
		
	}

}

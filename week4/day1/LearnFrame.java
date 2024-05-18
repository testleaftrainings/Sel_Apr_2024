package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {
	/*
	 * NoSuchElementException
	 *  3 quick checks
	 *  -> Whether you have located the element properly
	 *  -> Whether you have applied implicit wait
	 *  -> Check whether is inside a frame or not
	 * NoSuchFrameException 
	 */
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/frame.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// switch to the frame by using index
		//driver.switchTo().frame(0);
		// switch to the frame by using webelement
		WebElement frameEle = driver.findElement(By.xpath("(//h5[contains(text(),' Click Me (Inside frame)')]/following::iframe)[1]"));
		driver.switchTo().frame(frameEle);
		// click clickme button
		driver.findElement(By.id("Click")).click();
		driver.switchTo().defaultContent();
		//switch to the parent frame using index
		driver.switchTo().frame(2);
		//switch to the nested frame by using id/name
		driver.switchTo().frame("frame2");
		// click the click me button
		driver.findElement(By.id("Click")).click();
	}

}

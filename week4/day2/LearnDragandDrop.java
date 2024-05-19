package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnDragandDrop {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    //switch to the frame using index
		driver.switchTo().frame(0);
		//locate the source element
		WebElement sourceEle = driver.findElement(By.id("draggable"));
		//locate the target element
		WebElement targetEle = driver.findElement(By.id("droppable"));
		//Instantiate the Actions class
		Actions act = new Actions(driver);
		// call the draganddrop()
		act.dragAndDrop(sourceEle, targetEle).perform();
				
	}
}

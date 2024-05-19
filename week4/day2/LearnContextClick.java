package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnContextClick {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// locate the right click me button
		WebElement eleRightClick = driver.findElement(By.xpath("//span[contains(@class,'context-menu')]"));
		// Instantiate the actions class
		Actions act = new Actions(driver);
		// Call contextClick() to perform rightclick action
		act.contextClick(eleRightClick).perform();
		driver.findElement(By.xpath("//span[text()='Edit']")).click();
		driver.switchTo().alert().accept();
	}
}

package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnClickandHold {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.switchTo().frame(0);
		WebElement eleItem1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
		WebElement eleItem2 = driver.findElement(By.xpath("//li[text()='Item 2']"));
		WebElement eleItem3 = driver.findElement(By.xpath("//li[text()='Item 3']"));
		WebElement eleItem5 = driver.findElement(By.xpath("//li[text()='Item 5']"));
		Actions builder = new Actions(driver);
//		builder.clickAndHold(eleItem1).perform();
//		builder.clickAndHold(eleItem2).perform();
		
		builder.keyDown(Keys.CONTROL).click(eleItem2).click(eleItem3).click(eleItem5).keyUp(Keys.CONTROL)
		.perform();
		builder.clickAndHold(eleItem2).moveToElement(eleItem5).release().perform();
		
		
	}
}

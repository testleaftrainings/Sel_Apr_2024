package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSimpleAlert {
	/*
	 * TargetLocator -> Interface
	 * RemoteTargetLocator -> Implementation class of TargetLocator
	 * Alert -> Interface
	 * Methods of Alert -> accept(); dismiss(); sendkeys(); getText();
	 * RemoteAlert -> Implementation class of Alert Interface 
	 * Exception:
	 * NoAlertPresentException
	 * UnhandledAlertException
	 */
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//click show button
		driver.findElement(By.xpath("//span[text()='Show']")).click();
		//switch the driver focus to the alert
		Alert simpleAlert = driver.switchTo().alert();
		// read the text of the alert
		String alertMsg = simpleAlert.getText();
		System.out.println("ALert Message : "+alertMsg);
		// accept the alert
		simpleAlert.accept();
		// verify 
		String text = driver.findElement(By.id("simple_result")).getText();
		System.out.println(text);
	}

}

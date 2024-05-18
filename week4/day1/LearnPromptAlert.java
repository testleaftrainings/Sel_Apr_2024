package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnPromptAlert {
	
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//click show button
		driver.findElement(By.xpath("//h5[contains(text(),' Alert (Prompt Dialog)')]/following::span")).click();
		//switch the driver focus to the alert
		Alert promptAlert = driver.switchTo().alert();
		//read the alert text
		String alertMsg = promptAlert.getText();
		System.out.println("Alert Message : "+alertMsg);
		// pass input to the alert box
		promptAlert.sendKeys("Subraja");
		// cancel the alert
		promptAlert.accept();
		// verify
		String text = driver.findElement(By.id("confirm_result")).getText();
		if (text.contains("Subraja")) {
			System.out.println("Alert is accepted");
		}
		else {
			System.out.println("Not accepted");
		}
	}

}

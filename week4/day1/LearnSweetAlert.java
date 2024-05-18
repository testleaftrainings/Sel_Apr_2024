package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSweetAlert {
	
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//click show button
		driver.findElement(By.xpath("//h5[contains(text(),'Sweet Alert')]/following::span")).click();
		// click dismiss button
		driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
		
	}

}

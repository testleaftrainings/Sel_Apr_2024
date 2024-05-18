package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassroomActivity {
	
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// switch to the frame by using id/name
		//driver.switchTo().frame("iframeResult");
		// switch to the frame by passing webelement
		WebElement frameEle = driver.findElement(By.xpath("//div[@id='iframewrapper']/iframe"));
		driver.switchTo().frame(frameEle);
		// click tryit button
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		// switch to the alert
		Alert alert = driver.switchTo().alert();
		// read the alert msg
		String text = alert.getText();
		System.out.println("Alert msg: "+text);
		// accept the alert
		alert.accept();
		//verify
		String verifyMsg = driver.findElement(By.id("demo")).getText();
		if (verifyMsg.contains("OK")) {
			System.out.println("Alert is accepted");
		}else {
			System.out.println("Alert is not accepted");
		}

		
	}

}

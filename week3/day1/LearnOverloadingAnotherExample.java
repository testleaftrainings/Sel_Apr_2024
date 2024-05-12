package week3.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LearnOverloadingAnotherExample {
	public RemoteWebDriver driver;
	
	/**
	 * This method should launch Chrome browser
	 */
	public void startApp() {
		driver = new ChromeDriver();
	}
	
	/**
	 * This method should launch any browser specific to the input provided
	 */
	public void startApp(String browser) {
		if (browser.equals("edge")) {
			driver = new EdgeDriver();
		}
		else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		
	}
	
	public static void main(String[] args) {
		LearnOverloadingAnotherExample lo = new LearnOverloadingAnotherExample();
		lo.startApp("edge");
	}
	
	

}

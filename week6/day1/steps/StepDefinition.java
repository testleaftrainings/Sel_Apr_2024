package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	
	public  ChromeDriver driver;

	@Given("Launch the browser")
	public void launch_the_browser() {
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  driver.manage().window().maximize();
	}

	@Given("Load the url")
	public void load_the_url() {
	   driver.get("http://leaftaps.com/opentaps/control/main");
	}

	@Given("Enter the username as Demosalesmanager and password as crmsfa")
	public void enterCredentials() {
	   driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	   driver.findElement(By.id("password")).sendKeys("crmsfa");
	}

	@When("Click on the Login button")
	public void click_on_the_login_button() {
	   driver.findElement(By.className("decorativeSubmit")).click();
	}

	@Then("HomePage should be displayed")
	public void home_page_should_be_displayed() {
		String title = driver.getTitle();
		if (title.contains("Leaftaps")) {
			System.out.println("HomePage is verified");
		}
		else {
			System.out.println("HomePage is not verified");
		}
		
	   
	}
}

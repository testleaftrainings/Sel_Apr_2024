package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findlinks {

	public static void main(String[] args) {
		
		/*
		 * findElements() -> to find multiple matching webelements
		 * returns -> A list of all matching WebElements, or an empty list if nothing matches
		 */
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//to find all hyperlinks
		List<WebElement> allLinkList = driver.findElements(By.tagName("a"));
		//to find the size of all links displayed
		System.out.println("The total no: of links : "+ allLinkList.size());
		// to get the 3rd WebElement in this list
		WebElement ele = allLinkList.get(3);
		System.out.println(ele.getText());
		// declare a list
		List<String> list = new ArrayList<>();
		//to print all the items
//		for (int i = 0; i < allLinkList.size(); i++) {
//			String text = allLinkList.get(i).getText();
//			list.add(text);
//		}
		
		for (WebElement each : allLinkList) {
			String text = each.getText();
			list.add(text);
		}
		
		
		Collections.sort(list);
		System.out.println(list);
		
	}

}

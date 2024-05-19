package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTable {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/table.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// locate the table
		WebElement table = driver.findElement(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody"));
		// print rowCount
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		System.out.println("The rowcount is : "+ rows.size());
		//print columncount
		List<WebElement> columns = driver.findElements(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]//th"));
		System.out.println("The columncount is : "+columns.size());
		// print a particular data
		String text = driver.findElement(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr[3]/td[2]")).getText();
		System.out.println("The country name is : "+ text);
		// print datas from a single row
		List<WebElement> rowList = driver.findElements(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr[3]/td"));
		for (WebElement eachEle : rowList) {
			System.out.println(eachEle.getText());
		}
        //print datas from a single column
		List<WebElement> columnList = driver.findElements(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr/td[2]"));
		for (WebElement eachColumnEle : columnList) {
			System.out.println(eachColumnEle.getText());
		}
		//print all datas
		List<WebElement> allDatas = driver.findElements(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr/td"));
//		for (WebElement eachData : allDatas) {
//			System.out.println(eachData.getText());
//		}
		
		for (int i = 1; i <=rows.size(); i++) {
			WebElement eachRow = driver.findElement(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr["+i+"]/td"));
			for (int j = 1; j <=columns.size(); j++) {
				WebElement datas = eachRow.findElement(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr["+i+"]/td["+j+"]"));
				System.out.println(datas.getText());
			}
		}
		
		







	}
}

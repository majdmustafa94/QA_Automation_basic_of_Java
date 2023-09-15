package a5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A5_Class {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Majd Mustafa\\OneDrive\\Desktop\\chromedriver\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://127.0.0.1:5500/index.html");

		String myTitle = driver.getTitle();
		System.out.println(myTitle);

//		String myTag = driver.findElement(By.tagName("option")).getText();
//		System.out.println(myTag);
//
//		String myTags = driver.findElements(By.tagName("option")).get(2).getText();
//		System.out.println(myTags);
		
		List<WebElement> myOptions= driver.findElements(By.tagName("option"));
		System.out.println(myOptions.size());
		
		for(int i=0;i<myOptions.size();i++) {
			System.out.println(myOptions.get(i).getText());
		}
		

	}

}

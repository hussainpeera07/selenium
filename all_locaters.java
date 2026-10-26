package youtub_classes_practice_besics;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class all_locaters {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	Thread.sleep(2000);
	//by id
	driver.findElement(By.id("name")).sendKeys("hussain peera");
	Thread.sleep(2000);
	driver.findElement(By.id("email")).sendKeys("hussain");
	driver.findElement(By.id("phone")).sendKeys("7674082059");
	driver.findElement(By.id("textarea")).sendKeys("automation practice");
	driver.findElement(By.id("male")).click();
	//by class name
	driver.findElement(By.className("wikipedia-search-input")).sendKeys("hi friends");
	//by name
	driver.findElement(By.name("start")).click();
	//by link test
	driver.findElement(By.linkText("Online Trainings")).click();
	driver.navigate().back();
	//by par link text
	driver.findElement(By.partialLinkText("Online Tr")).click();
	driver.navigate().back();
	driver.quit();
	
	}
}

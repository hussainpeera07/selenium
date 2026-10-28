package youtub_classes_practice_besics;

import java.time.Duration;

import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class handling_alerts {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	driver.get("https://www.selenium.dev/selenium/web/alerts.html#");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//*[@id=\"alert\"]")).click();
	String ggg = driver.switchTo().alert().getText();
	if(ggg.equals("cheese"))
	{
		System.out.println("true");
	}
	Thread.sleep(2000);
	driver.switchTo().alert().accept();
	//conformation alert
	driver.findElement(By.xpath("//*[@id=\"confirm\"]")).click();
	Thread.sleep(2000);
	String text = driver.switchTo().alert().getText();
	
	System.out.println(text);
driver.switchTo().alert().dismiss();
//prompt alert
driver.findElement(By.xpath("//*[@id=\"prompt\"]")).click();
Alert prompt = driver.switchTo().alert();
prompt.sendKeys("im ok");
prompt.dismiss();
//handiling alert without switchto

driver.findElement(By.xpath("//*[@id=\"confirm\"]")).click();
Thread.sleep(2000);
Alert box = wait.until(ExpectedConditions.alertIsPresent());
box.accept();
//handiling authentication
driver.get("https://admin:admin@practice.expandtesting.com/basic-auth?utm_source=chatgpt.com");

}

}
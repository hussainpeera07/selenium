package youtub_classes_practice_besics;

import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class all_besics {
	public static void main(String[] args) throws InterruptedException {
	 WebDriver driver =new ChromeDriver();
	 driver.get("https://demoapps.qspiders.com/");
	 driver.manage().window().maximize();
	System.out.println(driver.getPageSource());
String url = driver.getCurrentUrl();
if(url.equals("https://demoapps.qspiders.com/")) {
	
	System.out.println("true");}
else {
	System.out.println("false");
}
	String title = driver.getTitle();;
	 if(title.equals("demoapps")) {
		 System.out.println("true");}
		 
		 else {
			 System.out.println("false");
		 }
	 String id = driver.getWindowHandle();
	 System.out.println(id);
	 Thread.sleep(3000);
	driver.navigate().to("https://www.hotstar.com/in/home");
	driver.navigate().forward();
	driver.navigate().back();
	driver.navigate().refresh();
	Thread.sleep(3000);
	Set<String> multiple = driver.getWindowHandles();
	System.out.println(multiple);
	driver.switchTo().window("E098F9FB94762BC4395BD45DA37D27C9");
	 driver.quit();
	 }
		 
	

	 
	}





package youtub_classes_practice_besics;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshotwebelements {
		public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.get("https://testautomationpractice.blogspot.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement image = driver.findElement(By.xpath("//div[@id='header-inner']"));
			TakesScreenshot tk=(TakesScreenshot)driver;
			WebElement imagee = driver.findElement(By.xpath("//*[@name=\"start\"]"));
			TakesScreenshot tkk=(TakesScreenshot)driver;
			
			File file = image.getScreenshotAs(OutputType.FILE);
		
		File folder=new File(System.getProperty("user.dir")+"/newscreenshots/section.png");
			file.renameTo(folder);
			WebElement ima = driver.findElement(By.xpath("//div[@id='header-inner']"));
			TakesScreenshot tkkk=(TakesScreenshot)driver;
			
			File filee = imagee.getScreenshotAs(OutputType.FILE);
		
		File folders=new File(System.getProperty("user.dir")+"/newscreenshots/section.png");
			file.renameTo(folder);
			
		
			
		}

	}


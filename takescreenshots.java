package youtub_classes_practice_besics;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class takescreenshots {
	private static Object source;

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		TakesScreenshot tk=(TakesScreenshot)driver;
		
		File file = tk.getScreenshotAs(OutputType.FILE);
	
	File folder=new File(System.getProperty("user.dir")+"/newscreenshots/fullpage.png");
		file.renameTo(folder);
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
	
		
	}

}

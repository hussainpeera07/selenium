import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class handiling_frames {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.get("https://ui.vision/demo/webtest/frames/");
	driver.manage().window().maximize();
	WebElement frame1 = driver.findElement(By.xpath("//*[@src=\"frame_1.html\"]"));
	
	driver.switchTo().frame(frame1);
	driver.findElement(By.xpath("//*[@name=\"mytext1\"]")).sendKeys("hussain");
	driver.switchTo().defaultContent();
	WebElement frame3 = driver.findElement(By.xpath("src=\"frame_3.html\""));
Thread.sleep(2000);
	driver.switchTo().frame(frame3);

	driver.switchTo().frame(0);
driver.findElement(By.xpath("//div[@id='i9']//div[@class='AB7Lab Id5V1']")).click();
	Thread.sleep(2000);
driver.findElement(By.xpath("//*[@class=\"AB7Lab\"]")).click();
WebElement frame5 = driver.findElement(By.xpath("//*[@src=\"frame_5.html\"]"));
		driver.switchTo().frame(frame5);
		driver.switchTo().frame("//*[@src=\"frame_3.html\"]");
		driver.quit();
	}

}

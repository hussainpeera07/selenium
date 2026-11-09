import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.time.Duration;


public class mouse_actions {
	public static void main(String[] args) {
		{
			WebDriver driver=new ChromeDriver();
			driver.get("https://testautomationpractice.blogspot.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			WebElement box0 = driver.findElement(By.xpath("class=\"dropbtn\""));
			Actions act1 =new  Actions(driver);
			act1.moveToElement(box0).perform();
		    WebElement box1 = driver.findElement(By.xpath("//*[@class=\"dropbtn\"]"));
			Actions act=new Actions(driver);
			act.doubleClick(box1).perform();
			WebElement box3 = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
			act1.doubleClick(box3).perform();
		WebElement stbox = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement lsatbox = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		act1.dragAndDrop(stbox, lsatbox);
		WebElement start = driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default ui-state-active ui-state-focus']"));
		System.out.println(start.getLocation());
		act.dragAndDropBy(start, 59, 100).perform();
		}
		
		
	}
	}



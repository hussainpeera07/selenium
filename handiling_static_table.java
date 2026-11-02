package youtub_classes_practice_besics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class handiling_static_table {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://blazedemo.com/");
 driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  WebElement dropdown = driver.findElement(By.xpath("//*[@name=\"fromPort\"]"));
 dropdown.click();
 Select drop1=new Select(dropdown);
 drop1.selectByValue("Portland");
 WebElement drop2 = driver.findElement(By.xpath("//*[@name=\"toPort\"]"));
 drop2.click();
 Select drop3=new Select(drop2);
 drop3.selectByIndex(5);
 driver.findElement(By.xpath("//*[@type=\"submit\"]")).click();
int data = driver.findElements(By.xpath("//*[@class=\"table\"]//tr")).size();
System.out.println(data );



int data1 = driver.findElements(By.xpath("//*[@class=\"table\"]//td")).size();
System.out.println(data1 );
driver.findElement(By.xpath("//*[@class=\"table\"]//tr[1]//td[1]")).click();
 
driver.findElement(By.xpath("//*[@id=\"inputName\"]")).sendKeys("hussaion");
driver.findElement(By.xpath("//*[@id=\"address\"]")).sendKeys("kurnool");
driver.findElement(By.xpath("//input[@value='Purchase Flight']")).click();
 WebElement mess = driver.findElement(By.xpath("//h1[normalize-space()='Thank you for your purchase today!']"));
 String message = mess.getText();
if(message.equals("Thank you for your purchase today!\r\n"
		+ ""))
{
	System.out.println("text is maching");
}else
{
	System.out.println("not maching");
	
}



driver.quit();
	 
 
}
}

package youtub_classes_practice_besics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handiling_date_pickers {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.switchTo().frame(0);
		//driver.findElement(By.xpath("//*[@id=\"datepicker\"]")).sendKeys("14/03/2005");
		 String actualyear = "2028";
		 String actualmonth="March";
		 String actualdate="14";
		
		driver.findElement(By.xpath("//*[@class=\"hasDatepicker\"]")).click();
		while (true) {
		 String month = driver.findElement(By.xpath("//*[@class=\"ui-datepicker-month\"]")).getText();
		  String year = driver.findElement(By.xpath("//*[@class=\"ui-datepicker-year\"]")).getText();
		if(year.equals(actualyear) && month.equals(actualmonth)) {
			break;
			
		}
		
		driver.findElement(By.xpath("//*[@class=\"ui-icon ui-icon-circle-triangle-e\"]")).click();
		{
		List<WebElement> date = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr/td//a"));
		for(WebElement mmmt:date)
		{
			if(mmmt.getText().equals(actualdate))
				mmmt.click();
			break;
		}
		}
		}
	}
}

	
		
			

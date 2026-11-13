package youtub_classes_practice_besics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class mock_for_revise {
	public static void date(WebDriver driver ,String year1 ) {
	 WebElement year = driver.findElement(By.xpath("//*[@class=\"ui-datepicker-year\"]"));
	 Select year11=new Select(year);
	 year11.selectByContainsVisibleText("2015");
	 
	}
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.dummyticket.com/dummy%20ticket-for-visa-application/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement redio = driver.findElement(By.xpath("//*[@id=\"product_551\"]"));
	redio.click();
boolean status = redio.isDisplayed();
System.out.println(status);
driver.findElement(By.xpath("//*[@class=\"showcoupon\"]")).click();
driver.findElement(By.xpath("//*[@name=\"coupon_code\"]")).sendKeys("518598");
driver.findElement(By.xpath("//button[@value=\"Apply coupon\"]")).click();

driver.findElement(By.xpath("//input[@id='travname']")).sendKeys("hussain");

driver.findElement(By.xpath("//*[@id=\"travlastname\"]")).sendKeys("peera");
driver.findElement(By.xpath("//*[@id=\"dob\"]")).click();
 WebElement year = driver.findElement(By.xpath("//*[@class=\"ui-datepicker-year\"]"));
Select year1=new Select(year);
year1.selectByContainsVisibleText("2015");
WebElement month = driver.findElement(By.xpath("//*[@class=\"ui-datepicker-month\" and @aria-label=\"Select month\"]"));
Select month1=new Select(month);
month1.selectByVisibleText("Mar");
String dob = "14";
List<WebElement> date = driver.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//tbody//tr//td//a"));
for(WebElement dt:date)
{
	if(dt.getText().equals(dob))
	{
		dt.click();
		break;
	}
}
driver.findElement(By.xpath("//*[@name=\"sex\" and @id=\"sex_1\"]")).click();
driver.findElement(By.xpath("//*[@id=\"addmorepax\"]")).click();
driver.findElement(By.xpath("//span[@id='select2-addpaxno-container']")).click();
 List<WebElement> option = driver.findElements(By.xpath("//span[@class=\"select2-results\"]//ul//li"));
for(WebElement mood:option)
{
	if(mood.getText().equals("I'm the only traveler"))
	{
		mood.click();	
	}
	driver.findElement(By.xpath("//*[@id=\"traveltype_2\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"fromcity\" and @name=\"fromcity\"]")).sendKeys("kurnool");
	driver.findElement(By.xpath("//input[@id='tocity']")).sendKeys("bengaluru");
	driver.findElement(By.xpath("//*[@id=\"departon\"]")).click();
	WebElement secyear = driver.findElement(By.xpath("//*[@data-handler=\"selectYear\" and @class=\"ui-datepicker-year\"]"));
	Select year2=new Select(secyear);
	year2.selectByContainsVisibleText("2027");

	
	WebElement month2 = driver.findElement(By.xpath("//*[@class=\"ui-datepicker-month\"]"));
	
	Select mon=new Select(month2);
	mon.selectByIndex(1);
	String mo="1";
	 List<WebElement> date2 = driver.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//tbody//tr//td//a"));
	for( WebElement dt2: date2)
	
	{
		if(dt2.getText().equals(mo))
		{
			dt2.click();
		}
	}
	driver.findElement(By.xpath("//*[@id=\"returndate\"]")).click();
	WebElement date3 = driver.findElement(By.xpath("//*[@class=\"ui-datepicker-year\" and @aria-label=\"Select year\"]"));
Select newyear=new Select(date3);
newyear.selectByContainsVisibleText("2027");
WebElement newmonth = driver.findElement(By.xpath("//*[@class=\"ui-datepicker-month\" and @aria-label=\"Select month\"]"));
Select newmo=new Select(newmonth);
newmo.selectByVisibleText("Apr");
String monnn="2";
List<WebElement> date22 = driver.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//tbody//tr//td//a"));
for( WebElement dt22: date22)

{
	if(dt22.getText().equals(monnn))
	{
		dt22.click();
	}
	
	
}
driver.findElement(By.xpath("//*[@id=\"notes\"]")).sendKeys("hi friends my neme is hussain peera");
List<WebElement> gu = driver.findElements(By.xpath("//*[@id=\"select2-reasondummy-container\"]"));
for( WebElement dt223: gu)

{
	if(dt223.getText().equals(mood))
	{
		dt223.click();
	}
	
	
}
}
	}
}


	

	
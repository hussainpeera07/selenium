package youtub_classes_practice_besics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.java.swing.plaf.windows.resources.windows;

public class css_relative_xpath_absolute_xpath {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new  ChromeDriver();
    driver.get("https://testautomationpractice.blogspot.com/");
    driver.manage().window().maximize();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector("input#input2")).sendKeys("testing is done");
    driver.findElement(By.cssSelector("input.input-field")).sendKeys("test case is pass");
    driver.findElement(By.cssSelector("input[name=\"input3\"]")).sendKeys("css is completed");
   //xpath
    driver.navigate().to("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
    driver.manage().window().maximize();
    driver.findElement(By.xpath("//*[@placeholder=\"First Name\"]")).sendKeys("hussain peera");
    driver.findElement(By.xpath("//*[@id=\"email\"][@class=\"form-control\"]")).sendKeys("hussainpeetra299");
    driver.findElement(By.xpath("//*[@name=\"gender\" and @type=\"radio\"]")).click();
    WebElement check = driver.findElement(By.xpath("//*[@name=\"gender\" and @type=\"radio\"]"));
 check.getSize();
 driver.findElement(By.xpath("//*[@placeholder=\"Enter Mobile Number\" or @id=\"mobile\"]")).sendKeys("7674082059");
 boolean photo = driver.findElement(By.xpath("//*[@class=\"logo-desktop\"]")).isDisplayed();
 System.out.println(photo);
 boolean select = driver.findElement(By.xpath("//*[@id=\"hobbies\"]")).isEnabled();
 System.out.println(select );
 driver.quit();
}
}

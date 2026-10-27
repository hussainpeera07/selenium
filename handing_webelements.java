package youtub_classes_practice_besics;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handing_webelements {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		List<WebElement> checkbox = driver.findElements(By.xpath("//*[@class=\"form-check form-check-inline\"]"));
	//for selct
		for(int i=0;i<checkbox.size();i++)
	{
		checkbox.get(i).click();
	}
		//for unselect
	for(int i=0;i<checkbox.size();i++)
	{
		checkbox.get(i).click();
	}
	//select in diferent methd
	for(WebElement checkboxs:checkbox)
	{
		checkboxs.click();
	}
	for(int i=4;i<checkbox.size();i++)
	{
		checkbox.get(i).click();
	}
	for(int i=3;i<checkbox.size();i++)
	{
		checkbox.get(i).click();
	
	}
	//using if condition
	for(int i=0;i<checkbox.size();i++)
	{
		if(checkbox.get(i).isSelected())
		{
			checkbox.get(i).click();
		}
	}
	driver.quit();

}
}

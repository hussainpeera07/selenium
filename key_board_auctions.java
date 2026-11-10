package youtub_classes_practice_besics;

import java.awt.Desktop.Action;
import java.time.Duration;import java.util.ResourceBundle.Control;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.esotericsoftware.kryo.util.CuckooObjectMap.Keys;
import com.sun.java.swing.plaf.windows.resources.windows;

public class key_board_auctions {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	 driver.get("https://text-compare.com/");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 driver.findElement(By.xpath("(//textarea[@id='inputText1'])[1]")).sendKeys("hussain peera");
  Actions a=new Actions(driver);
  a.keyDown(org.openqa.selenium.Keys.CONTROL).sendKeys("a").keyUp(org.openqa.selenium.Keys.CONTROL).perform();
  a.keyDown(org.openqa.selenium.Keys.TAB).keyUp(org.openqa.selenium.Keys.TAB).perform();
  a.keyDown(org.openqa.selenium.Keys.CONTROL).sendKeys("v").keyUp(org.openqa.selenium.Keys.CONTROL).perform();
}
}
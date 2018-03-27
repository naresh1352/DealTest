package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DealTest extends loginTest {
  @Test(priority=1)
  public void fx() throws InterruptedException {
	  
	  driver.switchTo().frame("mainpanel");
	  driver.findElement(By.xpath("//a[text()='Deals']"));
	  Actions act=new Actions(driver);
	WebElement ele= driver.findElement(By.xpath("//a[text()='Deals']"));
	act.moveToElement(ele).build().perform();
	driver.findElement(By.xpath("//a [text()='New Deal']")).click();
	  
	 
  }
	 
}

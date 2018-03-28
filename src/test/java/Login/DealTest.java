package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
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
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@name='amount']//preceding::input[6]//preceding::input[3]")).sendKeys("MS");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@name='amount']//preceding::input[6]//preceding::input[3]"
			+ "")).sendKeys("Software solutions");
	Thread.sleep(5000);
	WebElement ele1=driver.findElement(By.xpath("//select[@name='type']"));
	  Select sel=new Select(ele1);
	  sel.selectByVisibleText("Old");
	  
	  driver.findElement(By.xpath("(//input[@class='button'])[1]")).click();
	  
	 
  }
	 
}

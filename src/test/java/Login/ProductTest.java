package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ProductTest extends loginTest {
  @Test(priority=2)
  public void fz() throws InterruptedException {
	  
	  driver.switchTo().frame("mainpanel");
	  driver.findElement(By.xpath("//a[text()='Deals']"));
	  Actions act=new Actions(driver);
		WebElement ele= driver.findElement(By.xpath("//a[text()='Deals']"));
		act.moveToElement(ele).build().perform();
		driver.findElement(By.xpath("(//a[@title='Products'])[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@class='button']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='cost']//preceding::input[1]")).sendKeys("Yardly Powder");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='cost']//preceding::input[1]//following::input[1]")).clear();
		driver.findElement(By.xpath("//input[@name='cost']//preceding::input[1]//following::input[1]")).sendKeys("4");
		
  }
}

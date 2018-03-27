package Login;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class loginTest {
	WebDriver driver;
	  @Test
	  public void f() throws IOException, InterruptedException {
		  
		  System.setProperty("webdriver.chrome.driver", "D:\\selenium\\New folder\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.freecrm.com/index.html");
		  driver.findElement(By.xpath(".//*[@id='loginForm']/div/input[1]")).sendKeys("gsudeer");
		  driver.findElement(By.xpath(".//*[@id='loginForm']/div/input[2]")).sendKeys("DLFAP216@");
		  driver.findElement(By.xpath("//input[@class='btn btn-small']")).click();
		  
  }
}

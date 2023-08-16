package Day3;

import org.testng.annotations.Test;

import com.google.common.io.Files;

import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;

public class NewTest {
	
	WebDriver driver;
  @Test
  public void f() throws InterruptedException, IOException {
	  driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		driver.findElement(By.id("createAccountSubmit")).click();
		driver.findElement(By.id("ap_customer_name")).sendKeys("Mouriyan Annadurai");
		driver.findElement(By.id("ap_phone_number")).sendKeys("8110814620");
		driver.findElement(By.id("ap_email")).sendKeys("mouriyanav@gmail.com");
		driver.findElement(By.id("ap_password")).sendKeys("Mouriyan@2510");
		driver.findElement(By.id("continue")).click();
		Thread.sleep(1000);
		File ss=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(ss, new File("C:\\Users\\HP\\Desktop\\SS\\Posi.jpg"));
	  
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium'\\\\WebDriver\\\\chromedriver.exe");
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		driver=new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}

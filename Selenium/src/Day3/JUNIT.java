package Day3;

import java.io.File;
import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.google.common.io.Files;

public class JUNIT {
	WebDriver driver;
	@Before
	public void beforecase() {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium'\\\\WebDriver\\\\chromedriver.exe");
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		driver=new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
	}
	
	@Test
	public void postivetest() throws InterruptedException, IOException {
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
	
	@Test
	public void negativetest() throws InterruptedException, IOException {
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		driver.findElement(By.id("createAccountSubmit")).click();
		driver.findElement(By.id("ap_customer_name")).sendKeys("1234567890");
		driver.findElement(By.id("ap_phone_number")).sendKeys("mouriyanav@gmail.com");
		driver.findElement(By.id("ap_email")).sendKeys("8110817890");
		driver.findElement(By.id("ap_password")).sendKeys("??!!@#%^&()&^");
		driver.findElement(By.id("continue")).click();
		Thread.sleep(1000);
		File ss=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(ss, new File("C:\\Users\\HP\\Desktop\\SS\\Nega.jpg"));
	}
	
	@After
	public void afterCase() {
		driver.close();
	}
	
}

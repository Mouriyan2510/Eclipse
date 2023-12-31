package Day3;

import java.io.File;
import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.google.common.io.Files;

public class JunitSample {
	WebDriver web;
	
	@Before
	public void beforeclass() {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium'\\\\WebDriver\\\\chromedriver.exe");
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		web=new ChromeDriver(op);
		web.manage().window().maximize();
		web.get("https://phptravels.com/demo/");
	}
	
	@Test
	public void posClass() throws IOException, InterruptedException {
		web.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Mouriyan");
		web.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Annadurai");
		web.findElement(By.xpath("//input[@placeholder='Business Name']")).sendKeys("Management");
		web.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("mouriyanav@gmail.com");
		web.findElement(By.xpath("//button[@id='demo']")).click();
		Thread.sleep(1000);
		Alert a=web.switchTo().alert();
		Thread.sleep(1000);
		a.accept();
		File ss=((TakesScreenshot) web).getScreenshotAs(OutputType.FILE);
		Files.copy(ss, new File("C:\\Users\\HP\\Desktop\\SS\\Ps1.jpg"));
	}
	
	@Test
	public void negClass() throws IOException, InterruptedException {
		web.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("123456");
		web.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("!@#$%^&*");
		web.findElement(By.xpath("//input[@placeholder='Business Name']")).sendKeys("9789896530");
		web.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("!@#$%^098765432");
		web.findElement(By.xpath("//button[@id='demo']")).click();
		Thread.sleep(1000);
		Alert a=web.switchTo().alert();
		Thread.sleep(1000);
		a.accept();
		File ss=((TakesScreenshot) web).getScreenshotAs(OutputType.FILE);
		Files.copy(ss, new File("C:\\Users\\HP\\Desktop\\SS\\Ng1.jpg"));
	}
	
	@After
	public void afterCase() {
		web.close();
	}
	

}

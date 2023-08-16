package Day2;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.google.common.io.Files;

public class GuruTask {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium'\\\\WebDriver\\\\chromedriver.exe");
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		WebDriver web=new ChromeDriver(op);
		web.get("https://demo.guru99.com/test/delete_customer.php");
		web.findElement(By.xpath(".//input[@name='cusid']")).sendKeys("Mouriyan2510");
		File ss=((TakesScreenshot) web).getScreenshotAs(OutputType.FILE);
		Files.copy(ss, new File("C:\\Users\\HP\\Desktop\\New folder (2)\\abc.jpg"));
		web.findElement(By.xpath(".//input[@name='submit']")).click();
		Alert a=web.switchTo().alert();
		a.accept();
		Thread.sleep(1000);
		a.accept();
		
	}

}

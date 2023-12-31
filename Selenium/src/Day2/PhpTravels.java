package Day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.google.common.io.Files;

public class PhpTravels {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium'\\\\WebDriver\\\\chromedriver.exe");
		ChromeOptions op= new ChromeOptions();
		op.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(op);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://phptravels.com/demo/");
		driver.findElement(By.xpath("//a[normalize-space()='Signup']")).click();
		driver.findElement(By.xpath("//input[@id='inputFirstName']")).sendKeys("Mouriyan");
		driver.findElement(By.xpath("//input[@id='inputLastName']")).sendKeys("Annadurai");
		driver.findElement(By.xpath("//input[@id='inputEmail']")).sendKeys("mouriyanav@gmail.com");
		
		
	}

}

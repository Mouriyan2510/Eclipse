package Day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class XyzBankTask {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium'\\\\WebDriver\\\\chromedriver.exe");
		ChromeOptions op= new ChromeOptions();
		op.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(op);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://phptravels.com/demo/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Mouriyan");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Annadurai");
		driver.findElement(By.xpath("//input[@placeholder='Business Name']")).sendKeys("Hotel Management");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("mouriyanav@gmail.com");
		File ss=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(ss, new File("C:\\Users\\HP\\Desktop\\New folder (2)\\ba.jpg"));
	
		//driver.findElement(By.xpath("//button[.='Generate Alert Box']")).click();
//		driver.findElement(By.xpath("//button[text()='Customer Login']")).click();
//		WebElement select =driver.findElement(By.xpath("//select[@id='userSelect']"));
//		Select s = new Select(select);
//		s.selectByVisibleText("Albus Dumbledore");
//		driver.findElement(By.xpath("//button[text()='Login']")).click();
//		driver.findElement(By.xpath("//button[normalize-space()='Transactions']")).click();
//		Thread.sleep(1000); 
//		driver.findElement(By.xpath("//button[normalize-space()='Logout']")).click();
	}

}

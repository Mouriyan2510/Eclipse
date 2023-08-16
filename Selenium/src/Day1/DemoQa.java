package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DemoQa {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium'\\WebDriver\\chromedriver.exe");
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		WebDriver driver=new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		driver.findElement(By.className("card-up")).click();//text
		driver.findElement(By.className("text")).click();//userName
		driver.findElement(By.id("userName")).sendKeys("Mouriyan Annadurai");
		driver.findElement(By.id("userEmail")).sendKeys("mouriyanav@gmail.com");
		driver.findElement(By.id("currentAddress")).sendKeys("Near Capegemini Thuraippakkam");//permanentAddress
		driver.findElement(By.id("permanentAddress")).sendKeys("Vriddhacahalam Cuddalore dt");//
		driver.findElement(By.id("submit")).click();
	}
}

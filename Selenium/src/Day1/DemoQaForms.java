package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DemoQaForms {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium'\\WebDriver\\chromedriver.exe");
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		WebDriver driver=new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,350)", "");
//		driver.findElement(By.xpath(".//div[@class='card-up']")).click();
//		driver.findElement(By.xpath(".//div[@class='header-wrapper']")).click();
//		driver.findElement(By.xpath(".//div[@class='text']")).click();
		driver.findElement(By.xpath(".//input[@id='firstName']")).sendKeys("Mouriyan");
		driver.findElement(By.xpath(".//input[@id='lastName']")).sendKeys("Annadurai");
		driver.findElement(By.xpath(".//input[@id='userEmail']")).sendKeys("mouriyanav@gmail.com");
		driver.findElement(By.xpath("//label[normalize-space()='Male']")).click();
//		driver.findElement(By.xpath(".//div[@class='control custom-radio custom-control-inline']")).click();
		driver.findElement(By.xpath(".//input[@id='userNumber']")).sendKeys("8110814620");
		WebElement we= driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));//
		Select s=new Select(we);
		s.selectByVisibleText("//select[@class='react-datepicker__month-select']");
		s.selectByValue("August");
		s.selectByVisibleText("//select[@class='react-datepicker__year-select']");
		s.selectByValue("2024");
		s.selectByVisibleText("//div[@aria-label='Choose Thursday, August 17th, 2023']");
		
//		driver.findElement(By.xpath(".//div[@class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3']")).sendKeys("Testing");
		driver.findElement(By.xpath(".//label[text()='Sports']")).click();
	}
}

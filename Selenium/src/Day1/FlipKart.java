package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FlipKart {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium'\\WebDriver\\chromedriver.exe");
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		WebDriver driver=new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();//nav-line-1 nav-progressive-content
		driver.findElement(By.id("createAccountSubmit")).click();
		driver.findElement(By.id("ap_customer_name")).sendKeys("Mouriyan Annadurai");
		driver.findElement(By.id("ap_phone_number")).sendKeys("8110814620");//ap_email
		driver.findElement(By.id("ap_email")).sendKeys("mouriyanav@gmail.com");//ap_password
		driver.findElement(By.id("ap_password")).sendKeys("Mouriyan@2510");//continue
		driver.findElement(By.id("continue")).click();
	}

}

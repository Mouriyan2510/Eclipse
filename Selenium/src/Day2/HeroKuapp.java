package Day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeroKuapp {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium'\\\\WebDriver\\\\chromedriver.exe");
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		WebDriver web=new ChromeDriver(op);
		web.manage().window().maximize();
		web.get("http://the-internet.herokuapp.com/?ref=hackernoon.com");
		String url="http://the-internet.herokuapp.com/?ref=hackernoon.com";
		web.findElement(By.xpath("//a[normalize-space()='Add/Remove Elements']")).click();
		web.findElement(By.xpath("//button[normalize-space()='Add Element']")).click();
		web.findElement(By.xpath("//button[normalize-space()='Delete']")).click();
		Thread.sleep(1000);
		web.navigate().to(url); 
		Alert a=web.switchTo().alert();
		web.findElement(By.xpath("//a[normalize-space()='Basic Auth']")).click();
		Thread.sleep(2000);
	
		a.accept();
		a.sendKeys("Mouriyan");
//		web.navigate().to(url);
	}
}

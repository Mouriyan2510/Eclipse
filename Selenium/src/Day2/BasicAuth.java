package Day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class BasicAuth {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium'\\\\WebDriver\\\\chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allow-origins=*", "ignore-certificate-errors");
		WebDriver web = new ChromeDriver(op);
		web.manage().window().maximize();
		web.get("http://the-internet.herokuapp.com/?ref=hackernoon.com");
		String url = "http://the-internet.herokuapp.com/?ref=hackernoon.com";

		web.findElement(By.xpath(".//a[.='Basic Auth']")).click();

		
		  Actions a = new Actions(web);
		  
		  Thread.sleep(2000);
		  
		  web.switchTo().alert().dismiss();
		  
		 // a1.sendKeys("summa");
		  
	}

}

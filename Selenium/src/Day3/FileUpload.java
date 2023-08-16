package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FileUpload {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium'\\\\WebDriver\\\\chromedriver.exe");
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		WebDriver web=new ChromeDriver(op);
		web.manage().window().maximize();
	    web.get("https://www.techlistic.com/p/selenium-practice-form.html");
	    WebElement we=web.findElement(By.xpath("//input[@id='photo']"));
//	    we.sendKeys("C:\\Users\\HP\\Desktop\\SS\\Posi1.jpg");
		we.sendKeys("C:\\Users\\HP\\Desktop\\Java8.pdf");
	}

}

package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium'\\\\WebDriver\\\\chromedriver.exe");
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		WebDriver web=new ChromeDriver(op);
		web.manage().window().maximize();
		web.get("https://artoftesting.com/samplesiteforselenium");
//		WebElement w= web.findElement(By.id("testingDropdown"));
		WebElement w= web.findElement(By.xpath(".//select[@id='testingDropdown']"));
		Select s=new Select(w);
//		s.selectByVisibleText("Database Testing");
//		s.selectByValue("Performance");
		s.selectByIndex(1);
		System.out.println(w.getText());
	}

}

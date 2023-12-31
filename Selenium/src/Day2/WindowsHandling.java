package Day2;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowsHandling {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium'\\\\WebDriver\\\\chromedriver.exe");
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		WebDriver web=new ChromeDriver(op);
		web.manage().window().maximize();
		web.get("https://www.w3schools.com/java/default.asp");
		JavascriptExecutor js = (JavascriptExecutor) web;
		js.executeScript("window.scrollBy(0,350)", "");
		web.findElement(By.xpath("//a[normalize-space()='Try it Yourself »']")).click();
		String parent=web.getWindowHandle();
		Set<String>windows=web.getWindowHandles();
		
		
		
		
//		String lastWindowHandle = "";
//		for(String handle : windows)
//		{
//		System.out.println("Switching to window - > " + handle);
//		System.out.println("Navigating to google.com");
//		web.switchTo().window(handle); 
//		lastWindowHandle = handle;
//		web.close();
//		}
		
		
		
		 
		web.switchTo().window(parent);
		web.close();
		Iterator<String>ite=windows.iterator();
		while(ite.hasNext()) {
			String child=ite.next();
			if(child!=parent) {
				web.switchTo().window(ite.next());
				web.close();
			}
		}
		web.switchTo().window(parent);
		web.close();
		
	}

}

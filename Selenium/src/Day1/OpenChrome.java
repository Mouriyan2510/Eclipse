package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OpenChrome {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium'\\WebDriver\\chromedriver.exe");
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		WebDriver driver=new ChromeDriver(op);
		driver.manage().window().maximize();
//		driver.get("https://www.google.com/");
		driver.get("https://www.google.com/");
		WebElement dc= driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		dc.sendKeys("facebook");
		dc.sendKeys(Keys.ENTER);
		String url="https://www.google.com/search?gs_ssp=eJzj4tLP1TfIyK1MKy5TYDRgdGDw4khLTE5Nys_PBgBmYAfL&q=facebook&oq=face&gs_lcrp=EgZjaHJvbWUqFQgBEC4YQxiDARjHARixAxjRAxiKBTIGCAAQRRg5MhUIARAuGEMYgwEYxwEYsQMY0QMYigUyCQgCEAAYQxiKBTIPCAMQABhDGIMBGLEDGIoFMgwIBBAAGBQYhwIYgAQyDwgFEAAYQxiDARixAxiKBTINCAYQABiDARixAxiABDIECAcQBdIBCDE0MzBqMGo3qAIAsAIA&sourceid=chrome&ie=UTF-8";
		driver.navigate().to(url);
		driver.findElement(By.xpath("//h3[normalize-space()='Facebook - log in or sign up']")).click();
		String url1="https://www.facebook.com/";
		driver.navigate().to(url1);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("9025463992");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("mouripriya");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		driver.findElement(By.xpath("//a[@id='u_0_0_v2']")).click();
		String cu=driver.getCurrentUrl();
//		System.out.println(cu);////input[@id='tool-2']
		String ps=driver.getPageSource();
//		System.out.println(ps);
		String t=driver.getTitle();
//		System.out.println(t);
//		driver.findElement(By.className("nav-icon nav-arrow")).sendKeys("Onesost Technologies",Keys.ENTER);
//		driver.findElement(By.className("nav-line-2 ")).click();//nav-line-1 nav-progressive-content
//		driver.findElement(By.className("nav-action-inner")).click();//createAccountSubmit
//		driver.findElement(By.className("createAccountSubmit")).click();
//		driver.findElement(By.className("nav-icon nav-arrow")).sendKeys("Onesost Technologies",Keys.ENTER);
//		driver.close();
	}

}

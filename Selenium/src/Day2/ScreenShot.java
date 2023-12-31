package Day2;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.google.common.io.Files;

public class ScreenShot {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium'\\\\WebDriver\\\\chromedriver.exe");
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		WebDriver web=new ChromeDriver(op);
		web.manage().window().maximize();
		web.get("https://artoftesting.com/samplesiteforselenium");
		File ss=((TakesScreenshot) web).getScreenshotAs(OutputType.FILE);
		Files.copy(ss, new File("C:\\Users\\HP\\Desktop\\New folder (2)\\aa.jpg"));
	}

}

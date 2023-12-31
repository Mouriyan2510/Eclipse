package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ActionsDragAndDrop {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium'\\\\WebDriver\\\\chromedriver.exe");
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		WebDriver web=new ChromeDriver(op);
		web.manage().window().maximize();
		web.get("https://artoftesting.com/samplesiteforselenium");
//		web.get("https://selenium08.blogspot.com/2020/01/drag-drop.html");
//		WebElement from=web.findElement(By.xpath("//div[@id='draggable']"));
//		WebElement to= web.findElement(By.xpath("//div[@id='droppable']"));
		WebElement from=web.findElement(By.xpath("//img[@id='myImage']"));
		WebElement to= web.findElement(By.xpath("//div[@id='targetDiv']"));
		Actions act=new Actions(web);
		act.dragAndDrop(from, to).perform();
	}

}

package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scroll {

	public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.cssSelector("[name='username']")).sendKeys("Admin");
		driver.findElement(By.cssSelector("[name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[text()=' Login ']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[text()='PIM']")).click();
		Thread.sleep(1000);
		WebElement scrollelement = driver.findElement(By.xpath("//*[text()='Garry ']//ancestor::div//*[text()='White']//parent::div//preceding-sibling::div//span//i"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		/*js.executeScript("window.scrollBy(0,800)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-600)");
		Thread.sleep(2000);*/
		
		js.executeScript("arguments[0].scrollIntoView();",scrollelement);	
		js.executeScript("arguments[0].click();",scrollelement);
		
		//driver.quit();
		//Thread.sleep(5000);
	}
}

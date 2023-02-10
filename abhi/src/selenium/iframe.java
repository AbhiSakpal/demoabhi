package selenium;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class iframe extends screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "D:\\softwares\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/slider/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement iframe = driver.findElement(By.xpath("//*[@class='demo-frame']"));
		driver.switchTo().frame(iframe);

		WebElement clknhld = driver.findElement(By.cssSelector("#slider span"));
		Actions act = new Actions(driver);

		act.clickAndHold(clknhld).perform();
		Thread.sleep(2000);
		act.moveToElement(clknhld, 500, 0).release().build().perform();
		Thread.sleep(500);

		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//*[text()='Download']")).click();
		iframe fr = new iframe();
		fr.ss("1stss");
		
		Thread.sleep(2000);
		driver.quit();

	}
}
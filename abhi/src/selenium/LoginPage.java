package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mbasic.facebook.com/reg/?cid=103&refsrc=deprecated&_rdr");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
		// driver.findElement(By.cssSelector("[type='text']")).sendKeys("lavie bags");
		// driver.findElement(By.cssSelector("[type='submit']")).click();
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']")).click();
		Thread.sleep(2000);
		/*
		 * List<WebElement> quantityy =
		 * driver.findElements(By.xpath("//*[@id='quantity']//option]")); for
		 * (WebElement quantity : quantityy) if (quantity.getText().equals("5"))
		 * quantity.click();
		 */

		WebElement dayy = driver.findElement(By.id("day"));
		Select d = new Select(dayy);
		d.selectByVisibleText("30");
		
		Thread.sleep(2000);
		WebElement months = driver.findElement(By.id("month"));
		Select m = new Select(months);
		m.selectByVisibleText("Apr");
		
		Thread.sleep(2000);
		WebElement yearr = driver.findElement(By.id("year"));
		Select y = new Select(yearr);
		y.selectByVisibleText("1997");
		
		Thread.sleep(10000);
		driver.quit();

	}

}

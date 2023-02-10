package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Instamsg {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\softwares\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("[name='username']")).sendKeys("abhi.sakpal");
		driver.findElement(By.cssSelector("[name='password']")).sendKeys("Sakpal@123456$");
		driver.findElement(By.xpath("//*[text()='Log in']")).click();
		driver.findElement(By.xpath("//*[text()='Messages']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='Not Now']")).click();
		driver.findElement(By.xpath("//*[text()='Chanchal Sunil Yadav']")).click();
		Thread.sleep(1000);
		int i = 1;
		while (i < 10) {
			driver.findElement(By.xpath("(//*[@aria-label='Emoji'])[2]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//*[@class='_ajr2'])[9]")).click();
			Thread.sleep(1000);
			// driver.findElement(By.xpath("//*[@placeholder='Message...']")).sendKeys("Chanchu");
			driver.findElement(By.xpath("//*[text()='Send']")).click();
			Thread.sleep(2000);
		}
		i++;
		// driver.quit();

	}
}

package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo45 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("WebDriver.driver.chrome", "D:\\softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		String ID = driver.getWindowHandle();
		System.out.println("1st page ID  " + ID);

		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Thread.sleep(5000);

		driver.switchTo().window(ID);
		Thread.sleep(1000);

		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.cssSelector("[type='submit']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//span[text()='PIM']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath(
				"//*[text()='Lisa ']//ancestor::div//*[text()='Andrews']//parent::div//preceding-sibling::div//span//i"))
				.click();

	}

}

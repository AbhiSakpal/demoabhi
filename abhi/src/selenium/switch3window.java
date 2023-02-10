package selenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class switch3window {

	static WebDriver driver;

	public static void m1(String a) throws InterruptedException {
		Set<String> allID = driver.getWindowHandles();
		for (String str : allID) {
			driver.switchTo().window(str);
			if (driver.getTitle().contains(a)) {
				Thread.sleep(500);
				break;
			}
		}

	}

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\softwares\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
		String ID = driver.getWindowHandle();
		driver.manage().window().maximize();
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.facebook.com/");

		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.youtube.com/");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.switchTo().window(ID);
		m1("Facebook");
		driver.findElement(By.id("email")).sendKeys("abhi");
		Thread.sleep(2000);

		m1("YouTube");
		driver.findElement(By.xpath("(//*[text()='Music'])[2]")).click();
		Thread.sleep(2000);

		driver.quit();

	}
}
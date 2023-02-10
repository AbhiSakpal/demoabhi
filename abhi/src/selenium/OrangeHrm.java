package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrm {
	
	static WebDriver driver;
	
	public static void checkbox(String a,String b) {
		driver.findElement(By.xpath(
				"//*[text()='"+ a +"']//parent::div//following-sibling::div//*[text()='"+ b +"']//parent::div//preceding-sibling::div//span//i"))
				.click();
		
	}

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\softwares\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.cssSelector("[name='username']")).sendKeys("Admin");
		driver.findElement(By.cssSelector("[name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[text()=' Login ']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[text()='PIM']")).click();
		Thread.sleep(1000);
		
		checkbox("Aaliyah ","Haq");
		checkbox("Lisa ","Andrews");
		checkbox("Paul ","Brakus");
		
		Thread.sleep(10000);	
		driver.quit();
		/*List<WebElement> chkbox = driver.findElements(By.xpath("//*[@class='oxd-table-card']//span//i"));
		for(WebElement checkbox:chkbox)
			checkbox.click();*/
		
	}

}

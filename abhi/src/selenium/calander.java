package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class calander {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.id("datepicker1")).click();
		Thread.sleep(500);
		
		int i=0;
		while(i==0) {
			String monthyear=driver.findElement(By.cssSelector(".ui-datepicker-title")).getText();
			if(!(monthyear.equals("April 1997")))
				driver.findElement(By.xpath("//span[text()='Prev']")).click();
			else
				break;
		}
		
		driver.findElement(By.xpath("//*[text()='30']")).click();
		Thread.sleep(3000);
		driver.quit();
		

	}
}

package selenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchwindow {

public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		String id = driver.getWindowHandle();
		System.out.println("1st window ID " + id);
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Thread.sleep(2000);
		Set<String> allwin = driver.getWindowHandles();
		for(String allwind : allwin) {
			if((id.equals(allwind)))
				Thread.sleep(2000);
				driver.switchTo().window(id);
				//System.out.println(allwind);
			
		}
			
}
}
package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginOrange {
		
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\softwares\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
		driver.manage().window().maximize();
		
		WebElement clk = driver.findElement(By.xpath("//*[text()='Success - Check box is checked']//parent::div//input"));
		clk.click();
		
		System.out.println(clk.isSelected());
		System.out.println(clk.isEnabled());
		System.out.println(clk.isDisplayed());
		System.out.println(clk.getAttribute("id"));
		Thread.sleep(1000);
		driver.quit();


	}

}

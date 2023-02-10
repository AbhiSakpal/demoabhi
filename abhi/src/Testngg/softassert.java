package Testngg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softassert {

	public static WebDriver driver;
	static String url = "http://dthahab.com/Account/Login?ReturnUrl=%2fSetting%2fSplash%2fCreate";

	@BeforeTest
	public void initBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\softwares\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
	}
	
	@AfterTest
	public void exitt() {
		driver.quit();
	}
	
	@Test
	void verifyurl() {
		String urll = driver.getCurrentUrl();
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(urll, url,"verifying url");
		System.out.println("verifying url of page using softassert");
		sa.assertAll();
	}
	
	@Test
	void verifytitle() {
		String title = driver.getTitle();
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(title,"Login | Dthahab","verifying title");
		System.out.println("verifying title of page using softassert");
		sa.assertAll();
	}
}

package Testngg;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class hardassert {

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
     void verifyUrl() {
		String urll = driver.getCurrentUrl();
		Assert.assertEquals(urll, url,"verifying url");
		System.out.println("verify url run after hard assert");		
	}
	
	@Test
	void verifyTitle() {
		String Titlee = driver.getTitle();
		Assert.assertEquals(Titlee, "Login | Dthahab","verifying title");
		System.out.println("verify title run after hard assert");
	}
}

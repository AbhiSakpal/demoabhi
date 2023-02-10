package TEST;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import MAINJava.BaseClass;
import MAINJava.DashboardPage;
import MAINJava.LoginPage;
import MAINJava.PimPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest extends BaseClass {

	@BeforeSuite
	public void initbrowser() {
		System.setProperty("Webdriver.driver.chrome", "D:\\softwares\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@BeforeClass
	public void pageObjects() {
		loginPage = new LoginPage(driver);
		dashboardPage = new DashboardPage(driver);
		pimPage = new PimPage(driver);

	}
	
	@AfterClass
	public void logOutUser() {
		dashboardPage.logOut();
	}

	@AfterSuite
	public void tearDownEnvironment() {
		driver.quit();
	}

}

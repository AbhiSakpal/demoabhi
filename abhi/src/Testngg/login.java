package Testngg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class login {

	static WebDriver driver;
	static String url = "https://www.saucedemo.com/";

	@BeforeTest(alwaysRun = true, groups = "sanity,regression")
	public void initBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\softwares\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();

	}

	@Test(priority = 0, groups = "sanity")
	void verifyurl() {
		methodsForLoginClass obj = new methodsForLoginClass();
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(obj.getPageUrl(), url, "verifying url");
		System.out.println("verifying url of page using softassert");
		sa.assertAll();
	}

	@Test(priority = 1, groups = "sanity")
	void verifytitle() {
		methodsForLoginClass obj = new methodsForLoginClass();
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(obj.getPageTitle(), "Swag Labs", "verifying title");
		System.out.println("verifying title of page using softassert");
		sa.assertAll();
	}

	@Test(priority = 2, groups = "sanity,regression")
	void verifyDashboardAfterLoginn() {
		methodsForLoginClass obj = new methodsForLoginClass();
		obj.loginCredential("standard_user", "secret_sauce");
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(obj.getPageText("Products"), "PRODUCTS", "verifying page text Products");
		System.out.println("verifying page login using softassert");
		sa.assertAll();
	}

	@Test(priority = 3, dependsOnMethods = "verifyDashboardAfterLoginn", groups = "regression")
	void verifyDashboardPageitemss() {
		methodsForLoginClass obj = new methodsForLoginClass();
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(obj.getPageItems("Sauce Labs Backpack"), "Sauce Labs Backpack", "verifying page items");
		sa.assertEquals(obj.getPageItems("Sauce Labs Bike Light"), "Sauce Labs Bike Light", "verifying page items");
		sa.assertEquals(obj.getPageItems("Sauce Labs Bolt T-Shirt"), "Sauce Labs Bolt T-Shirt", "verifying page items");
		sa.assertEquals(obj.getPageItems("Sauce Labs Fleece Jacket"), "Sauce Labs Fleece Jacket", "verifying page items");
		System.out.println("verifying shopping items after login using softassert");
		sa.assertAll();
	}

	@AfterTest(alwaysRun = true, groups = "sanity,regression")
	public void exitt() {
		driver.quit();
	}
}

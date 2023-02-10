package TEST;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import MAINJava.LoginPage;

public class LoginTest extends BaseTest{

	@Test(priority=1,groups="smoke,regression")
	public void verifyTitleOfBuild() {
	  Assert.assertEquals(loginPage.getBuildTitle(),"OrangeHRM");
	}
	
	@Test(priority=2,groups="smoke,regression")
	public void verifyUrlOfPage() {
	  Assert.assertEquals(loginPage.getBuildUrl(),"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test(priority=3,groups="smoke,regression")
	public void verifyTitleOfPage() {
	  Assert.assertEquals(loginPage.getTitleofLoginPage(),"Login");
	}
	
	@Test(priority=4,groups="smoke,regression")
	public void verifyLoginpageWithCredentials() {
		loginPage.setUsername("Admin");
		loginPage.setPassword("admin123");
		loginPage.clkLogin();
		Assert.assertEquals(dashboardPage.getTitleofDashboard(),"Dashboard");
	}

}

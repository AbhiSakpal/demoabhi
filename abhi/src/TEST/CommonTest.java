package TEST;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;

public class CommonTest extends BaseTest {

	@BeforeClass
	public void login() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		loginPage.setUsername("Admin");
		loginPage.setPassword("admin123");
		loginPage.clkLogin();
		String titleOfDash = dashboardPage.getTitleofDashboard();
		Assert.assertEquals(titleOfDash, "Dashboard");

	}
}
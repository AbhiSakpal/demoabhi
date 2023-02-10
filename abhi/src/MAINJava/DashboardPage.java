package MAINJava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TEST.BaseTest;

public class DashboardPage extends BaseTest {

	// all locators
	@FindBy(xpath = "//h6[text()='Dashboard']")
	WebElement titleDashboard;

	@FindBy(css = ".oxd-userdropdown i")
	WebElement clickLogoutDrpDown;

	@FindBy(xpath = "//*[text()='Logout']")
	WebElement txtLogout;

	// initialization of variables
	public DashboardPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// all methods for tests
	public String getTitleofDashboard() {
		return titleDashboard.getText();
	}

	public void logOut() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().refresh();
		clickLogoutDrpDown.click();
		txtLogout.click();
	}
}

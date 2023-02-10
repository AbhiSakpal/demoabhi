package MAINJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TEST.BaseTest;

public class LoginPage extends BaseTest{
	
	//all locators
	@FindBy(xpath="//*[text()='Login']")
	WebElement txtloginpage;
	
	@FindBy(name="username")
	WebElement user;
	
	@FindBy(name="password")
	WebElement pass;
	
	@FindBy(tagName="button")
	WebElement loginn;
	
	
	//initialization of locators
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//all methods for tests
	public String getBuildTitle() {
		String str = driver.getTitle();
		return str;
	}
	
	public String getBuildUrl() {
		String str = driver.getCurrentUrl();
		return str;
	}
	
	public String getTitleofLoginPage() {
		return txtloginpage.getText();
	}
	
	public void setUsername(String userr) {
		user.sendKeys(userr);
	}
	
	public void setPassword(String passs) {
		pass.sendKeys(passs);
	}
	
	public void clkLogin() {
		loginn.click();
	}

}

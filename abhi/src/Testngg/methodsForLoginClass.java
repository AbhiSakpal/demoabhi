package Testngg;

import org.openqa.selenium.By;

public class methodsForLoginClass extends login {

	public String getPageUrl() {
		String urll = driver.getCurrentUrl();
		return urll;
	}

	public String getPageTitle() {
		String title = driver.getTitle();
		return title;
	}

	public void loginCredential(String user, String pass) {
		driver.findElement(By.id("user-name")).sendKeys(user);
		driver.findElement(By.id("password")).sendKeys(pass);
		driver.findElement(By.id("login-button")).click();

	}

	public String getPageText(String txtt) {
		String txt = driver.findElement(By.xpath("//*[text()='" + txtt + "']")).getText();
		return txt;

	}

	public String getPageItems(String txtt) {
		String txt = driver.findElement(By.xpath("//*[text()='" + txtt + "']")).getText();
		return txt;
	}
}

package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot {
	public static WebDriver driver;

	public void ss(String a) throws InterruptedException, IOException {

		TakesScreenshot scrnsht = (TakesScreenshot) driver;
		File source = scrnsht.getScreenshotAs(OutputType.FILE);
		File destin = new File("C:\\Users\\abhis\\OneDrive\\Documents\\ss\\"+a+".png");
		FileHandler.copy(source, destin);
	}
}

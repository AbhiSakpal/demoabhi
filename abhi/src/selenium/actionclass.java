package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionclass {

	static WebDriver driver;

	
	public static void copypaste() throws InterruptedException {

		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(1000);
		WebElement Txt1 = driver.findElement(By.id("email"));
		WebElement Txt2 = driver.findElement(By.id("pass"));
		Actions act = new Actions(driver);
		act.sendKeys(Txt1, "abhi").keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).keyDown(Keys.CONTROL)
				.sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(1000);
		Txt2.click();
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();

		Thread.sleep(5000);
		driver.quit();

	}

	public static void hovering() throws InterruptedException {
		driver.get("https://demoqa.com/menu/#");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(1000);

		WebElement target = driver.findElement(By.xpath("//*[text()='Main Item 2']"));
		Actions act = new Actions(driver);
		act.moveToElement(target).perform();

		Thread.sleep(5000);
		driver.quit();
	}

	public static void rightclicknDoubleclick() throws InterruptedException {
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement target = driver.findElement(By.xpath("//*[text()='right click me']"));
		WebElement target2 = driver.findElement(By.xpath("//*[text()='Double-Click Me To See Alert']"));
		Actions act = new Actions(driver);

		act.doubleClick(target2).perform();	
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		act.contextClick(target).perform();		

		Thread.sleep(5000);
		driver.quit();

	}

	public static void clknhldNdrgndrp() throws InterruptedException {
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement srcelement = driver.findElements(By.cssSelector("#fourth a")).get(0);
		WebElement targtelement = driver.findElement(By.cssSelector("#amt7 li"));
		WebElement targtelement2 = driver.findElement(By.cssSelector("#amt8 li"));

		Actions act = new Actions(driver);
		Thread.sleep(500);
		act.dragAndDrop(srcelement, targtelement).perform();
		act.clickAndHold(srcelement).perform();
		Thread.sleep(10000);
		act.moveToElement(targtelement2).release().build().perform();

		Thread.sleep(5000);
		driver.quit();
	}

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("WebDriver.Chrome.driver", "D:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		// copypaste();
		// hovering();
		rightclicknDoubleclick();
		//clknhldNdrgndrp();

	}
}

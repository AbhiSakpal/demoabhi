package MAINJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TEST.BaseTest;

public class PimPage extends BaseTest {

	
	@FindBy(xpath="//*[text()='PIM']")
	WebElement setPIMPage;
	
	@FindBy(xpath="//h6[text()='PIM']")
	WebElement titleOfPimPage;
	
	@FindBy(xpath="//div[@class='oxd-form-row']//input[@class='oxd-input oxd-input--active']")
	WebElement setEmpId;

	@FindBy(xpath="//button[@type='submit']")
	WebElement clickSearch;
	
	@FindBy(xpath="//*[@class='orangehrm-container']")
	WebElement searchedRecordId;
	
	public PimPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	/*
	 * Author : Abhi Sakpal 
	 * Date : 09 Feb 2023 
	 * Description : This test method use to click on Pim page   
	 */
	public void clicknPimPageLink() {
		setPIMPage.click();
	}
	
	/*
	 * Author : Abhi Sakpal 
	 * Date : 09 Feb 2023 
	 * Description : This test method use to return Pim page text
	 * parameter: String   
	 */
	public String getPimPageTitle() {
		return titleOfPimPage.getText();
	}
	
	/*
	 * Author : Abhi Sakpal 
	 * Date : 09 Feb 2023 
	 * Description : This test method use to set emp id  
	 */
	public void setPimPageEmpId(String empId) {
		setEmpId.sendKeys(empId);
	}
	
	/*
	 * Author : Abhi Sakpal 
	 * Date : 09 Feb 2023 
	 * Description : This test method use to click search button  
	 */
	public void clickSearchBtn() {
		clickSearch.click();
	}
	
	/*
	 * Author : Abhi Sakpal 
	 * Date : 09 Feb 2023 
	 * Description : This test method use to get emp id from searched results
	 * Parameter: String  
	 */
	public String getEmpIdFromSearchedResults(String empId) {
		clickSearch.click();
		return searchedRecordId.findElements(By.xpath("//div[text()='"+empId+"']")).get(0).getText();
	}
	
	//all locators
/*	@FindBy(xpath="//span[text()='PIM']")
	WebElement pim;
	
	@FindBy(xpath="//*[text()='Employee Id']//parent::div//following-sibling::div//input")
	WebElement Id;
	
	@FindBy(xpath="//*[@type='submit']")
	WebElement submit;
	
	@FindBy(xpath="//*[text()='Jane ']//ancestor::div//*[text()='Smith']//parent::div//parent::div//span//i")
	WebElement chkbox;

	//initialization of variables
	public PimPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//all methods
	public void clkPimblock() {
		pim.click();
	}
	
	public void sendIDD(String ID) {
		Id.sendKeys(ID);
	}
	public void clkSubmitt() {
		submit.click();
	}
	public void chkboxx() {
		chkbox.click();
	}*/

}

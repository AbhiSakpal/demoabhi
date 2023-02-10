package Testngg;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class firsttest {

	@Test(priority=1,invocationCount=4)
	public void ac(){
	System.out.println("1st test");	
	}
	
	@Test(priority=2,invocationCount=5)
	public void ba(){
		System.out.println("2nd test");	
		//Reporter.log("checking",true);
		
		}
	

}

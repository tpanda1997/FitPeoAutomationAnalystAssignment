package testSteps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import pageObjects.fitPeoPage;

import stepDefinations.intilializationStep;

public class fitPeoTestSteps {

	

	WebDriver driver =intilializationStep.driver;
	
	fitPeoPage page = new fitPeoPage(driver);
	
	
	
	public void navigateToRevenueCalculatorPage() {
		
		
		
		page.clickRevenueCalculator();
			
	}
	
	
	public void scrollDown() {
		
		page.waitForRevenueCalculatorPage(driver);
		
		page.scrollDown(driver);
		
	}
	
	public void adjustTheSliderSection() {
		
		page.adjustSlider(driver);
		
	}
	
	public void enterPatientsTextBox() {
		
		page.enterPatientsTxtBx(driver, 260, false);
		
	}
	
    public void enterPatientsTextBoxinc() {
		
		page.enterPatientsTxtBx(driver, 260, true);
		
	}
  
	public void selectCptCodes() {
		
		page.clickCptCheckBoxes();	
		
	}
	
	public void validateTRR(String value) {
		
		Assert.assertEquals(value,page.getTrrValue());
		
	}
	
	
	public void validateSliderThumbValue(String value) {
		
		Assert.assertEquals(value,page.getsliderTumbValue());
		
	}
	
public void validatPatientsTextBox(String value) {
		
		Assert.assertEquals(value,page.getPatientsTxtBxValue());
		
	}
	
	
}

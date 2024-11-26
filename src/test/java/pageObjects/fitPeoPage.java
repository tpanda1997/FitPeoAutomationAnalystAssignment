package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class fitPeoPage {

	
	public fitPeoPage(WebDriver driver){
		
		PageFactory.initElements(driver,this);
	}
	
	
	
	@FindBy(xpath = "//div[text()='Revenue Calculator']") private WebElement revenueCalculator;
	
	@FindBy(xpath = "//input[contains(@class,'MuiInputBase-input')]") private WebElement patientsTxtBx;
	
	@FindBy(xpath = "//span[contains(@class,'MuiSlider-thumb')]") private WebElement sliderTumb;
	
	@FindBy(xpath = "//span[contains(@class,'MuiSlider-thumb')]/input") private WebElement sliderTumbValue;
	
	@FindBy(xpath = "//p[text()='CPT-99091']/..//input[contains(@class,PrivateSwitchBase-input)]") private WebElement cpt99091CkBx;
	
	@FindBy(xpath = "//p[text()='CPT-99453']/..//input[contains(@class,PrivateSwitchBase-input)]") private WebElement cpt99453CkBx;
	
	@FindBy(xpath = "//p[text()='CPT-99454']/..//input[contains(@class,PrivateSwitchBase-input)]") private WebElement cpt99454CkBx;
	
	@FindBy(xpath = "//p[text()='CPT-99474']/..//input[contains(@class,PrivateSwitchBase-input)]") private WebElement cpt99474CkBx;
	
	
	@FindBy(xpath = "//p[text()='Total Recurring Reimbursement for all Patients Per Month:']/p") private WebElement trr;
	
	
	
	//Action methods
	
	
	public void clickRevenueCalculator() {
		
		revenueCalculator.click();
	
		
	}
	
    public void scrollDown(WebDriver driver) {
    	
    	
		
	JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("window.scrollBy(0,350)", "");
	
	}
    
    
    public void adjustSlider(WebDriver driver) {
    	
    	
    	 Actions act = new Actions(driver);
		 
		act.dragAndDropBy(sliderTumb, 94, 0).build().perform();
		  act.sendKeys(Keys.ARROW_LEFT).build().perform();
		  act.sendKeys(Keys.ARROW_LEFT).build().perform();
		  act.sendKeys(Keys.ARROW_LEFT).build().perform();
    }
    
    
    public void clickCptCheckBoxes() {
    	
    	cpt99091CkBx.click();
    	cpt99453CkBx.click();
    	cpt99454CkBx.click();
    	cpt99474CkBx.click();
    }
    
    public String getTrrValue() {
    	
    	
		return trr.getText();
    	
    }
    
 public String getsliderTumbValue() {
    	
    	
		return sliderTumbValue.getAttribute("aria-valuenow");
    	
    }
 
 public String getPatientsTxtBxValue() {
 	
 	
		return patientsTxtBx.getAttribute("value");
 	
 }
    
    public void enterPatientsTxtBx(WebDriver driver,int valueToIncrease,boolean increment) {
    	
    	Actions act = new Actions(driver);
		for(int i=1;i<=valueToIncrease;i++) {
			
			if(increment)
		  
			act.sendKeys(Keys.ARROW_UP).build().perform();
			
			else
			
		    act.sendKeys(Keys.ARROW_DOWN).build().perform();	
		
		}
    	
    }
    
    
    public void waitForRevenueCalculatorPage(WebDriver driver) {
    	
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    	
    	wait.until(ExpectedConditions.visibilityOf(patientsTxtBx));
    	
    }
}

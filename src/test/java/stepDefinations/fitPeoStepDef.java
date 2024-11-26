package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import testSteps.fitPeoTestSteps;

public class fitPeoStepDef {

	
	fitPeoTestSteps steps = new fitPeoTestSteps();
	
	
	/*
	 * @Given("Navigate to the FitPeo Homepage") public void
	 * navigate_to_the_fit_peo_homepage() { intilializationStep inti = new
	 * intilializationStep(); inti.setUp(); }
	 */
	
	
	@Given("Navigate to the Revenue Calculator Page")
	public void navigate_to_the_revenue_calculator_page() {
		
		steps.navigateToRevenueCalculatorPage();
	
	}

	@Given("Scroll Down to the Slider section")
	public void scroll_down_to_the_slider_section() {
		
		steps.scrollDown();
	   
	}

	@When("user adjust the slider to {string} the bottom text field value should be updated to {string}")
	public void user_adjust_the_slider_to_the_bottom_text_field_value_should_be_updated_to(String string, String value) {
	 
		steps.adjustTheSliderSection();
		steps.validatPatientsTextBox(value);
		
	}

	@When("when the value {string} is entered in the text field, the slider position should be updated to {string}")
	public void when_the_value_is_entered_in_the_text_field_the_slider_position_should_be_updated_to(String string, String value) {
	    
		steps.enterPatientsTextBox();
		steps.validateSliderThumbValue(value);
	}

	@When("Select CPT Codes")
	public void select_cpt_codes() {
		
		steps.selectCptCodes();
	  
	}

	@Then("Validate Total Recurring Reimbursement value should be {string}")
	public void validate_total_recurring_reimbursement_value_should_be(String value) {
		
		steps.validateTRR(value);
	    
	}
	
	@When("now again change the value to {string} in the text field")
	public void now_again_change_the_value_to_in_the_text_field(String value) {
	  
		steps.enterPatientsTextBoxinc();
		
	}
	
}

package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class cucumberShoppingCart_7_SD extends BaseClass {

	

	@Given("User opens URL")
	public void User_opens_URL() {

		StartTheApp();

	}

	@And("User updates currency to pound")
	public void update_to_pound() {
		
		UpdateCurrencyToPound();
		
	}
	
	
	@When("User waits for element to load")
	public void waitForElement() throws InterruptedException {

		WaitForElementHardCodedValue();
		
	}
	

	@Then("currency should be updated to pound")
	public void validate_currency_is_set() {
		
		CheckCurrency();

	}
	

	
	
//	==================================================================================================================
	
	
	
	




	@Given("User try to find canon camera link")
	public void validate_cameraLink_is_displayed() {

		CameraLinkIsDisplayed();

	}

	@And("User click on Camera link")
	public void validate_CameraLink_Click() {

		ClickOnCamera();

	}

	@Then("Camera link is open")
	public void validate_CameraLink() {

		cameraLinkisOpen();

	}

	@Given("Add to cart button is displayed")
	public void validate_AddToCart_Displayed() {

		ATCIsDisplayed();

	}
	@And ("User click on Add to cart button")
	
	public void click_On_ATC() {
		
		ClickOnATC();
		
	}
	
	@Then("Error message is displayed")
	public void Error_Msg_Displayed() {
		
		
	}

}

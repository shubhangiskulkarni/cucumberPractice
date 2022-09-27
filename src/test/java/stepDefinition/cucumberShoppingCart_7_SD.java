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

public class cucumberShoppingCart_7_SD {
	
	
	WebDriver edgeDriver = new EdgeDriver();



	@Given("User opens URL")
	public void User_opens_URL() {
		
// TestStep #1
		edgeDriver.get("http://tutorialsninja.com/demo/index.php");
		
	}

	@Given("User updates currency to pound")
	public void update_to_pound() {
// TestStep #2 		
		WebElement we = edgeDriver.findElement(By.id("form-currency"));
		we.click();
		WebElement currency = edgeDriver.findElement(By.name("EUR"));
		currency.click();

	
	}

	@Then("currency should be updated to pound")
	public void validate_currency_is_set() {

					WebElement we = edgeDriver.findElement(By.xpath("//*[@id=\"form-currency\"]/div/button/strong"));
					System.out.println("Currency is set to- " + we.getText());
					Assert.assertEquals("€", we.getText());
	}

	@When("User waits for element to load")
	public void waitForElement() throws InterruptedException {
		
		Thread.sleep(1000);
	}
	
	
	@Given("User try to find canon camera link")
	public void validate_cameraLink_is_displayed() {
		
		WebElement camera = edgeDriver.findElement(By.xpath("//*[@id='content']/div[2]/div[4]/div/div/a/img"));
		camera.click();
		
	}
	
	
	@And("User click on Camera link")
	public void validate_CameraLink_Click() {
		
		WebElement addCameraToCart = edgeDriver.findElement(By.id("button-cart"));
		addCameraToCart.click();
		
	}
	
	@Given("Add to cart button is displayed")
	public void validate_AddToCart_Displayed() {
		
		WebElement addCameraToCart = edgeDriver.findElement(By.id("button-cart"));
		addCameraToCart.click();

		
	}
	
	
}

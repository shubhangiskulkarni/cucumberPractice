package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClass {

	public static WebDriver edgeDriver;

	public static void StartTheApp() {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\shubh\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		
		edgeDriver = new EdgeDriver();

		
		edgeDriver.get("http://tutorialsninja.com/demo/index.php");

	}
	
	public static void UpdateCurrencyToPound() {
		WebElement we = edgeDriver.findElement(By.id("form-currency"));
		we.click();
		WebElement currency = edgeDriver.findElement(By.name("EUR"));
		currency.click();

	}
	
	public static void WaitForElementHardCodedValue() throws InterruptedException {
		
		Thread.sleep(1500);
	}

	public static void CheckCurrency() {

		WebElement we = edgeDriver.findElement(By.xpath("//*[@id=\"form-currency\"]/div/button/strong"));
		System.out.println("Currency is set to- " + we.getText());
		Assert.assertEquals("€", we.getText());
	}
	
	
	public static void CameraLinkIsDisplayed() {
		
		WebElement camera = edgeDriver.findElement(By.xpath("//*[@id='content']/div[2]/div[4]/div/div/a/img"));
		camera.click();
		
	}
	
	
	public static void ClickOnCamera() {
		
		WebElement addCameraToCart = edgeDriver.findElement(By.id("button-cart"));
		addCameraToCart.click();
		
		
	}
	
	public static void cameraLinkisOpen() {
		WebElement addCameraToCart = edgeDriver.findElement(By.id("button-cart"));

		Assert.assertEquals(true, addCameraToCart.isDisplayed());
	}
	
	public static void ATCIsDisplayed() {
		WebElement addCameraToCart = edgeDriver.findElement(By.id("button-cart"));

		Assert.assertEquals(true, addCameraToCart.isDisplayed());
	}
	
	public static void ClickOnATC() {
		WebElement addCameraToCart = edgeDriver.findElement(By.id("button-cart"));
		addCameraToCart.click();
	}
	
	public static void ErrorMessageIsDisplayed() {
		WebElement selectMsg = edgeDriver.findElement(By.xpath("//*[@class='form-group required has-error']/div"));
		Assert.assertEquals(true, selectMsg.isDisplayed());
	}
	
	
	
	
	
	
}

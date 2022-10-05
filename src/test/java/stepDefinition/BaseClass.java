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

//=====================================================================================================================================
	
	public static void ClickHomePageButton() {
	WebElement homePageButton = edgeDriver.findElement(By.xpath("//*[@class='breadcrumb']/li/a/i"));
	
	homePageButton.click();
	}
	
	public void iphone_link_click()
	
	{	WebElement iphone = edgeDriver.findElement(By.xpath("//*[@id='content']/div[2]/div[2]/div/div[2]/h4/a"));
	iphone.click();
	
	}
	
	public void change_iphone_quntity() {
		WebElement quntity = edgeDriver.findElement(By.id("input-quantity"));

	quntity.clear();

	quntity.sendKeys("2");
	
	
	}
	
	public void iphone_Success_Msg() {
	WebElement successMsg = edgeDriver.findElement(By.xpath("//div[@id='product-product']/div[1]"));

	System.out.println(successMsg.getText());


	}

//=================================================================================================================================================
	
	public static void black_color_cart_button() {
	
	WebElement black_color_cart_button = edgeDriver.findElement(By.id("cart"));
	black_color_cart_button.click();
	
}


	public static void view_cart_button() {
	

	WebElement viewCart = edgeDriver.findElement(By.xpath("//*[@id=\"cart\"]/ul/li[2]/div/p/a[1]"));
	viewCart.click();
}


	public static void iphone_quntity_changed() {
	WebElement changeQuantity = edgeDriver
			.findElement(By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr/td[4]/div/input"));

changeQuantity.clear();
changeQuantity.sendKeys("3");

}


	public static void iphone_quantity_updated() {
	WebElement updateButton = edgeDriver
			.findElement(By.xpath("//*[@id='content']/form/div/table/tbody/tr/td[4]/div/span/button/i"));

			updateButton.click();

}
//tag6=================================================================================================================================================

	public static void iphone_Eco_Tax_Button() {
	
	WebElement ecoTax = edgeDriver.findElement(By.xpath("//*[@id='content']/div[2]/div[1]//tr[2]/td[2]"));

	System.out.println("Eco Tax - " + ecoTax.getText());
}

	public void iphone_Vat() {
	
	WebElement vat = edgeDriver.findElement(By.xpath("//*[@id='content']/div[2]/div[1]//tr[3]/td[2]"));

	System.out.println("VAT - " + vat.getText());
	
}

	public static void iphone_checkout_button() {
	
		
		WebElement checkOut = edgeDriver.findElement(By.xpath("//div[@class='pull-right']/a"));
	checkOut.click();
	
	}
	
	
	public static void iphone_Error_Msg() {
		
		WebElement productErrorMsg = edgeDriver
				.findElement(By.xpath("//div[contains(@class,\"alert alert-danger alert-dismissible\")]"));

		System.out.println(productErrorMsg.getText());
		
		
	}
	
	public static void iphone_remove() throws InterruptedException {
		
		
		WebElement remove = edgeDriver
				.findElement(By.xpath("//div[@id='content']//tbody/tr/td[4]//span/button[2]/i"));
		remove.click();

		Thread.sleep(1000);

		
		WebElement display = edgeDriver.findElement(By.xpath("//*[@id=\"content\"]/p"));

		System.out.println("Cart screen displayed? - " + display.isDisplayed());

		Thread.sleep(1000);

		if (display.isDisplayed()) {

			WebElement continuebtn = edgeDriver.findElement(By.xpath("//div[@id='content']/div/div/a"));

			System.out.println("Continue Button displayed? - " + continuebtn.isDisplayed());

			Thread.sleep(1000);

			continuebtn.click();
		} else {

			System.out.println("Cart is not empty!");
			
		}



	}
	
//tag7=================================================================================================================================================	
	
	public static void click_on_MacBook_Link() {
		
		WebElement macBook = edgeDriver.findElement(By.xpath("//div[@id='content']/div[2]/div[1]//h4/a"));
		macBook.click();
		
	}
	
	
	public static void macBook_quntity_Check() throws InterruptedException {
		

	WebElement macBookQty = edgeDriver.findElement(By.xpath("//div[@id='product']/div/input[1]"));

	Thread.sleep(1000);

	String qtyCheck = macBookQty.getAttribute("value");

	if (qtyCheck.equalsIgnoreCase("1")) {

		System.out.println("Macbook Quntity is 1 ");

	} else {
		System.out.println("Macbook Quntity is NOT 1.");

	}
	
	
	
	}
	
	
	
	public static void macBook_Add_To_Cart() {
	
		WebElement macBookAtc = edgeDriver.findElement(By.id("button-cart"));

		macBookAtc.click();
	
	
	
}
	
	public static void macBook_verify_success_msg() {
	
		WebElement showSuccessMsg = edgeDriver
			.findElement(By.xpath("//div[contains(@class,\"alert alert-success alert-dismissible\")]"));

	String macBooksuccessMsg = showSuccessMsg.getText();

	if (macBooksuccessMsg.contains("Success: You have added MacBook to your shopping cart!")) {

		System.out.println("Success Message is displayed ");

	} else {
		System.out.println("Success Message is NOT displayed");


}

	}
//tag8=========================================================================================================================
	

	public static void click_On_Shopping_Cart_Button() {
	
	
		WebElement shoppingCart = edgeDriver.findElement(
			By.xpath("//div[@class='container']/div[@id='top-links']/ul[@class='list-inline']/li[4]/a"));
	shoppingCart.click();
	
	
	}

	public static void click_On_Coupon_Code_Button() {
		
		
		WebElement useCouponCode = edgeDriver
				.findElement(By.xpath("//div[@id='accordion']//a[contains(@href,\"#collapse-coupon\")]"));
		useCouponCode.click();
		
		
		
	}
	
	public static void user_Enter_Coupon_Code_In_TexBox()  {
		
		WebElement enterCouponCode = edgeDriver.findElement(By.xpath("//div[@id='collapse-coupon']/div/div/input"));
		enterCouponCode.click();
		enterCouponCode.sendKeys("ABCD123");
		
	}
	
	public static void user_Apply_Coupon_Code() throws InterruptedException {
				
				WebElement applyCouponCode = edgeDriver.findElement(By.xpath("//input[@id='button-coupon']"));
				applyCouponCode.click();
				System.out.println("Code applied!");
				Thread.sleep(1000);
	}
	
	
	
	public static void code_Erroe_Msg_Dislpayed() {
		
		
		WebElement invalidCuponCodeMsg = edgeDriver
				.findElement(By.xpath("//*[@class='alert alert-danger alert-dismissible']"));
		System.out.println("Cupon error message is- " + invalidCuponCodeMsg.getText());

		
	}
	
	public static void quite() throws InterruptedException {
		
		Thread.sleep(3000);
		edgeDriver.quit();
		
	}
	
//tag9==========================================================================================================================================
	
	
	
	public static void click_On_GiftCertificate_Button() {
		
		
		WebElement useGiftCard = edgeDriver
				.findElement(By.xpath("//div[@id='accordion']//a[contains(@href,\"#collapse-voucher\")]"));
		useGiftCard.click();
	}
	
	public static void enter_GiftCertificate_Code() {
	
	WebElement enterGiftCardCode = edgeDriver
			.findElement(By.xpath("//div[@id='collapse-voucher']/div/div/input"));
	enterGiftCardCode.sendKeys("AXDFGH123");
	
	}
	
	
	public static void apply_GiftCertificate_code() {

	WebElement applyGiftCardCode = edgeDriver.findElement(By.xpath("//input[@id='button-voucher']"));
	applyGiftCardCode.click();
	
	
	}
	
	public static void giftCertificate_Error_Msg() throws InterruptedException {
	
	WebElement invalidGiftCardCodeMsg = edgeDriver
			.findElement(By.xpath("//*[@class='alert alert-danger alert-dismissible']"));
	System.out.println("Gift Card error message is- " + invalidGiftCardCodeMsg.getText());
	
	Thread.sleep(3000);
	
	
}
	
//tag10=====================================================================================================================================
	
	public static void clear_CouponCode() throws InterruptedException {
		
		Thread.sleep(1000);
		WebElement useCouponCode = edgeDriver
				.findElement(By.xpath("//div[@id='accordion']//a[contains(@href,\"#collapse-coupon\")]"));
		
		useCouponCode.click();
		
		Thread.sleep(1000);
		
		WebElement enterCouponCode = edgeDriver.findElement(By.xpath("//div[@id='collapse-coupon']/div/div/input"));
		enterCouponCode.click();
		enterCouponCode.clear();
		
		
		
	}
	
	
	public static void clear_GiftCertificate() throws InterruptedException {
		
		Thread.sleep(1000);
		WebElement useGiftCard = edgeDriver
				.findElement(By.xpath("//div[@id='accordion']//a[contains(@href,\"#collapse-voucher\")]"));
		useGiftCard.click();
		
		Thread.sleep(1000);
	WebElement enterGiftCardCode = edgeDriver
			.findElement(By.xpath("//div[@id='collapse-voucher']/div/div/input"));
	enterGiftCardCode.click();
	enterGiftCardCode.clear();
	
	
	}
	
	public static void mac_Book_CheckOut() {
		
		
		WebElement cartCheckOut = edgeDriver
				.findElement(By.xpath("//div[@id=\"content\"]//div[@class=\"pull-right\"]/a"));
		cartCheckOut.click();
		
	}
//tag11==============================================================================================================================	
	
	
	public static void details_checkOut_OPtions_Continue_Button() throws InterruptedException {
		
		Thread.sleep(3000);
	
	WebElement checkoutOptions_Button = edgeDriver.findElement(By.id("button-account"));
	checkoutOptions_Button.click();
	
	
	}
	
	public static void first_Name() throws InterruptedException {
		Thread.sleep(3000);
		
	WebElement checkoutFirstName= edgeDriver.findElement(By.id("input-payment-firstname"));
	checkoutFirstName.sendKeys("Ghanashyam");
	
	}
	
	
	public static void last_Name() {
		
		WebElement checkoutLastName= edgeDriver.findElement(By.id("input-payment-lastname"));
		checkoutLastName.sendKeys("Sundar");
		
	}
	
	
	public static void email_Add() {
		
		WebElement email= edgeDriver.findElement(By.id("input-payment-email"));
		System.out.println("email address registered is: " + "ghanashya.sunder" + Math.random() + "@yahoo.com");
		email.sendKeys("ghanashya.sunder" + Math.random() + "@yahoo.com");
		
	}
	
	public static void telephone_Number() {
		
	
	WebElement telephone= edgeDriver.findElement(By.id("input-payment-telephone"));
	telephone.sendKeys("512-400-6789");
	
}	
	
	public static void user_Passward() {
		
		
		WebElement password= edgeDriver.findElement(By.id("input-payment-password"));
		password.sendKeys("Bappamorya!");
	
	
	}
	
	
	
	
	public static void confirm_User_Passward() {
		
		WebElement confirmPassword= edgeDriver.findElement(By.id("input-payment-confirm"));
		confirmPassword.sendKeys("Bappamorya!");
		
	
}	
	public static void user_Company_Name() {
		
	WebElement companyName= edgeDriver.findElement(By.id("input-payment-company"));
	companyName.sendKeys("Nimpy Ninja");
	
	}
	
	public static void user_Add1() {
	WebElement address1= edgeDriver.findElement(By.id("input-payment-address-1"));
	address1.sendKeys("412,Spring Hill Pkwy");
	
	}
	
	public static void user_Add2() {
	WebElement address2= edgeDriver.findElement(By.id("input-payment-address-2"));
	address2.sendKeys("Apt-1300");
	
	}
	
	
	public static void user_City_Name() {
	WebElement city= edgeDriver.findElement(By.id("input-payment-city"));
	city.sendKeys("Atlanta");
	
	}
	
	
	public static void user_postal_code() {
	WebElement postCode= edgeDriver.findElement(By.id("input-payment-postcode"));
	postCode.sendKeys("12345");
	
	}
	
	public static void user_State_Name() {
	
	WebElement state= edgeDriver.findElement(By.xpath("//*[@id=\"input-payment-zone\"]/option[8]"));
	
	state.click();
	
	}
	
	
	public static void user_Newsletter() {
	WebElement newsletter= edgeDriver.findElement(By.id("newsletter"));
	newsletter.click();
	
	}
	
	public static void user_Agree_Button() {
	
	
	WebElement agree= edgeDriver.findElement(By.xpath("//*[@name=\"agree\"]"));
	agree.click();
	
	}
	
	
	
	public static void user_Register() {
	
	
	WebElement register= edgeDriver.findElement(By.id("button-register"));
	register.click();
	System.out.println("Clicked on register button.");

	
}
	
	public static void user_BillingDetails() {
	WebElement billingDetails= edgeDriver.findElement(By.xpath("//a[@href=\"#collapse-payment-address\"]"));
	billingDetails.click();
	
	}
	
	public static void user_ClickOn_BillContinue() throws InterruptedException {
		Thread.sleep(3000);
	WebElement billContinue = edgeDriver.findElement(By.xpath("//*[@id=\"button-payment-address\"]"));
	billContinue.click();
	}
	
//tag12=======================================================================================================================	
	public static void user_Payment_Comment_TextBox() throws InterruptedException {
		Thread.sleep(3000);
		
		WebElement commentsBox= edgeDriver.findElement(By.xpath("//textarea[@name='comment']"));
		commentsBox.sendKeys("I want discount on my Shopping");
		
		WebElement agreeTC= edgeDriver.findElement(By.xpath("//input[@type=\"checkbox\"]"));
		agreeTC.click();
		
	}
	
	public static void user_PaymentContinue() {
		
		WebElement paymentContinue = edgeDriver.findElement(By.id("button-payment-method"));
		paymentContinue.click();
		
		
		
	}
	
	public static void user_Payment_Error_Msg() {
		
		WebElement warningMsg = edgeDriver.findElement(By.xpath("//div[@class=\"alert alert-danger alert-dismissible\"]"));
		System.out.println("Warning :- " + warningMsg.getText());
		
	}
	
//tag13==========================================================================================================================================	
	
	
	public static void user_ContactUs_HyperLink() {
		
		
		WebElement contactUs = edgeDriver.findElement(By.xpath("//div[2][@class=\"col-sm-3\"]//li[1]/a"));
		contactUs.click();
	
	
}
	
	
	public static void user_submit_Contact_Request() {
		
		
		
		WebElement contactUsSubmit = edgeDriver.findElement(By.xpath("//input[@type='submit']"));
		contactUsSubmit.click();
	
}
	
	public static void user_Click_Continue_To_End() throws InterruptedException {

		Thread.sleep(3000);

		WebElement contactUsContinueBtn = edgeDriver.findElement(By.xpath("//*[@id=\"content\"]/div/div/a"));
		contactUsContinueBtn.click();

	}
	
	public static void enterUserComments() throws InterruptedException {
		Thread.sleep(1000);
		
		WebElement contactEnquiry = edgeDriver.findElement(By.id("input-enquiry"));
		contactEnquiry.sendKeys("Error on Payment");
		
	}


}

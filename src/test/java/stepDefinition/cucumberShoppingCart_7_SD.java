package stepDefinition;

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

	@And("User click on Add to cart button")

	public void click_On_ATC() {

		ClickOnATC();

	}

	@Then("Error message is displayed")
	public void Error_Msg_Displayed() {

		ErrorMessageIsDisplayed();
	}

//tag4=============================================================================================================================================

	@Given("User click on home page button")
	public void Click_Home_Page_Link() {

		ClickHomePageButton();

	}

	@And("User click on iphone link")
	public void click_iphone_link() {

		iphone_link_click();

	}

	@And("User change the quantity to two")

	public void iphone_quantity_changed() {

		change_iphone_quntity();

	}

	@When("User click on add to cart button")
	public void click_on_iphone_ATC() {

		ClickOnATC();

	}

	@Then("success message is displayed")
	public void iphone_success_msg_displayed() {

		iphone_Success_Msg();

	}

//tag5========================================================================================================================================		 

	@Given("user click on black color cart icon")
	public void cart_icon_displayed() {

		black_color_cart_button();

	}

	@And("click on view cart button")
	public void View_Cart_button_click() {

		view_cart_button();
	}

	@And("Change the quantity of iphone to 3")
	public void iphone_Quantity_changed() {

		iphone_quntity_changed();
	}

	@Then("click on update button")
	public void iphone_quantity_update() {

		iphone_quantity_updated();
	}

//tag6========================================================================================================================================

	@Given("user click on Eco_tax button")

	public void print_eco_tax() {

		iphone_Eco_Tax_Button();

	}

	@And("user click on Vat button")
	public void print_Vat_amt() {

		iphone_Vat();

	}

	@When("user click on checkout button")
	public void click_on_checkout_button() {

		iphone_checkout_button();

	}

	@Then("print the error message")
	public void print_Error_Msg() {

		iphone_Error_Msg();

	}

	@Then("user click on remove button and iphone is removed from the cart")
	public void iphone_removed_From_Cart() throws InterruptedException {

		iphone_remove();

	}

//tag7==============================================================================================================================================	

	@Given("user click on mac book link")

	public void click_on_macBook_link() {

		click_on_MacBook_Link();

	}

	@And("user check quntity is 1")

	public void macBook_quantity_Check() throws InterruptedException {

		macBook_quntity_Check();

	}

	@And("user click on add to cart button")

	public void macBook_ATC_Button() {

		macBook_Add_To_Cart();

	}

	@Then("user verify success message")

	public void verify_Success_Msg() {

		macBook_verify_success_msg();

	}

//tag8=============================================================================================================================================	
	@Given("User click on the shopping cart link")

	public void shopping_cart_link() {

		click_On_Shopping_Cart_Button();

	}

	@And("user click on use coupon code button")
	public void click_On_CouponCode_Button() {

		click_On_Coupon_Code_Button();

	}

	@And("user click on coupon code text box and enter coupon code")
	public void enter_Coupon_Code() {

		user_Enter_Coupon_Code_In_TexBox();

	}

	@When("user click on apply coupon button")
	public void apply_coupon_code() throws InterruptedException {

		user_Apply_Coupon_Code();

	}

	@Then("coupon code error message is displayed")
	public void error_Msg_Displayed() {

		code_Erroe_Msg_Dislpayed();

	}

//tag9===========================================================================================================================================
	@Given("User clicks on the gift certificate button")
	public void gift_certificate_click() throws InterruptedException {

		click_On_GiftCertificate_Button();

	}

	@And("User click on gift certificate text box and enter the code")
	public void apply_Gift_Certificate_Code() {

		enter_GiftCertificate_Code();

	}

	@And("user click on apply gift certificate button")
	public void click_apply_Gift_Certificate_Button() throws InterruptedException {

		apply_GiftCertificate_code();

	}

	@Then("gift certificate error message is displayed")
	public void gift_Certificate_Error_Msg() throws InterruptedException {

		giftCertificate_Error_Msg();

	}
//tag10============================================================================================================================================
	@Given("User clear coupon code")
	public void clear_coupon_code()throws InterruptedException {
		
		
		Thread.sleep(2000);
		
		clear_CouponCode();

	}

	@And("User clear gift certificate code")
	public void clear_gift_certificate() throws InterruptedException {
		
		
		clear_GiftCertificate();

	}

	@Then("User click on mac book check out button")
	public void macBook_checkOut()throws InterruptedException
	{
		
		mac_Book_CheckOut();
	}
	
//tag11================================================================================================================================	
	@Given ("User click on checkout option continue button")
	public void details_checkOut_Button() throws InterruptedException {
		
		
		details_checkOut_OPtions_Continue_Button();
	}
	
	@And ("User enter first name")
	public void user_First_Name() throws InterruptedException {
		
		first_Name();
		
	}
	
	@And ("User enter last name")
	public void user_Last_Name() {
		
		 last_Name();
		
		}	
	@And ("User enter email")
	public void user_Email() {
		
		email_Add();
		
	}
	
	@And ("User enter telephone number")
	public void user_Tele_Number() {
		
		telephone_Number();
		
	}
	
	@And ("User enter passward")
	public void passward() {
		
		user_Passward();
		
	}
	
	
	@And ("User enter confirm passward")
	public void user_Confirmed_Passward() {
		
		confirm_User_Passward();
		
	}
	
	
	@And ("User enter company name")
	public void company_Name() {
		
		user_Company_Name();
		
	}
	
	@And ("User enter address1")
	public void address1() {
		
		user_Add1();
		
	}
	
	
	@And ("User enter address2")
	public void address2() {
		
		user_Add2();
		
	}
	
	
	@And ("User enter city name")
	 public void city_Name() {
		 
		user_City_Name();
	 }
	
	
	@ And ("User enter post code")
	public void post_code() {
		
		user_postal_code() ;
		
	}
	
	@ And ("User enter state")
	public void state() {
		user_State_Name();
		
	}
	
	@And ("User enter newsletter")
	public void newsLetter() {
		
		user_Newsletter();
		
	}
	
	@And ("User click on agree button")
	public void agree_Button() {
		
		user_Agree_Button();
		
	}
	
	
	@And ("User click on register button")
	public void register_Button() throws InterruptedException {
		
		user_Register();
		
	}
	
	
	@ And ("User click on billing details")
	public void billing_Details() {
		
		user_BillingDetails();
		
	}
	
	 @And ("User click on billing continue")
	 public void billing_Continue() throws InterruptedException {
		 
		 user_ClickOn_BillContinue();
		 
	 }
//tag12======================================================================================================================================	 
	 @ Given("user adds comment")
	 public void comment_button() throws InterruptedException {
		 
		 user_Payment_Comment_TextBox();
		 
	 }
	 
	 @When ("clicks on payment continue button")
	 public void paymrnt_Contunue_Click() {
		 
		 user_PaymentContinue();
	 }
	 
	 @Then ("user checks the error message for payment method")
	 public void payment_Error_Msg() {
		 
		 user_Payment_Error_Msg();
	 }
//tag13==============================================================================================================================================
	 
	@Given ("user clicks on contact us hyperlink")
	public void contact_Us_Link() throws InterruptedException {
		
		user_ContactUs_HyperLink();
		
	}
	 
	@When ("submit a contact request")
	public void contact_request() {
		
		user_submit_Contact_Request();
		
	}
	
	@Then ("click submit button to end")
	public void continue_Button_End() throws InterruptedException {
		
		
		user_Click_Continue_To_End();
		
	}
	
	@And("user enters comments")
	public void enterComments() throws InterruptedException {
		enterUserComments();
		
	}
	
	 
	@Then("User quites the browser")
	public void tearDown() throws InterruptedException {

		quite();

	}

}

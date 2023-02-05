package stepDefinitions;

import org.openqa.selenium.WebDriver;		
import hooks.Hooks;
import io.cucumber.java.en.*;
import pageobjectmodel.LoginPage;

public class Login_invalid {
	public WebDriver driver;
	LoginPage login;
	
	public Login_invalid()
	{
		driver=Hooks.getDriver();
	}
	
	@Given("user enters input invalid {string} and {string}")
	public void user_enters_input_invalid_and(String userName, String passWord) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		   login = new LoginPage(driver);
		   login.login(userName, passWord);
		   Thread.sleep(1000);
	}

	@And("user clicks on đăng nhâp button")
	public void user_clicks_on_đăng_nhâp_button() throws Exception {
		login.clicklogin();
		Thread.sleep(500);
	}

	@Then("Ui is show validatioon")
	public void ui_is_show_validatioon() {
		login.verify_validation();
		String e_validation="Tên đăng nhập hoặc mật khẩu không đúng!";
		String a_validation=login.validation.getText();
		org.testng.Assert.assertEquals(a_validation, e_validation);
	}

}

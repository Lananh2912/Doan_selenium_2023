package stepDefinitions;

import org.openqa.selenium.WebDriver;		
import hooks.Hooks;
import io.cucumber.java.en.*;
import pageobjectmodel.AddPage;
import pageobjectmodel.LoginPage;


public class addCV {
	AddPage addPage;
	public WebDriver driver;
	LoginPage login;
	
	public addCV()
	{
		driver=Hooks.getDriver();
		login = new LoginPage(driver);
		addPage = new AddPage(driver);
	}
	
	@Given("user enters valid {string} and {string}")
	public void user_enters_valid_and(String userName, String passWord) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		   login.login(userName, passWord);
		   Thread.sleep(1000);
	}

	@And("click on login button")
	public void click_on_login_button()  throws Exception {
		login.clicklogin();
		Thread.sleep(500);
	}

	@When("click tag Quan ly cong viec and click button them moi")
	public void click_tag_quan_ly_cong_viec_and_click_button_them_moi() throws Exception {
	    addPage.clickadd();
	}

	@And("user enter input information cong viec {string} and {string} and thong tin khac")
	public void user_enter_input_information_cong_viec_and_and_thong_tin_khac(String tenCongViec, String moTa) throws Exception {
	   addPage.enterInfor(tenCongViec, moTa);
	}

	@And("click button them moi")
	public void clck_button_them_moi() throws Exception {
	    addPage.ClickThemMoi();
	    Thread.sleep(1000);
	}
	
	@When("click tag quan ly cong viec")
	public void click_tag_quan_ly_cong_viec() {
	    addPage.clickQLCV();
	}
	
	@And("user enter ten cong viec moi {string}")
	public void user_enter_input_information_cong_viec(String name) throws Exception {
	    addPage.search(name);
	}
	@Then("Verify new cong viec is correctly displayed on quan ly cong viec window")
	public void verify_new_cong_viec_is_correctly_displayed_on_quan_ly_cong_viec_window() {
		addPage.verifyAdd();
	}


}

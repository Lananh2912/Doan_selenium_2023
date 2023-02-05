package stepDefinitions;

import org.openqa.selenium.WebDriver;		
import hooks.Hooks;
import io.cucumber.java.en.*;
import pageobjectmodel.AddPage;
import pageobjectmodel.LoginPage;

public class UpdateCV {
	AddPage addPage;
	public WebDriver driver;
	LoginPage login;
	
	public UpdateCV()
	{
		driver=Hooks.getDriver();
		login = new LoginPage(driver);
		addPage = new AddPage(driver);
	}
	
	@Given("user enters valid {string}, {string}")
	public void user_enters_valid(String userName, String passWord) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		   login.login(userName, passWord);
		   Thread.sleep(1000);
		   login.clicklogin();
		   Thread.sleep(500);
	}

	@When("click tag Quan ly cong viec")
	public void click_tag_quan_ly_cong_viec() {
	    addPage.clickQLCV();
	}

	@And("user enter input information cong viec {string}")
	public void user_enter_input_information_cong_viec(String name) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    addPage.search(name);
	}

	@And("click button cap nhap")
	public void click_button_cap_nhap() {
			addPage.ClickButtonCapNhap();
	}

	@And("user enter input cap nhap cong viec: {string},{string}")
	public void user_enter_input_cap_nhap_cong_viec(String tenCongViec, String moTa) throws Exception {
		  addPage.enterInforCapNhap(tenCongViec, moTa);
		  Thread.sleep(9000);
	}
	
	@Then("Verify update cong viec success")
	public void verify_update_cong_viec_success() {
		addPage.verifyCapNhap();
	}
	
	@When("user click button tam dung and popup button yes")
	public void user_click_button_tam_dung_and_popup_button_yes() throws Exception {
        addPage.ActiveTamdung();
	  
	}

	@Then("Verify tam dung cong viec success")
	public void verify_tam_dung_cong_viec_success() {
		addPage.verifyCapNhap();
	}
	
	
}

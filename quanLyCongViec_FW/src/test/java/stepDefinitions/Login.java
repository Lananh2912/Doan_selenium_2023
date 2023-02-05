package stepDefinitions;

import static org.junit.Assert.assertEquals;		
import org.openqa.selenium.WebDriver;		
import io.cucumber.java.en.*;
import pageobjectmodel.LoginPage;
import hooks.Hooks;

public class Login  {	
	
	public WebDriver driver;
	LoginPage login;
	
	public Login()
	{
		driver=Hooks.getDriver();
	}
	
	@Given("title of login page is Quan Ly cong Viec")
	public void title_of_login_page_is_quan_ly_cong_viec() {
		 String title = driver.getTitle();
		 System.out.println(title);
	}

	@When("user enters {string} and {string}")
	public void user_enters_and(String userName, String passWord) throws Exception {
	   login = new LoginPage(driver);
	   login.login(userName, passWord);
	   Thread.sleep(1000);
	}

	@And("user clicks on login button")
	public void user_clicks_on_login_button() throws Throwable {
	   login.clicklogin();
	}

	@Then("user is on home pag")
	public void user_is_on_home_pag() {
		login.verify();
		String title=login.title.getText();
		assertEquals("Task Management", title);
	}
}		

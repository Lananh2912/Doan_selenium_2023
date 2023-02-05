package hooks;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Hooks {
	private static WebDriver driver;
	public static WebDriver getDriver() {
        return driver;
    }

	@Before(order = 1)
	public void stateOfTheAUT() {			
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
        driver.manage().window().maximize();			
        driver.get("http://localhost:8080/ZKTaskManagement/");
	}
	@After(order=1)
	public static void postConditions() throws Exception
	{
		driver.close();
	}
}

package StepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.Homepage;
import PageObject.LoginPage;
import io.cucumber.java.en.*;

public class StepDef {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public WebDriver driver;

	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) {
		driver.get(url);

	}

	@When("User enters Username as {string} and password as {string}")
	public void user_enters_username_as_and_password_as(String  Username, String password) {
		LoginPage lgpage=new LoginPage(driver);

		lgpage.enterUsername( Username);
		lgpage.enterPassword(password);
	}

	@When("Click on login")
	public void click_on_login() {
		LoginPage lgpage=new LoginPage(driver);

		lgpage.ClickonLogin();
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String expectedTitle) throws InterruptedException {
		Thread.sleep(5000);
		String actualtitle = driver.getTitle();
		System.out.println("actaul:"+actualtitle);
		if(actualtitle.equals(expectedTitle))
		{
			Assert.assertTrue(true);//pass
		}
		else
		{
			Assert.assertTrue(false);//fail

		}
	}

	@When("User click on log out link")
	public void user_click_on_log_out_link() {
		Homepage h=new Homepage(driver);
		h.Logout();

	}
	

	@Then("close Browser")
	public void close_browser() {
		
		driver.close();

	}

}

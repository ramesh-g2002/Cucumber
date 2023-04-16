package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
 WebDriver idriver;
public LoginPage(WebDriver driver)
{
	idriver=driver;
	PageFactory.initElements(driver, this);
}
	@FindBy(id="username")
	WebElement untbx;
	@FindBy(name="pwd")
	WebElement pwdtbx;
	@FindBy(xpath = "//div[text()='Login ']")
	WebElement lgbtn;

public void enterUsername(String username)
{
	//untbx.clear();
	untbx.sendKeys(username);
	
}
public void enterPassword(String password)
{
	//pwdtbx.clear();
	pwdtbx.sendKeys(password);
	
}

public void ClickonLogin()
{
	lgbtn.click();
}
}

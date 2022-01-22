package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='txtUsername']")
	public WebElement userName;

	@FindBy(xpath = "//input[@id='txtPassword']")
	public WebElement password;
	
	@FindBy(xpath = "//input[@id='btnLogin']")
	public WebElement loginButton;

}

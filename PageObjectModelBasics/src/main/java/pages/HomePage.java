package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.Page;

public class HomePage extends Page {

	

	
	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id="email")
	public WebElement email;
	
	@FindBy(id="pass")
	public WebElement pass;
	
	@FindBy(id="u_0_b")
	public WebElement loginBtn;
	
	
	
	public LandingPage doLogin(String userName, String password) {
		
		
		email.sendKeys(userName);
		pass.sendKeys(password);
		loginBtn.click();
		
		return new LandingPage(driver);
		
		
	}
	
	@FindBy(id="u_0_2")
	public WebElement signUp;
	
	public void createAccount() {
		
		
		signUp.click();
		
	}
	
	@FindBy(id="//*[@id=\\\"u_0_a\\\"]/div[3]/a")
	public WebElement forgotPass;
	
	public void forgotPassword() {
		
		forgotPass.click();
		
	}
	
	public void validateLinks() {
		
		
	
	}
	
}

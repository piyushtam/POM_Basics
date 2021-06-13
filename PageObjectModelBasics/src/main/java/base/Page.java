package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Page {
	
	/* Here all the child class have IS A relation with parent class--> Inheritance
	* HomePage
	* LandingPage
	* MyProfilePage
	*
	*/
	
	public WebDriver driver;
	
	public Page(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

}

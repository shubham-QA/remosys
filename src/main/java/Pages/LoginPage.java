package Pages;

import Base.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(@xpath="//a[@class='_1_3w1N']") private WebElement loginButton;
	@FindBy(@xpath="//input[@class='_2IX_2- VJZDxU']") private WebElement mobileNumberField;
	@FindBy(@xpath="//button[@class='_2KpZ6l _2HKlqd _3AWRsL']") private WebElement requestOtpButton;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	

}

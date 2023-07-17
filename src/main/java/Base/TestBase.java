package Base;

import java.time.Duration;

public class TestBase {
	public static Webdriver driver;
	
	//driver is defined globally by which it can be used by all page and test classes
	//Static cause single copy of driver will be used all across the classes
  
public void initialization() throws Exception //This method open the browser and enter the application URL
{
	WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 driver.get("https://www.flipkart.com/");
	 

}
}

	


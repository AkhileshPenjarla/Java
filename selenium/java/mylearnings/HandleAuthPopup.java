package mylearnings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleAuthPopup {
	WebDriver driver;
	@Test
	public void login() {
		driver=new ChromeDriver();

		//without using username and password
		driver.get("http://the-internet.herokuapp.com/basic_auth");
		
		
		//withusing username and password
		//driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
	}

}

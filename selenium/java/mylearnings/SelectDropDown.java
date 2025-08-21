package mylearnings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectDropDown {
	WebDriver driver;
	@Test
	public void login() {
		driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement dis=driver.findElement(By.xpath("//select[@id='country']"));
		Select dissp=new Select(dis);
		//dissp.selectByValue("usa"); //which is visible in inspect value
		dissp.selectByVisibleText("United States"); //which is visible in scroll down
		
		
	}

}

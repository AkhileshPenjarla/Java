package mylearnings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Mouse_Hover {
	WebDriver driver;
	
	@Test
	public void login() throws Exception {
		driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Actions action=new Actions(driver);
		WebElement web=driver.findElement(By.xpath("//ul[@class='top-menu']//a[normalize-space()='Computers']"));
		action.moveToElement(web).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[normalize-space()='Desktops'])[1]")).click();
		
	}

}

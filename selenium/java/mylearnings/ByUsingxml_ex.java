package mylearnings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;

public class ByUsingxml_ex {
	WebDriver driver;
	
	@BeforeClass
	public void beforeclass() throws Exception {
		System.out.println("This is for beforeclass");
		driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
	}
	
	@Test
	public void login() {
		Actions action=new Actions(driver);
		WebElement source=driver.findElement(By.xpath("//ul[@class='top-menu']//a[normalize-space()='Computers']"));
		action.moveToElement(source).perform();
		
		WebElement sou=driver.findElement(By.xpath("//ul[@class='top-menu']//a[normalize-space()='Desktops']"));
		action.click(sou).perform();
		driver.findElement(By.xpath("//div[@class='page-body']//div[2]//div[1]//div[2]//div[3]//div[2]//input[1]")).click();
		driver.findElement(By.xpath("//input[value='Add to cart']")).click();
		
	}
	
	

}

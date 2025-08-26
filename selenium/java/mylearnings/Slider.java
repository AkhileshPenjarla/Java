package mylearnings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Slider {
WebDriver driver;
	
	@Test
	public void login() throws Exception {
		driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement source1=driver.findElement(By.xpath("//div[@id='HTML7']//span[2]"));
		Actions source=new Actions(driver);
		source.clickAndHold(source1).moveByOffset(30, 0).release().build().perform();
	}

}

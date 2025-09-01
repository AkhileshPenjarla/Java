package mylearnings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Resizeable {
WebDriver driver;
	
	@Test
	public void login() throws Exception {
		driver=new ChromeDriver();
		driver.get("https://jqueryui.com/resizable/");
		driver.switchTo().frame(0);
		
		WebElement source=driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
		Actions action=new Actions(driver);
		Thread.sleep(2000);
		action.clickAndHold(source).moveByOffset(30, 20).build().perform();
		Thread.sleep(2000);

}
}

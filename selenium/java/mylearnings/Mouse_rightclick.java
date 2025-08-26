package mylearnings;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Mouse_rightclick {
WebDriver driver;
	
	@Test
	public void login() throws Exception {
		driver=new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		Actions action=new Actions(driver);
		WebElement web=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		action.contextClick(web).perform();
		Thread.sleep(2000);
		
		action.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		
		action.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		
		action.sendKeys(Keys.RETURN).perform();

}
}

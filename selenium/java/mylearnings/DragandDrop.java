package mylearnings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragandDrop {
WebDriver driver;
	
	@Test
	public void login() throws Exception {
		driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/#");
		
		WebElement source=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement target=driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions action=new Actions(driver);
		
		//Approach-1
	//	action.dragAndDrop(source, target).perform();
		
		//Approach-2
		action.clickAndHold(source).moveToElement(target).build().perform();

}}

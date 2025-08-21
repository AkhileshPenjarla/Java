package mylearnings;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Handlecheckbox {
	WebDriver driver;
	@Test
	public void login() {
		driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//input[@id='sunday']")).click();
		
		//select all the checkboxs
		List<WebElement> we= driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		//aproach 1
		//for(int i=0;i<we.size();i++) {
		//	we.get(i).click();
		//}
		//approach 2
		/*for(WebElement wew:we) {
			wew.click();
		}*/
		
		//select last 3 checkboxes--totalnocheck-how many checkboxes to select=starting index
		//7-3=4(starting index)
		for(int i=4;i<we.size();i++) {
			we.get(i).click();
		}
		//
		
		//unselect checkboxes
		for(int i=0;i<we.size();i++) {
			if(we.get(i).isSelected()) {
				we.get(i).click();
			}
		}
		
		
		
	}

}

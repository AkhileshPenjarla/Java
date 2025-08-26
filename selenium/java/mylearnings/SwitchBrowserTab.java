package mylearnings;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SwitchBrowserTab {
	WebDriver driver;
	
	@Test
	public void login() {
		driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='New Tab']")).click();
		//String parent=driver.getWindowHandle();
		Set<String>window=driver.getWindowHandles();
		for(String windows:window) {
			//if(!windows.equals(parent)) {
				driver.switchTo().window(windows);
			//}
		}
		driver.findElement(By.xpath("//a[text()='Mock Interviews']")).click();
		
		
	}
	

}

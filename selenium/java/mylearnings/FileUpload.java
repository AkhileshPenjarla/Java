package mylearnings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUpload {
WebDriver driver;
	
	@Test
	public void login() {
		driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='singleFileInput']")).sendKeys("C:\\Users\\hi\\OneDrive\\Pictures\\Screenshots\\Screenshot 2024-11-04 192918.png");
		
}
}

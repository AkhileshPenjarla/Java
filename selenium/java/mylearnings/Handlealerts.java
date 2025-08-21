package mylearnings;

import org.openqa.selenium.Alert;
//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Handlealerts {
	WebDriver driver;
	@Test
	public void login() {
		driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		/*//Normal alert with Ok button
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		//driver.switchTo().alert().accept();
		Alert myalert=driver.switchTo().alert();
		System.out.println(myalert.getText());
		myalert.accept();
		*/
		
		//alert with ok and cancel button
		/*driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		driver.switchTo().alert().dismiss();*/
		
		//sendkeys in alert
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		Alert alert=driver.switchTo().alert();
		alert.sendKeys("Akhilesh");
		alert.accept();
		
	}

}

package mylearnings;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultipleBroswerwindow {
	WebDriver driver;
	
	@Test
	public void login() {
		driver=new ChromeDriver();
		driver.get("https://www.dezlearn.com/multiple-browser-windows/");
		driver.findElement(By.id("u_7_8")).click();
		Set<String> windows=driver.getWindowHandles();
		for(String window:windows) {
			System.out.println(window);
			driver.switchTo().window(window);
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
			System.out.println("---------------------");
			if(driver.getCurrentUrl().equals("61B68A9A0EA8CB97B8C1184E76AADACA")) {
				driver.switchTo().window(window);
			}
		}
		driver.findElement(By.className("gLFyf")).sendKeys("Hii");
		
	}

}

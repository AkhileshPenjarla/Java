package mylearnings;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollingPage {
WebDriver driver;
	
	@Test
	public void login() {
		driver=new ChromeDriver();
		driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		 
		// 1)Scrolling down page by pixel number
		js.executeScript("window.scrollBy(0,3000)", "");
		System.out.println(js.executeScript("return window.pageYOffset;"));//return 3000
		
		// 2) Scrolling util the element is visible
		WebElement wb=driver.findElement(By.xpath("//td[normalize-space()='Mali']"));
		js.executeScript("arguments[0].scrollIntoView();",wb);
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		
		//  3)Scroll till end
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;"));
	}
}

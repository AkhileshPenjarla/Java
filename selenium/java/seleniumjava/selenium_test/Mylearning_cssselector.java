package seleniumjava.selenium_test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Mylearning_cssselector {
	WebDriver driver;
	@Test
	public void login() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		System.out.println(driver.findElement(By.id("day")).getAttribute("value"));
		List<WebElement> we=driver.findElements(By.xpath("//select[@id='day']"));
		for(WebElement w:we) {
			if(w.getText().trim().equals("1")) {
				w.click();
				System.out.println(w.getAttribute("value"));
				break;
			}
		}
		
		
	}	
}

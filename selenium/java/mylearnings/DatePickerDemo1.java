package mylearnings;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DatePickerDemo1 {
	WebDriver driver;
	
	@Test
	public void login() {
		driver=new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		//must use while for month& year and also for drop down while should use for month not for year
		while(true) {
			String month=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String year=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		if(month.equals("November")&&year.equals("2025")){
			break;	
		}else {
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		}
		}
		
		List<WebElement> date=driver.findElements(By.xpath("//tbody/tr/td"));
	     for(WebElement dates:date) {
	    	 if(dates.getText().equals("22")) {
	    		 dates.click();
	    	 }
	     }
	}

}

package mylearnings;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CaptureScreenshot {
WebDriver driver;
	
	@Test
	public void login() {
		driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		// 1) Full page Screenshot
		/*TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File targetfile=new File(System.getProperty("user.dir")+"//Screenshots//fullpage.png");
		source.renameTo(targetfile);
		*/
		
		// 2) TakeScreehshot specific one
		
		WebElement table=driver.findElement(By.xpath("//table[@name='BookTable']"));
		File source=table.getScreenshotAs(OutputType.FILE);
		File target=new File(System.getProperty("user.dir")+"//Screenshots//tablesection.png");
		source.renameTo(target);

}
}

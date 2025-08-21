package demoWebShop;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Practice_demoweb {
	WebDriver driver;
	
	
	@BeforeClass
		public void LaunchBrowser() {
			 driver=new ChromeDriver();
			driver.manage().window().maximize();
			
		}
	@Test(priority=1,groups= {"smoke"})
	public void registerNewUser() throws InterruptedException {
		driver.get("https://demowebshop.tricentis.com/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/login']"))).click();
	}
	
	@Test(priority=2,groups= {"regression"})
	public void logindetails() {	
		driver.findElement(By.id("Email")).sendKeys("marvel01@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("IronMan");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		System.out.println(driver.getTitle());
	}
	@Ignore
	@Test(groups= {"smoke"})
	public void digitaldown() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@href='/digital-downloads']")).click();
		Thread.sleep(1000);
	}
	@Ignore
	@Test(groups= {"smoke"})
	public void addcart() {
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
	}
	@Test(priority=3,groups= {"smoke"})
	public void viewcart() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='cart-label']")).click();
		System.out.println(driver.getTitle());
	}
	//dependsongroup
	  @Test(dependsOnGroups = {"smoke", "regression"})
	    public void finalReportTest() {
	        System.out.println("Final Report: All smoke & regression tests completed successfully.");
	    }

	
	@AfterClass
	public void afterClass() {
		System.out.println("closing the browser");
	    if (driver!=null) {
		   driver.quit();
		}
}
}


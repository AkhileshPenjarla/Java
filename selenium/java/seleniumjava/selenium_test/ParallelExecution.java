package seleniumjava.selenium_test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

public class ParallelExecution {
    WebDriver driver;

  

    @Test(dataProvider="logInTestData",priority=1)
    public void loginTest(String userName, String password) {
    	 driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
        System.out.println("Performing Login");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));

        WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Email")));
        emailField.clear();
        emailField.sendKeys(userName);

        WebElement passwordField = driver.findElement(By.id("Password"));
        passwordField.clear();
        passwordField.sendKeys(password);

        driver.findElement(By.xpath("//button[@type='submit']")).click();
    

   
    
        // Click Catalog
       driver.findElement(By.xpath("//p[normalize-space()='Catalog']")).click();

        // Click Products submenu
        driver.findElement(By.xpath("//p[normalize-space()='Products']")).click();
    
    }
//    @AfterMethod
//    public void tearDown() {
//        if (driver != null) {
//            driver.quit();
//        }
//    }

    @DataProvider(name="logInTestData")
    public Object[][] logInData() {
        return new Object[][] {
            {"admin@yourstore.com", "admin"}   // username, password
        };
    }
}

package seleniumjava.selenium_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome_test {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hi\\Downloads\\chrome-win32 (1)\\chrome-win32\\chrome.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		System.out.println(driver.getTitle());
	}
}
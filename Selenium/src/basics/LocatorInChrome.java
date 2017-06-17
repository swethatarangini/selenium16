package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorInChrome {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\selenium topics\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://gmail.com");
		
		
	}

}

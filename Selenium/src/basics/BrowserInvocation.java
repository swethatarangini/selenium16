package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserInvocation {
	public static void main(String[] args) {
	
		
	

	System.setProperty("webdriver.chrome.driver", "E:\\selenium topics\\chromedriver.exe");

	WebDriver driver= new ChromeDriver();
	driver.get("http://www.facebook.com");
	driver.manage().window().maximize();
	System.out.println(driver.getTitle());
	
	}

}

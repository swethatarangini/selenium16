package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorWithFirebug {

	public static void main(String[] args) throws InterruptedException {
		/*WebDriver driver = new FirefoxDriver();
		driver.get("https://www.w3schools.com");
		driver.findElement(By.xpath("html/body/div[7]/div[1]/div[1]/a[2]")).click();*/
		
		//System.setProperty("webdriver.firefox.driver", "E:\\selenium topics\\geckodriver.exe");
		WebDriver driver1 = new FirefoxDriver();
		driver1.get("https://www.gmail.com");
		
		
		driver1.findElement(By.id("identifierId")).sendKeys("swethatarangini15@gmail.com");
		driver1.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).click();
		Thread.sleep(5000);
		driver1.findElement(By.xpath(".//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("chinni16");
		driver1.findElement(By.xpath(".//*[@id='passwordNext']/content/span")).click();
	
		/*driver1.get("https://www.udemy.com/");
		driver1.findElement(By.xpath(".//*[@id='udemy']/div[1]/div[1]/div[4]/div[3]/div/require-auth/div/a")).click();
		driver1.get("https://www.udemy.com/join/login-popup/?next=/user/logout/%3Fh%3DE0cZclxaQngT");*/
		
	/*	driver1.findElement(By.id("id_email")).sendKeys(" rk.krothapalli@gmail.com");
		driver1.findElement(By.name("password")).sendKeys("amenGOTO45");
		driver1.findElement(By.xpath(".//*[@id='submit-id-submit']")).click();
	driver1.findElement(By.xpath(".//*[@id='discovery-unit-18456']/course-list-unit/react-component/div/div/div[2]/div/div/div[1]/div/a/span[1]/img")).click();*/
		
		
	}
}

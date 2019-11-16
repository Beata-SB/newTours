package pl.lait.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Init {

	
	static WebDriver driver;
	
	public static WebDriver getDriver() {
		
        System.setProperty("webdriver.chrome.driver", "C:/Users/Beata/Desktop/chromedriver.exe");
        System.out.println( "Hello World!Odpalamy Chrome" );
        driver = new ChromeDriver ();
        driver.get("http://newtours.demoaut.com");
		return driver;
	}
}

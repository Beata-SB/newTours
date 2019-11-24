package pl.lait.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import pl.lait.pageObjects.MainPage;

public class ReservationNewStyleTest {
	
	
	WebDriver driver; 
	
	@Before
	public void openPage() {
		driver = Init.getDriver();
	}					
	
	@Test
	public void loginTest() {
		MainPage mp = new MainPage(driver);
		mp.goToLoginPage();
		mp.loginAs("Beata1212", "qwe123");
	}


	@After
	public void tearDown() {
		Init.end();
	}
}

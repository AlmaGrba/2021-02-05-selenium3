package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import objects.Home;

public class TestYT {
	
private static WebDriver driver;
	
	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
		driver = new ChromeDriver();
		
	}
	
	@Test (priority = 0)
	public void testPesma () {
		driver.navigate().to("https://www.youtube.com/");
		Home.searchSong(driver);
		
		String current = driver.getCurrentUrl();
		String expected = "https://www.youtube.com/results?search_query=rick+astley+never+gonna+give+you+up"; 
		
		Assert.assertEquals(current, expected);
	}
	
	@Test (priority = 1)
	public void pustiPesmu () {
		driver.navigate().to("https://www.youtube.com/results?search_query=rick+astley+never+gonna+give+you+up");
		Home.playSong(driver);
		
		String current = driver.getCurrentUrl();
		String expected = "https://www.youtube.com/watch?v=dQw4w9WgXcQ"; 
		
		Assert.assertEquals(current, expected); 
		
	}
	@Test (priority = 2)
	public void drugaPesma () {
		driver.navigate().to("https://www.youtube.com/watch?v=dQw4w9WgXcQ");
		Home.playSong(driver);
		
		String current = driver.getCurrentUrl();
		String expected = "https://www.youtube.com/watch?v=dQw4w9WgXcQ&list=RDdQw4w9WgXcQ&start_radio=1&t=1"; 
		
		Assert.assertEquals(current, expected);
}
}

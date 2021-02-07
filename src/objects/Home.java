package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Home {
	
	public static final String URL = "https://www.youtube.com/";
	public static final String URL_SEARCH = "https://www.youtube.com/results?search_query=rick+astley+never+gonna+give+you+up"; 
	public static final String URL_SONG = "https://www.youtube.com/watch?v=dQw4w9WgXcQ";
	public static final String NEW_SONG = "https://www.youtube.com/watch?v=dQw4w9WgXcQ&list=RDdQw4w9WgXcQ&start_radio=1&t=1";
	
	public static void searchSong (WebDriver driver) {
		
		driver.get(URL);
		driver.findElement(By.xpath("//*[@id=\"search\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"search\"]")).sendKeys("Rick Astley Never gonna give you up");
		driver.findElement(By.xpath("//*[@id=\"search\"]")).sendKeys(Keys.ENTER);
	}
	
	public static void playSong (WebDriver driver) {
		driver.findElement(By.xpath("//*[@id=\"video-title\"]/yt-formatted-string")).click();
	}
	
	public static void seconSong (WebDriver driver) {
		driver.findElement(By.xpath("//*[@id=\"video-title\"]")).click();
}
}

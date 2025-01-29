package Selenium_Introduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v129.page.model.WebAppManifest;

import dev.failsafe.internal.util.Assert;

public class AsseertionWeb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://www.spicejet.com/");
		//driver.findElement(By.xpath("//div[@class = 'css-1dbjc4n r-zso239'])")).click();
		driver.findElement(By.xpath("//div[@class = 'css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-779j7e r-1f1sjgu r-1otgn73']")).click();
		
	

	}

}

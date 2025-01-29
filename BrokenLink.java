package Selenium_Introduction;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrokenLink {

	public static void main(String[] args) throws MalformedURLException, IOException {
		System.out.println("Broken Link test");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		// get all the URl which are tied up to that link, using Selenium
		// Use java to get the status code of all the links
		// if the Status code is more than 400, it's a broken link
		
		//System.out.println("Url is: "+url);
		
		// crating object of URL connection to call the method OpenConnection()
		
		// to check all the link present in footer section
		//li[@class = 'gf-li']/a
		List<WebElement> links = driver.findElements(By.xpath("//li[@class = 'gf-li']/a"));
		for (WebElement link : links) {
			String url = link.getDomAttribute("href");
			System.out.println(url);
			HttpURLConnection conc = (HttpURLConnection) new URL(url).openConnection();
			// to get the Status code of the URl
			int repCode = conc.getResponseCode();
			System.out.println(repCode);
//			if(repCode>400) {
//				System.out.println(link);
//			}
			
		}
	}

}

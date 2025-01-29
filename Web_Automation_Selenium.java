package Selenium_Introduction;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Automation_Selenium {

	public static void main(String[] args) {
		// invoking driver
		// there is a default way, and no need to decleare Chromedriver.exe file
		
		// otherwise manually declare the chromedriver path
		//System.setProperty("webdriver.chrome.drive","\"C:\\Users\\2261268\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe\"");
		// here for chrome driver
		WebDriver driver = new ChromeDriver();
		
		// declaring implecit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		// to open the URL
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//to hold the page for some time
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
		String title = driver.getTitle();
		System.out.printf("The title of the page is: \n"+title);
		// to close the driver
//		if(title.equalsIgnoreCase("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in")) {
//			System.out.println("\nTest executed successfully");
//		}
//		else {
//			System.out.println("Something went wrong!");
//		}
		// clicking on the Sign-up button
		driver.findElement(By.className("logoClass")).click();
		
		
		
		driver.close();
		

	}

}

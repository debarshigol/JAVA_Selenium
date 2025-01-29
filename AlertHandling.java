package Selenium_Introduction;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Welcome to handling Web alerts");

		Scanner input = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = input.nextLine();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//input[@class = 'inputs']")).sendKeys(name);
		driver.findElement(By.id("confirmbtn")).click();
		Thread.sleep(2000);
		String alertText = driver.switchTo().alert().getText();
		if (alertText.contains(name)) {
			System.out.println("Entered text is appearing on Alert pop-up");
		} else {
			System.out.println("Entered text is not appearing on Alert pop-up");
		}
		driver.switchTo().alert().dismiss();

	}

}

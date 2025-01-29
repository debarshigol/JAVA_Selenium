package Selenium_Introduction;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitSelenium {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Different types of waits in Selenium");
		String[] veggies = {"Cucumber","Brocolli"};
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// web-page link
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		// adding items based on the given veggies name
		addItem(driver,veggies);
		// Cart button 
		driver.findElement(By.xpath("//img[@alt = 'Cart']")).click();
		driver.findElement(By.xpath("//button[text() = 'PROCEED TO CHECKOUT']")).click();
		driver.findElement(By.xpath("//input[@class = 'promoCode']")).sendKeys("rahulshettyacademy");
		
		// explicit wait
		WebDriverWait w = new WebDriverWait(driver,3000);
		WebDriverWait wait = new WebDriverWait(driver,30);
	    WebElement element = wait.until(
	                        ExpectedConditions.elementToBeClickable(By.id(item)));
		
		driver.findElement(By.xpath("//button[@class = 'promoBtn']")).click();
		//promoInfo
		
		
	}
	public static void addItem(WebDriver driver, String[] veggies) throws InterruptedException {
		// scanning all the items and store it in a list
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		Thread.sleep(2000);
		
		// converting the item array to array-list to search all the items
		List<String> items = Arrays.asList(veggies);
		
		int count =0;
		for (int i=0;i<products.size();i++) {
			{
				String[] productName = products.get(i).getText().split("-");
				String product = productName[0].trim();
				
				// format it to get the actual product name
				if (items.contains(product)) {
					driver.findElements(By.xpath("//div[@class= 'product-action']/button")).get(i).click();
					//System.out.println(name + " is added to cart!");
					count++;
				}
				if(count==veggies.length) {
					break;
				}
			}

		}
		System.out.println("Done!");
	}

}

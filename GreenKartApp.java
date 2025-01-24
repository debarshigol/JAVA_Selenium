package Selenium_Introduction;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreenKartApp {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Slective item addition in E-commerce Cart");
		Scanner input = new Scanner(System.in);
		// no of items
		System.out.println("How many product you want to add?");
		int num = input.nextInt();
		// item names input
		String[] veggies = new String[num]; 
		System.out.println("Enter the Product name, you want to add to Cart: ");
		for(int i=0;i<num;i++) {
			veggies[i] = input.next();
		}
		System.out.println("Item names are entered");
		// web-driver initialization
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// web-page link
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
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
				if(count==num) {
					break;
				}
			}

		}
		System.out.println("Done!");

	}

}

package week4.assignment;

import java.awt.Point;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Link {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
 
		driver.findElement(By.linkText("Go to Home Page")).click();
		
		driver.findElement(By.xpath("(//a[@class='wp-categories-link maxheight'])[3]")).click();
        driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).click();
		driver.findElement(By.id("home")).click();
		String title = driver.getTitle();
		String text ="TestLeaf - Selenium Playground";
		if(text.equals(title))
		{
			System.out.println(" Title is Correct");
		}
		else
		{
			System.out.println("Title is Incorrect");
		}
		driver.findElement(By.linkText("Button")).click();
		
		org.openqa.selenium.Point location = driver.findElement(By.id("position")).getLocation();
		int x = location.getX();
		System.out.println(x);
		int y = location.getY();
		System.out.println(y);
		
		String cssValue = driver.findElement(By.id("color")).getCssValue("background-color");
		System.out.println(cssValue);
		
		Dimension size = driver.findElement(By.id("size")).getSize();
		int height = size.getHeight();
		System.out.println(height);
		int width = size.getWidth();
		System.out.println(width);
		
		driver.findElement(By.id("home")).click();
		driver.findElement(By.xpath("(//a[@class='wp-categories-link maxheight'])[3]")).click();
		driver.findElement(By.linkText("Verify am I broken?")).click();
		String title2 = driver.getTitle();
		String title3 = "HTTP Status 404 – Not Found";
		
		if(title2.equals(title3))
		{
			System.out.println("Title is correct");
		}
		else 
		{
			System.out.println("Title is incorrect");
		}
		
		driver.get("http://www.leafground.com/pages/Link.html");
		driver.findElement(By.linkText("Go to Home Page")).click();
		driver.findElement(By.xpath("(//a[@class='wp-categories-link maxheight'])[3]")).click();	
		driver.findElement(By.linkText("How many links are available in this page?")).click();
		System.out.println("Four Links");
	}

}

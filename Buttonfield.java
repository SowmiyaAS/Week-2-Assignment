package week2.day4;

import java.awt.Point;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Buttonfield {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leafground.com/pages/Button.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    driver.findElement(By.id("home")).click();
    
String text="TestLeaf - Selenium Playground";
String title=driver.getTitle();
if(text.equals(title))
{
	System.out.println("Home page is displayed");
}
else
{
	System.out.println("Home page is not displayed");
}
    
    driver.findElement(By.linkText("Button")).click();
    
    //get location
    
    org.openqa.selenium.Point location=driver.findElement(By.id("position")).getLocation();
    
    int x=location.getX();
    System.out.println(x);
    int y=location.getY();
    System.out.println(y);
    
    //css selector find color
    
String cssvalue=driver.findElement(By.id("color")).getCssValue("background-color");
    
    System.out.println(cssvalue);
    
    //get size
    
    Dimension size=driver.findElement(By.id("size")).getSize();
    
    int height=size.height;
    System.out.println(height);
    int width=size.width;
    System.out.println(width);
    
    
    
    
    
    
    
    
   }

}

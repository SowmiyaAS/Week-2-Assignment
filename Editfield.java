package week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Editfield {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//send mail id
		driver.findElement(By.id("email")).sendKeys("aravind@testleaf.com");
		//clear the element and send new key
		WebElement element=driver.findElement(By.xpath("//input[@value='Append ']"));
		//dont use clear ,send key add the box
		element.clear();
		element.sendKeys("sowmiya"); 
		
	//get attribute
		
	String attribute=driver.findElement(By.xpath("//input[@value='TestLeaf']")).getAttribute("TestLeaf");
		
	System.out.println(attribute);
	driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
      
		boolean enabled=driver.findElement(By.xpath("//input[@disabled='true']")).isEnabled();
     
		System.out.println(enabled);
		if(enabled==false)
			
		{
			System.out.println("Text box is disabled");
			
		}
		else
		{
			System.out.println("Text box is enabled");
		}
		

	}

}

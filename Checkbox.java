package week4.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));				

          driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
          driver.findElement(By.xpath("(//input[@type='checkbox'])[5]")).click();
   Thread.sleep(1500);
   String text1 = driver.findElement(By.xpath("//div[contains(text(),'Selenium')]")).getText();
       String text2 = "Selenium";
       if(text2.equals(text1)) 
       {
	System.out.println("correct");
         }
       else 
       {
	  System.out.println("incorrect");
    }
           driver.findElement(By.xpath("(//input[@type='checkbox'])[8]")).click();
         Thread.sleep(2000);         
         
         driver.findElement(By.xpath("(//input[@type='checkbox'])[9]")).click();
         driver.findElement(By.xpath("(//input[@type='checkbox'])[10]")).click();
         driver.findElement(By.xpath("(//input[@type='checkbox'])[11]")).click();
         driver.findElement(By.xpath("(//input[@type='checkbox'])[12]")).click();
         driver.findElement(By.xpath("(//input[@type='checkbox'])[13]")).click();
	}

}

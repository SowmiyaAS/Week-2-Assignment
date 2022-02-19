package weekendassignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Opencart {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 
		driver.findElement(By.xpath("//input[@id='input-username']")).sendKeys("sowmiya Ayyadurai");
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("sowmiya");
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Ayyadurai");
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sowmiya123@gmail.com");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Siweneelu@123");
	
	WebElement country=driver.findElement(By.xpath("//select[@id='input-country']"));
	Select country1=new Select(country);
	country1.selectByValue("99");
	
	driver.close();
	
	
	}

}

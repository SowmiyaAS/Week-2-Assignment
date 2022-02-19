package weekendassignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Salesforce {
	

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//input[@name='UserFirstName']")).sendKeys("sowmiya");
		driver.findElement(By.xpath("//input[@name='UserLastName']")).sendKeys("AS");
		driver.findElement(By.xpath("//input[@name='UserEmail']")).sendKeys("sowmiya123@gmail.com");
		
		WebElement job=driver.findElement(By.xpath("//select[@name='UserTitle']"));
		Select jobtitle=new Select(job);
		jobtitle.selectByValue("Sales_Manager_AP");
		
		driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("TeseLeaf");
		driver.findElement(By.xpath("//input[@name='UserPhone']")).sendKeys("8640316958");
		
		WebElement emp=driver.findElement(By.xpath("//select[@name='CompanyEmployees']"));
		Select emp1=new Select(emp);
		emp1.selectByValue("9");
		
		WebElement country=driver.findElement(By.xpath("//select[@name='CompanyCountry']"));
		Select country1=new Select(country);
		country1.selectByValue("IN");
		
		driver.findElement(By.xpath("//div[@class='checkbox-ui']")).click();
		driver.close();


	}

}

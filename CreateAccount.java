package week2.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("sowmiyasiwethi4320@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("siwethi");
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.name("firstname")).sendKeys("sowmiya");
		
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("sowmiya23@gmail.com");
		
		//driver.findElement(By.xpath("//input[@type='password'])[2]")).sendKeys("amma@12");
		driver.findElement(By.id("password_step_input")).sendKeys("sowmi@98");
		
		WebElement date=driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select date1=new Select(date);
		date1.selectByValue("1");
		
		
		WebElement month=driver.findElement(By.id("month"));
		Select sep=new Select(month);
		sep.selectByValue("9");
		
		WebElement year=driver.findElement(By.id("year"));
		Select year1=new Select(year);
		year1.selectByValue("1998");
		driver.findElement(By.xpath("//label[text()='Female']")).click();
	}

}

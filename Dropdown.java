package week4.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	private static final WebElement Dropdown4 = null;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	    WebElement Dropdown1 = driver.findElement(By.id("dropdown1"));
		Select index =new Select(Dropdown1);
		index.selectByIndex(2);
		
		WebElement Dropdown2 = driver.findElement(By.name("dropdown2"));
		Select text =new Select(Dropdown2);
		text.selectByVisibleText("Selenium");
		
		WebElement Dropdown3 = driver.findElement(By.id("dropdown3"));
		Select value =new Select(Dropdown3);
		value.selectByValue("4");
		
		
	}

}

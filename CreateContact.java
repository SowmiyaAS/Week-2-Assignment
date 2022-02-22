package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
	 WebDriverManager.chromedriver().setup();
	 ChromeDriver driver=new ChromeDriver();
	 //launch url
	 driver.get("http://leaftaps.com/opentaps/control/login");
	 //enter username password
	 driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	 driver.findElement(By.id("password")).sendKeys("crmsfa");
//use login button
driver.findElement(By.className("decorativeSubmit")).click();
//Click on CRM/SFA Link
driver.findElement(By.linkText("CRM/SFA")).click();
//Click on contacts Button
driver.findElement(By.linkText("Contacts")).click();
//Click on Create Contact
driver.findElement(By.linkText("Create Contact")).click();

driver.findElement(By.id("firstNameField")).sendKeys("sowmiya");
driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("AS");
driver.findElement(By.id("lastNameField")).sendKeys("A");
driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("sowmi");
driver.findElement(By.id("createContactForm_departmentName")).sendKeys("IT");
driver.findElement(By.id("createContactForm_description")).sendKeys("testleaf is a software testing company");
	driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("sowmiya123@gmail.com");
	driver.findElement(By.id("createContactForm_importantNote")).sendKeys("hi,testleaf team");
	
	//select new york using visibletext
	WebElement dropdown1=driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
	  Select state=new Select(dropdown1);
	 state.selectByVisibleText("New York");
	 // click create contact
	 driver.findElement(By.name("submitButton")).click();
	 //click edit button
	 driver.findElement(By.linkText("Edit")).click();
	 //clear description box
	 driver.findElement(By.name("description")).clear();
	 //click update use xpath
	 driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
	//get title
	 String title=driver.getTitle();
	 String title2="opentaps CRM";
	 if(title.contains(title2))
	 {
		 System.out.println("testcase pass");
	 }
	 else
	 {
		 System.out.println("testcase fail");
	 }
	 
	
	 
	 
	}
	
}

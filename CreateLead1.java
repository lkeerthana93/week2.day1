package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead1 {

	public static void main(String[] args) throws InterruptedException {
		//set up driver
		WebDriverManager.chromedriver().setup();

		//Open the browser
		ChromeDriver driver = new ChromeDriver();

		//load the url
		driver.get("http://leaftaps.com/opentaps/control/login");

		//maximise the browser window
		driver.manage().window().maximize();

		//Login to the application
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Click on CRM/SFA
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Click on LEads
		driver.findElement(By.linkText("Leads")).click();
		
		
		//Click on Create Leads
		driver.findElement(By.linkText("Create Lead")).click();
		
		//Enter Companyname 
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("VRA");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sundar");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Krishnan");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Sundar");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Finance");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("MBA Finance");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sundar.krishnan@gmail.com");
		
		//Dropdown element tag
		WebElement ele = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		//create obj for select class and link the droopdown ele
		Select dd = new Select(ele);
		
		//choose based on visible text
		dd.selectByVisibleText("New York");
		
		//Submit
		driver.findElement(By.name("submitButton")).click();
		
		//to slow the execution
		Thread.sleep(2000);
		
		String titlePage = driver.getTitle();
		System.out.println("Title of the page : " + titlePage);
		
	}
}
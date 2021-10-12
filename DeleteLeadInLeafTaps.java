package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLeadInLeafTaps {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	

		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//a[text()='Leads']")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.linkText("Find Leads")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.linkText("Phone")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.name("phoneCountryCode")).sendKeys("91");
	    driver.findElement(By.name("phoneAreaCode")).sendKeys("44");
	    driver.findElement(By.name("phoneNumber")).sendKeys("9123456789");
	    Thread.sleep(4000);
	    
	    driver.findElement(By.linkText("Find Leads")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.name("id")).sendKeys("11028");
	    Thread.sleep(2000);
	   
	    driver.findElement(By.linkText("11028")).click();
	    Thread.sleep(2000);
	    //DeleteLead
	    driver.findElement(By.className("subMenuButtonDangerous")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.linkText("Find Leads")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.name("id")).sendKeys("11028");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//button[@type='button' and text()='Find Leads']")).click();
	    Thread.sleep(4000);
		driver.close();
	    
		
	}

}

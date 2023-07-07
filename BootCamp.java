package bootcampprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverInfo;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openque.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootCamp extends RemoteWebDriver {
	

	public static void main(String args[]) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
	//	option.addArguments("remote-allow-origins=*");
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		
		driver.get("https://login.salesforce.com");
		System.out.println(driver.getCurrentUrl());
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Leaf@1234");
		driver.findElement(By.id("Login")).click();
		Thread.sleep(5000);
	
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//button[text()='View All']")).click();
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		WebElement button = driver.findElement(By.xpath("//one-app-nav-bar-item-root/a/spam[text()='Accounts']"));
		driver.executeScript("arguments[0].click();", button);
		driver.findElement(By.linkText("New")).click();
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Aarthy");
		driver.findElement(By.xpath("//label[text()='ownership']/following-sibling::div")).click();
		driver.findElement(By.xpath("//span[text()='public']")).click();
		driver.findElement(By.xpath("//button[@name='saveEdit']")).click();
		WebElement message = driver.findElement(By.xpath("//span[@class = 'toastMessage slds-text-heading--small forceActionsText']"));
		System.out.println(message);
		/*
		 * if(message(aname)) { System.out.println("Account created successfully"); }
		 * 
		 * }else
		 * 
		 * { System.out.println("Account not created successfully"); }
		 */

	}
}
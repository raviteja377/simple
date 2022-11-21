package Vtiger.practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Createcontacttest {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8888");		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");		
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.linkText("Contacts")).click();
	driver.findElement(By.xpath("//img[@alt='Create Contact...']")).click();
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("shivani");
	driver.findElement(By.xpath("//img[@alt='Select']")).click();
		//window handles
		String parentwindow = driver.getWindowHandle();
	Set<String> childwindow = driver.getWindowHandles();
	for(String handle:childwindow) {
		if(!handle.equals(parentwindow)) {
			driver.switchTo().window(handle);
		driver.findElement(By.linkText("tyc")).click();}}
	driver.switchTo().window(parentwindow);
		driver.findElement(By.xpath("//input[@value='  Save  ']")).click();
//window handles close
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.xpath("//a[text()='tyc']")).getText());
	
		driver.findElement(By.linkText("Contacts")).click();
		System.out.println(driver.findElement(By.xpath("//a[text()='Contacts']")).getText());
	//driver.close();


	}

}

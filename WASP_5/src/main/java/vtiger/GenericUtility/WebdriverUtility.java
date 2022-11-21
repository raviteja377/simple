package vtiger.GenericUtility;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * this class contains all the generic methods related to webdriver actions
 * @author ravi teja
 */
public class WebdriverUtility {
	/**
	 * this method is used to maximise the window
	 * @param ravi teja
	 */
	public void maximiseWindow(WebDriver driver) {
	driver.manage().window().maximize();
	}
	/**
	 * this method  wait for 20 seconds for the entire DOM structure load
	 * @param driver
	 */

public void waitForElementsToLoadInDom(WebDriver driver) {
	driver.manage().timeouts().implicitlyWait(Duration .ofSeconds(20));
}
/**
 * this method will  wait for an element to be visible
 * @param driver
 * @param element
 */
public void waitForElementToLoad(WebDriver driver,WebElement element) {
	
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
	wait.until(ExpectedConditions.visibilityOf(element));
}
/**
 * this method will wait for particular element to be clickable
 * @param driver
 * @param element
 */
public void waitForElementToBeClickable(WebDriver driver,WebElement element) {
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
	wait.until(ExpectedConditions.elementToBeClickable(element));
}
/**
 * this method will wait for particular element to perform click operation
 * if the element is not interactive it will wait for 1 second
 * @param element
 * @throws InterruptedException
 */
public void customWaitAndClickOnElement(WebElement element) throws InterruptedException {
	int count=0;
	while(count<10) {
		try {element.click();
		break;}catch(Exception e) {
			Thread.sleep(1000);
			count++;
		}
	}
}
/**
 * this method will handle dropdown by select class using index
 * @param element
 * @param index
 */
public void handleDropDown(WebElement element,int index) {
	Select s=new Select(element);
	s.selectByIndex(index);
}
/**
 * this method will handle dropdown by select class using visibleText
 * @param element
 * @param visibleText
 */
public void handleDropDown(WebElement element,String visibleText ) {
	Select s=new Select(element);
	s.selectByVisibleText(visibleText);
}
/**
 * this method will handle dropdown by select class using value
 * @param value
 * @param element
 */
public void handleDropDown(String value,WebElement element) {
	Select s=new Select(element);
	s.selectByValue(value);
}
/**
 * This method will  perform mouse hover action on particular element
 * @param driver
 * @param element
 */
public void mouseHoveron(WebDriver driver,WebElement element) {
	Actions act=new Actions(driver);
	act.moveToElement(element).perform();;
}
/**
 * This method will  double click on the page
 * @param driver
 */
public void doubleClickon(WebDriver driver) {
	Actions act=new Actions(driver); 
	act.doubleClick().perform();
}
/**
 * This method will perform double click  on a particular element
 * @param driver
 * @param element
 */
public void doubleClickon(WebDriver driver,WebElement element) {
	Actions act=new Actions(driver);
	act.doubleClick(element).perform();
}

/**
 * This method will perform right click on the page
 * @param driver
 */

public void rightClickOn(WebDriver driver)
{
	Actions act = new Actions(driver);
	act.contextClick().perform();
}

/**
 * this method will perform right click on a particular element
 * @param driver
 * @param element
 */
public void rightClickOn(WebDriver driver, WebElement element)
{
	Actions act = new Actions(driver);
	act.contextClick(element).perform();
}}


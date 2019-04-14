package goibiboTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestScripts {


	WebDriver driver;
	
	@Test
	public void Launch() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumFiles\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.goibibo.com/");
		Thread.sleep(2000);
		
		//Source
		WebElement Source =driver.findElement(By.id("gosuggest_inputSrc"));
		Source.sendKeys("Delhi");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.border='4px solid red'", Source);
		
		driver.findElement(By.id("gosuggest_inputSrc")).sendKeys(Keys.DOWN);
		Thread.sleep(2000);
		driver.findElement(By.id("gosuggest_inputSrc")).sendKeys(Keys.ENTER);

		// Selecting destination

		driver.findElement(By.id("gosuggest_inputDest")).sendKeys("BOM");
		Thread.sleep(2000);
		driver.findElement(By.id("gosuggest_inputDest")).sendKeys(Keys.DOWN);
		Thread.sleep(2000);
		driver.findElement(By.id("gosuggest_inputDest")).sendKeys(Keys.ENTER);

		Thread.sleep(3000);
		/*
		 * driver.findElement(By.id("fare_20190425")).click();
		 * driver.findElement(By.id("gi_search_btn")).click();
		 * 
		 * Thread.sleep(2000);
		 * 
		 * String text =
		 * driver.findElement(By.xpath("//li[@class='fltSortSelect']//a")).getAttribute(
		 * "innerText"); System.out.println(text);
		 * 
		 * String dateTime;
		 * //driver.findElement(By.xpath("//div[@role='heading']")).click(); String
		 * dateTime =
		 * driver.findElement(By.id("//div[text()= 'April 2019']")).getAttribute(
		 * "innerText"); Thread.sleep(3000); System.out.println("dateTime");
		 * Thread.sleep(3000);
		 */
		
		DatePicker();
		
		
		
		/*
		 * if (dateTime == "April 2019") {
		 * 
		 * driver.findElement(By.id("fare_20190410")).click(); Thread.sleep(2000); }
		 * else { driver.findElement(By.xpath("//span[@role='button']")).click();
		 * driver.findElement(By.id("fare_20190515")).click(); }
		 */
		 

	

	}

	public void DatePicker() {
		String expectedval ="23 July 2019";
		String actualval = driver.findElement(By.xpath("//div[@class='DayPicker-Caption']")).getAttribute("innerText");		
		System.out.println(actualval);
		
		if(expectedval.contains(actualval)) {
			System.out.println("I am in same month");
			
		}else {
			driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
			String actualval2 = driver.findElement(By.xpath("//div[@class='DayPicker-Caption']")).getAttribute("innerText");		
			System.out.println(actualval2);
		}
	}
}

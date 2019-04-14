package goibiboTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.DiscoveryStrategy.Explicit;

public class AutomatePractice {

	public static void main(String[] args) throws InterruptedException  {

		WebDriver driver;
		System.setProperty("webdriver.ie.driver", "E:\\SeleniumFiles\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumFiles\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("http://output.jsbin.com/osebed/2");
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		driver.manage().timeouts().pageLoadTimeout(2000,TimeUnit.SECONDS);
		
		WebElement dropDwon = driver.findElement(By.id("fruits"));	
		Select s1 = new Select(dropDwon);
/*		WebElement dropDwon = driver.findElement(By.id("id_contact"));	
		Select s1 = new Select(dropDwon);
		s1.selectByIndex(1);
		s1.selectByValue("2");
		s1.selectByVisibleText("Customer service");*/
		
		System.out.println(s1.isMultiple());
		
		s1.getOptions();
		
		s1.selectByVisibleText("Apple");
		s1.selectByVisibleText("Grape");
		s1.selectByVisibleText("Banana");
		
		s1.deselectByVisibleText("Apple");
		
	}

}

package goibiboTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumFiles\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com/tnw-men-casual-formal-tan-artificial-leather-wallet/p/itmf3zetc6zrnbbn?pid=WCWERCFUS8SQHESF&lid=LSTWCWERCFUS8SQHESFHYVZJ5&marketplace=FLIPKART&srno=b_1_2&otracker=hp_omu_Deals%2Bof%2Bthe%2BDay_3_RIF9F39AUSDK_0&otracker1=hp_omu_PINNED_neo%2Fmerchandising_Deals%2Bof%2Bthe%2BDay_NA_dealCard_cc_3_NA_0&fm=neo%2Fmerchandising&iid=4d4a6e85-9049-4148-9d21-dde6dd2dcebd.WCWERCFUS8SQHESF.SEARCH&ppt=Homepage&ppn=Homepage&ssid=qq5pyjexnk0000001554694643520");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//li[@class='col col-6-12']")).click();
	}

}

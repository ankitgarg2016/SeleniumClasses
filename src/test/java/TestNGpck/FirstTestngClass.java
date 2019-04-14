package TestNGpck;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.*;

public class FirstTestngClass {
	/*
	 * @AfterClass public void afterClass() {
	 * System.out.println("This will execute after the Class"); }
	 * 
	 * @AfterTest public void afterTest() {
	 * System.out.println("This will execute after the Test"); }
	 */

	@Test
	public void testCase1() {
		System.out.println("This is the Test Case 1");
	}

	@Test
	public void testCase2() {
		System.out.println("This is the Test Case 2");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("This will execute before the Test");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("This will execute before the Class");
	}

}

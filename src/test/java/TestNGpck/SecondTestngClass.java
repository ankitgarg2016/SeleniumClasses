package TestNGpck;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SecondTestngClass {
	
	@Test
	public void testCase1() {
		System.out.println("This is the Test Case 11");
	}
	
	@Test
	public void testCase2() {
		System.out.println("This is the Test Case 22");
}

	
}

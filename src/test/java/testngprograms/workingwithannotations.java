package testngprograms;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class workingwithannotations {
	@AfterMethod
public void t6() {
	System.out.println("am after method");
}
	@AfterClass
public void t7() {
	System.out.println("am after cla");
}
	@AfterTest
public void t8() {
	System.out.println("am after test");
}
	@AfterSuite
public void t9() {
	System.out.println("am after suit");
}
	@BeforeSuite
public void t1() {
	System.out.println("am before suit");
}
	@BeforeTest
public void t2() {
	System.out.println("am before test");
}
	@BeforeClass
public void t3() {
	System.out.println("am before class");
}
	@BeforeMethod
public void t4() {
	System.out.println("am before method");
}
	@Test
public void t5() {
	System.out.println("am before test");
}
}

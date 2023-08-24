package testngprograms;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class workingwithreporterlogin {
	@Test
public void demo() {
	Reporter.log("hi",true);
}
	@Test
	public void demo2() {
		Reporter.log("varun",true);
	}
}

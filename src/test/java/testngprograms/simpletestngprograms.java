package testngprograms;

import org.testng.annotations.Test;

public class simpletestngprograms {
	@Test(priority=1,description="validation def",enabled=true)
	public void def() {
		System.out.println("am def");
	}
		@Test(priority=2,description="validation abc",enabled=false)
	public void abc() {
		System.out.println("am abc");
	}
		@Test(priority=3,description="validation xyz",enabled=true)
	public void xyz() {
		System.out.println("am xyz");
	}
		@Test(priority=4,description="validation klm",enabled=true)
	public void klm() {
		System.out.println("am klm");
	}
}

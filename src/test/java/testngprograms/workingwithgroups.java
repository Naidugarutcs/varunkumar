package testngprograms;

import org.testng.annotations.Test;

public class workingwithgroups {
@Test(groups="kim")
public void a() {
	System.out.println("a");
}
@Test(groups="jam")
public void b() {
	System.out.println("b");
}
@Test(groups="jam")
public void c(){
	System.out.println("c");
}
@Test(groups="kim")
public void d() {
	System.out.println("d");
}
@Test(groups="jam")
public void e() {
	System.out.println("e");
}
}


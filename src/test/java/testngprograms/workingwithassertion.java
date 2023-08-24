package testngprograms;

import static org.testng.AssertJUnit.assertEquals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class workingwithassertion {
	public void t1() {
		int a=10;
		int b=20;
	//	Assert.assertEquals(a,b);
    }
	@Test(description="validtion the title")
public void t2() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String exptitle="Google";
		String acttitle=driver.getTitle();
	//Assert.assertEqual(exptitle,acttitle);
	}
}



package testngprograms;

import java.io.FileInputStream;
import java.util.Properties;

public class notepad {
public static void main (String args[])throws Throwable{
	FileInputStream fis=new FileInputStream("C:\\Users\\v1232\\OneDrive\\Documents\\c.programs\\Testngprograms\\kimi.txt");
	Properties p=new Properties();
	p.load(fis);
	String data1=p.getProperty("Un");
	System.out.println(data1);
	String data2=p.getProperty("Pwd");
	System.out.println(data2);
}
}

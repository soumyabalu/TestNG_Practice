package Testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test1 {

	
		// TODO Auto-generated method stub
//writing multiple testcases
	@Parameters({"URL","APIkey/Password"})
	@Test
	public void demo(String urlname,String key) {
		System.out.println("is printed");//automation
		System.out.println(urlname);
		System.out.println(key);
	}
	@AfterMethod
	public void say() {
		System.out.println("i will execute after method of Test1 class");
	}
	@BeforeSuite
	public void beforeTest() {
		System.out.println("Will execute first");
	}
	
	@Test(groups= {"Smoke"})
	public void demo2() {
		String say = "bye";
		System.out.println(say);//automation
}
	@BeforeMethod
	public void tell() {
		System.out.println("i will execute before method in Test1 classfile");
	}
}
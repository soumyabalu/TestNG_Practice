package Testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Carloan {

	
	@Parameters({"URL","APIkey/Password"})
	
	@Test
	public void webLoginCar(String urlname,String key) {
		System.out.println("webLoginCar");
		System.out.println(urlname);
		System.out.println(key);
		
	}

	@Parameters({"URL"})
	
	@Test
	
	public void mobileLoginHome(String urlname) {
		System.out.println("mobile Login Home");
		System.out.println(urlname);
		
	}
	
	
	@BeforeClass
	public void doing() {
		System.out.println("will execute after all the methods in the class");
	}
		

	@Test(enabled=false)
	public void mobileLogoutHome() {
		System.out.println("mobile logout home");
	}
	
	@Test(groups= {"Smoke"})
	public void mobileSigninHome() {
		System.out.println("mobile Signin Home");
	}
	@AfterClass
	public void getting () {
		System.out.println("i will execute after all method execution");
			
		}


	@Test(dataProvider="getData")
	public void mobileSignoutHome(String username,String password) {
		System.out.println("mobile Signout Home");
		System.out.println(username);
		System.out.println(password);

	}

	@Test(dependsOnMethods= {"webLoginCar","mobileLoginHome","mobileSigninHome"})
	public void APILoginHome() {
		System.out.println("APILoginHome");
	}
	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[3][2];
		data[0][0]="firstsetusername";
		data[0][1]="firstpassword";
		
		data[1][0]="secondsetusername";
		data[1][1]="secondpassword";
		
		data[2][0]="thirdsetusername";
		data[2][1]="thirdpassword";
		
		return data;
		
		
	}
	

}

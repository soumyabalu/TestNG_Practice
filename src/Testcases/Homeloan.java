package Testcases;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Homeloan {
	@Parameters({"URL"})
	@Test
	public void webLoginHome(String urlname){
		System.out.println("Homeloan webLoginHome");
		System.out.println(urlname);
		
		
	}

	@Test(groups= {"Smoke"})
	public void MobileLoginHome() {
		System.out.println("HomeLoan MobileLoginHome");
	}
	
	
	
	@Test(timeOut=5000)
	public void APIloginHome() {
		System.out.println("Homeloan APIloginHome");
		
		
	}
	
}

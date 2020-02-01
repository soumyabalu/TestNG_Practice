package Testcases;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class Test3 {
	@Test(groups= {"Smoke"})
	public void managerSection() {
		System.out.println("Personal Loan Manager");
	}
		@AfterSuite
		public void afterTest() {
			System.out.println("Will execute last");
		}
		
	}



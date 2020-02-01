package Testcases;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test4 {

	@ BeforeTest
public void section() {
		System.out.println("Personal LoanSection");
	}
		@Test(groups= {"Smoke"})
		public void went() {
			System.out.println("Iwent there");
		}
	}


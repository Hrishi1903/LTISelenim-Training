package testng;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Validate {
@BeforeTest 
	public void validatehomepage() {
		System.out.println("Validate home page");
}@Test
		public void validateloginpage() {
			System.out.print("Validate login page");
		}
	
}

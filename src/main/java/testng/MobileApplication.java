package testng;

import org.testng.annotations.Test;

public class MobileApplication {
@Test(groups = "smoke")
	public void mobilelogin() {
		System.out.print("Mobile Login");
	}

@Test
       public void sendmobilerequest() {

       System.out.println("Regression 1");   
}
}

package testng;

import org.testng.annotations.Test;

public class WebApplication {
@Test(groups = "smoke")
	public void weblogin() {
		System.out.print("Web Login");
	}
@Test
    public void sendrequest() {
	System.out.println("Sending Request");
}
}


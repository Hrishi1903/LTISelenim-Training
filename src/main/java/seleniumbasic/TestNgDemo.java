package seleniumbasic;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class TestNgDemo {
@BeforeMethod
public void launchapplication( ) {
System.out.println("BeforeMethod");
}
@Test(priority = 2)
public void password() {
System.out.println("Password");
}
@Test(priority = 1)
public void login() {
System.out.println("Login");
}
@AfterMethod
public void closeapplication() {
System.out.println("AfterMethod");
}
@Test(priority = 3)
public void homepagevalidation() {
System.out.println("Validating Home Page");
}
}
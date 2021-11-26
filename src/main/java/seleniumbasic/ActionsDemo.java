package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsDemo {

	public static void main(String[] args) throws InterruptedException {
		
		moveToElement();

	}

	public static void moveToElement() throws InterruptedException {
		System.out.println(1);

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		Actions actions = new Actions(driver);

		WebElement primeMenu = driver.findElement(By.xpath("//span[text()='Prime']"));

		actions.moveToElement(primeMenu).build().perform();
        Thread.sleep(5000);
		driver.quit();

	}

}  


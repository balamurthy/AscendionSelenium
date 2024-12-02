package sanityTests;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_herokuapp {
	WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/login");
		
		driver.findElement(By.id("username")).sendKeys("tom");
		
		driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
		
		//Validation step
		try {
			driver.findElement(By.cssSelector("#login > button")).click();
		
			//check for footer after logging in
			
			
			driver.findElement(By.partialLinkText("out")).click();
			
			
		}
		catch (NoSuchElementException e)
		{
		
			System.out.println("Incorrect credentials.Login unsuccessful");
		
		//After login, check if logout button is there 
		
		
		}
		//driver.close();
		
	}

}

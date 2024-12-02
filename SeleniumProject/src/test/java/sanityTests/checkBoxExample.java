package sanityTests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkBoxExample {

	static WebDriver driver;
	final static int JAVA=1;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/BLaptop/Ascendion/asc.html");

		List <WebElement> chkboxes = driver.findElements(By.name("skills"));
		//Check if any checkbox is checked
		
		chkboxes.get(0).click();
		
		for (WebElement chk : chkboxes) {
			
			System.out.println(chk.isSelected());
			
		}
		
	
		System.out.println(chkboxes.size());
		
		
		chkboxes.get(JAVA).click();
		System.out.println(chkboxes.get(1).isSelected());
		
	}

}

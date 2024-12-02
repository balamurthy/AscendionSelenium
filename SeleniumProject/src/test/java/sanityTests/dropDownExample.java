package sanityTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utilities.Helper;

public class dropDownExample extends Helper {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		driver = Helper.launchBrowser("chrome");
		
		driver.get("file:///D:/BLaptop/Ascendion/asc.html");
		
		Select cars = new Select(driver.findElement(By.id("cars")));
		//find how many cars are listed
		
		System.out.println(cars.getOptions().size());
	    boolean isfound = false;
		for (WebElement o : cars.getOptions())
		{
			System.out.println(o.getText());
			if (o.getText().contains("Mercedes")){
				isfound = true;
				break;
			}
		}
		if (isfound == true) {
			
			System.out.println("Mercedes was found");
		}
			
		
		
	}

}

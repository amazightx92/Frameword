package piit.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Ilocators {
     static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Amazigh6\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe") ;
		driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.com");
		driver.manage().window().maximize();
		WebElement searchfieldtxt= driver.findElement(By.name("field-keywords"));
		searchfieldtxt.sendKeys("Computer");
		WebElement Searchicon= driver.findElement(By.id("nav-search-submit-button"));
		Searchicon.click();
		WebElement linktx= driver.findElement(By.linkText("Registry"));
		linktx.click();
		
		
		
		


	

	}

}

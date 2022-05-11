package piit.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flights {

	static WebDriver driver;
	public static void main(String[] args)   {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Amazigh6\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe") ;
		driver=new ChromeDriver();
		driver.navigate().to("https://www.expedia.com");
		driver.manage().window().maximize();
		WebElement departure=driver.findElement(By.id("d1-btn"));
		departure.click();
		WebElement Departuretodate=driver.findElement(By.xpath("//*[@aria-label='May 16,2022']"));
		Departuretodate.click();
		WebElement Returndate=driver.findElement(By.xpath("//*[@aria-label='May 26,2022']"));
		Returndate.click();
		WebElement Done=driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/button"));
		Done.click();

	}

}

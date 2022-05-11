package piit.AutomationTrainingProgram;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Browsersd {
	WebDriver driver;
  @Test
  public void f() {
	WebElement id=driver.findElement(By.name("email"));
	id.sendKeys("amazigh@piit");
	WebElement password=driver.findElement(By.name("pass"));
	password.sendKeys("johnsilver");
	WebElement loginbutton=driver.findElement(By.name("login"));
	loginbutton.click();
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Amazigh6\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe") ;
		driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");
		driver.manage().window().maximize();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}

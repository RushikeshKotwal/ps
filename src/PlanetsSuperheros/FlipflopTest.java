package PlanetsSuperheros;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FlipflopTest {

	@Test
	public void main() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.planetsuperheroes.com/");
		
		HomePage home=new HomePage(driver);
		home.clickshop(); 
		
		Thread.sleep(2000);
		home.clickapparel();
		
		Thread.sleep(2000);
		home.clickflipflop();
		
		Thread.sleep(4000);
		driver.close();
		

	}

}

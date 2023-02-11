package PlanetsSuperheros;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	@FindBy(xpath ="//div[text()='Shop']") private WebElement shop;
	@FindBy(xpath ="//button[text()='Apparel']") private WebElement apparel;
	@FindBy(xpath ="//div[text()='Flipflops']") private WebElement flipflop;

	
	public HomePage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickshop() 
	{
		shop.click();
	}
	public void clickapparel() 
	{
		apparel.click();
	}
	public void clickflipflop() 
	{
		flipflop.click();
	}


}

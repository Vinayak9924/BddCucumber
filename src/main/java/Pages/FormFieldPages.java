package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormFieldPages {
	
	WebDriver driver;
	
	@FindBy(xpath="//input[@id='name-input']")
	public WebElement inputname;
	
	public WebElement getDrinkxpath(String favdrink) {
		String drinkxpath="//input[@value='"+ favdrink +"']";
		return driver.findElement(By.xpath(drinkxpath));
	}
	
	@FindBy(xpath="//input[@id='drink1']")
	public WebElement selectOption;
	
	
	public  FormFieldPages(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
	}
}

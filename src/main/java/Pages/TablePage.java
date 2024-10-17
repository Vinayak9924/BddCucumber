package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TablePage {

	WebDriver driver;
	
	@FindBy(xpath="//select[@name='tablepress-1_length']")
	public WebElement sizeoftable;
	
	
	
	public TablePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
}

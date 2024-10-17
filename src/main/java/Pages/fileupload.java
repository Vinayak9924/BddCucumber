package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fileupload {
	
	WebDriver driver;
	@FindBy(xpath="//input[@id='file-upload']")
	public WebElement chooseoption;
	
	@FindBy(xpath="//input[@id='upload-btn']")
	public WebElement clickonupload;
	
	public  fileupload(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
	}
}

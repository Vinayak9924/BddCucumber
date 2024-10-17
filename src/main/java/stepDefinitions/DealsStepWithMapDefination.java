package stepDefinitions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pages.FormFieldPages;
import Pages.fileupload;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DealsStepWithMapDefination {
	FormFieldPages FormfieldPages= null;
	fileupload fileUploads=null;

	@Before
	public void launchweb() {
		 System.setProperty("webdriver.chrome.driver","E:\\vm\\TEST_02\\driver\\chromedriver.exe");
			 driver=new ChromeDriver();
			driver.manage().window().maximize();
			FormfieldPages	=new FormFieldPages(driver);
			//fileUploads=new  fileupload(driver);
			 fileUploads=new  fileupload(driver);
	}
	@After
	public void closeaction() {
		driver.quit();
	}
	
	
	ChromeDriver driver;
	
	
	@Given("user user has launched the website")
	public void user_already_on_login_page() {
		System.setProperty("webdriver.chrome.driver","E:\\vm\\TEST_02\\driver\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practice-automation.com/form-fields/");
		FormfieldPages	=new FormFieldPages(driver);
	}
	
	@Given("user has launched the website for upload the file")
	public void userlauncheswebsiteforupload() {
		System.setProperty("webdriver.chrome.driver","E:\\vm\\TEST_02\\driver\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practice-automation.com/file-upload/");
	}
	@When("user uploads file")
	public void useruploadsfile() {
		//fileUploads.chooseoption.click();
		WebElement ele = driver.findElement(By.xpath("//input[@id='file-upload']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", ele);
		
		
        Robot rb = null;
		try {
			rb = new Robot();
		} catch (AWTException e) {
			e.printStackTrace();
		}

		// copying File path to Clipboard
		StringSelection str = new StringSelection(
				"C:\\Users\\User\\Downloads\\Get_Started_With_Smallpdf.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		
		// press Contol+V for pasting
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		// release Contol+V for pasting
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);

		// for pressing and releasing Enter
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

		fileUploads.clickonupload.click();
		
		
		
	/*	 WebDriverWait wait = new WebDriverWait(driver, 20);
		 wait.until(ExpectedConditions.visibilityOf( driver.findElement(By.
		 xpath("//div[text()='Thank you for your message. It has been sent.']"))));
		*/ 
		
	}
	@When("user enters name as Test")
	public void user_enters_name() {
		FormfieldPages.inputname.sendKeys("Test");
	}
	
	
		@And("Selects {string} as his fav drink")
	public void userselect_drink(String favdrink)
	{
			FormfieldPages.getDrinkxpath(favdrink).click();
	}
	@Then("user verifies he has selected water as his fav drink")
		public void validationoffavdrink() {
		FormfieldPages.selectOption.isSelected();
	    
	   
	}
	public WebDriver returndriver() {
		return driver;
	}
	
	@And("Selects his fav drink")
	public void selectdrink(DataTable data) {
	List<String> list=	data.asList();
	for(int i=0; i<list.size(); i++) {
		FormfieldPages.getDrinkxpath(list.get(i)).click();
	}
		
	}
	@Then("user takes screenshot")
	public  void takeSnapShot() {
		String fileWithPath = "E:\\vm\\TEST_02\\Screenshot\\test.png";
		//Convert web driver object to TakeScreenshot
		TakesScreenshot scrShot =((TakesScreenshot) driver);
		//Call getScreenshotAs method to create image file
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		//Move image file to new destination
		File DestFile=new File(fileWithPath);
		//Copy file at destination
		try {
			FileUtils.copyFile(SrcFile, DestFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
}



package stepDefinitions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.FormFieldPages;
import Pages.fileupload;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class StepDefinationForUpload {
	/*fileupload fileuploads= null;
	@Before
	public void launchweb() {
		 System.setProperty("webdriver.chrome.driver","E:\\vm\\TEST_02\\driver\\chromedriver.exe");
			 driver=new ChromeDriver();
			driver.manage().window().maximize();
			fileuploads	=new fileupload(driver);
			
	}
	@After
	public void closeaction() {
		driver.quit();
		
}
	ChromeDriver driver;
	
	@Given("user has launched the website for upload the file")
	public void userlauncheswebsiteforupload() {
		driver.get("https://practice-automation.com/file-upload/");
	}
	@When("user uploads file")
	public void useruploadsfile() {
	//	fileuploads.chooseoption.click();
		//((JavascriptExecutor) driver).executeScript("arguments[0].click();", ele);
		Robot rb = null;
		try {
			rb = new Robot();
		} catch (AWTException e) {
			e.printStackTrace();
		}

		// copying File path to Clipboard
		StringSelection str = new StringSelection(
				"E:\\automation\\Notes\\Architecture_ of_Collectons _(CLASS 15).png");
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

	//	fileuploads.clickonupload.click();
		
		
		/*
		 * WebDriverWait wait = new WebDriverWait(driver, 20);
		 * wait.until(ExpectedConditions.visibilityOf( driver.findElement(By.
		 * xpath("//div[text()='Thank you for your message. It has been sent.']"))));
		 */
		
	}

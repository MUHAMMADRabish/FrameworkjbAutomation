package pages;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import java.util.List;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import helper.ScenarioSetup;

public class HomePageAction {

	private static Logger log = Logger.getLogger(HomePageAction.class);
	
	/*@FindBy(xpath = "//h1[text()='todos']")
	private WebElement spanHeader;
	
	@FindBy(xpath = "//input[@class='new-todo']")
	private WebElement txtTodoTasks;
	
	@FindBy(xpath = "//div[@class='view']/label")
	private List<WebElement> lstExistingTasks;
	
	@FindBy(xpath = "//button[@class='clear-completed']")
	private WebElement lnkClearComplete;

	@FindBy(xpath = "//li[@class='todo completed']")
	private List<WebElement> lstCompletedTasks;
	
	@FindBy(xpath = "//span/strong")
	private WebElement spanItemCount;
	
	@FindBy(xpath = "//label[@for='toggle-all']")
	private WebElement lnkToggleAll;*/
	//driver.findElement(By.xpath("//*[@data-test-id='msaleem@procentrixdev.com']")).click();
	 @FindBy(name="loginfmt")
	 private WebElement UserIdFill;
	 @FindBy(xpath = "//input[@type='submit']")
	 private WebElement NextButton;
	 @FindBy(name="passwd")
	 private WebElement PasswordFieldEneter;
	 @FindBy(xpath = "//input[@type='submit']")
	 private WebElement SignInButton;
	 @FindBy(xpath = "//input[@type='submit']")
	 private WebElement YesButtonStatySignedIn;
	 @FindBy(xpath = "//*[text()='DCMS']")
	 private WebElement DCMS;
	 @FindBy(xpath="//button[@aria-label='New']")
     WebElement Newbutton;  
	 @FindBy(xpath="//input[@aria-label='Name']")
     WebElement Namefield;
	 @FindBy(xpath="//div[@aria-disabled='false']")
     WebElement Typefield ;
	 @FindBy(xpath="//*[text()='Board Office']")
	 WebElement BoardOfficeType;
	 @FindBy(xpath="//div[@data-pa-landmark-active-element='true']")
	 WebElement SubTypefield;
	 @FindBy(xpath="//*[@aria-label='Claim Number']")
     WebElement ClaimNumber ;
	 
	
	public HomePageAction() {
		PageFactory.initElements(ScenarioSetup.getDriver(), this);
	}

	public void openApplication() {
		String url = ScenarioSetup.getUIHelper().getProperty("url");
		ScenarioSetup.getDriver().get(url);
	}
	
	/*public void addTask(String task) {
		ScenarioSetup.getUIHelper().setText(txtTodoTasks, task);
		txtTodoTasks.sendKeys(Keys.ENTER);
		ScenarioSetup.getUIHelper().screenShot();
		
		log.info("Added new Task - "+ task);
	}
	
	
	public void ensureTask(String task, String section, boolean flag) {
		clickSection(section);
		boolean taskPresent = false;
		for(WebElement elementTask : lstExistingTasks)
		{
			if(elementTask.getText().equals(task))
			{
				taskPresent = true;
				break;
			}
		}
		ScenarioSetup.getUIHelper().screenShot();
		if(flag)
			assertTrue("Task not present - "+ task, taskPresent);
		else
			assertFalse("Task present - "+ task, taskPresent);
		log.info("Task is present in the list - "+ task);
	}
	
	public void completeTheTask(String task) {
		clickSection("All");
		for(WebElement elementTask : lstExistingTasks)
		{
			if(elementTask.getText().equals(task))
			{
				elementTask.findElement(By.xpath("./preceding-sibling::input")).click();
				break;
			}
		}
		log.info("Completed the Task - "+ task);
		ScenarioSetup.getUIHelper().screenShot();
	}
	
	
	public void removeTheTask(String task) {
		clickSection("All");
		for(WebElement elementTask : lstExistingTasks)
		{
			if(elementTask.getText().equals(task))
			{
				Actions obj = new Actions(ScenarioSetup.getDriver()).moveToElement(elementTask);
				WebElement delete = elementTask.findElement(By.xpath("./following-sibling::button"));
				obj.moveToElement(delete).click().build().perform();
				break;
			}
		}
		log.info("Deleted the Task - "+ task);
		ScenarioSetup.getUIHelper().screenShot();
	}
	
	private void clickSection(String section) {
		By secXpath=By.xpath("//ul[@class='filters']//a[text()='"+section+"']");
		ScenarioSetup.getUIHelper().clickElementByLocator(ScenarioSetup.getDriver(), secXpath);
		log.info("Clicked the section - "+ section);
	}
	
	public void clickClearComplete() {
		ScenarioSetup.getUIHelper().clickElement(lnkClearComplete);
		log.info("Clicked the Clear Completed button");
		ScenarioSetup.getUIHelper().screenShot();
	}
	
	public void toggleAll() {
		ScenarioSetup.getUIHelper().clickElement(lnkToggleAll);
		ScenarioSetup.getUIHelper().screenShot();
		log.info("Clicked the Toggle all button");
	}
	
	public void verifyCount(int count) {
		String actualCount = ScenarioSetup.getUIHelper().getText(spanItemCount);
		assertEquals("Count Mismatch", count, Integer.parseInt(actualCount));
		ScenarioSetup.getUIHelper().screenShot();
		log.info("Verified the Items left as "+actualCount);
	}

	public void editExistingTask(String task, String newTask) {
		clickSection("All");
		for(WebElement elementTask : lstExistingTasks)
		{
			if(elementTask.getText().equals(task))
			{
				Actions action = new Actions(ScenarioSetup.getDriver());
				action.doubleClick(elementTask);
				action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
				action.sendKeys(newTask).sendKeys(Keys.ENTER).build().perform();
				break;
			}
		}
		ScenarioSetup.getUIHelper().screenShot();
		log.info("Edited the existing task with the new task");
	}
	
	public void ensureTaskStrikeOff(String task) {
		clickSection("All");
		String text = "";
		for(WebElement elementTask : lstExistingTasks)
		{
			if(elementTask.getText().equals(task))
			{
				text = elementTask.getCssValue("text-decoration");
				break;
			}
		}
		ScenarioSetup.getUIHelper().screenShot();
		assertTrue("Task is not Striked Off - "+ task, text.contains("line-through"));
		log.info("Task is Striked Off - "+ task);
	}*/
	public void UserIDFilled(String UserName) {
		ScenarioSetup.getUIHelper().setText(UserIdFill, UserName);
		//UserIdFill.sendKeys(Keys.ENTER);
		ScenarioSetup.getUIHelper().screenShot();
		
		log.info("Added User ID- "+ UserName);
	}
	public void NextButtonLoginPageClick() {
		ScenarioSetup.getUIHelper().clickElement(NextButton);
		ScenarioSetup.getUIHelper().screenShot();
		log.info("Clicked the Next Button on login page  ");
	}
	public void PasswordIsEntered(String Password) {
		ScenarioSetup.getUIHelper().setText(PasswordFieldEneter, Password);
		ScenarioSetup.getUIHelper().screenShot();
		log.info("Password entered successfully");
	}
	public void SignInButtonLoginPageClick() {
		ScenarioSetup.getUIHelper().clickElement(NextButton);
		ScenarioSetup.getUIHelper().screenShot();
		log.info("Clicked the Next Button on login page  ");
	}
	public void YesButtonStatySignInPageClick() {
		ScenarioSetup.getUIHelper().clickElement(YesButtonStatySignedIn);
		ScenarioSetup.getUIHelper().screenShot();
		log.info("Clicked the Yes Button on stay signIn page after login page  ");
	}
	public void DCMSHomePageClick() {
		ScenarioSetup.getUIHelper().clickElement(DCMS);
		ScenarioSetup.getUIHelper().screenShot();
		log.info("Clicked the Yes Button on stay signIn page after login page  ");
	}
	public void NewButtonHomePageClick() {
		ScenarioSetup.getUIHelper().clickElement(Newbutton);
		ScenarioSetup.getUIHelper().screenShot();
		log.info("Clicked the New Button from home page  ");
	}
	public void NamefieldIsEntered(String Name) {
		ScenarioSetup.getUIHelper().setText(Namefield, Name);
		ScenarioSetup.getUIHelper().screenShot();
		log.info("Password entered successfully");
	
}
	public void TypefieldInfoPageClick() {
		ScenarioSetup.getUIHelper().clickElement(Typefield);
		ScenarioSetup.getUIHelper().screenShot();
		log.info("Clicked the Type field dropdown from info section  ");
	}
	public void BoardOfficeTypeInfoPageClick() {
		ScenarioSetup.getUIHelper().clickElement(BoardOfficeType);
		ScenarioSetup.getUIHelper().screenShot();
		log.info("Clicked the Board Office dropdown from info section  ");
	}
	public void SubTypefieldInfoPageClick() {
		ScenarioSetup.getUIHelper().clickElement(SubTypefield);
		ScenarioSetup.getUIHelper().screenShot();
		log.info("Clicked the Sub Type field dropdown from info section  ");
	}
	public void ClaimNumberInfoPageClick() {
		ScenarioSetup.getUIHelper().clickElement(ClaimNumber);
		ScenarioSetup.getUIHelper().screenShot();
		log.info("Clicked the Claim Number from Info page  ");
	}
	public void ClaimNumberInfoPageEntered(String Name) {
		ScenarioSetup.getUIHelper().setText(ClaimNumber, Name);
		ScenarioSetup.getUIHelper().screenShot();
		log.info("Password entered successfully");
	
}
}
package org.craftercms.studio.test.cases.contenttestcases;

import org.craftercms.studio.test.cases.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * 
 * @author Gustavo Andrei Ortiz Alfaro
 *
 */

public class AddNewContentEntryTest extends BaseTest {

	private String userName;
	private String password;
	private String createFormFrameElementCss;
	private String createFormSaveAndCloseElement;
	private String createFormMainTitleElementXPath;
	private String testingItemRecentActivity;
	private String randomURL;
	private String randomInternalName;

	@BeforeMethod
	public void beforeTest() {
		userName = constantsPropertiesManager.getSharedExecutionConstants().getProperty("crafter.username");
		password = constantsPropertiesManager.getSharedExecutionConstants().getProperty("crafter.password");
		createFormFrameElementCss = uiElementsPropertiesManager.getSharedUIElementsLocators()
				.getProperty("complexscenarios.general.createformframe");
		createFormSaveAndCloseElement = uiElementsPropertiesManager.getSharedUIElementsLocators()
				.getProperty("complexscenarios.general.saveandclosebutton");
		createFormMainTitleElementXPath = uiElementsPropertiesManager.getSharedUIElementsLocators()
				.getProperty("general.createformTitle");
		testingItemRecentActivity = uiElementsPropertiesManager.getSharedUIElementsLocators()
				.getProperty("general.testingcontentitem.myrecentactivity");

		randomURL = "Test1";
		randomInternalName = "Testing1";

	}

	public void changeBodyToNotRequiredOnEntryContent() {
		previewPage.changeBodyOfEntryContentPageToNotRequired();
	}

	public void createContent() {
		// right click to see the the menu
		driverManager.waitUntilPageLoad();
		driverManager.waitUntilSidebarOpens();
		dashboardPage.rightClickToSeeMenu();

		// Select Entry Content Type
		dashboardPage.clickEntryCT();

		// Confirm the Content Type selected
		dashboardPage.clickOKButton();

		driverManager.usingCrafterForm("cssSelector", createFormFrameElementCss, () -> {
			// creating random values for URL field and InternalName field

			// Set basics fields of the new content created
			dashboardPage.setBasicFieldsOfNewContent(randomURL, randomInternalName);

			// Set the title of main content
			driverManager.sendText("xpath", createFormMainTitleElementXPath, "MainTitle");

			// save and close
			this.driverManager.driverWaitUntilElementIsPresentAndDisplayed("xpath", createFormSaveAndCloseElement)
					.click();
		});

		this.driverManager.waitUntilSidebarOpens();

	}

	@Test(priority = 0)
	public void addNewPageUsingEntryContentTypeAndContextualClickOptionTest() {

		// login to application
		loginPage.loginToCrafter(userName, password);

		driverManager.waitUntilLoginCloses();

		// go to preview page
		homePage.goToPreviewPage();

		// reload page
		driverManager.getDriver().navigate().refresh();

		// body not required
		this.changeBodyToNotRequiredOnEntryContent();

		// expand pages folder
		dashboardPage.expandPagesTree();

		// create content
		createContent();

		// reload page
		driverManager.getDriver().navigate().refresh();

		dashboardPage.expandHomeTree();

		Assert.assertNotNull(driverManager.waitUntilElementIsDisplayed("xpath", testingItemRecentActivity));
	}

}

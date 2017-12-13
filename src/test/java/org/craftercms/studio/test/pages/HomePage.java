package org.craftercms.studio.test.pages;

import org.craftercms.studio.test.utils.UIElementsPropertiesManager;
import org.craftercms.studio.test.utils.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * 
 * @author Gustavo Andrei Ortiz Alfaro
 *
 */

public class HomePage {

	private WebDriverManager driverManager;
	private WebDriver driver;
	private String previewSite;
	private String dashboardSite;
	//private String seeThePageEdited;
	private String createSiteButton;
	private String deleteSiteIcon;
	private String yesDeleteButton;
	private String logOutLink;
	private String signOutLink;
	private String usersContextualNavigationOption;

	public HomePage(WebDriverManager driverManager, UIElementsPropertiesManager UIElementsPropertiesManager) {
		this.driverManager = driverManager;
		this.driver = this.driverManager.getDriver();

		previewSite = UIElementsPropertiesManager.getSharedUIElementsLocators().getProperty("home.previewlink");
		dashboardSite = UIElementsPropertiesManager.getSharedUIElementsLocators().getProperty("home.dashboardlink");
		createSiteButton = UIElementsPropertiesManager.getSharedUIElementsLocators()
				.getProperty("home.createsitebutton");
		deleteSiteIcon = UIElementsPropertiesManager.getSharedUIElementsLocators().getProperty("home.deletesiteicon");
		yesDeleteButton = UIElementsPropertiesManager.getSharedUIElementsLocators()
				.getProperty("home.confirmtodelete");
		logOutLink = UIElementsPropertiesManager.getSharedUIElementsLocators().getProperty("home.expandaccount");
		signOutLink = UIElementsPropertiesManager.getSharedUIElementsLocators().getProperty("home.signout");
		usersContextualNavigationOption = UIElementsPropertiesManager.getSharedUIElementsLocators()
				.getProperty("home.userscontextualnavigationoption");

	}

	// Click on preview link
	public void clickPreviewOption() {
		WebElement previewLink = this.driverManager.driverWaitUntilElementIsPresentAndDisplayedAndClickable("xpath",
				previewSite);
		previewLink.click();
	}

	public void goToPreviewPage() {
		// Click on preview link
		this.clickPreviewOption();
	}

	// Click on dashboard link

	public void clickDashboardOption() {
		this.driverManager.isElementPresentAndClickableByXpath(dashboardSite);
		WebElement dashboardLink = this.driverManager.driverWaitUntilElementIsPresentAndDisplayedAndClickable("xpath",
				dashboardSite);
		dashboardLink.click();
	}

	public void goToDashboardPage() {
		// Click on dashboard
		this.clickDashboardOption();
	}
	
	

	public WebDriverManager getDriverManager() {
		return driverManager;
	}

	public void setDriverManager(WebDriverManager driverManager) {
		this.driverManager = driverManager;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	// Click on Create Site button
	public void clickCreateSiteButton() {
		this.driverManager.isElementPresentAndClickableByXpath(createSiteButton);
		WebElement createSiteOption = this.driverManager
				.driverWaitUntilElementIsPresentAndDisplayedAndClickable("xpath", createSiteButton);
		createSiteOption.click();
	}

	public void clickOnCreateSiteButton() {
		// Click on Create Site button
		this.clickCreateSiteButton();
	}

	// Click on Delete icon to the site
	public void clickDeleteSiteIcon() {
		this.driverManager.isElementPresentAndClickableByXpath(deleteSiteIcon);
		WebElement deleteIcon = this.driverManager.driverWaitUntilElementIsPresentAndDisplayedAndClickable("xpath",
				deleteSiteIcon);
		deleteIcon.click();
	}

	public void clickOnDeleteSiteIcon() {
		// Click on Delete icon to the site
		this.clickDeleteSiteIcon();
	}

	// Click on YES button
	public void clickYesButton() {
		this.driverManager.isElementPresentAndClickableBycssSelector(yesDeleteButton);
		WebElement yesButton = this.driverManager.driverWaitUntilElementIsPresentAndDisplayed("cssSelector",
				yesDeleteButton);
		yesButton.click();
	}

	public void clickOnYesToDeleteSite() {
		// Click on YES button
		this.clickYesButton();
	}

	// Logout to the crafter
	public void expandAccount() {
		this.driverManager.isElementPresentAndClickableByXpath(logOutLink);
		WebElement expandAccount = this.driverManager.driverWaitUntilElementIsPresentAndDisplayedAndClickable("xpath",
				logOutLink);
		expandAccount.click();
	}

	public void clickSignOut() {
		WebElement signOut = this.driverManager.driverWaitUntilElementIsPresentAndDisplayed("cssSelector", signOutLink);
		signOut.click();
	}

	public void clickLogoutOutCrafter() {
		// Expand account
		this.expandAccount();
		// Click on SignOut
		this.clickSignOut();
	}

	public void clickUsersContextualNavigationOption() {
		WebElement usersContextualNavigationOptionWebElement = this.driverManager
				.driverWaitUntilElementIsPresentAndDisplayed("xpath", usersContextualNavigationOption);
		usersContextualNavigationOptionWebElement.click();
	}

	public Boolean isUsersContextualNavigationOptionPresent() {
		return this.driverManager.isElementPresentByXpath(usersContextualNavigationOption);
	}

	public void deleteSite() {
		// Click on Delete icon
		this.clickOnDeleteSiteIcon();
		// Click on YES to confirm the delete.
		this.clickOnYesToDeleteSite();
	}
}
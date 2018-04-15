package aspire.com.pages;

import static org.junit.Assert.assertTrue;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang.RandomStringUtils;
import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import freemarker.core.Environment;
import jo.aspire.automation.logger.EnvirommentManager;
import junit.framework.Assert;
import scala.util.Random;

//Here we can put an implementation of any operation to any step
//import org.seleniumhq.selenium.fluent.FluentWebElement;
//import static org.seleniumhq.selenium.fluent.Period.secs;

/**
 * Page object defining the home page
 */
public class ScitationPage extends FluentWebDriverPage {

	public static String siteHost;
	public static String UserName;
	public static String PassWord;
	public String AuthorName;
	public WebElement LinksItem;
	public WebElement publication;

	public ScitationPage(WebDriverProvider driverProvider) {
		super(driverProvider);
	}

	// Screen screen = new Screen();

	ArrayList<String> theList = new ArrayList<String>();
	List<String> browserTabs;

	public void go() throws IOException {
		get(EnvirommentManager.getInstance().getProperty("LoginPage"));
		getDriverProvider().get().manage().window().maximize();
	}

	public void goToUrl(String content) throws IOException {
		String URL = EnvirommentManager.getInstance().getProperty(content);
		get(URL);
		getDriverProvider().get().manage().window().maximize();
	}

	public void GoFor(String ContentURLVariable) throws IOException {
		String URL = EnvirommentManager.getInstance().getProperty(ContentURLVariable);
		get(URL);
		getDriverProvider().get().manage().window().maximize();

	}

	public void WaitDOMToBeReady() throws Exception {
		boolean pageLoaded = false;
		while (!pageLoaded) {
			int counter = 0;
			if (executeScript("return document.readyState").toString().equals("complete")) {
				pageLoaded = true;
				break;
			}
			if (counter == 20) {
				pageLoaded = true;
				break;
			}
			Thread.sleep(1000);
			counter++;
		}
	}

	public void Login(String username, String password) throws IOException {
		enterValueToTextBox("username", EnvirommentManager.getInstance().getProperty(username));
		enterValueToTextBox("password", EnvirommentManager.getInstance().getProperty(password));

		if (!username.equals("") && !password.equals("")) {
			clickOnElement("Login_button");
		}
		// wait("Page_Title");

	}

	public void Externallogin(String username, String password, String login) throws IOException {
		enterValueToTextBox("username", EnvirommentManager.getInstance().getProperty(username));
		enterValueToTextBox("password", EnvirommentManager.getInstance().getProperty(password));

		if (!username.equals("") && !password.equals("")) {
			clickOnElement("login");
		}
		// wait("Page_Title");

	}

	public WebElement getFirstVisible(WebElement element, String by) {

		Iterator<WebElement> listItems;
		if (element == null) {
			listItems = findElements(By.cssSelector(by)).iterator();
		} else {
			listItems = element.findElements(By.cssSelector(by)).iterator();
		}

		while (listItems.hasNext()) {
			WebElement item = listItems.next();
			if (item.isDisplayed()) {
				return item;
			}
		}
		return null;
	}

	public void scrollToElement(String element) throws IOException {
		waitPresenceOfElement(element);
		WebDriver driver = getDriverProvider().get();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",
				driver.findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty(element))));
	}

	public void scrollToElementAndStop(String element) throws IOException {
		WebDriver driver = getDriverProvider().get();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);",
				driver.findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty(element))));
	}

	public void waitAnimationToDone() {
		WebDriver driver = getDriverProvider().get();
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		// WaitPageToLoad();
		while (!(Boolean) (executor.executeScript("return $(\":animated\").length == 0;"))) {
			System.out.println("   wait animation to done");
		}
	}

	public void wait(String element) throws IOException {
		WebDriverWait wait = new WebDriverWait(getDriverProvider().get(), 6);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector(EnvirommentManager.getInstance().getProperty(element))));

	}

	public void waitAttributeToChange(String element, String attribute, String value) throws IOException {
		WebDriverWait wait = new WebDriverWait(getDriverProvider().get(), 20);
		final boolean result = findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty(element)))
				.getAttribute(attribute).contains(value);
		ExpectedCondition<Boolean> e = new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver arg0) {
				return (result == true);
			}
		};
		wait.until(e);
	}

	public boolean waitPresenceOfElement(String element) throws IOException {
		boolean result = true;
		WebDriverWait wait = new WebDriverWait(getDriverProvider().get(), 20);
		try {
			wait.until(ExpectedConditions
					.presenceOfElementLocated(By.cssSelector(EnvirommentManager.getInstance().getProperty(element))));
		} catch (Exception e) {
			result = false;
		}
		return result;
	}

	public void waitUntilElementBeClickable(String element) throws IOException {
		// WaitPageToLoad();
		WebDriverWait wait = new WebDriverWait(getDriverProvider().get(), 50);
		wait.until(ExpectedConditions
				.elementToBeClickable(By.cssSelector(EnvirommentManager.getInstance().getProperty(element))));
		// WaitPageToLoad();
	}

	public void clickOnTheVisible(String element) throws IOException {
		Iterator<WebElement> day = findElements(By.cssSelector(EnvirommentManager.getInstance().getProperty(element)))
				.iterator();
		while (day.hasNext()) {
			WebElement item2 = day.next();
			if (item2.isDisplayed()) {
				item2.click();
			}
		}
	}

	public void refresh() {
		WebDriver driver = getDriverProvider().get();
		driver.navigate().refresh();
		// WaitPageToLoad();
	}

	public void SleepTime(int Time) {
		try {
			Thread.currentThread();
			Thread.sleep(Time);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void scrollDown() throws IOException {

		try {
			WaitDOMToBeReady();
			WebDriver driver = getDriverProvider().get();
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0,2000)", "");
			WaitDOMToBeReady();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void enterValueToTextBox(String element, String value) throws IOException {

		waitPresenceOfElement(element);
		if (value.equalsIgnoreCase("empty")) {
			findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty(element))).clear();
		} else {
			findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty(element))).clear();
			findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty(element))).sendKeys(value);
		}
	}

	public void enterDynamicValueToTextBox(String element, String dataEntry) throws IOException {
		waitPresenceOfElement(element);
		findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty(element)))
				.sendKeys(dataEntry + generateID());

	}

	public void clickOnElement(String element) throws IOException {
		// WaitPageToLoad();
		// wait(element);
		WebDriverWait wait = new WebDriverWait(getDriverProvider().get(), 20);
		wait.until(ExpectedConditions
				.elementToBeClickable(By.cssSelector(EnvirommentManager.getInstance().getProperty(element))));
		WebDriver driver = getDriverProvider().get();
		Actions action = new Actions(driver);
		action.moveToElement(findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty(element)))).click()
				.perform();

	}

	public void clickOnAnElement(String element) throws IOException {

		waitPresenceOfElement(element);

		findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty(element))).click();
		try {
			WaitDOMToBeReady();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void clickOnSearchElement(String element) throws IOException {

		waitPresenceOfElement(element);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty(element))).click();
		try {
			WaitDOMToBeReady();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void clickOnAnElementt(String element) throws IOException {
		waitPresenceOfElement("Share_FB_PT");
		get("https://www.facebook.com/PhysicsToday/");

		try {
			WaitDOMToBeReady();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void clickRandomElement(String element) throws IOException {
		waitPresenceOfElement(element);

		List<WebElement> links = findElements(By.cssSelector(EnvirommentManager.getInstance().getProperty(element)));
		Random r = new Random();
		links.get(r.nextInt(links.size())).click();
		try {
			WaitDOMToBeReady();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickOnElementUsingJS(String element) throws IOException {
		WebDriver driver = getDriverProvider().get();
		element = EnvirommentManager.getInstance().getProperty(element);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("$('" + element + "').click();");
	}

	public void waitElementToDisappear(String element) throws IOException {
		WebDriverWait wait = new WebDriverWait(getDriverProvider().get(), 360);
		wait.until(ExpectedConditions
				.invisibilityOfElementLocated(By.cssSelector(EnvirommentManager.getInstance().getProperty(element))));

	}

	public boolean checkTheTitleOfThePages(String title) throws IOException {
		boolean result = false;
		SleepTime(4000);
		// waitPageTitleToLoad();
		if (findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty("Page_Title"))).getText().toString()
				.contains(title)) {
			result = true;
		}
		return result;
	}

	public boolean compareTwoElement(String element, String value) throws IOException {
		waitElementToDisappear("progressDialog");
		SleepTime(1000);
		waitPresenceOfElement(element);
		boolean result = false;
		if (findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty(element))).getText().toString()
				.equalsIgnoreCase(value)) {
			result = true;
		}
		return result;
	}

	public boolean checkIsDisplys(String element) throws IOException {
		// waitElementToDisappear("progressDialog");
		waitPresenceOfElement(element);
		return findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty(element))).isDisplayed();

	}

	public void acceptTheAlert() throws AWTException {
		// WebDriver driver = getDriverProvider().get();
		// String winHandleBefore = driver.getWindowHandle();
		try {
			SleepTime(6000);
			Robot object = new Robot();
			// Press Enter<br>
			object.keyPress(KeyEvent.VK_ENTER);
			// Release Enter<br>
			object.keyRelease(KeyEvent.VK_ENTER);
		} catch (NoAlertPresentException ex) {
		}
		// driver.switchTo().window(winHandleBefore);
	}

	public void acceptTheDialog() throws AWTException {

		try {
			WebDriverWait wait = new WebDriverWait(getDriverProvider().get(), 10);
			wait.until(ExpectedConditions.alertIsPresent());
			switchTo().alert().accept();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static String generateTimeStamp(String prefix) {
		java.util.Date date = new java.util.Date(); // Right now
		java.sql.Timestamp timestamp = new java.sql.Timestamp(date.getTime());
		String token = new SimpleDateFormat("MM/dd/yyyy hh:mm").format(timestamp).toString();

		return prefix + " " + token;
	}

	public static String getCurrentTime() {
		java.util.Date date = new java.util.Date(); // Right now
		java.sql.Timestamp timestamp = new java.sql.Timestamp(date.getTime());
		String token = new SimpleDateFormat("MM/dd/yy hh:mm a").format(timestamp).toString();

		return token;
	}

	public static String generateID() {
		java.util.Date date = new java.util.Date(); // Right now
		java.sql.Timestamp timestamp = new java.sql.Timestamp(date.getTime());
		String token = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(timestamp).toString();
		return token;
	}

	public static String generateEmail(String prefix) {
		java.util.Date date = new java.util.Date(); // Right now
		java.sql.Timestamp timestamp = new java.sql.Timestamp(date.getTime());
		String token = new SimpleDateFormat("MMddyyyyhhmmss").format(timestamp).toString();
		String[] emailArray = prefix.split("@");
		String generatedEmail = emailArray[0] + token + "@" + emailArray[1];

		return generatedEmail;
	}

	public void searchForAnElement() throws IOException {
		waitElementToDisappear("progressDialog");
		SleepTime(2000);
		waitUntilElementBeClickable("Search_Box");
		enterValueToTextBox("Search_Box", "#Automation ");
		waitElementToDisappear("progressDialog");
		SleepTime(2000);
	}

	public int calculateTheNumberOfItems(String items) throws IOException {
		int num1;
		waitElementToDisappear("progressDialog");
		// wait(items);
		SleepTime(2000);
		if (findElements(By.cssSelector(EnvirommentManager.getInstance().getProperty("Last_page_Button")))
				.size() == 0) {
			if (findElements(By.cssSelector(EnvirommentManager.getInstance().getProperty(items))).size() == 0) {
				num1 = 0;
			} else {
				num1 = findElements(By.cssSelector(EnvirommentManager.getInstance().getProperty(items))).size();
			}
		} else {
			clickOnElement("Last_page_Button");
			waitElementToDisappear("progressDialog");
			waitPresenceOfElement(items);
			SleepTime(2000);
			num1 = findElements(By.cssSelector(EnvirommentManager.getInstance().getProperty(items))).size();
		}
		return num1;
	}

	public boolean isEnabled(String element) throws IOException {
		boolean Condition = false;
		waitPresenceOfElement(element);
		if (findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty(element))).isEnabled()) {
			Condition = true;
		}
		return Condition;
	}

	public void hoverOverElement(String theElement) throws IOException {
		// waitElementToDisappear("progressDialog");
		waitPresenceOfElement(theElement);
		WebElement elem = findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty(theElement)));
		Actions builder = new Actions(getDriverProvider().get());
		Actions hoverOver = builder.moveToElement(elem);
		hoverOver.perform();
	}

	public void resetAttribute(String element, String Attribute, String value) {
		WebDriver driver = getDriverProvider().get();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement setElement = driver.findElement(By.cssSelector(element));
		js.executeScript("arguments[0].setAttribute('" + Attribute + "', '" + value + "')", setElement);
	}

	public boolean alertPresent() {
		WebDriver driver = getDriverProvider().get();
		try {
			(driver).switchTo().alert();
			return true;
		} // try
		catch (NoAlertPresentException Ex) {
			return false;
		} // catch

	}

	public boolean CheckElementNotDisplays(String element) throws IOException {
		if (VerifyTheVisibiltyOfContentSimple(element)) {
			return false;
		}
		return true;
	}

	public void ScrollAndClick(String element) throws IOException {
		waitPresenceOfElement("Page_Title");
		waitPresenceOfElement("Search_Box");
		// scrollToElement("Search_Box");
		scrollToElementAndStop(element);
		clickOnElement(element);
		waitPresenceOfElement("Page_Title");
	}

	public void printLists(ArrayList<String> a1, ArrayList<String> a2) {

		int size = 0;

		if (a1.size() >= a2.size()) {
			size = a1.size();
		} else {
			size = a2.size();
		}

		for (int i = 0; i < size; i++) {

			System.err.println(a1.get(i) + "               " + a2.get(i));
			System.out.println("\n");
			System.out.println("\n");
			System.out.println("\n");

		}
	}

	public void displaysElement(String element) throws IOException {
		try {
			WaitDOMToBeReady();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		waitPresenceOfElement(element);
		findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty(element))).isDisplayed();

	}

	public void displaysPagination() throws IOException {
		try {
			WaitDOMToBeReady();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		waitPresenceOfElement("div.pagenation li.active a");
		Boolean b = findElement(
				By.cssSelector(EnvirommentManager.getInstance().getProperty("div.pagenation li.active a")))
						.isDisplayed();
		if (b) {

		} else {
		}
	}

	public boolean hideElement(String element) throws IOException {
		try {
			WaitDOMToBeReady();
		} catch (Exception e) {

		}
		boolean NotDisplay = findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty(element)))
				.isDisplayed();

		if (!NotDisplay)
			;
		{
			return true;
		}

	}

	public void switchTabs() {
		WebDriver driver = getDriverProvider().get();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		browserTabs = new ArrayList<String>(getWindowHandles());
		switchTo().window(browserTabs.get(1));
		try {
			WaitDOMToBeReady();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void switchTab() throws InterruptedException {

		Thread.sleep(2000);
	}

	public void switchTabs2() {

		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		browserTabs = new ArrayList<String>(getWindowHandles());
		switchTo().window(browserTabs.get(2));
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void switchWindows() {
		ArrayList<String> tabs2 = new ArrayList<String>(getWindowHandles());

		if (getDriverProvider().get().getWindowHandles().size() > 0) {
			switchTo().window(tabs2.get(1));
		} else {
			switchTo().window(tabs2.get(0));
		}

		try {
			WaitDOMToBeReady();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	String ElemntText;

	public void getText(String element) throws IOException {
		waitPresenceOfElement(element);
		ElemntText = findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty(element))).getText();

	}

	public void CompareElementsText(String Elemnt) {
		Elemnt = findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty(Elemnt))).getText();
		Assert.assertTrue(Elemnt.toLowerCase().contains(ElemntText.toLowerCase()));
	}

	public void assertResult(String Actual, String expected) throws IOException {

		waitPresenceOfElement(Actual);
		String Message = findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty(Actual))).getText();
		System.out.println(Message + "---------" + expected);
		Assert.assertTrue(Message.toLowerCase().contains(expected.toLowerCase()));
		Assert.assertTrue(Message.toLowerCase().contains(expected.toLowerCase()));
	}

	public void SwitchToIframe(String IframeSelector) throws IOException {
		getDriverProvider().get().switchTo()
				.frame(findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty(IframeSelector))));
	}

	public void SwitchBackFromIframe() throws IOException {
		getDriverProvider().get().switchTo().defaultContent();
	}

	public boolean WaitElementToAppear(int Duration, String element) throws IOException {
		WaitAll(Duration).until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector(EnvirommentManager.getInstance().getProperty(element))));
		return findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty(element))).isDisplayed();
	}

	public WebDriverWait WaitAll(int WaitTime) {
		WebDriverWait wait = new WebDriverWait(getDriverProvider().get(), WaitTime);
		return wait;
	}

	String firstElemntText;

	public void SelectFromList(String element) throws IOException {

		WaitElementToAppear(10, element);
		List<WebElement> allOptions = findElements(
				By.cssSelector(EnvirommentManager.getInstance().getProperty(element)));
		for (int i = 0; i < allOptions.size();) {
			firstElemntText = allOptions.get(i).getText();
			allOptions.get(i + 1).click();
			break;
		}
	}

	@SuppressWarnings("deprecation")
	public void checkHyperLinkNavigation(String elemnt) throws IOException {

		List<WebElement> links = findElements(By.cssSelector(EnvirommentManager.getInstance().getProperty(elemnt)));
		for (int i = 0; i < links.size(); i++) {
			String Link = links.get(i).getAttribute("href");
			if (!Link.equals(null)) {
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				links.get(i).click();
				ArrayList<String> tabs2 = new ArrayList<String>(getWindowHandles());
				if (tabs2.size() == 1) {
					try {
						WaitDOMToBeReady();
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					Assert.assertEquals(getCurrentUrl().contains(Link), true);
					navigate().back();
					try {
						WaitDOMToBeReady();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					links = findElements(By.cssSelector(EnvirommentManager.getInstance().getProperty(elemnt)));
				} else {
					switchTo().window(tabs2.get(1));
					try {
						WaitDOMToBeReady();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					Assert.assertEquals(Link, getCurrentUrl());
					close();
					switchTo().window(tabs2.get(0));
				}

			}
		}
	}

	public void TOCBrowsevolumes() throws IOException {
		List<WebElement> Volumes = findElements(
				By.cssSelector(EnvirommentManager.getInstance().getProperty("Volumes")));
		List<WebElement> Volumes_Years = findElements(
				By.cssSelector(EnvirommentManager.getInstance().getProperty("Volumes_Years")));

		for (int i = 0; i < Volumes.size(); i++) {
			if (VerifyTheVisibiltyOfContentSimple("TOC_Articles")) {
				break;
			} else {
				Volumes = findElements(By.cssSelector(EnvirommentManager.getInstance().getProperty("Volumes")));
				Volumes_Years = findElements(
						By.cssSelector(EnvirommentManager.getInstance().getProperty("Volumes_Years")));
				for (int v = 0; v < Volumes_Years.size(); v++) {
					Volumes_Years.get(v).click();
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				if (Volumes.get(i).getText().equals(null)) {
					i++;
				}
				Volumes.get(i).click();
				try {
					WaitDOMToBeReady();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		}

	}

	public boolean VerifyTheVisibiltyOfContentSimple(String ItemSelector) throws IOException {
		boolean condition = false;
		condition = findElements(By.cssSelector(EnvirommentManager.getInstance().getProperty(ItemSelector))).size() > 0;
		return condition;
	}

	@SuppressWarnings("deprecation")
	public void CheckElementListText(String ElementList, String text) {
		List<WebElement> AboutPublishers = findElements(
				By.cssSelector(EnvirommentManager.getInstance().getProperty(ElementList)));
		for (int i = 0; i < AboutPublishers.size(); i++) {
			if (AboutPublishers.get(i).getText().equals(text)) {
				Assert.assertTrue(AboutPublishers.get(i).getText().toLowerCase().contains(text.toLowerCase()));
				break;
			}
		}

	}

	@SuppressWarnings("deprecation")
	public void CheckPublishersLogo(String name) {
		List<WebElement> PublishersLogo = findElements(
				By.cssSelector(EnvirommentManager.getInstance().getProperty("publishers_Logo")));
		for (int i = 0; i < PublishersLogo.size(); i++) {
			if (PublishersLogo.get(i).getAttribute("href").contains(name)) {
				Assert.assertTrue(
						PublishersLogo.get(i).getAttribute("href").toLowerCase().contains(name.toLowerCase()));
				break;
			}
		}

	}

	public void PDFopenProperly() throws IOException {

		String PDF_URL = findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty("Access_PDF")))
				.getAttribute("href");
		clickOnAnElement("Access_PDF");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertTrue(getCurrentUrl().contains(PDF_URL));
	}

	public void FillRegistrationForm() throws IOException {
		enterValueToTextBox("Registeration_FirstName_TextBox", RandomStringUtils.randomAlphabetic(5));
		enterValueToTextBox("Registeration_LasttName_TextBox", RandomStringUtils.randomAlphabetic(5));
		enterValueToTextBox("Registeration_Email_TextBox", generateEmail("Email@Email.com"));
		enterValueToTextBox("Registeration_Password_TextBox",
				RandomStringUtils.randomAlphabetic(5) + RandomStringUtils.randomAscii(5));
		clickOnElement("Terms_of_Use");
		enterValueToTextBox("Captcha_Textbox", RandomStringUtils.randomAlphabetic(5));

	}

	public void getURL(String Page_URL) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertTrue(getCurrentUrl().contains(Page_URL));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void getTheURL(String Page_URL) {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Assert.assertTrue(getCurrentUrl().contains(Page_URL));

	}

	public boolean TestCompareText(String elem, String elem2) throws IOException {
		try {
			WaitDOMToBeReady();
		} catch (Exception e) {

		}
		String Text1 = findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty(elem))).getText();
		String Article = "div.art_title linkable a h4";
		findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty("div.art_title linkable a h4")))
				.click();
		String Text2 = findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty(elem2))).getText();
		System.out.println(Text1 + " " + Text2);
		return true;

	}

	public void switchWindowsBack() {
		ArrayList<String> tabs2 = new ArrayList<String>(getWindowHandles());
		switchTo().window(tabs2.get(0));
		try {
			WaitDOMToBeReady();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickOnRandomElement(String element) throws IOException {
		waitPresenceOfElement(element);
		List<WebElement> links = findElements(By.cssSelector(EnvirommentManager.getInstance().getProperty(element)));
		Random r = new Random();
		LinksItem = links.get(r.nextInt(links.size()));
		AuthorName = LinksItem.getText();
		String Arr[] = AuthorName.split(" ");
		AuthorName = Arr[0];
		System.out.println(AuthorName);
		LinksItem.click();

		try {
			WaitDOMToBeReady();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickRandomVolume(String element) throws IOException {
		waitPresenceOfElement(element);
		List<WebElement> links = findElements(By.cssSelector(EnvirommentManager.getInstance().getProperty(element)));
		Random r = new Random();
		LinksItem = links.get(r.nextInt(links.size()));
		AuthorName = LinksItem.getText();
		String Arr[] = AuthorName.split(",");
		AuthorName = Arr[0];
		System.out.println(AuthorName);
		LinksItem.click();

		try {
			WaitDOMToBeReady();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickRandomElementa(String element) throws IOException {
		waitPresenceOfElement(element);

		List<WebElement> links = findElements(By.cssSelector(EnvirommentManager.getInstance().getProperty(element)));
		Random r = new Random();
		links.get(r.nextInt(3 - 0 + 1)).click();
		try {
			WaitDOMToBeReady();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void locateTit(String Actual) throws IOException {
		WebDriver driver = new FirefoxDriver();
		waitPresenceOfElement(Actual);
		String sss = driver.findElement(By.cssSelector(Actual)).getText();
		List<WebElement> links = findElements(By.cssSelector(EnvirommentManager.getInstance().getProperty(Actual)));
		AuthorName = sss;
		System.out.println(AuthorName);
	}

	public void assertResultRandom(String Actual) throws IOException {

		waitPresenceOfElement(Actual);
		String Message = findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty(Actual)))
				.getAttribute("value");
		System.out.println("Message : " + Message + " - " + "Author name : " + AuthorName + " .");
		Assert.assertTrue(Message.toLowerCase().contains(AuthorName.toLowerCase()));
	}

	public void test() throws IOException {
		try {
			WaitDOMToBeReady();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 1; i < 20; i++) {
			clickRandomElementa("Journal-Logo");
			System.out.println("1");
			clickOnRandomElement("Journal-Randomly");
			System.out.println("2");
			if (findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty("Collection-Section")))
					.isDisplayed()) {
				break;
			} else {

			}
		}

	}

	@SuppressWarnings("deprecation")
	public void assertVolume(String Actual) throws IOException {

		waitPresenceOfElement(Actual);
		String Message = findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty(Actual))).getText();

		System.out.println("Message : " + Message + " - " + "Volume  : " + AuthorName + " .");
		Assert.assertTrue(Message.toLowerCase().contains(AuthorName.toLowerCase()));
	}

	public void assertNotResult(String Actual, String expected) throws IOException {

		waitPresenceOfElement(Actual);
		String Message = findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty(Actual))).getText();
		System.out.println(Message + "---------" + expected);
		Assert.assertFalse(Message.toLowerCase().contains(expected.toLowerCase()));

	}

	public void newsArticle(String element, String title) throws IOException {
		try {
			WaitDOMToBeReady();
		} catch (Exception e) {

		}
		String Text1 = findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty(element))).getText();
		System.out.println(Text1 + " == " + title);
		findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty(element)))
				.click();
		System.out.println("Test");
		
		try {
			Thread.sleep(2000);
			WaitDOMToBeReady();
		} catch (Exception e) {

		}
		System.out.println(Text1 + " == " + title);
		Assert.assertTrue(Text1.toLowerCase().contains(findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty(title))).getText().toLowerCase()));

	}

}
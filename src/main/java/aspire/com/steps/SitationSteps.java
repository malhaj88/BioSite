package aspire.com.steps;

import java.io.IOException;
import org.jbehave.core.annotations.Composite;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import aspire.com.pages.PageFactory;

public class SitationSteps extends BaseSteps {

	public SitationSteps() {
		super();
	}

	public SitationSteps(PageFactory pageFactory) {
		super(pageFactory);
	}

	@cucumber.api.java.en.Given("I am on login page")
	@Given("I am on login page")
	public void GotoLoginPage() throws IOException {
		getScitationPage().go();
		// driver.WaitDOMToBeReady();
	}

	@When("I enter $username username and $password password")
	public void FillUsernameAndPassword(@Named("username") String username, @Named("password") String password)
			throws IOException {
		getScitationPage().Login(username, password);

	}

	@Given("user login with $vlaidUsername user name and $validPassword password.")
	@When("user login with $vlaidUsername user name and $validPassword password.")
	@Then("user login with $vlaidUsername user name and $validPassword password.")
	public void Login(@Named("username") String username, @Named("password") String password) throws IOException {
		// driver.DeleteCookies();
		getScitationPage().WaitElementToAppear(10, "username");
		getScitationPage().WaitElementToAppear(10, "password");
		getScitationPage().Login(username, password);
	}

	@Given("The $Actual should be $Expected")
	@When("The $Actual should be $Expected")
	@Then("The $Actual should be $Expected")
	public void Assert(@Named("Actual") String Actual, @Named("Expected") String Expected) throws IOException {
		getScitationPage().assertResult(Actual, Expected);
	}
	
	@Given("The $Actual should not be $Expected")
	@When("The $Actual should not be $Expected")
	@Then("The $Actual should not be $Expected")
	public void AssertNot(@Named("Actual") String Actual, @Named("Expected") String Expected) throws IOException {
		getScitationPage().assertNotResult(Actual, Expected);
	}

	@When("page URL should be $Page_URL")
	@Then("page URL should be $Page_URL")
	public void Assert(@Named("Page_URL") String Page_URL) throws IOException {
		getScitationPage().getURL(Page_URL);
	}

	@When("Page URL should be $Page_URL")
	@Then("Page URL should be $Page_URL")
	public void Assertt(@Named("Page_URL") String Page_URL) throws IOException {
		getScitationPage().getTheURL(Page_URL);
	}

	@Given("I am On $PageURL")
	public void GotoPage(String PageURL) throws IOException {
		getScitationPage().GoFor(PageURL);
		// driver.WaitDOMToBeReady();
	}

	@When("URL page sholud be $Page_Url")
	@Then("URL page sholud be $Page_Url")
	public void AssertUrl(@Named("Page_URL") String Page_URL) throws IOException {
		getScitationPage().goToUrl(Page_URL);
	}

	@Given("I Fill $Value to : $selector")
	@When("I Fill $Value to : $selector")
	public void fillDynamicVal(@Named("Val") String value, @Named("ele") String element) throws IOException {
		getScitationPage().enterValueToTextBox(element, value);
	}

	@Given("I click on $element")
	@When("I click on $element")
	@Then("I click on $element")
	public void clickOnElement(@Named("element") String element) throws IOException, Exception {
		getScitationPage().clickOnAnElement(element);
	}
	
	@Given("I click On Search $element")
	@When("I click On Search $element")
	@Then("I click On Search $element")
	public void clickOnSearchElement(@Named("element") String element) throws IOException, Exception {
		getScitationPage().clickOnSearchElement(element);
	}


//	@Given("I click random $element")
//	@When("I click random $element")
//	@Then("I click random $element")
//	public void clickRandomElement(@Named("element") String element) throws IOException, Exception {
//		getScitationPage().clickRandomElement(element);
//	}
//
//	@Given("I locate title $element")
//	@When("I locate title $element")
//	@Then("I locate title $element")
//	public void locateTit(@Named("element") String element) throws IOException, Exception {
//		getScitationPage().locateTit(element);
//	}
//
//	@Given("I aclick random $element")
//	@When("I aclick random $element")
//	@Then("I aclick random $element")
//	public void clickRandomElementa(@Named("element") String element) throws IOException, Exception {
//		getScitationPage().clickRandomElementa(element);
//	}
//
//	@Given("I clicK random $element")
//	@When("I clicK random $element")
//	@Then("I clicK random $element")
//	public void clickRandomElement2(@Named("element") String element) throws IOException, Exception {
//		getScitationPage().clickRandomElement2(element);
//	}

	@Given("I click random $element")
	@When("I click random $element")
	@Then("I click random $element")
	public void clickRandomElement(@Named("element") String element) throws IOException, Exception {
		getScitationPage().clickRandomElement(element);
	}

	@Given("I locate title $element")
	@When("I locate title $element")
	@Then("I locate title $element")
	public void locateTit(@Named("element") String element) throws IOException, Exception {
		getScitationPage().locateTit(element);
	}

	@Given("I aclick random $element")
	@When("I aclick random $element")
	@Then("I aclick random $element")
	public void clickRandomElementa(@Named("element") String element) throws IOException, Exception {
		getScitationPage().clickRandomElementa(element);
	}

//	@Given("I clicK random $element")
//	@When("I clicK random $element")
//	@Then("I clicK random $element")
//	public void clickRandomElement2(@Named("element") String element) throws IOException, Exception {
//		getScitationPage().clickRandomElement2(element);
//	}

	@Given("I Click On $element")
	@When("I Click On $element")
	@Then("I Click On $element")
	public void clickOnElementUsingJS(@Named("element") String element) throws IOException {
		getScitationPage().clickOnElementUsingJS(element);
	}

	@Given("The $element should display")
	@When("The $element should display")
	@Then("The $element should display")
	public void Browse(@Named("element") String element) throws IOException {
		getScitationPage().displaysElement(element);
	}


	
	@Given("pagination should display")
	@When("pagination should display")
	@Then("pagination should display")
	public void displaysPagination() throws IOException {
		getScitationPage().displaysPagination();
	}
	
	@Then("The page contents should appears")
	@Composite(steps = { "Then The Abstract should display", "Then The Figure should display",
			"Then The Tools should display", "Then The Share should display", "Then The Metrics should display",
			"Then The View_Affiliations should display", "Then The Journal_Logo should display",
			"Then The Journal_Home should display", "Then The Journal_Browse should display",
			"Then The Journal_Info should display", "Then The Journal_ForAuthors should display",
			"Then The SignUpForAlerts should display", "Then The Menu should display" })
	public void loadTheCorrespondencePageContent() {
	}

	@When("The $element should hide")
	@Then("The $element should hide")
	public void hide(@Named("element") String element) throws IOException {
		getScitationPage().hideElement(element);
	}

	@Given("I select one of $element")
	@When("I select one of $element")
	@Then("I select one of $element")
	public void SelectFromList(@Named("element") String element) throws IOException {
		getScitationPage().SelectFromList(element);
	}

	@Given("I scroll To $element")
	@When("I scroll To $element")
	@Then("I scroll To $element")
	public void scrollToElement(@Named("element") String element) throws IOException {
		getScitationPage().scrollToElement(element);
	}

	@Then("I check Clicking On $elemnt lead to the appropriate pages")
	public void checkLink(String elemnt) throws IOException {
		getScitationPage().checkHyperLinkNavigation(elemnt);
	}

	@Then("I switch tabs")
	@When("I switch tabs")
	public void switchTabs() throws IOException {
		getScitationPage().switchTabs();
	}

	@Then("I switch tab")
	@When("I switch tab")
	public void switchTab() throws IOException, InterruptedException {
		getScitationPage().switchTab();
	}

	@Then("I switch tab 2")
	@When("I switch tab 2")
	public void switchTabs2() throws IOException {
		getScitationPage().switchTabs2();
	}

	@Given("I Choose one of TOC Browse volumes")
	@When("I Choose one of TOC Browse volumes")
	@Then("I Choose one of TOC Browse volumes")
	public void TOCBrowsevolumes() throws IOException {
		getScitationPage().TOCBrowsevolumes();
	}

	@When("The $element should Not display")
	@Then("The $element should Not display")
	public boolean CheckElementNotDisplays(@Named("element") String element) throws IOException {
		return getScitationPage().CheckElementNotDisplays(element);
	}

	@When("The $ElementList Should be $text")
	@Then("The $ElementList Should be $text")
	public void CheckElementListText(@Named("ElementList") String ElementList, @Named("text") String text)
			throws IOException {
		getScitationPage().CheckElementListText(ElementList, text);
	}

	@When("The $Name publisher Logo Should Dispaly")
	@Then("The $Name publisher Logo Should Dispaly")
	public void CheckPublishersLogo(@Named("Name") String Name) throws IOException {
		getScitationPage().CheckPublishersLogo(Name);
	}

	@When("I click On PDF and PDF Should open properly")
	@Then("I click On PDF and PDF Should open properly")
	public void PDFopenProperly() throws IOException {
		getScitationPage().PDFopenProperly();
	}

	@When("I Check The $selector Title Text")
	@Then("I Check The $selector Title Text")
	public void getText(String selector) throws IOException {
		getScitationPage().getText(selector);
	}

	@When("I compair the Publication Title with $selector")
	@Then("I compair the Publication Title with $selector")
	public void CompareElementsText(String selector) throws IOException {
		getScitationPage().CompareElementsText(selector);
	}

	@When("I Fill Registration form")
	@Then("I Fill Registration form")
	public void FillRegistrationForm() throws IOException {
		getScitationPage().FillRegistrationForm();
	}

	@Given("I am on RegistrationPage")
	public void Nothing() {

	}

	@When("I hover over $element")
	@Then("I hover over $element")
	public void hoverOverElement(@Named("element") String element) throws IOException, Exception {
		getScitationPage().hoverOverElement(element);
	}

	@When("I switch to frame $element")
	@Then("I switch to frame $element")
	public void switchToFrame(@Named("element") String element) throws IOException, Exception {
		getScitationPage().SwitchToIframe(element);

	}

	@When("I switch to window")
	@Then("I switch to window")
	public void switchToWindow() throws IOException {
		getScitationPage().switchWindows();
	}

	@Given("The $ElementList Should Match $text")
	@When("The $ElementList Should Match $text")
	@Then("The $ElementList Should Match $text")
	public void TestCompareText(@Named("ElementList") String ElementList, @Named("text") String text)
			throws IOException, Exception {
		getScitationPage().TestCompareText(ElementList, text);
	}

	@Given("I Click ON Random $element")
	@When("I Click ON Random $element")
	@Then("I Click ON Random $element")
	public void clickONRandomElement(@Named("element") String element) throws IOException, Exception {
		getScitationPage().clickOnRandomElement(element);
	}

	@Given("I click Random Volume $element")
	@When("I click Random Volume $element")
	@Then("I click Random Volume $element")
	public void clickRandomVolume(@Named("element") String element) throws IOException, Exception {
		getScitationPage().clickRandomVolume(element);
	}
	

	@Given("I scroll down")
	@When("I scroll To down")
	@Then("I scroll To down")
	public void scrollDown() throws IOException {
		getScitationPage().scrollDown();
	}

	@When("I switch to window back")
	@Then("I switch to window back")
	public void switchToWindowback() throws IOException {
		getScitationPage().switchWindowsBack();
	}

	@Given("the $Actual should be the same")
	@When("the $Actual should be the same")
	@Then("the $Actual should be the same")
	public void Assert2(@Named("Actual") String Actual) throws IOException {
		getScitationPage().assertResultRandom(Actual);
	}


	@Given("The test")
	@When("The test")
	@Then("The test")
	public void test() throws IOException {
		getScitationPage().test();
	}	
	@Given("Same $volume should display")
	@When("Same $volume should display")
	@Then("Same $volume should display")
	public void assertVolume(@Named("volume") String volume) throws IOException {
		getScitationPage().assertVolume(volume);
	}
	
	@When("click All $List Element on $element")
	@Then("click All $List Element on $element")
	public void clickAllElement(@Named("List") String list,@Named("element") String element) throws IOException, InterruptedException {
		getScitationPage().clickAllElement(list,element);
	}

}
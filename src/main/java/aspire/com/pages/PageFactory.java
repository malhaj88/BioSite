package aspire.com.pages;

import org.jbehave.web.selenium.WebDriverProvider;

import jo.aspire.automation.logger.EnvirommentManager;

/**
 * PageFactory that is used to instantiate desired page object
 */

public class PageFactory {
	
	private WebDriverProvider webDriverProvider;
	public PageFactory(WebDriverProvider webDriverProvider) {
		EnvirommentManager.setInitialClass(this.getClass());
		this.webDriverProvider = webDriverProvider;
	}
	public WebDriverProvider getDriverProvider(){
		return webDriverProvider;
	}

	public StepsPage newSteps() {
		return new StepsPage(webDriverProvider);
	}
	public ScitationPage newSitationSteps() {
		return new ScitationPage(webDriverProvider);
	}
	
	

}

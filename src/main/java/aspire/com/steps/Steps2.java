package aspire.com.steps;

import java.io.IOException;

import org.hamcrest.Matchers;
import org.jbehave.core.annotations.*;
import org.jbehave.core.model.Narrative;
import org.parosproxy.paros.network.HttpMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.zaproxy.zap.CustomProxyListener;

import aspire.com.pages.*;
import cucumber.api.java.Before;
import jo.aspire.automation.logger.AspireLog4j;
import jo.aspire.automation.logger.Log4jLevels;

import static org.hamcrest.MatcherAssert.assertThat;

public class Steps2 extends BaseSteps {

	public Steps2(){
		super();
	}

	public Steps2(PageFactory pageFactory) {
		super(pageFactory);
	}

    
//	@cucumber.api.java.en.Given("I am on login page")
//	@Given("I am on login page")
//	public void BrightspotLoginPage() throws IOException {
//		// getStepsPage().logUserOut();
//		getStepsPage().go();
//
//		System.out.println("######################################################hooolaaa");
//		for (HttpMessage msg : CustomProxyListener.allRequests) {
//			System.out.println(msg.getRequestHeader().getURI().toString());
//		}
//		System.out.println("######################################################hooolaaa");
//
//	}


//	@When("I click on $element")
//	public void onelement(@Named("element") String element) throws IOException {
//		getStepsPage().clickOnElement(element);
//	}
	@When("wait for sec")
	public void sleep() throws InterruptedException {
		Thread.sleep(25000);
	}

	@Given("I do nothing")
	public void test() throws IOException {
	}




	@Given("user login with '$username' user name and '$password' password.")
	public void Login(@Named("username") String username, @Named("password") String password)
			throws IOException, InterruptedException {

		System.out.println("######################################################hooolaaa");
		for (HttpMessage msg : CustomProxyListener.allRequests) {
			System.out.println(msg.getRequestHeader().getURI().toString());
		}
		System.out.println("######################################################hooolaaa");

	}

}

    
    
    
    
    

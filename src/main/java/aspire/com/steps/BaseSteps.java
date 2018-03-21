package aspire.com.steps;

import aspire.com.pages.StepsPage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import aspire.com.pages.PageFactory;
import aspire.com.pages.ScitationPage;

@ContextConfiguration(
		//"classpath:/aspire/com/steps/cucumber.xml"
		  "file:cucumber.xml"
		)
public class BaseSteps {

	
	@Autowired 
	PageFactory pageFactory=null;
	private StepsPage steps;
	private ScitationPage Scitation;
	public BaseSteps() {
	
	}
	public BaseSteps(PageFactory pageFactory) {
		this.pageFactory = pageFactory;
		System.out.println("hola2");

	}
	public StepsPage getStepsPage()
	{
		if(steps == null){
			steps = pageFactory.newSteps();
		}
		return steps;
		
	}
	public ScitationPage getScitationPage()
	{
		if(Scitation == null){
			Scitation = pageFactory.newSitationSteps();
		}
		return Scitation;
		
	}
	
}

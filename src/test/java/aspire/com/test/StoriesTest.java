
package aspire.com.test;

import static java.util.Arrays.asList;
import static org.jbehave.core.io.CodeLocations.codeLocationFromClass;
import static org.jbehave.core.reporters.Format.CONSOLE;
import static org.jbehave.web.selenium.WebDriverHtmlOutput.WEB_DRIVER_HTML;

import java.io.File;
import java.io.FileReader;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jo.aspire.automation.logger.AspireLog4j;
import jo.aspire.automation.logger.EnvirommentManager;
import jo.aspire.automation.logger.Log4jLevels;
import jo.aspire.generic.MockServerProxy;
import jo.aspire.web.automationUtil.DriverProvider;

import org.apache.commons.lang3.StringUtils;
import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.embedder.Embedder;
import org.jbehave.core.embedder.MetaFilter;
import org.jbehave.core.embedder.StoryControls;
import org.jbehave.core.embedder.StoryManager;
import org.jbehave.core.failures.FailingUponPendingStep;
import org.jbehave.core.failures.PendingStepStrategy;
import org.jbehave.core.io.LoadFromClasspath;
import org.jbehave.core.io.StoryFinder;
import org.jbehave.core.junit.JUnitStories;
import org.jbehave.core.model.Meta;
import org.jbehave.core.model.Scenario;
import org.jbehave.core.model.Story;
import org.jbehave.core.reporters.CrossReference;
import org.jbehave.core.reporters.Format;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.spring.SpringApplicationContextFactory;
import org.jbehave.core.steps.spring.SpringStepsFactory;
import org.jbehave.web.selenium.ContextView;
import org.jbehave.web.selenium.LocalFrameContextView;
import org.jbehave.web.selenium.SeleniumConfiguration;
import org.jbehave.web.selenium.SeleniumContext;
import org.jbehave.web.selenium.SeleniumContextOutput;
import org.jbehave.web.selenium.SeleniumStepMonitor;
import org.springframework.context.ApplicationContext;
import com.aspire.automationReport.AspireReport;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import aspire.com.zap.ProxyThreadRunner;
import aspire.com.zap.ZapScan;

/**
 * Class which provides the link between the JBehave's executor framework
 * (called Embedder) and the textual stories.
 */
// @RunWith(JUnitReportingRunner.class)
public class StoriesTest extends JUnitStories {
	private static boolean rerunFailedFlag = false;

	// private String[] browsers;
	// static boolean isRunOnSauce;
	// static String[] sauceBrowsers;
	PendingStepStrategy pendingStepStrategy = new FailingUponPendingStep();
	CrossReference crossReference = new CrossReference().withJsonOnly().withPendingStepStrategy(pendingStepStrategy)
			.withOutputAfterEachStory(true).excludingStoriesWithNoExecutedScenarios(true);
	ContextView contextView = new LocalFrameContextView().sized(640, 80).located(10, 10);
	SeleniumContext seleniumContext = new SeleniumContext();
	SeleniumStepMonitor stepMonitor = new SeleniumStepMonitor(contextView, seleniumContext,
			crossReference.getStepMonitor());
	Format[] formats = new Format[] { new SeleniumContextOutput(seleniumContext), CONSOLE, WEB_DRIVER_HTML,
			AspireReport.Aspire_Report };
	StoryReporterBuilder reporterBuilder = new StoryReporterBuilder().withFailureTrace(true)
			.withFailureTraceCompression(true).withDefaultFormats().withFormats(formats)
			.withCrossReference(crossReference);

	@Override
	public Configuration configuration() {
		return new SeleniumConfiguration().useSeleniumContext(seleniumContext)
				.usePendingStepStrategy(pendingStepStrategy)
				.useStoryControls(new StoryControls().doResetStateBeforeScenario(true)).useStepMonitor(stepMonitor)
				.useStoryLoader(new LoadFromClasspath(StoriesTest.class)).useStoryReporterBuilder(reporterBuilder);
	}

	@Override
	public InjectableStepsFactory stepsFactory() {
		ApplicationContext context = new SpringApplicationContextFactory("steps.xml").createApplicationContext();
		return new SpringStepsFactory(configuration(), context);
	}

	@Override
	protected List<String> storyPaths() {
		return new StoryFinder().findPaths(codeLocationFromClass(this.getClass()).getFile(),
				asList("**/" + System.getProperty("storyFilter", "*") + ".story"),
				//asList("**/" + System.getProperty("storyFilter", "TC-021-ClickOnFooterElements-FaceBook") + ".story"),
				null);

	}

	protected List<String> failedStoryPaths(List<String> stories) {
		ArrayList<String> storiesToRun = new ArrayList<String>();

		for (String story : stories) {
			storiesToRun.add("**/" + story + ".story");
		}
		return new StoryFinder().findPaths(codeLocationFromClass(this.getClass()).getFile(), storiesToRun, null);
	}

	public void startStories(Embedder embedder, Boolean runFailed) {
		try {

			if (runFailed) {
				embedder.runStoriesAsPaths(
						failedStoryPaths(AspireReport.getInstance().getReportDataManager().getFailedStories()));
			} else {
				embedder.runStoriesAsPaths(storyPaths());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// embedder.generateCrossReference();
		}
	}

	private JsonArray drivers;

	public static JsonElement convertFileToJSON(String filePath) {
		JsonElement jsonElement = null;
		try {
			JsonParser parser = new JsonParser();
			jsonElement = parser.parse(new FileReader(filePath));
		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.print(ex);
		}
		return jsonElement;
	}

	@Override
	public void run() throws Throwable {

		// ******* Don't Erase this line used to initialize environment manager
		// class ***** //
		jo.aspire.automation.logger.EnvirommentManager.setInitialClass(this.getClass());

		// Method used to Set Threading to true or false based on Threads
		// properties value

		checkThreadsValue();

		// Screenshot property
		AspireReport.getInstance().getReportDataManager().setPreScreenshotEnabled(true);
		AspireReport.getInstance().getReportDataManager().setFailedScreenshotEnabled(true);
		AspireReport.getInstance().getReportDataManager().setPostScreenshotEnabled(true);
		AspireReport.getInstance().getReportDataManager().setDeleteScreenshotsForPassedScenarios(true);
		// Report Information to be added
		AspireReport.getInstance().getReportDataManager().setBuildNumber("apple");
		AspireReport.getInstance().getReportDataManager().setPlatformName("Windows");
		AspireReport.getInstance().getReportDataManager().setPlatformVersion("7");

		// ***********************************************************************
		// //

		drivers = convertFileToJSON(this.getClass().getResource("/configs/drivers.json").getPath()).getAsJsonArray();
		int executableBrowsers = 0;
		for (JsonElement dr : drivers) {

			JsonObject currentDriver = dr.getAsJsonObject();
			if (Boolean.parseBoolean(currentDriver.get("execute").getAsString())) {
				executableBrowsers++;
				DriverProvider.setDriverToRun(currentDriver);

				EnvirommentManager.setInitialClass(this.getClass());

				boolean isAnalytics = Boolean
						.parseBoolean(currentDriver.get("local").getAsJsonObject().get("isProxy").getAsString());
				boolean isSecurityTest = Boolean
						.parseBoolean(currentDriver.get("local").getAsJsonObject().get("isSecurityTest").getAsString());
				String proxyHost = currentDriver.get("local").getAsJsonObject().get("proxy").getAsJsonObject()
						.get("proxyHost").getAsString();
				int proxyPort = Integer.parseInt(currentDriver.get("local").getAsJsonObject().get("proxy")
						.getAsJsonObject().get("proxyPort").getAsString());

				ZapScan zap = new ZapScan();
				if (isSecurityTest) {
					zap.setup(proxyHost, proxyPort);
				}

				// if (isAnalytics) {
				// ProxyThreadRunner proxyRunner = new
				// ProxyThreadRunner(proxyHost, proxyPort);
				// Thread t = new Thread(proxyRunner);
				// t.start();
				// }

				if (isAnalytics) {
					MockServerProxy proxy = new MockServerProxy();
					proxy.startProxy(proxyPort);

				}
				// isRunOnSauce =
				// Boolean.parseBoolean(EnvirommentManager.getInstance().getProperty("useSouceLabs"));
				// sauceBrowsers =
				// EnvirommentManager.getInstance().getProperty("SauceLabsBrowsersToRun").split("\\^");
				boolean rerunFailed = Boolean
						.parseBoolean(EnvirommentManager.getInstance().getProperty("rerunFailedStories"));
				rerunFailedFlag = rerunFailed;
				int rerunCount = 0;
				if (rerunFailed) {
					rerunCount = Integer.parseInt(EnvirommentManager.getInstance().getProperty("rerunCount"));
				}
				String buildName = System.getProperty("buildName") != null ? System.getProperty("buildName") : "XYZ";
				Date date = new Date();
				SimpleDateFormat ft = new SimpleDateFormat("EEE, d MMM yyyy - hh,,mm,,ss");

				String dateAndTime = ft.format(date);
				dateAndTime = dateAndTime.replace(",,", " ");
				String ReportName = "Automation_Report_BuildNumber-" + buildName + "_" + dateAndTime + ".html";
				AspireReport.getInstance().getReportDataManager().setReportFileName(ReportName);
				String OS = System.getProperty("os.name").toLowerCase();
				System.out.println("Opertation system version: " + OS);

				AspireReport.getInstance().getReportDataManager().setReportTitle("Aspire");
				AspireReport.getInstance().getReportDataManager().setReportSubTitle("testing report");
				AspireReport.getInstance().getReportDataManager().setTitle("Aspire");

				// boolean isRemote =
				// Boolean.parseBoolean(currentDriver.get("isRemote").getAsString());
				String browser = currentDriver.get("name").getAsString().toLowerCase();
				// if (!isRemote) { // if local not remote
				Embedder embedder = getEmbedder();
				embedder.embedderControls().useStoryTimeoutInSecs(450);
				embedder.embedderControls().useStoryTimeoutInSecs(900);
				AspireReport.getInstance().getReportDataManager().addToReportPath(buildName);
				File ReportDir = new File(AspireReport.getInstance().getReportDataManager().getReportPath());
				ReportDir.mkdirs();
				embedder.systemProperties().setProperty("browser", browser);
				ReportName = "Automation_Report_BuildNumber-" + browser + buildName + "_" + dateAndTime + ".html";
				AspireReport.getInstance().getReportDataManager().setReportFileName(ReportName);

				startStories(embedder, false);
				if (rerunFailed) {
					rerunFailedStories(rerunCount);
				} else {
					skipScenariosList(embedder);
				}
				//
				// } else if (isRunOnSauce) {
				//
				// if (System.getProperty("SauceLabsBrowsersToRun") != null
				// && System.getProperty("SauceLabsBrowsersToRun") != "") {
				// sauceBrowsers =
				// System.getProperty("SauceLabsBrowsersToRun").split("\\^");
				// } else {
				// browsers =
				// EnvirommentManager.getInstance().getProperty("SauceLabsBrowsersToRun").split("\\^");
				// }
				//
				// for (String browserInfo : sauceBrowsers) {
				// ReportName = "Automation_Report_BuildNumber-" + browserInfo +
				// "-" + buildName + "_"
				// + dateAndTime + ".html";
				// AspireReport.getInstance().getReportDataManager().setReportFileName(ReportName);
				//
				// FillPlatformInfo(browserInfo);
				// Embedder embedder = getEmbedder();
				// startStories(embedder, false);
				// if (rerunFailed) {
				// rerunFailedStories(rerunCount);
				// } else {
				// skipScenariosList(embedder);
				// }
				//
				// }
				// }
				if (isSecurityTest) {
					zap.scan();
					zap.cleanup(proxyHost, proxyPort);
				}

			}

		}

		if (executableBrowsers == 0) {

			AspireLog4j.setLoggerMessageLevel(
					"No executable brwosers set as true inisde drivers.json \n  Run Terminated", Log4jLevels.INFO);

		}

	}

	private Embedder getEmbedder() {
		Embedder embedder = null;
		useEmbedder(new Embedder());
		useConfiguration(null);
		useStepsFactory(null);
		embedder = configuredEmbedder();
		// embedder.embedderControls().useStoryTimeouts("**/*-Long*:3000,**/***:1500");
		// embedder.embedderControls().doFailOnStoryTimeout(true);
		embedder.embedderControls().doGenerateViewAfterStories(false);
		embedder.useMetaFilters(getMetaData());
		int threads = Integer.parseInt(EnvirommentManager.getInstance().getProperty("Threads"));
		embedder.embedderControls().useThreads(threads);
		return embedder;
	}

	private void rerunFailedStories(int rerunCount) {
		Embedder embedder = null;
		for (int j = 1; j <= rerunCount; j++) {
			if (AspireReport.getInstance().getReportDataManager().getFailedStories() != null
					&& AspireReport.getInstance().getReportDataManager().getFailedStories().size() > 0) {
				embedder = getEmbedder();
				// embedder.embedderControls().useStoryTimeouts("**/*-Long*:30000,**/***:15000");
				startStories(embedder, true);
			}
			if (j == (rerunCount - 1)) {
				rerunFailedFlag = false;
				if (embedder != null) {
					skipScenariosList(embedder);
				}
			}
		}

	}

	public List<String> getMetaData() {
		String metaData = System.getProperty("metaData");
		if (metaData == null) {
			metaData = EnvirommentManager.getInstance().getProperty("metaData");
		}
		ArrayList<String> metaDataList = new ArrayList<String>();
		if (metaData != null && !metaData.isEmpty()) {
			metaDataList.addAll(asList(metaData.split(",")));
		}
		metaDataList.add("-skip");
		return metaDataList;
	}

	public static void skipScenariosList(Embedder embedder) {
		if (!rerunFailedFlag) {
			ArrayList<Scenario> skipScenarios = new ArrayList<Scenario>();
			StoryManager storyManager = embedder.storyManager();
			List<String> stories = new StoryFinder().findPaths(codeLocationFromClass(StoriesTest.class).getFile(),
					asList("**/" + System.getProperty("storyFilter", "*") + ".story"), null);
			for (String storyPath : stories) {
				Story story = storyManager.storyOfPath(storyPath);
				if (new MetaFilter("skip").allow(story.getMeta())) {
					for (Scenario scenario : story.getScenarios()) {
						// scenario also inherits meta from story
						Meta inherited = scenario.getMeta().inheritFrom(story.getMeta());
						if (new MetaFilter("+skip").allow(inherited)) {
							System.out.println("this is skipped:" + scenario.getTitle());
							skipScenarios.add(scenario);
							break;
						}
					}
				}
			}

			AspireReport.getInstance().getReportDataManager().addSkippedScenarios(skipScenarios);
		}
	}

	/**
	 * Method used to Set Threading to true or false based on Threads
	 */
	public void checkThreadsValue() {

		EnvirommentManager propsUtil = EnvirommentManager.getInstance();
		String threads = propsUtil.getProperty("Threads");
		if (StringUtils.isNumeric(threads)) {
			if (Integer.parseInt(threads) > 1)
				AspireReport.getInstance().getReportDataManager().setThreading(true);
			else if (Integer.parseInt(threads) == 1)
				AspireReport.getInstance().getReportDataManager().setThreading(false);
			else {
				AspireLog4j.setLoggerMessageLevel("Threads value can't be 0 run terminated ", Log4jLevels.ERROR);
				System.exit(0);
			}
		}

		else {

			AspireLog4j.setLoggerMessageLevel("Threads value can't be null - run terminated ", Log4jLevels.ERROR);
			System.exit(0);

		}

	}

}

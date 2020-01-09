package practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReportsPract {

	ExtentReports reports = null;
	ExtentTest test = null;

	@BeforeClass
	public void beforeSetup() {

		reports = new ExtentReports(System.getProperty("user.dir") + "\\ExtentReportResults.html");

		test = reports.startTest("ExtentReportsPract");

	}

	@Test
	public void testMethod() {

		test.log(LogStatus.PASS, "Test Cased passed");
	}

	@Test()
	public void skipmetod() {

		test.log(LogStatus.SKIP, "Test Case Skip");
	}

	@Test
	public void FailedMaethod() {

		test.log(LogStatus.FAIL, "Test Cased Failed");
	}

	@AfterClass
	public void tearsetup() {

		reports.endTest(test);

		reports.flush();

	}

}

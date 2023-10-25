package testing;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Test_suite {
	
	@BeforeSuite
	
	public void lauanch_application() {
		
		System.out.println("lauanch the application");
		
	}

	@AfterSuite
	public void close_application()
	{
		System.out.println("Closing the Application");
	}
	
}

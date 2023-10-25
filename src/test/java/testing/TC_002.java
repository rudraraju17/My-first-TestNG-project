package testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC_002 {


	WebDriver driver;

	@BeforeClass
	public void launch_the_application() {

		System.out.println("I am launching google chrome browser");
		driver=new ChromeDriver();

		//Give url into the browser
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.manage().window().maximize();

	}


	@Test
	public void do_testing() {

		System.out.println("My first Testng test script");
				
		Assert.assertTrue((driver.findElement(By.xpath("//img[@alt='Google']")).isDisplayed()));
		
	}


	@Test
	public void do_testing_1() {

		System.out.println("My second Testng test script");
	}

	@AfterClass
	public void close_the_application() {
		System.out.println("I am closing google chrome");
		driver.quit();
	}







}

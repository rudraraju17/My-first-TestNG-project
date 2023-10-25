package pageObject;

import org.openqa.selenium.By;

public class Stackoverflow_Page {

	public By Stackoverflow_Page_logo(){return By.xpath("(//span[text()='Stack Overflow'])[1]");}
	public By About_Headerlink(){return By.xpath("(//a[text()='About'])[1]");}
	public By Products_link(){return By.xpath("(//a[contains(.,'Products')])[1]");}
	public By ForTeams_link(){return By.xpath("(//a[text()='For Teams'])[1]");}
	public By Search_Box(){return By.xpath("//input[@name='q']");}
	

}

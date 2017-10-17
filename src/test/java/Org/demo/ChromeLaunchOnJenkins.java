package Org.demo;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ChromeLaunchOnJenkins {
	private  WebDriver driver;
    public WebDriver getDriver() {
		return driver;
	}


	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

  
    @Test(priority=1)
    public void LaunchChromeBrowser() {
    this.driver = new ChromeDriver();
    System.out.println("Test Chrome git ");
  }
    
}

package Jenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class JenkinsTest 
{
	@Test
	public void jenkinslaunch()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		
		Reporter.log("Jenikins Launch Successfullt",true);
		
	}

}

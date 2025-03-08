package mavenforjenkin;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UTTest {
    
	 	@Test
	    public void openOrangeHRM() {
		 	WebDriverManager.chromedriver().setup();
	        WebDriver driver  = new ChromeDriver();
	        driver.manage().window().maximize();

	        driver.get("https://www.lambdatest.com/");
	        System.out.println("Opened OrangeHRM successfully!");
	    }
}

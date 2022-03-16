package EtsyTests;

import java.util.concurrent.TimeUnit;

public class TC03 {

	public static void main(String[] args) {
		//TC03
		//Verify that the relevant results are displayed after searching by specific criteria.
		System.setProperty("webdriver.chrome.driver", 
				"driver-lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		
		driver.navigate().to("https://www.etsy.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("global-enhancements-search-query")).sendKeys("Necklaces");
		driver.findElement(By.xpath("//span[@class=\"wt-icon wt-nudge-b-2 wt-nudge-r-1\"]")).click();
		
		driver.quit();

	}

}

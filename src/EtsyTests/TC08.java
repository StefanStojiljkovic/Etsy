package EtsyTests;

import java.util.concurrent.TimeUnit;

public class TC08 {

	public static void main(String[] args) {
		// TC 08
		// Verify that after selecting the sort method, the products are displayed in the appropriate order.
		System.setProperty("webdriver.chrome.driver", 
				"driver-lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		
		driver.navigate().to("https://www.etsy.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("global-enhancements-search-query")).sendKeys("Dogs");
		driver.findElement(By.xpath("//span[@class=\"wt-icon wt-nudge-b-2 wt-nudge-r-1\"]")).click();
		
		driver.navigate().refresh();
		
		driver.findElement(By.id("sortby")).click();
		
		Select sc = new Select(driver.findElement(By.id("sortby")));
		
		sc.selectByVisibleText("Lowest Price");
		
		driver.close();

	}

}
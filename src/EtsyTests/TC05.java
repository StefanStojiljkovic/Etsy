package EtsyTests;

import java.util.concurrent.TimeUnit;

public class TC05 {

	public static void main(String[] args) throws InterruptedException {
		// Test Case 05
		// Verify that the correct products are displayed after selecting and applying filters.
		System.setProperty("webdriver.chrome.driver", 
				"driver-lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		
		driver.navigate().to("https://www.etsy.com/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("search-query")).sendKeys("Wall");
		driver.findElement(By.id("gnav-search-submit-button")).sendKeys(Keys.ENTER);
		driver.findElement(By.linkText("All Filters")).click();
		driver.findElement(By.id("item-type-input-1")).click();
		driver.findElement(By.xpath("//*[@id=\"search-filters-overlay\"]/div/div/div[2]/button[2]")).click();
		
		driver.navigate().refresh();
		
		Thread.sleep(4000);
		
		driver.close();

	}

}
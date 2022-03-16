package EtsyTests;

import java.util.concurrent.TimeUnit;

public class TC06 {

	public static void main(String[] args) {
		// TC 06
		// Verify that it is not possible to log in without a password.
		
		System.setProperty("webdriver.chrome.driver", 
				"driver-lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		
		driver.navigate().to("https://www.etsy.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"gnav-header-inner\"]/div[4]/nav/ul/li[1]/button")).click();
		driver.findElement(By.id("join_neu_email_field")).sendKeys("stefanstojiljkovic.ni@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"join-neu-form\"]/div[1]/div/div[7]/div/button")).click();
		
		driver.close();

	}

}

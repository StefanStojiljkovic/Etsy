package EtsyTests;
import java.util.concurrent.TimeUnit;

//TC01
//Verify that user can register with correct data in the "Email address", "First name" and "Password" fields.
public class TC01 {
	private WebDriver driver;
	private RegisterPage registerPage;
	
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		registerPage = new RegisterPage(driver);
		
	}	
	@Test
	public void searchTest() throws InterruptedException {

		driver.get("https://www.etsy.com/");
		Assert.assertSame(this.registerPage, "Sign in button does not exist.");
		this.registerPage.getSignInButton().click();	
		driver.findElement(By.xpath("//*[@id=\"gnav-header-inner\"]/div[4]/nav/ul/li[1]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"join-neu-form\"]/div[1]/div/div[1]/div/button")).click();

		this.registerPage.getEmailInput().click();
		this.registerPage.getEmailInput().clear();
		this.registerPage.getEmailInput().sendKeys("stefanstojiljkovic.ni@gmail.com");
		
		this.registerPage.getFirstNameInput().click();
		this.registerPage.getFirstNameInput().clear();
		this.registerPage.getFirstNameInput().sendKeys("Stefan");
		
		this.registerPage.getPasswordInput().click();
		this.registerPage.getPasswordInput().clear();
		this.registerPage.getPasswordInput().sendKeys("password123$");
		
		this.registerPage.submit();
		Thread.sleep(2000);
	}	
	@AfterMethod
	public void quit() {
		
		this.driver.quit();
		
	}
}

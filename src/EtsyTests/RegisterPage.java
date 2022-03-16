package EtsyTests;

import org.openqa.selenium.By;

public class RegisterPage {
	private WebDriver driver;
	
	public RegisterPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getEmailInput() {
		return driver.findElement(By.id("join_neu_email_field"));
	}

	public WebElement getFirstNameInput() {
		return driver.findElement(By.name("first_name"));
	}
	public WebElement getPasswordInput() {
		return driver.findElement(By.name("password"));
	}

	public WebElement getSignInButton() {
		return driver.findElement(By.xpath("//*[@id=\\\"gnav-header-inner\\\"]/div[4]/nav/ul/li[1]/button"));
	}
		
	public void submit() {
		driver.findElement(By.name("submit_attempt")).click();		
	}
}


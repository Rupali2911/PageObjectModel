package BrowserStackPages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BrowserStackSigninPage {
	// Object Repository
			WebDriver driver;
//			By UserEmail = By.xpath("//input[@id='user_email_login']");
//			By UserPassword = By.xpath("//input[@id='user_password']");
//			By LoginBtn = By.xpath("//input[@id='user_submit']");
			
			@FindBy(xpath = "//input[@id='user_email_login']")
			WebElement UserEmail;
			
			@FindBy(xpath = "//input[@id='user_password']")
			WebElement UserPassword;
			
			@FindBy(xpath = "//input[@id='user_submit']")
			WebElement LoginBtn;
			


			@FindBy(xpath ="//a[text()='Sign in with Google']")
			WebElement SignInWithGoogle;
			@FindBy(xpath = "(//a[text()='Sign up'])[1]")
			WebElement SignUP;
			
			@FindBy(xpath = "(//a[text()='Forgot password?'])[1]")
			WebElement ForgotPassword;

			

// Constructor
			public BrowserStackSigninPage(WebDriver driver) {
				this.driver = driver;
				PageFactory.initElements(driver, this);
			}
// Methods		
			public void enterUserEmail(String useremail) {
				UserEmail.sendKeys(useremail);
			}
			public void enterUserPassword(String userpassword) {
				UserPassword.sendKeys(userpassword);
			}



			public void SignInWithGoogle() {
				SignInWithGoogle.click();

			public void ClickonSignUP() {
				SignUP.click();
			}
			public void ClickonForgotPass() {
				ForgotPassword.click();
			}
			public void ClickonLogin() {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].click()",LoginBtn);
			//	LoginBtn.click();
			}
			
}

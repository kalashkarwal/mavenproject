


package pompages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
		@FindBy(xpath = "//*[@name='username']") 
		private WebElement username;
		@FindBy(xpath = "//*[@name='password']")
		 private WebElement password;
		@FindBy(xpath = "//*[@type='submit']")
		 private WebElement loginbtn;
		@FindBy(xpath = "(//*[@class='oxd-topbar-body-nav-tab-item'])[3]")
	     private WebElement AddEMP;
		  
		@FindBy(xpath = "//*[@name='firstName']")
		 private WebElement firstname;
		@FindBy(xpath = "//*[@name='middleName']")
		 private WebElement middlename;
		@FindBy(xpath = "//*[@name='lastName']")
	     private WebElement lastname;
		@FindBy(xpath = "(//*[@class='oxd-input oxd-input--active'])[2]")
	     private WebElement EMP_id;
		
		public LoginPage(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		public void loginToApp()
		{
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			username.sendKeys("Admin");
			password.sendKeys("admin123");
			loginbtn.click();
		}
		public void AddEmp()
		{
			AddEMP.click();
			firstname.sendKeys("pratibha");
			middlename.sendKeys("Ashok");
			lastname.sendKeys("pansare");
			EMP_id.sendKeys("0021");
		}
		
		
	

}

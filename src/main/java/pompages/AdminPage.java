package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage
{
	WebDriver driver;
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
	
	public AdminPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
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


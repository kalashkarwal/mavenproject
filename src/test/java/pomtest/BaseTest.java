package pomtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import pompages.AdminPage;
import pompages.LoginPage;

public class BaseTest {
	
	static WebDriver driver;
	LoginPage lp;
	AdminPage Ap;
	@BeforeSuite
	public void initbrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP-PC\\Desktop\\selenium\\chromedriver.exe");
		
		driver=new ChromeDriver ();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	@BeforeClass
	public void createObject()
	{
		 lp=new LoginPage(driver);
		 Ap=new AdminPage(driver);
		 
	}
	
	

}

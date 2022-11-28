package pomtest;

import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
	@Test(priority=1)
	public void login()
	{
		lp.loginToApp();
	}
	@Test(priority=2)
	public void addE()
	{
		Ap.AddEmp();
	}
	

}

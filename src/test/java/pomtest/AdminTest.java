package pomtest;

import org.testng.annotations.Test;

public class AdminTest extends BaseTest {
	@Test
	public void AddE()
	{
		lp.loginToApp();
		Ap.AddEmp();
	}

}

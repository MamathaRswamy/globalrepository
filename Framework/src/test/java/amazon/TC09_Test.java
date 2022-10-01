package amazon;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import genericUtilities.UtilityMethods;
import objectRepositoryPOM.LoginPageAmazon;

public class TC09_Test extends BaseClass 
{
	@Test
	public void clicking_on_All_dropdown_searchbar(WebElement searchAllDropdown) throws IOException, InterruptedException {
		LoginPageAmazon login = new LoginPageAmazon(driver);
		UtilityMethods utility = new UtilityMethods();

//		login.getEmailtextfield().sendKeys(utility.ReadProperties("username"));
//		login.getContinuebutton().click();
//
//		login.getPasswordtextfield().sendKeys(utility.ReadProperties("password"));
//		login.getSigninbutton().click();
//		Thread.sleep(2000);
		
		login.getSearchAllDropdown().click();
		
		utility.HandlingDropdown(searchAllDropdown, "Car & Motorbike");
}
}


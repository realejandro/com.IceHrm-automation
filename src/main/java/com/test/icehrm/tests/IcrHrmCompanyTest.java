package com.test.icehrm.tests;

import com.test.icehrm.TestBase;
import com.test.icehrm.pages.IceHrmCompanyPage;
import com.test.icehrm.pages.IceHrmLoginPage;
import com.test.icehrm.pages.IceHrmMainPage;
import org.testng.annotations.Test;
import utils.ConfigReader;

public class IcrHrmCompanyTest extends TestBase {
    @Test
    public void testingCompanyPage() throws InterruptedException {
        IceHrmLoginPage iceHrmLoginPage = new IceHrmLoginPage(driver);
        iceHrmLoginPage.sendInfoLogin(ConfigReader.readProperty("icehrmusername"),ConfigReader.readProperty("icehrmpassword"));
        IceHrmCompanyPage iceHrmCompanyPage = new IceHrmCompanyPage(driver);
        Thread.sleep(1500);
        iceHrmCompanyPage.clickCompanyButton();
        Thread.sleep(1500);
        iceHrmCompanyPage.clickStaffButton();
        iceHrmCompanyPage.validatingProductManagers();
    }
}

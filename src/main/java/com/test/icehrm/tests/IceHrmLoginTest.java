package com.test.icehrm.tests;

import com.test.icehrm.TestBase;
import com.test.icehrm.pages.IceHrmLoginPage;
import com.test.icehrm.pages.IceHrmMainPage;
import com.test.icehrm.pages.IceHrmPersonalInfoPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.ConfigReader;

public class IceHrmLoginTest extends TestBase {

    @Test
    public void validatingLogin() throws InterruptedException {
        IceHrmLoginPage iceHrmLoginPage = new IceHrmLoginPage(driver);
        iceHrmLoginPage.sendInfoLogin(ConfigReader.readProperty("icehrmusername"),
                ConfigReader.readProperty("icehrmpassword"));

        IceHrmMainPage iceHrmMainPage = new IceHrmMainPage(driver);
        iceHrmMainPage.clickSwitchButton();
        Thread.sleep(1500);
        Assert.assertTrue(iceHrmMainPage.getSwitchEmployeeText().equals("Switch Employee"));
        iceHrmMainPage.selectTheEmployee("Lala Lamees");

        //Test Case 2
        IceHrmPersonalInfoPage iceHrmPersonalInfoPage = new IceHrmPersonalInfoPage(driver);
        iceHrmPersonalInfoPage.validatingPersonalInfoClass(driver, "Personal_Information",
                "ICE Hrm","Pre-Sales Executive", "Full Time Contract",
                "IceHrm Employee","Head Office");
        //Test Case 3

    }

}

package com.test.icehrm.tests;

import com.test.icehrm.HrmDataProvider;
import com.test.icehrm.TestBase;
import com.test.icehrm.pages.IceHrmLoginPage;
import com.test.icehrm.pages.IceHrmPersonalInfoPage;
import com.test.icehrm.pages.IceHrmPersonalInformationPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.ConfigReader;

public class IceHrmPersonalInformationTest extends TestBase {

    //Test case - 4
    @Test(dataProvider = "CompanyInformationData", dataProviderClass = HrmDataProvider.class)
    public void testingPersonalInformation(String name, String details, String type
            , String country, String timeZone) throws InterruptedException {

        IceHrmLoginPage iceHrmLoginPage = new IceHrmLoginPage(driver);
        iceHrmLoginPage.sendInfoLogin(ConfigReader.readProperty("icehrmusername"),ConfigReader.readProperty("icehrmpassword"));
        IceHrmPersonalInformationPage iceHrmPersonalInformationPage = new IceHrmPersonalInformationPage(driver);
        iceHrmPersonalInformationPage.validatingPersonalInformation();
        iceHrmPersonalInformationPage.creatingCompanyAccount(name, details, type, country, timeZone);
        Thread.sleep(1500);
        iceHrmPersonalInformationPage.validatingNames(name);

    }


}

package com.test.icehrm.tests;

import com.test.icehrm.TestBase;
import com.test.icehrm.pages.IceHrmLoginPage;
import com.test.icehrm.pages.IceHrmPayrollPage;
import org.testng.annotations.Test;
import utils.ConfigReader;

public class IceHrmPayrollTest extends TestBase {

    @Test
    public void testingPayrollPage() throws InterruptedException {
        IceHrmLoginPage iceHrmLoginPage = new IceHrmLoginPage(driver);
        iceHrmLoginPage.sendInfoLogin(ConfigReader.readProperty("icehrmusername"),ConfigReader.readProperty("icehrmpassword"));
        IceHrmPayrollPage iceHrmPayrollPage = new IceHrmPayrollPage(driver);
        iceHrmPayrollPage.validatingLalaLameesInfo();
    }

    @Test
    public void testingPayroll() throws InterruptedException {
        IceHrmLoginPage iceHrmLoginPage = new IceHrmLoginPage(driver);
        iceHrmLoginPage.sendInfoLogin(ConfigReader.readProperty("icehrmusername"),ConfigReader.readProperty("icehrmpassword"));
        IceHrmPayrollPage iceHrmPayrollPage = new IceHrmPayrollPage(driver);
        iceHrmPayrollPage.validatingLalaLameesInfo();
    }
}

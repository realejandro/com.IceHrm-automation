package com.test.icehrm.pages;

import com.test.icehrm.TestBase;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


import java.util.List;

public class IceHrmPersonalInformationPage {

    public IceHrmPersonalInformationPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    /*Test case - 4*/
    @FindBy(xpath = "//li[@ref='module_Personal_Information']")
    WebElement personalInformation;
    @FindBy(xpath = "//a[@href='https://icehrm-open.gamonoid.com/?g=modules&n=dashboard&m=module_Personal_Information']")
    WebElement dashboard;
    @FindBy(xpath = "//a[@href='https://icehrm-open.gamonoid.com/?g=admin&n=company_structure&m=admin_Company_Structure']")
    WebElement companyLink;
    @FindBy(xpath = "//button[.=' Add New']")
    WebElement addNewBtn;
    @FindBy(xpath = "//input[@id='title']")
    WebElement companyName;
    @FindBy(id = "description")
    WebElement companyDetails;
    @FindBy(xpath = "//input[@id='rc_select_0']")
    WebElement typeCompany;
    @FindBy(xpath = "//input[@id='rc_select_1']")
    WebElement country;
    @FindBy(xpath = "//input[@id='rc_select_2']")
    WebElement timeZone;
    @FindBy(xpath = "//button[.='Save']")
    WebElement saveBtn;
    @FindBy(xpath = "//td[1]")
    List<WebElement> allNames;


    public void validatingPersonalInformation() throws InterruptedException {
        this.personalInformation.click();
        Thread.sleep(1500);
        this.dashboard.click();
        Thread.sleep(1500);
        this.companyLink.click();
        this.addNewBtn.click();
    }

    public void creatingCompanyAccount(String companyName, String companyDetails, String typeCompany
            , String country, String timeZone) throws InterruptedException{

        this.companyName.sendKeys(companyName);
        this.companyDetails.sendKeys(companyDetails);
        this.typeCompany.sendKeys(typeCompany, Keys.ENTER);
        Thread.sleep(1500);
        this.country.sendKeys(country, Keys.ENTER);
        Thread.sleep(1500);
        this.timeZone.sendKeys(timeZone, Keys.ENTER);
        this.saveBtn.click();
    }

    public void validatingNames(String name){
        for(WebElement e : allNames){
            if(e.getText().trim().equals(name)){
             Assert.assertEquals(e.getText().trim(), name);
            }
        }
    }




}

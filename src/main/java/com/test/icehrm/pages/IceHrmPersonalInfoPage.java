package com.test.icehrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IceHrmPersonalInfoPage {
    public IceHrmPersonalInfoPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    //Test Case2

    @FindBy(xpath = "//th[contains(text(), 'Job Title')]/following-sibling::td[1]")
    WebElement jobTitle;

    @FindBy(xpath = "//th[contains(text(), 'Employment Status')]/following-sibling::td")
    WebElement employmentStatus;

    @FindBy(xpath = "//th[contains(text(), 'Supervisor')]/following-sibling::td")
    WebElement supervisorName;

    @FindBy(xpath = "//th[contains(text(), 'Department')]/following-sibling::td[1]")
    WebElement department;
    //Test Case 2
    public void validatingPersonalInfoClass(WebDriver driver, String containsString, String title
            , String expectedJobTitle, String expectedStatus
            , String expectedSupervisor, String expectedDepartment) throws InterruptedException {
        Assert.assertTrue(driver.getTitle().trim().equals(title));
        Thread.sleep(1500);
        Assert.assertTrue(driver.getCurrentUrl().contains(containsString));
        Thread.sleep(1500);
        Assert.assertTrue(this.jobTitle.getText().equals(expectedJobTitle));
        Assert.assertTrue(this.employmentStatus.getText().equals(expectedStatus));
        Assert.assertTrue(this.supervisorName.getText().equals(expectedSupervisor));
        Assert.assertTrue(this.department.getText().equals(expectedDepartment));


    }



}

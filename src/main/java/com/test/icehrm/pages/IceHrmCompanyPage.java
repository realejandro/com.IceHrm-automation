package com.test.icehrm.pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class IceHrmCompanyPage {
    public IceHrmCompanyPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[contains(text(),'Company')]")
    WebElement companyButton;

    @FindBy(xpath = "//ul[@id='module_Company']")
    WebElement staffButton;
    //directory staff page elements
    @FindBy(xpath = "//button[@id='StaffDirectory_filterBtn']")
    WebElement staffDirectoryFilterBtn;

    @FindBy(id = "s2id_job_title")
    WebElement selectJobTitle;

    @FindBy(xpath = "//li[@class='select2-results-dept-0 select2-result select2-result-selectable']" +
            "//div[contains(text(),'Product Manager')]")
    WebElement productManager;

    @FindBy(xpath = "//div[@class='controls col-sm-9']//button")
    WebElement modalFilterButton;

    @FindBy(xpath = "//li[@id='loadMoreStaffDirectory']")
    WebElement loadMoreBtn;

    @FindBy(xpath = "//h5[@class='widget-user-desc']")
    List <WebElement> allProductManagers;

    public void clickCompanyButton() { this.companyButton.click(); }

    public void clickStaffButton(){ this.staffButton.click(); }

    public void validatingProductManagers() throws InterruptedException {
        Thread.sleep(1500);
        this.staffDirectoryFilterBtn.click();
        Thread.sleep(1500);
        this.selectJobTitle.click();
        Thread.sleep(1500);
        this.productManager.click();
        this.modalFilterButton.click();
        Thread.sleep(1500);
        this.loadMoreBtn.click();
        Thread.sleep(1500);
        //validating product Managers
        for(int i = 0; i < allProductManagers.size(); i++){
            Assert.assertTrue(allProductManagers.get(i).getText().trim().equals("Product Manager"));
        }

    }

}
